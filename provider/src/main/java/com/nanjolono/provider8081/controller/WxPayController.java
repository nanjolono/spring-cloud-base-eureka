package com.nanjolono.provider8081.controller;

import com.nanjolono.provider8081.bean.Amount;
import com.nanjolono.provider8081.bean.WxPay;
import com.nanjolono.provider8081.service.WxPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @program: nanjolono-parent
 * @description: wxpay
 * @author: nanjolono
 * @create: 2020-11-19 11:12
 **/
@RestController
@RequestMapping("/wxpay/pay")
public class WxPayController {
    @Autowired
    WxPayService wxPayService;
    @GetMapping("WxAppPay")
    public Object getWxParam(){
        WxPay wxPay = new WxPay();
        wxPay.setAppid("1");
        wxPay.setAttach("123");
        wxPay.setAmount(new Amount(new BigDecimal(1),"2"));
        wxPay.setDescription("test");
        wxPay.setNotifyUrl("123123");
        System.out.println(wxPay);
        return wxPay;
    }
}
