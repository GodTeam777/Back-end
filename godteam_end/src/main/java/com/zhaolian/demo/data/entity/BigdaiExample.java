package com.zhaolian.demo.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BigdaiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BigdaiExample() {
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

        public Criteria andBdnameIsNull() {
            addCriterion("bdname is null");
            return (Criteria) this;
        }

        public Criteria andBdnameIsNotNull() {
            addCriterion("bdname is not null");
            return (Criteria) this;
        }

        public Criteria andBdnameEqualTo(String value) {
            addCriterion("bdname =", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameNotEqualTo(String value) {
            addCriterion("bdname <>", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameGreaterThan(String value) {
            addCriterion("bdname >", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameGreaterThanOrEqualTo(String value) {
            addCriterion("bdname >=", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameLessThan(String value) {
            addCriterion("bdname <", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameLessThanOrEqualTo(String value) {
            addCriterion("bdname <=", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameLike(String value) {
            addCriterion("bdname like", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameNotLike(String value) {
            addCriterion("bdname not like", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameIn(List<String> values) {
            addCriterion("bdname in", values, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameNotIn(List<String> values) {
            addCriterion("bdname not in", values, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameBetween(String value1, String value2) {
            addCriterion("bdname between", value1, value2, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameNotBetween(String value1, String value2) {
            addCriterion("bdname not between", value1, value2, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdpathIsNull() {
            addCriterion("bdpath is null");
            return (Criteria) this;
        }

        public Criteria andBdpathIsNotNull() {
            addCriterion("bdpath is not null");
            return (Criteria) this;
        }

        public Criteria andBdpathEqualTo(String value) {
            addCriterion("bdpath =", value, "bdpath");
            return (Criteria) this;
        }

        public Criteria andBdpathNotEqualTo(String value) {
            addCriterion("bdpath <>", value, "bdpath");
            return (Criteria) this;
        }

        public Criteria andBdpathGreaterThan(String value) {
            addCriterion("bdpath >", value, "bdpath");
            return (Criteria) this;
        }

        public Criteria andBdpathGreaterThanOrEqualTo(String value) {
            addCriterion("bdpath >=", value, "bdpath");
            return (Criteria) this;
        }

        public Criteria andBdpathLessThan(String value) {
            addCriterion("bdpath <", value, "bdpath");
            return (Criteria) this;
        }

        public Criteria andBdpathLessThanOrEqualTo(String value) {
            addCriterion("bdpath <=", value, "bdpath");
            return (Criteria) this;
        }

        public Criteria andBdpathLike(String value) {
            addCriterion("bdpath like", value, "bdpath");
            return (Criteria) this;
        }

        public Criteria andBdpathNotLike(String value) {
            addCriterion("bdpath not like", value, "bdpath");
            return (Criteria) this;
        }

        public Criteria andBdpathIn(List<String> values) {
            addCriterion("bdpath in", values, "bdpath");
            return (Criteria) this;
        }

        public Criteria andBdpathNotIn(List<String> values) {
            addCriterion("bdpath not in", values, "bdpath");
            return (Criteria) this;
        }

        public Criteria andBdpathBetween(String value1, String value2) {
            addCriterion("bdpath between", value1, value2, "bdpath");
            return (Criteria) this;
        }

        public Criteria andBdpathNotBetween(String value1, String value2) {
            addCriterion("bdpath not between", value1, value2, "bdpath");
            return (Criteria) this;
        }

        public Criteria andInterestIsNull() {
            addCriterion("interest is null");
            return (Criteria) this;
        }

        public Criteria andInterestIsNotNull() {
            addCriterion("interest is not null");
            return (Criteria) this;
        }

        public Criteria andInterestEqualTo(BigDecimal value) {
            addCriterion("interest =", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotEqualTo(BigDecimal value) {
            addCriterion("interest <>", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThan(BigDecimal value) {
            addCriterion("interest >", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interest >=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThan(BigDecimal value) {
            addCriterion("interest <", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interest <=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestIn(List<BigDecimal> values) {
            addCriterion("interest in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotIn(List<BigDecimal> values) {
            addCriterion("interest not in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest not between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleIsNull() {
            addCriterion("bigdai_title is null");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleIsNotNull() {
            addCriterion("bigdai_title is not null");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleEqualTo(String value) {
            addCriterion("bigdai_title =", value, "bigdaiTitle");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleNotEqualTo(String value) {
            addCriterion("bigdai_title <>", value, "bigdaiTitle");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleGreaterThan(String value) {
            addCriterion("bigdai_title >", value, "bigdaiTitle");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleGreaterThanOrEqualTo(String value) {
            addCriterion("bigdai_title >=", value, "bigdaiTitle");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleLessThan(String value) {
            addCriterion("bigdai_title <", value, "bigdaiTitle");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleLessThanOrEqualTo(String value) {
            addCriterion("bigdai_title <=", value, "bigdaiTitle");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleLike(String value) {
            addCriterion("bigdai_title like", value, "bigdaiTitle");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleNotLike(String value) {
            addCriterion("bigdai_title not like", value, "bigdaiTitle");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleIn(List<String> values) {
            addCriterion("bigdai_title in", values, "bigdaiTitle");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleNotIn(List<String> values) {
            addCriterion("bigdai_title not in", values, "bigdaiTitle");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleBetween(String value1, String value2) {
            addCriterion("bigdai_title between", value1, value2, "bigdaiTitle");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleNotBetween(String value1, String value2) {
            addCriterion("bigdai_title not between", value1, value2, "bigdaiTitle");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyIsNull() {
            addCriterion("bigdai_body is null");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyIsNotNull() {
            addCriterion("bigdai_body is not null");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyEqualTo(String value) {
            addCriterion("bigdai_body =", value, "bigdaiBody");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyNotEqualTo(String value) {
            addCriterion("bigdai_body <>", value, "bigdaiBody");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyGreaterThan(String value) {
            addCriterion("bigdai_body >", value, "bigdaiBody");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyGreaterThanOrEqualTo(String value) {
            addCriterion("bigdai_body >=", value, "bigdaiBody");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyLessThan(String value) {
            addCriterion("bigdai_body <", value, "bigdaiBody");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyLessThanOrEqualTo(String value) {
            addCriterion("bigdai_body <=", value, "bigdaiBody");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyLike(String value) {
            addCriterion("bigdai_body like", value, "bigdaiBody");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyNotLike(String value) {
            addCriterion("bigdai_body not like", value, "bigdaiBody");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyIn(List<String> values) {
            addCriterion("bigdai_body in", values, "bigdaiBody");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyNotIn(List<String> values) {
            addCriterion("bigdai_body not in", values, "bigdaiBody");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyBetween(String value1, String value2) {
            addCriterion("bigdai_body between", value1, value2, "bigdaiBody");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyNotBetween(String value1, String value2) {
            addCriterion("bigdai_body not between", value1, value2, "bigdaiBody");
            return (Criteria) this;
        }

        public Criteria andBdtypeIsNull() {
            addCriterion("bdtype is null");
            return (Criteria) this;
        }

        public Criteria andBdtypeIsNotNull() {
            addCriterion("bdtype is not null");
            return (Criteria) this;
        }

        public Criteria andBdtypeEqualTo(String value) {
            addCriterion("bdtype =", value, "bdtype");
            return (Criteria) this;
        }

        public Criteria andBdtypeNotEqualTo(String value) {
            addCriterion("bdtype <>", value, "bdtype");
            return (Criteria) this;
        }

        public Criteria andBdtypeGreaterThan(String value) {
            addCriterion("bdtype >", value, "bdtype");
            return (Criteria) this;
        }

        public Criteria andBdtypeGreaterThanOrEqualTo(String value) {
            addCriterion("bdtype >=", value, "bdtype");
            return (Criteria) this;
        }

        public Criteria andBdtypeLessThan(String value) {
            addCriterion("bdtype <", value, "bdtype");
            return (Criteria) this;
        }

        public Criteria andBdtypeLessThanOrEqualTo(String value) {
            addCriterion("bdtype <=", value, "bdtype");
            return (Criteria) this;
        }

        public Criteria andBdtypeLike(String value) {
            addCriterion("bdtype like", value, "bdtype");
            return (Criteria) this;
        }

        public Criteria andBdtypeNotLike(String value) {
            addCriterion("bdtype not like", value, "bdtype");
            return (Criteria) this;
        }

        public Criteria andBdtypeIn(List<String> values) {
            addCriterion("bdtype in", values, "bdtype");
            return (Criteria) this;
        }

        public Criteria andBdtypeNotIn(List<String> values) {
            addCriterion("bdtype not in", values, "bdtype");
            return (Criteria) this;
        }

        public Criteria andBdtypeBetween(String value1, String value2) {
            addCriterion("bdtype between", value1, value2, "bdtype");
            return (Criteria) this;
        }

        public Criteria andBdtypeNotBetween(String value1, String value2) {
            addCriterion("bdtype not between", value1, value2, "bdtype");
            return (Criteria) this;
        }

        public Criteria andBddateIsNull() {
            addCriterion("bddate is null");
            return (Criteria) this;
        }

        public Criteria andBddateIsNotNull() {
            addCriterion("bddate is not null");
            return (Criteria) this;
        }

        public Criteria andBddateEqualTo(BigDecimal value) {
            addCriterion("bddate =", value, "bddate");
            return (Criteria) this;
        }

        public Criteria andBddateNotEqualTo(BigDecimal value) {
            addCriterion("bddate <>", value, "bddate");
            return (Criteria) this;
        }

        public Criteria andBddateGreaterThan(BigDecimal value) {
            addCriterion("bddate >", value, "bddate");
            return (Criteria) this;
        }

        public Criteria andBddateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bddate >=", value, "bddate");
            return (Criteria) this;
        }

        public Criteria andBddateLessThan(BigDecimal value) {
            addCriterion("bddate <", value, "bddate");
            return (Criteria) this;
        }

        public Criteria andBddateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bddate <=", value, "bddate");
            return (Criteria) this;
        }

        public Criteria andBddateIn(List<BigDecimal> values) {
            addCriterion("bddate in", values, "bddate");
            return (Criteria) this;
        }

        public Criteria andBddateNotIn(List<BigDecimal> values) {
            addCriterion("bddate not in", values, "bddate");
            return (Criteria) this;
        }

        public Criteria andBddateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bddate between", value1, value2, "bddate");
            return (Criteria) this;
        }

        public Criteria andBddateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bddate not between", value1, value2, "bddate");
            return (Criteria) this;
        }

        public Criteria andSmallMoneyIsNull() {
            addCriterion("small_money is null");
            return (Criteria) this;
        }

        public Criteria andSmallMoneyIsNotNull() {
            addCriterion("small_money is not null");
            return (Criteria) this;
        }

        public Criteria andSmallMoneyEqualTo(BigDecimal value) {
            addCriterion("small_money =", value, "smallMoney");
            return (Criteria) this;
        }

        public Criteria andSmallMoneyNotEqualTo(BigDecimal value) {
            addCriterion("small_money <>", value, "smallMoney");
            return (Criteria) this;
        }

        public Criteria andSmallMoneyGreaterThan(BigDecimal value) {
            addCriterion("small_money >", value, "smallMoney");
            return (Criteria) this;
        }

        public Criteria andSmallMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("small_money >=", value, "smallMoney");
            return (Criteria) this;
        }

        public Criteria andSmallMoneyLessThan(BigDecimal value) {
            addCriterion("small_money <", value, "smallMoney");
            return (Criteria) this;
        }

        public Criteria andSmallMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("small_money <=", value, "smallMoney");
            return (Criteria) this;
        }

        public Criteria andSmallMoneyIn(List<BigDecimal> values) {
            addCriterion("small_money in", values, "smallMoney");
            return (Criteria) this;
        }

        public Criteria andSmallMoneyNotIn(List<BigDecimal> values) {
            addCriterion("small_money not in", values, "smallMoney");
            return (Criteria) this;
        }

        public Criteria andSmallMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("small_money between", value1, value2, "smallMoney");
            return (Criteria) this;
        }

        public Criteria andSmallMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("small_money not between", value1, value2, "smallMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyIsNull() {
            addCriterion("big_money is null");
            return (Criteria) this;
        }

        public Criteria andBigMoneyIsNotNull() {
            addCriterion("big_money is not null");
            return (Criteria) this;
        }

        public Criteria andBigMoneyEqualTo(BigDecimal value) {
            addCriterion("big_money =", value, "bigMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyNotEqualTo(BigDecimal value) {
            addCriterion("big_money <>", value, "bigMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyGreaterThan(BigDecimal value) {
            addCriterion("big_money >", value, "bigMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("big_money >=", value, "bigMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyLessThan(BigDecimal value) {
            addCriterion("big_money <", value, "bigMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("big_money <=", value, "bigMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyIn(List<BigDecimal> values) {
            addCriterion("big_money in", values, "bigMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyNotIn(List<BigDecimal> values) {
            addCriterion("big_money not in", values, "bigMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("big_money between", value1, value2, "bigMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("big_money not between", value1, value2, "bigMoney");
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