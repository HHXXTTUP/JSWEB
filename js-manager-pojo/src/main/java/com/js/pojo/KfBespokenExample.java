package com.js.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KfBespokenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KfBespokenExample() {
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

        public Criteria andSpokencontentIsNull() {
            addCriterion("spokencontent is null");
            return (Criteria) this;
        }

        public Criteria andSpokencontentIsNotNull() {
            addCriterion("spokencontent is not null");
            return (Criteria) this;
        }

        public Criteria andSpokencontentEqualTo(String value) {
            addCriterion("spokencontent =", value, "spokencontent");
            return (Criteria) this;
        }

        public Criteria andSpokencontentNotEqualTo(String value) {
            addCriterion("spokencontent <>", value, "spokencontent");
            return (Criteria) this;
        }

        public Criteria andSpokencontentGreaterThan(String value) {
            addCriterion("spokencontent >", value, "spokencontent");
            return (Criteria) this;
        }

        public Criteria andSpokencontentGreaterThanOrEqualTo(String value) {
            addCriterion("spokencontent >=", value, "spokencontent");
            return (Criteria) this;
        }

        public Criteria andSpokencontentLessThan(String value) {
            addCriterion("spokencontent <", value, "spokencontent");
            return (Criteria) this;
        }

        public Criteria andSpokencontentLessThanOrEqualTo(String value) {
            addCriterion("spokencontent <=", value, "spokencontent");
            return (Criteria) this;
        }

        public Criteria andSpokencontentLike(String value) {
            addCriterion("spokencontent like", value, "spokencontent");
            return (Criteria) this;
        }

        public Criteria andSpokencontentNotLike(String value) {
            addCriterion("spokencontent not like", value, "spokencontent");
            return (Criteria) this;
        }

        public Criteria andSpokencontentIn(List<String> values) {
            addCriterion("spokencontent in", values, "spokencontent");
            return (Criteria) this;
        }

        public Criteria andSpokencontentNotIn(List<String> values) {
            addCriterion("spokencontent not in", values, "spokencontent");
            return (Criteria) this;
        }

        public Criteria andSpokencontentBetween(String value1, String value2) {
            addCriterion("spokencontent between", value1, value2, "spokencontent");
            return (Criteria) this;
        }

        public Criteria andSpokencontentNotBetween(String value1, String value2) {
            addCriterion("spokencontent not between", value1, value2, "spokencontent");
            return (Criteria) this;
        }

        public Criteria andSpokentimeIsNull() {
            addCriterion("spokentime is null");
            return (Criteria) this;
        }

        public Criteria andSpokentimeIsNotNull() {
            addCriterion("spokentime is not null");
            return (Criteria) this;
        }

        public Criteria andSpokentimeEqualTo(Date value) {
            addCriterion("spokentime =", value, "spokentime");
            return (Criteria) this;
        }

        public Criteria andSpokentimeNotEqualTo(Date value) {
            addCriterion("spokentime <>", value, "spokentime");
            return (Criteria) this;
        }

        public Criteria andSpokentimeGreaterThan(Date value) {
            addCriterion("spokentime >", value, "spokentime");
            return (Criteria) this;
        }

        public Criteria andSpokentimeGreaterThanOrEqualTo(Date value) {
            addCriterion("spokentime >=", value, "spokentime");
            return (Criteria) this;
        }

        public Criteria andSpokentimeLessThan(Date value) {
            addCriterion("spokentime <", value, "spokentime");
            return (Criteria) this;
        }

        public Criteria andSpokentimeLessThanOrEqualTo(Date value) {
            addCriterion("spokentime <=", value, "spokentime");
            return (Criteria) this;
        }

        public Criteria andSpokentimeIn(List<Date> values) {
            addCriterion("spokentime in", values, "spokentime");
            return (Criteria) this;
        }

        public Criteria andSpokentimeNotIn(List<Date> values) {
            addCriterion("spokentime not in", values, "spokentime");
            return (Criteria) this;
        }

        public Criteria andSpokentimeBetween(Date value1, Date value2) {
            addCriterion("spokentime between", value1, value2, "spokentime");
            return (Criteria) this;
        }

        public Criteria andSpokentimeNotBetween(Date value1, Date value2) {
            addCriterion("spokentime not between", value1, value2, "spokentime");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkmenIsNull() {
            addCriterion("spokenlinkmen is null");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkmenIsNotNull() {
            addCriterion("spokenlinkmen is not null");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkmenEqualTo(String value) {
            addCriterion("spokenlinkmen =", value, "spokenlinkmen");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkmenNotEqualTo(String value) {
            addCriterion("spokenlinkmen <>", value, "spokenlinkmen");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkmenGreaterThan(String value) {
            addCriterion("spokenlinkmen >", value, "spokenlinkmen");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkmenGreaterThanOrEqualTo(String value) {
            addCriterion("spokenlinkmen >=", value, "spokenlinkmen");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkmenLessThan(String value) {
            addCriterion("spokenlinkmen <", value, "spokenlinkmen");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkmenLessThanOrEqualTo(String value) {
            addCriterion("spokenlinkmen <=", value, "spokenlinkmen");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkmenLike(String value) {
            addCriterion("spokenlinkmen like", value, "spokenlinkmen");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkmenNotLike(String value) {
            addCriterion("spokenlinkmen not like", value, "spokenlinkmen");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkmenIn(List<String> values) {
            addCriterion("spokenlinkmen in", values, "spokenlinkmen");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkmenNotIn(List<String> values) {
            addCriterion("spokenlinkmen not in", values, "spokenlinkmen");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkmenBetween(String value1, String value2) {
            addCriterion("spokenlinkmen between", value1, value2, "spokenlinkmen");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkmenNotBetween(String value1, String value2) {
            addCriterion("spokenlinkmen not between", value1, value2, "spokenlinkmen");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkphoneIsNull() {
            addCriterion("spokenlinkphone is null");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkphoneIsNotNull() {
            addCriterion("spokenlinkphone is not null");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkphoneEqualTo(String value) {
            addCriterion("spokenlinkphone =", value, "spokenlinkphone");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkphoneNotEqualTo(String value) {
            addCriterion("spokenlinkphone <>", value, "spokenlinkphone");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkphoneGreaterThan(String value) {
            addCriterion("spokenlinkphone >", value, "spokenlinkphone");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkphoneGreaterThanOrEqualTo(String value) {
            addCriterion("spokenlinkphone >=", value, "spokenlinkphone");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkphoneLessThan(String value) {
            addCriterion("spokenlinkphone <", value, "spokenlinkphone");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkphoneLessThanOrEqualTo(String value) {
            addCriterion("spokenlinkphone <=", value, "spokenlinkphone");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkphoneLike(String value) {
            addCriterion("spokenlinkphone like", value, "spokenlinkphone");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkphoneNotLike(String value) {
            addCriterion("spokenlinkphone not like", value, "spokenlinkphone");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkphoneIn(List<String> values) {
            addCriterion("spokenlinkphone in", values, "spokenlinkphone");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkphoneNotIn(List<String> values) {
            addCriterion("spokenlinkphone not in", values, "spokenlinkphone");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkphoneBetween(String value1, String value2) {
            addCriterion("spokenlinkphone between", value1, value2, "spokenlinkphone");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkphoneNotBetween(String value1, String value2) {
            addCriterion("spokenlinkphone not between", value1, value2, "spokenlinkphone");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkmanidIsNull() {
            addCriterion("spokenlinkmanid is null");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkmanidIsNotNull() {
            addCriterion("spokenlinkmanid is not null");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkmanidEqualTo(Integer value) {
            addCriterion("spokenlinkmanid =", value, "spokenlinkmanid");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkmanidNotEqualTo(Integer value) {
            addCriterion("spokenlinkmanid <>", value, "spokenlinkmanid");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkmanidGreaterThan(Integer value) {
            addCriterion("spokenlinkmanid >", value, "spokenlinkmanid");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkmanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("spokenlinkmanid >=", value, "spokenlinkmanid");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkmanidLessThan(Integer value) {
            addCriterion("spokenlinkmanid <", value, "spokenlinkmanid");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkmanidLessThanOrEqualTo(Integer value) {
            addCriterion("spokenlinkmanid <=", value, "spokenlinkmanid");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkmanidIn(List<Integer> values) {
            addCriterion("spokenlinkmanid in", values, "spokenlinkmanid");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkmanidNotIn(List<Integer> values) {
            addCriterion("spokenlinkmanid not in", values, "spokenlinkmanid");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkmanidBetween(Integer value1, Integer value2) {
            addCriterion("spokenlinkmanid between", value1, value2, "spokenlinkmanid");
            return (Criteria) this;
        }

        public Criteria andSpokenlinkmanidNotBetween(Integer value1, Integer value2) {
            addCriterion("spokenlinkmanid not between", value1, value2, "spokenlinkmanid");
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

        public Criteria andSpokencompanyIsNull() {
            addCriterion("spokencompany is null");
            return (Criteria) this;
        }

        public Criteria andSpokencompanyIsNotNull() {
            addCriterion("spokencompany is not null");
            return (Criteria) this;
        }

        public Criteria andSpokencompanyEqualTo(String value) {
            addCriterion("spokencompany =", value, "spokencompany");
            return (Criteria) this;
        }

        public Criteria andSpokencompanyNotEqualTo(String value) {
            addCriterion("spokencompany <>", value, "spokencompany");
            return (Criteria) this;
        }

        public Criteria andSpokencompanyGreaterThan(String value) {
            addCriterion("spokencompany >", value, "spokencompany");
            return (Criteria) this;
        }

        public Criteria andSpokencompanyGreaterThanOrEqualTo(String value) {
            addCriterion("spokencompany >=", value, "spokencompany");
            return (Criteria) this;
        }

        public Criteria andSpokencompanyLessThan(String value) {
            addCriterion("spokencompany <", value, "spokencompany");
            return (Criteria) this;
        }

        public Criteria andSpokencompanyLessThanOrEqualTo(String value) {
            addCriterion("spokencompany <=", value, "spokencompany");
            return (Criteria) this;
        }

        public Criteria andSpokencompanyLike(String value) {
            addCriterion("spokencompany like", value, "spokencompany");
            return (Criteria) this;
        }

        public Criteria andSpokencompanyNotLike(String value) {
            addCriterion("spokencompany not like", value, "spokencompany");
            return (Criteria) this;
        }

        public Criteria andSpokencompanyIn(List<String> values) {
            addCriterion("spokencompany in", values, "spokencompany");
            return (Criteria) this;
        }

        public Criteria andSpokencompanyNotIn(List<String> values) {
            addCriterion("spokencompany not in", values, "spokencompany");
            return (Criteria) this;
        }

        public Criteria andSpokencompanyBetween(String value1, String value2) {
            addCriterion("spokencompany between", value1, value2, "spokencompany");
            return (Criteria) this;
        }

        public Criteria andSpokencompanyNotBetween(String value1, String value2) {
            addCriterion("spokencompany not between", value1, value2, "spokencompany");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNull() {
            addCriterion("isdefault is null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNotNull() {
            addCriterion("isdefault is not null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultEqualTo(Integer value) {
            addCriterion("isdefault =", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotEqualTo(Integer value) {
            addCriterion("isdefault <>", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThan(Integer value) {
            addCriterion("isdefault >", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThanOrEqualTo(Integer value) {
            addCriterion("isdefault >=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThan(Integer value) {
            addCriterion("isdefault <", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThanOrEqualTo(Integer value) {
            addCriterion("isdefault <=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIn(List<Integer> values) {
            addCriterion("isdefault in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotIn(List<Integer> values) {
            addCriterion("isdefault not in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultBetween(Integer value1, Integer value2) {
            addCriterion("isdefault between", value1, value2, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotBetween(Integer value1, Integer value2) {
            addCriterion("isdefault not between", value1, value2, "isdefault");
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