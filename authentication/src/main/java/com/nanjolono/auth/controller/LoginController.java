package com.nanjolono.auth.controller;

import com.nanjolono.auth.bean.FetchToken;
import com.nanjolono.auth.domain.BaseResponse;
import com.nanjolono.auth.jwt.JwtUtils;
import com.nanjolono.auth.utils.RedisUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


@RestController
public class LoginController {

	Logger logger = LoggerFactory.getLogger(LoginController.class);

	@PostMapping(value = "/login")
	public BaseResponse<String> userLogin(@RequestBody FetchToken fetchToken) {
		String password = fetchToken.getPassword();
		String userName = fetchToken.getUserName();
		//获取当前用户主体
		Subject subject = SecurityUtils.getSubject();
		RedisUtil.set(userName,fetchToken);
		FetchToken t  = (FetchToken) RedisUtil.get(userName);
		String msg = null;
		//将用户名和密码封装成 UsernamePasswordToken 对象
		UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
		subject.login(token);
		BaseResponse<String> ret = new BaseResponse<>();
		// 若登录成功，签发 JWT token
		String jwtToken = JwtUtils.sign(userName, JwtUtils.SECRET,"applicationId");
		// 将签发的 JWT token 设置到 HttpServletResponse 的 Header 中
		ret.setData(jwtToken);
		ret.setErrCode(0);
		ret.setMsg(msg);
		return ret;

	}

	@GetMapping("/logout")
	public Object logout() {
		BaseResponse<Object> ret = new BaseResponse<Object>();
		ret.setErrCode(0);
		ret.setMsg("退出登录");
		return ret;
	}
}
