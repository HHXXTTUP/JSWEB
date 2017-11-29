package com.js.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FCorpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FCorpExample() {
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

        public Criteria andCorpKeyWordIsNull() {
            addCriterion("CorpKeyWord is null");
            return (Criteria) this;
        }

        public Criteria andCorpKeyWordIsNotNull() {
            addCriterion("CorpKeyWord is not null");
            return (Criteria) this;
        }

        public Criteria andCorpKeyWordEqualTo(String value) {
            addCriterion("CorpKeyWord =", value, "corpKeyWord");
            return (Criteria) this;
        }

        public Criteria andCorpKeyWordNotEqualTo(String value) {
            addCriterion("CorpKeyWord <>", value, "corpKeyWord");
            return (Criteria) this;
        }

        public Criteria andCorpKeyWordGreaterThan(String value) {
            addCriterion("CorpKeyWord >", value, "corpKeyWord");
            return (Criteria) this;
        }

        public Criteria andCorpKeyWordGreaterThanOrEqualTo(String value) {
            addCriterion("CorpKeyWord >=", value, "corpKeyWord");
            return (Criteria) this;
        }

        public Criteria andCorpKeyWordLessThan(String value) {
            addCriterion("CorpKeyWord <", value, "corpKeyWord");
            return (Criteria) this;
        }

        public Criteria andCorpKeyWordLessThanOrEqualTo(String value) {
            addCriterion("CorpKeyWord <=", value, "corpKeyWord");
            return (Criteria) this;
        }

        public Criteria andCorpKeyWordLike(String value) {
            addCriterion("CorpKeyWord like", value, "corpKeyWord");
            return (Criteria) this;
        }

        public Criteria andCorpKeyWordNotLike(String value) {
            addCriterion("CorpKeyWord not like", value, "corpKeyWord");
            return (Criteria) this;
        }

        public Criteria andCorpKeyWordIn(List<String> values) {
            addCriterion("CorpKeyWord in", values, "corpKeyWord");
            return (Criteria) this;
        }

        public Criteria andCorpKeyWordNotIn(List<String> values) {
            addCriterion("CorpKeyWord not in", values, "corpKeyWord");
            return (Criteria) this;
        }

        public Criteria andCorpKeyWordBetween(String value1, String value2) {
            addCriterion("CorpKeyWord between", value1, value2, "corpKeyWord");
            return (Criteria) this;
        }

        public Criteria andCorpKeyWordNotBetween(String value1, String value2) {
            addCriterion("CorpKeyWord not between", value1, value2, "corpKeyWord");
            return (Criteria) this;
        }

        public Criteria andLogNameIsNull() {
            addCriterion("LogName is null");
            return (Criteria) this;
        }

        public Criteria andLogNameIsNotNull() {
            addCriterion("LogName is not null");
            return (Criteria) this;
        }

        public Criteria andLogNameEqualTo(String value) {
            addCriterion("LogName =", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotEqualTo(String value) {
            addCriterion("LogName <>", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameGreaterThan(String value) {
            addCriterion("LogName >", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameGreaterThanOrEqualTo(String value) {
            addCriterion("LogName >=", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameLessThan(String value) {
            addCriterion("LogName <", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameLessThanOrEqualTo(String value) {
            addCriterion("LogName <=", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameLike(String value) {
            addCriterion("LogName like", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotLike(String value) {
            addCriterion("LogName not like", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameIn(List<String> values) {
            addCriterion("LogName in", values, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotIn(List<String> values) {
            addCriterion("LogName not in", values, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameBetween(String value1, String value2) {
            addCriterion("LogName between", value1, value2, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotBetween(String value1, String value2) {
            addCriterion("LogName not between", value1, value2, "logName");
            return (Criteria) this;
        }

        public Criteria andLogPassIsNull() {
            addCriterion("LogPass is null");
            return (Criteria) this;
        }

        public Criteria andLogPassIsNotNull() {
            addCriterion("LogPass is not null");
            return (Criteria) this;
        }

        public Criteria andLogPassEqualTo(String value) {
            addCriterion("LogPass =", value, "logPass");
            return (Criteria) this;
        }

        public Criteria andLogPassNotEqualTo(String value) {
            addCriterion("LogPass <>", value, "logPass");
            return (Criteria) this;
        }

        public Criteria andLogPassGreaterThan(String value) {
            addCriterion("LogPass >", value, "logPass");
            return (Criteria) this;
        }

        public Criteria andLogPassGreaterThanOrEqualTo(String value) {
            addCriterion("LogPass >=", value, "logPass");
            return (Criteria) this;
        }

        public Criteria andLogPassLessThan(String value) {
            addCriterion("LogPass <", value, "logPass");
            return (Criteria) this;
        }

        public Criteria andLogPassLessThanOrEqualTo(String value) {
            addCriterion("LogPass <=", value, "logPass");
            return (Criteria) this;
        }

        public Criteria andLogPassLike(String value) {
            addCriterion("LogPass like", value, "logPass");
            return (Criteria) this;
        }

        public Criteria andLogPassNotLike(String value) {
            addCriterion("LogPass not like", value, "logPass");
            return (Criteria) this;
        }

        public Criteria andLogPassIn(List<String> values) {
            addCriterion("LogPass in", values, "logPass");
            return (Criteria) this;
        }

        public Criteria andLogPassNotIn(List<String> values) {
            addCriterion("LogPass not in", values, "logPass");
            return (Criteria) this;
        }

        public Criteria andLogPassBetween(String value1, String value2) {
            addCriterion("LogPass between", value1, value2, "logPass");
            return (Criteria) this;
        }

        public Criteria andLogPassNotBetween(String value1, String value2) {
            addCriterion("LogPass not between", value1, value2, "logPass");
            return (Criteria) this;
        }

        public Criteria andModPassIsNull() {
            addCriterion("ModPass is null");
            return (Criteria) this;
        }

        public Criteria andModPassIsNotNull() {
            addCriterion("ModPass is not null");
            return (Criteria) this;
        }

        public Criteria andModPassEqualTo(String value) {
            addCriterion("ModPass =", value, "modPass");
            return (Criteria) this;
        }

        public Criteria andModPassNotEqualTo(String value) {
            addCriterion("ModPass <>", value, "modPass");
            return (Criteria) this;
        }

        public Criteria andModPassGreaterThan(String value) {
            addCriterion("ModPass >", value, "modPass");
            return (Criteria) this;
        }

        public Criteria andModPassGreaterThanOrEqualTo(String value) {
            addCriterion("ModPass >=", value, "modPass");
            return (Criteria) this;
        }

        public Criteria andModPassLessThan(String value) {
            addCriterion("ModPass <", value, "modPass");
            return (Criteria) this;
        }

        public Criteria andModPassLessThanOrEqualTo(String value) {
            addCriterion("ModPass <=", value, "modPass");
            return (Criteria) this;
        }

        public Criteria andModPassLike(String value) {
            addCriterion("ModPass like", value, "modPass");
            return (Criteria) this;
        }

        public Criteria andModPassNotLike(String value) {
            addCriterion("ModPass not like", value, "modPass");
            return (Criteria) this;
        }

        public Criteria andModPassIn(List<String> values) {
            addCriterion("ModPass in", values, "modPass");
            return (Criteria) this;
        }

        public Criteria andModPassNotIn(List<String> values) {
            addCriterion("ModPass not in", values, "modPass");
            return (Criteria) this;
        }

        public Criteria andModPassBetween(String value1, String value2) {
            addCriterion("ModPass between", value1, value2, "modPass");
            return (Criteria) this;
        }

        public Criteria andModPassNotBetween(String value1, String value2) {
            addCriterion("ModPass not between", value1, value2, "modPass");
            return (Criteria) this;
        }

        public Criteria andCorpCateIsNull() {
            addCriterion("CorpCate is null");
            return (Criteria) this;
        }

        public Criteria andCorpCateIsNotNull() {
            addCriterion("CorpCate is not null");
            return (Criteria) this;
        }

        public Criteria andCorpCateEqualTo(String value) {
            addCriterion("CorpCate =", value, "corpCate");
            return (Criteria) this;
        }

        public Criteria andCorpCateNotEqualTo(String value) {
            addCriterion("CorpCate <>", value, "corpCate");
            return (Criteria) this;
        }

        public Criteria andCorpCateGreaterThan(String value) {
            addCriterion("CorpCate >", value, "corpCate");
            return (Criteria) this;
        }

        public Criteria andCorpCateGreaterThanOrEqualTo(String value) {
            addCriterion("CorpCate >=", value, "corpCate");
            return (Criteria) this;
        }

        public Criteria andCorpCateLessThan(String value) {
            addCriterion("CorpCate <", value, "corpCate");
            return (Criteria) this;
        }

        public Criteria andCorpCateLessThanOrEqualTo(String value) {
            addCriterion("CorpCate <=", value, "corpCate");
            return (Criteria) this;
        }

        public Criteria andCorpCateLike(String value) {
            addCriterion("CorpCate like", value, "corpCate");
            return (Criteria) this;
        }

        public Criteria andCorpCateNotLike(String value) {
            addCriterion("CorpCate not like", value, "corpCate");
            return (Criteria) this;
        }

        public Criteria andCorpCateIn(List<String> values) {
            addCriterion("CorpCate in", values, "corpCate");
            return (Criteria) this;
        }

        public Criteria andCorpCateNotIn(List<String> values) {
            addCriterion("CorpCate not in", values, "corpCate");
            return (Criteria) this;
        }

        public Criteria andCorpCateBetween(String value1, String value2) {
            addCriterion("CorpCate between", value1, value2, "corpCate");
            return (Criteria) this;
        }

        public Criteria andCorpCateNotBetween(String value1, String value2) {
            addCriterion("CorpCate not between", value1, value2, "corpCate");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("Area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("Area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("Area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("Area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("Area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("Area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("Area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("Area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("Area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("Area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("Area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("Area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("Area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("Area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andArea_S1IsNull() {
            addCriterion("Area_S1 is null");
            return (Criteria) this;
        }

        public Criteria andArea_S1IsNotNull() {
            addCriterion("Area_S1 is not null");
            return (Criteria) this;
        }

        public Criteria andArea_S1EqualTo(String value) {
            addCriterion("Area_S1 =", value, "area_S1");
            return (Criteria) this;
        }

        public Criteria andArea_S1NotEqualTo(String value) {
            addCriterion("Area_S1 <>", value, "area_S1");
            return (Criteria) this;
        }

        public Criteria andArea_S1GreaterThan(String value) {
            addCriterion("Area_S1 >", value, "area_S1");
            return (Criteria) this;
        }

        public Criteria andArea_S1GreaterThanOrEqualTo(String value) {
            addCriterion("Area_S1 >=", value, "area_S1");
            return (Criteria) this;
        }

        public Criteria andArea_S1LessThan(String value) {
            addCriterion("Area_S1 <", value, "area_S1");
            return (Criteria) this;
        }

        public Criteria andArea_S1LessThanOrEqualTo(String value) {
            addCriterion("Area_S1 <=", value, "area_S1");
            return (Criteria) this;
        }

        public Criteria andArea_S1Like(String value) {
            addCriterion("Area_S1 like", value, "area_S1");
            return (Criteria) this;
        }

        public Criteria andArea_S1NotLike(String value) {
            addCriterion("Area_S1 not like", value, "area_S1");
            return (Criteria) this;
        }

        public Criteria andArea_S1In(List<String> values) {
            addCriterion("Area_S1 in", values, "area_S1");
            return (Criteria) this;
        }

        public Criteria andArea_S1NotIn(List<String> values) {
            addCriterion("Area_S1 not in", values, "area_S1");
            return (Criteria) this;
        }

        public Criteria andArea_S1Between(String value1, String value2) {
            addCriterion("Area_S1 between", value1, value2, "area_S1");
            return (Criteria) this;
        }

        public Criteria andArea_S1NotBetween(String value1, String value2) {
            addCriterion("Area_S1 not between", value1, value2, "area_S1");
            return (Criteria) this;
        }

        public Criteria andArea_S2IsNull() {
            addCriterion("Area_S2 is null");
            return (Criteria) this;
        }

        public Criteria andArea_S2IsNotNull() {
            addCriterion("Area_S2 is not null");
            return (Criteria) this;
        }

        public Criteria andArea_S2EqualTo(String value) {
            addCriterion("Area_S2 =", value, "area_S2");
            return (Criteria) this;
        }

        public Criteria andArea_S2NotEqualTo(String value) {
            addCriterion("Area_S2 <>", value, "area_S2");
            return (Criteria) this;
        }

        public Criteria andArea_S2GreaterThan(String value) {
            addCriterion("Area_S2 >", value, "area_S2");
            return (Criteria) this;
        }

        public Criteria andArea_S2GreaterThanOrEqualTo(String value) {
            addCriterion("Area_S2 >=", value, "area_S2");
            return (Criteria) this;
        }

        public Criteria andArea_S2LessThan(String value) {
            addCriterion("Area_S2 <", value, "area_S2");
            return (Criteria) this;
        }

        public Criteria andArea_S2LessThanOrEqualTo(String value) {
            addCriterion("Area_S2 <=", value, "area_S2");
            return (Criteria) this;
        }

        public Criteria andArea_S2Like(String value) {
            addCriterion("Area_S2 like", value, "area_S2");
            return (Criteria) this;
        }

        public Criteria andArea_S2NotLike(String value) {
            addCriterion("Area_S2 not like", value, "area_S2");
            return (Criteria) this;
        }

        public Criteria andArea_S2In(List<String> values) {
            addCriterion("Area_S2 in", values, "area_S2");
            return (Criteria) this;
        }

        public Criteria andArea_S2NotIn(List<String> values) {
            addCriterion("Area_S2 not in", values, "area_S2");
            return (Criteria) this;
        }

        public Criteria andArea_S2Between(String value1, String value2) {
            addCriterion("Area_S2 between", value1, value2, "area_S2");
            return (Criteria) this;
        }

        public Criteria andArea_S2NotBetween(String value1, String value2) {
            addCriterion("Area_S2 not between", value1, value2, "area_S2");
            return (Criteria) this;
        }

        public Criteria andArea_S3IsNull() {
            addCriterion("Area_S3 is null");
            return (Criteria) this;
        }

        public Criteria andArea_S3IsNotNull() {
            addCriterion("Area_S3 is not null");
            return (Criteria) this;
        }

        public Criteria andArea_S3EqualTo(String value) {
            addCriterion("Area_S3 =", value, "area_S3");
            return (Criteria) this;
        }

        public Criteria andArea_S3NotEqualTo(String value) {
            addCriterion("Area_S3 <>", value, "area_S3");
            return (Criteria) this;
        }

        public Criteria andArea_S3GreaterThan(String value) {
            addCriterion("Area_S3 >", value, "area_S3");
            return (Criteria) this;
        }

        public Criteria andArea_S3GreaterThanOrEqualTo(String value) {
            addCriterion("Area_S3 >=", value, "area_S3");
            return (Criteria) this;
        }

        public Criteria andArea_S3LessThan(String value) {
            addCriterion("Area_S3 <", value, "area_S3");
            return (Criteria) this;
        }

        public Criteria andArea_S3LessThanOrEqualTo(String value) {
            addCriterion("Area_S3 <=", value, "area_S3");
            return (Criteria) this;
        }

        public Criteria andArea_S3Like(String value) {
            addCriterion("Area_S3 like", value, "area_S3");
            return (Criteria) this;
        }

        public Criteria andArea_S3NotLike(String value) {
            addCriterion("Area_S3 not like", value, "area_S3");
            return (Criteria) this;
        }

        public Criteria andArea_S3In(List<String> values) {
            addCriterion("Area_S3 in", values, "area_S3");
            return (Criteria) this;
        }

        public Criteria andArea_S3NotIn(List<String> values) {
            addCriterion("Area_S3 not in", values, "area_S3");
            return (Criteria) this;
        }

        public Criteria andArea_S3Between(String value1, String value2) {
            addCriterion("Area_S3 between", value1, value2, "area_S3");
            return (Criteria) this;
        }

        public Criteria andArea_S3NotBetween(String value1, String value2) {
            addCriterion("Area_S3 not between", value1, value2, "area_S3");
            return (Criteria) this;
        }

        public Criteria andArea_S4IsNull() {
            addCriterion("Area_S4 is null");
            return (Criteria) this;
        }

        public Criteria andArea_S4IsNotNull() {
            addCriterion("Area_S4 is not null");
            return (Criteria) this;
        }

        public Criteria andArea_S4EqualTo(String value) {
            addCriterion("Area_S4 =", value, "area_S4");
            return (Criteria) this;
        }

        public Criteria andArea_S4NotEqualTo(String value) {
            addCriterion("Area_S4 <>", value, "area_S4");
            return (Criteria) this;
        }

        public Criteria andArea_S4GreaterThan(String value) {
            addCriterion("Area_S4 >", value, "area_S4");
            return (Criteria) this;
        }

        public Criteria andArea_S4GreaterThanOrEqualTo(String value) {
            addCriterion("Area_S4 >=", value, "area_S4");
            return (Criteria) this;
        }

        public Criteria andArea_S4LessThan(String value) {
            addCriterion("Area_S4 <", value, "area_S4");
            return (Criteria) this;
        }

        public Criteria andArea_S4LessThanOrEqualTo(String value) {
            addCriterion("Area_S4 <=", value, "area_S4");
            return (Criteria) this;
        }

        public Criteria andArea_S4Like(String value) {
            addCriterion("Area_S4 like", value, "area_S4");
            return (Criteria) this;
        }

        public Criteria andArea_S4NotLike(String value) {
            addCriterion("Area_S4 not like", value, "area_S4");
            return (Criteria) this;
        }

        public Criteria andArea_S4In(List<String> values) {
            addCriterion("Area_S4 in", values, "area_S4");
            return (Criteria) this;
        }

        public Criteria andArea_S4NotIn(List<String> values) {
            addCriterion("Area_S4 not in", values, "area_S4");
            return (Criteria) this;
        }

        public Criteria andArea_S4Between(String value1, String value2) {
            addCriterion("Area_S4 between", value1, value2, "area_S4");
            return (Criteria) this;
        }

        public Criteria andArea_S4NotBetween(String value1, String value2) {
            addCriterion("Area_S4 not between", value1, value2, "area_S4");
            return (Criteria) this;
        }

        public Criteria andZipIsNull() {
            addCriterion("Zip is null");
            return (Criteria) this;
        }

        public Criteria andZipIsNotNull() {
            addCriterion("Zip is not null");
            return (Criteria) this;
        }

        public Criteria andZipEqualTo(String value) {
            addCriterion("Zip =", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotEqualTo(String value) {
            addCriterion("Zip <>", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipGreaterThan(String value) {
            addCriterion("Zip >", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipGreaterThanOrEqualTo(String value) {
            addCriterion("Zip >=", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLessThan(String value) {
            addCriterion("Zip <", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLessThanOrEqualTo(String value) {
            addCriterion("Zip <=", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLike(String value) {
            addCriterion("Zip like", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotLike(String value) {
            addCriterion("Zip not like", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipIn(List<String> values) {
            addCriterion("Zip in", values, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotIn(List<String> values) {
            addCriterion("Zip not in", values, "zip");
            return (Criteria) this;
        }

        public Criteria andZipBetween(String value1, String value2) {
            addCriterion("Zip between", value1, value2, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotBetween(String value1, String value2) {
            addCriterion("Zip not between", value1, value2, "zip");
            return (Criteria) this;
        }

        public Criteria andCorpPhoneIsNull() {
            addCriterion("CorpPhone is null");
            return (Criteria) this;
        }

        public Criteria andCorpPhoneIsNotNull() {
            addCriterion("CorpPhone is not null");
            return (Criteria) this;
        }

        public Criteria andCorpPhoneEqualTo(String value) {
            addCriterion("CorpPhone =", value, "corpPhone");
            return (Criteria) this;
        }

        public Criteria andCorpPhoneNotEqualTo(String value) {
            addCriterion("CorpPhone <>", value, "corpPhone");
            return (Criteria) this;
        }

        public Criteria andCorpPhoneGreaterThan(String value) {
            addCriterion("CorpPhone >", value, "corpPhone");
            return (Criteria) this;
        }

        public Criteria andCorpPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("CorpPhone >=", value, "corpPhone");
            return (Criteria) this;
        }

        public Criteria andCorpPhoneLessThan(String value) {
            addCriterion("CorpPhone <", value, "corpPhone");
            return (Criteria) this;
        }

        public Criteria andCorpPhoneLessThanOrEqualTo(String value) {
            addCriterion("CorpPhone <=", value, "corpPhone");
            return (Criteria) this;
        }

        public Criteria andCorpPhoneLike(String value) {
            addCriterion("CorpPhone like", value, "corpPhone");
            return (Criteria) this;
        }

        public Criteria andCorpPhoneNotLike(String value) {
            addCriterion("CorpPhone not like", value, "corpPhone");
            return (Criteria) this;
        }

        public Criteria andCorpPhoneIn(List<String> values) {
            addCriterion("CorpPhone in", values, "corpPhone");
            return (Criteria) this;
        }

        public Criteria andCorpPhoneNotIn(List<String> values) {
            addCriterion("CorpPhone not in", values, "corpPhone");
            return (Criteria) this;
        }

        public Criteria andCorpPhoneBetween(String value1, String value2) {
            addCriterion("CorpPhone between", value1, value2, "corpPhone");
            return (Criteria) this;
        }

        public Criteria andCorpPhoneNotBetween(String value1, String value2) {
            addCriterion("CorpPhone not between", value1, value2, "corpPhone");
            return (Criteria) this;
        }

        public Criteria andCorpFaxIsNull() {
            addCriterion("CorpFax is null");
            return (Criteria) this;
        }

        public Criteria andCorpFaxIsNotNull() {
            addCriterion("CorpFax is not null");
            return (Criteria) this;
        }

        public Criteria andCorpFaxEqualTo(String value) {
            addCriterion("CorpFax =", value, "corpFax");
            return (Criteria) this;
        }

        public Criteria andCorpFaxNotEqualTo(String value) {
            addCriterion("CorpFax <>", value, "corpFax");
            return (Criteria) this;
        }

        public Criteria andCorpFaxGreaterThan(String value) {
            addCriterion("CorpFax >", value, "corpFax");
            return (Criteria) this;
        }

        public Criteria andCorpFaxGreaterThanOrEqualTo(String value) {
            addCriterion("CorpFax >=", value, "corpFax");
            return (Criteria) this;
        }

        public Criteria andCorpFaxLessThan(String value) {
            addCriterion("CorpFax <", value, "corpFax");
            return (Criteria) this;
        }

        public Criteria andCorpFaxLessThanOrEqualTo(String value) {
            addCriterion("CorpFax <=", value, "corpFax");
            return (Criteria) this;
        }

        public Criteria andCorpFaxLike(String value) {
            addCriterion("CorpFax like", value, "corpFax");
            return (Criteria) this;
        }

        public Criteria andCorpFaxNotLike(String value) {
            addCriterion("CorpFax not like", value, "corpFax");
            return (Criteria) this;
        }

        public Criteria andCorpFaxIn(List<String> values) {
            addCriterion("CorpFax in", values, "corpFax");
            return (Criteria) this;
        }

        public Criteria andCorpFaxNotIn(List<String> values) {
            addCriterion("CorpFax not in", values, "corpFax");
            return (Criteria) this;
        }

        public Criteria andCorpFaxBetween(String value1, String value2) {
            addCriterion("CorpFax between", value1, value2, "corpFax");
            return (Criteria) this;
        }

        public Criteria andCorpFaxNotBetween(String value1, String value2) {
            addCriterion("CorpFax not between", value1, value2, "corpFax");
            return (Criteria) this;
        }

        public Criteria andImageNameIsNull() {
            addCriterion("ImageName is null");
            return (Criteria) this;
        }

        public Criteria andImageNameIsNotNull() {
            addCriterion("ImageName is not null");
            return (Criteria) this;
        }

        public Criteria andImageNameEqualTo(String value) {
            addCriterion("ImageName =", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotEqualTo(String value) {
            addCriterion("ImageName <>", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameGreaterThan(String value) {
            addCriterion("ImageName >", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameGreaterThanOrEqualTo(String value) {
            addCriterion("ImageName >=", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLessThan(String value) {
            addCriterion("ImageName <", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLessThanOrEqualTo(String value) {
            addCriterion("ImageName <=", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLike(String value) {
            addCriterion("ImageName like", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotLike(String value) {
            addCriterion("ImageName not like", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameIn(List<String> values) {
            addCriterion("ImageName in", values, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotIn(List<String> values) {
            addCriterion("ImageName not in", values, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameBetween(String value1, String value2) {
            addCriterion("ImageName between", value1, value2, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotBetween(String value1, String value2) {
            addCriterion("ImageName not between", value1, value2, "imageName");
            return (Criteria) this;
        }

        public Criteria andContNameIsNull() {
            addCriterion("ContName is null");
            return (Criteria) this;
        }

        public Criteria andContNameIsNotNull() {
            addCriterion("ContName is not null");
            return (Criteria) this;
        }

        public Criteria andContNameEqualTo(String value) {
            addCriterion("ContName =", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameNotEqualTo(String value) {
            addCriterion("ContName <>", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameGreaterThan(String value) {
            addCriterion("ContName >", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameGreaterThanOrEqualTo(String value) {
            addCriterion("ContName >=", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameLessThan(String value) {
            addCriterion("ContName <", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameLessThanOrEqualTo(String value) {
            addCriterion("ContName <=", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameLike(String value) {
            addCriterion("ContName like", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameNotLike(String value) {
            addCriterion("ContName not like", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameIn(List<String> values) {
            addCriterion("ContName in", values, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameNotIn(List<String> values) {
            addCriterion("ContName not in", values, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameBetween(String value1, String value2) {
            addCriterion("ContName between", value1, value2, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameNotBetween(String value1, String value2) {
            addCriterion("ContName not between", value1, value2, "contName");
            return (Criteria) this;
        }

        public Criteria andContSexIsNull() {
            addCriterion("ContSex is null");
            return (Criteria) this;
        }

        public Criteria andContSexIsNotNull() {
            addCriterion("ContSex is not null");
            return (Criteria) this;
        }

        public Criteria andContSexEqualTo(String value) {
            addCriterion("ContSex =", value, "contSex");
            return (Criteria) this;
        }

        public Criteria andContSexNotEqualTo(String value) {
            addCriterion("ContSex <>", value, "contSex");
            return (Criteria) this;
        }

        public Criteria andContSexGreaterThan(String value) {
            addCriterion("ContSex >", value, "contSex");
            return (Criteria) this;
        }

        public Criteria andContSexGreaterThanOrEqualTo(String value) {
            addCriterion("ContSex >=", value, "contSex");
            return (Criteria) this;
        }

        public Criteria andContSexLessThan(String value) {
            addCriterion("ContSex <", value, "contSex");
            return (Criteria) this;
        }

        public Criteria andContSexLessThanOrEqualTo(String value) {
            addCriterion("ContSex <=", value, "contSex");
            return (Criteria) this;
        }

        public Criteria andContSexLike(String value) {
            addCriterion("ContSex like", value, "contSex");
            return (Criteria) this;
        }

        public Criteria andContSexNotLike(String value) {
            addCriterion("ContSex not like", value, "contSex");
            return (Criteria) this;
        }

        public Criteria andContSexIn(List<String> values) {
            addCriterion("ContSex in", values, "contSex");
            return (Criteria) this;
        }

        public Criteria andContSexNotIn(List<String> values) {
            addCriterion("ContSex not in", values, "contSex");
            return (Criteria) this;
        }

        public Criteria andContSexBetween(String value1, String value2) {
            addCriterion("ContSex between", value1, value2, "contSex");
            return (Criteria) this;
        }

        public Criteria andContSexNotBetween(String value1, String value2) {
            addCriterion("ContSex not between", value1, value2, "contSex");
            return (Criteria) this;
        }

        public Criteria andContJobIsNull() {
            addCriterion("ContJob is null");
            return (Criteria) this;
        }

        public Criteria andContJobIsNotNull() {
            addCriterion("ContJob is not null");
            return (Criteria) this;
        }

        public Criteria andContJobEqualTo(String value) {
            addCriterion("ContJob =", value, "contJob");
            return (Criteria) this;
        }

        public Criteria andContJobNotEqualTo(String value) {
            addCriterion("ContJob <>", value, "contJob");
            return (Criteria) this;
        }

        public Criteria andContJobGreaterThan(String value) {
            addCriterion("ContJob >", value, "contJob");
            return (Criteria) this;
        }

        public Criteria andContJobGreaterThanOrEqualTo(String value) {
            addCriterion("ContJob >=", value, "contJob");
            return (Criteria) this;
        }

        public Criteria andContJobLessThan(String value) {
            addCriterion("ContJob <", value, "contJob");
            return (Criteria) this;
        }

        public Criteria andContJobLessThanOrEqualTo(String value) {
            addCriterion("ContJob <=", value, "contJob");
            return (Criteria) this;
        }

        public Criteria andContJobLike(String value) {
            addCriterion("ContJob like", value, "contJob");
            return (Criteria) this;
        }

        public Criteria andContJobNotLike(String value) {
            addCriterion("ContJob not like", value, "contJob");
            return (Criteria) this;
        }

        public Criteria andContJobIn(List<String> values) {
            addCriterion("ContJob in", values, "contJob");
            return (Criteria) this;
        }

        public Criteria andContJobNotIn(List<String> values) {
            addCriterion("ContJob not in", values, "contJob");
            return (Criteria) this;
        }

        public Criteria andContJobBetween(String value1, String value2) {
            addCriterion("ContJob between", value1, value2, "contJob");
            return (Criteria) this;
        }

        public Criteria andContJobNotBetween(String value1, String value2) {
            addCriterion("ContJob not between", value1, value2, "contJob");
            return (Criteria) this;
        }

        public Criteria andContTelIsNull() {
            addCriterion("ContTel is null");
            return (Criteria) this;
        }

        public Criteria andContTelIsNotNull() {
            addCriterion("ContTel is not null");
            return (Criteria) this;
        }

        public Criteria andContTelEqualTo(String value) {
            addCriterion("ContTel =", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelNotEqualTo(String value) {
            addCriterion("ContTel <>", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelGreaterThan(String value) {
            addCriterion("ContTel >", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelGreaterThanOrEqualTo(String value) {
            addCriterion("ContTel >=", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelLessThan(String value) {
            addCriterion("ContTel <", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelLessThanOrEqualTo(String value) {
            addCriterion("ContTel <=", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelLike(String value) {
            addCriterion("ContTel like", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelNotLike(String value) {
            addCriterion("ContTel not like", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelIn(List<String> values) {
            addCriterion("ContTel in", values, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelNotIn(List<String> values) {
            addCriterion("ContTel not in", values, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelBetween(String value1, String value2) {
            addCriterion("ContTel between", value1, value2, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelNotBetween(String value1, String value2) {
            addCriterion("ContTel not between", value1, value2, "contTel");
            return (Criteria) this;
        }

        public Criteria andContFaxIsNull() {
            addCriterion("ContFax is null");
            return (Criteria) this;
        }

        public Criteria andContFaxIsNotNull() {
            addCriterion("ContFax is not null");
            return (Criteria) this;
        }

        public Criteria andContFaxEqualTo(String value) {
            addCriterion("ContFax =", value, "contFax");
            return (Criteria) this;
        }

        public Criteria andContFaxNotEqualTo(String value) {
            addCriterion("ContFax <>", value, "contFax");
            return (Criteria) this;
        }

        public Criteria andContFaxGreaterThan(String value) {
            addCriterion("ContFax >", value, "contFax");
            return (Criteria) this;
        }

        public Criteria andContFaxGreaterThanOrEqualTo(String value) {
            addCriterion("ContFax >=", value, "contFax");
            return (Criteria) this;
        }

        public Criteria andContFaxLessThan(String value) {
            addCriterion("ContFax <", value, "contFax");
            return (Criteria) this;
        }

        public Criteria andContFaxLessThanOrEqualTo(String value) {
            addCriterion("ContFax <=", value, "contFax");
            return (Criteria) this;
        }

        public Criteria andContFaxLike(String value) {
            addCriterion("ContFax like", value, "contFax");
            return (Criteria) this;
        }

        public Criteria andContFaxNotLike(String value) {
            addCriterion("ContFax not like", value, "contFax");
            return (Criteria) this;
        }

        public Criteria andContFaxIn(List<String> values) {
            addCriterion("ContFax in", values, "contFax");
            return (Criteria) this;
        }

        public Criteria andContFaxNotIn(List<String> values) {
            addCriterion("ContFax not in", values, "contFax");
            return (Criteria) this;
        }

        public Criteria andContFaxBetween(String value1, String value2) {
            addCriterion("ContFax between", value1, value2, "contFax");
            return (Criteria) this;
        }

        public Criteria andContFaxNotBetween(String value1, String value2) {
            addCriterion("ContFax not between", value1, value2, "contFax");
            return (Criteria) this;
        }

        public Criteria andContMobileIsNull() {
            addCriterion("ContMobile is null");
            return (Criteria) this;
        }

        public Criteria andContMobileIsNotNull() {
            addCriterion("ContMobile is not null");
            return (Criteria) this;
        }

        public Criteria andContMobileEqualTo(String value) {
            addCriterion("ContMobile =", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileNotEqualTo(String value) {
            addCriterion("ContMobile <>", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileGreaterThan(String value) {
            addCriterion("ContMobile >", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileGreaterThanOrEqualTo(String value) {
            addCriterion("ContMobile >=", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileLessThan(String value) {
            addCriterion("ContMobile <", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileLessThanOrEqualTo(String value) {
            addCriterion("ContMobile <=", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileLike(String value) {
            addCriterion("ContMobile like", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileNotLike(String value) {
            addCriterion("ContMobile not like", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileIn(List<String> values) {
            addCriterion("ContMobile in", values, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileNotIn(List<String> values) {
            addCriterion("ContMobile not in", values, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileBetween(String value1, String value2) {
            addCriterion("ContMobile between", value1, value2, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileNotBetween(String value1, String value2) {
            addCriterion("ContMobile not between", value1, value2, "contMobile");
            return (Criteria) this;
        }

        public Criteria andQQIsNull() {
            addCriterion("QQ is null");
            return (Criteria) this;
        }

        public Criteria andQQIsNotNull() {
            addCriterion("QQ is not null");
            return (Criteria) this;
        }

        public Criteria andQQEqualTo(String value) {
            addCriterion("QQ =", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQNotEqualTo(String value) {
            addCriterion("QQ <>", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQGreaterThan(String value) {
            addCriterion("QQ >", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQGreaterThanOrEqualTo(String value) {
            addCriterion("QQ >=", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQLessThan(String value) {
            addCriterion("QQ <", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQLessThanOrEqualTo(String value) {
            addCriterion("QQ <=", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQLike(String value) {
            addCriterion("QQ like", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQNotLike(String value) {
            addCriterion("QQ not like", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQIn(List<String> values) {
            addCriterion("QQ in", values, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQNotIn(List<String> values) {
            addCriterion("QQ not in", values, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQBetween(String value1, String value2) {
            addCriterion("QQ between", value1, value2, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQNotBetween(String value1, String value2) {
            addCriterion("QQ not between", value1, value2, "QQ");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNull() {
            addCriterion("RegDate is null");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNotNull() {
            addCriterion("RegDate is not null");
            return (Criteria) this;
        }

        public Criteria andRegDateEqualTo(Date value) {
            addCriterion("RegDate =", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotEqualTo(Date value) {
            addCriterion("RegDate <>", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThan(Date value) {
            addCriterion("RegDate >", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThanOrEqualTo(Date value) {
            addCriterion("RegDate >=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThan(Date value) {
            addCriterion("RegDate <", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThanOrEqualTo(Date value) {
            addCriterion("RegDate <=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateIn(List<Date> values) {
            addCriterion("RegDate in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotIn(List<Date> values) {
            addCriterion("RegDate not in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateBetween(Date value1, Date value2) {
            addCriterion("RegDate between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotBetween(Date value1, Date value2) {
            addCriterion("RegDate not between", value1, value2, "regDate");
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

        public Criteria andIsGoodIsNull() {
            addCriterion("IsGood is null");
            return (Criteria) this;
        }

        public Criteria andIsGoodIsNotNull() {
            addCriterion("IsGood is not null");
            return (Criteria) this;
        }

        public Criteria andIsGoodEqualTo(Integer value) {
            addCriterion("IsGood =", value, "isGood");
            return (Criteria) this;
        }

        public Criteria andIsGoodNotEqualTo(Integer value) {
            addCriterion("IsGood <>", value, "isGood");
            return (Criteria) this;
        }

        public Criteria andIsGoodGreaterThan(Integer value) {
            addCriterion("IsGood >", value, "isGood");
            return (Criteria) this;
        }

        public Criteria andIsGoodGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsGood >=", value, "isGood");
            return (Criteria) this;
        }

        public Criteria andIsGoodLessThan(Integer value) {
            addCriterion("IsGood <", value, "isGood");
            return (Criteria) this;
        }

        public Criteria andIsGoodLessThanOrEqualTo(Integer value) {
            addCriterion("IsGood <=", value, "isGood");
            return (Criteria) this;
        }

        public Criteria andIsGoodIn(List<Integer> values) {
            addCriterion("IsGood in", values, "isGood");
            return (Criteria) this;
        }

        public Criteria andIsGoodNotIn(List<Integer> values) {
            addCriterion("IsGood not in", values, "isGood");
            return (Criteria) this;
        }

        public Criteria andIsGoodBetween(Integer value1, Integer value2) {
            addCriterion("IsGood between", value1, value2, "isGood");
            return (Criteria) this;
        }

        public Criteria andIsGoodNotBetween(Integer value1, Integer value2) {
            addCriterion("IsGood not between", value1, value2, "isGood");
            return (Criteria) this;
        }

        public Criteria andClickIsNull() {
            addCriterion("Click is null");
            return (Criteria) this;
        }

        public Criteria andClickIsNotNull() {
            addCriterion("Click is not null");
            return (Criteria) this;
        }

        public Criteria andClickEqualTo(Integer value) {
            addCriterion("Click =", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotEqualTo(Integer value) {
            addCriterion("Click <>", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickGreaterThan(Integer value) {
            addCriterion("Click >", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickGreaterThanOrEqualTo(Integer value) {
            addCriterion("Click >=", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickLessThan(Integer value) {
            addCriterion("Click <", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickLessThanOrEqualTo(Integer value) {
            addCriterion("Click <=", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickIn(List<Integer> values) {
            addCriterion("Click in", values, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotIn(List<Integer> values) {
            addCriterion("Click not in", values, "click");
            return (Criteria) this;
        }

        public Criteria andClickBetween(Integer value1, Integer value2) {
            addCriterion("Click between", value1, value2, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotBetween(Integer value1, Integer value2) {
            addCriterion("Click not between", value1, value2, "click");
            return (Criteria) this;
        }

        public Criteria andClick_HyIsNull() {
            addCriterion("Click_Hy is null");
            return (Criteria) this;
        }

        public Criteria andClick_HyIsNotNull() {
            addCriterion("Click_Hy is not null");
            return (Criteria) this;
        }

        public Criteria andClick_HyEqualTo(Integer value) {
            addCriterion("Click_Hy =", value, "click_Hy");
            return (Criteria) this;
        }

        public Criteria andClick_HyNotEqualTo(Integer value) {
            addCriterion("Click_Hy <>", value, "click_Hy");
            return (Criteria) this;
        }

        public Criteria andClick_HyGreaterThan(Integer value) {
            addCriterion("Click_Hy >", value, "click_Hy");
            return (Criteria) this;
        }

        public Criteria andClick_HyGreaterThanOrEqualTo(Integer value) {
            addCriterion("Click_Hy >=", value, "click_Hy");
            return (Criteria) this;
        }

        public Criteria andClick_HyLessThan(Integer value) {
            addCriterion("Click_Hy <", value, "click_Hy");
            return (Criteria) this;
        }

        public Criteria andClick_HyLessThanOrEqualTo(Integer value) {
            addCriterion("Click_Hy <=", value, "click_Hy");
            return (Criteria) this;
        }

        public Criteria andClick_HyIn(List<Integer> values) {
            addCriterion("Click_Hy in", values, "click_Hy");
            return (Criteria) this;
        }

        public Criteria andClick_HyNotIn(List<Integer> values) {
            addCriterion("Click_Hy not in", values, "click_Hy");
            return (Criteria) this;
        }

        public Criteria andClick_HyBetween(Integer value1, Integer value2) {
            addCriterion("Click_Hy between", value1, value2, "click_Hy");
            return (Criteria) this;
        }

        public Criteria andClick_HyNotBetween(Integer value1, Integer value2) {
            addCriterion("Click_Hy not between", value1, value2, "click_Hy");
            return (Criteria) this;
        }

        public Criteria andIsMdkIsNull() {
            addCriterion("IsMdk is null");
            return (Criteria) this;
        }

        public Criteria andIsMdkIsNotNull() {
            addCriterion("IsMdk is not null");
            return (Criteria) this;
        }

        public Criteria andIsMdkEqualTo(Integer value) {
            addCriterion("IsMdk =", value, "isMdk");
            return (Criteria) this;
        }

        public Criteria andIsMdkNotEqualTo(Integer value) {
            addCriterion("IsMdk <>", value, "isMdk");
            return (Criteria) this;
        }

        public Criteria andIsMdkGreaterThan(Integer value) {
            addCriterion("IsMdk >", value, "isMdk");
            return (Criteria) this;
        }

        public Criteria andIsMdkGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsMdk >=", value, "isMdk");
            return (Criteria) this;
        }

        public Criteria andIsMdkLessThan(Integer value) {
            addCriterion("IsMdk <", value, "isMdk");
            return (Criteria) this;
        }

        public Criteria andIsMdkLessThanOrEqualTo(Integer value) {
            addCriterion("IsMdk <=", value, "isMdk");
            return (Criteria) this;
        }

        public Criteria andIsMdkIn(List<Integer> values) {
            addCriterion("IsMdk in", values, "isMdk");
            return (Criteria) this;
        }

        public Criteria andIsMdkNotIn(List<Integer> values) {
            addCriterion("IsMdk not in", values, "isMdk");
            return (Criteria) this;
        }

        public Criteria andIsMdkBetween(Integer value1, Integer value2) {
            addCriterion("IsMdk between", value1, value2, "isMdk");
            return (Criteria) this;
        }

        public Criteria andIsMdkNotBetween(Integer value1, Integer value2) {
            addCriterion("IsMdk not between", value1, value2, "isMdk");
            return (Criteria) this;
        }

        public Criteria andIsMoneyIsNull() {
            addCriterion("IsMoney is null");
            return (Criteria) this;
        }

        public Criteria andIsMoneyIsNotNull() {
            addCriterion("IsMoney is not null");
            return (Criteria) this;
        }

        public Criteria andIsMoneyEqualTo(Integer value) {
            addCriterion("IsMoney =", value, "isMoney");
            return (Criteria) this;
        }

        public Criteria andIsMoneyNotEqualTo(Integer value) {
            addCriterion("IsMoney <>", value, "isMoney");
            return (Criteria) this;
        }

        public Criteria andIsMoneyGreaterThan(Integer value) {
            addCriterion("IsMoney >", value, "isMoney");
            return (Criteria) this;
        }

        public Criteria andIsMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsMoney >=", value, "isMoney");
            return (Criteria) this;
        }

        public Criteria andIsMoneyLessThan(Integer value) {
            addCriterion("IsMoney <", value, "isMoney");
            return (Criteria) this;
        }

        public Criteria andIsMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("IsMoney <=", value, "isMoney");
            return (Criteria) this;
        }

        public Criteria andIsMoneyIn(List<Integer> values) {
            addCriterion("IsMoney in", values, "isMoney");
            return (Criteria) this;
        }

        public Criteria andIsMoneyNotIn(List<Integer> values) {
            addCriterion("IsMoney not in", values, "isMoney");
            return (Criteria) this;
        }

        public Criteria andIsMoneyBetween(Integer value1, Integer value2) {
            addCriterion("IsMoney between", value1, value2, "isMoney");
            return (Criteria) this;
        }

        public Criteria andIsMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("IsMoney not between", value1, value2, "isMoney");
            return (Criteria) this;
        }

        public Criteria andIsMaybeMoneyIsNull() {
            addCriterion("IsMaybeMoney is null");
            return (Criteria) this;
        }

        public Criteria andIsMaybeMoneyIsNotNull() {
            addCriterion("IsMaybeMoney is not null");
            return (Criteria) this;
        }

        public Criteria andIsMaybeMoneyEqualTo(Integer value) {
            addCriterion("IsMaybeMoney =", value, "isMaybeMoney");
            return (Criteria) this;
        }

        public Criteria andIsMaybeMoneyNotEqualTo(Integer value) {
            addCriterion("IsMaybeMoney <>", value, "isMaybeMoney");
            return (Criteria) this;
        }

        public Criteria andIsMaybeMoneyGreaterThan(Integer value) {
            addCriterion("IsMaybeMoney >", value, "isMaybeMoney");
            return (Criteria) this;
        }

        public Criteria andIsMaybeMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsMaybeMoney >=", value, "isMaybeMoney");
            return (Criteria) this;
        }

        public Criteria andIsMaybeMoneyLessThan(Integer value) {
            addCriterion("IsMaybeMoney <", value, "isMaybeMoney");
            return (Criteria) this;
        }

        public Criteria andIsMaybeMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("IsMaybeMoney <=", value, "isMaybeMoney");
            return (Criteria) this;
        }

        public Criteria andIsMaybeMoneyIn(List<Integer> values) {
            addCriterion("IsMaybeMoney in", values, "isMaybeMoney");
            return (Criteria) this;
        }

        public Criteria andIsMaybeMoneyNotIn(List<Integer> values) {
            addCriterion("IsMaybeMoney not in", values, "isMaybeMoney");
            return (Criteria) this;
        }

        public Criteria andIsMaybeMoneyBetween(Integer value1, Integer value2) {
            addCriterion("IsMaybeMoney between", value1, value2, "isMaybeMoney");
            return (Criteria) this;
        }

        public Criteria andIsMaybeMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("IsMaybeMoney not between", value1, value2, "isMaybeMoney");
            return (Criteria) this;
        }

        public Criteria andIndexNoIsNull() {
            addCriterion("IndexNo is null");
            return (Criteria) this;
        }

        public Criteria andIndexNoIsNotNull() {
            addCriterion("IndexNo is not null");
            return (Criteria) this;
        }

        public Criteria andIndexNoEqualTo(Integer value) {
            addCriterion("IndexNo =", value, "indexNo");
            return (Criteria) this;
        }

        public Criteria andIndexNoNotEqualTo(Integer value) {
            addCriterion("IndexNo <>", value, "indexNo");
            return (Criteria) this;
        }

        public Criteria andIndexNoGreaterThan(Integer value) {
            addCriterion("IndexNo >", value, "indexNo");
            return (Criteria) this;
        }

        public Criteria andIndexNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("IndexNo >=", value, "indexNo");
            return (Criteria) this;
        }

        public Criteria andIndexNoLessThan(Integer value) {
            addCriterion("IndexNo <", value, "indexNo");
            return (Criteria) this;
        }

        public Criteria andIndexNoLessThanOrEqualTo(Integer value) {
            addCriterion("IndexNo <=", value, "indexNo");
            return (Criteria) this;
        }

        public Criteria andIndexNoIn(List<Integer> values) {
            addCriterion("IndexNo in", values, "indexNo");
            return (Criteria) this;
        }

        public Criteria andIndexNoNotIn(List<Integer> values) {
            addCriterion("IndexNo not in", values, "indexNo");
            return (Criteria) this;
        }

        public Criteria andIndexNoBetween(Integer value1, Integer value2) {
            addCriterion("IndexNo between", value1, value2, "indexNo");
            return (Criteria) this;
        }

        public Criteria andIndexNoNotBetween(Integer value1, Integer value2) {
            addCriterion("IndexNo not between", value1, value2, "indexNo");
            return (Criteria) this;
        }

        public Criteria andIndexNewNoIsNull() {
            addCriterion("IndexNewNo is null");
            return (Criteria) this;
        }

        public Criteria andIndexNewNoIsNotNull() {
            addCriterion("IndexNewNo is not null");
            return (Criteria) this;
        }

        public Criteria andIndexNewNoEqualTo(Integer value) {
            addCriterion("IndexNewNo =", value, "indexNewNo");
            return (Criteria) this;
        }

        public Criteria andIndexNewNoNotEqualTo(Integer value) {
            addCriterion("IndexNewNo <>", value, "indexNewNo");
            return (Criteria) this;
        }

        public Criteria andIndexNewNoGreaterThan(Integer value) {
            addCriterion("IndexNewNo >", value, "indexNewNo");
            return (Criteria) this;
        }

        public Criteria andIndexNewNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("IndexNewNo >=", value, "indexNewNo");
            return (Criteria) this;
        }

        public Criteria andIndexNewNoLessThan(Integer value) {
            addCriterion("IndexNewNo <", value, "indexNewNo");
            return (Criteria) this;
        }

        public Criteria andIndexNewNoLessThanOrEqualTo(Integer value) {
            addCriterion("IndexNewNo <=", value, "indexNewNo");
            return (Criteria) this;
        }

        public Criteria andIndexNewNoIn(List<Integer> values) {
            addCriterion("IndexNewNo in", values, "indexNewNo");
            return (Criteria) this;
        }

        public Criteria andIndexNewNoNotIn(List<Integer> values) {
            addCriterion("IndexNewNo not in", values, "indexNewNo");
            return (Criteria) this;
        }

        public Criteria andIndexNewNoBetween(Integer value1, Integer value2) {
            addCriterion("IndexNewNo between", value1, value2, "indexNewNo");
            return (Criteria) this;
        }

        public Criteria andIndexNewNoNotBetween(Integer value1, Integer value2) {
            addCriterion("IndexNewNo not between", value1, value2, "indexNewNo");
            return (Criteria) this;
        }

        public Criteria andLoginDateIsNull() {
            addCriterion("LoginDate is null");
            return (Criteria) this;
        }

        public Criteria andLoginDateIsNotNull() {
            addCriterion("LoginDate is not null");
            return (Criteria) this;
        }

        public Criteria andLoginDateEqualTo(Date value) {
            addCriterion("LoginDate =", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotEqualTo(Date value) {
            addCriterion("LoginDate <>", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateGreaterThan(Date value) {
            addCriterion("LoginDate >", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LoginDate >=", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateLessThan(Date value) {
            addCriterion("LoginDate <", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateLessThanOrEqualTo(Date value) {
            addCriterion("LoginDate <=", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateIn(List<Date> values) {
            addCriterion("LoginDate in", values, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotIn(List<Date> values) {
            addCriterion("LoginDate not in", values, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateBetween(Date value1, Date value2) {
            addCriterion("LoginDate between", value1, value2, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotBetween(Date value1, Date value2) {
            addCriterion("LoginDate not between", value1, value2, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginCountIsNull() {
            addCriterion("LoginCount is null");
            return (Criteria) this;
        }

        public Criteria andLoginCountIsNotNull() {
            addCriterion("LoginCount is not null");
            return (Criteria) this;
        }

        public Criteria andLoginCountEqualTo(Integer value) {
            addCriterion("LoginCount =", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotEqualTo(Integer value) {
            addCriterion("LoginCount <>", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountGreaterThan(Integer value) {
            addCriterion("LoginCount >", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("LoginCount >=", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountLessThan(Integer value) {
            addCriterion("LoginCount <", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountLessThanOrEqualTo(Integer value) {
            addCriterion("LoginCount <=", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountIn(List<Integer> values) {
            addCriterion("LoginCount in", values, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotIn(List<Integer> values) {
            addCriterion("LoginCount not in", values, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountBetween(Integer value1, Integer value2) {
            addCriterion("LoginCount between", value1, value2, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotBetween(Integer value1, Integer value2) {
            addCriterion("LoginCount not between", value1, value2, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginIPIsNull() {
            addCriterion("LoginIP is null");
            return (Criteria) this;
        }

        public Criteria andLoginIPIsNotNull() {
            addCriterion("LoginIP is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIPEqualTo(String value) {
            addCriterion("LoginIP =", value, "loginIP");
            return (Criteria) this;
        }

        public Criteria andLoginIPNotEqualTo(String value) {
            addCriterion("LoginIP <>", value, "loginIP");
            return (Criteria) this;
        }

        public Criteria andLoginIPGreaterThan(String value) {
            addCriterion("LoginIP >", value, "loginIP");
            return (Criteria) this;
        }

        public Criteria andLoginIPGreaterThanOrEqualTo(String value) {
            addCriterion("LoginIP >=", value, "loginIP");
            return (Criteria) this;
        }

        public Criteria andLoginIPLessThan(String value) {
            addCriterion("LoginIP <", value, "loginIP");
            return (Criteria) this;
        }

        public Criteria andLoginIPLessThanOrEqualTo(String value) {
            addCriterion("LoginIP <=", value, "loginIP");
            return (Criteria) this;
        }

        public Criteria andLoginIPLike(String value) {
            addCriterion("LoginIP like", value, "loginIP");
            return (Criteria) this;
        }

        public Criteria andLoginIPNotLike(String value) {
            addCriterion("LoginIP not like", value, "loginIP");
            return (Criteria) this;
        }

        public Criteria andLoginIPIn(List<String> values) {
            addCriterion("LoginIP in", values, "loginIP");
            return (Criteria) this;
        }

        public Criteria andLoginIPNotIn(List<String> values) {
            addCriterion("LoginIP not in", values, "loginIP");
            return (Criteria) this;
        }

        public Criteria andLoginIPBetween(String value1, String value2) {
            addCriterion("LoginIP between", value1, value2, "loginIP");
            return (Criteria) this;
        }

        public Criteria andLoginIPNotBetween(String value1, String value2) {
            addCriterion("LoginIP not between", value1, value2, "loginIP");
            return (Criteria) this;
        }

        public Criteria andSxwLinkNameIsNull() {
            addCriterion("SxwLinkName is null");
            return (Criteria) this;
        }

        public Criteria andSxwLinkNameIsNotNull() {
            addCriterion("SxwLinkName is not null");
            return (Criteria) this;
        }

        public Criteria andSxwLinkNameEqualTo(String value) {
            addCriterion("SxwLinkName =", value, "sxwLinkName");
            return (Criteria) this;
        }

        public Criteria andSxwLinkNameNotEqualTo(String value) {
            addCriterion("SxwLinkName <>", value, "sxwLinkName");
            return (Criteria) this;
        }

        public Criteria andSxwLinkNameGreaterThan(String value) {
            addCriterion("SxwLinkName >", value, "sxwLinkName");
            return (Criteria) this;
        }

        public Criteria andSxwLinkNameGreaterThanOrEqualTo(String value) {
            addCriterion("SxwLinkName >=", value, "sxwLinkName");
            return (Criteria) this;
        }

        public Criteria andSxwLinkNameLessThan(String value) {
            addCriterion("SxwLinkName <", value, "sxwLinkName");
            return (Criteria) this;
        }

        public Criteria andSxwLinkNameLessThanOrEqualTo(String value) {
            addCriterion("SxwLinkName <=", value, "sxwLinkName");
            return (Criteria) this;
        }

        public Criteria andSxwLinkNameLike(String value) {
            addCriterion("SxwLinkName like", value, "sxwLinkName");
            return (Criteria) this;
        }

        public Criteria andSxwLinkNameNotLike(String value) {
            addCriterion("SxwLinkName not like", value, "sxwLinkName");
            return (Criteria) this;
        }

        public Criteria andSxwLinkNameIn(List<String> values) {
            addCriterion("SxwLinkName in", values, "sxwLinkName");
            return (Criteria) this;
        }

        public Criteria andSxwLinkNameNotIn(List<String> values) {
            addCriterion("SxwLinkName not in", values, "sxwLinkName");
            return (Criteria) this;
        }

        public Criteria andSxwLinkNameBetween(String value1, String value2) {
            addCriterion("SxwLinkName between", value1, value2, "sxwLinkName");
            return (Criteria) this;
        }

        public Criteria andSxwLinkNameNotBetween(String value1, String value2) {
            addCriterion("SxwLinkName not between", value1, value2, "sxwLinkName");
            return (Criteria) this;
        }

        public Criteria andTechLinkNameIsNull() {
            addCriterion("TechLinkName is null");
            return (Criteria) this;
        }

        public Criteria andTechLinkNameIsNotNull() {
            addCriterion("TechLinkName is not null");
            return (Criteria) this;
        }

        public Criteria andTechLinkNameEqualTo(String value) {
            addCriterion("TechLinkName =", value, "techLinkName");
            return (Criteria) this;
        }

        public Criteria andTechLinkNameNotEqualTo(String value) {
            addCriterion("TechLinkName <>", value, "techLinkName");
            return (Criteria) this;
        }

        public Criteria andTechLinkNameGreaterThan(String value) {
            addCriterion("TechLinkName >", value, "techLinkName");
            return (Criteria) this;
        }

        public Criteria andTechLinkNameGreaterThanOrEqualTo(String value) {
            addCriterion("TechLinkName >=", value, "techLinkName");
            return (Criteria) this;
        }

        public Criteria andTechLinkNameLessThan(String value) {
            addCriterion("TechLinkName <", value, "techLinkName");
            return (Criteria) this;
        }

        public Criteria andTechLinkNameLessThanOrEqualTo(String value) {
            addCriterion("TechLinkName <=", value, "techLinkName");
            return (Criteria) this;
        }

        public Criteria andTechLinkNameLike(String value) {
            addCriterion("TechLinkName like", value, "techLinkName");
            return (Criteria) this;
        }

        public Criteria andTechLinkNameNotLike(String value) {
            addCriterion("TechLinkName not like", value, "techLinkName");
            return (Criteria) this;
        }

        public Criteria andTechLinkNameIn(List<String> values) {
            addCriterion("TechLinkName in", values, "techLinkName");
            return (Criteria) this;
        }

        public Criteria andTechLinkNameNotIn(List<String> values) {
            addCriterion("TechLinkName not in", values, "techLinkName");
            return (Criteria) this;
        }

        public Criteria andTechLinkNameBetween(String value1, String value2) {
            addCriterion("TechLinkName between", value1, value2, "techLinkName");
            return (Criteria) this;
        }

        public Criteria andTechLinkNameNotBetween(String value1, String value2) {
            addCriterion("TechLinkName not between", value1, value2, "techLinkName");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("StartDate is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("StartDate is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("StartDate =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("StartDate <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("StartDate >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("StartDate >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("StartDate <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("StartDate <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("StartDate in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("StartDate not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("StartDate between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("StartDate not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("EndDate is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("EndDate is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("EndDate =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("EndDate <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("EndDate >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("EndDate >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("EndDate <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("EndDate <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("EndDate in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("EndDate not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("EndDate between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("EndDate not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andIsBeiFangIsNull() {
            addCriterion("IsBeiFang is null");
            return (Criteria) this;
        }

        public Criteria andIsBeiFangIsNotNull() {
            addCriterion("IsBeiFang is not null");
            return (Criteria) this;
        }

        public Criteria andIsBeiFangEqualTo(Integer value) {
            addCriterion("IsBeiFang =", value, "isBeiFang");
            return (Criteria) this;
        }

        public Criteria andIsBeiFangNotEqualTo(Integer value) {
            addCriterion("IsBeiFang <>", value, "isBeiFang");
            return (Criteria) this;
        }

        public Criteria andIsBeiFangGreaterThan(Integer value) {
            addCriterion("IsBeiFang >", value, "isBeiFang");
            return (Criteria) this;
        }

        public Criteria andIsBeiFangGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsBeiFang >=", value, "isBeiFang");
            return (Criteria) this;
        }

        public Criteria andIsBeiFangLessThan(Integer value) {
            addCriterion("IsBeiFang <", value, "isBeiFang");
            return (Criteria) this;
        }

        public Criteria andIsBeiFangLessThanOrEqualTo(Integer value) {
            addCriterion("IsBeiFang <=", value, "isBeiFang");
            return (Criteria) this;
        }

        public Criteria andIsBeiFangIn(List<Integer> values) {
            addCriterion("IsBeiFang in", values, "isBeiFang");
            return (Criteria) this;
        }

        public Criteria andIsBeiFangNotIn(List<Integer> values) {
            addCriterion("IsBeiFang not in", values, "isBeiFang");
            return (Criteria) this;
        }

        public Criteria andIsBeiFangBetween(Integer value1, Integer value2) {
            addCriterion("IsBeiFang between", value1, value2, "isBeiFang");
            return (Criteria) this;
        }

        public Criteria andIsBeiFangNotBetween(Integer value1, Integer value2) {
            addCriterion("IsBeiFang not between", value1, value2, "isBeiFang");
            return (Criteria) this;
        }

        public Criteria andCorpMoneyDocIsNull() {
            addCriterion("CorpMoneyDoc is null");
            return (Criteria) this;
        }

        public Criteria andCorpMoneyDocIsNotNull() {
            addCriterion("CorpMoneyDoc is not null");
            return (Criteria) this;
        }

        public Criteria andCorpMoneyDocEqualTo(String value) {
            addCriterion("CorpMoneyDoc =", value, "corpMoneyDoc");
            return (Criteria) this;
        }

        public Criteria andCorpMoneyDocNotEqualTo(String value) {
            addCriterion("CorpMoneyDoc <>", value, "corpMoneyDoc");
            return (Criteria) this;
        }

        public Criteria andCorpMoneyDocGreaterThan(String value) {
            addCriterion("CorpMoneyDoc >", value, "corpMoneyDoc");
            return (Criteria) this;
        }

        public Criteria andCorpMoneyDocGreaterThanOrEqualTo(String value) {
            addCriterion("CorpMoneyDoc >=", value, "corpMoneyDoc");
            return (Criteria) this;
        }

        public Criteria andCorpMoneyDocLessThan(String value) {
            addCriterion("CorpMoneyDoc <", value, "corpMoneyDoc");
            return (Criteria) this;
        }

        public Criteria andCorpMoneyDocLessThanOrEqualTo(String value) {
            addCriterion("CorpMoneyDoc <=", value, "corpMoneyDoc");
            return (Criteria) this;
        }

        public Criteria andCorpMoneyDocLike(String value) {
            addCriterion("CorpMoneyDoc like", value, "corpMoneyDoc");
            return (Criteria) this;
        }

        public Criteria andCorpMoneyDocNotLike(String value) {
            addCriterion("CorpMoneyDoc not like", value, "corpMoneyDoc");
            return (Criteria) this;
        }

        public Criteria andCorpMoneyDocIn(List<String> values) {
            addCriterion("CorpMoneyDoc in", values, "corpMoneyDoc");
            return (Criteria) this;
        }

        public Criteria andCorpMoneyDocNotIn(List<String> values) {
            addCriterion("CorpMoneyDoc not in", values, "corpMoneyDoc");
            return (Criteria) this;
        }

        public Criteria andCorpMoneyDocBetween(String value1, String value2) {
            addCriterion("CorpMoneyDoc between", value1, value2, "corpMoneyDoc");
            return (Criteria) this;
        }

        public Criteria andCorpMoneyDocNotBetween(String value1, String value2) {
            addCriterion("CorpMoneyDoc not between", value1, value2, "corpMoneyDoc");
            return (Criteria) this;
        }

        public Criteria andCitme2010IsNull() {
            addCriterion("Citme2010 is null");
            return (Criteria) this;
        }

        public Criteria andCitme2010IsNotNull() {
            addCriterion("Citme2010 is not null");
            return (Criteria) this;
        }

        public Criteria andCitme2010EqualTo(String value) {
            addCriterion("Citme2010 =", value, "citme2010");
            return (Criteria) this;
        }

        public Criteria andCitme2010NotEqualTo(String value) {
            addCriterion("Citme2010 <>", value, "citme2010");
            return (Criteria) this;
        }

        public Criteria andCitme2010GreaterThan(String value) {
            addCriterion("Citme2010 >", value, "citme2010");
            return (Criteria) this;
        }

        public Criteria andCitme2010GreaterThanOrEqualTo(String value) {
            addCriterion("Citme2010 >=", value, "citme2010");
            return (Criteria) this;
        }

        public Criteria andCitme2010LessThan(String value) {
            addCriterion("Citme2010 <", value, "citme2010");
            return (Criteria) this;
        }

        public Criteria andCitme2010LessThanOrEqualTo(String value) {
            addCriterion("Citme2010 <=", value, "citme2010");
            return (Criteria) this;
        }

        public Criteria andCitme2010Like(String value) {
            addCriterion("Citme2010 like", value, "citme2010");
            return (Criteria) this;
        }

        public Criteria andCitme2010NotLike(String value) {
            addCriterion("Citme2010 not like", value, "citme2010");
            return (Criteria) this;
        }

        public Criteria andCitme2010In(List<String> values) {
            addCriterion("Citme2010 in", values, "citme2010");
            return (Criteria) this;
        }

        public Criteria andCitme2010NotIn(List<String> values) {
            addCriterion("Citme2010 not in", values, "citme2010");
            return (Criteria) this;
        }

        public Criteria andCitme2010Between(String value1, String value2) {
            addCriterion("Citme2010 between", value1, value2, "citme2010");
            return (Criteria) this;
        }

        public Criteria andCitme2010NotBetween(String value1, String value2) {
            addCriterion("Citme2010 not between", value1, value2, "citme2010");
            return (Criteria) this;
        }

        public Criteria andSxwHtNameIsNull() {
            addCriterion("SxwHtName is null");
            return (Criteria) this;
        }

        public Criteria andSxwHtNameIsNotNull() {
            addCriterion("SxwHtName is not null");
            return (Criteria) this;
        }

        public Criteria andSxwHtNameEqualTo(String value) {
            addCriterion("SxwHtName =", value, "sxwHtName");
            return (Criteria) this;
        }

        public Criteria andSxwHtNameNotEqualTo(String value) {
            addCriterion("SxwHtName <>", value, "sxwHtName");
            return (Criteria) this;
        }

        public Criteria andSxwHtNameGreaterThan(String value) {
            addCriterion("SxwHtName >", value, "sxwHtName");
            return (Criteria) this;
        }

        public Criteria andSxwHtNameGreaterThanOrEqualTo(String value) {
            addCriterion("SxwHtName >=", value, "sxwHtName");
            return (Criteria) this;
        }

        public Criteria andSxwHtNameLessThan(String value) {
            addCriterion("SxwHtName <", value, "sxwHtName");
            return (Criteria) this;
        }

        public Criteria andSxwHtNameLessThanOrEqualTo(String value) {
            addCriterion("SxwHtName <=", value, "sxwHtName");
            return (Criteria) this;
        }

        public Criteria andSxwHtNameLike(String value) {
            addCriterion("SxwHtName like", value, "sxwHtName");
            return (Criteria) this;
        }

        public Criteria andSxwHtNameNotLike(String value) {
            addCriterion("SxwHtName not like", value, "sxwHtName");
            return (Criteria) this;
        }

        public Criteria andSxwHtNameIn(List<String> values) {
            addCriterion("SxwHtName in", values, "sxwHtName");
            return (Criteria) this;
        }

        public Criteria andSxwHtNameNotIn(List<String> values) {
            addCriterion("SxwHtName not in", values, "sxwHtName");
            return (Criteria) this;
        }

        public Criteria andSxwHtNameBetween(String value1, String value2) {
            addCriterion("SxwHtName between", value1, value2, "sxwHtName");
            return (Criteria) this;
        }

        public Criteria andSxwHtNameNotBetween(String value1, String value2) {
            addCriterion("SxwHtName not between", value1, value2, "sxwHtName");
            return (Criteria) this;
        }

        public Criteria andCorpLiceIsNull() {
            addCriterion("CorpLice is null");
            return (Criteria) this;
        }

        public Criteria andCorpLiceIsNotNull() {
            addCriterion("CorpLice is not null");
            return (Criteria) this;
        }

        public Criteria andCorpLiceEqualTo(String value) {
            addCriterion("CorpLice =", value, "corpLice");
            return (Criteria) this;
        }

        public Criteria andCorpLiceNotEqualTo(String value) {
            addCriterion("CorpLice <>", value, "corpLice");
            return (Criteria) this;
        }

        public Criteria andCorpLiceGreaterThan(String value) {
            addCriterion("CorpLice >", value, "corpLice");
            return (Criteria) this;
        }

        public Criteria andCorpLiceGreaterThanOrEqualTo(String value) {
            addCriterion("CorpLice >=", value, "corpLice");
            return (Criteria) this;
        }

        public Criteria andCorpLiceLessThan(String value) {
            addCriterion("CorpLice <", value, "corpLice");
            return (Criteria) this;
        }

        public Criteria andCorpLiceLessThanOrEqualTo(String value) {
            addCriterion("CorpLice <=", value, "corpLice");
            return (Criteria) this;
        }

        public Criteria andCorpLiceLike(String value) {
            addCriterion("CorpLice like", value, "corpLice");
            return (Criteria) this;
        }

        public Criteria andCorpLiceNotLike(String value) {
            addCriterion("CorpLice not like", value, "corpLice");
            return (Criteria) this;
        }

        public Criteria andCorpLiceIn(List<String> values) {
            addCriterion("CorpLice in", values, "corpLice");
            return (Criteria) this;
        }

        public Criteria andCorpLiceNotIn(List<String> values) {
            addCriterion("CorpLice not in", values, "corpLice");
            return (Criteria) this;
        }

        public Criteria andCorpLiceBetween(String value1, String value2) {
            addCriterion("CorpLice between", value1, value2, "corpLice");
            return (Criteria) this;
        }

        public Criteria andCorpLiceNotBetween(String value1, String value2) {
            addCriterion("CorpLice not between", value1, value2, "corpLice");
            return (Criteria) this;
        }

        public Criteria andJobCorpIDIsNull() {
            addCriterion("JobCorpID is null");
            return (Criteria) this;
        }

        public Criteria andJobCorpIDIsNotNull() {
            addCriterion("JobCorpID is not null");
            return (Criteria) this;
        }

        public Criteria andJobCorpIDEqualTo(Integer value) {
            addCriterion("JobCorpID =", value, "jobCorpID");
            return (Criteria) this;
        }

        public Criteria andJobCorpIDNotEqualTo(Integer value) {
            addCriterion("JobCorpID <>", value, "jobCorpID");
            return (Criteria) this;
        }

        public Criteria andJobCorpIDGreaterThan(Integer value) {
            addCriterion("JobCorpID >", value, "jobCorpID");
            return (Criteria) this;
        }

        public Criteria andJobCorpIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("JobCorpID >=", value, "jobCorpID");
            return (Criteria) this;
        }

        public Criteria andJobCorpIDLessThan(Integer value) {
            addCriterion("JobCorpID <", value, "jobCorpID");
            return (Criteria) this;
        }

        public Criteria andJobCorpIDLessThanOrEqualTo(Integer value) {
            addCriterion("JobCorpID <=", value, "jobCorpID");
            return (Criteria) this;
        }

        public Criteria andJobCorpIDIn(List<Integer> values) {
            addCriterion("JobCorpID in", values, "jobCorpID");
            return (Criteria) this;
        }

        public Criteria andJobCorpIDNotIn(List<Integer> values) {
            addCriterion("JobCorpID not in", values, "jobCorpID");
            return (Criteria) this;
        }

        public Criteria andJobCorpIDBetween(Integer value1, Integer value2) {
            addCriterion("JobCorpID between", value1, value2, "jobCorpID");
            return (Criteria) this;
        }

        public Criteria andJobCorpIDNotBetween(Integer value1, Integer value2) {
            addCriterion("JobCorpID not between", value1, value2, "jobCorpID");
            return (Criteria) this;
        }

        public Criteria andAllMoneyIsNull() {
            addCriterion("AllMoney is null");
            return (Criteria) this;
        }

        public Criteria andAllMoneyIsNotNull() {
            addCriterion("AllMoney is not null");
            return (Criteria) this;
        }

        public Criteria andAllMoneyEqualTo(String value) {
            addCriterion("AllMoney =", value, "allMoney");
            return (Criteria) this;
        }

        public Criteria andAllMoneyNotEqualTo(String value) {
            addCriterion("AllMoney <>", value, "allMoney");
            return (Criteria) this;
        }

        public Criteria andAllMoneyGreaterThan(String value) {
            addCriterion("AllMoney >", value, "allMoney");
            return (Criteria) this;
        }

        public Criteria andAllMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("AllMoney >=", value, "allMoney");
            return (Criteria) this;
        }

        public Criteria andAllMoneyLessThan(String value) {
            addCriterion("AllMoney <", value, "allMoney");
            return (Criteria) this;
        }

        public Criteria andAllMoneyLessThanOrEqualTo(String value) {
            addCriterion("AllMoney <=", value, "allMoney");
            return (Criteria) this;
        }

        public Criteria andAllMoneyLike(String value) {
            addCriterion("AllMoney like", value, "allMoney");
            return (Criteria) this;
        }

        public Criteria andAllMoneyNotLike(String value) {
            addCriterion("AllMoney not like", value, "allMoney");
            return (Criteria) this;
        }

        public Criteria andAllMoneyIn(List<String> values) {
            addCriterion("AllMoney in", values, "allMoney");
            return (Criteria) this;
        }

        public Criteria andAllMoneyNotIn(List<String> values) {
            addCriterion("AllMoney not in", values, "allMoney");
            return (Criteria) this;
        }

        public Criteria andAllMoneyBetween(String value1, String value2) {
            addCriterion("AllMoney between", value1, value2, "allMoney");
            return (Criteria) this;
        }

        public Criteria andAllMoneyNotBetween(String value1, String value2) {
            addCriterion("AllMoney not between", value1, value2, "allMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyIsNull() {
            addCriterion("AddMoney is null");
            return (Criteria) this;
        }

        public Criteria andAddMoneyIsNotNull() {
            addCriterion("AddMoney is not null");
            return (Criteria) this;
        }

        public Criteria andAddMoneyEqualTo(String value) {
            addCriterion("AddMoney =", value, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyNotEqualTo(String value) {
            addCriterion("AddMoney <>", value, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyGreaterThan(String value) {
            addCriterion("AddMoney >", value, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("AddMoney >=", value, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyLessThan(String value) {
            addCriterion("AddMoney <", value, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyLessThanOrEqualTo(String value) {
            addCriterion("AddMoney <=", value, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyLike(String value) {
            addCriterion("AddMoney like", value, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyNotLike(String value) {
            addCriterion("AddMoney not like", value, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyIn(List<String> values) {
            addCriterion("AddMoney in", values, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyNotIn(List<String> values) {
            addCriterion("AddMoney not in", values, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyBetween(String value1, String value2) {
            addCriterion("AddMoney between", value1, value2, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyNotBetween(String value1, String value2) {
            addCriterion("AddMoney not between", value1, value2, "addMoney");
            return (Criteria) this;
        }

        public Criteria andIsLostIsNull() {
            addCriterion("IsLost is null");
            return (Criteria) this;
        }

        public Criteria andIsLostIsNotNull() {
            addCriterion("IsLost is not null");
            return (Criteria) this;
        }

        public Criteria andIsLostEqualTo(String value) {
            addCriterion("IsLost =", value, "isLost");
            return (Criteria) this;
        }

        public Criteria andIsLostNotEqualTo(String value) {
            addCriterion("IsLost <>", value, "isLost");
            return (Criteria) this;
        }

        public Criteria andIsLostGreaterThan(String value) {
            addCriterion("IsLost >", value, "isLost");
            return (Criteria) this;
        }

        public Criteria andIsLostGreaterThanOrEqualTo(String value) {
            addCriterion("IsLost >=", value, "isLost");
            return (Criteria) this;
        }

        public Criteria andIsLostLessThan(String value) {
            addCriterion("IsLost <", value, "isLost");
            return (Criteria) this;
        }

        public Criteria andIsLostLessThanOrEqualTo(String value) {
            addCriterion("IsLost <=", value, "isLost");
            return (Criteria) this;
        }

        public Criteria andIsLostLike(String value) {
            addCriterion("IsLost like", value, "isLost");
            return (Criteria) this;
        }

        public Criteria andIsLostNotLike(String value) {
            addCriterion("IsLost not like", value, "isLost");
            return (Criteria) this;
        }

        public Criteria andIsLostIn(List<String> values) {
            addCriterion("IsLost in", values, "isLost");
            return (Criteria) this;
        }

        public Criteria andIsLostNotIn(List<String> values) {
            addCriterion("IsLost not in", values, "isLost");
            return (Criteria) this;
        }

        public Criteria andIsLostBetween(String value1, String value2) {
            addCriterion("IsLost between", value1, value2, "isLost");
            return (Criteria) this;
        }

        public Criteria andIsLostNotBetween(String value1, String value2) {
            addCriterion("IsLost not between", value1, value2, "isLost");
            return (Criteria) this;
        }

        public Criteria andIsSmsOKIsNull() {
            addCriterion("IsSmsOK is null");
            return (Criteria) this;
        }

        public Criteria andIsSmsOKIsNotNull() {
            addCriterion("IsSmsOK is not null");
            return (Criteria) this;
        }

        public Criteria andIsSmsOKEqualTo(Integer value) {
            addCriterion("IsSmsOK =", value, "isSmsOK");
            return (Criteria) this;
        }

        public Criteria andIsSmsOKNotEqualTo(Integer value) {
            addCriterion("IsSmsOK <>", value, "isSmsOK");
            return (Criteria) this;
        }

        public Criteria andIsSmsOKGreaterThan(Integer value) {
            addCriterion("IsSmsOK >", value, "isSmsOK");
            return (Criteria) this;
        }

        public Criteria andIsSmsOKGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsSmsOK >=", value, "isSmsOK");
            return (Criteria) this;
        }

        public Criteria andIsSmsOKLessThan(Integer value) {
            addCriterion("IsSmsOK <", value, "isSmsOK");
            return (Criteria) this;
        }

        public Criteria andIsSmsOKLessThanOrEqualTo(Integer value) {
            addCriterion("IsSmsOK <=", value, "isSmsOK");
            return (Criteria) this;
        }

        public Criteria andIsSmsOKIn(List<Integer> values) {
            addCriterion("IsSmsOK in", values, "isSmsOK");
            return (Criteria) this;
        }

        public Criteria andIsSmsOKNotIn(List<Integer> values) {
            addCriterion("IsSmsOK not in", values, "isSmsOK");
            return (Criteria) this;
        }

        public Criteria andIsSmsOKBetween(Integer value1, Integer value2) {
            addCriterion("IsSmsOK between", value1, value2, "isSmsOK");
            return (Criteria) this;
        }

        public Criteria andIsSmsOKNotBetween(Integer value1, Integer value2) {
            addCriterion("IsSmsOK not between", value1, value2, "isSmsOK");
            return (Criteria) this;
        }

        public Criteria andIsZDIsNull() {
            addCriterion("IsZD is null");
            return (Criteria) this;
        }

        public Criteria andIsZDIsNotNull() {
            addCriterion("IsZD is not null");
            return (Criteria) this;
        }

        public Criteria andIsZDEqualTo(Integer value) {
            addCriterion("IsZD =", value, "isZD");
            return (Criteria) this;
        }

        public Criteria andIsZDNotEqualTo(Integer value) {
            addCriterion("IsZD <>", value, "isZD");
            return (Criteria) this;
        }

        public Criteria andIsZDGreaterThan(Integer value) {
            addCriterion("IsZD >", value, "isZD");
            return (Criteria) this;
        }

        public Criteria andIsZDGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsZD >=", value, "isZD");
            return (Criteria) this;
        }

        public Criteria andIsZDLessThan(Integer value) {
            addCriterion("IsZD <", value, "isZD");
            return (Criteria) this;
        }

        public Criteria andIsZDLessThanOrEqualTo(Integer value) {
            addCriterion("IsZD <=", value, "isZD");
            return (Criteria) this;
        }

        public Criteria andIsZDIn(List<Integer> values) {
            addCriterion("IsZD in", values, "isZD");
            return (Criteria) this;
        }

        public Criteria andIsZDNotIn(List<Integer> values) {
            addCriterion("IsZD not in", values, "isZD");
            return (Criteria) this;
        }

        public Criteria andIsZDBetween(Integer value1, Integer value2) {
            addCriterion("IsZD between", value1, value2, "isZD");
            return (Criteria) this;
        }

        public Criteria andIsZDNotBetween(Integer value1, Integer value2) {
            addCriterion("IsZD not between", value1, value2, "isZD");
            return (Criteria) this;
        }

        public Criteria andFJZ2014NoIsNull() {
            addCriterion("FJZ2014No is null");
            return (Criteria) this;
        }

        public Criteria andFJZ2014NoIsNotNull() {
            addCriterion("FJZ2014No is not null");
            return (Criteria) this;
        }

        public Criteria andFJZ2014NoEqualTo(String value) {
            addCriterion("FJZ2014No =", value, "FJZ2014No");
            return (Criteria) this;
        }

        public Criteria andFJZ2014NoNotEqualTo(String value) {
            addCriterion("FJZ2014No <>", value, "FJZ2014No");
            return (Criteria) this;
        }

        public Criteria andFJZ2014NoGreaterThan(String value) {
            addCriterion("FJZ2014No >", value, "FJZ2014No");
            return (Criteria) this;
        }

        public Criteria andFJZ2014NoGreaterThanOrEqualTo(String value) {
            addCriterion("FJZ2014No >=", value, "FJZ2014No");
            return (Criteria) this;
        }

        public Criteria andFJZ2014NoLessThan(String value) {
            addCriterion("FJZ2014No <", value, "FJZ2014No");
            return (Criteria) this;
        }

        public Criteria andFJZ2014NoLessThanOrEqualTo(String value) {
            addCriterion("FJZ2014No <=", value, "FJZ2014No");
            return (Criteria) this;
        }

        public Criteria andFJZ2014NoLike(String value) {
            addCriterion("FJZ2014No like", value, "FJZ2014No");
            return (Criteria) this;
        }

        public Criteria andFJZ2014NoNotLike(String value) {
            addCriterion("FJZ2014No not like", value, "FJZ2014No");
            return (Criteria) this;
        }

        public Criteria andFJZ2014NoIn(List<String> values) {
            addCriterion("FJZ2014No in", values, "FJZ2014No");
            return (Criteria) this;
        }

        public Criteria andFJZ2014NoNotIn(List<String> values) {
            addCriterion("FJZ2014No not in", values, "FJZ2014No");
            return (Criteria) this;
        }

        public Criteria andFJZ2014NoBetween(String value1, String value2) {
            addCriterion("FJZ2014No between", value1, value2, "FJZ2014No");
            return (Criteria) this;
        }

        public Criteria andFJZ2014NoNotBetween(String value1, String value2) {
            addCriterion("FJZ2014No not between", value1, value2, "FJZ2014No");
            return (Criteria) this;
        }

        public Criteria andFJZ2015NoIsNull() {
            addCriterion("FJZ2015No is null");
            return (Criteria) this;
        }

        public Criteria andFJZ2015NoIsNotNull() {
            addCriterion("FJZ2015No is not null");
            return (Criteria) this;
        }

        public Criteria andFJZ2015NoEqualTo(String value) {
            addCriterion("FJZ2015No =", value, "FJZ2015No");
            return (Criteria) this;
        }

        public Criteria andFJZ2015NoNotEqualTo(String value) {
            addCriterion("FJZ2015No <>", value, "FJZ2015No");
            return (Criteria) this;
        }

        public Criteria andFJZ2015NoGreaterThan(String value) {
            addCriterion("FJZ2015No >", value, "FJZ2015No");
            return (Criteria) this;
        }

        public Criteria andFJZ2015NoGreaterThanOrEqualTo(String value) {
            addCriterion("FJZ2015No >=", value, "FJZ2015No");
            return (Criteria) this;
        }

        public Criteria andFJZ2015NoLessThan(String value) {
            addCriterion("FJZ2015No <", value, "FJZ2015No");
            return (Criteria) this;
        }

        public Criteria andFJZ2015NoLessThanOrEqualTo(String value) {
            addCriterion("FJZ2015No <=", value, "FJZ2015No");
            return (Criteria) this;
        }

        public Criteria andFJZ2015NoLike(String value) {
            addCriterion("FJZ2015No like", value, "FJZ2015No");
            return (Criteria) this;
        }

        public Criteria andFJZ2015NoNotLike(String value) {
            addCriterion("FJZ2015No not like", value, "FJZ2015No");
            return (Criteria) this;
        }

        public Criteria andFJZ2015NoIn(List<String> values) {
            addCriterion("FJZ2015No in", values, "FJZ2015No");
            return (Criteria) this;
        }

        public Criteria andFJZ2015NoNotIn(List<String> values) {
            addCriterion("FJZ2015No not in", values, "FJZ2015No");
            return (Criteria) this;
        }

        public Criteria andFJZ2015NoBetween(String value1, String value2) {
            addCriterion("FJZ2015No between", value1, value2, "FJZ2015No");
            return (Criteria) this;
        }

        public Criteria andFJZ2015NoNotBetween(String value1, String value2) {
            addCriterion("FJZ2015No not between", value1, value2, "FJZ2015No");
            return (Criteria) this;
        }

        public Criteria andFJZ_NoIsNull() {
            addCriterion("FJZ_No is null");
            return (Criteria) this;
        }

        public Criteria andFJZ_NoIsNotNull() {
            addCriterion("FJZ_No is not null");
            return (Criteria) this;
        }

        public Criteria andFJZ_NoEqualTo(Integer value) {
            addCriterion("FJZ_No =", value, "FJZ_No");
            return (Criteria) this;
        }

        public Criteria andFJZ_NoNotEqualTo(Integer value) {
            addCriterion("FJZ_No <>", value, "FJZ_No");
            return (Criteria) this;
        }

        public Criteria andFJZ_NoGreaterThan(Integer value) {
            addCriterion("FJZ_No >", value, "FJZ_No");
            return (Criteria) this;
        }

        public Criteria andFJZ_NoGreaterThanOrEqualTo(Integer value) {
            addCriterion("FJZ_No >=", value, "FJZ_No");
            return (Criteria) this;
        }

        public Criteria andFJZ_NoLessThan(Integer value) {
            addCriterion("FJZ_No <", value, "FJZ_No");
            return (Criteria) this;
        }

        public Criteria andFJZ_NoLessThanOrEqualTo(Integer value) {
            addCriterion("FJZ_No <=", value, "FJZ_No");
            return (Criteria) this;
        }

        public Criteria andFJZ_NoIn(List<Integer> values) {
            addCriterion("FJZ_No in", values, "FJZ_No");
            return (Criteria) this;
        }

        public Criteria andFJZ_NoNotIn(List<Integer> values) {
            addCriterion("FJZ_No not in", values, "FJZ_No");
            return (Criteria) this;
        }

        public Criteria andFJZ_NoBetween(Integer value1, Integer value2) {
            addCriterion("FJZ_No between", value1, value2, "FJZ_No");
            return (Criteria) this;
        }

        public Criteria andFJZ_NoNotBetween(Integer value1, Integer value2) {
            addCriterion("FJZ_No not between", value1, value2, "FJZ_No");
            return (Criteria) this;
        }

        public Criteria andFenPeiDateIsNull() {
            addCriterion("FenPeiDate is null");
            return (Criteria) this;
        }

        public Criteria andFenPeiDateIsNotNull() {
            addCriterion("FenPeiDate is not null");
            return (Criteria) this;
        }

        public Criteria andFenPeiDateEqualTo(Date value) {
            addCriterion("FenPeiDate =", value, "fenPeiDate");
            return (Criteria) this;
        }

        public Criteria andFenPeiDateNotEqualTo(Date value) {
            addCriterion("FenPeiDate <>", value, "fenPeiDate");
            return (Criteria) this;
        }

        public Criteria andFenPeiDateGreaterThan(Date value) {
            addCriterion("FenPeiDate >", value, "fenPeiDate");
            return (Criteria) this;
        }

        public Criteria andFenPeiDateGreaterThanOrEqualTo(Date value) {
            addCriterion("FenPeiDate >=", value, "fenPeiDate");
            return (Criteria) this;
        }

        public Criteria andFenPeiDateLessThan(Date value) {
            addCriterion("FenPeiDate <", value, "fenPeiDate");
            return (Criteria) this;
        }

        public Criteria andFenPeiDateLessThanOrEqualTo(Date value) {
            addCriterion("FenPeiDate <=", value, "fenPeiDate");
            return (Criteria) this;
        }

        public Criteria andFenPeiDateIn(List<Date> values) {
            addCriterion("FenPeiDate in", values, "fenPeiDate");
            return (Criteria) this;
        }

        public Criteria andFenPeiDateNotIn(List<Date> values) {
            addCriterion("FenPeiDate not in", values, "fenPeiDate");
            return (Criteria) this;
        }

        public Criteria andFenPeiDateBetween(Date value1, Date value2) {
            addCriterion("FenPeiDate between", value1, value2, "fenPeiDate");
            return (Criteria) this;
        }

        public Criteria andFenPeiDateNotBetween(Date value1, Date value2) {
            addCriterion("FenPeiDate not between", value1, value2, "fenPeiDate");
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