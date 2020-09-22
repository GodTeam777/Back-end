package com.zhaolian.demo.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class IdcardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IdcardExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("\"name\" is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("\"name\" is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("\"name\" =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("\"name\" <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("\"name\" >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("\"name\" >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("\"name\" <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("\"name\" <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("\"name\" like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("\"name\" not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("\"name\" in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("\"name\" not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("\"name\" between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("\"name\" not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andFrontIsNull() {
            addCriterion("front is null");
            return (Criteria) this;
        }

        public Criteria andFrontIsNotNull() {
            addCriterion("front is not null");
            return (Criteria) this;
        }

        public Criteria andFrontEqualTo(String value) {
            addCriterion("front =", value, "front");
            return (Criteria) this;
        }

        public Criteria andFrontNotEqualTo(String value) {
            addCriterion("front <>", value, "front");
            return (Criteria) this;
        }

        public Criteria andFrontGreaterThan(String value) {
            addCriterion("front >", value, "front");
            return (Criteria) this;
        }

        public Criteria andFrontGreaterThanOrEqualTo(String value) {
            addCriterion("front >=", value, "front");
            return (Criteria) this;
        }

        public Criteria andFrontLessThan(String value) {
            addCriterion("front <", value, "front");
            return (Criteria) this;
        }

        public Criteria andFrontLessThanOrEqualTo(String value) {
            addCriterion("front <=", value, "front");
            return (Criteria) this;
        }

        public Criteria andFrontLike(String value) {
            addCriterion("front like", value, "front");
            return (Criteria) this;
        }

        public Criteria andFrontNotLike(String value) {
            addCriterion("front not like", value, "front");
            return (Criteria) this;
        }

        public Criteria andFrontIn(List<String> values) {
            addCriterion("front in", values, "front");
            return (Criteria) this;
        }

        public Criteria andFrontNotIn(List<String> values) {
            addCriterion("front not in", values, "front");
            return (Criteria) this;
        }

        public Criteria andFrontBetween(String value1, String value2) {
            addCriterion("front between", value1, value2, "front");
            return (Criteria) this;
        }

        public Criteria andFrontNotBetween(String value1, String value2) {
            addCriterion("front not between", value1, value2, "front");
            return (Criteria) this;
        }

        public Criteria and反面图IsNull() {
            addCriterion("反面图 is null");
            return (Criteria) this;
        }

        public Criteria and反面图IsNotNull() {
            addCriterion("反面图 is not null");
            return (Criteria) this;
        }

        public Criteria and反面图EqualTo(String value) {
            addCriterion("反面图 =", value, "反面图");
            return (Criteria) this;
        }

        public Criteria and反面图NotEqualTo(String value) {
            addCriterion("反面图 <>", value, "反面图");
            return (Criteria) this;
        }

        public Criteria and反面图GreaterThan(String value) {
            addCriterion("反面图 >", value, "反面图");
            return (Criteria) this;
        }

        public Criteria and反面图GreaterThanOrEqualTo(String value) {
            addCriterion("反面图 >=", value, "反面图");
            return (Criteria) this;
        }

        public Criteria and反面图LessThan(String value) {
            addCriterion("反面图 <", value, "反面图");
            return (Criteria) this;
        }

        public Criteria and反面图LessThanOrEqualTo(String value) {
            addCriterion("反面图 <=", value, "反面图");
            return (Criteria) this;
        }

        public Criteria and反面图Like(String value) {
            addCriterion("反面图 like", value, "反面图");
            return (Criteria) this;
        }

        public Criteria and反面图NotLike(String value) {
            addCriterion("反面图 not like", value, "反面图");
            return (Criteria) this;
        }

        public Criteria and反面图In(List<String> values) {
            addCriterion("反面图 in", values, "反面图");
            return (Criteria) this;
        }

        public Criteria and反面图NotIn(List<String> values) {
            addCriterion("反面图 not in", values, "反面图");
            return (Criteria) this;
        }

        public Criteria and反面图Between(String value1, String value2) {
            addCriterion("反面图 between", value1, value2, "反面图");
            return (Criteria) this;
        }

        public Criteria and反面图NotBetween(String value1, String value2) {
            addCriterion("反面图 not between", value1, value2, "反面图");
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