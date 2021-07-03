package com.nanjolono.consumer.service;

import com.nanjolono.consumer.utils.BaseResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;


@Service
@FeignClient(value = "NANJOLONO-PROVIDER-8081" )
public interface PayService {

    @GetMapping("/auth/authorized")
    BaseResponse<String> auth(@RequestHeader("X-Authorization-With") String header);

}
