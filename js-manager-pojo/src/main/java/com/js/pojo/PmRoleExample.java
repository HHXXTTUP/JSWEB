package com.js.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmRoleExample() {
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

        public Criteria andRoleNameIsNull() {
            addCriterion("roleName is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("roleName is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("roleName =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("roleName <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("roleName >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("roleName >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("roleName <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("roleName <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("roleName like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("roleName not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("roleName in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("roleName not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("roleName between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("roleName not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleleadIsNull() {
            addCriterion("rolelead is null");
            return (Criteria) this;
        }

        public Criteria andRoleleadIsNotNull() {
            addCriterion("rolelead is not null");
            return (Criteria) this;
        }

        public Criteria andRoleleadEqualTo(Integer value) {
            addCriterion("rolelead =", value, "rolelead");
            return (Criteria) this;
        }

        public Criteria andRoleleadNotEqualTo(Integer value) {
            addCriterion("rolelead <>", value, "rolelead");
            return (Criteria) this;
        }

        public Criteria andRoleleadGreaterThan(Integer value) {
            addCriterion("rolelead >", value, "rolelead");
            return (Criteria) this;
        }

        public Criteria andRoleleadGreaterThanOrEqualTo(Integer value) {
            addCriterion("rolelead >=", value, "rolelead");
            return (Criteria) this;
        }

        public Criteria andRoleleadLessThan(Integer value) {
            addCriterion("rolelead <", value, "rolelead");
            return (Criteria) this;
        }

        public Criteria andRoleleadLessThanOrEqualTo(Integer value) {
            addCriterion("rolelead <=", value, "rolelead");
            return (Criteria) this;
        }

        public Criteria andRoleleadIn(List<Integer> values) {
            addCriterion("rolelead in", values, "rolelead");
            return (Criteria) this;
        }

        public Criteria andRoleleadNotIn(List<Integer> values) {
            addCriterion("rolelead not in", values, "rolelead");
            return (Criteria) this;
        }

        public Criteria andRoleleadBetween(Integer value1, Integer value2) {
            addCriterion("rolelead between", value1, value2, "rolelead");
            return (Criteria) this;
        }

        public Criteria andRoleleadNotBetween(Integer value1, Integer value2) {
            addCriterion("rolelead not between", value1, value2, "rolelead");
            return (Criteria) this;
        }

        public Criteria andRolelevelIsNull() {
            addCriterion("rolelevel is null");
            return (Criteria) this;
        }

        public Criteria andRolelevelIsNotNull() {
            addCriterion("rolelevel is not null");
            return (Criteria) this;
        }

        public Criteria andRolelevelEqualTo(Integer value) {
            addCriterion("rolelevel =", value, "rolelevel");
            return (Criteria) this;
        }

        public Criteria andRolelevelNotEqualTo(Integer value) {
            addCriterion("rolelevel <>", value, "rolelevel");
            return (Criteria) this;
        }

        public Criteria andRolelevelGreaterThan(Integer value) {
            addCriterion("rolelevel >", value, "rolelevel");
            return (Criteria) this;
        }

        public Criteria andRolelevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("rolelevel >=", value, "rolelevel");
            return (Criteria) this;
        }

        public Criteria andRolelevelLessThan(Integer value) {
            addCriterion("rolelevel <", value, "rolelevel");
            return (Criteria) this;
        }

        public Criteria andRolelevelLessThanOrEqualTo(Integer value) {
            addCriterion("rolelevel <=", value, "rolelevel");
            return (Criteria) this;
        }

        public Criteria andRolelevelIn(List<Integer> values) {
            addCriterion("rolelevel in", values, "rolelevel");
            return (Criteria) this;
        }

        public Criteria andRolelevelNotIn(List<Integer> values) {
            addCriterion("rolelevel not in", values, "rolelevel");
            return (Criteria) this;
        }

        public Criteria andRolelevelBetween(Integer value1, Integer value2) {
            addCriterion("rolelevel between", value1, value2, "rolelevel");
            return (Criteria) this;
        }

        public Criteria andRolelevelNotBetween(Integer value1, Integer value2) {
            addCriterion("rolelevel not between", value1, value2, "rolelevel");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIsNull() {
            addCriterion("IsEnabled is null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIsNotNull() {
            addCriterion("IsEnabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledEqualTo(Integer value) {
            addCriterion("IsEnabled =", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotEqualTo(Integer value) {
            addCriterion("IsEnabled <>", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThan(Integer value) {
            addCriterion("IsEnabled >", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsEnabled >=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThan(Integer value) {
            addCriterion("IsEnabled <", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThanOrEqualTo(Integer value) {
            addCriterion("IsEnabled <=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIn(List<Integer> values) {
            addCriterion("IsEnabled in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotIn(List<Integer> values) {
            addCriterion("IsEnabled not in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledBetween(Integer value1, Integer value2) {
            addCriterion("IsEnabled between", value1, value2, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotBetween(Integer value1, Integer value2) {
            addCriterion("IsEnabled not between", value1, value2, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andHtOperNameIsNull() {
            addCriterion("HtOperName is null");
            return (Criteria) this;
        }

        public Criteria andHtOperNameIsNotNull() {
            addCriterion("HtOperName is not null");
            return (Criteria) this;
        }

        public Criteria andHtOperNameEqualTo(String value) {
            addCriterion("HtOperName =", value, "htOperName");
            return (Criteria) this;
        }

        public Criteria andHtOperNameNotEqualTo(String value) {
            addCriterion("HtOperName <>", value, "htOperName");
            return (Criteria) this;
        }

        public Criteria andHtOperNameGreaterThan(String value) {
            addCriterion("HtOperName >", value, "htOperName");
            return (Criteria) this;
        }

        public Criteria andHtOperNameGreaterThanOrEqualTo(String value) {
            addCriterion("HtOperName >=", value, "htOperName");
            return (Criteria) this;
        }

        public Criteria andHtOperNameLessThan(String value) {
            addCriterion("HtOperName <", value, "htOperName");
            return (Criteria) this;
        }

        public Criteria andHtOperNameLessThanOrEqualTo(String value) {
            addCriterion("HtOperName <=", value, "htOperName");
            return (Criteria) this;
        }

        public Criteria andHtOperNameLike(String value) {
            addCriterion("HtOperName like", value, "htOperName");
            return (Criteria) this;
        }

        public Criteria andHtOperNameNotLike(String value) {
            addCriterion("HtOperName not like", value, "htOperName");
            return (Criteria) this;
        }

        public Criteria andHtOperNameIn(List<String> values) {
            addCriterion("HtOperName in", values, "htOperName");
            return (Criteria) this;
        }

        public Criteria andHtOperNameNotIn(List<String> values) {
            addCriterion("HtOperName not in", values, "htOperName");
            return (Criteria) this;
        }

        public Criteria andHtOperNameBetween(String value1, String value2) {
            addCriterion("HtOperName between", value1, value2, "htOperName");
            return (Criteria) this;
        }

        public Criteria andHtOperNameNotBetween(String value1, String value2) {
            addCriterion("HtOperName not between", value1, value2, "htOperName");
            return (Criteria) this;
        }

        public Criteria andHtOperDateIsNull() {
            addCriterion("HtOperDate is null");
            return (Criteria) this;
        }

        public Criteria andHtOperDateIsNotNull() {
            addCriterion("HtOperDate is not null");
            return (Criteria) this;
        }

        public Criteria andHtOperDateEqualTo(Date value) {
            addCriterion("HtOperDate =", value, "htOperDate");
            return (Criteria) this;
        }

        public Criteria andHtOperDateNotEqualTo(Date value) {
            addCriterion("HtOperDate <>", value, "htOperDate");
            return (Criteria) this;
        }

        public Criteria andHtOperDateGreaterThan(Date value) {
            addCriterion("HtOperDate >", value, "htOperDate");
            return (Criteria) this;
        }

        public Criteria andHtOperDateGreaterThanOrEqualTo(Date value) {
            addCriterion("HtOperDate >=", value, "htOperDate");
            return (Criteria) this;
        }

        public Criteria andHtOperDateLessThan(Date value) {
            addCriterion("HtOperDate <", value, "htOperDate");
            return (Criteria) this;
        }

        public Criteria andHtOperDateLessThanOrEqualTo(Date value) {
            addCriterion("HtOperDate <=", value, "htOperDate");
            return (Criteria) this;
        }

        public Criteria andHtOperDateIn(List<Date> values) {
            addCriterion("HtOperDate in", values, "htOperDate");
            return (Criteria) this;
        }

        public Criteria andHtOperDateNotIn(List<Date> values) {
            addCriterion("HtOperDate not in", values, "htOperDate");
            return (Criteria) this;
        }

        public Criteria andHtOperDateBetween(Date value1, Date value2) {
            addCriterion("HtOperDate between", value1, value2, "htOperDate");
            return (Criteria) this;
        }

        public Criteria andHtOperDateNotBetween(Date value1, Date value2) {
            addCriterion("HtOperDate not between", value1, value2, "htOperDate");
            return (Criteria) this;
        }

        public Criteria andHtOperStateIsNull() {
            addCriterion("HtOperState is null");
            return (Criteria) this;
        }

        public Criteria andHtOperStateIsNotNull() {
            addCriterion("HtOperState is not null");
            return (Criteria) this;
        }

        public Criteria andHtOperStateEqualTo(Integer value) {
            addCriterion("HtOperState =", value, "htOperState");
            return (Criteria) this;
        }

        public Criteria andHtOperStateNotEqualTo(Integer value) {
            addCriterion("HtOperState <>", value, "htOperState");
            return (Criteria) this;
        }

        public Criteria andHtOperStateGreaterThan(Integer value) {
            addCriterion("HtOperState >", value, "htOperState");
            return (Criteria) this;
        }

        public Criteria andHtOperStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("HtOperState >=", value, "htOperState");
            return (Criteria) this;
        }

        public Criteria andHtOperStateLessThan(Integer value) {
            addCriterion("HtOperState <", value, "htOperState");
            return (Criteria) this;
        }

        public Criteria andHtOperStateLessThanOrEqualTo(Integer value) {
            addCriterion("HtOperState <=", value, "htOperState");
            return (Criteria) this;
        }

        public Criteria andHtOperStateIn(List<Integer> values) {
            addCriterion("HtOperState in", values, "htOperState");
            return (Criteria) this;
        }

        public Criteria andHtOperStateNotIn(List<Integer> values) {
            addCriterion("HtOperState not in", values, "htOperState");
            return (Criteria) this;
        }

        public Criteria andHtOperStateBetween(Integer value1, Integer value2) {
            addCriterion("HtOperState between", value1, value2, "htOperState");
            return (Criteria) this;
        }

        public Criteria andHtOperStateNotBetween(Integer value1, Integer value2) {
            addCriterion("HtOperState not between", value1, value2, "htOperState");
            return (Criteria) this;
        }

        public Criteria andHtOperMemoIsNull() {
            addCriterion("HtOperMemo is null");
            return (Criteria) this;
        }

        public Criteria andHtOperMemoIsNotNull() {
            addCriterion("HtOperMemo is not null");
            return (Criteria) this;
        }

        public Criteria andHtOperMemoEqualTo(String value) {
            addCriterion("HtOperMemo =", value, "htOperMemo");
            return (Criteria) this;
        }

        public Criteria andHtOperMemoNotEqualTo(String value) {
            addCriterion("HtOperMemo <>", value, "htOperMemo");
            return (Criteria) this;
        }

        public Criteria andHtOperMemoGreaterThan(String value) {
            addCriterion("HtOperMemo >", value, "htOperMemo");
            return (Criteria) this;
        }

        public Criteria andHtOperMemoGreaterThanOrEqualTo(String value) {
            addCriterion("HtOperMemo >=", value, "htOperMemo");
            return (Criteria) this;
        }

        public Criteria andHtOperMemoLessThan(String value) {
            addCriterion("HtOperMemo <", value, "htOperMemo");
            return (Criteria) this;
        }

        public Criteria andHtOperMemoLessThanOrEqualTo(String value) {
            addCriterion("HtOperMemo <=", value, "htOperMemo");
            return (Criteria) this;
        }

        public Criteria andHtOperMemoLike(String value) {
            addCriterion("HtOperMemo like", value, "htOperMemo");
            return (Criteria) this;
        }

        public Criteria andHtOperMemoNotLike(String value) {
            addCriterion("HtOperMemo not like", value, "htOperMemo");
            return (Criteria) this;
        }

        public Criteria andHtOperMemoIn(List<String> values) {
            addCriterion("HtOperMemo in", values, "htOperMemo");
            return (Criteria) this;
        }

        public Criteria andHtOperMemoNotIn(List<String> values) {
            addCriterion("HtOperMemo not in", values, "htOperMemo");
            return (Criteria) this;
        }

        public Criteria andHtOperMemoBetween(String value1, String value2) {
            addCriterion("HtOperMemo between", value1, value2, "htOperMemo");
            return (Criteria) this;
        }

        public Criteria andHtOperMemoNotBetween(String value1, String value2) {
            addCriterion("HtOperMemo not between", value1, value2, "htOperMemo");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("Source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("Source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("Source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("Source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("Source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("Source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("Source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("Source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("Source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("Source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("Source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("Source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("Source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("Source not between", value1, value2, "source");
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