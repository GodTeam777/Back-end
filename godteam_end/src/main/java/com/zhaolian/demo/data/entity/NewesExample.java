package com.zhaolian.demo.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewesExample() {
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

        public Criteria andNidIsNull() {
            addCriterion("nid is null");
            return (Criteria) this;
        }

        public Criteria andNidIsNotNull() {
            addCriterion("nid is not null");
            return (Criteria) this;
        }

        public Criteria andNidEqualTo(BigDecimal value) {
            addCriterion("nid =", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotEqualTo(BigDecimal value) {
            addCriterion("nid <>", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThan(BigDecimal value) {
            addCriterion("nid >", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nid >=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThan(BigDecimal value) {
            addCriterion("nid <", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nid <=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidIn(List<BigDecimal> values) {
            addCriterion("nid in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotIn(List<BigDecimal> values) {
            addCriterion("nid not in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nid between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nid not between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNull() {
            addCriterion("news_title is null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNotNull() {
            addCriterion("news_title is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleEqualTo(String value) {
            addCriterion("news_title =", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotEqualTo(String value) {
            addCriterion("news_title <>", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThan(String value) {
            addCriterion("news_title >", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("news_title >=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThan(String value) {
            addCriterion("news_title <", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThanOrEqualTo(String value) {
            addCriterion("news_title <=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLike(String value) {
            addCriterion("news_title like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotLike(String value) {
            addCriterion("news_title not like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIn(List<String> values) {
            addCriterion("news_title in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotIn(List<String> values) {
            addCriterion("news_title not in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleBetween(String value1, String value2) {
            addCriterion("news_title between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotBetween(String value1, String value2) {
            addCriterion("news_title not between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsBodyIsNull() {
            addCriterion("news_body is null");
            return (Criteria) this;
        }

        public Criteria andNewsBodyIsNotNull() {
            addCriterion("news_body is not null");
            return (Criteria) this;
        }

        public Criteria andNewsBodyEqualTo(String value) {
            addCriterion("news_body =", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyNotEqualTo(String value) {
            addCriterion("news_body <>", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyGreaterThan(String value) {
            addCriterion("news_body >", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyGreaterThanOrEqualTo(String value) {
            addCriterion("news_body >=", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyLessThan(String value) {
            addCriterion("news_body <", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyLessThanOrEqualTo(String value) {
            addCriterion("news_body <=", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyLike(String value) {
            addCriterion("news_body like", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyNotLike(String value) {
            addCriterion("news_body not like", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyIn(List<String> values) {
            addCriterion("news_body in", values, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyNotIn(List<String> values) {
            addCriterion("news_body not in", values, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyBetween(String value1, String value2) {
            addCriterion("news_body between", value1, value2, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyNotBetween(String value1, String value2) {
            addCriterion("news_body not between", value1, value2, "newsBody");
            return (Criteria) this;
        }

        public Criteria andSmallImgIsNull() {
            addCriterion("small_img is null");
            return (Criteria) this;
        }

        public Criteria andSmallImgIsNotNull() {
            addCriterion("small_img is not null");
            return (Criteria) this;
        }

        public Criteria andSmallImgEqualTo(String value) {
            addCriterion("small_img =", value, "smallImg");
            return (Criteria) this;
        }

        public Criteria andSmallImgNotEqualTo(String value) {
            addCriterion("small_img <>", value, "smallImg");
            return (Criteria) this;
        }

        public Criteria andSmallImgGreaterThan(String value) {
            addCriterion("small_img >", value, "smallImg");
            return (Criteria) this;
        }

        public Criteria andSmallImgGreaterThanOrEqualTo(String value) {
            addCriterion("small_img >=", value, "smallImg");
            return (Criteria) this;
        }

        public Criteria andSmallImgLessThan(String value) {
            addCriterion("small_img <", value, "smallImg");
            return (Criteria) this;
        }

        public Criteria andSmallImgLessThanOrEqualTo(String value) {
            addCriterion("small_img <=", value, "smallImg");
            return (Criteria) this;
        }

        public Criteria andSmallImgLike(String value) {
            addCriterion("small_img like", value, "smallImg");
            return (Criteria) this;
        }

        public Criteria andSmallImgNotLike(String value) {
            addCriterion("small_img not like", value, "smallImg");
            return (Criteria) this;
        }

        public Criteria andSmallImgIn(List<String> values) {
            addCriterion("small_img in", values, "smallImg");
            return (Criteria) this;
        }

        public Criteria andSmallImgNotIn(List<String> values) {
            addCriterion("small_img not in", values, "smallImg");
            return (Criteria) this;
        }

        public Criteria andSmallImgBetween(String value1, String value2) {
            addCriterion("small_img between", value1, value2, "smallImg");
            return (Criteria) this;
        }

        public Criteria andSmallImgNotBetween(String value1, String value2) {
            addCriterion("small_img not between", value1, value2, "smallImg");
            return (Criteria) this;
        }

        public Criteria andBigImgIsNull() {
            addCriterion("big_img is null");
            return (Criteria) this;
        }

        public Criteria andBigImgIsNotNull() {
            addCriterion("big_img is not null");
            return (Criteria) this;
        }

        public Criteria andBigImgEqualTo(String value) {
            addCriterion("big_img =", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgNotEqualTo(String value) {
            addCriterion("big_img <>", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgGreaterThan(String value) {
            addCriterion("big_img >", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgGreaterThanOrEqualTo(String value) {
            addCriterion("big_img >=", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgLessThan(String value) {
            addCriterion("big_img <", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgLessThanOrEqualTo(String value) {
            addCriterion("big_img <=", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgLike(String value) {
            addCriterion("big_img like", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgNotLike(String value) {
            addCriterion("big_img not like", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgIn(List<String> values) {
            addCriterion("big_img in", values, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgNotIn(List<String> values) {
            addCriterion("big_img not in", values, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgBetween(String value1, String value2) {
            addCriterion("big_img between", value1, value2, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgNotBetween(String value1, String value2) {
            addCriterion("big_img not between", value1, value2, "bigImg");
            return (Criteria) this;
        }

        public Criteria andNewsDateIsNull() {
            addCriterion("news_date is null");
            return (Criteria) this;
        }

        public Criteria andNewsDateIsNotNull() {
            addCriterion("news_date is not null");
            return (Criteria) this;
        }

        public Criteria andNewsDateEqualTo(Date value) {
            addCriterion("news_date =", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateNotEqualTo(Date value) {
            addCriterion("news_date <>", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateGreaterThan(Date value) {
            addCriterion("news_date >", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("news_date >=", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateLessThan(Date value) {
            addCriterion("news_date <", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateLessThanOrEqualTo(Date value) {
            addCriterion("news_date <=", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateIn(List<Date> values) {
            addCriterion("news_date in", values, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateNotIn(List<Date> values) {
            addCriterion("news_date not in", values, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateBetween(Date value1, Date value2) {
            addCriterion("news_date between", value1, value2, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateNotBetween(Date value1, Date value2) {
            addCriterion("news_date not between", value1, value2, "newsDate");
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