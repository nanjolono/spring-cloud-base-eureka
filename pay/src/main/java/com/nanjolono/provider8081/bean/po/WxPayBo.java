package com.nanjolono.provider8081.bean.po;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @program: nanjolono-parent
 * @description: bo
 * @author: nanjolono
 * @create: 2020-11-19 10:14
 **/
@Data
@Component
@ConfigurationProperties(prefix = "wxpay")
public class WxPayBo {

    private String appId;

    private String appSecret;

    private String mchId;

    private String key;

}
