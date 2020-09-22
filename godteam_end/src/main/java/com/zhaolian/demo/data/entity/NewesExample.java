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
            addCriterion("NID is null");
            return (Criteria) this;
        }

        public Criteria andNidIsNotNull() {
            addCriterion("NID is not null");
            return (Criteria) this;
        }

        public Criteria andNidEqualTo(BigDecimal value) {
            addCriterion("NID =", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotEqualTo(BigDecimal value) {
            addCriterion("NID <>", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThan(BigDecimal value) {
            addCriterion("NID >", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NID >=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThan(BigDecimal value) {
            addCriterion("NID <", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NID <=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidIn(List<BigDecimal> values) {
            addCriterion("NID in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotIn(List<BigDecimal> values) {
            addCriterion("NID not in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NID between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NID not between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNull() {
            addCriterion("NEWS_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNotNull() {
            addCriterion("NEWS_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleEqualTo(String value) {
            addCriterion("NEWS_TITLE =", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotEqualTo(String value) {
            addCriterion("NEWS_TITLE <>", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThan(String value) {
            addCriterion("NEWS_TITLE >", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("NEWS_TITLE >=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThan(String value) {
            addCriterion("NEWS_TITLE <", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThanOrEqualTo(String value) {
            addCriterion("NEWS_TITLE <=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLike(String value) {
            addCriterion("NEWS_TITLE like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotLike(String value) {
            addCriterion("NEWS_TITLE not like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIn(List<String> values) {
            addCriterion("NEWS_TITLE in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotIn(List<String> values) {
            addCriterion("NEWS_TITLE not in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleBetween(String value1, String value2) {
            addCriterion("NEWS_TITLE between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotBetween(String value1, String value2) {
            addCriterion("NEWS_TITLE not between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsBodyIsNull() {
            addCriterion("NEWS_BODY is null");
            return (Criteria) this;
        }

        public Criteria andNewsBodyIsNotNull() {
            addCriterion("NEWS_BODY is not null");
            return (Criteria) this;
        }

        public Criteria andNewsBodyEqualTo(String value) {
            addCriterion("NEWS_BODY =", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyNotEqualTo(String value) {
            addCriterion("NEWS_BODY <>", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyGreaterThan(String value) {
            addCriterion("NEWS_BODY >", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyGreaterThanOrEqualTo(String value) {
            addCriterion("NEWS_BODY >=", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyLessThan(String value) {
            addCriterion("NEWS_BODY <", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyLessThanOrEqualTo(String value) {
            addCriterion("NEWS_BODY <=", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyLike(String value) {
            addCriterion("NEWS_BODY like", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyNotLike(String value) {
            addCriterion("NEWS_BODY not like", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyIn(List<String> values) {
            addCriterion("NEWS_BODY in", values, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyNotIn(List<String> values) {
            addCriterion("NEWS_BODY not in", values, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyBetween(String value1, String value2) {
            addCriterion("NEWS_BODY between", value1, value2, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyNotBetween(String value1, String value2) {
            addCriterion("NEWS_BODY not between", value1, value2, "newsBody");
            return (Criteria) this;
        }

        public Criteria andSmallImgIsNull() {
            addCriterion("SMALL_IMG is null");
            return (Criteria) this;
        }

        public Criteria andSmallImgIsNotNull() {
            addCriterion("SMALL_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andSmallImgEqualTo(String value) {
            addCriterion("SMALL_IMG =", value, "smallImg");
            return (Criteria) this;
        }

        public Criteria andSmallImgNotEqualTo(String value) {
            addCriterion("SMALL_IMG <>", value, "smallImg");
            return (Criteria) this;
        }

        public Criteria andSmallImgGreaterThan(String value) {
            addCriterion("SMALL_IMG >", value, "smallImg");
            return (Criteria) this;
        }

        public Criteria andSmallImgGreaterThanOrEqualTo(String value) {
            addCriterion("SMALL_IMG >=", value, "smallImg");
            return (Criteria) this;
        }

        public Criteria andSmallImgLessThan(String value) {
            addCriterion("SMALL_IMG <", value, "smallImg");
            return (Criteria) this;
        }

        public Criteria andSmallImgLessThanOrEqualTo(String value) {
            addCriterion("SMALL_IMG <=", value, "smallImg");
            return (Criteria) this;
        }

        public Criteria andSmallImgLike(String value) {
            addCriterion("SMALL_IMG like", value, "smallImg");
            return (Criteria) this;
        }

        public Criteria andSmallImgNotLike(String value) {
            addCriterion("SMALL_IMG not like", value, "smallImg");
            return (Criteria) this;
        }

        public Criteria andSmallImgIn(List<String> values) {
            addCriterion("SMALL_IMG in", values, "smallImg");
            return (Criteria) this;
        }

        public Criteria andSmallImgNotIn(List<String> values) {
            addCriterion("SMALL_IMG not in", values, "smallImg");
            return (Criteria) this;
        }

        public Criteria andSmallImgBetween(String value1, String value2) {
            addCriterion("SMALL_IMG between", value1, value2, "smallImg");
            return (Criteria) this;
        }

        public Criteria andSmallImgNotBetween(String value1, String value2) {
            addCriterion("SMALL_IMG not between", value1, value2, "smallImg");
            return (Criteria) this;
        }

        public Criteria andBigImgIsNull() {
            addCriterion("BIG_IMG is null");
            return (Criteria) this;
        }

        public Criteria andBigImgIsNotNull() {
            addCriterion("BIG_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andBigImgEqualTo(String value) {
            addCriterion("BIG_IMG =", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgNotEqualTo(String value) {
            addCriterion("BIG_IMG <>", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgGreaterThan(String value) {
            addCriterion("BIG_IMG >", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgGreaterThanOrEqualTo(String value) {
            addCriterion("BIG_IMG >=", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgLessThan(String value) {
            addCriterion("BIG_IMG <", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgLessThanOrEqualTo(String value) {
            addCriterion("BIG_IMG <=", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgLike(String value) {
            addCriterion("BIG_IMG like", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgNotLike(String value) {
            addCriterion("BIG_IMG not like", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgIn(List<String> values) {
            addCriterion("BIG_IMG in", values, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgNotIn(List<String> values) {
            addCriterion("BIG_IMG not in", values, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgBetween(String value1, String value2) {
            addCriterion("BIG_IMG between", value1, value2, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgNotBetween(String value1, String value2) {
            addCriterion("BIG_IMG not between", value1, value2, "bigImg");
            return (Criteria) this;
        }

        public Criteria andNewsDateIsNull() {
            addCriterion("NEWS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andNewsDateIsNotNull() {
            addCriterion("NEWS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andNewsDateEqualTo(Date value) {
            addCriterion("NEWS_DATE =", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateNotEqualTo(Date value) {
            addCriterion("NEWS_DATE <>", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateGreaterThan(Date value) {
            addCriterion("NEWS_DATE >", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("NEWS_DATE >=", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateLessThan(Date value) {
            addCriterion("NEWS_DATE <", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateLessThanOrEqualTo(Date value) {
            addCriterion("NEWS_DATE <=", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateIn(List<Date> values) {
            addCriterion("NEWS_DATE in", values, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateNotIn(List<Date> values) {
            addCriterion("NEWS_DATE not in", values, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateBetween(Date value1, Date value2) {
            addCriterion("NEWS_DATE between", value1, value2, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateNotBetween(Date value1, Date value2) {
            addCriterion("NEWS_DATE not between", value1, value2, "newsDate");
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