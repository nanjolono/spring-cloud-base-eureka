package com.nanjolono.provider8081.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;

public class Amount {

    @JSONField(name = "total")
    private BigDecimal total;

    @JSONField(name = "currency")
    String currency;

    public Amount() {
    }

    public Amount(BigDecimal total, String currency) {
        this.total = total;
        this.currency = currency;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
