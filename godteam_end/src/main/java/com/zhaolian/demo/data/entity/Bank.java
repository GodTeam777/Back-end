package com.zhaolian.demo.data.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Bank implements Serializable {
    private BigDecimal bid;

    private BigDecimal userid;

    private BigDecimal bankcard;

    private static final long serialVersionUID = 1L;

    public BigDecimal getBid() {
        return bid;
    }

    public void setBid(BigDecimal bid) {
        this.bid = bid;
    }

    public BigDecimal getUserid() {
        return userid;
    }

    public void setUserid(BigDecimal userid) {
        this.userid = userid;
    }

    public BigDecimal getBankcard() {
        return bankcard;
    }

    public void setBankcard(BigDecimal bankcard) {
        this.bankcard = bankcard;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bid=").append(bid);
        sb.append(", userid=").append(userid);
        sb.append(", bankcard=").append(bankcard);
        sb.append("]");
        return sb.toString();
    }
}