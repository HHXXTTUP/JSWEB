package com.js.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KfCorpfpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KfCorpfpExample() {
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

        public Criteria andCreatemanIsNull() {
            addCriterion("createman is null");
            return (Criteria) this;
        }

        public Criteria andCreatemanIsNotNull() {
            addCriterion("createman is not null");
            return (Criteria) this;
        }

        public Criteria andCreatemanEqualTo(String value) {
            addCriterion("createman =", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanNotEqualTo(String value) {
            addCriterion("createman <>", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanGreaterThan(String value) {
            addCriterion("createman >", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanGreaterThanOrEqualTo(String value) {
            addCriterion("createman >=", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanLessThan(String value) {
            addCriterion("createman <", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanLessThanOrEqualTo(String value) {
            addCriterion("createman <=", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanLike(String value) {
            addCriterion("createman like", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanNotLike(String value) {
            addCriterion("createman not like", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanIn(List<String> values) {
            addCriterion("createman in", values, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanNotIn(List<String> values) {
            addCriterion("createman not in", values, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanBetween(String value1, String value2) {
            addCriterion("createman between", value1, value2, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanNotBetween(String value1, String value2) {
            addCriterion("createman not between", value1, value2, "createman");
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

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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

        public Criteria andAllotidIsNull() {
            addCriterion("allotid is null");
            return (Criteria) this;
        }

        public Criteria andAllotidIsNotNull() {
            addCriterion("allotid is not null");
            return (Criteria) this;
        }

        public Criteria andAllotidEqualTo(Integer value) {
            addCriterion("allotid =", value, "allotid");
            return (Criteria) this;
        }

        public Criteria andAllotidNotEqualTo(Integer value) {
            addCriterion("allotid <>", value, "allotid");
            return (Criteria) this;
        }

        public Criteria andAllotidGreaterThan(Integer value) {
            addCriterion("allotid >", value, "allotid");
            return (Criteria) this;
        }

        public Criteria andAllotidGreaterThanOrEqualTo(Integer value) {
            addCriterion("allotid >=", value, "allotid");
            return (Criteria) this;
        }

        public Criteria andAllotidLessThan(Integer value) {
            addCriterion("allotid <", value, "allotid");
            return (Criteria) this;
        }

        public Criteria andAllotidLessThanOrEqualTo(Integer value) {
            addCriterion("allotid <=", value, "allotid");
            return (Criteria) this;
        }

        public Criteria andAllotidIn(List<Integer> values) {
            addCriterion("allotid in", values, "allotid");
            return (Criteria) this;
        }

        public Criteria andAllotidNotIn(List<Integer> values) {
            addCriterion("allotid not in", values, "allotid");
            return (Criteria) this;
        }

        public Criteria andAllotidBetween(Integer value1, Integer value2) {
            addCriterion("allotid between", value1, value2, "allotid");
            return (Criteria) this;
        }

        public Criteria andAllotidNotBetween(Integer value1, Integer value2) {
            addCriterion("allotid not between", value1, value2, "allotid");
            return (Criteria) this;
        }

        public Criteria andCropidIsNull() {
            addCriterion("cropid is null");
            return (Criteria) this;
        }

        public Criteria andCropidIsNotNull() {
            addCriterion("cropid is not null");
            return (Criteria) this;
        }

        public Criteria andCropidEqualTo(Integer value) {
            addCriterion("cropid =", value, "cropid");
            return (Criteria) this;
        }

        public Criteria andCropidNotEqualTo(Integer value) {
            addCriterion("cropid <>", value, "cropid");
            return (Criteria) this;
        }

        public Criteria andCropidGreaterThan(Integer value) {
            addCriterion("cropid >", value, "cropid");
            return (Criteria) this;
        }

        public Criteria andCropidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cropid >=", value, "cropid");
            return (Criteria) this;
        }

        public Criteria andCropidLessThan(Integer value) {
            addCriterion("cropid <", value, "cropid");
            return (Criteria) this;
        }

        public Criteria andCropidLessThanOrEqualTo(Integer value) {
            addCriterion("cropid <=", value, "cropid");
            return (Criteria) this;
        }

        public Criteria andCropidIn(List<Integer> values) {
            addCriterion("cropid in", values, "cropid");
            return (Criteria) this;
        }

        public Criteria andCropidNotIn(List<Integer> values) {
            addCriterion("cropid not in", values, "cropid");
            return (Criteria) this;
        }

        public Criteria andCropidBetween(Integer value1, Integer value2) {
            addCriterion("cropid between", value1, value2, "cropid");
            return (Criteria) this;
        }

        public Criteria andCropidNotBetween(Integer value1, Integer value2) {
            addCriterion("cropid not between", value1, value2, "cropid");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNull() {
            addCriterion("groupid is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("groupid is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(Integer value) {
            addCriterion("groupid =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(Integer value) {
            addCriterion("groupid <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(Integer value) {
            addCriterion("groupid >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("groupid >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(Integer value) {
            addCriterion("groupid <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(Integer value) {
            addCriterion("groupid <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<Integer> values) {
            addCriterion("groupid in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<Integer> values) {
            addCriterion("groupid not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(Integer value1, Integer value2) {
            addCriterion("groupid between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("groupid not between", value1, value2, "groupid");
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