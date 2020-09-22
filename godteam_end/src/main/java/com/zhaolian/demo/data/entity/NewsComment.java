package com.zhaolian.demo.data.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class NewsComment implements Serializable {
    private BigDecimal ncid;

    private BigDecimal userid;

    private BigDecimal nid;

    private String text;

    private Date commentDate;

    private static final long serialVersionUID = 1L;

    public BigDecimal getNcid() {
        return ncid;
    }

    public void setNcid(BigDecimal ncid) {
        this.ncid = ncid;
    }

    public BigDecimal getUserid() {
        return userid;
    }

    public void setUserid(BigDecimal userid) {
        this.userid = userid;
    }

    public BigDecimal getNid() {
        return nid;
    }

    public void setNid(BigDecimal nid) {
        this.nid = nid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ncid=").append(ncid);
        sb.append(", userid=").append(userid);
        sb.append(", nid=").append(nid);
        sb.append(", text=").append(text);
        sb.append(", commentDate=").append(commentDate);
        sb.append("]");
        return sb.toString();
    }
}