package com.js.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KfFollowcorpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KfFollowcorpExample() {
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

        public Criteria andFollowcontentIsNull() {
            addCriterion("followcontent is null");
            return (Criteria) this;
        }

        public Criteria andFollowcontentIsNotNull() {
            addCriterion("followcontent is not null");
            return (Criteria) this;
        }

        public Criteria andFollowcontentEqualTo(String value) {
            addCriterion("followcontent =", value, "followcontent");
            return (Criteria) this;
        }

        public Criteria andFollowcontentNotEqualTo(String value) {
            addCriterion("followcontent <>", value, "followcontent");
            return (Criteria) this;
        }

        public Criteria andFollowcontentGreaterThan(String value) {
            addCriterion("followcontent >", value, "followcontent");
            return (Criteria) this;
        }

        public Criteria andFollowcontentGreaterThanOrEqualTo(String value) {
            addCriterion("followcontent >=", value, "followcontent");
            return (Criteria) this;
        }

        public Criteria andFollowcontentLessThan(String value) {
            addCriterion("followcontent <", value, "followcontent");
            return (Criteria) this;
        }

        public Criteria andFollowcontentLessThanOrEqualTo(String value) {
            addCriterion("followcontent <=", value, "followcontent");
            return (Criteria) this;
        }

        public Criteria andFollowcontentLike(String value) {
            addCriterion("followcontent like", value, "followcontent");
            return (Criteria) this;
        }

        public Criteria andFollowcontentNotLike(String value) {
            addCriterion("followcontent not like", value, "followcontent");
            return (Criteria) this;
        }

        public Criteria andFollowcontentIn(List<String> values) {
            addCriterion("followcontent in", values, "followcontent");
            return (Criteria) this;
        }

        public Criteria andFollowcontentNotIn(List<String> values) {
            addCriterion("followcontent not in", values, "followcontent");
            return (Criteria) this;
        }

        public Criteria andFollowcontentBetween(String value1, String value2) {
            addCriterion("followcontent between", value1, value2, "followcontent");
            return (Criteria) this;
        }

        public Criteria andFollowcontentNotBetween(String value1, String value2) {
            addCriterion("followcontent not between", value1, value2, "followcontent");
            return (Criteria) this;
        }

        public Criteria andFollowlinkmenIsNull() {
            addCriterion("followlinkmen is null");
            return (Criteria) this;
        }

        public Criteria andFollowlinkmenIsNotNull() {
            addCriterion("followlinkmen is not null");
            return (Criteria) this;
        }

        public Criteria andFollowlinkmenEqualTo(String value) {
            addCriterion("followlinkmen =", value, "followlinkmen");
            return (Criteria) this;
        }

        public Criteria andFollowlinkmenNotEqualTo(String value) {
            addCriterion("followlinkmen <>", value, "followlinkmen");
            return (Criteria) this;
        }

        public Criteria andFollowlinkmenGreaterThan(String value) {
            addCriterion("followlinkmen >", value, "followlinkmen");
            return (Criteria) this;
        }

        public Criteria andFollowlinkmenGreaterThanOrEqualTo(String value) {
            addCriterion("followlinkmen >=", value, "followlinkmen");
            return (Criteria) this;
        }

        public Criteria andFollowlinkmenLessThan(String value) {
            addCriterion("followlinkmen <", value, "followlinkmen");
            return (Criteria) this;
        }

        public Criteria andFollowlinkmenLessThanOrEqualTo(String value) {
            addCriterion("followlinkmen <=", value, "followlinkmen");
            return (Criteria) this;
        }

        public Criteria andFollowlinkmenLike(String value) {
            addCriterion("followlinkmen like", value, "followlinkmen");
            return (Criteria) this;
        }

        public Criteria andFollowlinkmenNotLike(String value) {
            addCriterion("followlinkmen not like", value, "followlinkmen");
            return (Criteria) this;
        }

        public Criteria andFollowlinkmenIn(List<String> values) {
            addCriterion("followlinkmen in", values, "followlinkmen");
            return (Criteria) this;
        }

        public Criteria andFollowlinkmenNotIn(List<String> values) {
            addCriterion("followlinkmen not in", values, "followlinkmen");
            return (Criteria) this;
        }

        public Criteria andFollowlinkmenBetween(String value1, String value2) {
            addCriterion("followlinkmen between", value1, value2, "followlinkmen");
            return (Criteria) this;
        }

        public Criteria andFollowlinkmenNotBetween(String value1, String value2) {
            addCriterion("followlinkmen not between", value1, value2, "followlinkmen");
            return (Criteria) this;
        }

        public Criteria andFollowlinkphoneIsNull() {
            addCriterion("followlinkphone is null");
            return (Criteria) this;
        }

        public Criteria andFollowlinkphoneIsNotNull() {
            addCriterion("followlinkphone is not null");
            return (Criteria) this;
        }

        public Criteria andFollowlinkphoneEqualTo(String value) {
            addCriterion("followlinkphone =", value, "followlinkphone");
            return (Criteria) this;
        }

        public Criteria andFollowlinkphoneNotEqualTo(String value) {
            addCriterion("followlinkphone <>", value, "followlinkphone");
            return (Criteria) this;
        }

        public Criteria andFollowlinkphoneGreaterThan(String value) {
            addCriterion("followlinkphone >", value, "followlinkphone");
            return (Criteria) this;
        }

        public Criteria andFollowlinkphoneGreaterThanOrEqualTo(String value) {
            addCriterion("followlinkphone >=", value, "followlinkphone");
            return (Criteria) this;
        }

        public Criteria andFollowlinkphoneLessThan(String value) {
            addCriterion("followlinkphone <", value, "followlinkphone");
            return (Criteria) this;
        }

        public Criteria andFollowlinkphoneLessThanOrEqualTo(String value) {
            addCriterion("followlinkphone <=", value, "followlinkphone");
            return (Criteria) this;
        }

        public Criteria andFollowlinkphoneLike(String value) {
            addCriterion("followlinkphone like", value, "followlinkphone");
            return (Criteria) this;
        }

        public Criteria andFollowlinkphoneNotLike(String value) {
            addCriterion("followlinkphone not like", value, "followlinkphone");
            return (Criteria) this;
        }

        public Criteria andFollowlinkphoneIn(List<String> values) {
            addCriterion("followlinkphone in", values, "followlinkphone");
            return (Criteria) this;
        }

        public Criteria andFollowlinkphoneNotIn(List<String> values) {
            addCriterion("followlinkphone not in", values, "followlinkphone");
            return (Criteria) this;
        }

        public Criteria andFollowlinkphoneBetween(String value1, String value2) {
            addCriterion("followlinkphone between", value1, value2, "followlinkphone");
            return (Criteria) this;
        }

        public Criteria andFollowlinkphoneNotBetween(String value1, String value2) {
            addCriterion("followlinkphone not between", value1, value2, "followlinkphone");
            return (Criteria) this;
        }

        public Criteria andFollowlinkmanidIsNull() {
            addCriterion("followlinkmanid is null");
            return (Criteria) this;
        }

        public Criteria andFollowlinkmanidIsNotNull() {
            addCriterion("followlinkmanid is not null");
            return (Criteria) this;
        }

        public Criteria andFollowlinkmanidEqualTo(Integer value) {
            addCriterion("followlinkmanid =", value, "followlinkmanid");
            return (Criteria) this;
        }

        public Criteria andFollowlinkmanidNotEqualTo(Integer value) {
            addCriterion("followlinkmanid <>", value, "followlinkmanid");
            return (Criteria) this;
        }

        public Criteria andFollowlinkmanidGreaterThan(Integer value) {
            addCriterion("followlinkmanid >", value, "followlinkmanid");
            return (Criteria) this;
        }

        public Criteria andFollowlinkmanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("followlinkmanid >=", value, "followlinkmanid");
            return (Criteria) this;
        }

        public Criteria andFollowlinkmanidLessThan(Integer value) {
            addCriterion("followlinkmanid <", value, "followlinkmanid");
            return (Criteria) this;
        }

        public Criteria andFollowlinkmanidLessThanOrEqualTo(Integer value) {
            addCriterion("followlinkmanid <=", value, "followlinkmanid");
            return (Criteria) this;
        }

        public Criteria andFollowlinkmanidIn(List<Integer> values) {
            addCriterion("followlinkmanid in", values, "followlinkmanid");
            return (Criteria) this;
        }

        public Criteria andFollowlinkmanidNotIn(List<Integer> values) {
            addCriterion("followlinkmanid not in", values, "followlinkmanid");
            return (Criteria) this;
        }

        public Criteria andFollowlinkmanidBetween(Integer value1, Integer value2) {
            addCriterion("followlinkmanid between", value1, value2, "followlinkmanid");
            return (Criteria) this;
        }

        public Criteria andFollowlinkmanidNotBetween(Integer value1, Integer value2) {
            addCriterion("followlinkmanid not between", value1, value2, "followlinkmanid");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNull() {
            addCriterion("taskid is null");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNotNull() {
            addCriterion("taskid is not null");
            return (Criteria) this;
        }

        public Criteria andTaskidEqualTo(Integer value) {
            addCriterion("taskid =", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotEqualTo(Integer value) {
            addCriterion("taskid <>", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThan(Integer value) {
            addCriterion("taskid >", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThanOrEqualTo(Integer value) {
            addCriterion("taskid >=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThan(Integer value) {
            addCriterion("taskid <", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThanOrEqualTo(Integer value) {
            addCriterion("taskid <=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidIn(List<Integer> values) {
            addCriterion("taskid in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotIn(List<Integer> values) {
            addCriterion("taskid not in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidBetween(Integer value1, Integer value2) {
            addCriterion("taskid between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotBetween(Integer value1, Integer value2) {
            addCriterion("taskid not between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andCorpidIsNull() {
            addCriterion("corpid is null");
            return (Criteria) this;
        }

        public Criteria andCorpidIsNotNull() {
            addCriterion("corpid is not null");
            return (Criteria) this;
        }

        public Criteria andCorpidEqualTo(Integer value) {
            addCriterion("corpid =", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidNotEqualTo(Integer value) {
            addCriterion("corpid <>", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidGreaterThan(Integer value) {
            addCriterion("corpid >", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("corpid >=", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidLessThan(Integer value) {
            addCriterion("corpid <", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidLessThanOrEqualTo(Integer value) {
            addCriterion("corpid <=", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidIn(List<Integer> values) {
            addCriterion("corpid in", values, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidNotIn(List<Integer> values) {
            addCriterion("corpid not in", values, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidBetween(Integer value1, Integer value2) {
            addCriterion("corpid between", value1, value2, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidNotBetween(Integer value1, Integer value2) {
            addCriterion("corpid not between", value1, value2, "corpid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
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

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andFollowcompanyIsNull() {
            addCriterion("followcompany is null");
            return (Criteria) this;
        }

        public Criteria andFollowcompanyIsNotNull() {
            addCriterion("followcompany is not null");
            return (Criteria) this;
        }

        public Criteria andFollowcompanyEqualTo(String value) {
            addCriterion("followcompany =", value, "followcompany");
            return (Criteria) this;
        }

        public Criteria andFollowcompanyNotEqualTo(String value) {
            addCriterion("followcompany <>", value, "followcompany");
            return (Criteria) this;
        }

        public Criteria andFollowcompanyGreaterThan(String value) {
            addCriterion("followcompany >", value, "followcompany");
            return (Criteria) this;
        }

        public Criteria andFollowcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("followcompany >=", value, "followcompany");
            return (Criteria) this;
        }

        public Criteria andFollowcompanyLessThan(String value) {
            addCriterion("followcompany <", value, "followcompany");
            return (Criteria) this;
        }

        public Criteria andFollowcompanyLessThanOrEqualTo(String value) {
            addCriterion("followcompany <=", value, "followcompany");
            return (Criteria) this;
        }

        public Criteria andFollowcompanyLike(String value) {
            addCriterion("followcompany like", value, "followcompany");
            return (Criteria) this;
        }

        public Criteria andFollowcompanyNotLike(String value) {
            addCriterion("followcompany not like", value, "followcompany");
            return (Criteria) this;
        }

        public Criteria andFollowcompanyIn(List<String> values) {
            addCriterion("followcompany in", values, "followcompany");
            return (Criteria) this;
        }

        public Criteria andFollowcompanyNotIn(List<String> values) {
            addCriterion("followcompany not in", values, "followcompany");
            return (Criteria) this;
        }

        public Criteria andFollowcompanyBetween(String value1, String value2) {
            addCriterion("followcompany between", value1, value2, "followcompany");
            return (Criteria) this;
        }

        public Criteria andFollowcompanyNotBetween(String value1, String value2) {
            addCriterion("followcompany not between", value1, value2, "followcompany");
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