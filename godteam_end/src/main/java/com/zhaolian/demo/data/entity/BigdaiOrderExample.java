package com.zhaolian.demo.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BigdaiOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BigdaiOrderExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBoidIsNull() {
            addCriterion("boid is null");
            return (Criteria) this;
        }

        public Criteria andBoidIsNotNull() {
            addCriterion("boid is not null");
            return (Criteria) this;
        }

        public Criteria andBoidEqualTo(BigDecimal value) {
            addCriterion("boid =", value, "boid");
            return (Criteria) this;
        }

        public Criteria andBoidNotEqualTo(BigDecimal value) {
            addCriterion("boid <>", value, "boid");
            return (Criteria) this;
        }

        public Criteria andBoidGreaterThan(BigDecimal value) {
            addCriterion("boid >", value, "boid");
            return (Criteria) this;
        }

        public Criteria andBoidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("boid >=", value, "boid");
            return (Criteria) this;
        }

        public Criteria andBoidLessThan(BigDecimal value) {
            addCriterion("boid <", value, "boid");
            return (Criteria) this;
        }

        public Criteria andBoidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("boid <=", value, "boid");
            return (Criteria) this;
        }

        public Criteria andBoidIn(List<BigDecimal> values) {
            addCriterion("boid in", values, "boid");
            return (Criteria) this;
        }

        public Criteria andBoidNotIn(List<BigDecimal> values) {
            addCriterion("boid not in", values, "boid");
            return (Criteria) this;
        }

        public Criteria andBoidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("boid between", value1, value2, "boid");
            return (Criteria) this;
        }

        public Criteria andBoidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("boid not between", value1, value2, "boid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("\"uid\" is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("\"uid\" is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(BigDecimal value) {
            addCriterion("\"uid\" =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(BigDecimal value) {
            addCriterion("\"uid\" <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(BigDecimal value) {
            addCriterion("\"uid\" >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("\"uid\" >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(BigDecimal value) {
            addCriterion("\"uid\" <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("\"uid\" <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<BigDecimal> values) {
            addCriterion("\"uid\" in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<BigDecimal> values) {
            addCriterion("\"uid\" not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"uid\" between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"uid\" not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andBdidIsNull() {
            addCriterion("bdid is null");
            return (Criteria) this;
        }

        public Criteria andBdidIsNotNull() {
            addCriterion("bdid is not null");
            return (Criteria) this;
        }

        public Criteria andBdidEqualTo(BigDecimal value) {
            addCriterion("bdid =", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidNotEqualTo(BigDecimal value) {
            addCriterion("bdid <>", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidGreaterThan(BigDecimal value) {
            addCriterion("bdid >", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bdid >=", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidLessThan(BigDecimal value) {
            addCriterion("bdid <", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bdid <=", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidIn(List<BigDecimal> values) {
            addCriterion("bdid in", values, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidNotIn(List<BigDecimal> values) {
            addCriterion("bdid not in", values, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bdid between", value1, value2, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bdid not between", value1, value2, "bdid");
            return (Criteria) this;
        }

        public Criteria andBigmoneyIsNull() {
            addCriterion("bigmoney is null");
            return (Criteria) this;
        }

        public Criteria andBigmoneyIsNotNull() {
            addCriterion("bigmoney is not null");
            return (Criteria) this;
        }

        public Criteria andBigmoneyEqualTo(BigDecimal value) {
            addCriterion("bigmoney =", value, "bigmoney");
            return (Criteria) this;
        }

        public Criteria andBigmoneyNotEqualTo(BigDecimal value) {
            addCriterion("bigmoney <>", value, "bigmoney");
            return (Criteria) this;
        }

        public Criteria andBigmoneyGreaterThan(BigDecimal value) {
            addCriterion("bigmoney >", value, "bigmoney");
            return (Criteria) this;
        }

        public Criteria andBigmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bigmoney >=", value, "bigmoney");
            return (Criteria) this;
        }

        public Criteria andBigmoneyLessThan(BigDecimal value) {
            addCriterion("bigmoney <", value, "bigmoney");
            return (Criteria) this;
        }

        public Criteria andBigmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bigmoney <=", value, "bigmoney");
            return (Criteria) this;
        }

        public Criteria andBigmoneyIn(List<BigDecimal> values) {
            addCriterion("bigmoney in", values, "bigmoney");
            return (Criteria) this;
        }

        public Criteria andBigmoneyNotIn(List<BigDecimal> values) {
            addCriterion("bigmoney not in", values, "bigmoney");
            return (Criteria) this;
        }

        public Criteria andBigmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bigmoney between", value1, value2, "bigmoney");
            return (Criteria) this;
        }

        public Criteria andBigmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bigmoney not between", value1, value2, "bigmoney");
            return (Criteria) this;
        }

        public Criteria andBigdaiDateIsNull() {
            addCriterion("bigdai_date is null");
            return (Criteria) this;
        }

        public Criteria andBigdaiDateIsNotNull() {
            addCriterion("bigdai_date is not null");
            return (Criteria) this;
        }

        public Criteria andBigdaiDateEqualTo(BigDecimal value) {
            addCriterion("bigdai_date =", value, "bigdaiDate");
            return (Criteria) this;
        }

        public Criteria andBigdaiDateNotEqualTo(BigDecimal value) {
            addCriterion("bigdai_date <>", value, "bigdaiDate");
            return (Criteria) this;
        }

        public Criteria andBigdaiDateGreaterThan(BigDecimal value) {
            addCriterion("bigdai_date >", value, "bigdaiDate");
            return (Criteria) this;
        }

        public Criteria andBigdaiDateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bigdai_date >=", value, "bigdaiDate");
            return (Criteria) this;
        }

        public Criteria andBigdaiDateLessThan(BigDecimal value) {
            addCriterion("bigdai_date <", value, "bigdaiDate");
            return (Criteria) this;
        }

        public Criteria andBigdaiDateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bigdai_date <=", value, "bigdaiDate");
            return (Criteria) this;
        }

        public Criteria andBigdaiDateIn(List<BigDecimal> values) {
            addCriterion("bigdai_date in", values, "bigdaiDate");
            return (Criteria) this;
        }

        public Criteria andBigdaiDateNotIn(List<BigDecimal> values) {
            addCriterion("bigdai_date not in", values, "bigdaiDate");
            return (Criteria) this;
        }

        public Criteria andBigdaiDateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bigdai_date between", value1, value2, "bigdaiDate");
            return (Criteria) this;
        }

        public Criteria andBigdaiDateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bigdai_date not between", value1, value2, "bigdaiDate");
            return (Criteria) this;
        }

        public Criteria andYihuanIsNull() {
            addCriterion("yihuan is null");
            return (Criteria) this;
        }

        public Criteria andYihuanIsNotNull() {
            addCriterion("yihuan is not null");
            return (Criteria) this;
        }

        public Criteria andYihuanEqualTo(BigDecimal value) {
            addCriterion("yihuan =", value, "yihuan");
            return (Criteria) this;
        }

        public Criteria andYihuanNotEqualTo(BigDecimal value) {
            addCriterion("yihuan <>", value, "yihuan");
            return (Criteria) this;
        }

        public Criteria andYihuanGreaterThan(BigDecimal value) {
            addCriterion("yihuan >", value, "yihuan");
            return (Criteria) this;
        }

        public Criteria andYihuanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yihuan >=", value, "yihuan");
            return (Criteria) this;
        }

        public Criteria andYihuanLessThan(BigDecimal value) {
            addCriterion("yihuan <", value, "yihuan");
            return (Criteria) this;
        }

        public Criteria andYihuanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yihuan <=", value, "yihuan");
            return (Criteria) this;
        }

        public Criteria andYihuanIn(List<BigDecimal> values) {
            addCriterion("yihuan in", values, "yihuan");
            return (Criteria) this;
        }

        public Criteria andYihuanNotIn(List<BigDecimal> values) {
            addCriterion("yihuan not in", values, "yihuan");
            return (Criteria) this;
        }

        public Criteria andYihuanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yihuan between", value1, value2, "yihuan");
            return (Criteria) this;
        }

        public Criteria andYihuanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yihuan not between", value1, value2, "yihuan");
            return (Criteria) this;
        }

        public Criteria andHuanCardIsNull() {
            addCriterion("huan_card is null");
            return (Criteria) this;
        }

        public Criteria andHuanCardIsNotNull() {
            addCriterion("huan_card is not null");
            return (Criteria) this;
        }

        public Criteria andHuanCardEqualTo(BigDecimal value) {
            addCriterion("huan_card =", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardNotEqualTo(BigDecimal value) {
            addCriterion("huan_card <>", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardGreaterThan(BigDecimal value) {
            addCriterion("huan_card >", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("huan_card >=", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardLessThan(BigDecimal value) {
            addCriterion("huan_card <", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("huan_card <=", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardIn(List<BigDecimal> values) {
            addCriterion("huan_card in", values, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardNotIn(List<BigDecimal> values) {
            addCriterion("huan_card not in", values, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("huan_card between", value1, value2, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("huan_card not between", value1, value2, "huanCard");
            return (Criteria) this;
        }

        public Criteria andShouCardIsNull() {
            addCriterion("shou_card is null");
            return (Criteria) this;
        }

        public Criteria andShouCardIsNotNull() {
            addCriterion("shou_card is not null");
            return (Criteria) this;
        }

        public Criteria andShouCardEqualTo(BigDecimal value) {
            addCriterion("shou_card =", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardNotEqualTo(BigDecimal value) {
            addCriterion("shou_card <>", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardGreaterThan(BigDecimal value) {
            addCriterion("shou_card >", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shou_card >=", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardLessThan(BigDecimal value) {
            addCriterion("shou_card <", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shou_card <=", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardIn(List<BigDecimal> values) {
            addCriterion("shou_card in", values, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardNotIn(List<BigDecimal> values) {
            addCriterion("shou_card not in", values, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shou_card between", value1, value2, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shou_card not between", value1, value2, "shouCard");
            return (Criteria) this;
        }

        public Criteria andDaiDateIsNull() {
            addCriterion("dai_date is null");
            return (Criteria) this;
        }

        public Criteria andDaiDateIsNotNull() {
            addCriterion("dai_date is not null");
            return (Criteria) this;
        }

        public Criteria andDaiDateEqualTo(Date value) {
            addCriterion("dai_date =", value, "daiDate");
            return (Criteria) this;
        }

        public Criteria andDaiDateNotEqualTo(Date value) {
            addCriterion("dai_date <>", value, "daiDate");
            return (Criteria) this;
        }

        public Criteria andDaiDateGreaterThan(Date value) {
            addCriterion("dai_date >", value, "daiDate");
            return (Criteria) this;
        }

        public Criteria andDaiDateGreaterThanOrEqualTo(Date value) {
            addCriterion("dai_date >=", value, "daiDate");
            return (Criteria) this;
        }

        public Criteria andDaiDateLessThan(Date value) {
            addCriterion("dai_date <", value, "daiDate");
            return (Criteria) this;
        }

        public Criteria andDaiDateLessThanOrEqualTo(Date value) {
            addCriterion("dai_date <=", value, "daiDate");
            return (Criteria) this;
        }

        public Criteria andDaiDateIn(List<Date> values) {
            addCriterion("dai_date in", values, "daiDate");
            return (Criteria) this;
        }

        public Criteria andDaiDateNotIn(List<Date> values) {
            addCriterion("dai_date not in", values, "daiDate");
            return (Criteria) this;
        }

        public Criteria andDaiDateBetween(Date value1, Date value2) {
            addCriterion("dai_date between", value1, value2, "daiDate");
            return (Criteria) this;
        }

        public Criteria andDaiDateNotBetween(Date value1, Date value2) {
            addCriterion("dai_date not between", value1, value2, "daiDate");
            return (Criteria) this;
        }

        public Criteria andOnemoneyIsNull() {
            addCriterion("onemoney is null");
            return (Criteria) this;
        }

        public Criteria andOnemoneyIsNotNull() {
            addCriterion("onemoney is not null");
            return (Criteria) this;
        }

        public Criteria andOnemoneyEqualTo(BigDecimal value) {
            addCriterion("onemoney =", value, "onemoney");
            return (Criteria) this;
        }

        public Criteria andOnemoneyNotEqualTo(BigDecimal value) {
            addCriterion("onemoney <>", value, "onemoney");
            return (Criteria) this;
        }

        public Criteria andOnemoneyGreaterThan(BigDecimal value) {
            addCriterion("onemoney >", value, "onemoney");
            return (Criteria) this;
        }

        public Criteria andOnemoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("onemoney >=", value, "onemoney");
            return (Criteria) this;
        }

        public Criteria andOnemoneyLessThan(BigDecimal value) {
            addCriterion("onemoney <", value, "onemoney");
            return (Criteria) this;
        }

        public Criteria andOnemoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("onemoney <=", value, "onemoney");
            return (Criteria) this;
        }

        public Criteria andOnemoneyIn(List<BigDecimal> values) {
            addCriterion("onemoney in", values, "onemoney");
            return (Criteria) this;
        }

        public Criteria andOnemoneyNotIn(List<BigDecimal> values) {
            addCriterion("onemoney not in", values, "onemoney");
            return (Criteria) this;
        }

        public Criteria andOnemoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("onemoney between", value1, value2, "onemoney");
            return (Criteria) this;
        }

        public Criteria andOnemoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("onemoney not between", value1, value2, "onemoney");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("\"status\" is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("\"status\" is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(BigDecimal value) {
            addCriterion("\"status\" =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(BigDecimal value) {
            addCriterion("\"status\" <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(BigDecimal value) {
            addCriterion("\"status\" >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("\"status\" >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(BigDecimal value) {
            addCriterion("\"status\" <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("\"status\" <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<BigDecimal> values) {
            addCriterion("\"status\" in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<BigDecimal> values) {
            addCriterion("\"status\" not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"status\" between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"status\" not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}