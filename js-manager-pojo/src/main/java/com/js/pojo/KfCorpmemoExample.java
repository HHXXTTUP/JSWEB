package com.js.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KfCorpmemoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KfCorpmemoExample() {
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

        public Criteria andCorpcontentIsNull() {
            addCriterion("corpcontent is null");
            return (Criteria) this;
        }

        public Criteria andCorpcontentIsNotNull() {
            addCriterion("corpcontent is not null");
            return (Criteria) this;
        }

        public Criteria andCorpcontentEqualTo(String value) {
            addCriterion("corpcontent =", value, "corpcontent");
            return (Criteria) this;
        }

        public Criteria andCorpcontentNotEqualTo(String value) {
            addCriterion("corpcontent <>", value, "corpcontent");
            return (Criteria) this;
        }

        public Criteria andCorpcontentGreaterThan(String value) {
            addCriterion("corpcontent >", value, "corpcontent");
            return (Criteria) this;
        }

        public Criteria andCorpcontentGreaterThanOrEqualTo(String value) {
            addCriterion("corpcontent >=", value, "corpcontent");
            return (Criteria) this;
        }

        public Criteria andCorpcontentLessThan(String value) {
            addCriterion("corpcontent <", value, "corpcontent");
            return (Criteria) this;
        }

        public Criteria andCorpcontentLessThanOrEqualTo(String value) {
            addCriterion("corpcontent <=", value, "corpcontent");
            return (Criteria) this;
        }

        public Criteria andCorpcontentLike(String value) {
            addCriterion("corpcontent like", value, "corpcontent");
            return (Criteria) this;
        }

        public Criteria andCorpcontentNotLike(String value) {
            addCriterion("corpcontent not like", value, "corpcontent");
            return (Criteria) this;
        }

        public Criteria andCorpcontentIn(List<String> values) {
            addCriterion("corpcontent in", values, "corpcontent");
            return (Criteria) this;
        }

        public Criteria andCorpcontentNotIn(List<String> values) {
            addCriterion("corpcontent not in", values, "corpcontent");
            return (Criteria) this;
        }

        public Criteria andCorpcontentBetween(String value1, String value2) {
            addCriterion("corpcontent between", value1, value2, "corpcontent");
            return (Criteria) this;
        }

        public Criteria andCorpcontentNotBetween(String value1, String value2) {
            addCriterion("corpcontent not between", value1, value2, "corpcontent");
            return (Criteria) this;
        }

        public Criteria andCorpcontentmemoIsNull() {
            addCriterion("corpcontentmemo is null");
            return (Criteria) this;
        }

        public Criteria andCorpcontentmemoIsNotNull() {
            addCriterion("corpcontentmemo is not null");
            return (Criteria) this;
        }

        public Criteria andCorpcontentmemoEqualTo(String value) {
            addCriterion("corpcontentmemo =", value, "corpcontentmemo");
            return (Criteria) this;
        }

        public Criteria andCorpcontentmemoNotEqualTo(String value) {
            addCriterion("corpcontentmemo <>", value, "corpcontentmemo");
            return (Criteria) this;
        }

        public Criteria andCorpcontentmemoGreaterThan(String value) {
            addCriterion("corpcontentmemo >", value, "corpcontentmemo");
            return (Criteria) this;
        }

        public Criteria andCorpcontentmemoGreaterThanOrEqualTo(String value) {
            addCriterion("corpcontentmemo >=", value, "corpcontentmemo");
            return (Criteria) this;
        }

        public Criteria andCorpcontentmemoLessThan(String value) {
            addCriterion("corpcontentmemo <", value, "corpcontentmemo");
            return (Criteria) this;
        }

        public Criteria andCorpcontentmemoLessThanOrEqualTo(String value) {
            addCriterion("corpcontentmemo <=", value, "corpcontentmemo");
            return (Criteria) this;
        }

        public Criteria andCorpcontentmemoLike(String value) {
            addCriterion("corpcontentmemo like", value, "corpcontentmemo");
            return (Criteria) this;
        }

        public Criteria andCorpcontentmemoNotLike(String value) {
            addCriterion("corpcontentmemo not like", value, "corpcontentmemo");
            return (Criteria) this;
        }

        public Criteria andCorpcontentmemoIn(List<String> values) {
            addCriterion("corpcontentmemo in", values, "corpcontentmemo");
            return (Criteria) this;
        }

        public Criteria andCorpcontentmemoNotIn(List<String> values) {
            addCriterion("corpcontentmemo not in", values, "corpcontentmemo");
            return (Criteria) this;
        }

        public Criteria andCorpcontentmemoBetween(String value1, String value2) {
            addCriterion("corpcontentmemo between", value1, value2, "corpcontentmemo");
            return (Criteria) this;
        }

        public Criteria andCorpcontentmemoNotBetween(String value1, String value2) {
            addCriterion("corpcontentmemo not between", value1, value2, "corpcontentmemo");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
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

        public Criteria andTopgroupidIsNull() {
            addCriterion("topgroupid is null");
            return (Criteria) this;
        }

        public Criteria andTopgroupidIsNotNull() {
            addCriterion("topgroupid is not null");
            return (Criteria) this;
        }

        public Criteria andTopgroupidEqualTo(Integer value) {
            addCriterion("topgroupid =", value, "topgroupid");
            return (Criteria) this;
        }

        public Criteria andTopgroupidNotEqualTo(Integer value) {
            addCriterion("topgroupid <>", value, "topgroupid");
            return (Criteria) this;
        }

        public Criteria andTopgroupidGreaterThan(Integer value) {
            addCriterion("topgroupid >", value, "topgroupid");
            return (Criteria) this;
        }

        public Criteria andTopgroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("topgroupid >=", value, "topgroupid");
            return (Criteria) this;
        }

        public Criteria andTopgroupidLessThan(Integer value) {
            addCriterion("topgroupid <", value, "topgroupid");
            return (Criteria) this;
        }

        public Criteria andTopgroupidLessThanOrEqualTo(Integer value) {
            addCriterion("topgroupid <=", value, "topgroupid");
            return (Criteria) this;
        }

        public Criteria andTopgroupidIn(List<Integer> values) {
            addCriterion("topgroupid in", values, "topgroupid");
            return (Criteria) this;
        }

        public Criteria andTopgroupidNotIn(List<Integer> values) {
            addCriterion("topgroupid not in", values, "topgroupid");
            return (Criteria) this;
        }

        public Criteria andTopgroupidBetween(Integer value1, Integer value2) {
            addCriterion("topgroupid between", value1, value2, "topgroupid");
            return (Criteria) this;
        }

        public Criteria andTopgroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("topgroupid not between", value1, value2, "topgroupid");
            return (Criteria) this;
        }

        public Criteria andGlidIsNull() {
            addCriterion("glid is null");
            return (Criteria) this;
        }

        public Criteria andGlidIsNotNull() {
            addCriterion("glid is not null");
            return (Criteria) this;
        }

        public Criteria andGlidEqualTo(String value) {
            addCriterion("glid =", value, "glid");
            return (Criteria) this;
        }

        public Criteria andGlidNotEqualTo(String value) {
            addCriterion("glid <>", value, "glid");
            return (Criteria) this;
        }

        public Criteria andGlidGreaterThan(String value) {
            addCriterion("glid >", value, "glid");
            return (Criteria) this;
        }

        public Criteria andGlidGreaterThanOrEqualTo(String value) {
            addCriterion("glid >=", value, "glid");
            return (Criteria) this;
        }

        public Criteria andGlidLessThan(String value) {
            addCriterion("glid <", value, "glid");
            return (Criteria) this;
        }

        public Criteria andGlidLessThanOrEqualTo(String value) {
            addCriterion("glid <=", value, "glid");
            return (Criteria) this;
        }

        public Criteria andGlidLike(String value) {
            addCriterion("glid like", value, "glid");
            return (Criteria) this;
        }

        public Criteria andGlidNotLike(String value) {
            addCriterion("glid not like", value, "glid");
            return (Criteria) this;
        }

        public Criteria andGlidIn(List<String> values) {
            addCriterion("glid in", values, "glid");
            return (Criteria) this;
        }

        public Criteria andGlidNotIn(List<String> values) {
            addCriterion("glid not in", values, "glid");
            return (Criteria) this;
        }

        public Criteria andGlidBetween(String value1, String value2) {
            addCriterion("glid between", value1, value2, "glid");
            return (Criteria) this;
        }

        public Criteria andGlidNotBetween(String value1, String value2) {
            addCriterion("glid not between", value1, value2, "glid");
            return (Criteria) this;
        }

        public Criteria andLinknameIsNull() {
            addCriterion("linkname is null");
            return (Criteria) this;
        }

        public Criteria andLinknameIsNotNull() {
            addCriterion("linkname is not null");
            return (Criteria) this;
        }

        public Criteria andLinknameEqualTo(String value) {
            addCriterion("linkname =", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotEqualTo(String value) {
            addCriterion("linkname <>", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameGreaterThan(String value) {
            addCriterion("linkname >", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameGreaterThanOrEqualTo(String value) {
            addCriterion("linkname >=", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameLessThan(String value) {
            addCriterion("linkname <", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameLessThanOrEqualTo(String value) {
            addCriterion("linkname <=", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameLike(String value) {
            addCriterion("linkname like", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotLike(String value) {
            addCriterion("linkname not like", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameIn(List<String> values) {
            addCriterion("linkname in", values, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotIn(List<String> values) {
            addCriterion("linkname not in", values, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameBetween(String value1, String value2) {
            addCriterion("linkname between", value1, value2, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotBetween(String value1, String value2) {
            addCriterion("linkname not between", value1, value2, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinkphoneIsNull() {
            addCriterion("linkphone is null");
            return (Criteria) this;
        }

        public Criteria andLinkphoneIsNotNull() {
            addCriterion("linkphone is not null");
            return (Criteria) this;
        }

        public Criteria andLinkphoneEqualTo(String value) {
            addCriterion("linkphone =", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneNotEqualTo(String value) {
            addCriterion("linkphone <>", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneGreaterThan(String value) {
            addCriterion("linkphone >", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneGreaterThanOrEqualTo(String value) {
            addCriterion("linkphone >=", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneLessThan(String value) {
            addCriterion("linkphone <", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneLessThanOrEqualTo(String value) {
            addCriterion("linkphone <=", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneLike(String value) {
            addCriterion("linkphone like", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneNotLike(String value) {
            addCriterion("linkphone not like", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneIn(List<String> values) {
            addCriterion("linkphone in", values, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneNotIn(List<String> values) {
            addCriterion("linkphone not in", values, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneBetween(String value1, String value2) {
            addCriterion("linkphone between", value1, value2, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneNotBetween(String value1, String value2) {
            addCriterion("linkphone not between", value1, value2, "linkphone");
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

        public Criteria andShstateIsNull() {
            addCriterion("shstate is null");
            return (Criteria) this;
        }

        public Criteria andShstateIsNotNull() {
            addCriterion("shstate is not null");
            return (Criteria) this;
        }

        public Criteria andShstateEqualTo(Integer value) {
            addCriterion("shstate =", value, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateNotEqualTo(Integer value) {
            addCriterion("shstate <>", value, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateGreaterThan(Integer value) {
            addCriterion("shstate >", value, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("shstate >=", value, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateLessThan(Integer value) {
            addCriterion("shstate <", value, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateLessThanOrEqualTo(Integer value) {
            addCriterion("shstate <=", value, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateIn(List<Integer> values) {
            addCriterion("shstate in", values, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateNotIn(List<Integer> values) {
            addCriterion("shstate not in", values, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateBetween(Integer value1, Integer value2) {
            addCriterion("shstate between", value1, value2, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateNotBetween(Integer value1, Integer value2) {
            addCriterion("shstate not between", value1, value2, "shstate");
            return (Criteria) this;
        }

        public Criteria andLinkmanidIsNull() {
            addCriterion("linkmanid is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanidIsNotNull() {
            addCriterion("linkmanid is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanidEqualTo(Integer value) {
            addCriterion("linkmanid =", value, "linkmanid");
            return (Criteria) this;
        }

        public Criteria andLinkmanidNotEqualTo(Integer value) {
            addCriterion("linkmanid <>", value, "linkmanid");
            return (Criteria) this;
        }

        public Criteria andLinkmanidGreaterThan(Integer value) {
            addCriterion("linkmanid >", value, "linkmanid");
            return (Criteria) this;
        }

        public Criteria andLinkmanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("linkmanid >=", value, "linkmanid");
            return (Criteria) this;
        }

        public Criteria andLinkmanidLessThan(Integer value) {
            addCriterion("linkmanid <", value, "linkmanid");
            return (Criteria) this;
        }

        public Criteria andLinkmanidLessThanOrEqualTo(Integer value) {
            addCriterion("linkmanid <=", value, "linkmanid");
            return (Criteria) this;
        }

        public Criteria andLinkmanidIn(List<Integer> values) {
            addCriterion("linkmanid in", values, "linkmanid");
            return (Criteria) this;
        }

        public Criteria andLinkmanidNotIn(List<Integer> values) {
            addCriterion("linkmanid not in", values, "linkmanid");
            return (Criteria) this;
        }

        public Criteria andLinkmanidBetween(Integer value1, Integer value2) {
            addCriterion("linkmanid between", value1, value2, "linkmanid");
            return (Criteria) this;
        }

        public Criteria andLinkmanidNotBetween(Integer value1, Integer value2) {
            addCriterion("linkmanid not between", value1, value2, "linkmanid");
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