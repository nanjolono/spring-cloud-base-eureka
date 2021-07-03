package com.nanjolono.consumer.controller;
import com.nanjolono.consumer.service.PayService;
import com.nanjolono.consumer.utils.BaseResponse;
import com.nanjolono.consumer.bean.FetchToken;
import com.nanjolono.consumer.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer/login")
public class LoginController {

    public static String token = "";

    @Autowired
    LoginService loginService;

    @Autowired
    PayService payService;

    @PostMapping("/webLogin")
    public BaseResponse<Object> webLogin(){
        FetchToken fetchToken = new FetchToken();
        fetchToken.setUserName("graython");
        fetchToken.setPassword("123456");
        fetchToken.setToken("consumer");
        Object result = loginService.webLogin(fetchToken);
        return new BaseResponse<>(1, "2", result);
    }

    @PostMapping("/auth")
    public BaseResponse<String> auth() {
        return payService.auth(token);
    }

}
