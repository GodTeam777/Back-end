package com.zhaolian.demo.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andEduidIsNull() {
            addCriterion("eduid is null");
            return (Criteria) this;
        }

        public Criteria andEduidIsNotNull() {
            addCriterion("eduid is not null");
            return (Criteria) this;
        }

        public Criteria andEduidEqualTo(BigDecimal value) {
            addCriterion("eduid =", value, "eduid");
            return (Criteria) this;
        }

        public Criteria andEduidNotEqualTo(BigDecimal value) {
            addCriterion("eduid <>", value, "eduid");
            return (Criteria) this;
        }

        public Criteria andEduidGreaterThan(BigDecimal value) {
            addCriterion("eduid >", value, "eduid");
            return (Criteria) this;
        }

        public Criteria andEduidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("eduid >=", value, "eduid");
            return (Criteria) this;
        }

        public Criteria andEduidLessThan(BigDecimal value) {
            addCriterion("eduid <", value, "eduid");
            return (Criteria) this;
        }

        public Criteria andEduidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("eduid <=", value, "eduid");
            return (Criteria) this;
        }

        public Criteria andEduidIn(List<BigDecimal> values) {
            addCriterion("eduid in", values, "eduid");
            return (Criteria) this;
        }

        public Criteria andEduidNotIn(List<BigDecimal> values) {
            addCriterion("eduid not in", values, "eduid");
            return (Criteria) this;
        }

        public Criteria andEduidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("eduid between", value1, value2, "eduid");
            return (Criteria) this;
        }

        public Criteria andEduidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("eduid not between", value1, value2, "eduid");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(BigDecimal value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(BigDecimal value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(BigDecimal value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(BigDecimal value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<BigDecimal> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<BigDecimal> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
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

        public Criteria andCardidIsNull() {
            addCriterion("cardid is null");
            return (Criteria) this;
        }

        public Criteria andCardidIsNotNull() {
            addCriterion("cardid is not null");
            return (Criteria) this;
        }

        public Criteria andCardidEqualTo(BigDecimal value) {
            addCriterion("cardid =", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotEqualTo(BigDecimal value) {
            addCriterion("cardid <>", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidGreaterThan(BigDecimal value) {
            addCriterion("cardid >", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cardid >=", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLessThan(BigDecimal value) {
            addCriterion("cardid <", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cardid <=", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidIn(List<BigDecimal> values) {
            addCriterion("cardid in", values, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotIn(List<BigDecimal> values) {
            addCriterion("cardid not in", values, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cardid between", value1, value2, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cardid not between", value1, value2, "cardid");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("uname is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("uname is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("uname =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("uname <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("uname >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("uname >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("uname <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("uname <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("uname like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("uname not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("uname in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("uname not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("uname between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("uname not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andSmalldaiIsNull() {
            addCriterion("smalldai is null");
            return (Criteria) this;
        }

        public Criteria andSmalldaiIsNotNull() {
            addCriterion("smalldai is not null");
            return (Criteria) this;
        }

        public Criteria andSmalldaiEqualTo(BigDecimal value) {
            addCriterion("smalldai =", value, "smalldai");
            return (Criteria) this;
        }

        public Criteria andSmalldaiNotEqualTo(BigDecimal value) {
            addCriterion("smalldai <>", value, "smalldai");
            return (Criteria) this;
        }

        public Criteria andSmalldaiGreaterThan(BigDecimal value) {
            addCriterion("smalldai >", value, "smalldai");
            return (Criteria) this;
        }

        public Criteria andSmalldaiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("smalldai >=", value, "smalldai");
            return (Criteria) this;
        }

        public Criteria andSmalldaiLessThan(BigDecimal value) {
            addCriterion("smalldai <", value, "smalldai");
            return (Criteria) this;
        }

        public Criteria andSmalldaiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("smalldai <=", value, "smalldai");
            return (Criteria) this;
        }

        public Criteria andSmalldaiIn(List<BigDecimal> values) {
            addCriterion("smalldai in", values, "smalldai");
            return (Criteria) this;
        }

        public Criteria andSmalldaiNotIn(List<BigDecimal> values) {
            addCriterion("smalldai not in", values, "smalldai");
            return (Criteria) this;
        }

        public Criteria andSmalldaiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("smalldai between", value1, value2, "smalldai");
            return (Criteria) this;
        }

        public Criteria andSmalldaiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("smalldai not between", value1, value2, "smalldai");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("\"type\" is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("\"type\" is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(BigDecimal value) {
            addCriterion("\"type\" =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(BigDecimal value) {
            addCriterion("\"type\" <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(BigDecimal value) {
            addCriterion("\"type\" >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("\"type\" >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(BigDecimal value) {
            addCriterion("\"type\" <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("\"type\" <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<BigDecimal> values) {
            addCriterion("\"type\" in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<BigDecimal> values) {
            addCriterion("\"type\" not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"type\" between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"type\" not between", value1, value2, "type");
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