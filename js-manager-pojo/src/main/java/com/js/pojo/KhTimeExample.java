package com.js.pojo;

import java.util.ArrayList;
import java.util.List;

public class KhTimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KhTimeExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDatestrIsNull() {
            addCriterion("datestr is null");
            return (Criteria) this;
        }

        public Criteria andDatestrIsNotNull() {
            addCriterion("datestr is not null");
            return (Criteria) this;
        }

        public Criteria andDatestrEqualTo(String value) {
            addCriterion("datestr =", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrNotEqualTo(String value) {
            addCriterion("datestr <>", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrGreaterThan(String value) {
            addCriterion("datestr >", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrGreaterThanOrEqualTo(String value) {
            addCriterion("datestr >=", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrLessThan(String value) {
            addCriterion("datestr <", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrLessThanOrEqualTo(String value) {
            addCriterion("datestr <=", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrLike(String value) {
            addCriterion("datestr like", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrNotLike(String value) {
            addCriterion("datestr not like", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrIn(List<String> values) {
            addCriterion("datestr in", values, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrNotIn(List<String> values) {
            addCriterion("datestr not in", values, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrBetween(String value1, String value2) {
            addCriterion("datestr between", value1, value2, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrNotBetween(String value1, String value2) {
            addCriterion("datestr not between", value1, value2, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatesqlIsNull() {
            addCriterion("datesql is null");
            return (Criteria) this;
        }

        public Criteria andDatesqlIsNotNull() {
            addCriterion("datesql is not null");
            return (Criteria) this;
        }

        public Criteria andDatesqlEqualTo(String value) {
            addCriterion("datesql =", value, "datesql");
            return (Criteria) this;
        }

        public Criteria andDatesqlNotEqualTo(String value) {
            addCriterion("datesql <>", value, "datesql");
            return (Criteria) this;
        }

        public Criteria andDatesqlGreaterThan(String value) {
            addCriterion("datesql >", value, "datesql");
            return (Criteria) this;
        }

        public Criteria andDatesqlGreaterThanOrEqualTo(String value) {
            addCriterion("datesql >=", value, "datesql");
            return (Criteria) this;
        }

        public Criteria andDatesqlLessThan(String value) {
            addCriterion("datesql <", value, "datesql");
            return (Criteria) this;
        }

        public Criteria andDatesqlLessThanOrEqualTo(String value) {
            addCriterion("datesql <=", value, "datesql");
            return (Criteria) this;
        }

        public Criteria andDatesqlLike(String value) {
            addCriterion("datesql like", value, "datesql");
            return (Criteria) this;
        }

        public Criteria andDatesqlNotLike(String value) {
            addCriterion("datesql not like", value, "datesql");
            return (Criteria) this;
        }

        public Criteria andDatesqlIn(List<String> values) {
            addCriterion("datesql in", values, "datesql");
            return (Criteria) this;
        }

        public Criteria andDatesqlNotIn(List<String> values) {
            addCriterion("datesql not in", values, "datesql");
            return (Criteria) this;
        }

        public Criteria andDatesqlBetween(String value1, String value2) {
            addCriterion("datesql between", value1, value2, "datesql");
            return (Criteria) this;
        }

        public Criteria andDatesqlNotBetween(String value1, String value2) {
            addCriterion("datesql not between", value1, value2, "datesql");
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