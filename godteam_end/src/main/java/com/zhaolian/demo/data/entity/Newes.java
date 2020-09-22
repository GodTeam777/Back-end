package com.zhaolian.demo.data.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Newes implements Serializable {
    private BigDecimal nid;

    private String newsTitle;

    private String newsBody;

    private String smallImg;

    private String bigImg;

    private Date newsDate;

    private static final long serialVersionUID = 1L;

    public BigDecimal getNid() {
        return nid;
    }

    public void setNid(BigDecimal nid) {
        this.nid = nid;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsBody() {
        return newsBody;
    }

    public void setNewsBody(String newsBody) {
        this.newsBody = newsBody;
    }

    public String getSmallImg() {
        return smallImg;
    }

    public void setSmallImg(String smallImg) {
        this.smallImg = smallImg;
    }

    public String getBigImg() {
        return bigImg;
    }

    public void setBigImg(String bigImg) {
        this.bigImg = bigImg;
    }

    public Date getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(Date newsDate) {
        this.newsDate = newsDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", nid=").append(nid);
        sb.append(", newsTitle=").append(newsTitle);
        sb.append(", newsBody=").append(newsBody);
        sb.append(", smallImg=").append(smallImg);
        sb.append(", bigImg=").append(bigImg);
        sb.append(", newsDate=").append(newsDate);
        sb.append("]");
        return sb.toString();
    }
}