package com.js.pojo;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuExample() {
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

        public Criteria andMENUIDIsNull() {
            addCriterion("MENUID is null");
            return (Criteria) this;
        }

        public Criteria andMENUIDIsNotNull() {
            addCriterion("MENUID is not null");
            return (Criteria) this;
        }

        public Criteria andMENUIDEqualTo(Integer value) {
            addCriterion("MENUID =", value, "MENUID");
            return (Criteria) this;
        }

        public Criteria andMENUIDNotEqualTo(Integer value) {
            addCriterion("MENUID <>", value, "MENUID");
            return (Criteria) this;
        }

        public Criteria andMENUIDGreaterThan(Integer value) {
            addCriterion("MENUID >", value, "MENUID");
            return (Criteria) this;
        }

        public Criteria andMENUIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("MENUID >=", value, "MENUID");
            return (Criteria) this;
        }

        public Criteria andMENUIDLessThan(Integer value) {
            addCriterion("MENUID <", value, "MENUID");
            return (Criteria) this;
        }

        public Criteria andMENUIDLessThanOrEqualTo(Integer value) {
            addCriterion("MENUID <=", value, "MENUID");
            return (Criteria) this;
        }

        public Criteria andMENUIDIn(List<Integer> values) {
            addCriterion("MENUID in", values, "MENUID");
            return (Criteria) this;
        }

        public Criteria andMENUIDNotIn(List<Integer> values) {
            addCriterion("MENUID not in", values, "MENUID");
            return (Criteria) this;
        }

        public Criteria andMENUIDBetween(Integer value1, Integer value2) {
            addCriterion("MENUID between", value1, value2, "MENUID");
            return (Criteria) this;
        }

        public Criteria andMENUIDNotBetween(Integer value1, Integer value2) {
            addCriterion("MENUID not between", value1, value2, "MENUID");
            return (Criteria) this;
        }

        public Criteria andUPIDIsNull() {
            addCriterion("UPID is null");
            return (Criteria) this;
        }

        public Criteria andUPIDIsNotNull() {
            addCriterion("UPID is not null");
            return (Criteria) this;
        }

        public Criteria andUPIDEqualTo(Integer value) {
            addCriterion("UPID =", value, "UPID");
            return (Criteria) this;
        }

        public Criteria andUPIDNotEqualTo(Integer value) {
            addCriterion("UPID <>", value, "UPID");
            return (Criteria) this;
        }

        public Criteria andUPIDGreaterThan(Integer value) {
            addCriterion("UPID >", value, "UPID");
            return (Criteria) this;
        }

        public Criteria andUPIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPID >=", value, "UPID");
            return (Criteria) this;
        }

        public Criteria andUPIDLessThan(Integer value) {
            addCriterion("UPID <", value, "UPID");
            return (Criteria) this;
        }

        public Criteria andUPIDLessThanOrEqualTo(Integer value) {
            addCriterion("UPID <=", value, "UPID");
            return (Criteria) this;
        }

        public Criteria andUPIDIn(List<Integer> values) {
            addCriterion("UPID in", values, "UPID");
            return (Criteria) this;
        }

        public Criteria andUPIDNotIn(List<Integer> values) {
            addCriterion("UPID not in", values, "UPID");
            return (Criteria) this;
        }

        public Criteria andUPIDBetween(Integer value1, Integer value2) {
            addCriterion("UPID between", value1, value2, "UPID");
            return (Criteria) this;
        }

        public Criteria andUPIDNotBetween(Integer value1, Integer value2) {
            addCriterion("UPID not between", value1, value2, "UPID");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("Rank is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("Rank is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(Integer value) {
            addCriterion("Rank =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(Integer value) {
            addCriterion("Rank <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(Integer value) {
            addCriterion("Rank >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("Rank >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(Integer value) {
            addCriterion("Rank <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(Integer value) {
            addCriterion("Rank <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<Integer> values) {
            addCriterion("Rank in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<Integer> values) {
            addCriterion("Rank not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(Integer value1, Integer value2) {
            addCriterion("Rank between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(Integer value1, Integer value2) {
            addCriterion("Rank not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("Title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("Title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("Title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("Title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("Title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("Title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("Title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("Title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("Title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("Title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("Title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("Title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("Title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("Icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("Icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("Icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("Icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("Icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("Icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("Icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("Icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("Icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("Icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("Icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("Icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("Icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("Icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andTargetIsNull() {
            addCriterion("Target is null");
            return (Criteria) this;
        }

        public Criteria andTargetIsNotNull() {
            addCriterion("Target is not null");
            return (Criteria) this;
        }

        public Criteria andTargetEqualTo(String value) {
            addCriterion("Target =", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotEqualTo(String value) {
            addCriterion("Target <>", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThan(String value) {
            addCriterion("Target >", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThanOrEqualTo(String value) {
            addCriterion("Target >=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThan(String value) {
            addCriterion("Target <", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThanOrEqualTo(String value) {
            addCriterion("Target <=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLike(String value) {
            addCriterion("Target like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotLike(String value) {
            addCriterion("Target not like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetIn(List<String> values) {
            addCriterion("Target in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotIn(List<String> values) {
            addCriterion("Target not in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetBetween(String value1, String value2) {
            addCriterion("Target between", value1, value2, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotBetween(String value1, String value2) {
            addCriterion("Target not between", value1, value2, "target");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("Sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("Sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("Sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("Sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("Sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("Sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("Sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("Sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("Sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("Sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("Sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andUserIDVerifyIsNull() {
            addCriterion("UserIDVerify is null");
            return (Criteria) this;
        }

        public Criteria andUserIDVerifyIsNotNull() {
            addCriterion("UserIDVerify is not null");
            return (Criteria) this;
        }

        public Criteria andUserIDVerifyEqualTo(Integer value) {
            addCriterion("UserIDVerify =", value, "userIDVerify");
            return (Criteria) this;
        }

        public Criteria andUserIDVerifyNotEqualTo(Integer value) {
            addCriterion("UserIDVerify <>", value, "userIDVerify");
            return (Criteria) this;
        }

        public Criteria andUserIDVerifyGreaterThan(Integer value) {
            addCriterion("UserIDVerify >", value, "userIDVerify");
            return (Criteria) this;
        }

        public Criteria andUserIDVerifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserIDVerify >=", value, "userIDVerify");
            return (Criteria) this;
        }

        public Criteria andUserIDVerifyLessThan(Integer value) {
            addCriterion("UserIDVerify <", value, "userIDVerify");
            return (Criteria) this;
        }

        public Criteria andUserIDVerifyLessThanOrEqualTo(Integer value) {
            addCriterion("UserIDVerify <=", value, "userIDVerify");
            return (Criteria) this;
        }

        public Criteria andUserIDVerifyIn(List<Integer> values) {
            addCriterion("UserIDVerify in", values, "userIDVerify");
            return (Criteria) this;
        }

        public Criteria andUserIDVerifyNotIn(List<Integer> values) {
            addCriterion("UserIDVerify not in", values, "userIDVerify");
            return (Criteria) this;
        }

        public Criteria andUserIDVerifyBetween(Integer value1, Integer value2) {
            addCriterion("UserIDVerify between", value1, value2, "userIDVerify");
            return (Criteria) this;
        }

        public Criteria andUserIDVerifyNotBetween(Integer value1, Integer value2) {
            addCriterion("UserIDVerify not between", value1, value2, "userIDVerify");
            return (Criteria) this;
        }

        public Criteria andModifyIDIsNull() {
            addCriterion("ModifyID is null");
            return (Criteria) this;
        }

        public Criteria andModifyIDIsNotNull() {
            addCriterion("ModifyID is not null");
            return (Criteria) this;
        }

        public Criteria andModifyIDEqualTo(String value) {
            addCriterion("ModifyID =", value, "modifyID");
            return (Criteria) this;
        }

        public Criteria andModifyIDNotEqualTo(String value) {
            addCriterion("ModifyID <>", value, "modifyID");
            return (Criteria) this;
        }

        public Criteria andModifyIDGreaterThan(String value) {
            addCriterion("ModifyID >", value, "modifyID");
            return (Criteria) this;
        }

        public Criteria andModifyIDGreaterThanOrEqualTo(String value) {
            addCriterion("ModifyID >=", value, "modifyID");
            return (Criteria) this;
        }

        public Criteria andModifyIDLessThan(String value) {
            addCriterion("ModifyID <", value, "modifyID");
            return (Criteria) this;
        }

        public Criteria andModifyIDLessThanOrEqualTo(String value) {
            addCriterion("ModifyID <=", value, "modifyID");
            return (Criteria) this;
        }

        public Criteria andModifyIDLike(String value) {
            addCriterion("ModifyID like", value, "modifyID");
            return (Criteria) this;
        }

        public Criteria andModifyIDNotLike(String value) {
            addCriterion("ModifyID not like", value, "modifyID");
            return (Criteria) this;
        }

        public Criteria andModifyIDIn(List<String> values) {
            addCriterion("ModifyID in", values, "modifyID");
            return (Criteria) this;
        }

        public Criteria andModifyIDNotIn(List<String> values) {
            addCriterion("ModifyID not in", values, "modifyID");
            return (Criteria) this;
        }

        public Criteria andModifyIDBetween(String value1, String value2) {
            addCriterion("ModifyID between", value1, value2, "modifyID");
            return (Criteria) this;
        }

        public Criteria andModifyIDNotBetween(String value1, String value2) {
            addCriterion("ModifyID not between", value1, value2, "modifyID");
            return (Criteria) this;
        }

        public Criteria andModifyDateTimeIsNull() {
            addCriterion("ModifyDateTime is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateTimeIsNotNull() {
            addCriterion("ModifyDateTime is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateTimeEqualTo(String value) {
            addCriterion("ModifyDateTime =", value, "modifyDateTime");
            return (Criteria) this;
        }

        public Criteria andModifyDateTimeNotEqualTo(String value) {
            addCriterion("ModifyDateTime <>", value, "modifyDateTime");
            return (Criteria) this;
        }

        public Criteria andModifyDateTimeGreaterThan(String value) {
            addCriterion("ModifyDateTime >", value, "modifyDateTime");
            return (Criteria) this;
        }

        public Criteria andModifyDateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ModifyDateTime >=", value, "modifyDateTime");
            return (Criteria) this;
        }

        public Criteria andModifyDateTimeLessThan(String value) {
            addCriterion("ModifyDateTime <", value, "modifyDateTime");
            return (Criteria) this;
        }

        public Criteria andModifyDateTimeLessThanOrEqualTo(String value) {
            addCriterion("ModifyDateTime <=", value, "modifyDateTime");
            return (Criteria) this;
        }

        public Criteria andModifyDateTimeLike(String value) {
            addCriterion("ModifyDateTime like", value, "modifyDateTime");
            return (Criteria) this;
        }

        public Criteria andModifyDateTimeNotLike(String value) {
            addCriterion("ModifyDateTime not like", value, "modifyDateTime");
            return (Criteria) this;
        }

        public Criteria andModifyDateTimeIn(List<String> values) {
            addCriterion("ModifyDateTime in", values, "modifyDateTime");
            return (Criteria) this;
        }

        public Criteria andModifyDateTimeNotIn(List<String> values) {
            addCriterion("ModifyDateTime not in", values, "modifyDateTime");
            return (Criteria) this;
        }

        public Criteria andModifyDateTimeBetween(String value1, String value2) {
            addCriterion("ModifyDateTime between", value1, value2, "modifyDateTime");
            return (Criteria) this;
        }

        public Criteria andModifyDateTimeNotBetween(String value1, String value2) {
            addCriterion("ModifyDateTime not between", value1, value2, "modifyDateTime");
            return (Criteria) this;
        }

        public Criteria andQxnameIsNull() {
            addCriterion("qxname is null");
            return (Criteria) this;
        }

        public Criteria andQxnameIsNotNull() {
            addCriterion("qxname is not null");
            return (Criteria) this;
        }

        public Criteria andQxnameEqualTo(String value) {
            addCriterion("qxname =", value, "qxname");
            return (Criteria) this;
        }

        public Criteria andQxnameNotEqualTo(String value) {
            addCriterion("qxname <>", value, "qxname");
            return (Criteria) this;
        }

        public Criteria andQxnameGreaterThan(String value) {
            addCriterion("qxname >", value, "qxname");
            return (Criteria) this;
        }

        public Criteria andQxnameGreaterThanOrEqualTo(String value) {
            addCriterion("qxname >=", value, "qxname");
            return (Criteria) this;
        }

        public Criteria andQxnameLessThan(String value) {
            addCriterion("qxname <", value, "qxname");
            return (Criteria) this;
        }

        public Criteria andQxnameLessThanOrEqualTo(String value) {
            addCriterion("qxname <=", value, "qxname");
            return (Criteria) this;
        }

        public Criteria andQxnameLike(String value) {
            addCriterion("qxname like", value, "qxname");
            return (Criteria) this;
        }

        public Criteria andQxnameNotLike(String value) {
            addCriterion("qxname not like", value, "qxname");
            return (Criteria) this;
        }

        public Criteria andQxnameIn(List<String> values) {
            addCriterion("qxname in", values, "qxname");
            return (Criteria) this;
        }

        public Criteria andQxnameNotIn(List<String> values) {
            addCriterion("qxname not in", values, "qxname");
            return (Criteria) this;
        }

        public Criteria andQxnameBetween(String value1, String value2) {
            addCriterion("qxname between", value1, value2, "qxname");
            return (Criteria) this;
        }

        public Criteria andQxnameNotBetween(String value1, String value2) {
            addCriterion("qxname not between", value1, value2, "qxname");
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