package com.js.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KfTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KfTaskExample() {
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

        public Criteria andTasknameIsNull() {
            addCriterion("taskname is null");
            return (Criteria) this;
        }

        public Criteria andTasknameIsNotNull() {
            addCriterion("taskname is not null");
            return (Criteria) this;
        }

        public Criteria andTasknameEqualTo(String value) {
            addCriterion("taskname =", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotEqualTo(String value) {
            addCriterion("taskname <>", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThan(String value) {
            addCriterion("taskname >", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThanOrEqualTo(String value) {
            addCriterion("taskname >=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThan(String value) {
            addCriterion("taskname <", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThanOrEqualTo(String value) {
            addCriterion("taskname <=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLike(String value) {
            addCriterion("taskname like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotLike(String value) {
            addCriterion("taskname not like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameIn(List<String> values) {
            addCriterion("taskname in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotIn(List<String> values) {
            addCriterion("taskname not in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameBetween(String value1, String value2) {
            addCriterion("taskname between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotBetween(String value1, String value2) {
            addCriterion("taskname not between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andTaskmemoIsNull() {
            addCriterion("taskmemo is null");
            return (Criteria) this;
        }

        public Criteria andTaskmemoIsNotNull() {
            addCriterion("taskmemo is not null");
            return (Criteria) this;
        }

        public Criteria andTaskmemoEqualTo(String value) {
            addCriterion("taskmemo =", value, "taskmemo");
            return (Criteria) this;
        }

        public Criteria andTaskmemoNotEqualTo(String value) {
            addCriterion("taskmemo <>", value, "taskmemo");
            return (Criteria) this;
        }

        public Criteria andTaskmemoGreaterThan(String value) {
            addCriterion("taskmemo >", value, "taskmemo");
            return (Criteria) this;
        }

        public Criteria andTaskmemoGreaterThanOrEqualTo(String value) {
            addCriterion("taskmemo >=", value, "taskmemo");
            return (Criteria) this;
        }

        public Criteria andTaskmemoLessThan(String value) {
            addCriterion("taskmemo <", value, "taskmemo");
            return (Criteria) this;
        }

        public Criteria andTaskmemoLessThanOrEqualTo(String value) {
            addCriterion("taskmemo <=", value, "taskmemo");
            return (Criteria) this;
        }

        public Criteria andTaskmemoLike(String value) {
            addCriterion("taskmemo like", value, "taskmemo");
            return (Criteria) this;
        }

        public Criteria andTaskmemoNotLike(String value) {
            addCriterion("taskmemo not like", value, "taskmemo");
            return (Criteria) this;
        }

        public Criteria andTaskmemoIn(List<String> values) {
            addCriterion("taskmemo in", values, "taskmemo");
            return (Criteria) this;
        }

        public Criteria andTaskmemoNotIn(List<String> values) {
            addCriterion("taskmemo not in", values, "taskmemo");
            return (Criteria) this;
        }

        public Criteria andTaskmemoBetween(String value1, String value2) {
            addCriterion("taskmemo between", value1, value2, "taskmemo");
            return (Criteria) this;
        }

        public Criteria andTaskmemoNotBetween(String value1, String value2) {
            addCriterion("taskmemo not between", value1, value2, "taskmemo");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andAllotnameIsNull() {
            addCriterion("allotname is null");
            return (Criteria) this;
        }

        public Criteria andAllotnameIsNotNull() {
            addCriterion("allotname is not null");
            return (Criteria) this;
        }

        public Criteria andAllotnameEqualTo(String value) {
            addCriterion("allotname =", value, "allotname");
            return (Criteria) this;
        }

        public Criteria andAllotnameNotEqualTo(String value) {
            addCriterion("allotname <>", value, "allotname");
            return (Criteria) this;
        }

        public Criteria andAllotnameGreaterThan(String value) {
            addCriterion("allotname >", value, "allotname");
            return (Criteria) this;
        }

        public Criteria andAllotnameGreaterThanOrEqualTo(String value) {
            addCriterion("allotname >=", value, "allotname");
            return (Criteria) this;
        }

        public Criteria andAllotnameLessThan(String value) {
            addCriterion("allotname <", value, "allotname");
            return (Criteria) this;
        }

        public Criteria andAllotnameLessThanOrEqualTo(String value) {
            addCriterion("allotname <=", value, "allotname");
            return (Criteria) this;
        }

        public Criteria andAllotnameLike(String value) {
            addCriterion("allotname like", value, "allotname");
            return (Criteria) this;
        }

        public Criteria andAllotnameNotLike(String value) {
            addCriterion("allotname not like", value, "allotname");
            return (Criteria) this;
        }

        public Criteria andAllotnameIn(List<String> values) {
            addCriterion("allotname in", values, "allotname");
            return (Criteria) this;
        }

        public Criteria andAllotnameNotIn(List<String> values) {
            addCriterion("allotname not in", values, "allotname");
            return (Criteria) this;
        }

        public Criteria andAllotnameBetween(String value1, String value2) {
            addCriterion("allotname between", value1, value2, "allotname");
            return (Criteria) this;
        }

        public Criteria andAllotnameNotBetween(String value1, String value2) {
            addCriterion("allotname not between", value1, value2, "allotname");
            return (Criteria) this;
        }

        public Criteria andContentnameIsNull() {
            addCriterion("contentname is null");
            return (Criteria) this;
        }

        public Criteria andContentnameIsNotNull() {
            addCriterion("contentname is not null");
            return (Criteria) this;
        }

        public Criteria andContentnameEqualTo(String value) {
            addCriterion("contentname =", value, "contentname");
            return (Criteria) this;
        }

        public Criteria andContentnameNotEqualTo(String value) {
            addCriterion("contentname <>", value, "contentname");
            return (Criteria) this;
        }

        public Criteria andContentnameGreaterThan(String value) {
            addCriterion("contentname >", value, "contentname");
            return (Criteria) this;
        }

        public Criteria andContentnameGreaterThanOrEqualTo(String value) {
            addCriterion("contentname >=", value, "contentname");
            return (Criteria) this;
        }

        public Criteria andContentnameLessThan(String value) {
            addCriterion("contentname <", value, "contentname");
            return (Criteria) this;
        }

        public Criteria andContentnameLessThanOrEqualTo(String value) {
            addCriterion("contentname <=", value, "contentname");
            return (Criteria) this;
        }

        public Criteria andContentnameLike(String value) {
            addCriterion("contentname like", value, "contentname");
            return (Criteria) this;
        }

        public Criteria andContentnameNotLike(String value) {
            addCriterion("contentname not like", value, "contentname");
            return (Criteria) this;
        }

        public Criteria andContentnameIn(List<String> values) {
            addCriterion("contentname in", values, "contentname");
            return (Criteria) this;
        }

        public Criteria andContentnameNotIn(List<String> values) {
            addCriterion("contentname not in", values, "contentname");
            return (Criteria) this;
        }

        public Criteria andContentnameBetween(String value1, String value2) {
            addCriterion("contentname between", value1, value2, "contentname");
            return (Criteria) this;
        }

        public Criteria andContentnameNotBetween(String value1, String value2) {
            addCriterion("contentname not between", value1, value2, "contentname");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
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

        public Criteria andContentidIsNull() {
            addCriterion("contentid is null");
            return (Criteria) this;
        }

        public Criteria andContentidIsNotNull() {
            addCriterion("contentid is not null");
            return (Criteria) this;
        }

        public Criteria andContentidEqualTo(Integer value) {
            addCriterion("contentid =", value, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidNotEqualTo(Integer value) {
            addCriterion("contentid <>", value, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidGreaterThan(Integer value) {
            addCriterion("contentid >", value, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("contentid >=", value, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidLessThan(Integer value) {
            addCriterion("contentid <", value, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidLessThanOrEqualTo(Integer value) {
            addCriterion("contentid <=", value, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidIn(List<Integer> values) {
            addCriterion("contentid in", values, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidNotIn(List<Integer> values) {
            addCriterion("contentid not in", values, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidBetween(Integer value1, Integer value2) {
            addCriterion("contentid between", value1, value2, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidNotBetween(Integer value1, Integer value2) {
            addCriterion("contentid not between", value1, value2, "contentid");
            return (Criteria) this;
        }

        public Criteria andIsallcorpIsNull() {
            addCriterion("isallcorp is null");
            return (Criteria) this;
        }

        public Criteria andIsallcorpIsNotNull() {
            addCriterion("isallcorp is not null");
            return (Criteria) this;
        }

        public Criteria andIsallcorpEqualTo(Integer value) {
            addCriterion("isallcorp =", value, "isallcorp");
            return (Criteria) this;
        }

        public Criteria andIsallcorpNotEqualTo(Integer value) {
            addCriterion("isallcorp <>", value, "isallcorp");
            return (Criteria) this;
        }

        public Criteria andIsallcorpGreaterThan(Integer value) {
            addCriterion("isallcorp >", value, "isallcorp");
            return (Criteria) this;
        }

        public Criteria andIsallcorpGreaterThanOrEqualTo(Integer value) {
            addCriterion("isallcorp >=", value, "isallcorp");
            return (Criteria) this;
        }

        public Criteria andIsallcorpLessThan(Integer value) {
            addCriterion("isallcorp <", value, "isallcorp");
            return (Criteria) this;
        }

        public Criteria andIsallcorpLessThanOrEqualTo(Integer value) {
            addCriterion("isallcorp <=", value, "isallcorp");
            return (Criteria) this;
        }

        public Criteria andIsallcorpIn(List<Integer> values) {
            addCriterion("isallcorp in", values, "isallcorp");
            return (Criteria) this;
        }

        public Criteria andIsallcorpNotIn(List<Integer> values) {
            addCriterion("isallcorp not in", values, "isallcorp");
            return (Criteria) this;
        }

        public Criteria andIsallcorpBetween(Integer value1, Integer value2) {
            addCriterion("isallcorp between", value1, value2, "isallcorp");
            return (Criteria) this;
        }

        public Criteria andIsallcorpNotBetween(Integer value1, Integer value2) {
            addCriterion("isallcorp not between", value1, value2, "isallcorp");
            return (Criteria) this;
        }

        public Criteria andIsspokenIsNull() {
            addCriterion("isspoken is null");
            return (Criteria) this;
        }

        public Criteria andIsspokenIsNotNull() {
            addCriterion("isspoken is not null");
            return (Criteria) this;
        }

        public Criteria andIsspokenEqualTo(Integer value) {
            addCriterion("isspoken =", value, "isspoken");
            return (Criteria) this;
        }

        public Criteria andIsspokenNotEqualTo(Integer value) {
            addCriterion("isspoken <>", value, "isspoken");
            return (Criteria) this;
        }

        public Criteria andIsspokenGreaterThan(Integer value) {
            addCriterion("isspoken >", value, "isspoken");
            return (Criteria) this;
        }

        public Criteria andIsspokenGreaterThanOrEqualTo(Integer value) {
            addCriterion("isspoken >=", value, "isspoken");
            return (Criteria) this;
        }

        public Criteria andIsspokenLessThan(Integer value) {
            addCriterion("isspoken <", value, "isspoken");
            return (Criteria) this;
        }

        public Criteria andIsspokenLessThanOrEqualTo(Integer value) {
            addCriterion("isspoken <=", value, "isspoken");
            return (Criteria) this;
        }

        public Criteria andIsspokenIn(List<Integer> values) {
            addCriterion("isspoken in", values, "isspoken");
            return (Criteria) this;
        }

        public Criteria andIsspokenNotIn(List<Integer> values) {
            addCriterion("isspoken not in", values, "isspoken");
            return (Criteria) this;
        }

        public Criteria andIsspokenBetween(Integer value1, Integer value2) {
            addCriterion("isspoken between", value1, value2, "isspoken");
            return (Criteria) this;
        }

        public Criteria andIsspokenNotBetween(Integer value1, Integer value2) {
            addCriterion("isspoken not between", value1, value2, "isspoken");
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