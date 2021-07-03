package com.nanjolono.consumer.service;

import com.nanjolono.consumer.bean.FetchToken;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
@FeignClient(value = "authorization", decode404 = true)
public interface LoginService {

    @PostMapping("/login")
    Object webLogin(FetchToken depart);

}
