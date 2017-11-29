package com.js.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmUserroleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmUserroleExample() {
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

        public Criteria andRoleidIsNull() {
            addCriterion("roleid is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("roleid is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(Integer value) {
            addCriterion("roleid =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(Integer value) {
            addCriterion("roleid <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(Integer value) {
            addCriterion("roleid >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roleid >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(Integer value) {
            addCriterion("roleid <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(Integer value) {
            addCriterion("roleid <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<Integer> values) {
            addCriterion("roleid in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<Integer> values) {
            addCriterion("roleid not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(Integer value1, Integer value2) {
            addCriterion("roleid between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(Integer value1, Integer value2) {
            addCriterion("roleid not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andUserinfoidIsNull() {
            addCriterion("userinfoid is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoidIsNotNull() {
            addCriterion("userinfoid is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoidEqualTo(Integer value) {
            addCriterion("userinfoid =", value, "userinfoid");
            return (Criteria) this;
        }

        public Criteria andUserinfoidNotEqualTo(Integer value) {
            addCriterion("userinfoid <>", value, "userinfoid");
            return (Criteria) this;
        }

        public Criteria andUserinfoidGreaterThan(Integer value) {
            addCriterion("userinfoid >", value, "userinfoid");
            return (Criteria) this;
        }

        public Criteria andUserinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("userinfoid >=", value, "userinfoid");
            return (Criteria) this;
        }

        public Criteria andUserinfoidLessThan(Integer value) {
            addCriterion("userinfoid <", value, "userinfoid");
            return (Criteria) this;
        }

        public Criteria andUserinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("userinfoid <=", value, "userinfoid");
            return (Criteria) this;
        }

        public Criteria andUserinfoidIn(List<Integer> values) {
            addCriterion("userinfoid in", values, "userinfoid");
            return (Criteria) this;
        }

        public Criteria andUserinfoidNotIn(List<Integer> values) {
            addCriterion("userinfoid not in", values, "userinfoid");
            return (Criteria) this;
        }

        public Criteria andUserinfoidBetween(Integer value1, Integer value2) {
            addCriterion("userinfoid between", value1, value2, "userinfoid");
            return (Criteria) this;
        }

        public Criteria andUserinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("userinfoid not between", value1, value2, "userinfoid");
            return (Criteria) this;
        }

        public Criteria andAdduseridIsNull() {
            addCriterion("adduserid is null");
            return (Criteria) this;
        }

        public Criteria andAdduseridIsNotNull() {
            addCriterion("adduserid is not null");
            return (Criteria) this;
        }

        public Criteria andAdduseridEqualTo(Integer value) {
            addCriterion("adduserid =", value, "adduserid");
            return (Criteria) this;
        }

        public Criteria andAdduseridNotEqualTo(Integer value) {
            addCriterion("adduserid <>", value, "adduserid");
            return (Criteria) this;
        }

        public Criteria andAdduseridGreaterThan(Integer value) {
            addCriterion("adduserid >", value, "adduserid");
            return (Criteria) this;
        }

        public Criteria andAdduseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("adduserid >=", value, "adduserid");
            return (Criteria) this;
        }

        public Criteria andAdduseridLessThan(Integer value) {
            addCriterion("adduserid <", value, "adduserid");
            return (Criteria) this;
        }

        public Criteria andAdduseridLessThanOrEqualTo(Integer value) {
            addCriterion("adduserid <=", value, "adduserid");
            return (Criteria) this;
        }

        public Criteria andAdduseridIn(List<Integer> values) {
            addCriterion("adduserid in", values, "adduserid");
            return (Criteria) this;
        }

        public Criteria andAdduseridNotIn(List<Integer> values) {
            addCriterion("adduserid not in", values, "adduserid");
            return (Criteria) this;
        }

        public Criteria andAdduseridBetween(Integer value1, Integer value2) {
            addCriterion("adduserid between", value1, value2, "adduserid");
            return (Criteria) this;
        }

        public Criteria andAdduseridNotBetween(Integer value1, Integer value2) {
            addCriterion("adduserid not between", value1, value2, "adduserid");
            return (Criteria) this;
        }

        public Criteria andAddueserIsNull() {
            addCriterion("addueser is null");
            return (Criteria) this;
        }

        public Criteria andAddueserIsNotNull() {
            addCriterion("addueser is not null");
            return (Criteria) this;
        }

        public Criteria andAddueserEqualTo(String value) {
            addCriterion("addueser =", value, "addueser");
            return (Criteria) this;
        }

        public Criteria andAddueserNotEqualTo(String value) {
            addCriterion("addueser <>", value, "addueser");
            return (Criteria) this;
        }

        public Criteria andAddueserGreaterThan(String value) {
            addCriterion("addueser >", value, "addueser");
            return (Criteria) this;
        }

        public Criteria andAddueserGreaterThanOrEqualTo(String value) {
            addCriterion("addueser >=", value, "addueser");
            return (Criteria) this;
        }

        public Criteria andAddueserLessThan(String value) {
            addCriterion("addueser <", value, "addueser");
            return (Criteria) this;
        }

        public Criteria andAddueserLessThanOrEqualTo(String value) {
            addCriterion("addueser <=", value, "addueser");
            return (Criteria) this;
        }

        public Criteria andAddueserLike(String value) {
            addCriterion("addueser like", value, "addueser");
            return (Criteria) this;
        }

        public Criteria andAddueserNotLike(String value) {
            addCriterion("addueser not like", value, "addueser");
            return (Criteria) this;
        }

        public Criteria andAddueserIn(List<String> values) {
            addCriterion("addueser in", values, "addueser");
            return (Criteria) this;
        }

        public Criteria andAddueserNotIn(List<String> values) {
            addCriterion("addueser not in", values, "addueser");
            return (Criteria) this;
        }

        public Criteria andAddueserBetween(String value1, String value2) {
            addCriterion("addueser between", value1, value2, "addueser");
            return (Criteria) this;
        }

        public Criteria andAddueserNotBetween(String value1, String value2) {
            addCriterion("addueser not between", value1, value2, "addueser");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAdduserIPIsNull() {
            addCriterion("adduserIP is null");
            return (Criteria) this;
        }

        public Criteria andAdduserIPIsNotNull() {
            addCriterion("adduserIP is not null");
            return (Criteria) this;
        }

        public Criteria andAdduserIPEqualTo(String value) {
            addCriterion("adduserIP =", value, "adduserIP");
            return (Criteria) this;
        }

        public Criteria andAdduserIPNotEqualTo(String value) {
            addCriterion("adduserIP <>", value, "adduserIP");
            return (Criteria) this;
        }

        public Criteria andAdduserIPGreaterThan(String value) {
            addCriterion("adduserIP >", value, "adduserIP");
            return (Criteria) this;
        }

        public Criteria andAdduserIPGreaterThanOrEqualTo(String value) {
            addCriterion("adduserIP >=", value, "adduserIP");
            return (Criteria) this;
        }

        public Criteria andAdduserIPLessThan(String value) {
            addCriterion("adduserIP <", value, "adduserIP");
            return (Criteria) this;
        }

        public Criteria andAdduserIPLessThanOrEqualTo(String value) {
            addCriterion("adduserIP <=", value, "adduserIP");
            return (Criteria) this;
        }

        public Criteria andAdduserIPLike(String value) {
            addCriterion("adduserIP like", value, "adduserIP");
            return (Criteria) this;
        }

        public Criteria andAdduserIPNotLike(String value) {
            addCriterion("adduserIP not like", value, "adduserIP");
            return (Criteria) this;
        }

        public Criteria andAdduserIPIn(List<String> values) {
            addCriterion("adduserIP in", values, "adduserIP");
            return (Criteria) this;
        }

        public Criteria andAdduserIPNotIn(List<String> values) {
            addCriterion("adduserIP not in", values, "adduserIP");
            return (Criteria) this;
        }

        public Criteria andAdduserIPBetween(String value1, String value2) {
            addCriterion("adduserIP between", value1, value2, "adduserIP");
            return (Criteria) this;
        }

        public Criteria andAdduserIPNotBetween(String value1, String value2) {
            addCriterion("adduserIP not between", value1, value2, "adduserIP");
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