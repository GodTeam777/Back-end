package com.zhaolian.demo.data.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class User implements Serializable {
    private BigDecimal uid;

    private BigDecimal eduid;

    private BigDecimal cid;

    private BigDecimal hid;

    private BigDecimal cardid;

    private String uname;

    private String sex;

    private Date birthday;

    private String phone;

    private BigDecimal smalldai;

    private BigDecimal type;

    private static final long serialVersionUID = 1L;

    public BigDecimal getUid() {
        return uid;
    }

    public void setUid(BigDecimal uid) {
        this.uid = uid;
    }

    public BigDecimal getEduid() {
        return eduid;
    }

    public void setEduid(BigDecimal eduid) {
        this.eduid = eduid;
    }

    public BigDecimal getCid() {
        return cid;
    }

    public void setCid(BigDecimal cid) {
        this.cid = cid;
    }

    public BigDecimal getHid() {
        return hid;
    }

    public void setHid(BigDecimal hid) {
        this.hid = hid;
    }

    public BigDecimal getCardid() {
        return cardid;
    }

    public void setCardid(BigDecimal cardid) {
        this.cardid = cardid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BigDecimal getSmalldai() {
        return smalldai;
    }

    public void setSmalldai(BigDecimal smalldai) {
        this.smalldai = smalldai;
    }

    public BigDecimal getType() {
        return type;
    }

    public void setType(BigDecimal type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", eduid=").append(eduid);
        sb.append(", cid=").append(cid);
        sb.append(", hid=").append(hid);
        sb.append(", cardid=").append(cardid);
        sb.append(", uname=").append(uname);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", phone=").append(phone);
        sb.append(", smalldai=").append(smalldai);
        sb.append(", type=").append(type);
        sb.append("]");
        return sb.toString();
    }
}