package com.nanjolono.auth.service.impl;

import com.nanjolono.auth.model.AuthenticationRequest;
import com.nanjolono.auth.model.biz.User;
import com.nanjolono.auth.service.AuthenticationService;
import org.springframework.util.StringUtils;

public class AuthenticationServiceImpl implements AuthenticationService {
    @Override
    public User authentication(AuthenticationRequest authenticationRequest) {
        //check param is null
        if (authenticationRequest == null || StringUtils.isEmpty(authenticationRequest)){
            throw new RuntimeException("账号密码为空");
        }
        return null;
    }
}
