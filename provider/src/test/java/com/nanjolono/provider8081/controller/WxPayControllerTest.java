package com.nanjolono.provider8081.controller;

import com.alibaba.fastjson.JSON;
import com.nanjolono.provider8081.bean.Amount;
import com.nanjolono.provider8081.bean.WxPay;
import org.junit.jupiter.api.Test;
import org.springframework.http.*;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WxPayControllerTest {
    String url = "https://api.mch.weixin.qq.com/v3/pay/transactions/app";
    @Test
    void beanTest() {
        WxPay wxPay = new WxPay();
        wxPay.setAppid("wx4cb8e9621950da45");
        wxPay.setAttach("123");
        wxPay.setAmount(new Amount(new BigDecimal(1),"2"));
        wxPay.setDescription("test");
        wxPay.setNotifyUrl("123123");
        wxPay.setMchid("1526972031");
        wxPay.setOutTradeNo("123123123");
        wxPay.setTimeExpire("123123123");
        String paramText = JSON.toJSONString(wxPay);
        System.out.println(paramText);
        RestTemplate restTemplate = new RestTemplate(getFactory());
        restTemplate.setMessageConverters(getConverts());
        MultiValueMap<String,String> headers = new LinkedMultiValueMap<>();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
        headers.set("Content-Type",MediaType.APPLICATION_JSON_VALUE);
        headers.set("Authorization",paramText);
        headers.set("User-Agent", "WechatPay-Apache-HttpClient");
        HttpEntity<String> httpEntity = new HttpEntity<>(paramText, headers);
        System.out.println("Asdasd");
        try{
            ResponseEntity<Map> mapResponseEntity = restTemplate.postForEntity(
                    url, httpEntity, Map.class);
        }catch (HttpClientErrorException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private List<HttpMessageConverter<?>> getConverts() {
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        // String转换器
        StringHttpMessageConverter stringConvert = new StringHttpMessageConverter();
        List<MediaType> stringMediaTypes = new ArrayList<MediaType>() {{
            //添加响应数据格式，不匹配会报401
            add(MediaType.TEXT_PLAIN);
            add(MediaType.TEXT_HTML);
            add(MediaType.APPLICATION_JSON);
        }};
        stringConvert.setSupportedMediaTypes(stringMediaTypes);
        messageConverters.add(stringConvert);
        return messageConverters;
    }

    private SimpleClientHttpRequestFactory getFactory() {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setConnectTimeout(1000);
        factory.setReadTimeout(2000);
        return factory;
    }
}