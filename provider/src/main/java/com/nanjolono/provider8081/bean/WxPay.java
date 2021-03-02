package com.nanjolono.provider8081.bean;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.context.annotation.Bean;

public class WxPay {

    @JSONField(name = "appid",ordinal = 1)
    private String appid;

    @JSONField(name = "mchid",ordinal = 2)
    private String mchid;

    @JSONField(name = "description",ordinal = 3)
    private String description;

    @JSONField(name = "out_trade_no",ordinal = 4)
    private String outTradeNo;

    @JSONField(name = "time_expire",ordinal = 5)
    private String timeExpire;

    @JSONField(name = "attach",ordinal = 6)
    private String attach;

    @JSONField(name = "notify_url",ordinal = 7)
    private String notifyUrl;

    @JSONField(name = "goods_tag",ordinal = 8)
    private String goodsTag;

    @JSONField(name = "amount",ordinal = 9)
    private Amount amount;

    public WxPay() {
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getMchid() {
        return mchid;
    }

    public void setMchid(String mchid) {
        this.mchid = mchid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getTimeExpire() {
        return timeExpire;
    }

    public void setTimeExpire(String timeExpire) {
        this.timeExpire = timeExpire;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getGoodsTag() {
        return goodsTag;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }
}
