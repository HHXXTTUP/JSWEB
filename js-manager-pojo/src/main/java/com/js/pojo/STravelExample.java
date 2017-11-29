package com.js.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class STravelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public STravelExample() {
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

        public Criteria andIDIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIDIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIDEqualTo(Integer value) {
            addCriterion("ID =", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThan(Integer value) {
            addCriterion("ID >", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThan(Integer value) {
            addCriterion("ID <", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDIn(List<Integer> values) {
            addCriterion("ID in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("SName is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("SName is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("SName =", value, "SName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("SName <>", value, "SName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("SName >", value, "SName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("SName >=", value, "SName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("SName <", value, "SName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("SName <=", value, "SName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("SName like", value, "SName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("SName not like", value, "SName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("SName in", values, "SName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("SName not in", values, "SName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("SName between", value1, value2, "SName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("SName not between", value1, value2, "SName");
            return (Criteria) this;
        }

        public Criteria andSName2IsNull() {
            addCriterion("SName2 is null");
            return (Criteria) this;
        }

        public Criteria andSName2IsNotNull() {
            addCriterion("SName2 is not null");
            return (Criteria) this;
        }

        public Criteria andSName2EqualTo(String value) {
            addCriterion("SName2 =", value, "SName2");
            return (Criteria) this;
        }

        public Criteria andSName2NotEqualTo(String value) {
            addCriterion("SName2 <>", value, "SName2");
            return (Criteria) this;
        }

        public Criteria andSName2GreaterThan(String value) {
            addCriterion("SName2 >", value, "SName2");
            return (Criteria) this;
        }

        public Criteria andSName2GreaterThanOrEqualTo(String value) {
            addCriterion("SName2 >=", value, "SName2");
            return (Criteria) this;
        }

        public Criteria andSName2LessThan(String value) {
            addCriterion("SName2 <", value, "SName2");
            return (Criteria) this;
        }

        public Criteria andSName2LessThanOrEqualTo(String value) {
            addCriterion("SName2 <=", value, "SName2");
            return (Criteria) this;
        }

        public Criteria andSName2Like(String value) {
            addCriterion("SName2 like", value, "SName2");
            return (Criteria) this;
        }

        public Criteria andSName2NotLike(String value) {
            addCriterion("SName2 not like", value, "SName2");
            return (Criteria) this;
        }

        public Criteria andSName2In(List<String> values) {
            addCriterion("SName2 in", values, "SName2");
            return (Criteria) this;
        }

        public Criteria andSName2NotIn(List<String> values) {
            addCriterion("SName2 not in", values, "SName2");
            return (Criteria) this;
        }

        public Criteria andSName2Between(String value1, String value2) {
            addCriterion("SName2 between", value1, value2, "SName2");
            return (Criteria) this;
        }

        public Criteria andSName2NotBetween(String value1, String value2) {
            addCriterion("SName2 not between", value1, value2, "SName2");
            return (Criteria) this;
        }

        public Criteria andSMoneyIsNull() {
            addCriterion("SMoney is null");
            return (Criteria) this;
        }

        public Criteria andSMoneyIsNotNull() {
            addCriterion("SMoney is not null");
            return (Criteria) this;
        }

        public Criteria andSMoneyEqualTo(String value) {
            addCriterion("SMoney =", value, "SMoney");
            return (Criteria) this;
        }

        public Criteria andSMoneyNotEqualTo(String value) {
            addCriterion("SMoney <>", value, "SMoney");
            return (Criteria) this;
        }

        public Criteria andSMoneyGreaterThan(String value) {
            addCriterion("SMoney >", value, "SMoney");
            return (Criteria) this;
        }

        public Criteria andSMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("SMoney >=", value, "SMoney");
            return (Criteria) this;
        }

        public Criteria andSMoneyLessThan(String value) {
            addCriterion("SMoney <", value, "SMoney");
            return (Criteria) this;
        }

        public Criteria andSMoneyLessThanOrEqualTo(String value) {
            addCriterion("SMoney <=", value, "SMoney");
            return (Criteria) this;
        }

        public Criteria andSMoneyLike(String value) {
            addCriterion("SMoney like", value, "SMoney");
            return (Criteria) this;
        }

        public Criteria andSMoneyNotLike(String value) {
            addCriterion("SMoney not like", value, "SMoney");
            return (Criteria) this;
        }

        public Criteria andSMoneyIn(List<String> values) {
            addCriterion("SMoney in", values, "SMoney");
            return (Criteria) this;
        }

        public Criteria andSMoneyNotIn(List<String> values) {
            addCriterion("SMoney not in", values, "SMoney");
            return (Criteria) this;
        }

        public Criteria andSMoneyBetween(String value1, String value2) {
            addCriterion("SMoney between", value1, value2, "SMoney");
            return (Criteria) this;
        }

        public Criteria andSMoneyNotBetween(String value1, String value2) {
            addCriterion("SMoney not between", value1, value2, "SMoney");
            return (Criteria) this;
        }

        public Criteria andSDateIsNull() {
            addCriterion("SDate is null");
            return (Criteria) this;
        }

        public Criteria andSDateIsNotNull() {
            addCriterion("SDate is not null");
            return (Criteria) this;
        }

        public Criteria andSDateEqualTo(String value) {
            addCriterion("SDate =", value, "SDate");
            return (Criteria) this;
        }

        public Criteria andSDateNotEqualTo(String value) {
            addCriterion("SDate <>", value, "SDate");
            return (Criteria) this;
        }

        public Criteria andSDateGreaterThan(String value) {
            addCriterion("SDate >", value, "SDate");
            return (Criteria) this;
        }

        public Criteria andSDateGreaterThanOrEqualTo(String value) {
            addCriterion("SDate >=", value, "SDate");
            return (Criteria) this;
        }

        public Criteria andSDateLessThan(String value) {
            addCriterion("SDate <", value, "SDate");
            return (Criteria) this;
        }

        public Criteria andSDateLessThanOrEqualTo(String value) {
            addCriterion("SDate <=", value, "SDate");
            return (Criteria) this;
        }

        public Criteria andSDateLike(String value) {
            addCriterion("SDate like", value, "SDate");
            return (Criteria) this;
        }

        public Criteria andSDateNotLike(String value) {
            addCriterion("SDate not like", value, "SDate");
            return (Criteria) this;
        }

        public Criteria andSDateIn(List<String> values) {
            addCriterion("SDate in", values, "SDate");
            return (Criteria) this;
        }

        public Criteria andSDateNotIn(List<String> values) {
            addCriterion("SDate not in", values, "SDate");
            return (Criteria) this;
        }

        public Criteria andSDateBetween(String value1, String value2) {
            addCriterion("SDate between", value1, value2, "SDate");
            return (Criteria) this;
        }

        public Criteria andSDateNotBetween(String value1, String value2) {
            addCriterion("SDate not between", value1, value2, "SDate");
            return (Criteria) this;
        }

        public Criteria andSDate2IsNull() {
            addCriterion("SDate2 is null");
            return (Criteria) this;
        }

        public Criteria andSDate2IsNotNull() {
            addCriterion("SDate2 is not null");
            return (Criteria) this;
        }

        public Criteria andSDate2EqualTo(String value) {
            addCriterion("SDate2 =", value, "SDate2");
            return (Criteria) this;
        }

        public Criteria andSDate2NotEqualTo(String value) {
            addCriterion("SDate2 <>", value, "SDate2");
            return (Criteria) this;
        }

        public Criteria andSDate2GreaterThan(String value) {
            addCriterion("SDate2 >", value, "SDate2");
            return (Criteria) this;
        }

        public Criteria andSDate2GreaterThanOrEqualTo(String value) {
            addCriterion("SDate2 >=", value, "SDate2");
            return (Criteria) this;
        }

        public Criteria andSDate2LessThan(String value) {
            addCriterion("SDate2 <", value, "SDate2");
            return (Criteria) this;
        }

        public Criteria andSDate2LessThanOrEqualTo(String value) {
            addCriterion("SDate2 <=", value, "SDate2");
            return (Criteria) this;
        }

        public Criteria andSDate2Like(String value) {
            addCriterion("SDate2 like", value, "SDate2");
            return (Criteria) this;
        }

        public Criteria andSDate2NotLike(String value) {
            addCriterion("SDate2 not like", value, "SDate2");
            return (Criteria) this;
        }

        public Criteria andSDate2In(List<String> values) {
            addCriterion("SDate2 in", values, "SDate2");
            return (Criteria) this;
        }

        public Criteria andSDate2NotIn(List<String> values) {
            addCriterion("SDate2 not in", values, "SDate2");
            return (Criteria) this;
        }

        public Criteria andSDate2Between(String value1, String value2) {
            addCriterion("SDate2 between", value1, value2, "SDate2");
            return (Criteria) this;
        }

        public Criteria andSDate2NotBetween(String value1, String value2) {
            addCriterion("SDate2 not between", value1, value2, "SDate2");
            return (Criteria) this;
        }

        public Criteria andSZhuIsNull() {
            addCriterion("SZhu is null");
            return (Criteria) this;
        }

        public Criteria andSZhuIsNotNull() {
            addCriterion("SZhu is not null");
            return (Criteria) this;
        }

        public Criteria andSZhuEqualTo(String value) {
            addCriterion("SZhu =", value, "SZhu");
            return (Criteria) this;
        }

        public Criteria andSZhuNotEqualTo(String value) {
            addCriterion("SZhu <>", value, "SZhu");
            return (Criteria) this;
        }

        public Criteria andSZhuGreaterThan(String value) {
            addCriterion("SZhu >", value, "SZhu");
            return (Criteria) this;
        }

        public Criteria andSZhuGreaterThanOrEqualTo(String value) {
            addCriterion("SZhu >=", value, "SZhu");
            return (Criteria) this;
        }

        public Criteria andSZhuLessThan(String value) {
            addCriterion("SZhu <", value, "SZhu");
            return (Criteria) this;
        }

        public Criteria andSZhuLessThanOrEqualTo(String value) {
            addCriterion("SZhu <=", value, "SZhu");
            return (Criteria) this;
        }

        public Criteria andSZhuLike(String value) {
            addCriterion("SZhu like", value, "SZhu");
            return (Criteria) this;
        }

        public Criteria andSZhuNotLike(String value) {
            addCriterion("SZhu not like", value, "SZhu");
            return (Criteria) this;
        }

        public Criteria andSZhuIn(List<String> values) {
            addCriterion("SZhu in", values, "SZhu");
            return (Criteria) this;
        }

        public Criteria andSZhuNotIn(List<String> values) {
            addCriterion("SZhu not in", values, "SZhu");
            return (Criteria) this;
        }

        public Criteria andSZhuBetween(String value1, String value2) {
            addCriterion("SZhu between", value1, value2, "SZhu");
            return (Criteria) this;
        }

        public Criteria andSZhuNotBetween(String value1, String value2) {
            addCriterion("SZhu not between", value1, value2, "SZhu");
            return (Criteria) this;
        }

        public Criteria andSCarIsNull() {
            addCriterion("SCar is null");
            return (Criteria) this;
        }

        public Criteria andSCarIsNotNull() {
            addCriterion("SCar is not null");
            return (Criteria) this;
        }

        public Criteria andSCarEqualTo(String value) {
            addCriterion("SCar =", value, "SCar");
            return (Criteria) this;
        }

        public Criteria andSCarNotEqualTo(String value) {
            addCriterion("SCar <>", value, "SCar");
            return (Criteria) this;
        }

        public Criteria andSCarGreaterThan(String value) {
            addCriterion("SCar >", value, "SCar");
            return (Criteria) this;
        }

        public Criteria andSCarGreaterThanOrEqualTo(String value) {
            addCriterion("SCar >=", value, "SCar");
            return (Criteria) this;
        }

        public Criteria andSCarLessThan(String value) {
            addCriterion("SCar <", value, "SCar");
            return (Criteria) this;
        }

        public Criteria andSCarLessThanOrEqualTo(String value) {
            addCriterion("SCar <=", value, "SCar");
            return (Criteria) this;
        }

        public Criteria andSCarLike(String value) {
            addCriterion("SCar like", value, "SCar");
            return (Criteria) this;
        }

        public Criteria andSCarNotLike(String value) {
            addCriterion("SCar not like", value, "SCar");
            return (Criteria) this;
        }

        public Criteria andSCarIn(List<String> values) {
            addCriterion("SCar in", values, "SCar");
            return (Criteria) this;
        }

        public Criteria andSCarNotIn(List<String> values) {
            addCriterion("SCar not in", values, "SCar");
            return (Criteria) this;
        }

        public Criteria andSCarBetween(String value1, String value2) {
            addCriterion("SCar between", value1, value2, "SCar");
            return (Criteria) this;
        }

        public Criteria andSCarNotBetween(String value1, String value2) {
            addCriterion("SCar not between", value1, value2, "SCar");
            return (Criteria) this;
        }

        public Criteria andSLdOtherMemoIsNull() {
            addCriterion("SLdOtherMemo is null");
            return (Criteria) this;
        }

        public Criteria andSLdOtherMemoIsNotNull() {
            addCriterion("SLdOtherMemo is not null");
            return (Criteria) this;
        }

        public Criteria andSLdOtherMemoEqualTo(String value) {
            addCriterion("SLdOtherMemo =", value, "SLdOtherMemo");
            return (Criteria) this;
        }

        public Criteria andSLdOtherMemoNotEqualTo(String value) {
            addCriterion("SLdOtherMemo <>", value, "SLdOtherMemo");
            return (Criteria) this;
        }

        public Criteria andSLdOtherMemoGreaterThan(String value) {
            addCriterion("SLdOtherMemo >", value, "SLdOtherMemo");
            return (Criteria) this;
        }

        public Criteria andSLdOtherMemoGreaterThanOrEqualTo(String value) {
            addCriterion("SLdOtherMemo >=", value, "SLdOtherMemo");
            return (Criteria) this;
        }

        public Criteria andSLdOtherMemoLessThan(String value) {
            addCriterion("SLdOtherMemo <", value, "SLdOtherMemo");
            return (Criteria) this;
        }

        public Criteria andSLdOtherMemoLessThanOrEqualTo(String value) {
            addCriterion("SLdOtherMemo <=", value, "SLdOtherMemo");
            return (Criteria) this;
        }

        public Criteria andSLdOtherMemoLike(String value) {
            addCriterion("SLdOtherMemo like", value, "SLdOtherMemo");
            return (Criteria) this;
        }

        public Criteria andSLdOtherMemoNotLike(String value) {
            addCriterion("SLdOtherMemo not like", value, "SLdOtherMemo");
            return (Criteria) this;
        }

        public Criteria andSLdOtherMemoIn(List<String> values) {
            addCriterion("SLdOtherMemo in", values, "SLdOtherMemo");
            return (Criteria) this;
        }

        public Criteria andSLdOtherMemoNotIn(List<String> values) {
            addCriterion("SLdOtherMemo not in", values, "SLdOtherMemo");
            return (Criteria) this;
        }

        public Criteria andSLdOtherMemoBetween(String value1, String value2) {
            addCriterion("SLdOtherMemo between", value1, value2, "SLdOtherMemo");
            return (Criteria) this;
        }

        public Criteria andSLdOtherMemoNotBetween(String value1, String value2) {
            addCriterion("SLdOtherMemo not between", value1, value2, "SLdOtherMemo");
            return (Criteria) this;
        }

        public Criteria andSMoneyMemoIsNull() {
            addCriterion("SMoneyMemo is null");
            return (Criteria) this;
        }

        public Criteria andSMoneyMemoIsNotNull() {
            addCriterion("SMoneyMemo is not null");
            return (Criteria) this;
        }

        public Criteria andSMoneyMemoEqualTo(String value) {
            addCriterion("SMoneyMemo =", value, "SMoneyMemo");
            return (Criteria) this;
        }

        public Criteria andSMoneyMemoNotEqualTo(String value) {
            addCriterion("SMoneyMemo <>", value, "SMoneyMemo");
            return (Criteria) this;
        }

        public Criteria andSMoneyMemoGreaterThan(String value) {
            addCriterion("SMoneyMemo >", value, "SMoneyMemo");
            return (Criteria) this;
        }

        public Criteria andSMoneyMemoGreaterThanOrEqualTo(String value) {
            addCriterion("SMoneyMemo >=", value, "SMoneyMemo");
            return (Criteria) this;
        }

        public Criteria andSMoneyMemoLessThan(String value) {
            addCriterion("SMoneyMemo <", value, "SMoneyMemo");
            return (Criteria) this;
        }

        public Criteria andSMoneyMemoLessThanOrEqualTo(String value) {
            addCriterion("SMoneyMemo <=", value, "SMoneyMemo");
            return (Criteria) this;
        }

        public Criteria andSMoneyMemoLike(String value) {
            addCriterion("SMoneyMemo like", value, "SMoneyMemo");
            return (Criteria) this;
        }

        public Criteria andSMoneyMemoNotLike(String value) {
            addCriterion("SMoneyMemo not like", value, "SMoneyMemo");
            return (Criteria) this;
        }

        public Criteria andSMoneyMemoIn(List<String> values) {
            addCriterion("SMoneyMemo in", values, "SMoneyMemo");
            return (Criteria) this;
        }

        public Criteria andSMoneyMemoNotIn(List<String> values) {
            addCriterion("SMoneyMemo not in", values, "SMoneyMemo");
            return (Criteria) this;
        }

        public Criteria andSMoneyMemoBetween(String value1, String value2) {
            addCriterion("SMoneyMemo between", value1, value2, "SMoneyMemo");
            return (Criteria) this;
        }

        public Criteria andSMoneyMemoNotBetween(String value1, String value2) {
            addCriterion("SMoneyMemo not between", value1, value2, "SMoneyMemo");
            return (Criteria) this;
        }

        public Criteria andAddDateIsNull() {
            addCriterion("AddDate is null");
            return (Criteria) this;
        }

        public Criteria andAddDateIsNotNull() {
            addCriterion("AddDate is not null");
            return (Criteria) this;
        }

        public Criteria andAddDateEqualTo(Date value) {
            addCriterion("AddDate =", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotEqualTo(Date value) {
            addCriterion("AddDate <>", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateGreaterThan(Date value) {
            addCriterion("AddDate >", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateGreaterThanOrEqualTo(Date value) {
            addCriterion("AddDate >=", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateLessThan(Date value) {
            addCriterion("AddDate <", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateLessThanOrEqualTo(Date value) {
            addCriterion("AddDate <=", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateIn(List<Date> values) {
            addCriterion("AddDate in", values, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotIn(List<Date> values) {
            addCriterion("AddDate not in", values, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateBetween(Date value1, Date value2) {
            addCriterion("AddDate between", value1, value2, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotBetween(Date value1, Date value2) {
            addCriterion("AddDate not between", value1, value2, "addDate");
            return (Criteria) this;
        }

        public Criteria andSxwNameIsNull() {
            addCriterion("SxwName is null");
            return (Criteria) this;
        }

        public Criteria andSxwNameIsNotNull() {
            addCriterion("SxwName is not null");
            return (Criteria) this;
        }

        public Criteria andSxwNameEqualTo(String value) {
            addCriterion("SxwName =", value, "sxwName");
            return (Criteria) this;
        }

        public Criteria andSxwNameNotEqualTo(String value) {
            addCriterion("SxwName <>", value, "sxwName");
            return (Criteria) this;
        }

        public Criteria andSxwNameGreaterThan(String value) {
            addCriterion("SxwName >", value, "sxwName");
            return (Criteria) this;
        }

        public Criteria andSxwNameGreaterThanOrEqualTo(String value) {
            addCriterion("SxwName >=", value, "sxwName");
            return (Criteria) this;
        }

        public Criteria andSxwNameLessThan(String value) {
            addCriterion("SxwName <", value, "sxwName");
            return (Criteria) this;
        }

        public Criteria andSxwNameLessThanOrEqualTo(String value) {
            addCriterion("SxwName <=", value, "sxwName");
            return (Criteria) this;
        }

        public Criteria andSxwNameLike(String value) {
            addCriterion("SxwName like", value, "sxwName");
            return (Criteria) this;
        }

        public Criteria andSxwNameNotLike(String value) {
            addCriterion("SxwName not like", value, "sxwName");
            return (Criteria) this;
        }

        public Criteria andSxwNameIn(List<String> values) {
            addCriterion("SxwName in", values, "sxwName");
            return (Criteria) this;
        }

        public Criteria andSxwNameNotIn(List<String> values) {
            addCriterion("SxwName not in", values, "sxwName");
            return (Criteria) this;
        }

        public Criteria andSxwNameBetween(String value1, String value2) {
            addCriterion("SxwName between", value1, value2, "sxwName");
            return (Criteria) this;
        }

        public Criteria andSxwNameNotBetween(String value1, String value2) {
            addCriterion("SxwName not between", value1, value2, "sxwName");
            return (Criteria) this;
        }

        public Criteria andOneLDNameIsNull() {
            addCriterion("OneLDName is null");
            return (Criteria) this;
        }

        public Criteria andOneLDNameIsNotNull() {
            addCriterion("OneLDName is not null");
            return (Criteria) this;
        }

        public Criteria andOneLDNameEqualTo(String value) {
            addCriterion("OneLDName =", value, "oneLDName");
            return (Criteria) this;
        }

        public Criteria andOneLDNameNotEqualTo(String value) {
            addCriterion("OneLDName <>", value, "oneLDName");
            return (Criteria) this;
        }

        public Criteria andOneLDNameGreaterThan(String value) {
            addCriterion("OneLDName >", value, "oneLDName");
            return (Criteria) this;
        }

        public Criteria andOneLDNameGreaterThanOrEqualTo(String value) {
            addCriterion("OneLDName >=", value, "oneLDName");
            return (Criteria) this;
        }

        public Criteria andOneLDNameLessThan(String value) {
            addCriterion("OneLDName <", value, "oneLDName");
            return (Criteria) this;
        }

        public Criteria andOneLDNameLessThanOrEqualTo(String value) {
            addCriterion("OneLDName <=", value, "oneLDName");
            return (Criteria) this;
        }

        public Criteria andOneLDNameLike(String value) {
            addCriterion("OneLDName like", value, "oneLDName");
            return (Criteria) this;
        }

        public Criteria andOneLDNameNotLike(String value) {
            addCriterion("OneLDName not like", value, "oneLDName");
            return (Criteria) this;
        }

        public Criteria andOneLDNameIn(List<String> values) {
            addCriterion("OneLDName in", values, "oneLDName");
            return (Criteria) this;
        }

        public Criteria andOneLDNameNotIn(List<String> values) {
            addCriterion("OneLDName not in", values, "oneLDName");
            return (Criteria) this;
        }

        public Criteria andOneLDNameBetween(String value1, String value2) {
            addCriterion("OneLDName between", value1, value2, "oneLDName");
            return (Criteria) this;
        }

        public Criteria andOneLDNameNotBetween(String value1, String value2) {
            addCriterion("OneLDName not between", value1, value2, "oneLDName");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_1IsNull() {
            addCriterion("HuiBao1_1 is null");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_1IsNotNull() {
            addCriterion("HuiBao1_1 is not null");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_1EqualTo(String value) {
            addCriterion("HuiBao1_1 =", value, "huiBao1_1");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_1NotEqualTo(String value) {
            addCriterion("HuiBao1_1 <>", value, "huiBao1_1");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_1GreaterThan(String value) {
            addCriterion("HuiBao1_1 >", value, "huiBao1_1");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_1GreaterThanOrEqualTo(String value) {
            addCriterion("HuiBao1_1 >=", value, "huiBao1_1");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_1LessThan(String value) {
            addCriterion("HuiBao1_1 <", value, "huiBao1_1");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_1LessThanOrEqualTo(String value) {
            addCriterion("HuiBao1_1 <=", value, "huiBao1_1");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_1Like(String value) {
            addCriterion("HuiBao1_1 like", value, "huiBao1_1");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_1NotLike(String value) {
            addCriterion("HuiBao1_1 not like", value, "huiBao1_1");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_1In(List<String> values) {
            addCriterion("HuiBao1_1 in", values, "huiBao1_1");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_1NotIn(List<String> values) {
            addCriterion("HuiBao1_1 not in", values, "huiBao1_1");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_1Between(String value1, String value2) {
            addCriterion("HuiBao1_1 between", value1, value2, "huiBao1_1");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_1NotBetween(String value1, String value2) {
            addCriterion("HuiBao1_1 not between", value1, value2, "huiBao1_1");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_2IsNull() {
            addCriterion("HuiBao1_2 is null");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_2IsNotNull() {
            addCriterion("HuiBao1_2 is not null");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_2EqualTo(String value) {
            addCriterion("HuiBao1_2 =", value, "huiBao1_2");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_2NotEqualTo(String value) {
            addCriterion("HuiBao1_2 <>", value, "huiBao1_2");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_2GreaterThan(String value) {
            addCriterion("HuiBao1_2 >", value, "huiBao1_2");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_2GreaterThanOrEqualTo(String value) {
            addCriterion("HuiBao1_2 >=", value, "huiBao1_2");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_2LessThan(String value) {
            addCriterion("HuiBao1_2 <", value, "huiBao1_2");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_2LessThanOrEqualTo(String value) {
            addCriterion("HuiBao1_2 <=", value, "huiBao1_2");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_2Like(String value) {
            addCriterion("HuiBao1_2 like", value, "huiBao1_2");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_2NotLike(String value) {
            addCriterion("HuiBao1_2 not like", value, "huiBao1_2");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_2In(List<String> values) {
            addCriterion("HuiBao1_2 in", values, "huiBao1_2");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_2NotIn(List<String> values) {
            addCriterion("HuiBao1_2 not in", values, "huiBao1_2");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_2Between(String value1, String value2) {
            addCriterion("HuiBao1_2 between", value1, value2, "huiBao1_2");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_2NotBetween(String value1, String value2) {
            addCriterion("HuiBao1_2 not between", value1, value2, "huiBao1_2");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_CorpNameIsNull() {
            addCriterion("HuiBao1_CorpName is null");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_CorpNameIsNotNull() {
            addCriterion("HuiBao1_CorpName is not null");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_CorpNameEqualTo(String value) {
            addCriterion("HuiBao1_CorpName =", value, "huiBao1_CorpName");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_CorpNameNotEqualTo(String value) {
            addCriterion("HuiBao1_CorpName <>", value, "huiBao1_CorpName");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_CorpNameGreaterThan(String value) {
            addCriterion("HuiBao1_CorpName >", value, "huiBao1_CorpName");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_CorpNameGreaterThanOrEqualTo(String value) {
            addCriterion("HuiBao1_CorpName >=", value, "huiBao1_CorpName");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_CorpNameLessThan(String value) {
            addCriterion("HuiBao1_CorpName <", value, "huiBao1_CorpName");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_CorpNameLessThanOrEqualTo(String value) {
            addCriterion("HuiBao1_CorpName <=", value, "huiBao1_CorpName");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_CorpNameLike(String value) {
            addCriterion("HuiBao1_CorpName like", value, "huiBao1_CorpName");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_CorpNameNotLike(String value) {
            addCriterion("HuiBao1_CorpName not like", value, "huiBao1_CorpName");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_CorpNameIn(List<String> values) {
            addCriterion("HuiBao1_CorpName in", values, "huiBao1_CorpName");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_CorpNameNotIn(List<String> values) {
            addCriterion("HuiBao1_CorpName not in", values, "huiBao1_CorpName");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_CorpNameBetween(String value1, String value2) {
            addCriterion("HuiBao1_CorpName between", value1, value2, "huiBao1_CorpName");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_CorpNameNotBetween(String value1, String value2) {
            addCriterion("HuiBao1_CorpName not between", value1, value2, "huiBao1_CorpName");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_3IsNull() {
            addCriterion("HuiBao1_3 is null");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_3IsNotNull() {
            addCriterion("HuiBao1_3 is not null");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_3EqualTo(String value) {
            addCriterion("HuiBao1_3 =", value, "huiBao1_3");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_3NotEqualTo(String value) {
            addCriterion("HuiBao1_3 <>", value, "huiBao1_3");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_3GreaterThan(String value) {
            addCriterion("HuiBao1_3 >", value, "huiBao1_3");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_3GreaterThanOrEqualTo(String value) {
            addCriterion("HuiBao1_3 >=", value, "huiBao1_3");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_3LessThan(String value) {
            addCriterion("HuiBao1_3 <", value, "huiBao1_3");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_3LessThanOrEqualTo(String value) {
            addCriterion("HuiBao1_3 <=", value, "huiBao1_3");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_3Like(String value) {
            addCriterion("HuiBao1_3 like", value, "huiBao1_3");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_3NotLike(String value) {
            addCriterion("HuiBao1_3 not like", value, "huiBao1_3");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_3In(List<String> values) {
            addCriterion("HuiBao1_3 in", values, "huiBao1_3");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_3NotIn(List<String> values) {
            addCriterion("HuiBao1_3 not in", values, "huiBao1_3");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_3Between(String value1, String value2) {
            addCriterion("HuiBao1_3 between", value1, value2, "huiBao1_3");
            return (Criteria) this;
        }

        public Criteria andHuiBao1_3NotBetween(String value1, String value2) {
            addCriterion("HuiBao1_3 not between", value1, value2, "huiBao1_3");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_1IsNull() {
            addCriterion("HuiBao2_1 is null");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_1IsNotNull() {
            addCriterion("HuiBao2_1 is not null");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_1EqualTo(String value) {
            addCriterion("HuiBao2_1 =", value, "huiBao2_1");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_1NotEqualTo(String value) {
            addCriterion("HuiBao2_1 <>", value, "huiBao2_1");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_1GreaterThan(String value) {
            addCriterion("HuiBao2_1 >", value, "huiBao2_1");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_1GreaterThanOrEqualTo(String value) {
            addCriterion("HuiBao2_1 >=", value, "huiBao2_1");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_1LessThan(String value) {
            addCriterion("HuiBao2_1 <", value, "huiBao2_1");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_1LessThanOrEqualTo(String value) {
            addCriterion("HuiBao2_1 <=", value, "huiBao2_1");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_1Like(String value) {
            addCriterion("HuiBao2_1 like", value, "huiBao2_1");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_1NotLike(String value) {
            addCriterion("HuiBao2_1 not like", value, "huiBao2_1");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_1In(List<String> values) {
            addCriterion("HuiBao2_1 in", values, "huiBao2_1");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_1NotIn(List<String> values) {
            addCriterion("HuiBao2_1 not in", values, "huiBao2_1");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_1Between(String value1, String value2) {
            addCriterion("HuiBao2_1 between", value1, value2, "huiBao2_1");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_1NotBetween(String value1, String value2) {
            addCriterion("HuiBao2_1 not between", value1, value2, "huiBao2_1");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_3IsNull() {
            addCriterion("HuiBao2_3 is null");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_3IsNotNull() {
            addCriterion("HuiBao2_3 is not null");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_3EqualTo(String value) {
            addCriterion("HuiBao2_3 =", value, "huiBao2_3");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_3NotEqualTo(String value) {
            addCriterion("HuiBao2_3 <>", value, "huiBao2_3");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_3GreaterThan(String value) {
            addCriterion("HuiBao2_3 >", value, "huiBao2_3");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_3GreaterThanOrEqualTo(String value) {
            addCriterion("HuiBao2_3 >=", value, "huiBao2_3");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_3LessThan(String value) {
            addCriterion("HuiBao2_3 <", value, "huiBao2_3");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_3LessThanOrEqualTo(String value) {
            addCriterion("HuiBao2_3 <=", value, "huiBao2_3");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_3Like(String value) {
            addCriterion("HuiBao2_3 like", value, "huiBao2_3");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_3NotLike(String value) {
            addCriterion("HuiBao2_3 not like", value, "huiBao2_3");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_3In(List<String> values) {
            addCriterion("HuiBao2_3 in", values, "huiBao2_3");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_3NotIn(List<String> values) {
            addCriterion("HuiBao2_3 not in", values, "huiBao2_3");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_3Between(String value1, String value2) {
            addCriterion("HuiBao2_3 between", value1, value2, "huiBao2_3");
            return (Criteria) this;
        }

        public Criteria andHuiBao2_3NotBetween(String value1, String value2) {
            addCriterion("HuiBao2_3 not between", value1, value2, "huiBao2_3");
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

        public Criteria andUserinfoid2IsNull() {
            addCriterion("userinfoid2 is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoid2IsNotNull() {
            addCriterion("userinfoid2 is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoid2EqualTo(Integer value) {
            addCriterion("userinfoid2 =", value, "userinfoid2");
            return (Criteria) this;
        }

        public Criteria andUserinfoid2NotEqualTo(Integer value) {
            addCriterion("userinfoid2 <>", value, "userinfoid2");
            return (Criteria) this;
        }

        public Criteria andUserinfoid2GreaterThan(Integer value) {
            addCriterion("userinfoid2 >", value, "userinfoid2");
            return (Criteria) this;
        }

        public Criteria andUserinfoid2GreaterThanOrEqualTo(Integer value) {
            addCriterion("userinfoid2 >=", value, "userinfoid2");
            return (Criteria) this;
        }

        public Criteria andUserinfoid2LessThan(Integer value) {
            addCriterion("userinfoid2 <", value, "userinfoid2");
            return (Criteria) this;
        }

        public Criteria andUserinfoid2LessThanOrEqualTo(Integer value) {
            addCriterion("userinfoid2 <=", value, "userinfoid2");
            return (Criteria) this;
        }

        public Criteria andUserinfoid2In(List<Integer> values) {
            addCriterion("userinfoid2 in", values, "userinfoid2");
            return (Criteria) this;
        }

        public Criteria andUserinfoid2NotIn(List<Integer> values) {
            addCriterion("userinfoid2 not in", values, "userinfoid2");
            return (Criteria) this;
        }

        public Criteria andUserinfoid2Between(Integer value1, Integer value2) {
            addCriterion("userinfoid2 between", value1, value2, "userinfoid2");
            return (Criteria) this;
        }

        public Criteria andUserinfoid2NotBetween(Integer value1, Integer value2) {
            addCriterion("userinfoid2 not between", value1, value2, "userinfoid2");
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