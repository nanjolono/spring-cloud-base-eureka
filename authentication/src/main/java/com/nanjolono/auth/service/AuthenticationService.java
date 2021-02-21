package com.nanjolono.auth.service;

import com.nanjolono.auth.model.AuthenticationRequest;
import com.nanjolono.auth.model.biz.User;

public interface AuthenticationService {
    User authentication(AuthenticationRequest authenticationRequest);
}
