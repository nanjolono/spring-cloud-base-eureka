package com.nanjolono.provider8081.controller;

import com.nanjolono.provider8081.bean.Depart;
import com.nanjolono.provider8081.service.WxPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    @GetMapping("getParam")
    public Object getWxParam(){
        return wxPayService.wxJsPay();
    }
}
