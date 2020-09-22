package com.zhaolian.demo.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MoneyproExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MoneyproExample() {
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

        public Criteria andMpidIsNull() {
            addCriterion("mpid is null");
            return (Criteria) this;
        }

        public Criteria andMpidIsNotNull() {
            addCriterion("mpid is not null");
            return (Criteria) this;
        }

        public Criteria andMpidEqualTo(BigDecimal value) {
            addCriterion("mpid =", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidNotEqualTo(BigDecimal value) {
            addCriterion("mpid <>", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidGreaterThan(BigDecimal value) {
            addCriterion("mpid >", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mpid >=", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidLessThan(BigDecimal value) {
            addCriterion("mpid <", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mpid <=", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidIn(List<BigDecimal> values) {
            addCriterion("mpid in", values, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidNotIn(List<BigDecimal> values) {
            addCriterion("mpid not in", values, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mpid between", value1, value2, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mpid not between", value1, value2, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpnameIsNull() {
            addCriterion("mpname is null");
            return (Criteria) this;
        }

        public Criteria andMpnameIsNotNull() {
            addCriterion("mpname is not null");
            return (Criteria) this;
        }

        public Criteria andMpnameEqualTo(String value) {
            addCriterion("mpname =", value, "mpname");
            return (Criteria) this;
        }

        public Criteria andMpnameNotEqualTo(String value) {
            addCriterion("mpname <>", value, "mpname");
            return (Criteria) this;
        }

        public Criteria andMpnameGreaterThan(String value) {
            addCriterion("mpname >", value, "mpname");
            return (Criteria) this;
        }

        public Criteria andMpnameGreaterThanOrEqualTo(String value) {
            addCriterion("mpname >=", value, "mpname");
            return (Criteria) this;
        }

        public Criteria andMpnameLessThan(String value) {
            addCriterion("mpname <", value, "mpname");
            return (Criteria) this;
        }

        public Criteria andMpnameLessThanOrEqualTo(String value) {
            addCriterion("mpname <=", value, "mpname");
            return (Criteria) this;
        }

        public Criteria andMpnameLike(String value) {
            addCriterion("mpname like", value, "mpname");
            return (Criteria) this;
        }

        public Criteria andMpnameNotLike(String value) {
            addCriterion("mpname not like", value, "mpname");
            return (Criteria) this;
        }

        public Criteria andMpnameIn(List<String> values) {
            addCriterion("mpname in", values, "mpname");
            return (Criteria) this;
        }

        public Criteria andMpnameNotIn(List<String> values) {
            addCriterion("mpname not in", values, "mpname");
            return (Criteria) this;
        }

        public Criteria andMpnameBetween(String value1, String value2) {
            addCriterion("mpname between", value1, value2, "mpname");
            return (Criteria) this;
        }

        public Criteria andMpnameNotBetween(String value1, String value2) {
            addCriterion("mpname not between", value1, value2, "mpname");
            return (Criteria) this;
        }

        public Criteria andMptypeIsNull() {
            addCriterion("mptype is null");
            return (Criteria) this;
        }

        public Criteria andMptypeIsNotNull() {
            addCriterion("mptype is not null");
            return (Criteria) this;
        }

        public Criteria andMptypeEqualTo(String value) {
            addCriterion("mptype =", value, "mptype");
            return (Criteria) this;
        }

        public Criteria andMptypeNotEqualTo(String value) {
            addCriterion("mptype <>", value, "mptype");
            return (Criteria) this;
        }

        public Criteria andMptypeGreaterThan(String value) {
            addCriterion("mptype >", value, "mptype");
            return (Criteria) this;
        }

        public Criteria andMptypeGreaterThanOrEqualTo(String value) {
            addCriterion("mptype >=", value, "mptype");
            return (Criteria) this;
        }

        public Criteria andMptypeLessThan(String value) {
            addCriterion("mptype <", value, "mptype");
            return (Criteria) this;
        }

        public Criteria andMptypeLessThanOrEqualTo(String value) {
            addCriterion("mptype <=", value, "mptype");
            return (Criteria) this;
        }

        public Criteria andMptypeLike(String value) {
            addCriterion("mptype like", value, "mptype");
            return (Criteria) this;
        }

        public Criteria andMptypeNotLike(String value) {
            addCriterion("mptype not like", value, "mptype");
            return (Criteria) this;
        }

        public Criteria andMptypeIn(List<String> values) {
            addCriterion("mptype in", values, "mptype");
            return (Criteria) this;
        }

        public Criteria andMptypeNotIn(List<String> values) {
            addCriterion("mptype not in", values, "mptype");
            return (Criteria) this;
        }

        public Criteria andMptypeBetween(String value1, String value2) {
            addCriterion("mptype between", value1, value2, "mptype");
            return (Criteria) this;
        }

        public Criteria andMptypeNotBetween(String value1, String value2) {
            addCriterion("mptype not between", value1, value2, "mptype");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNull() {
            addCriterion("income is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("income is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(BigDecimal value) {
            addCriterion("income =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(BigDecimal value) {
            addCriterion("income <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(BigDecimal value) {
            addCriterion("income >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("income >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(BigDecimal value) {
            addCriterion("income <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("income <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<BigDecimal> values) {
            addCriterion("income in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<BigDecimal> values) {
            addCriterion("income not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("income between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("income not between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andMppathIsNull() {
            addCriterion("mppath is null");
            return (Criteria) this;
        }

        public Criteria andMppathIsNotNull() {
            addCriterion("mppath is not null");
            return (Criteria) this;
        }

        public Criteria andMppathEqualTo(String value) {
            addCriterion("mppath =", value, "mppath");
            return (Criteria) this;
        }

        public Criteria andMppathNotEqualTo(String value) {
            addCriterion("mppath <>", value, "mppath");
            return (Criteria) this;
        }

        public Criteria andMppathGreaterThan(String value) {
            addCriterion("mppath >", value, "mppath");
            return (Criteria) this;
        }

        public Criteria andMppathGreaterThanOrEqualTo(String value) {
            addCriterion("mppath >=", value, "mppath");
            return (Criteria) this;
        }

        public Criteria andMppathLessThan(String value) {
            addCriterion("mppath <", value, "mppath");
            return (Criteria) this;
        }

        public Criteria andMppathLessThanOrEqualTo(String value) {
            addCriterion("mppath <=", value, "mppath");
            return (Criteria) this;
        }

        public Criteria andMppathLike(String value) {
            addCriterion("mppath like", value, "mppath");
            return (Criteria) this;
        }

        public Criteria andMppathNotLike(String value) {
            addCriterion("mppath not like", value, "mppath");
            return (Criteria) this;
        }

        public Criteria andMppathIn(List<String> values) {
            addCriterion("mppath in", values, "mppath");
            return (Criteria) this;
        }

        public Criteria andMppathNotIn(List<String> values) {
            addCriterion("mppath not in", values, "mppath");
            return (Criteria) this;
        }

        public Criteria andMppathBetween(String value1, String value2) {
            addCriterion("mppath between", value1, value2, "mppath");
            return (Criteria) this;
        }

        public Criteria andMppathNotBetween(String value1, String value2) {
            addCriterion("mppath not between", value1, value2, "mppath");
            return (Criteria) this;
        }

        public Criteria andMpTitleIsNull() {
            addCriterion("mp_title is null");
            return (Criteria) this;
        }

        public Criteria andMpTitleIsNotNull() {
            addCriterion("mp_title is not null");
            return (Criteria) this;
        }

        public Criteria andMpTitleEqualTo(String value) {
            addCriterion("mp_title =", value, "mpTitle");
            return (Criteria) this;
        }

        public Criteria andMpTitleNotEqualTo(String value) {
            addCriterion("mp_title <>", value, "mpTitle");
            return (Criteria) this;
        }

        public Criteria andMpTitleGreaterThan(String value) {
            addCriterion("mp_title >", value, "mpTitle");
            return (Criteria) this;
        }

        public Criteria andMpTitleGreaterThanOrEqualTo(String value) {
            addCriterion("mp_title >=", value, "mpTitle");
            return (Criteria) this;
        }

        public Criteria andMpTitleLessThan(String value) {
            addCriterion("mp_title <", value, "mpTitle");
            return (Criteria) this;
        }

        public Criteria andMpTitleLessThanOrEqualTo(String value) {
            addCriterion("mp_title <=", value, "mpTitle");
            return (Criteria) this;
        }

        public Criteria andMpTitleLike(String value) {
            addCriterion("mp_title like", value, "mpTitle");
            return (Criteria) this;
        }

        public Criteria andMpTitleNotLike(String value) {
            addCriterion("mp_title not like", value, "mpTitle");
            return (Criteria) this;
        }

        public Criteria andMpTitleIn(List<String> values) {
            addCriterion("mp_title in", values, "mpTitle");
            return (Criteria) this;
        }

        public Criteria andMpTitleNotIn(List<String> values) {
            addCriterion("mp_title not in", values, "mpTitle");
            return (Criteria) this;
        }

        public Criteria andMpTitleBetween(String value1, String value2) {
            addCriterion("mp_title between", value1, value2, "mpTitle");
            return (Criteria) this;
        }

        public Criteria andMpTitleNotBetween(String value1, String value2) {
            addCriterion("mp_title not between", value1, value2, "mpTitle");
            return (Criteria) this;
        }

        public Criteria andMpBodyIsNull() {
            addCriterion("mp_body is null");
            return (Criteria) this;
        }

        public Criteria andMpBodyIsNotNull() {
            addCriterion("mp_body is not null");
            return (Criteria) this;
        }

        public Criteria andMpBodyEqualTo(String value) {
            addCriterion("mp_body =", value, "mpBody");
            return (Criteria) this;
        }

        public Criteria andMpBodyNotEqualTo(String value) {
            addCriterion("mp_body <>", value, "mpBody");
            return (Criteria) this;
        }

        public Criteria andMpBodyGreaterThan(String value) {
            addCriterion("mp_body >", value, "mpBody");
            return (Criteria) this;
        }

        public Criteria andMpBodyGreaterThanOrEqualTo(String value) {
            addCriterion("mp_body >=", value, "mpBody");
            return (Criteria) this;
        }

        public Criteria andMpBodyLessThan(String value) {
            addCriterion("mp_body <", value, "mpBody");
            return (Criteria) this;
        }

        public Criteria andMpBodyLessThanOrEqualTo(String value) {
            addCriterion("mp_body <=", value, "mpBody");
            return (Criteria) this;
        }

        public Criteria andMpBodyLike(String value) {
            addCriterion("mp_body like", value, "mpBody");
            return (Criteria) this;
        }

        public Criteria andMpBodyNotLike(String value) {
            addCriterion("mp_body not like", value, "mpBody");
            return (Criteria) this;
        }

        public Criteria andMpBodyIn(List<String> values) {
            addCriterion("mp_body in", values, "mpBody");
            return (Criteria) this;
        }

        public Criteria andMpBodyNotIn(List<String> values) {
            addCriterion("mp_body not in", values, "mpBody");
            return (Criteria) this;
        }

        public Criteria andMpBodyBetween(String value1, String value2) {
            addCriterion("mp_body between", value1, value2, "mpBody");
            return (Criteria) this;
        }

        public Criteria andMpBodyNotBetween(String value1, String value2) {
            addCriterion("mp_body not between", value1, value2, "mpBody");
            return (Criteria) this;
        }

        public Criteria andZhouqiIsNull() {
            addCriterion("zhouqi is null");
            return (Criteria) this;
        }

        public Criteria andZhouqiIsNotNull() {
            addCriterion("zhouqi is not null");
            return (Criteria) this;
        }

        public Criteria andZhouqiEqualTo(BigDecimal value) {
            addCriterion("zhouqi =", value, "zhouqi");
            return (Criteria) this;
        }

        public Criteria andZhouqiNotEqualTo(BigDecimal value) {
            addCriterion("zhouqi <>", value, "zhouqi");
            return (Criteria) this;
        }

        public Criteria andZhouqiGreaterThan(BigDecimal value) {
            addCriterion("zhouqi >", value, "zhouqi");
            return (Criteria) this;
        }

        public Criteria andZhouqiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("zhouqi >=", value, "zhouqi");
            return (Criteria) this;
        }

        public Criteria andZhouqiLessThan(BigDecimal value) {
            addCriterion("zhouqi <", value, "zhouqi");
            return (Criteria) this;
        }

        public Criteria andZhouqiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("zhouqi <=", value, "zhouqi");
            return (Criteria) this;
        }

        public Criteria andZhouqiIn(List<BigDecimal> values) {
            addCriterion("zhouqi in", values, "zhouqi");
            return (Criteria) this;
        }

        public Criteria andZhouqiNotIn(List<BigDecimal> values) {
            addCriterion("zhouqi not in", values, "zhouqi");
            return (Criteria) this;
        }

        public Criteria andZhouqiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zhouqi between", value1, value2, "zhouqi");
            return (Criteria) this;
        }

        public Criteria andZhouqiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zhouqi not between", value1, value2, "zhouqi");
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