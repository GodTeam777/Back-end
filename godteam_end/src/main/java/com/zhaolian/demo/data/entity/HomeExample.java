package com.zhaolian.demo.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HomeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HomeExample() {
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

        public Criteria andHidIsNull() {
            addCriterion("hid is null");
            return (Criteria) this;
        }

        public Criteria andHidIsNotNull() {
            addCriterion("hid is not null");
            return (Criteria) this;
        }

        public Criteria andHidEqualTo(BigDecimal value) {
            addCriterion("hid =", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotEqualTo(BigDecimal value) {
            addCriterion("hid <>", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThan(BigDecimal value) {
            addCriterion("hid >", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hid >=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThan(BigDecimal value) {
            addCriterion("hid <", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hid <=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidIn(List<BigDecimal> values) {
            addCriterion("hid in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotIn(List<BigDecimal> values) {
            addCriterion("hid not in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hid between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hid not between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andHnameIsNull() {
            addCriterion("hname is null");
            return (Criteria) this;
        }

        public Criteria andHnameIsNotNull() {
            addCriterion("hname is not null");
            return (Criteria) this;
        }

        public Criteria andHnameEqualTo(String value) {
            addCriterion("hname =", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameNotEqualTo(String value) {
            addCriterion("hname <>", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameGreaterThan(String value) {
            addCriterion("hname >", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameGreaterThanOrEqualTo(String value) {
            addCriterion("hname >=", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameLessThan(String value) {
            addCriterion("hname <", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameLessThanOrEqualTo(String value) {
            addCriterion("hname <=", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameLike(String value) {
            addCriterion("hname like", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameNotLike(String value) {
            addCriterion("hname not like", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameIn(List<String> values) {
            addCriterion("hname in", values, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameNotIn(List<String> values) {
            addCriterion("hname not in", values, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameBetween(String value1, String value2) {
            addCriterion("hname between", value1, value2, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameNotBetween(String value1, String value2) {
            addCriterion("hname not between", value1, value2, "hname");
            return (Criteria) this;
        }

        public Criteria andHaddressIsNull() {
            addCriterion("haddress is null");
            return (Criteria) this;
        }

        public Criteria andHaddressIsNotNull() {
            addCriterion("haddress is not null");
            return (Criteria) this;
        }

        public Criteria andHaddressEqualTo(String value) {
            addCriterion("haddress =", value, "haddress");
            return (Criteria) this;
        }

        public Criteria andHaddressNotEqualTo(String value) {
            addCriterion("haddress <>", value, "haddress");
            return (Criteria) this;
        }

        public Criteria andHaddressGreaterThan(String value) {
            addCriterion("haddress >", value, "haddress");
            return (Criteria) this;
        }

        public Criteria andHaddressGreaterThanOrEqualTo(String value) {
            addCriterion("haddress >=", value, "haddress");
            return (Criteria) this;
        }

        public Criteria andHaddressLessThan(String value) {
            addCriterion("haddress <", value, "haddress");
            return (Criteria) this;
        }

        public Criteria andHaddressLessThanOrEqualTo(String value) {
            addCriterion("haddress <=", value, "haddress");
            return (Criteria) this;
        }

        public Criteria andHaddressLike(String value) {
            addCriterion("haddress like", value, "haddress");
            return (Criteria) this;
        }

        public Criteria andHaddressNotLike(String value) {
            addCriterion("haddress not like", value, "haddress");
            return (Criteria) this;
        }

        public Criteria andHaddressIn(List<String> values) {
            addCriterion("haddress in", values, "haddress");
            return (Criteria) this;
        }

        public Criteria andHaddressNotIn(List<String> values) {
            addCriterion("haddress not in", values, "haddress");
            return (Criteria) this;
        }

        public Criteria andHaddressBetween(String value1, String value2) {
            addCriterion("haddress between", value1, value2, "haddress");
            return (Criteria) this;
        }

        public Criteria andHaddressNotBetween(String value1, String value2) {
            addCriterion("haddress not between", value1, value2, "haddress");
            return (Criteria) this;
        }

        public Criteria andHdateIsNull() {
            addCriterion("hdate is null");
            return (Criteria) this;
        }

        public Criteria andHdateIsNotNull() {
            addCriterion("hdate is not null");
            return (Criteria) this;
        }

        public Criteria andHdateEqualTo(Date value) {
            addCriterion("hdate =", value, "hdate");
            return (Criteria) this;
        }

        public Criteria andHdateNotEqualTo(Date value) {
            addCriterion("hdate <>", value, "hdate");
            return (Criteria) this;
        }

        public Criteria andHdateGreaterThan(Date value) {
            addCriterion("hdate >", value, "hdate");
            return (Criteria) this;
        }

        public Criteria andHdateGreaterThanOrEqualTo(Date value) {
            addCriterion("hdate >=", value, "hdate");
            return (Criteria) this;
        }

        public Criteria andHdateLessThan(Date value) {
            addCriterion("hdate <", value, "hdate");
            return (Criteria) this;
        }

        public Criteria andHdateLessThanOrEqualTo(Date value) {
            addCriterion("hdate <=", value, "hdate");
            return (Criteria) this;
        }

        public Criteria andHdateIn(List<Date> values) {
            addCriterion("hdate in", values, "hdate");
            return (Criteria) this;
        }

        public Criteria andHdateNotIn(List<Date> values) {
            addCriterion("hdate not in", values, "hdate");
            return (Criteria) this;
        }

        public Criteria andHdateBetween(Date value1, Date value2) {
            addCriterion("hdate between", value1, value2, "hdate");
            return (Criteria) this;
        }

        public Criteria andHdateNotBetween(Date value1, Date value2) {
            addCriterion("hdate not between", value1, value2, "hdate");
            return (Criteria) this;
        }

        public Criteria andHpathIsNull() {
            addCriterion("hpath is null");
            return (Criteria) this;
        }

        public Criteria andHpathIsNotNull() {
            addCriterion("hpath is not null");
            return (Criteria) this;
        }

        public Criteria andHpathEqualTo(String value) {
            addCriterion("hpath =", value, "hpath");
            return (Criteria) this;
        }

        public Criteria andHpathNotEqualTo(String value) {
            addCriterion("hpath <>", value, "hpath");
            return (Criteria) this;
        }

        public Criteria andHpathGreaterThan(String value) {
            addCriterion("hpath >", value, "hpath");
            return (Criteria) this;
        }

        public Criteria andHpathGreaterThanOrEqualTo(String value) {
            addCriterion("hpath >=", value, "hpath");
            return (Criteria) this;
        }

        public Criteria andHpathLessThan(String value) {
            addCriterion("hpath <", value, "hpath");
            return (Criteria) this;
        }

        public Criteria andHpathLessThanOrEqualTo(String value) {
            addCriterion("hpath <=", value, "hpath");
            return (Criteria) this;
        }

        public Criteria andHpathLike(String value) {
            addCriterion("hpath like", value, "hpath");
            return (Criteria) this;
        }

        public Criteria andHpathNotLike(String value) {
            addCriterion("hpath not like", value, "hpath");
            return (Criteria) this;
        }

        public Criteria andHpathIn(List<String> values) {
            addCriterion("hpath in", values, "hpath");
            return (Criteria) this;
        }

        public Criteria andHpathNotIn(List<String> values) {
            addCriterion("hpath not in", values, "hpath");
            return (Criteria) this;
        }

        public Criteria andHpathBetween(String value1, String value2) {
            addCriterion("hpath between", value1, value2, "hpath");
            return (Criteria) this;
        }

        public Criteria andHpathNotBetween(String value1, String value2) {
            addCriterion("hpath not between", value1, value2, "hpath");
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