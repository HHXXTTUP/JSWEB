package com.js.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KfGroupinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KfGroupinfoExample() {
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

        public Criteria andGroupnameIsNull() {
            addCriterion("groupname is null");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNotNull() {
            addCriterion("groupname is not null");
            return (Criteria) this;
        }

        public Criteria andGroupnameEqualTo(String value) {
            addCriterion("groupname =", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotEqualTo(String value) {
            addCriterion("groupname <>", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThan(String value) {
            addCriterion("groupname >", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("groupname >=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThan(String value) {
            addCriterion("groupname <", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThanOrEqualTo(String value) {
            addCriterion("groupname <=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLike(String value) {
            addCriterion("groupname like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotLike(String value) {
            addCriterion("groupname not like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameIn(List<String> values) {
            addCriterion("groupname in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotIn(List<String> values) {
            addCriterion("groupname not in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameBetween(String value1, String value2) {
            addCriterion("groupname between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotBetween(String value1, String value2) {
            addCriterion("groupname not between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupmemoIsNull() {
            addCriterion("groupmemo is null");
            return (Criteria) this;
        }

        public Criteria andGroupmemoIsNotNull() {
            addCriterion("groupmemo is not null");
            return (Criteria) this;
        }

        public Criteria andGroupmemoEqualTo(String value) {
            addCriterion("groupmemo =", value, "groupmemo");
            return (Criteria) this;
        }

        public Criteria andGroupmemoNotEqualTo(String value) {
            addCriterion("groupmemo <>", value, "groupmemo");
            return (Criteria) this;
        }

        public Criteria andGroupmemoGreaterThan(String value) {
            addCriterion("groupmemo >", value, "groupmemo");
            return (Criteria) this;
        }

        public Criteria andGroupmemoGreaterThanOrEqualTo(String value) {
            addCriterion("groupmemo >=", value, "groupmemo");
            return (Criteria) this;
        }

        public Criteria andGroupmemoLessThan(String value) {
            addCriterion("groupmemo <", value, "groupmemo");
            return (Criteria) this;
        }

        public Criteria andGroupmemoLessThanOrEqualTo(String value) {
            addCriterion("groupmemo <=", value, "groupmemo");
            return (Criteria) this;
        }

        public Criteria andGroupmemoLike(String value) {
            addCriterion("groupmemo like", value, "groupmemo");
            return (Criteria) this;
        }

        public Criteria andGroupmemoNotLike(String value) {
            addCriterion("groupmemo not like", value, "groupmemo");
            return (Criteria) this;
        }

        public Criteria andGroupmemoIn(List<String> values) {
            addCriterion("groupmemo in", values, "groupmemo");
            return (Criteria) this;
        }

        public Criteria andGroupmemoNotIn(List<String> values) {
            addCriterion("groupmemo not in", values, "groupmemo");
            return (Criteria) this;
        }

        public Criteria andGroupmemoBetween(String value1, String value2) {
            addCriterion("groupmemo between", value1, value2, "groupmemo");
            return (Criteria) this;
        }

        public Criteria andGroupmemoNotBetween(String value1, String value2) {
            addCriterion("groupmemo not between", value1, value2, "groupmemo");
            return (Criteria) this;
        }

        public Criteria andGroupuserIsNull() {
            addCriterion("groupuser is null");
            return (Criteria) this;
        }

        public Criteria andGroupuserIsNotNull() {
            addCriterion("groupuser is not null");
            return (Criteria) this;
        }

        public Criteria andGroupuserEqualTo(String value) {
            addCriterion("groupuser =", value, "groupuser");
            return (Criteria) this;
        }

        public Criteria andGroupuserNotEqualTo(String value) {
            addCriterion("groupuser <>", value, "groupuser");
            return (Criteria) this;
        }

        public Criteria andGroupuserGreaterThan(String value) {
            addCriterion("groupuser >", value, "groupuser");
            return (Criteria) this;
        }

        public Criteria andGroupuserGreaterThanOrEqualTo(String value) {
            addCriterion("groupuser >=", value, "groupuser");
            return (Criteria) this;
        }

        public Criteria andGroupuserLessThan(String value) {
            addCriterion("groupuser <", value, "groupuser");
            return (Criteria) this;
        }

        public Criteria andGroupuserLessThanOrEqualTo(String value) {
            addCriterion("groupuser <=", value, "groupuser");
            return (Criteria) this;
        }

        public Criteria andGroupuserLike(String value) {
            addCriterion("groupuser like", value, "groupuser");
            return (Criteria) this;
        }

        public Criteria andGroupuserNotLike(String value) {
            addCriterion("groupuser not like", value, "groupuser");
            return (Criteria) this;
        }

        public Criteria andGroupuserIn(List<String> values) {
            addCriterion("groupuser in", values, "groupuser");
            return (Criteria) this;
        }

        public Criteria andGroupuserNotIn(List<String> values) {
            addCriterion("groupuser not in", values, "groupuser");
            return (Criteria) this;
        }

        public Criteria andGroupuserBetween(String value1, String value2) {
            addCriterion("groupuser between", value1, value2, "groupuser");
            return (Criteria) this;
        }

        public Criteria andGroupuserNotBetween(String value1, String value2) {
            addCriterion("groupuser not between", value1, value2, "groupuser");
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

        public Criteria andGrouptwonameIsNull() {
            addCriterion("grouptwoname is null");
            return (Criteria) this;
        }

        public Criteria andGrouptwonameIsNotNull() {
            addCriterion("grouptwoname is not null");
            return (Criteria) this;
        }

        public Criteria andGrouptwonameEqualTo(String value) {
            addCriterion("grouptwoname =", value, "grouptwoname");
            return (Criteria) this;
        }

        public Criteria andGrouptwonameNotEqualTo(String value) {
            addCriterion("grouptwoname <>", value, "grouptwoname");
            return (Criteria) this;
        }

        public Criteria andGrouptwonameGreaterThan(String value) {
            addCriterion("grouptwoname >", value, "grouptwoname");
            return (Criteria) this;
        }

        public Criteria andGrouptwonameGreaterThanOrEqualTo(String value) {
            addCriterion("grouptwoname >=", value, "grouptwoname");
            return (Criteria) this;
        }

        public Criteria andGrouptwonameLessThan(String value) {
            addCriterion("grouptwoname <", value, "grouptwoname");
            return (Criteria) this;
        }

        public Criteria andGrouptwonameLessThanOrEqualTo(String value) {
            addCriterion("grouptwoname <=", value, "grouptwoname");
            return (Criteria) this;
        }

        public Criteria andGrouptwonameLike(String value) {
            addCriterion("grouptwoname like", value, "grouptwoname");
            return (Criteria) this;
        }

        public Criteria andGrouptwonameNotLike(String value) {
            addCriterion("grouptwoname not like", value, "grouptwoname");
            return (Criteria) this;
        }

        public Criteria andGrouptwonameIn(List<String> values) {
            addCriterion("grouptwoname in", values, "grouptwoname");
            return (Criteria) this;
        }

        public Criteria andGrouptwonameNotIn(List<String> values) {
            addCriterion("grouptwoname not in", values, "grouptwoname");
            return (Criteria) this;
        }

        public Criteria andGrouptwonameBetween(String value1, String value2) {
            addCriterion("grouptwoname between", value1, value2, "grouptwoname");
            return (Criteria) this;
        }

        public Criteria andGrouptwonameNotBetween(String value1, String value2) {
            addCriterion("grouptwoname not between", value1, value2, "grouptwoname");
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