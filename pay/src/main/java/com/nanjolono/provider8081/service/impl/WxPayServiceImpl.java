package com.nanjolono.provider8081.service.impl;

import com.nanjolono.provider8081.bean.Depart;
import com.nanjolono.provider8081.bean.po.WxPayBo;
import com.nanjolono.provider8081.service.WxPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: nanjolono-parent
 * @description: WxPayService
 * @author: nanjolono
 * @create: 2020-11-19 11:12
 **/
@Service
public class WxPayServiceImpl implements WxPayService {
    @Autowired
    WxPayBo wxPayBo;
    @Override
    public Object wxJsPay() {
        String s = wxPayBo.toString();
        return "Hello World";
    }
}
