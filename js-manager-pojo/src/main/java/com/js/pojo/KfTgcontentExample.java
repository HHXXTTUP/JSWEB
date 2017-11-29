package com.js.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KfTgcontentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KfTgcontentExample() {
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

        public Criteria andTgcontentNameIsNull() {
            addCriterion("tgcontentName is null");
            return (Criteria) this;
        }

        public Criteria andTgcontentNameIsNotNull() {
            addCriterion("tgcontentName is not null");
            return (Criteria) this;
        }

        public Criteria andTgcontentNameEqualTo(String value) {
            addCriterion("tgcontentName =", value, "tgcontentName");
            return (Criteria) this;
        }

        public Criteria andTgcontentNameNotEqualTo(String value) {
            addCriterion("tgcontentName <>", value, "tgcontentName");
            return (Criteria) this;
        }

        public Criteria andTgcontentNameGreaterThan(String value) {
            addCriterion("tgcontentName >", value, "tgcontentName");
            return (Criteria) this;
        }

        public Criteria andTgcontentNameGreaterThanOrEqualTo(String value) {
            addCriterion("tgcontentName >=", value, "tgcontentName");
            return (Criteria) this;
        }

        public Criteria andTgcontentNameLessThan(String value) {
            addCriterion("tgcontentName <", value, "tgcontentName");
            return (Criteria) this;
        }

        public Criteria andTgcontentNameLessThanOrEqualTo(String value) {
            addCriterion("tgcontentName <=", value, "tgcontentName");
            return (Criteria) this;
        }

        public Criteria andTgcontentNameLike(String value) {
            addCriterion("tgcontentName like", value, "tgcontentName");
            return (Criteria) this;
        }

        public Criteria andTgcontentNameNotLike(String value) {
            addCriterion("tgcontentName not like", value, "tgcontentName");
            return (Criteria) this;
        }

        public Criteria andTgcontentNameIn(List<String> values) {
            addCriterion("tgcontentName in", values, "tgcontentName");
            return (Criteria) this;
        }

        public Criteria andTgcontentNameNotIn(List<String> values) {
            addCriterion("tgcontentName not in", values, "tgcontentName");
            return (Criteria) this;
        }

        public Criteria andTgcontentNameBetween(String value1, String value2) {
            addCriterion("tgcontentName between", value1, value2, "tgcontentName");
            return (Criteria) this;
        }

        public Criteria andTgcontentNameNotBetween(String value1, String value2) {
            addCriterion("tgcontentName not between", value1, value2, "tgcontentName");
            return (Criteria) this;
        }

        public Criteria andCreatenameIsNull() {
            addCriterion("createname is null");
            return (Criteria) this;
        }

        public Criteria andCreatenameIsNotNull() {
            addCriterion("createname is not null");
            return (Criteria) this;
        }

        public Criteria andCreatenameEqualTo(String value) {
            addCriterion("createname =", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotEqualTo(String value) {
            addCriterion("createname <>", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameGreaterThan(String value) {
            addCriterion("createname >", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameGreaterThanOrEqualTo(String value) {
            addCriterion("createname >=", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLessThan(String value) {
            addCriterion("createname <", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLessThanOrEqualTo(String value) {
            addCriterion("createname <=", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLike(String value) {
            addCriterion("createname like", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotLike(String value) {
            addCriterion("createname not like", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameIn(List<String> values) {
            addCriterion("createname in", values, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotIn(List<String> values) {
            addCriterion("createname not in", values, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameBetween(String value1, String value2) {
            addCriterion("createname between", value1, value2, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotBetween(String value1, String value2) {
            addCriterion("createname not between", value1, value2, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatentimeIsNull() {
            addCriterion("createntime is null");
            return (Criteria) this;
        }

        public Criteria andCreatentimeIsNotNull() {
            addCriterion("createntime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatentimeEqualTo(Date value) {
            addCriterion("createntime =", value, "createntime");
            return (Criteria) this;
        }

        public Criteria andCreatentimeNotEqualTo(Date value) {
            addCriterion("createntime <>", value, "createntime");
            return (Criteria) this;
        }

        public Criteria andCreatentimeGreaterThan(Date value) {
            addCriterion("createntime >", value, "createntime");
            return (Criteria) this;
        }

        public Criteria andCreatentimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createntime >=", value, "createntime");
            return (Criteria) this;
        }

        public Criteria andCreatentimeLessThan(Date value) {
            addCriterion("createntime <", value, "createntime");
            return (Criteria) this;
        }

        public Criteria andCreatentimeLessThanOrEqualTo(Date value) {
            addCriterion("createntime <=", value, "createntime");
            return (Criteria) this;
        }

        public Criteria andCreatentimeIn(List<Date> values) {
            addCriterion("createntime in", values, "createntime");
            return (Criteria) this;
        }

        public Criteria andCreatentimeNotIn(List<Date> values) {
            addCriterion("createntime not in", values, "createntime");
            return (Criteria) this;
        }

        public Criteria andCreatentimeBetween(Date value1, Date value2) {
            addCriterion("createntime between", value1, value2, "createntime");
            return (Criteria) this;
        }

        public Criteria andCreatentimeNotBetween(Date value1, Date value2) {
            addCriterion("createntime not between", value1, value2, "createntime");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNull() {
            addCriterion("createuserid is null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNotNull() {
            addCriterion("createuserid is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridEqualTo(String value) {
            addCriterion("createuserid =", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotEqualTo(String value) {
            addCriterion("createuserid <>", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThan(String value) {
            addCriterion("createuserid >", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThanOrEqualTo(String value) {
            addCriterion("createuserid >=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThan(String value) {
            addCriterion("createuserid <", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThanOrEqualTo(String value) {
            addCriterion("createuserid <=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLike(String value) {
            addCriterion("createuserid like", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotLike(String value) {
            addCriterion("createuserid not like", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIn(List<String> values) {
            addCriterion("createuserid in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotIn(List<String> values) {
            addCriterion("createuserid not in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridBetween(String value1, String value2) {
            addCriterion("createuserid between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotBetween(String value1, String value2) {
            addCriterion("createuserid not between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreatememoIsNull() {
            addCriterion("creatememo is null");
            return (Criteria) this;
        }

        public Criteria andCreatememoIsNotNull() {
            addCriterion("creatememo is not null");
            return (Criteria) this;
        }

        public Criteria andCreatememoEqualTo(String value) {
            addCriterion("creatememo =", value, "creatememo");
            return (Criteria) this;
        }

        public Criteria andCreatememoNotEqualTo(String value) {
            addCriterion("creatememo <>", value, "creatememo");
            return (Criteria) this;
        }

        public Criteria andCreatememoGreaterThan(String value) {
            addCriterion("creatememo >", value, "creatememo");
            return (Criteria) this;
        }

        public Criteria andCreatememoGreaterThanOrEqualTo(String value) {
            addCriterion("creatememo >=", value, "creatememo");
            return (Criteria) this;
        }

        public Criteria andCreatememoLessThan(String value) {
            addCriterion("creatememo <", value, "creatememo");
            return (Criteria) this;
        }

        public Criteria andCreatememoLessThanOrEqualTo(String value) {
            addCriterion("creatememo <=", value, "creatememo");
            return (Criteria) this;
        }

        public Criteria andCreatememoLike(String value) {
            addCriterion("creatememo like", value, "creatememo");
            return (Criteria) this;
        }

        public Criteria andCreatememoNotLike(String value) {
            addCriterion("creatememo not like", value, "creatememo");
            return (Criteria) this;
        }

        public Criteria andCreatememoIn(List<String> values) {
            addCriterion("creatememo in", values, "creatememo");
            return (Criteria) this;
        }

        public Criteria andCreatememoNotIn(List<String> values) {
            addCriterion("creatememo not in", values, "creatememo");
            return (Criteria) this;
        }

        public Criteria andCreatememoBetween(String value1, String value2) {
            addCriterion("creatememo between", value1, value2, "creatememo");
            return (Criteria) this;
        }

        public Criteria andCreatememoNotBetween(String value1, String value2) {
            addCriterion("creatememo not between", value1, value2, "creatememo");
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