package com.nanjolono.auth.controller;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: nanjolono-parent
 * @description: controller
 * @author: nanjolono
 * @create: 2020-11-09 21:56
 **/
@RestController
public class TestController {
    @RequestMapping(value = { "/user" }, produces = "application/json")
    public Map<String, Object> user(OAuth2Authentication user) {
        Map<String, Object> userInfo = new HashMap<>();
        userInfo.put(
                 "user",
                  user.getUserAuthentication().getPrincipal());
        userInfo.put(
                  "authorities",
                  AuthorityUtils.authorityListToSet(
                         user.getUserAuthentication().getAuthorities()));
        return userInfo;
    }
}
