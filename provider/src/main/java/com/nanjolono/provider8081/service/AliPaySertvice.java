package com.nanjolono.provider8081.service;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePayRequest;
import com.alipay.api.response.AlipayTradePayResponse;

public class AliPaySertvice {
    public static void main(String[] args) throws AlipayApiException {
        String priKey = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQClNXif/AVGQ4VCFpfeWtM9yHNk7UG224IvMgrD14gdfSpI3c+E6TI7pLLEkhPTYcEvaNtFeQmbsCMhL2OJVpqk1vsGEC/RvKzpkDlKcLpBKhRRylMycJTdRouVWi1rFHpLYukqBgUEVee47GZ/7k9jeE+8OPHktgYSjIQwfmSCwlLomRqudGcPNwguOLkGq0Zw3yGK1mieAyQh6cfjaSSHS2wNpRNikhORwuO7alWX6CqWsbOUxx+CY0AqXp7PqyfS81FRAzkSyT49ZnVbiaj468UjsdOrBSgjAFvpWXeL5wAqTOeNLJ2MVQkYWm1eDMM0akImcsheKmdaVr2RyKxvAgMBAAECggEBAKSiVZOwlR0BGmHSnAMUpZ/TCtOP78Wml+QqTTn+pgElAydcC3na3Zk8Nn3XSHSE3Pw+1Qw1YxLIAyoFzH5HVJJiPgM7zDuJdxLGC6GYFrPrmBYttpz0PhUIQP9TvyEPZhOL/OlI2GUKqoHI6xgfxvNMKMFcSgnuLrz7VJvyyHzYSDsVmGdcdszEes5uCStHhk5LdCL+PYaKVWBTojKceyqUUdC5ySV/s2OF+0vXcD6WVdmWTOVco+CvicbGcXSvHDw51rTgPj5sIGXqwvuVXwGOHViZgJQYI8GCkoAgV5gfl6vuquH32dXSklXsS+6bPEuNB53PJ/gxGYwBpXn/4NECgYEA4ON3xW2QKcabQRV6ClQbeA3mNqr60ZLSjMDNE2GmD0hhP/QeqiJUsof+LoN25TKyOqHlMPIX/iREWZ4sUxHFkZDcdCMxCPdBwscS0Bko0kBAYqIvNuLyZgOTZMFKbfRUhZvHm1sNQ+j0Tg9yICxnFxWPcbtBC8Gj1HHevcPSQ9kCgYEAvBBrhIve21mJglLaXaVga8i4YTdYyosTIVbIiVk/esXhXOS/ApDnDptzhGfYLCGndC0eTK0s5aXXFGaKr+OSbZmzeh5Eck2Pebq/J7CwTJdCo7mghiBjWbw2qf7wvABOKS7XHe52nzhnd9nW7vAqcPKZPxyCMSyJM3/C9cpv7YcCgYEAjRlLCX0PqZZpzLEL7DUPMwkNexlV224SWquRP+rRhN813Slun/KAT6+RpF9plq5zMuRm54nN0e+xTsU2LDyHSCiqmNeHqYdxJCNBQ321pg0YGIqHsxk7WxQ9Q0cfStO0wEuYNnovXX9o4R1BzrvtRoeJg6MoUZcCEoYLaebWIykCgYEAuiN+Z6iRIYZTphwfagTflI8Mf5xqU76nZp4gymD9haUJ1AnMTNvi9gBCq9Ckk7mTpldp3/afs4UbhmOf7UtPiQ9SJxKCKKg/0/pUbRJizMwB908pZNf1vcGeUU+2Mj4THovv+v4lhp4rOuLv63rmZviXWXH8InO0MLbJ3sFJW00CgYBsRaYxmLhjxmX4LmSuAUuazNqPx04H5mbX8V8E3/bBVGp6lBmqIL+8WBwYgGto270VdnkairE5ldbkZLL6CDqfxHayCAYZzffBtAe1pgnEdCpuC1ouuD+LAr4Hy3fWCflA8I6U2EPsjDKccngM3GD8ZCrGYqtAadaF3XDVYn4KUQ==";
        String pubKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsFRPMyYKAo6kp2dKXaDsYEgbGME45vcf1SkW8EFGbtzLAp6FMkha10saaki0MXgBHPKA4VEGz/a0I3FsTXB3O9ykdmNkh9CWcbbyTRjaKfz/U6D3rH4EZWUFy1uBqglUQRKDg+AIDUjv6T6Xce4QVmixn0HB2D2y8Kch/O+FWLwbz+J0lfb/0fcMInydR+KwSyFxXAKPsuPRjOXP1NcpHmByFvHjqKg17f3ri7HkZ5vj+zkYpfach/bPVNOrQlbQiUqljdD5b0dx2VUm/7KwlXPlBRrd8hAgPBXBJCeZbeNQGPmrpWQlYlZpYbV/Xp5e7ZsUKaJctOSRHcbEFnQH9wIDAQAB";
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do","2016102500758530",priKey,"json","GBK",pubKey,"RSA2");
        AlipayTradePayRequest request = new AlipayTradePayRequest();
        request.setBizContent("{" +
                "\"out_trade_no\":\"20150320010101001\"," +
                "\"scene\":\"bar_code\"," +
                "\"auth_code\":\"28763443825664394\"," +
                "\"product_code\":\"FACE_TO_FACE_PAYMENT\"," +
                "\"subject\":\"Iphone6 16G\"," +
                "\"buyer_id\":\"2088202954065786\"," +
                "\"seller_id\":\"2088102146225135\"," +
                "\"total_amount\":88.88," +
                "\"trans_currency\":\"USD\"," +
                "\"settle_currency\":\"USD\"," +
                "\"discountable_amount\":8.88," +
                "\"undiscountable_amount\":80.00," +
                "\"body\":\"Iphone6 16G\"," +
                "      \"goods_detail\":[{" +
                "        \"goods_id\":\"apple-01\"," +
                "\"alipay_goods_id\":\"20010001\"," +
                "\"goods_name\":\"ipad\"," +
                "\"quantity\":1," +
                "\"price\":2000," +
                "\"goods_category\":\"34543238\"," +
                "\"categories_tree\":\"124868003|126232002|126252004\"," +
                "\"body\":\"特价手机\"," +
                "\"show_url\":\"http://www.alipay.com/xxx.jpg\"" +
                "        }]," +
                "\"operator_id\":\"yx_001\"," +
                "\"store_id\":\"NJ_001\"," +
                "\"terminal_id\":\"NJ_T_001\"," +
                "\"alipay_store_id\":\"2016041400077000000003314986\"," +
                "\"extend_params\":{" +
                "\"sys_service_provider_id\":\"2088511833207846\"," +
                "\"hb_fq_num\":\"3\"," +
                "\"hb_fq_seller_percent\":\"100\"," +
                "\"industry_reflux_info\":\"{\\\\\\\"scene_code\\\\\\\":\\\\\\\"metro_tradeorder\\\\\\\",\\\\\\\"channel\\\\\\\":\\\\\\\"xxxx\\\\\\\",\\\\\\\"scene_data\\\\\\\":{\\\\\\\"asset_name\\\\\\\":\\\\\\\"ALIPAY\\\\\\\"}}\"," +
                "\"card_type\":\"S0JP0000\"" +
                "    }," +
                "\"timeout_express\":\"90m\"," +
                "\"agreement_params\":{" +
                "\"agreement_no\":\"20170322450983769228\"," +
                "\"auth_confirm_no\":\"423979\"," +
                "\"apply_token\":\"MDEDUCT0068292ca377d1d44b65fa24ec9cd89132f\"" +
                "    }," +
                "\"royalty_info\":{" +
                "\"royalty_type\":\"ROYALTY\"," +
                "        \"royalty_detail_infos\":[{" +
                "          \"serial_no\":1," +
                "\"trans_in_type\":\"userId\"," +
                "\"batch_no\":\"123\"," +
                "\"out_relation_id\":\"20131124001\"," +
                "\"trans_out_type\":\"userId\"," +
                "\"trans_out\":\"2088101126765726\"," +
                "\"trans_in\":\"2088101126708402\"," +
                "\"amount\":0.1," +
                "\"desc\":\"分账测试1\"," +
                "\"amount_percentage\":\"100\"" +
                "          }]" +
                "    }," +
                "\"settle_info\":{" +
                "        \"settle_detail_infos\":[{" +
                "          \"trans_in_type\":\"cardAliasNo\"," +
                "\"trans_in\":\"A0001\"," +
                "\"summary_dimension\":\"A0001\"," +
                "\"settle_entity_id\":\"2088xxxxx;ST_0001\"," +
                "\"settle_entity_type\":\"SecondMerchant、Store\"," +
                "\"amount\":0.1" +
                "          }]," +
                "\"settle_period_time\":\"7d\"" +
                "    }," +
                "\"sub_merchant\":{" +
                "\"merchant_id\":\"2088000603999128\"," +
                "\"merchant_type\":\"alipay: 支付宝分配的间连商户编号, merchant: 商户端的间连商户编号\"" +
                "    }," +
                "\"disable_pay_channels\":\"credit_group\"," +
                "\"merchant_order_no\":\"201008123456789\"," +
// "\"auth_no\":\"2016110310002001760201905725\"," + // 仅预授权转支付场景使用
                "\"ext_user_info\":{" +
                "\"name\":\"李明\"," +
                "\"mobile\":\"16587658765\"," +
                "\"cert_type\":\"IDENTITY_CARD\"," +
                "\"cert_no\":\"362334768769238881\"," +
                "\"min_age\":\"18\"," +
                "\"fix_buyer\":\"F\"," +
                "\"need_check_info\":\"F\"" +
                "    }," +
                "\"auth_confirm_mode\":\"COMPLETE：转交易支付完成结束预授权;NOT_COMPLETE：转交易支付完成不结束预授权\"," +
                "\"terminal_params\":\"{\\\"key\\\":\\\"value\\\"}\"," +
                "\"passback_params\":\"merchantBizType%3d3C%26merchantBizNo%3d2016010101111\"," +
                "\"promo_params\":{" +
                "\"actual_order_time\":\"2018-09-25 22:47:33\"" +
                "    }," +
                "\"advance_payment_type\":\"ENJOY_PAY_V2\"," +
                "      \"query_options\":[" +
                "        \"voucher_detail_list\"" +
                "      ]," +
                "\"business_params\":{" +
                "\"campus_card\":\"0000306634\"," +
                "\"card_type\":\"T0HK0000\"," +
                "\"actual_order_time\":\"2019-05-14 09:18:55\"" +
                "    }," +
                "\"request_org_pid\":\"2088201916734621\"," +
                "\"is_async_pay\":false" +
                "  }");
        AlipayTradePayResponse response = alipayClient.execute(request);
        if(response.isSuccess()){
            System.out.println("调用成功");
        } else {
            System.out.println("调用失败");
        }
    }
}
