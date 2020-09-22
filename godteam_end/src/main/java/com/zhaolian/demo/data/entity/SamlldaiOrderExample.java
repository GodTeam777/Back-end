package com.zhaolian.demo.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SamlldaiOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SamlldaiOrderExample() {
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

        public Criteria andSdoidIsNull() {
            addCriterion("sdoid is null");
            return (Criteria) this;
        }

        public Criteria andSdoidIsNotNull() {
            addCriterion("sdoid is not null");
            return (Criteria) this;
        }

        public Criteria andSdoidEqualTo(BigDecimal value) {
            addCriterion("sdoid =", value, "sdoid");
            return (Criteria) this;
        }

        public Criteria andSdoidNotEqualTo(BigDecimal value) {
            addCriterion("sdoid <>", value, "sdoid");
            return (Criteria) this;
        }

        public Criteria andSdoidGreaterThan(BigDecimal value) {
            addCriterion("sdoid >", value, "sdoid");
            return (Criteria) this;
        }

        public Criteria andSdoidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sdoid >=", value, "sdoid");
            return (Criteria) this;
        }

        public Criteria andSdoidLessThan(BigDecimal value) {
            addCriterion("sdoid <", value, "sdoid");
            return (Criteria) this;
        }

        public Criteria andSdoidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sdoid <=", value, "sdoid");
            return (Criteria) this;
        }

        public Criteria andSdoidIn(List<BigDecimal> values) {
            addCriterion("sdoid in", values, "sdoid");
            return (Criteria) this;
        }

        public Criteria andSdoidNotIn(List<BigDecimal> values) {
            addCriterion("sdoid not in", values, "sdoid");
            return (Criteria) this;
        }

        public Criteria andSdoidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sdoid between", value1, value2, "sdoid");
            return (Criteria) this;
        }

        public Criteria andSdoidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sdoid not between", value1, value2, "sdoid");
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

        public Criteria andDaimoneyIsNull() {
            addCriterion("daimoney is null");
            return (Criteria) this;
        }

        public Criteria andDaimoneyIsNotNull() {
            addCriterion("daimoney is not null");
            return (Criteria) this;
        }

        public Criteria andDaimoneyEqualTo(BigDecimal value) {
            addCriterion("daimoney =", value, "daimoney");
            return (Criteria) this;
        }

        public Criteria andDaimoneyNotEqualTo(BigDecimal value) {
            addCriterion("daimoney <>", value, "daimoney");
            return (Criteria) this;
        }

        public Criteria andDaimoneyGreaterThan(BigDecimal value) {
            addCriterion("daimoney >", value, "daimoney");
            return (Criteria) this;
        }

        public Criteria andDaimoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("daimoney >=", value, "daimoney");
            return (Criteria) this;
        }

        public Criteria andDaimoneyLessThan(BigDecimal value) {
            addCriterion("daimoney <", value, "daimoney");
            return (Criteria) this;
        }

        public Criteria andDaimoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("daimoney <=", value, "daimoney");
            return (Criteria) this;
        }

        public Criteria andDaimoneyIn(List<BigDecimal> values) {
            addCriterion("daimoney in", values, "daimoney");
            return (Criteria) this;
        }

        public Criteria andDaimoneyNotIn(List<BigDecimal> values) {
            addCriterion("daimoney not in", values, "daimoney");
            return (Criteria) this;
        }

        public Criteria andDaimoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("daimoney between", value1, value2, "daimoney");
            return (Criteria) this;
        }

        public Criteria andDaimoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("daimoney not between", value1, value2, "daimoney");
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

        public Criteria andShouCardEqualTo(String value) {
            addCriterion("shou_card =", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardNotEqualTo(String value) {
            addCriterion("shou_card <>", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardGreaterThan(String value) {
            addCriterion("shou_card >", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardGreaterThanOrEqualTo(String value) {
            addCriterion("shou_card >=", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardLessThan(String value) {
            addCriterion("shou_card <", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardLessThanOrEqualTo(String value) {
            addCriterion("shou_card <=", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardLike(String value) {
            addCriterion("shou_card like", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardNotLike(String value) {
            addCriterion("shou_card not like", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardIn(List<String> values) {
            addCriterion("shou_card in", values, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardNotIn(List<String> values) {
            addCriterion("shou_card not in", values, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardBetween(String value1, String value2) {
            addCriterion("shou_card between", value1, value2, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardNotBetween(String value1, String value2) {
            addCriterion("shou_card not between", value1, value2, "shouCard");
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

        public Criteria andHuanCardEqualTo(String value) {
            addCriterion("huan_card =", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardNotEqualTo(String value) {
            addCriterion("huan_card <>", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardGreaterThan(String value) {
            addCriterion("huan_card >", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardGreaterThanOrEqualTo(String value) {
            addCriterion("huan_card >=", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardLessThan(String value) {
            addCriterion("huan_card <", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardLessThanOrEqualTo(String value) {
            addCriterion("huan_card <=", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardLike(String value) {
            addCriterion("huan_card like", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardNotLike(String value) {
            addCriterion("huan_card not like", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardIn(List<String> values) {
            addCriterion("huan_card in", values, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardNotIn(List<String> values) {
            addCriterion("huan_card not in", values, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardBetween(String value1, String value2) {
            addCriterion("huan_card between", value1, value2, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardNotBetween(String value1, String value2) {
            addCriterion("huan_card not between", value1, value2, "huanCard");
            return (Criteria) this;
        }

        public Criteria andMouIsNull() {
            addCriterion("mou is null");
            return (Criteria) this;
        }

        public Criteria andMouIsNotNull() {
            addCriterion("mou is not null");
            return (Criteria) this;
        }

        public Criteria andMouEqualTo(Short value) {
            addCriterion("mou =", value, "mou");
            return (Criteria) this;
        }

        public Criteria andMouNotEqualTo(Short value) {
            addCriterion("mou <>", value, "mou");
            return (Criteria) this;
        }

        public Criteria andMouGreaterThan(Short value) {
            addCriterion("mou >", value, "mou");
            return (Criteria) this;
        }

        public Criteria andMouGreaterThanOrEqualTo(Short value) {
            addCriterion("mou >=", value, "mou");
            return (Criteria) this;
        }

        public Criteria andMouLessThan(Short value) {
            addCriterion("mou <", value, "mou");
            return (Criteria) this;
        }

        public Criteria andMouLessThanOrEqualTo(Short value) {
            addCriterion("mou <=", value, "mou");
            return (Criteria) this;
        }

        public Criteria andMouIn(List<Short> values) {
            addCriterion("mou in", values, "mou");
            return (Criteria) this;
        }

        public Criteria andMouNotIn(List<Short> values) {
            addCriterion("mou not in", values, "mou");
            return (Criteria) this;
        }

        public Criteria andMouBetween(Short value1, Short value2) {
            addCriterion("mou between", value1, value2, "mou");
            return (Criteria) this;
        }

        public Criteria andMouNotBetween(Short value1, Short value2) {
            addCriterion("mou not between", value1, value2, "mou");
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