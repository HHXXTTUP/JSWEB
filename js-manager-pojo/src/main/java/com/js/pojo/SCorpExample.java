package com.js.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SCorpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SCorpExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCorpkeywordIsNull() {
            addCriterion("CorpKeyword is null");
            return (Criteria) this;
        }

        public Criteria andCorpkeywordIsNotNull() {
            addCriterion("CorpKeyword is not null");
            return (Criteria) this;
        }

        public Criteria andCorpkeywordEqualTo(String value) {
            addCriterion("CorpKeyword =", value, "corpkeyword");
            return (Criteria) this;
        }

        public Criteria andCorpkeywordNotEqualTo(String value) {
            addCriterion("CorpKeyword <>", value, "corpkeyword");
            return (Criteria) this;
        }

        public Criteria andCorpkeywordGreaterThan(String value) {
            addCriterion("CorpKeyword >", value, "corpkeyword");
            return (Criteria) this;
        }

        public Criteria andCorpkeywordGreaterThanOrEqualTo(String value) {
            addCriterion("CorpKeyword >=", value, "corpkeyword");
            return (Criteria) this;
        }

        public Criteria andCorpkeywordLessThan(String value) {
            addCriterion("CorpKeyword <", value, "corpkeyword");
            return (Criteria) this;
        }

        public Criteria andCorpkeywordLessThanOrEqualTo(String value) {
            addCriterion("CorpKeyword <=", value, "corpkeyword");
            return (Criteria) this;
        }

        public Criteria andCorpkeywordLike(String value) {
            addCriterion("CorpKeyword like", value, "corpkeyword");
            return (Criteria) this;
        }

        public Criteria andCorpkeywordNotLike(String value) {
            addCriterion("CorpKeyword not like", value, "corpkeyword");
            return (Criteria) this;
        }

        public Criteria andCorpkeywordIn(List<String> values) {
            addCriterion("CorpKeyword in", values, "corpkeyword");
            return (Criteria) this;
        }

        public Criteria andCorpkeywordNotIn(List<String> values) {
            addCriterion("CorpKeyword not in", values, "corpkeyword");
            return (Criteria) this;
        }

        public Criteria andCorpkeywordBetween(String value1, String value2) {
            addCriterion("CorpKeyword between", value1, value2, "corpkeyword");
            return (Criteria) this;
        }

        public Criteria andCorpkeywordNotBetween(String value1, String value2) {
            addCriterion("CorpKeyword not between", value1, value2, "corpkeyword");
            return (Criteria) this;
        }

        public Criteria andFibrecateIsNull() {
            addCriterion("FibreCate is null");
            return (Criteria) this;
        }

        public Criteria andFibrecateIsNotNull() {
            addCriterion("FibreCate is not null");
            return (Criteria) this;
        }

        public Criteria andFibrecateEqualTo(String value) {
            addCriterion("FibreCate =", value, "fibrecate");
            return (Criteria) this;
        }

        public Criteria andFibrecateNotEqualTo(String value) {
            addCriterion("FibreCate <>", value, "fibrecate");
            return (Criteria) this;
        }

        public Criteria andFibrecateGreaterThan(String value) {
            addCriterion("FibreCate >", value, "fibrecate");
            return (Criteria) this;
        }

        public Criteria andFibrecateGreaterThanOrEqualTo(String value) {
            addCriterion("FibreCate >=", value, "fibrecate");
            return (Criteria) this;
        }

        public Criteria andFibrecateLessThan(String value) {
            addCriterion("FibreCate <", value, "fibrecate");
            return (Criteria) this;
        }

        public Criteria andFibrecateLessThanOrEqualTo(String value) {
            addCriterion("FibreCate <=", value, "fibrecate");
            return (Criteria) this;
        }

        public Criteria andFibrecateLike(String value) {
            addCriterion("FibreCate like", value, "fibrecate");
            return (Criteria) this;
        }

        public Criteria andFibrecateNotLike(String value) {
            addCriterion("FibreCate not like", value, "fibrecate");
            return (Criteria) this;
        }

        public Criteria andFibrecateIn(List<String> values) {
            addCriterion("FibreCate in", values, "fibrecate");
            return (Criteria) this;
        }

        public Criteria andFibrecateNotIn(List<String> values) {
            addCriterion("FibreCate not in", values, "fibrecate");
            return (Criteria) this;
        }

        public Criteria andFibrecateBetween(String value1, String value2) {
            addCriterion("FibreCate between", value1, value2, "fibrecate");
            return (Criteria) this;
        }

        public Criteria andFibrecateNotBetween(String value1, String value2) {
            addCriterion("FibreCate not between", value1, value2, "fibrecate");
            return (Criteria) this;
        }

        public Criteria andCorpcateIsNull() {
            addCriterion("CorpCate is null");
            return (Criteria) this;
        }

        public Criteria andCorpcateIsNotNull() {
            addCriterion("CorpCate is not null");
            return (Criteria) this;
        }

        public Criteria andCorpcateEqualTo(String value) {
            addCriterion("CorpCate =", value, "corpcate");
            return (Criteria) this;
        }

        public Criteria andCorpcateNotEqualTo(String value) {
            addCriterion("CorpCate <>", value, "corpcate");
            return (Criteria) this;
        }

        public Criteria andCorpcateGreaterThan(String value) {
            addCriterion("CorpCate >", value, "corpcate");
            return (Criteria) this;
        }

        public Criteria andCorpcateGreaterThanOrEqualTo(String value) {
            addCriterion("CorpCate >=", value, "corpcate");
            return (Criteria) this;
        }

        public Criteria andCorpcateLessThan(String value) {
            addCriterion("CorpCate <", value, "corpcate");
            return (Criteria) this;
        }

        public Criteria andCorpcateLessThanOrEqualTo(String value) {
            addCriterion("CorpCate <=", value, "corpcate");
            return (Criteria) this;
        }

        public Criteria andCorpcateLike(String value) {
            addCriterion("CorpCate like", value, "corpcate");
            return (Criteria) this;
        }

        public Criteria andCorpcateNotLike(String value) {
            addCriterion("CorpCate not like", value, "corpcate");
            return (Criteria) this;
        }

        public Criteria andCorpcateIn(List<String> values) {
            addCriterion("CorpCate in", values, "corpcate");
            return (Criteria) this;
        }

        public Criteria andCorpcateNotIn(List<String> values) {
            addCriterion("CorpCate not in", values, "corpcate");
            return (Criteria) this;
        }

        public Criteria andCorpcateBetween(String value1, String value2) {
            addCriterion("CorpCate between", value1, value2, "corpcate");
            return (Criteria) this;
        }

        public Criteria andCorpcateNotBetween(String value1, String value2) {
            addCriterion("CorpCate not between", value1, value2, "corpcate");
            return (Criteria) this;
        }

        public Criteria andLognameIsNull() {
            addCriterion("LogName is null");
            return (Criteria) this;
        }

        public Criteria andLognameIsNotNull() {
            addCriterion("LogName is not null");
            return (Criteria) this;
        }

        public Criteria andLognameEqualTo(String value) {
            addCriterion("LogName =", value, "logname");
            return (Criteria) this;
        }

        public Criteria andLognameNotEqualTo(String value) {
            addCriterion("LogName <>", value, "logname");
            return (Criteria) this;
        }

        public Criteria andLognameGreaterThan(String value) {
            addCriterion("LogName >", value, "logname");
            return (Criteria) this;
        }

        public Criteria andLognameGreaterThanOrEqualTo(String value) {
            addCriterion("LogName >=", value, "logname");
            return (Criteria) this;
        }

        public Criteria andLognameLessThan(String value) {
            addCriterion("LogName <", value, "logname");
            return (Criteria) this;
        }

        public Criteria andLognameLessThanOrEqualTo(String value) {
            addCriterion("LogName <=", value, "logname");
            return (Criteria) this;
        }

        public Criteria andLognameLike(String value) {
            addCriterion("LogName like", value, "logname");
            return (Criteria) this;
        }

        public Criteria andLognameNotLike(String value) {
            addCriterion("LogName not like", value, "logname");
            return (Criteria) this;
        }

        public Criteria andLognameIn(List<String> values) {
            addCriterion("LogName in", values, "logname");
            return (Criteria) this;
        }

        public Criteria andLognameNotIn(List<String> values) {
            addCriterion("LogName not in", values, "logname");
            return (Criteria) this;
        }

        public Criteria andLognameBetween(String value1, String value2) {
            addCriterion("LogName between", value1, value2, "logname");
            return (Criteria) this;
        }

        public Criteria andLognameNotBetween(String value1, String value2) {
            addCriterion("LogName not between", value1, value2, "logname");
            return (Criteria) this;
        }

        public Criteria andLogpassIsNull() {
            addCriterion("LogPass is null");
            return (Criteria) this;
        }

        public Criteria andLogpassIsNotNull() {
            addCriterion("LogPass is not null");
            return (Criteria) this;
        }

        public Criteria andLogpassEqualTo(String value) {
            addCriterion("LogPass =", value, "logpass");
            return (Criteria) this;
        }

        public Criteria andLogpassNotEqualTo(String value) {
            addCriterion("LogPass <>", value, "logpass");
            return (Criteria) this;
        }

        public Criteria andLogpassGreaterThan(String value) {
            addCriterion("LogPass >", value, "logpass");
            return (Criteria) this;
        }

        public Criteria andLogpassGreaterThanOrEqualTo(String value) {
            addCriterion("LogPass >=", value, "logpass");
            return (Criteria) this;
        }

        public Criteria andLogpassLessThan(String value) {
            addCriterion("LogPass <", value, "logpass");
            return (Criteria) this;
        }

        public Criteria andLogpassLessThanOrEqualTo(String value) {
            addCriterion("LogPass <=", value, "logpass");
            return (Criteria) this;
        }

        public Criteria andLogpassLike(String value) {
            addCriterion("LogPass like", value, "logpass");
            return (Criteria) this;
        }

        public Criteria andLogpassNotLike(String value) {
            addCriterion("LogPass not like", value, "logpass");
            return (Criteria) this;
        }

        public Criteria andLogpassIn(List<String> values) {
            addCriterion("LogPass in", values, "logpass");
            return (Criteria) this;
        }

        public Criteria andLogpassNotIn(List<String> values) {
            addCriterion("LogPass not in", values, "logpass");
            return (Criteria) this;
        }

        public Criteria andLogpassBetween(String value1, String value2) {
            addCriterion("LogPass between", value1, value2, "logpass");
            return (Criteria) this;
        }

        public Criteria andLogpassNotBetween(String value1, String value2) {
            addCriterion("LogPass not between", value1, value2, "logpass");
            return (Criteria) this;
        }

        public Criteria andModpassIsNull() {
            addCriterion("ModPass is null");
            return (Criteria) this;
        }

        public Criteria andModpassIsNotNull() {
            addCriterion("ModPass is not null");
            return (Criteria) this;
        }

        public Criteria andModpassEqualTo(String value) {
            addCriterion("ModPass =", value, "modpass");
            return (Criteria) this;
        }

        public Criteria andModpassNotEqualTo(String value) {
            addCriterion("ModPass <>", value, "modpass");
            return (Criteria) this;
        }

        public Criteria andModpassGreaterThan(String value) {
            addCriterion("ModPass >", value, "modpass");
            return (Criteria) this;
        }

        public Criteria andModpassGreaterThanOrEqualTo(String value) {
            addCriterion("ModPass >=", value, "modpass");
            return (Criteria) this;
        }

        public Criteria andModpassLessThan(String value) {
            addCriterion("ModPass <", value, "modpass");
            return (Criteria) this;
        }

        public Criteria andModpassLessThanOrEqualTo(String value) {
            addCriterion("ModPass <=", value, "modpass");
            return (Criteria) this;
        }

        public Criteria andModpassLike(String value) {
            addCriterion("ModPass like", value, "modpass");
            return (Criteria) this;
        }

        public Criteria andModpassNotLike(String value) {
            addCriterion("ModPass not like", value, "modpass");
            return (Criteria) this;
        }

        public Criteria andModpassIn(List<String> values) {
            addCriterion("ModPass in", values, "modpass");
            return (Criteria) this;
        }

        public Criteria andModpassNotIn(List<String> values) {
            addCriterion("ModPass not in", values, "modpass");
            return (Criteria) this;
        }

        public Criteria andModpassBetween(String value1, String value2) {
            addCriterion("ModPass between", value1, value2, "modpass");
            return (Criteria) this;
        }

        public Criteria andModpassNotBetween(String value1, String value2) {
            addCriterion("ModPass not between", value1, value2, "modpass");
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

        public Criteria andAreaS1IsNull() {
            addCriterion("Area_S1 is null");
            return (Criteria) this;
        }

        public Criteria andAreaS1IsNotNull() {
            addCriterion("Area_S1 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaS1EqualTo(String value) {
            addCriterion("Area_S1 =", value, "areaS1");
            return (Criteria) this;
        }

        public Criteria andAreaS1NotEqualTo(String value) {
            addCriterion("Area_S1 <>", value, "areaS1");
            return (Criteria) this;
        }

        public Criteria andAreaS1GreaterThan(String value) {
            addCriterion("Area_S1 >", value, "areaS1");
            return (Criteria) this;
        }

        public Criteria andAreaS1GreaterThanOrEqualTo(String value) {
            addCriterion("Area_S1 >=", value, "areaS1");
            return (Criteria) this;
        }

        public Criteria andAreaS1LessThan(String value) {
            addCriterion("Area_S1 <", value, "areaS1");
            return (Criteria) this;
        }

        public Criteria andAreaS1LessThanOrEqualTo(String value) {
            addCriterion("Area_S1 <=", value, "areaS1");
            return (Criteria) this;
        }

        public Criteria andAreaS1Like(String value) {
            addCriterion("Area_S1 like", value, "areaS1");
            return (Criteria) this;
        }

        public Criteria andAreaS1NotLike(String value) {
            addCriterion("Area_S1 not like", value, "areaS1");
            return (Criteria) this;
        }

        public Criteria andAreaS1In(List<String> values) {
            addCriterion("Area_S1 in", values, "areaS1");
            return (Criteria) this;
        }

        public Criteria andAreaS1NotIn(List<String> values) {
            addCriterion("Area_S1 not in", values, "areaS1");
            return (Criteria) this;
        }

        public Criteria andAreaS1Between(String value1, String value2) {
            addCriterion("Area_S1 between", value1, value2, "areaS1");
            return (Criteria) this;
        }

        public Criteria andAreaS1NotBetween(String value1, String value2) {
            addCriterion("Area_S1 not between", value1, value2, "areaS1");
            return (Criteria) this;
        }

        public Criteria andAreaS2IsNull() {
            addCriterion("Area_S2 is null");
            return (Criteria) this;
        }

        public Criteria andAreaS2IsNotNull() {
            addCriterion("Area_S2 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaS2EqualTo(String value) {
            addCriterion("Area_S2 =", value, "areaS2");
            return (Criteria) this;
        }

        public Criteria andAreaS2NotEqualTo(String value) {
            addCriterion("Area_S2 <>", value, "areaS2");
            return (Criteria) this;
        }

        public Criteria andAreaS2GreaterThan(String value) {
            addCriterion("Area_S2 >", value, "areaS2");
            return (Criteria) this;
        }

        public Criteria andAreaS2GreaterThanOrEqualTo(String value) {
            addCriterion("Area_S2 >=", value, "areaS2");
            return (Criteria) this;
        }

        public Criteria andAreaS2LessThan(String value) {
            addCriterion("Area_S2 <", value, "areaS2");
            return (Criteria) this;
        }

        public Criteria andAreaS2LessThanOrEqualTo(String value) {
            addCriterion("Area_S2 <=", value, "areaS2");
            return (Criteria) this;
        }

        public Criteria andAreaS2Like(String value) {
            addCriterion("Area_S2 like", value, "areaS2");
            return (Criteria) this;
        }

        public Criteria andAreaS2NotLike(String value) {
            addCriterion("Area_S2 not like", value, "areaS2");
            return (Criteria) this;
        }

        public Criteria andAreaS2In(List<String> values) {
            addCriterion("Area_S2 in", values, "areaS2");
            return (Criteria) this;
        }

        public Criteria andAreaS2NotIn(List<String> values) {
            addCriterion("Area_S2 not in", values, "areaS2");
            return (Criteria) this;
        }

        public Criteria andAreaS2Between(String value1, String value2) {
            addCriterion("Area_S2 between", value1, value2, "areaS2");
            return (Criteria) this;
        }

        public Criteria andAreaS2NotBetween(String value1, String value2) {
            addCriterion("Area_S2 not between", value1, value2, "areaS2");
            return (Criteria) this;
        }

        public Criteria andAreaS3IsNull() {
            addCriterion("Area_S3 is null");
            return (Criteria) this;
        }

        public Criteria andAreaS3IsNotNull() {
            addCriterion("Area_S3 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaS3EqualTo(String value) {
            addCriterion("Area_S3 =", value, "areaS3");
            return (Criteria) this;
        }

        public Criteria andAreaS3NotEqualTo(String value) {
            addCriterion("Area_S3 <>", value, "areaS3");
            return (Criteria) this;
        }

        public Criteria andAreaS3GreaterThan(String value) {
            addCriterion("Area_S3 >", value, "areaS3");
            return (Criteria) this;
        }

        public Criteria andAreaS3GreaterThanOrEqualTo(String value) {
            addCriterion("Area_S3 >=", value, "areaS3");
            return (Criteria) this;
        }

        public Criteria andAreaS3LessThan(String value) {
            addCriterion("Area_S3 <", value, "areaS3");
            return (Criteria) this;
        }

        public Criteria andAreaS3LessThanOrEqualTo(String value) {
            addCriterion("Area_S3 <=", value, "areaS3");
            return (Criteria) this;
        }

        public Criteria andAreaS3Like(String value) {
            addCriterion("Area_S3 like", value, "areaS3");
            return (Criteria) this;
        }

        public Criteria andAreaS3NotLike(String value) {
            addCriterion("Area_S3 not like", value, "areaS3");
            return (Criteria) this;
        }

        public Criteria andAreaS3In(List<String> values) {
            addCriterion("Area_S3 in", values, "areaS3");
            return (Criteria) this;
        }

        public Criteria andAreaS3NotIn(List<String> values) {
            addCriterion("Area_S3 not in", values, "areaS3");
            return (Criteria) this;
        }

        public Criteria andAreaS3Between(String value1, String value2) {
            addCriterion("Area_S3 between", value1, value2, "areaS3");
            return (Criteria) this;
        }

        public Criteria andAreaS3NotBetween(String value1, String value2) {
            addCriterion("Area_S3 not between", value1, value2, "areaS3");
            return (Criteria) this;
        }

        public Criteria andAreaS4IsNull() {
            addCriterion("Area_S4 is null");
            return (Criteria) this;
        }

        public Criteria andAreaS4IsNotNull() {
            addCriterion("Area_S4 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaS4EqualTo(String value) {
            addCriterion("Area_S4 =", value, "areaS4");
            return (Criteria) this;
        }

        public Criteria andAreaS4NotEqualTo(String value) {
            addCriterion("Area_S4 <>", value, "areaS4");
            return (Criteria) this;
        }

        public Criteria andAreaS4GreaterThan(String value) {
            addCriterion("Area_S4 >", value, "areaS4");
            return (Criteria) this;
        }

        public Criteria andAreaS4GreaterThanOrEqualTo(String value) {
            addCriterion("Area_S4 >=", value, "areaS4");
            return (Criteria) this;
        }

        public Criteria andAreaS4LessThan(String value) {
            addCriterion("Area_S4 <", value, "areaS4");
            return (Criteria) this;
        }

        public Criteria andAreaS4LessThanOrEqualTo(String value) {
            addCriterion("Area_S4 <=", value, "areaS4");
            return (Criteria) this;
        }

        public Criteria andAreaS4Like(String value) {
            addCriterion("Area_S4 like", value, "areaS4");
            return (Criteria) this;
        }

        public Criteria andAreaS4NotLike(String value) {
            addCriterion("Area_S4 not like", value, "areaS4");
            return (Criteria) this;
        }

        public Criteria andAreaS4In(List<String> values) {
            addCriterion("Area_S4 in", values, "areaS4");
            return (Criteria) this;
        }

        public Criteria andAreaS4NotIn(List<String> values) {
            addCriterion("Area_S4 not in", values, "areaS4");
            return (Criteria) this;
        }

        public Criteria andAreaS4Between(String value1, String value2) {
            addCriterion("Area_S4 between", value1, value2, "areaS4");
            return (Criteria) this;
        }

        public Criteria andAreaS4NotBetween(String value1, String value2) {
            addCriterion("Area_S4 not between", value1, value2, "areaS4");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
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

        public Criteria andCorpphoneIsNull() {
            addCriterion("CorpPhone is null");
            return (Criteria) this;
        }

        public Criteria andCorpphoneIsNotNull() {
            addCriterion("CorpPhone is not null");
            return (Criteria) this;
        }

        public Criteria andCorpphoneEqualTo(String value) {
            addCriterion("CorpPhone =", value, "corpphone");
            return (Criteria) this;
        }

        public Criteria andCorpphoneNotEqualTo(String value) {
            addCriterion("CorpPhone <>", value, "corpphone");
            return (Criteria) this;
        }

        public Criteria andCorpphoneGreaterThan(String value) {
            addCriterion("CorpPhone >", value, "corpphone");
            return (Criteria) this;
        }

        public Criteria andCorpphoneGreaterThanOrEqualTo(String value) {
            addCriterion("CorpPhone >=", value, "corpphone");
            return (Criteria) this;
        }

        public Criteria andCorpphoneLessThan(String value) {
            addCriterion("CorpPhone <", value, "corpphone");
            return (Criteria) this;
        }

        public Criteria andCorpphoneLessThanOrEqualTo(String value) {
            addCriterion("CorpPhone <=", value, "corpphone");
            return (Criteria) this;
        }

        public Criteria andCorpphoneLike(String value) {
            addCriterion("CorpPhone like", value, "corpphone");
            return (Criteria) this;
        }

        public Criteria andCorpphoneNotLike(String value) {
            addCriterion("CorpPhone not like", value, "corpphone");
            return (Criteria) this;
        }

        public Criteria andCorpphoneIn(List<String> values) {
            addCriterion("CorpPhone in", values, "corpphone");
            return (Criteria) this;
        }

        public Criteria andCorpphoneNotIn(List<String> values) {
            addCriterion("CorpPhone not in", values, "corpphone");
            return (Criteria) this;
        }

        public Criteria andCorpphoneBetween(String value1, String value2) {
            addCriterion("CorpPhone between", value1, value2, "corpphone");
            return (Criteria) this;
        }

        public Criteria andCorpphoneNotBetween(String value1, String value2) {
            addCriterion("CorpPhone not between", value1, value2, "corpphone");
            return (Criteria) this;
        }

        public Criteria andCorpfaxIsNull() {
            addCriterion("CorpFax is null");
            return (Criteria) this;
        }

        public Criteria andCorpfaxIsNotNull() {
            addCriterion("CorpFax is not null");
            return (Criteria) this;
        }

        public Criteria andCorpfaxEqualTo(String value) {
            addCriterion("CorpFax =", value, "corpfax");
            return (Criteria) this;
        }

        public Criteria andCorpfaxNotEqualTo(String value) {
            addCriterion("CorpFax <>", value, "corpfax");
            return (Criteria) this;
        }

        public Criteria andCorpfaxGreaterThan(String value) {
            addCriterion("CorpFax >", value, "corpfax");
            return (Criteria) this;
        }

        public Criteria andCorpfaxGreaterThanOrEqualTo(String value) {
            addCriterion("CorpFax >=", value, "corpfax");
            return (Criteria) this;
        }

        public Criteria andCorpfaxLessThan(String value) {
            addCriterion("CorpFax <", value, "corpfax");
            return (Criteria) this;
        }

        public Criteria andCorpfaxLessThanOrEqualTo(String value) {
            addCriterion("CorpFax <=", value, "corpfax");
            return (Criteria) this;
        }

        public Criteria andCorpfaxLike(String value) {
            addCriterion("CorpFax like", value, "corpfax");
            return (Criteria) this;
        }

        public Criteria andCorpfaxNotLike(String value) {
            addCriterion("CorpFax not like", value, "corpfax");
            return (Criteria) this;
        }

        public Criteria andCorpfaxIn(List<String> values) {
            addCriterion("CorpFax in", values, "corpfax");
            return (Criteria) this;
        }

        public Criteria andCorpfaxNotIn(List<String> values) {
            addCriterion("CorpFax not in", values, "corpfax");
            return (Criteria) this;
        }

        public Criteria andCorpfaxBetween(String value1, String value2) {
            addCriterion("CorpFax between", value1, value2, "corpfax");
            return (Criteria) this;
        }

        public Criteria andCorpfaxNotBetween(String value1, String value2) {
            addCriterion("CorpFax not between", value1, value2, "corpfax");
            return (Criteria) this;
        }

        public Criteria andWebIsNull() {
            addCriterion("Web is null");
            return (Criteria) this;
        }

        public Criteria andWebIsNotNull() {
            addCriterion("Web is not null");
            return (Criteria) this;
        }

        public Criteria andWebEqualTo(String value) {
            addCriterion("Web =", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebNotEqualTo(String value) {
            addCriterion("Web <>", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebGreaterThan(String value) {
            addCriterion("Web >", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebGreaterThanOrEqualTo(String value) {
            addCriterion("Web >=", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebLessThan(String value) {
            addCriterion("Web <", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebLessThanOrEqualTo(String value) {
            addCriterion("Web <=", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebLike(String value) {
            addCriterion("Web like", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebNotLike(String value) {
            addCriterion("Web not like", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebIn(List<String> values) {
            addCriterion("Web in", values, "web");
            return (Criteria) this;
        }

        public Criteria andWebNotIn(List<String> values) {
            addCriterion("Web not in", values, "web");
            return (Criteria) this;
        }

        public Criteria andWebBetween(String value1, String value2) {
            addCriterion("Web between", value1, value2, "web");
            return (Criteria) this;
        }

        public Criteria andWebNotBetween(String value1, String value2) {
            addCriterion("Web not between", value1, value2, "web");
            return (Criteria) this;
        }

        public Criteria andCorpemailIsNull() {
            addCriterion("CorpEmail is null");
            return (Criteria) this;
        }

        public Criteria andCorpemailIsNotNull() {
            addCriterion("CorpEmail is not null");
            return (Criteria) this;
        }

        public Criteria andCorpemailEqualTo(String value) {
            addCriterion("CorpEmail =", value, "corpemail");
            return (Criteria) this;
        }

        public Criteria andCorpemailNotEqualTo(String value) {
            addCriterion("CorpEmail <>", value, "corpemail");
            return (Criteria) this;
        }

        public Criteria andCorpemailGreaterThan(String value) {
            addCriterion("CorpEmail >", value, "corpemail");
            return (Criteria) this;
        }

        public Criteria andCorpemailGreaterThanOrEqualTo(String value) {
            addCriterion("CorpEmail >=", value, "corpemail");
            return (Criteria) this;
        }

        public Criteria andCorpemailLessThan(String value) {
            addCriterion("CorpEmail <", value, "corpemail");
            return (Criteria) this;
        }

        public Criteria andCorpemailLessThanOrEqualTo(String value) {
            addCriterion("CorpEmail <=", value, "corpemail");
            return (Criteria) this;
        }

        public Criteria andCorpemailLike(String value) {
            addCriterion("CorpEmail like", value, "corpemail");
            return (Criteria) this;
        }

        public Criteria andCorpemailNotLike(String value) {
            addCriterion("CorpEmail not like", value, "corpemail");
            return (Criteria) this;
        }

        public Criteria andCorpemailIn(List<String> values) {
            addCriterion("CorpEmail in", values, "corpemail");
            return (Criteria) this;
        }

        public Criteria andCorpemailNotIn(List<String> values) {
            addCriterion("CorpEmail not in", values, "corpemail");
            return (Criteria) this;
        }

        public Criteria andCorpemailBetween(String value1, String value2) {
            addCriterion("CorpEmail between", value1, value2, "corpemail");
            return (Criteria) this;
        }

        public Criteria andCorpemailNotBetween(String value1, String value2) {
            addCriterion("CorpEmail not between", value1, value2, "corpemail");
            return (Criteria) this;
        }

        public Criteria andContsexIsNull() {
            addCriterion("ContSex is null");
            return (Criteria) this;
        }

        public Criteria andContsexIsNotNull() {
            addCriterion("ContSex is not null");
            return (Criteria) this;
        }

        public Criteria andContsexEqualTo(String value) {
            addCriterion("ContSex =", value, "contsex");
            return (Criteria) this;
        }

        public Criteria andContsexNotEqualTo(String value) {
            addCriterion("ContSex <>", value, "contsex");
            return (Criteria) this;
        }

        public Criteria andContsexGreaterThan(String value) {
            addCriterion("ContSex >", value, "contsex");
            return (Criteria) this;
        }

        public Criteria andContsexGreaterThanOrEqualTo(String value) {
            addCriterion("ContSex >=", value, "contsex");
            return (Criteria) this;
        }

        public Criteria andContsexLessThan(String value) {
            addCriterion("ContSex <", value, "contsex");
            return (Criteria) this;
        }

        public Criteria andContsexLessThanOrEqualTo(String value) {
            addCriterion("ContSex <=", value, "contsex");
            return (Criteria) this;
        }

        public Criteria andContsexLike(String value) {
            addCriterion("ContSex like", value, "contsex");
            return (Criteria) this;
        }

        public Criteria andContsexNotLike(String value) {
            addCriterion("ContSex not like", value, "contsex");
            return (Criteria) this;
        }

        public Criteria andContsexIn(List<String> values) {
            addCriterion("ContSex in", values, "contsex");
            return (Criteria) this;
        }

        public Criteria andContsexNotIn(List<String> values) {
            addCriterion("ContSex not in", values, "contsex");
            return (Criteria) this;
        }

        public Criteria andContsexBetween(String value1, String value2) {
            addCriterion("ContSex between", value1, value2, "contsex");
            return (Criteria) this;
        }

        public Criteria andContsexNotBetween(String value1, String value2) {
            addCriterion("ContSex not between", value1, value2, "contsex");
            return (Criteria) this;
        }

        public Criteria andContjobIsNull() {
            addCriterion("ContJob is null");
            return (Criteria) this;
        }

        public Criteria andContjobIsNotNull() {
            addCriterion("ContJob is not null");
            return (Criteria) this;
        }

        public Criteria andContjobEqualTo(String value) {
            addCriterion("ContJob =", value, "contjob");
            return (Criteria) this;
        }

        public Criteria andContjobNotEqualTo(String value) {
            addCriterion("ContJob <>", value, "contjob");
            return (Criteria) this;
        }

        public Criteria andContjobGreaterThan(String value) {
            addCriterion("ContJob >", value, "contjob");
            return (Criteria) this;
        }

        public Criteria andContjobGreaterThanOrEqualTo(String value) {
            addCriterion("ContJob >=", value, "contjob");
            return (Criteria) this;
        }

        public Criteria andContjobLessThan(String value) {
            addCriterion("ContJob <", value, "contjob");
            return (Criteria) this;
        }

        public Criteria andContjobLessThanOrEqualTo(String value) {
            addCriterion("ContJob <=", value, "contjob");
            return (Criteria) this;
        }

        public Criteria andContjobLike(String value) {
            addCriterion("ContJob like", value, "contjob");
            return (Criteria) this;
        }

        public Criteria andContjobNotLike(String value) {
            addCriterion("ContJob not like", value, "contjob");
            return (Criteria) this;
        }

        public Criteria andContjobIn(List<String> values) {
            addCriterion("ContJob in", values, "contjob");
            return (Criteria) this;
        }

        public Criteria andContjobNotIn(List<String> values) {
            addCriterion("ContJob not in", values, "contjob");
            return (Criteria) this;
        }

        public Criteria andContjobBetween(String value1, String value2) {
            addCriterion("ContJob between", value1, value2, "contjob");
            return (Criteria) this;
        }

        public Criteria andContjobNotBetween(String value1, String value2) {
            addCriterion("ContJob not between", value1, value2, "contjob");
            return (Criteria) this;
        }

        public Criteria andConttelIsNull() {
            addCriterion("ContTel is null");
            return (Criteria) this;
        }

        public Criteria andConttelIsNotNull() {
            addCriterion("ContTel is not null");
            return (Criteria) this;
        }

        public Criteria andConttelEqualTo(String value) {
            addCriterion("ContTel =", value, "conttel");
            return (Criteria) this;
        }

        public Criteria andConttelNotEqualTo(String value) {
            addCriterion("ContTel <>", value, "conttel");
            return (Criteria) this;
        }

        public Criteria andConttelGreaterThan(String value) {
            addCriterion("ContTel >", value, "conttel");
            return (Criteria) this;
        }

        public Criteria andConttelGreaterThanOrEqualTo(String value) {
            addCriterion("ContTel >=", value, "conttel");
            return (Criteria) this;
        }

        public Criteria andConttelLessThan(String value) {
            addCriterion("ContTel <", value, "conttel");
            return (Criteria) this;
        }

        public Criteria andConttelLessThanOrEqualTo(String value) {
            addCriterion("ContTel <=", value, "conttel");
            return (Criteria) this;
        }

        public Criteria andConttelLike(String value) {
            addCriterion("ContTel like", value, "conttel");
            return (Criteria) this;
        }

        public Criteria andConttelNotLike(String value) {
            addCriterion("ContTel not like", value, "conttel");
            return (Criteria) this;
        }

        public Criteria andConttelIn(List<String> values) {
            addCriterion("ContTel in", values, "conttel");
            return (Criteria) this;
        }

        public Criteria andConttelNotIn(List<String> values) {
            addCriterion("ContTel not in", values, "conttel");
            return (Criteria) this;
        }

        public Criteria andConttelBetween(String value1, String value2) {
            addCriterion("ContTel between", value1, value2, "conttel");
            return (Criteria) this;
        }

        public Criteria andConttelNotBetween(String value1, String value2) {
            addCriterion("ContTel not between", value1, value2, "conttel");
            return (Criteria) this;
        }

        public Criteria andContfaxIsNull() {
            addCriterion("ContFax is null");
            return (Criteria) this;
        }

        public Criteria andContfaxIsNotNull() {
            addCriterion("ContFax is not null");
            return (Criteria) this;
        }

        public Criteria andContfaxEqualTo(String value) {
            addCriterion("ContFax =", value, "contfax");
            return (Criteria) this;
        }

        public Criteria andContfaxNotEqualTo(String value) {
            addCriterion("ContFax <>", value, "contfax");
            return (Criteria) this;
        }

        public Criteria andContfaxGreaterThan(String value) {
            addCriterion("ContFax >", value, "contfax");
            return (Criteria) this;
        }

        public Criteria andContfaxGreaterThanOrEqualTo(String value) {
            addCriterion("ContFax >=", value, "contfax");
            return (Criteria) this;
        }

        public Criteria andContfaxLessThan(String value) {
            addCriterion("ContFax <", value, "contfax");
            return (Criteria) this;
        }

        public Criteria andContfaxLessThanOrEqualTo(String value) {
            addCriterion("ContFax <=", value, "contfax");
            return (Criteria) this;
        }

        public Criteria andContfaxLike(String value) {
            addCriterion("ContFax like", value, "contfax");
            return (Criteria) this;
        }

        public Criteria andContfaxNotLike(String value) {
            addCriterion("ContFax not like", value, "contfax");
            return (Criteria) this;
        }

        public Criteria andContfaxIn(List<String> values) {
            addCriterion("ContFax in", values, "contfax");
            return (Criteria) this;
        }

        public Criteria andContfaxNotIn(List<String> values) {
            addCriterion("ContFax not in", values, "contfax");
            return (Criteria) this;
        }

        public Criteria andContfaxBetween(String value1, String value2) {
            addCriterion("ContFax between", value1, value2, "contfax");
            return (Criteria) this;
        }

        public Criteria andContfaxNotBetween(String value1, String value2) {
            addCriterion("ContFax not between", value1, value2, "contfax");
            return (Criteria) this;
        }

        public Criteria andContmobileIsNull() {
            addCriterion("ContMobile is null");
            return (Criteria) this;
        }

        public Criteria andContmobileIsNotNull() {
            addCriterion("ContMobile is not null");
            return (Criteria) this;
        }

        public Criteria andContmobileEqualTo(String value) {
            addCriterion("ContMobile =", value, "contmobile");
            return (Criteria) this;
        }

        public Criteria andContmobileNotEqualTo(String value) {
            addCriterion("ContMobile <>", value, "contmobile");
            return (Criteria) this;
        }

        public Criteria andContmobileGreaterThan(String value) {
            addCriterion("ContMobile >", value, "contmobile");
            return (Criteria) this;
        }

        public Criteria andContmobileGreaterThanOrEqualTo(String value) {
            addCriterion("ContMobile >=", value, "contmobile");
            return (Criteria) this;
        }

        public Criteria andContmobileLessThan(String value) {
            addCriterion("ContMobile <", value, "contmobile");
            return (Criteria) this;
        }

        public Criteria andContmobileLessThanOrEqualTo(String value) {
            addCriterion("ContMobile <=", value, "contmobile");
            return (Criteria) this;
        }

        public Criteria andContmobileLike(String value) {
            addCriterion("ContMobile like", value, "contmobile");
            return (Criteria) this;
        }

        public Criteria andContmobileNotLike(String value) {
            addCriterion("ContMobile not like", value, "contmobile");
            return (Criteria) this;
        }

        public Criteria andContmobileIn(List<String> values) {
            addCriterion("ContMobile in", values, "contmobile");
            return (Criteria) this;
        }

        public Criteria andContmobileNotIn(List<String> values) {
            addCriterion("ContMobile not in", values, "contmobile");
            return (Criteria) this;
        }

        public Criteria andContmobileBetween(String value1, String value2) {
            addCriterion("ContMobile between", value1, value2, "contmobile");
            return (Criteria) this;
        }

        public Criteria andContmobileNotBetween(String value1, String value2) {
            addCriterion("ContMobile not between", value1, value2, "contmobile");
            return (Criteria) this;
        }

        public Criteria andContemailIsNull() {
            addCriterion("ContEmail is null");
            return (Criteria) this;
        }

        public Criteria andContemailIsNotNull() {
            addCriterion("ContEmail is not null");
            return (Criteria) this;
        }

        public Criteria andContemailEqualTo(String value) {
            addCriterion("ContEmail =", value, "contemail");
            return (Criteria) this;
        }

        public Criteria andContemailNotEqualTo(String value) {
            addCriterion("ContEmail <>", value, "contemail");
            return (Criteria) this;
        }

        public Criteria andContemailGreaterThan(String value) {
            addCriterion("ContEmail >", value, "contemail");
            return (Criteria) this;
        }

        public Criteria andContemailGreaterThanOrEqualTo(String value) {
            addCriterion("ContEmail >=", value, "contemail");
            return (Criteria) this;
        }

        public Criteria andContemailLessThan(String value) {
            addCriterion("ContEmail <", value, "contemail");
            return (Criteria) this;
        }

        public Criteria andContemailLessThanOrEqualTo(String value) {
            addCriterion("ContEmail <=", value, "contemail");
            return (Criteria) this;
        }

        public Criteria andContemailLike(String value) {
            addCriterion("ContEmail like", value, "contemail");
            return (Criteria) this;
        }

        public Criteria andContemailNotLike(String value) {
            addCriterion("ContEmail not like", value, "contemail");
            return (Criteria) this;
        }

        public Criteria andContemailIn(List<String> values) {
            addCriterion("ContEmail in", values, "contemail");
            return (Criteria) this;
        }

        public Criteria andContemailNotIn(List<String> values) {
            addCriterion("ContEmail not in", values, "contemail");
            return (Criteria) this;
        }

        public Criteria andContemailBetween(String value1, String value2) {
            addCriterion("ContEmail between", value1, value2, "contemail");
            return (Criteria) this;
        }

        public Criteria andContemailNotBetween(String value1, String value2) {
            addCriterion("ContEmail not between", value1, value2, "contemail");
            return (Criteria) this;
        }

        public Criteria andContmsnIsNull() {
            addCriterion("ContMsn is null");
            return (Criteria) this;
        }

        public Criteria andContmsnIsNotNull() {
            addCriterion("ContMsn is not null");
            return (Criteria) this;
        }

        public Criteria andContmsnEqualTo(String value) {
            addCriterion("ContMsn =", value, "contmsn");
            return (Criteria) this;
        }

        public Criteria andContmsnNotEqualTo(String value) {
            addCriterion("ContMsn <>", value, "contmsn");
            return (Criteria) this;
        }

        public Criteria andContmsnGreaterThan(String value) {
            addCriterion("ContMsn >", value, "contmsn");
            return (Criteria) this;
        }

        public Criteria andContmsnGreaterThanOrEqualTo(String value) {
            addCriterion("ContMsn >=", value, "contmsn");
            return (Criteria) this;
        }

        public Criteria andContmsnLessThan(String value) {
            addCriterion("ContMsn <", value, "contmsn");
            return (Criteria) this;
        }

        public Criteria andContmsnLessThanOrEqualTo(String value) {
            addCriterion("ContMsn <=", value, "contmsn");
            return (Criteria) this;
        }

        public Criteria andContmsnLike(String value) {
            addCriterion("ContMsn like", value, "contmsn");
            return (Criteria) this;
        }

        public Criteria andContmsnNotLike(String value) {
            addCriterion("ContMsn not like", value, "contmsn");
            return (Criteria) this;
        }

        public Criteria andContmsnIn(List<String> values) {
            addCriterion("ContMsn in", values, "contmsn");
            return (Criteria) this;
        }

        public Criteria andContmsnNotIn(List<String> values) {
            addCriterion("ContMsn not in", values, "contmsn");
            return (Criteria) this;
        }

        public Criteria andContmsnBetween(String value1, String value2) {
            addCriterion("ContMsn between", value1, value2, "contmsn");
            return (Criteria) this;
        }

        public Criteria andContmsnNotBetween(String value1, String value2) {
            addCriterion("ContMsn not between", value1, value2, "contmsn");
            return (Criteria) this;
        }

        public Criteria andImagenameIsNull() {
            addCriterion("imagename is null");
            return (Criteria) this;
        }

        public Criteria andImagenameIsNotNull() {
            addCriterion("imagename is not null");
            return (Criteria) this;
        }

        public Criteria andImagenameEqualTo(String value) {
            addCriterion("imagename =", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameNotEqualTo(String value) {
            addCriterion("imagename <>", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameGreaterThan(String value) {
            addCriterion("imagename >", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameGreaterThanOrEqualTo(String value) {
            addCriterion("imagename >=", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameLessThan(String value) {
            addCriterion("imagename <", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameLessThanOrEqualTo(String value) {
            addCriterion("imagename <=", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameLike(String value) {
            addCriterion("imagename like", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameNotLike(String value) {
            addCriterion("imagename not like", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameIn(List<String> values) {
            addCriterion("imagename in", values, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameNotIn(List<String> values) {
            addCriterion("imagename not in", values, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameBetween(String value1, String value2) {
            addCriterion("imagename between", value1, value2, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameNotBetween(String value1, String value2) {
            addCriterion("imagename not between", value1, value2, "imagename");
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

        public Criteria andRegdateIsNull() {
            addCriterion("RegDate is null");
            return (Criteria) this;
        }

        public Criteria andRegdateIsNotNull() {
            addCriterion("RegDate is not null");
            return (Criteria) this;
        }

        public Criteria andRegdateEqualTo(Date value) {
            addCriterion("RegDate =", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotEqualTo(Date value) {
            addCriterion("RegDate <>", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateGreaterThan(Date value) {
            addCriterion("RegDate >", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateGreaterThanOrEqualTo(Date value) {
            addCriterion("RegDate >=", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateLessThan(Date value) {
            addCriterion("RegDate <", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateLessThanOrEqualTo(Date value) {
            addCriterion("RegDate <=", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateIn(List<Date> values) {
            addCriterion("RegDate in", values, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotIn(List<Date> values) {
            addCriterion("RegDate not in", values, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateBetween(Date value1, Date value2) {
            addCriterion("RegDate between", value1, value2, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotBetween(Date value1, Date value2) {
            addCriterion("RegDate not between", value1, value2, "regdate");
            return (Criteria) this;
        }

        public Criteria andLogindateIsNull() {
            addCriterion("LoginDate is null");
            return (Criteria) this;
        }

        public Criteria andLogindateIsNotNull() {
            addCriterion("LoginDate is not null");
            return (Criteria) this;
        }

        public Criteria andLogindateEqualTo(Date value) {
            addCriterion("LoginDate =", value, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogindateNotEqualTo(Date value) {
            addCriterion("LoginDate <>", value, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogindateGreaterThan(Date value) {
            addCriterion("LoginDate >", value, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogindateGreaterThanOrEqualTo(Date value) {
            addCriterion("LoginDate >=", value, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogindateLessThan(Date value) {
            addCriterion("LoginDate <", value, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogindateLessThanOrEqualTo(Date value) {
            addCriterion("LoginDate <=", value, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogindateIn(List<Date> values) {
            addCriterion("LoginDate in", values, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogindateNotIn(List<Date> values) {
            addCriterion("LoginDate not in", values, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogindateBetween(Date value1, Date value2) {
            addCriterion("LoginDate between", value1, value2, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogindateNotBetween(Date value1, Date value2) {
            addCriterion("LoginDate not between", value1, value2, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogincountIsNull() {
            addCriterion("LoginCount is null");
            return (Criteria) this;
        }

        public Criteria andLogincountIsNotNull() {
            addCriterion("LoginCount is not null");
            return (Criteria) this;
        }

        public Criteria andLogincountEqualTo(Integer value) {
            addCriterion("LoginCount =", value, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountNotEqualTo(Integer value) {
            addCriterion("LoginCount <>", value, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountGreaterThan(Integer value) {
            addCriterion("LoginCount >", value, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountGreaterThanOrEqualTo(Integer value) {
            addCriterion("LoginCount >=", value, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountLessThan(Integer value) {
            addCriterion("LoginCount <", value, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountLessThanOrEqualTo(Integer value) {
            addCriterion("LoginCount <=", value, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountIn(List<Integer> values) {
            addCriterion("LoginCount in", values, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountNotIn(List<Integer> values) {
            addCriterion("LoginCount not in", values, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountBetween(Integer value1, Integer value2) {
            addCriterion("LoginCount between", value1, value2, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountNotBetween(Integer value1, Integer value2) {
            addCriterion("LoginCount not between", value1, value2, "logincount");
            return (Criteria) this;
        }

        public Criteria andLoginipIsNull() {
            addCriterion("LoginIP is null");
            return (Criteria) this;
        }

        public Criteria andLoginipIsNotNull() {
            addCriterion("LoginIP is not null");
            return (Criteria) this;
        }

        public Criteria andLoginipEqualTo(String value) {
            addCriterion("LoginIP =", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotEqualTo(String value) {
            addCriterion("LoginIP <>", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipGreaterThan(String value) {
            addCriterion("LoginIP >", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipGreaterThanOrEqualTo(String value) {
            addCriterion("LoginIP >=", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLessThan(String value) {
            addCriterion("LoginIP <", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLessThanOrEqualTo(String value) {
            addCriterion("LoginIP <=", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLike(String value) {
            addCriterion("LoginIP like", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotLike(String value) {
            addCriterion("LoginIP not like", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipIn(List<String> values) {
            addCriterion("LoginIP in", values, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotIn(List<String> values) {
            addCriterion("LoginIP not in", values, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipBetween(String value1, String value2) {
            addCriterion("LoginIP between", value1, value2, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotBetween(String value1, String value2) {
            addCriterion("LoginIP not between", value1, value2, "loginip");
            return (Criteria) this;
        }

        public Criteria andAddipIsNull() {
            addCriterion("AddIP is null");
            return (Criteria) this;
        }

        public Criteria andAddipIsNotNull() {
            addCriterion("AddIP is not null");
            return (Criteria) this;
        }

        public Criteria andAddipEqualTo(String value) {
            addCriterion("AddIP =", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipNotEqualTo(String value) {
            addCriterion("AddIP <>", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipGreaterThan(String value) {
            addCriterion("AddIP >", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipGreaterThanOrEqualTo(String value) {
            addCriterion("AddIP >=", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipLessThan(String value) {
            addCriterion("AddIP <", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipLessThanOrEqualTo(String value) {
            addCriterion("AddIP <=", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipLike(String value) {
            addCriterion("AddIP like", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipNotLike(String value) {
            addCriterion("AddIP not like", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipIn(List<String> values) {
            addCriterion("AddIP in", values, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipNotIn(List<String> values) {
            addCriterion("AddIP not in", values, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipBetween(String value1, String value2) {
            addCriterion("AddIP between", value1, value2, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipNotBetween(String value1, String value2) {
            addCriterion("AddIP not between", value1, value2, "addip");
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

        public Criteria andClickEnIsNull() {
            addCriterion("Click_En is null");
            return (Criteria) this;
        }

        public Criteria andClickEnIsNotNull() {
            addCriterion("Click_En is not null");
            return (Criteria) this;
        }

        public Criteria andClickEnEqualTo(Integer value) {
            addCriterion("Click_En =", value, "clickEn");
            return (Criteria) this;
        }

        public Criteria andClickEnNotEqualTo(Integer value) {
            addCriterion("Click_En <>", value, "clickEn");
            return (Criteria) this;
        }

        public Criteria andClickEnGreaterThan(Integer value) {
            addCriterion("Click_En >", value, "clickEn");
            return (Criteria) this;
        }

        public Criteria andClickEnGreaterThanOrEqualTo(Integer value) {
            addCriterion("Click_En >=", value, "clickEn");
            return (Criteria) this;
        }

        public Criteria andClickEnLessThan(Integer value) {
            addCriterion("Click_En <", value, "clickEn");
            return (Criteria) this;
        }

        public Criteria andClickEnLessThanOrEqualTo(Integer value) {
            addCriterion("Click_En <=", value, "clickEn");
            return (Criteria) this;
        }

        public Criteria andClickEnIn(List<Integer> values) {
            addCriterion("Click_En in", values, "clickEn");
            return (Criteria) this;
        }

        public Criteria andClickEnNotIn(List<Integer> values) {
            addCriterion("Click_En not in", values, "clickEn");
            return (Criteria) this;
        }

        public Criteria andClickEnBetween(Integer value1, Integer value2) {
            addCriterion("Click_En between", value1, value2, "clickEn");
            return (Criteria) this;
        }

        public Criteria andClickEnNotBetween(Integer value1, Integer value2) {
            addCriterion("Click_En not between", value1, value2, "clickEn");
            return (Criteria) this;
        }

        public Criteria andIsgoodIsNull() {
            addCriterion("IsGood is null");
            return (Criteria) this;
        }

        public Criteria andIsgoodIsNotNull() {
            addCriterion("IsGood is not null");
            return (Criteria) this;
        }

        public Criteria andIsgoodEqualTo(Integer value) {
            addCriterion("IsGood =", value, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsgoodNotEqualTo(Integer value) {
            addCriterion("IsGood <>", value, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsgoodGreaterThan(Integer value) {
            addCriterion("IsGood >", value, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsgoodGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsGood >=", value, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsgoodLessThan(Integer value) {
            addCriterion("IsGood <", value, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsgoodLessThanOrEqualTo(Integer value) {
            addCriterion("IsGood <=", value, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsgoodIn(List<Integer> values) {
            addCriterion("IsGood in", values, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsgoodNotIn(List<Integer> values) {
            addCriterion("IsGood not in", values, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsgoodBetween(Integer value1, Integer value2) {
            addCriterion("IsGood between", value1, value2, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsgoodNotBetween(Integer value1, Integer value2) {
            addCriterion("IsGood not between", value1, value2, "isgood");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("Money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("Money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Integer value) {
            addCriterion("Money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Integer value) {
            addCriterion("Money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Integer value) {
            addCriterion("Money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("Money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Integer value) {
            addCriterion("Money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("Money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Integer> values) {
            addCriterion("Money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Integer> values) {
            addCriterion("Money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Integer value1, Integer value2) {
            addCriterion("Money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("Money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andIsmaybemoneyIsNull() {
            addCriterion("IsMaybeMoney is null");
            return (Criteria) this;
        }

        public Criteria andIsmaybemoneyIsNotNull() {
            addCriterion("IsMaybeMoney is not null");
            return (Criteria) this;
        }

        public Criteria andIsmaybemoneyEqualTo(Integer value) {
            addCriterion("IsMaybeMoney =", value, "ismaybemoney");
            return (Criteria) this;
        }

        public Criteria andIsmaybemoneyNotEqualTo(Integer value) {
            addCriterion("IsMaybeMoney <>", value, "ismaybemoney");
            return (Criteria) this;
        }

        public Criteria andIsmaybemoneyGreaterThan(Integer value) {
            addCriterion("IsMaybeMoney >", value, "ismaybemoney");
            return (Criteria) this;
        }

        public Criteria andIsmaybemoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsMaybeMoney >=", value, "ismaybemoney");
            return (Criteria) this;
        }

        public Criteria andIsmaybemoneyLessThan(Integer value) {
            addCriterion("IsMaybeMoney <", value, "ismaybemoney");
            return (Criteria) this;
        }

        public Criteria andIsmaybemoneyLessThanOrEqualTo(Integer value) {
            addCriterion("IsMaybeMoney <=", value, "ismaybemoney");
            return (Criteria) this;
        }

        public Criteria andIsmaybemoneyIn(List<Integer> values) {
            addCriterion("IsMaybeMoney in", values, "ismaybemoney");
            return (Criteria) this;
        }

        public Criteria andIsmaybemoneyNotIn(List<Integer> values) {
            addCriterion("IsMaybeMoney not in", values, "ismaybemoney");
            return (Criteria) this;
        }

        public Criteria andIsmaybemoneyBetween(Integer value1, Integer value2) {
            addCriterion("IsMaybeMoney between", value1, value2, "ismaybemoney");
            return (Criteria) this;
        }

        public Criteria andIsmaybemoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("IsMaybeMoney not between", value1, value2, "ismaybemoney");
            return (Criteria) this;
        }

        public Criteria andIndexnoIsNull() {
            addCriterion("IndexNO is null");
            return (Criteria) this;
        }

        public Criteria andIndexnoIsNotNull() {
            addCriterion("IndexNO is not null");
            return (Criteria) this;
        }

        public Criteria andIndexnoEqualTo(Integer value) {
            addCriterion("IndexNO =", value, "indexno");
            return (Criteria) this;
        }

        public Criteria andIndexnoNotEqualTo(Integer value) {
            addCriterion("IndexNO <>", value, "indexno");
            return (Criteria) this;
        }

        public Criteria andIndexnoGreaterThan(Integer value) {
            addCriterion("IndexNO >", value, "indexno");
            return (Criteria) this;
        }

        public Criteria andIndexnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("IndexNO >=", value, "indexno");
            return (Criteria) this;
        }

        public Criteria andIndexnoLessThan(Integer value) {
            addCriterion("IndexNO <", value, "indexno");
            return (Criteria) this;
        }

        public Criteria andIndexnoLessThanOrEqualTo(Integer value) {
            addCriterion("IndexNO <=", value, "indexno");
            return (Criteria) this;
        }

        public Criteria andIndexnoIn(List<Integer> values) {
            addCriterion("IndexNO in", values, "indexno");
            return (Criteria) this;
        }

        public Criteria andIndexnoNotIn(List<Integer> values) {
            addCriterion("IndexNO not in", values, "indexno");
            return (Criteria) this;
        }

        public Criteria andIndexnoBetween(Integer value1, Integer value2) {
            addCriterion("IndexNO between", value1, value2, "indexno");
            return (Criteria) this;
        }

        public Criteria andIndexnoNotBetween(Integer value1, Integer value2) {
            addCriterion("IndexNO not between", value1, value2, "indexno");
            return (Criteria) this;
        }

        public Criteria andXwindexnoIsNull() {
            addCriterion("XwIndexNo is null");
            return (Criteria) this;
        }

        public Criteria andXwindexnoIsNotNull() {
            addCriterion("XwIndexNo is not null");
            return (Criteria) this;
        }

        public Criteria andXwindexnoEqualTo(Integer value) {
            addCriterion("XwIndexNo =", value, "xwindexno");
            return (Criteria) this;
        }

        public Criteria andXwindexnoNotEqualTo(Integer value) {
            addCriterion("XwIndexNo <>", value, "xwindexno");
            return (Criteria) this;
        }

        public Criteria andXwindexnoGreaterThan(Integer value) {
            addCriterion("XwIndexNo >", value, "xwindexno");
            return (Criteria) this;
        }

        public Criteria andXwindexnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("XwIndexNo >=", value, "xwindexno");
            return (Criteria) this;
        }

        public Criteria andXwindexnoLessThan(Integer value) {
            addCriterion("XwIndexNo <", value, "xwindexno");
            return (Criteria) this;
        }

        public Criteria andXwindexnoLessThanOrEqualTo(Integer value) {
            addCriterion("XwIndexNo <=", value, "xwindexno");
            return (Criteria) this;
        }

        public Criteria andXwindexnoIn(List<Integer> values) {
            addCriterion("XwIndexNo in", values, "xwindexno");
            return (Criteria) this;
        }

        public Criteria andXwindexnoNotIn(List<Integer> values) {
            addCriterion("XwIndexNo not in", values, "xwindexno");
            return (Criteria) this;
        }

        public Criteria andXwindexnoBetween(Integer value1, Integer value2) {
            addCriterion("XwIndexNo between", value1, value2, "xwindexno");
            return (Criteria) this;
        }

        public Criteria andXwindexnoNotBetween(Integer value1, Integer value2) {
            addCriterion("XwIndexNo not between", value1, value2, "xwindexno");
            return (Criteria) this;
        }

        public Criteria andIndexnewnoIsNull() {
            addCriterion("IndexNewNO is null");
            return (Criteria) this;
        }

        public Criteria andIndexnewnoIsNotNull() {
            addCriterion("IndexNewNO is not null");
            return (Criteria) this;
        }

        public Criteria andIndexnewnoEqualTo(Integer value) {
            addCriterion("IndexNewNO =", value, "indexnewno");
            return (Criteria) this;
        }

        public Criteria andIndexnewnoNotEqualTo(Integer value) {
            addCriterion("IndexNewNO <>", value, "indexnewno");
            return (Criteria) this;
        }

        public Criteria andIndexnewnoGreaterThan(Integer value) {
            addCriterion("IndexNewNO >", value, "indexnewno");
            return (Criteria) this;
        }

        public Criteria andIndexnewnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("IndexNewNO >=", value, "indexnewno");
            return (Criteria) this;
        }

        public Criteria andIndexnewnoLessThan(Integer value) {
            addCriterion("IndexNewNO <", value, "indexnewno");
            return (Criteria) this;
        }

        public Criteria andIndexnewnoLessThanOrEqualTo(Integer value) {
            addCriterion("IndexNewNO <=", value, "indexnewno");
            return (Criteria) this;
        }

        public Criteria andIndexnewnoIn(List<Integer> values) {
            addCriterion("IndexNewNO in", values, "indexnewno");
            return (Criteria) this;
        }

        public Criteria andIndexnewnoNotIn(List<Integer> values) {
            addCriterion("IndexNewNO not in", values, "indexnewno");
            return (Criteria) this;
        }

        public Criteria andIndexnewnoBetween(Integer value1, Integer value2) {
            addCriterion("IndexNewNO between", value1, value2, "indexnewno");
            return (Criteria) this;
        }

        public Criteria andIndexnewnoNotBetween(Integer value1, Integer value2) {
            addCriterion("IndexNewNO not between", value1, value2, "indexnewno");
            return (Criteria) this;
        }

        public Criteria andMartIsNull() {
            addCriterion("Mart is null");
            return (Criteria) this;
        }

        public Criteria andMartIsNotNull() {
            addCriterion("Mart is not null");
            return (Criteria) this;
        }

        public Criteria andMartEqualTo(String value) {
            addCriterion("Mart =", value, "mart");
            return (Criteria) this;
        }

        public Criteria andMartNotEqualTo(String value) {
            addCriterion("Mart <>", value, "mart");
            return (Criteria) this;
        }

        public Criteria andMartGreaterThan(String value) {
            addCriterion("Mart >", value, "mart");
            return (Criteria) this;
        }

        public Criteria andMartGreaterThanOrEqualTo(String value) {
            addCriterion("Mart >=", value, "mart");
            return (Criteria) this;
        }

        public Criteria andMartLessThan(String value) {
            addCriterion("Mart <", value, "mart");
            return (Criteria) this;
        }

        public Criteria andMartLessThanOrEqualTo(String value) {
            addCriterion("Mart <=", value, "mart");
            return (Criteria) this;
        }

        public Criteria andMartLike(String value) {
            addCriterion("Mart like", value, "mart");
            return (Criteria) this;
        }

        public Criteria andMartNotLike(String value) {
            addCriterion("Mart not like", value, "mart");
            return (Criteria) this;
        }

        public Criteria andMartIn(List<String> values) {
            addCriterion("Mart in", values, "mart");
            return (Criteria) this;
        }

        public Criteria andMartNotIn(List<String> values) {
            addCriterion("Mart not in", values, "mart");
            return (Criteria) this;
        }

        public Criteria andMartBetween(String value1, String value2) {
            addCriterion("Mart between", value1, value2, "mart");
            return (Criteria) this;
        }

        public Criteria andMartNotBetween(String value1, String value2) {
            addCriterion("Mart not between", value1, value2, "mart");
            return (Criteria) this;
        }

        public Criteria andMartnoIsNull() {
            addCriterion("MartNo is null");
            return (Criteria) this;
        }

        public Criteria andMartnoIsNotNull() {
            addCriterion("MartNo is not null");
            return (Criteria) this;
        }

        public Criteria andMartnoEqualTo(String value) {
            addCriterion("MartNo =", value, "martno");
            return (Criteria) this;
        }

        public Criteria andMartnoNotEqualTo(String value) {
            addCriterion("MartNo <>", value, "martno");
            return (Criteria) this;
        }

        public Criteria andMartnoGreaterThan(String value) {
            addCriterion("MartNo >", value, "martno");
            return (Criteria) this;
        }

        public Criteria andMartnoGreaterThanOrEqualTo(String value) {
            addCriterion("MartNo >=", value, "martno");
            return (Criteria) this;
        }

        public Criteria andMartnoLessThan(String value) {
            addCriterion("MartNo <", value, "martno");
            return (Criteria) this;
        }

        public Criteria andMartnoLessThanOrEqualTo(String value) {
            addCriterion("MartNo <=", value, "martno");
            return (Criteria) this;
        }

        public Criteria andMartnoLike(String value) {
            addCriterion("MartNo like", value, "martno");
            return (Criteria) this;
        }

        public Criteria andMartnoNotLike(String value) {
            addCriterion("MartNo not like", value, "martno");
            return (Criteria) this;
        }

        public Criteria andMartnoIn(List<String> values) {
            addCriterion("MartNo in", values, "martno");
            return (Criteria) this;
        }

        public Criteria andMartnoNotIn(List<String> values) {
            addCriterion("MartNo not in", values, "martno");
            return (Criteria) this;
        }

        public Criteria andMartnoBetween(String value1, String value2) {
            addCriterion("MartNo between", value1, value2, "martno");
            return (Criteria) this;
        }

        public Criteria andMartnoNotBetween(String value1, String value2) {
            addCriterion("MartNo not between", value1, value2, "martno");
            return (Criteria) this;
        }

        public Criteria andIsmdkIsNull() {
            addCriterion("IsMdk is null");
            return (Criteria) this;
        }

        public Criteria andIsmdkIsNotNull() {
            addCriterion("IsMdk is not null");
            return (Criteria) this;
        }

        public Criteria andIsmdkEqualTo(Integer value) {
            addCriterion("IsMdk =", value, "ismdk");
            return (Criteria) this;
        }

        public Criteria andIsmdkNotEqualTo(Integer value) {
            addCriterion("IsMdk <>", value, "ismdk");
            return (Criteria) this;
        }

        public Criteria andIsmdkGreaterThan(Integer value) {
            addCriterion("IsMdk >", value, "ismdk");
            return (Criteria) this;
        }

        public Criteria andIsmdkGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsMdk >=", value, "ismdk");
            return (Criteria) this;
        }

        public Criteria andIsmdkLessThan(Integer value) {
            addCriterion("IsMdk <", value, "ismdk");
            return (Criteria) this;
        }

        public Criteria andIsmdkLessThanOrEqualTo(Integer value) {
            addCriterion("IsMdk <=", value, "ismdk");
            return (Criteria) this;
        }

        public Criteria andIsmdkIn(List<Integer> values) {
            addCriterion("IsMdk in", values, "ismdk");
            return (Criteria) this;
        }

        public Criteria andIsmdkNotIn(List<Integer> values) {
            addCriterion("IsMdk not in", values, "ismdk");
            return (Criteria) this;
        }

        public Criteria andIsmdkBetween(Integer value1, Integer value2) {
            addCriterion("IsMdk between", value1, value2, "ismdk");
            return (Criteria) this;
        }

        public Criteria andIsmdkNotBetween(Integer value1, Integer value2) {
            addCriterion("IsMdk not between", value1, value2, "ismdk");
            return (Criteria) this;
        }

        public Criteria andIsallmemoIsNull() {
            addCriterion("IsAllMemo is null");
            return (Criteria) this;
        }

        public Criteria andIsallmemoIsNotNull() {
            addCriterion("IsAllMemo is not null");
            return (Criteria) this;
        }

        public Criteria andIsallmemoEqualTo(Integer value) {
            addCriterion("IsAllMemo =", value, "isallmemo");
            return (Criteria) this;
        }

        public Criteria andIsallmemoNotEqualTo(Integer value) {
            addCriterion("IsAllMemo <>", value, "isallmemo");
            return (Criteria) this;
        }

        public Criteria andIsallmemoGreaterThan(Integer value) {
            addCriterion("IsAllMemo >", value, "isallmemo");
            return (Criteria) this;
        }

        public Criteria andIsallmemoGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsAllMemo >=", value, "isallmemo");
            return (Criteria) this;
        }

        public Criteria andIsallmemoLessThan(Integer value) {
            addCriterion("IsAllMemo <", value, "isallmemo");
            return (Criteria) this;
        }

        public Criteria andIsallmemoLessThanOrEqualTo(Integer value) {
            addCriterion("IsAllMemo <=", value, "isallmemo");
            return (Criteria) this;
        }

        public Criteria andIsallmemoIn(List<Integer> values) {
            addCriterion("IsAllMemo in", values, "isallmemo");
            return (Criteria) this;
        }

        public Criteria andIsallmemoNotIn(List<Integer> values) {
            addCriterion("IsAllMemo not in", values, "isallmemo");
            return (Criteria) this;
        }

        public Criteria andIsallmemoBetween(Integer value1, Integer value2) {
            addCriterion("IsAllMemo between", value1, value2, "isallmemo");
            return (Criteria) this;
        }

        public Criteria andIsallmemoNotBetween(Integer value1, Integer value2) {
            addCriterion("IsAllMemo not between", value1, value2, "isallmemo");
            return (Criteria) this;
        }

        public Criteria andIsallcorpIsNull() {
            addCriterion("IsAllCorp is null");
            return (Criteria) this;
        }

        public Criteria andIsallcorpIsNotNull() {
            addCriterion("IsAllCorp is not null");
            return (Criteria) this;
        }

        public Criteria andIsallcorpEqualTo(Integer value) {
            addCriterion("IsAllCorp =", value, "isallcorp");
            return (Criteria) this;
        }

        public Criteria andIsallcorpNotEqualTo(Integer value) {
            addCriterion("IsAllCorp <>", value, "isallcorp");
            return (Criteria) this;
        }

        public Criteria andIsallcorpGreaterThan(Integer value) {
            addCriterion("IsAllCorp >", value, "isallcorp");
            return (Criteria) this;
        }

        public Criteria andIsallcorpGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsAllCorp >=", value, "isallcorp");
            return (Criteria) this;
        }

        public Criteria andIsallcorpLessThan(Integer value) {
            addCriterion("IsAllCorp <", value, "isallcorp");
            return (Criteria) this;
        }

        public Criteria andIsallcorpLessThanOrEqualTo(Integer value) {
            addCriterion("IsAllCorp <=", value, "isallcorp");
            return (Criteria) this;
        }

        public Criteria andIsallcorpIn(List<Integer> values) {
            addCriterion("IsAllCorp in", values, "isallcorp");
            return (Criteria) this;
        }

        public Criteria andIsallcorpNotIn(List<Integer> values) {
            addCriterion("IsAllCorp not in", values, "isallcorp");
            return (Criteria) this;
        }

        public Criteria andIsallcorpBetween(Integer value1, Integer value2) {
            addCriterion("IsAllCorp between", value1, value2, "isallcorp");
            return (Criteria) this;
        }

        public Criteria andIsallcorpNotBetween(Integer value1, Integer value2) {
            addCriterion("IsAllCorp not between", value1, value2, "isallcorp");
            return (Criteria) this;
        }

        public Criteria andIsallcorpgoodIsNull() {
            addCriterion("IsAllCorpGood is null");
            return (Criteria) this;
        }

        public Criteria andIsallcorpgoodIsNotNull() {
            addCriterion("IsAllCorpGood is not null");
            return (Criteria) this;
        }

        public Criteria andIsallcorpgoodEqualTo(Integer value) {
            addCriterion("IsAllCorpGood =", value, "isallcorpgood");
            return (Criteria) this;
        }

        public Criteria andIsallcorpgoodNotEqualTo(Integer value) {
            addCriterion("IsAllCorpGood <>", value, "isallcorpgood");
            return (Criteria) this;
        }

        public Criteria andIsallcorpgoodGreaterThan(Integer value) {
            addCriterion("IsAllCorpGood >", value, "isallcorpgood");
            return (Criteria) this;
        }

        public Criteria andIsallcorpgoodGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsAllCorpGood >=", value, "isallcorpgood");
            return (Criteria) this;
        }

        public Criteria andIsallcorpgoodLessThan(Integer value) {
            addCriterion("IsAllCorpGood <", value, "isallcorpgood");
            return (Criteria) this;
        }

        public Criteria andIsallcorpgoodLessThanOrEqualTo(Integer value) {
            addCriterion("IsAllCorpGood <=", value, "isallcorpgood");
            return (Criteria) this;
        }

        public Criteria andIsallcorpgoodIn(List<Integer> values) {
            addCriterion("IsAllCorpGood in", values, "isallcorpgood");
            return (Criteria) this;
        }

        public Criteria andIsallcorpgoodNotIn(List<Integer> values) {
            addCriterion("IsAllCorpGood not in", values, "isallcorpgood");
            return (Criteria) this;
        }

        public Criteria andIsallcorpgoodBetween(Integer value1, Integer value2) {
            addCriterion("IsAllCorpGood between", value1, value2, "isallcorpgood");
            return (Criteria) this;
        }

        public Criteria andIsallcorpgoodNotBetween(Integer value1, Integer value2) {
            addCriterion("IsAllCorpGood not between", value1, value2, "isallcorpgood");
            return (Criteria) this;
        }

        public Criteria andIsfibreIsNull() {
            addCriterion("IsFibre is null");
            return (Criteria) this;
        }

        public Criteria andIsfibreIsNotNull() {
            addCriterion("IsFibre is not null");
            return (Criteria) this;
        }

        public Criteria andIsfibreEqualTo(Integer value) {
            addCriterion("IsFibre =", value, "isfibre");
            return (Criteria) this;
        }

        public Criteria andIsfibreNotEqualTo(Integer value) {
            addCriterion("IsFibre <>", value, "isfibre");
            return (Criteria) this;
        }

        public Criteria andIsfibreGreaterThan(Integer value) {
            addCriterion("IsFibre >", value, "isfibre");
            return (Criteria) this;
        }

        public Criteria andIsfibreGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsFibre >=", value, "isfibre");
            return (Criteria) this;
        }

        public Criteria andIsfibreLessThan(Integer value) {
            addCriterion("IsFibre <", value, "isfibre");
            return (Criteria) this;
        }

        public Criteria andIsfibreLessThanOrEqualTo(Integer value) {
            addCriterion("IsFibre <=", value, "isfibre");
            return (Criteria) this;
        }

        public Criteria andIsfibreIn(List<Integer> values) {
            addCriterion("IsFibre in", values, "isfibre");
            return (Criteria) this;
        }

        public Criteria andIsfibreNotIn(List<Integer> values) {
            addCriterion("IsFibre not in", values, "isfibre");
            return (Criteria) this;
        }

        public Criteria andIsfibreBetween(Integer value1, Integer value2) {
            addCriterion("IsFibre between", value1, value2, "isfibre");
            return (Criteria) this;
        }

        public Criteria andIsfibreNotBetween(Integer value1, Integer value2) {
            addCriterion("IsFibre not between", value1, value2, "isfibre");
            return (Criteria) this;
        }

        public Criteria andIseditIsNull() {
            addCriterion("IsEdit is null");
            return (Criteria) this;
        }

        public Criteria andIseditIsNotNull() {
            addCriterion("IsEdit is not null");
            return (Criteria) this;
        }

        public Criteria andIseditEqualTo(Integer value) {
            addCriterion("IsEdit =", value, "isedit");
            return (Criteria) this;
        }

        public Criteria andIseditNotEqualTo(Integer value) {
            addCriterion("IsEdit <>", value, "isedit");
            return (Criteria) this;
        }

        public Criteria andIseditGreaterThan(Integer value) {
            addCriterion("IsEdit >", value, "isedit");
            return (Criteria) this;
        }

        public Criteria andIseditGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsEdit >=", value, "isedit");
            return (Criteria) this;
        }

        public Criteria andIseditLessThan(Integer value) {
            addCriterion("IsEdit <", value, "isedit");
            return (Criteria) this;
        }

        public Criteria andIseditLessThanOrEqualTo(Integer value) {
            addCriterion("IsEdit <=", value, "isedit");
            return (Criteria) this;
        }

        public Criteria andIseditIn(List<Integer> values) {
            addCriterion("IsEdit in", values, "isedit");
            return (Criteria) this;
        }

        public Criteria andIseditNotIn(List<Integer> values) {
            addCriterion("IsEdit not in", values, "isedit");
            return (Criteria) this;
        }

        public Criteria andIseditBetween(Integer value1, Integer value2) {
            addCriterion("IsEdit between", value1, value2, "isedit");
            return (Criteria) this;
        }

        public Criteria andIseditNotBetween(Integer value1, Integer value2) {
            addCriterion("IsEdit not between", value1, value2, "isedit");
            return (Criteria) this;
        }

        public Criteria andIstryIsNull() {
            addCriterion("IsTry is null");
            return (Criteria) this;
        }

        public Criteria andIstryIsNotNull() {
            addCriterion("IsTry is not null");
            return (Criteria) this;
        }

        public Criteria andIstryEqualTo(Integer value) {
            addCriterion("IsTry =", value, "istry");
            return (Criteria) this;
        }

        public Criteria andIstryNotEqualTo(Integer value) {
            addCriterion("IsTry <>", value, "istry");
            return (Criteria) this;
        }

        public Criteria andIstryGreaterThan(Integer value) {
            addCriterion("IsTry >", value, "istry");
            return (Criteria) this;
        }

        public Criteria andIstryGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsTry >=", value, "istry");
            return (Criteria) this;
        }

        public Criteria andIstryLessThan(Integer value) {
            addCriterion("IsTry <", value, "istry");
            return (Criteria) this;
        }

        public Criteria andIstryLessThanOrEqualTo(Integer value) {
            addCriterion("IsTry <=", value, "istry");
            return (Criteria) this;
        }

        public Criteria andIstryIn(List<Integer> values) {
            addCriterion("IsTry in", values, "istry");
            return (Criteria) this;
        }

        public Criteria andIstryNotIn(List<Integer> values) {
            addCriterion("IsTry not in", values, "istry");
            return (Criteria) this;
        }

        public Criteria andIstryBetween(Integer value1, Integer value2) {
            addCriterion("IsTry between", value1, value2, "istry");
            return (Criteria) this;
        }

        public Criteria andIstryNotBetween(Integer value1, Integer value2) {
            addCriterion("IsTry not between", value1, value2, "istry");
            return (Criteria) this;
        }

        public Criteria andIsusterIsNull() {
            addCriterion("IsUster is null");
            return (Criteria) this;
        }

        public Criteria andIsusterIsNotNull() {
            addCriterion("IsUster is not null");
            return (Criteria) this;
        }

        public Criteria andIsusterEqualTo(Integer value) {
            addCriterion("IsUster =", value, "isuster");
            return (Criteria) this;
        }

        public Criteria andIsusterNotEqualTo(Integer value) {
            addCriterion("IsUster <>", value, "isuster");
            return (Criteria) this;
        }

        public Criteria andIsusterGreaterThan(Integer value) {
            addCriterion("IsUster >", value, "isuster");
            return (Criteria) this;
        }

        public Criteria andIsusterGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsUster >=", value, "isuster");
            return (Criteria) this;
        }

        public Criteria andIsusterLessThan(Integer value) {
            addCriterion("IsUster <", value, "isuster");
            return (Criteria) this;
        }

        public Criteria andIsusterLessThanOrEqualTo(Integer value) {
            addCriterion("IsUster <=", value, "isuster");
            return (Criteria) this;
        }

        public Criteria andIsusterIn(List<Integer> values) {
            addCriterion("IsUster in", values, "isuster");
            return (Criteria) this;
        }

        public Criteria andIsusterNotIn(List<Integer> values) {
            addCriterion("IsUster not in", values, "isuster");
            return (Criteria) this;
        }

        public Criteria andIsusterBetween(Integer value1, Integer value2) {
            addCriterion("IsUster between", value1, value2, "isuster");
            return (Criteria) this;
        }

        public Criteria andIsusterNotBetween(Integer value1, Integer value2) {
            addCriterion("IsUster not between", value1, value2, "isuster");
            return (Criteria) this;
        }

        public Criteria andTrydateIsNull() {
            addCriterion("TryDate is null");
            return (Criteria) this;
        }

        public Criteria andTrydateIsNotNull() {
            addCriterion("TryDate is not null");
            return (Criteria) this;
        }

        public Criteria andTrydateEqualTo(Date value) {
            addCriterion("TryDate =", value, "trydate");
            return (Criteria) this;
        }

        public Criteria andTrydateNotEqualTo(Date value) {
            addCriterion("TryDate <>", value, "trydate");
            return (Criteria) this;
        }

        public Criteria andTrydateGreaterThan(Date value) {
            addCriterion("TryDate >", value, "trydate");
            return (Criteria) this;
        }

        public Criteria andTrydateGreaterThanOrEqualTo(Date value) {
            addCriterion("TryDate >=", value, "trydate");
            return (Criteria) this;
        }

        public Criteria andTrydateLessThan(Date value) {
            addCriterion("TryDate <", value, "trydate");
            return (Criteria) this;
        }

        public Criteria andTrydateLessThanOrEqualTo(Date value) {
            addCriterion("TryDate <=", value, "trydate");
            return (Criteria) this;
        }

        public Criteria andTrydateIn(List<Date> values) {
            addCriterion("TryDate in", values, "trydate");
            return (Criteria) this;
        }

        public Criteria andTrydateNotIn(List<Date> values) {
            addCriterion("TryDate not in", values, "trydate");
            return (Criteria) this;
        }

        public Criteria andTrydateBetween(Date value1, Date value2) {
            addCriterion("TryDate between", value1, value2, "trydate");
            return (Criteria) this;
        }

        public Criteria andTrydateNotBetween(Date value1, Date value2) {
            addCriterion("TryDate not between", value1, value2, "trydate");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("StartDate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("StartDate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("StartDate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("StartDate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("StartDate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("StartDate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("StartDate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("StartDate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("StartDate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("StartDate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("StartDate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("StartDate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("EndDate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("EndDate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("EndDate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("EndDate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("EndDate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("EndDate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("EndDate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("EndDate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("EndDate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("EndDate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("EndDate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("EndDate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameIsNull() {
            addCriterion("SxwLinkName is null");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameIsNotNull() {
            addCriterion("SxwLinkName is not null");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameEqualTo(String value) {
            addCriterion("SxwLinkName =", value, "sxwlinkname");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameNotEqualTo(String value) {
            addCriterion("SxwLinkName <>", value, "sxwlinkname");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameGreaterThan(String value) {
            addCriterion("SxwLinkName >", value, "sxwlinkname");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameGreaterThanOrEqualTo(String value) {
            addCriterion("SxwLinkName >=", value, "sxwlinkname");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameLessThan(String value) {
            addCriterion("SxwLinkName <", value, "sxwlinkname");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameLessThanOrEqualTo(String value) {
            addCriterion("SxwLinkName <=", value, "sxwlinkname");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameLike(String value) {
            addCriterion("SxwLinkName like", value, "sxwlinkname");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameNotLike(String value) {
            addCriterion("SxwLinkName not like", value, "sxwlinkname");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameIn(List<String> values) {
            addCriterion("SxwLinkName in", values, "sxwlinkname");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameNotIn(List<String> values) {
            addCriterion("SxwLinkName not in", values, "sxwlinkname");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameBetween(String value1, String value2) {
            addCriterion("SxwLinkName between", value1, value2, "sxwlinkname");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameNotBetween(String value1, String value2) {
            addCriterion("SxwLinkName not between", value1, value2, "sxwlinkname");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameBuyIsNull() {
            addCriterion("SxwLinkName_Buy is null");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameBuyIsNotNull() {
            addCriterion("SxwLinkName_Buy is not null");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameBuyEqualTo(String value) {
            addCriterion("SxwLinkName_Buy =", value, "sxwlinknameBuy");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameBuyNotEqualTo(String value) {
            addCriterion("SxwLinkName_Buy <>", value, "sxwlinknameBuy");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameBuyGreaterThan(String value) {
            addCriterion("SxwLinkName_Buy >", value, "sxwlinknameBuy");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameBuyGreaterThanOrEqualTo(String value) {
            addCriterion("SxwLinkName_Buy >=", value, "sxwlinknameBuy");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameBuyLessThan(String value) {
            addCriterion("SxwLinkName_Buy <", value, "sxwlinknameBuy");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameBuyLessThanOrEqualTo(String value) {
            addCriterion("SxwLinkName_Buy <=", value, "sxwlinknameBuy");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameBuyLike(String value) {
            addCriterion("SxwLinkName_Buy like", value, "sxwlinknameBuy");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameBuyNotLike(String value) {
            addCriterion("SxwLinkName_Buy not like", value, "sxwlinknameBuy");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameBuyIn(List<String> values) {
            addCriterion("SxwLinkName_Buy in", values, "sxwlinknameBuy");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameBuyNotIn(List<String> values) {
            addCriterion("SxwLinkName_Buy not in", values, "sxwlinknameBuy");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameBuyBetween(String value1, String value2) {
            addCriterion("SxwLinkName_Buy between", value1, value2, "sxwlinknameBuy");
            return (Criteria) this;
        }

        public Criteria andSxwlinknameBuyNotBetween(String value1, String value2) {
            addCriterion("SxwLinkName_Buy not between", value1, value2, "sxwlinknameBuy");
            return (Criteria) this;
        }

        public Criteria andSxwstarIsNull() {
            addCriterion("SxwStar is null");
            return (Criteria) this;
        }

        public Criteria andSxwstarIsNotNull() {
            addCriterion("SxwStar is not null");
            return (Criteria) this;
        }

        public Criteria andSxwstarEqualTo(Double value) {
            addCriterion("SxwStar =", value, "sxwstar");
            return (Criteria) this;
        }

        public Criteria andSxwstarNotEqualTo(Double value) {
            addCriterion("SxwStar <>", value, "sxwstar");
            return (Criteria) this;
        }

        public Criteria andSxwstarGreaterThan(Double value) {
            addCriterion("SxwStar >", value, "sxwstar");
            return (Criteria) this;
        }

        public Criteria andSxwstarGreaterThanOrEqualTo(Double value) {
            addCriterion("SxwStar >=", value, "sxwstar");
            return (Criteria) this;
        }

        public Criteria andSxwstarLessThan(Double value) {
            addCriterion("SxwStar <", value, "sxwstar");
            return (Criteria) this;
        }

        public Criteria andSxwstarLessThanOrEqualTo(Double value) {
            addCriterion("SxwStar <=", value, "sxwstar");
            return (Criteria) this;
        }

        public Criteria andSxwstarIn(List<Double> values) {
            addCriterion("SxwStar in", values, "sxwstar");
            return (Criteria) this;
        }

        public Criteria andSxwstarNotIn(List<Double> values) {
            addCriterion("SxwStar not in", values, "sxwstar");
            return (Criteria) this;
        }

        public Criteria andSxwstarBetween(Double value1, Double value2) {
            addCriterion("SxwStar between", value1, value2, "sxwstar");
            return (Criteria) this;
        }

        public Criteria andSxwstarNotBetween(Double value1, Double value2) {
            addCriterion("SxwStar not between", value1, value2, "sxwstar");
            return (Criteria) this;
        }

        public Criteria andIsmmindexIsNull() {
            addCriterion("IsMmIndex is null");
            return (Criteria) this;
        }

        public Criteria andIsmmindexIsNotNull() {
            addCriterion("IsMmIndex is not null");
            return (Criteria) this;
        }

        public Criteria andIsmmindexEqualTo(Integer value) {
            addCriterion("IsMmIndex =", value, "ismmindex");
            return (Criteria) this;
        }

        public Criteria andIsmmindexNotEqualTo(Integer value) {
            addCriterion("IsMmIndex <>", value, "ismmindex");
            return (Criteria) this;
        }

        public Criteria andIsmmindexGreaterThan(Integer value) {
            addCriterion("IsMmIndex >", value, "ismmindex");
            return (Criteria) this;
        }

        public Criteria andIsmmindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsMmIndex >=", value, "ismmindex");
            return (Criteria) this;
        }

        public Criteria andIsmmindexLessThan(Integer value) {
            addCriterion("IsMmIndex <", value, "ismmindex");
            return (Criteria) this;
        }

        public Criteria andIsmmindexLessThanOrEqualTo(Integer value) {
            addCriterion("IsMmIndex <=", value, "ismmindex");
            return (Criteria) this;
        }

        public Criteria andIsmmindexIn(List<Integer> values) {
            addCriterion("IsMmIndex in", values, "ismmindex");
            return (Criteria) this;
        }

        public Criteria andIsmmindexNotIn(List<Integer> values) {
            addCriterion("IsMmIndex not in", values, "ismmindex");
            return (Criteria) this;
        }

        public Criteria andIsmmindexBetween(Integer value1, Integer value2) {
            addCriterion("IsMmIndex between", value1, value2, "ismmindex");
            return (Criteria) this;
        }

        public Criteria andIsmmindexNotBetween(Integer value1, Integer value2) {
            addCriterion("IsMmIndex not between", value1, value2, "ismmindex");
            return (Criteria) this;
        }

        public Criteria andIsbuyuster2007IsNull() {
            addCriterion("IsBuyUster2007 is null");
            return (Criteria) this;
        }

        public Criteria andIsbuyuster2007IsNotNull() {
            addCriterion("IsBuyUster2007 is not null");
            return (Criteria) this;
        }

        public Criteria andIsbuyuster2007EqualTo(Integer value) {
            addCriterion("IsBuyUster2007 =", value, "isbuyuster2007");
            return (Criteria) this;
        }

        public Criteria andIsbuyuster2007NotEqualTo(Integer value) {
            addCriterion("IsBuyUster2007 <>", value, "isbuyuster2007");
            return (Criteria) this;
        }

        public Criteria andIsbuyuster2007GreaterThan(Integer value) {
            addCriterion("IsBuyUster2007 >", value, "isbuyuster2007");
            return (Criteria) this;
        }

        public Criteria andIsbuyuster2007GreaterThanOrEqualTo(Integer value) {
            addCriterion("IsBuyUster2007 >=", value, "isbuyuster2007");
            return (Criteria) this;
        }

        public Criteria andIsbuyuster2007LessThan(Integer value) {
            addCriterion("IsBuyUster2007 <", value, "isbuyuster2007");
            return (Criteria) this;
        }

        public Criteria andIsbuyuster2007LessThanOrEqualTo(Integer value) {
            addCriterion("IsBuyUster2007 <=", value, "isbuyuster2007");
            return (Criteria) this;
        }

        public Criteria andIsbuyuster2007In(List<Integer> values) {
            addCriterion("IsBuyUster2007 in", values, "isbuyuster2007");
            return (Criteria) this;
        }

        public Criteria andIsbuyuster2007NotIn(List<Integer> values) {
            addCriterion("IsBuyUster2007 not in", values, "isbuyuster2007");
            return (Criteria) this;
        }

        public Criteria andIsbuyuster2007Between(Integer value1, Integer value2) {
            addCriterion("IsBuyUster2007 between", value1, value2, "isbuyuster2007");
            return (Criteria) this;
        }

        public Criteria andIsbuyuster2007NotBetween(Integer value1, Integer value2) {
            addCriterion("IsBuyUster2007 not between", value1, value2, "isbuyuster2007");
            return (Criteria) this;
        }

        public Criteria andMmindexnoIsNull() {
            addCriterion("MmIndexNo is null");
            return (Criteria) this;
        }

        public Criteria andMmindexnoIsNotNull() {
            addCriterion("MmIndexNo is not null");
            return (Criteria) this;
        }

        public Criteria andMmindexnoEqualTo(Integer value) {
            addCriterion("MmIndexNo =", value, "mmindexno");
            return (Criteria) this;
        }

        public Criteria andMmindexnoNotEqualTo(Integer value) {
            addCriterion("MmIndexNo <>", value, "mmindexno");
            return (Criteria) this;
        }

        public Criteria andMmindexnoGreaterThan(Integer value) {
            addCriterion("MmIndexNo >", value, "mmindexno");
            return (Criteria) this;
        }

        public Criteria andMmindexnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("MmIndexNo >=", value, "mmindexno");
            return (Criteria) this;
        }

        public Criteria andMmindexnoLessThan(Integer value) {
            addCriterion("MmIndexNo <", value, "mmindexno");
            return (Criteria) this;
        }

        public Criteria andMmindexnoLessThanOrEqualTo(Integer value) {
            addCriterion("MmIndexNo <=", value, "mmindexno");
            return (Criteria) this;
        }

        public Criteria andMmindexnoIn(List<Integer> values) {
            addCriterion("MmIndexNo in", values, "mmindexno");
            return (Criteria) this;
        }

        public Criteria andMmindexnoNotIn(List<Integer> values) {
            addCriterion("MmIndexNo not in", values, "mmindexno");
            return (Criteria) this;
        }

        public Criteria andMmindexnoBetween(Integer value1, Integer value2) {
            addCriterion("MmIndexNo between", value1, value2, "mmindexno");
            return (Criteria) this;
        }

        public Criteria andMmindexnoNotBetween(Integer value1, Integer value2) {
            addCriterion("MmIndexNo not between", value1, value2, "mmindexno");
            return (Criteria) this;
        }

        public Criteria andEditdate2IsNull() {
            addCriterion("EditDate2 is null");
            return (Criteria) this;
        }

        public Criteria andEditdate2IsNotNull() {
            addCriterion("EditDate2 is not null");
            return (Criteria) this;
        }

        public Criteria andEditdate2EqualTo(Date value) {
            addCriterion("EditDate2 =", value, "editdate2");
            return (Criteria) this;
        }

        public Criteria andEditdate2NotEqualTo(Date value) {
            addCriterion("EditDate2 <>", value, "editdate2");
            return (Criteria) this;
        }

        public Criteria andEditdate2GreaterThan(Date value) {
            addCriterion("EditDate2 >", value, "editdate2");
            return (Criteria) this;
        }

        public Criteria andEditdate2GreaterThanOrEqualTo(Date value) {
            addCriterion("EditDate2 >=", value, "editdate2");
            return (Criteria) this;
        }

        public Criteria andEditdate2LessThan(Date value) {
            addCriterion("EditDate2 <", value, "editdate2");
            return (Criteria) this;
        }

        public Criteria andEditdate2LessThanOrEqualTo(Date value) {
            addCriterion("EditDate2 <=", value, "editdate2");
            return (Criteria) this;
        }

        public Criteria andEditdate2In(List<Date> values) {
            addCriterion("EditDate2 in", values, "editdate2");
            return (Criteria) this;
        }

        public Criteria andEditdate2NotIn(List<Date> values) {
            addCriterion("EditDate2 not in", values, "editdate2");
            return (Criteria) this;
        }

        public Criteria andEditdate2Between(Date value1, Date value2) {
            addCriterion("EditDate2 between", value1, value2, "editdate2");
            return (Criteria) this;
        }

        public Criteria andEditdate2NotBetween(Date value1, Date value2) {
            addCriterion("EditDate2 not between", value1, value2, "editdate2");
            return (Criteria) this;
        }

        public Criteria andZip2IsNull() {
            addCriterion("Zip2 is null");
            return (Criteria) this;
        }

        public Criteria andZip2IsNotNull() {
            addCriterion("Zip2 is not null");
            return (Criteria) this;
        }

        public Criteria andZip2EqualTo(String value) {
            addCriterion("Zip2 =", value, "zip2");
            return (Criteria) this;
        }

        public Criteria andZip2NotEqualTo(String value) {
            addCriterion("Zip2 <>", value, "zip2");
            return (Criteria) this;
        }

        public Criteria andZip2GreaterThan(String value) {
            addCriterion("Zip2 >", value, "zip2");
            return (Criteria) this;
        }

        public Criteria andZip2GreaterThanOrEqualTo(String value) {
            addCriterion("Zip2 >=", value, "zip2");
            return (Criteria) this;
        }

        public Criteria andZip2LessThan(String value) {
            addCriterion("Zip2 <", value, "zip2");
            return (Criteria) this;
        }

        public Criteria andZip2LessThanOrEqualTo(String value) {
            addCriterion("Zip2 <=", value, "zip2");
            return (Criteria) this;
        }

        public Criteria andZip2Like(String value) {
            addCriterion("Zip2 like", value, "zip2");
            return (Criteria) this;
        }

        public Criteria andZip2NotLike(String value) {
            addCriterion("Zip2 not like", value, "zip2");
            return (Criteria) this;
        }

        public Criteria andZip2In(List<String> values) {
            addCriterion("Zip2 in", values, "zip2");
            return (Criteria) this;
        }

        public Criteria andZip2NotIn(List<String> values) {
            addCriterion("Zip2 not in", values, "zip2");
            return (Criteria) this;
        }

        public Criteria andZip2Between(String value1, String value2) {
            addCriterion("Zip2 between", value1, value2, "zip2");
            return (Criteria) this;
        }

        public Criteria andZip2NotBetween(String value1, String value2) {
            addCriterion("Zip2 not between", value1, value2, "zip2");
            return (Criteria) this;
        }

        public Criteria andCorpphone2IsNull() {
            addCriterion("CorpPhone2 is null");
            return (Criteria) this;
        }

        public Criteria andCorpphone2IsNotNull() {
            addCriterion("CorpPhone2 is not null");
            return (Criteria) this;
        }

        public Criteria andCorpphone2EqualTo(String value) {
            addCriterion("CorpPhone2 =", value, "corpphone2");
            return (Criteria) this;
        }

        public Criteria andCorpphone2NotEqualTo(String value) {
            addCriterion("CorpPhone2 <>", value, "corpphone2");
            return (Criteria) this;
        }

        public Criteria andCorpphone2GreaterThan(String value) {
            addCriterion("CorpPhone2 >", value, "corpphone2");
            return (Criteria) this;
        }

        public Criteria andCorpphone2GreaterThanOrEqualTo(String value) {
            addCriterion("CorpPhone2 >=", value, "corpphone2");
            return (Criteria) this;
        }

        public Criteria andCorpphone2LessThan(String value) {
            addCriterion("CorpPhone2 <", value, "corpphone2");
            return (Criteria) this;
        }

        public Criteria andCorpphone2LessThanOrEqualTo(String value) {
            addCriterion("CorpPhone2 <=", value, "corpphone2");
            return (Criteria) this;
        }

        public Criteria andCorpphone2Like(String value) {
            addCriterion("CorpPhone2 like", value, "corpphone2");
            return (Criteria) this;
        }

        public Criteria andCorpphone2NotLike(String value) {
            addCriterion("CorpPhone2 not like", value, "corpphone2");
            return (Criteria) this;
        }

        public Criteria andCorpphone2In(List<String> values) {
            addCriterion("CorpPhone2 in", values, "corpphone2");
            return (Criteria) this;
        }

        public Criteria andCorpphone2NotIn(List<String> values) {
            addCriterion("CorpPhone2 not in", values, "corpphone2");
            return (Criteria) this;
        }

        public Criteria andCorpphone2Between(String value1, String value2) {
            addCriterion("CorpPhone2 between", value1, value2, "corpphone2");
            return (Criteria) this;
        }

        public Criteria andCorpphone2NotBetween(String value1, String value2) {
            addCriterion("CorpPhone2 not between", value1, value2, "corpphone2");
            return (Criteria) this;
        }

        public Criteria andCorpfax2IsNull() {
            addCriterion("CorpFax2 is null");
            return (Criteria) this;
        }

        public Criteria andCorpfax2IsNotNull() {
            addCriterion("CorpFax2 is not null");
            return (Criteria) this;
        }

        public Criteria andCorpfax2EqualTo(String value) {
            addCriterion("CorpFax2 =", value, "corpfax2");
            return (Criteria) this;
        }

        public Criteria andCorpfax2NotEqualTo(String value) {
            addCriterion("CorpFax2 <>", value, "corpfax2");
            return (Criteria) this;
        }

        public Criteria andCorpfax2GreaterThan(String value) {
            addCriterion("CorpFax2 >", value, "corpfax2");
            return (Criteria) this;
        }

        public Criteria andCorpfax2GreaterThanOrEqualTo(String value) {
            addCriterion("CorpFax2 >=", value, "corpfax2");
            return (Criteria) this;
        }

        public Criteria andCorpfax2LessThan(String value) {
            addCriterion("CorpFax2 <", value, "corpfax2");
            return (Criteria) this;
        }

        public Criteria andCorpfax2LessThanOrEqualTo(String value) {
            addCriterion("CorpFax2 <=", value, "corpfax2");
            return (Criteria) this;
        }

        public Criteria andCorpfax2Like(String value) {
            addCriterion("CorpFax2 like", value, "corpfax2");
            return (Criteria) this;
        }

        public Criteria andCorpfax2NotLike(String value) {
            addCriterion("CorpFax2 not like", value, "corpfax2");
            return (Criteria) this;
        }

        public Criteria andCorpfax2In(List<String> values) {
            addCriterion("CorpFax2 in", values, "corpfax2");
            return (Criteria) this;
        }

        public Criteria andCorpfax2NotIn(List<String> values) {
            addCriterion("CorpFax2 not in", values, "corpfax2");
            return (Criteria) this;
        }

        public Criteria andCorpfax2Between(String value1, String value2) {
            addCriterion("CorpFax2 between", value1, value2, "corpfax2");
            return (Criteria) this;
        }

        public Criteria andCorpfax2NotBetween(String value1, String value2) {
            addCriterion("CorpFax2 not between", value1, value2, "corpfax2");
            return (Criteria) this;
        }

        public Criteria andContname2IsNull() {
            addCriterion("ContName2 is null");
            return (Criteria) this;
        }

        public Criteria andContname2IsNotNull() {
            addCriterion("ContName2 is not null");
            return (Criteria) this;
        }

        public Criteria andContname2EqualTo(String value) {
            addCriterion("ContName2 =", value, "contname2");
            return (Criteria) this;
        }

        public Criteria andContname2NotEqualTo(String value) {
            addCriterion("ContName2 <>", value, "contname2");
            return (Criteria) this;
        }

        public Criteria andContname2GreaterThan(String value) {
            addCriterion("ContName2 >", value, "contname2");
            return (Criteria) this;
        }

        public Criteria andContname2GreaterThanOrEqualTo(String value) {
            addCriterion("ContName2 >=", value, "contname2");
            return (Criteria) this;
        }

        public Criteria andContname2LessThan(String value) {
            addCriterion("ContName2 <", value, "contname2");
            return (Criteria) this;
        }

        public Criteria andContname2LessThanOrEqualTo(String value) {
            addCriterion("ContName2 <=", value, "contname2");
            return (Criteria) this;
        }

        public Criteria andContname2Like(String value) {
            addCriterion("ContName2 like", value, "contname2");
            return (Criteria) this;
        }

        public Criteria andContname2NotLike(String value) {
            addCriterion("ContName2 not like", value, "contname2");
            return (Criteria) this;
        }

        public Criteria andContname2In(List<String> values) {
            addCriterion("ContName2 in", values, "contname2");
            return (Criteria) this;
        }

        public Criteria andContname2NotIn(List<String> values) {
            addCriterion("ContName2 not in", values, "contname2");
            return (Criteria) this;
        }

        public Criteria andContname2Between(String value1, String value2) {
            addCriterion("ContName2 between", value1, value2, "contname2");
            return (Criteria) this;
        }

        public Criteria andContname2NotBetween(String value1, String value2) {
            addCriterion("ContName2 not between", value1, value2, "contname2");
            return (Criteria) this;
        }

        public Criteria andContsex2IsNull() {
            addCriterion("ContSex2 is null");
            return (Criteria) this;
        }

        public Criteria andContsex2IsNotNull() {
            addCriterion("ContSex2 is not null");
            return (Criteria) this;
        }

        public Criteria andContsex2EqualTo(String value) {
            addCriterion("ContSex2 =", value, "contsex2");
            return (Criteria) this;
        }

        public Criteria andContsex2NotEqualTo(String value) {
            addCriterion("ContSex2 <>", value, "contsex2");
            return (Criteria) this;
        }

        public Criteria andContsex2GreaterThan(String value) {
            addCriterion("ContSex2 >", value, "contsex2");
            return (Criteria) this;
        }

        public Criteria andContsex2GreaterThanOrEqualTo(String value) {
            addCriterion("ContSex2 >=", value, "contsex2");
            return (Criteria) this;
        }

        public Criteria andContsex2LessThan(String value) {
            addCriterion("ContSex2 <", value, "contsex2");
            return (Criteria) this;
        }

        public Criteria andContsex2LessThanOrEqualTo(String value) {
            addCriterion("ContSex2 <=", value, "contsex2");
            return (Criteria) this;
        }

        public Criteria andContsex2Like(String value) {
            addCriterion("ContSex2 like", value, "contsex2");
            return (Criteria) this;
        }

        public Criteria andContsex2NotLike(String value) {
            addCriterion("ContSex2 not like", value, "contsex2");
            return (Criteria) this;
        }

        public Criteria andContsex2In(List<String> values) {
            addCriterion("ContSex2 in", values, "contsex2");
            return (Criteria) this;
        }

        public Criteria andContsex2NotIn(List<String> values) {
            addCriterion("ContSex2 not in", values, "contsex2");
            return (Criteria) this;
        }

        public Criteria andContsex2Between(String value1, String value2) {
            addCriterion("ContSex2 between", value1, value2, "contsex2");
            return (Criteria) this;
        }

        public Criteria andContsex2NotBetween(String value1, String value2) {
            addCriterion("ContSex2 not between", value1, value2, "contsex2");
            return (Criteria) this;
        }

        public Criteria andContjob2IsNull() {
            addCriterion("ContJob2 is null");
            return (Criteria) this;
        }

        public Criteria andContjob2IsNotNull() {
            addCriterion("ContJob2 is not null");
            return (Criteria) this;
        }

        public Criteria andContjob2EqualTo(String value) {
            addCriterion("ContJob2 =", value, "contjob2");
            return (Criteria) this;
        }

        public Criteria andContjob2NotEqualTo(String value) {
            addCriterion("ContJob2 <>", value, "contjob2");
            return (Criteria) this;
        }

        public Criteria andContjob2GreaterThan(String value) {
            addCriterion("ContJob2 >", value, "contjob2");
            return (Criteria) this;
        }

        public Criteria andContjob2GreaterThanOrEqualTo(String value) {
            addCriterion("ContJob2 >=", value, "contjob2");
            return (Criteria) this;
        }

        public Criteria andContjob2LessThan(String value) {
            addCriterion("ContJob2 <", value, "contjob2");
            return (Criteria) this;
        }

        public Criteria andContjob2LessThanOrEqualTo(String value) {
            addCriterion("ContJob2 <=", value, "contjob2");
            return (Criteria) this;
        }

        public Criteria andContjob2Like(String value) {
            addCriterion("ContJob2 like", value, "contjob2");
            return (Criteria) this;
        }

        public Criteria andContjob2NotLike(String value) {
            addCriterion("ContJob2 not like", value, "contjob2");
            return (Criteria) this;
        }

        public Criteria andContjob2In(List<String> values) {
            addCriterion("ContJob2 in", values, "contjob2");
            return (Criteria) this;
        }

        public Criteria andContjob2NotIn(List<String> values) {
            addCriterion("ContJob2 not in", values, "contjob2");
            return (Criteria) this;
        }

        public Criteria andContjob2Between(String value1, String value2) {
            addCriterion("ContJob2 between", value1, value2, "contjob2");
            return (Criteria) this;
        }

        public Criteria andContjob2NotBetween(String value1, String value2) {
            addCriterion("ContJob2 not between", value1, value2, "contjob2");
            return (Criteria) this;
        }

        public Criteria andConttel2IsNull() {
            addCriterion("ContTel2 is null");
            return (Criteria) this;
        }

        public Criteria andConttel2IsNotNull() {
            addCriterion("ContTel2 is not null");
            return (Criteria) this;
        }

        public Criteria andConttel2EqualTo(String value) {
            addCriterion("ContTel2 =", value, "conttel2");
            return (Criteria) this;
        }

        public Criteria andConttel2NotEqualTo(String value) {
            addCriterion("ContTel2 <>", value, "conttel2");
            return (Criteria) this;
        }

        public Criteria andConttel2GreaterThan(String value) {
            addCriterion("ContTel2 >", value, "conttel2");
            return (Criteria) this;
        }

        public Criteria andConttel2GreaterThanOrEqualTo(String value) {
            addCriterion("ContTel2 >=", value, "conttel2");
            return (Criteria) this;
        }

        public Criteria andConttel2LessThan(String value) {
            addCriterion("ContTel2 <", value, "conttel2");
            return (Criteria) this;
        }

        public Criteria andConttel2LessThanOrEqualTo(String value) {
            addCriterion("ContTel2 <=", value, "conttel2");
            return (Criteria) this;
        }

        public Criteria andConttel2Like(String value) {
            addCriterion("ContTel2 like", value, "conttel2");
            return (Criteria) this;
        }

        public Criteria andConttel2NotLike(String value) {
            addCriterion("ContTel2 not like", value, "conttel2");
            return (Criteria) this;
        }

        public Criteria andConttel2In(List<String> values) {
            addCriterion("ContTel2 in", values, "conttel2");
            return (Criteria) this;
        }

        public Criteria andConttel2NotIn(List<String> values) {
            addCriterion("ContTel2 not in", values, "conttel2");
            return (Criteria) this;
        }

        public Criteria andConttel2Between(String value1, String value2) {
            addCriterion("ContTel2 between", value1, value2, "conttel2");
            return (Criteria) this;
        }

        public Criteria andConttel2NotBetween(String value1, String value2) {
            addCriterion("ContTel2 not between", value1, value2, "conttel2");
            return (Criteria) this;
        }

        public Criteria andContfax2IsNull() {
            addCriterion("ContFax2 is null");
            return (Criteria) this;
        }

        public Criteria andContfax2IsNotNull() {
            addCriterion("ContFax2 is not null");
            return (Criteria) this;
        }

        public Criteria andContfax2EqualTo(String value) {
            addCriterion("ContFax2 =", value, "contfax2");
            return (Criteria) this;
        }

        public Criteria andContfax2NotEqualTo(String value) {
            addCriterion("ContFax2 <>", value, "contfax2");
            return (Criteria) this;
        }

        public Criteria andContfax2GreaterThan(String value) {
            addCriterion("ContFax2 >", value, "contfax2");
            return (Criteria) this;
        }

        public Criteria andContfax2GreaterThanOrEqualTo(String value) {
            addCriterion("ContFax2 >=", value, "contfax2");
            return (Criteria) this;
        }

        public Criteria andContfax2LessThan(String value) {
            addCriterion("ContFax2 <", value, "contfax2");
            return (Criteria) this;
        }

        public Criteria andContfax2LessThanOrEqualTo(String value) {
            addCriterion("ContFax2 <=", value, "contfax2");
            return (Criteria) this;
        }

        public Criteria andContfax2Like(String value) {
            addCriterion("ContFax2 like", value, "contfax2");
            return (Criteria) this;
        }

        public Criteria andContfax2NotLike(String value) {
            addCriterion("ContFax2 not like", value, "contfax2");
            return (Criteria) this;
        }

        public Criteria andContfax2In(List<String> values) {
            addCriterion("ContFax2 in", values, "contfax2");
            return (Criteria) this;
        }

        public Criteria andContfax2NotIn(List<String> values) {
            addCriterion("ContFax2 not in", values, "contfax2");
            return (Criteria) this;
        }

        public Criteria andContfax2Between(String value1, String value2) {
            addCriterion("ContFax2 between", value1, value2, "contfax2");
            return (Criteria) this;
        }

        public Criteria andContfax2NotBetween(String value1, String value2) {
            addCriterion("ContFax2 not between", value1, value2, "contfax2");
            return (Criteria) this;
        }

        public Criteria andContmobile2IsNull() {
            addCriterion("ContMobile2 is null");
            return (Criteria) this;
        }

        public Criteria andContmobile2IsNotNull() {
            addCriterion("ContMobile2 is not null");
            return (Criteria) this;
        }

        public Criteria andContmobile2EqualTo(String value) {
            addCriterion("ContMobile2 =", value, "contmobile2");
            return (Criteria) this;
        }

        public Criteria andContmobile2NotEqualTo(String value) {
            addCriterion("ContMobile2 <>", value, "contmobile2");
            return (Criteria) this;
        }

        public Criteria andContmobile2GreaterThan(String value) {
            addCriterion("ContMobile2 >", value, "contmobile2");
            return (Criteria) this;
        }

        public Criteria andContmobile2GreaterThanOrEqualTo(String value) {
            addCriterion("ContMobile2 >=", value, "contmobile2");
            return (Criteria) this;
        }

        public Criteria andContmobile2LessThan(String value) {
            addCriterion("ContMobile2 <", value, "contmobile2");
            return (Criteria) this;
        }

        public Criteria andContmobile2LessThanOrEqualTo(String value) {
            addCriterion("ContMobile2 <=", value, "contmobile2");
            return (Criteria) this;
        }

        public Criteria andContmobile2Like(String value) {
            addCriterion("ContMobile2 like", value, "contmobile2");
            return (Criteria) this;
        }

        public Criteria andContmobile2NotLike(String value) {
            addCriterion("ContMobile2 not like", value, "contmobile2");
            return (Criteria) this;
        }

        public Criteria andContmobile2In(List<String> values) {
            addCriterion("ContMobile2 in", values, "contmobile2");
            return (Criteria) this;
        }

        public Criteria andContmobile2NotIn(List<String> values) {
            addCriterion("ContMobile2 not in", values, "contmobile2");
            return (Criteria) this;
        }

        public Criteria andContmobile2Between(String value1, String value2) {
            addCriterion("ContMobile2 between", value1, value2, "contmobile2");
            return (Criteria) this;
        }

        public Criteria andContmobile2NotBetween(String value1, String value2) {
            addCriterion("ContMobile2 not between", value1, value2, "contmobile2");
            return (Criteria) this;
        }

        public Criteria andContemail2IsNull() {
            addCriterion("ContEmail2 is null");
            return (Criteria) this;
        }

        public Criteria andContemail2IsNotNull() {
            addCriterion("ContEmail2 is not null");
            return (Criteria) this;
        }

        public Criteria andContemail2EqualTo(String value) {
            addCriterion("ContEmail2 =", value, "contemail2");
            return (Criteria) this;
        }

        public Criteria andContemail2NotEqualTo(String value) {
            addCriterion("ContEmail2 <>", value, "contemail2");
            return (Criteria) this;
        }

        public Criteria andContemail2GreaterThan(String value) {
            addCriterion("ContEmail2 >", value, "contemail2");
            return (Criteria) this;
        }

        public Criteria andContemail2GreaterThanOrEqualTo(String value) {
            addCriterion("ContEmail2 >=", value, "contemail2");
            return (Criteria) this;
        }

        public Criteria andContemail2LessThan(String value) {
            addCriterion("ContEmail2 <", value, "contemail2");
            return (Criteria) this;
        }

        public Criteria andContemail2LessThanOrEqualTo(String value) {
            addCriterion("ContEmail2 <=", value, "contemail2");
            return (Criteria) this;
        }

        public Criteria andContemail2Like(String value) {
            addCriterion("ContEmail2 like", value, "contemail2");
            return (Criteria) this;
        }

        public Criteria andContemail2NotLike(String value) {
            addCriterion("ContEmail2 not like", value, "contemail2");
            return (Criteria) this;
        }

        public Criteria andContemail2In(List<String> values) {
            addCriterion("ContEmail2 in", values, "contemail2");
            return (Criteria) this;
        }

        public Criteria andContemail2NotIn(List<String> values) {
            addCriterion("ContEmail2 not in", values, "contemail2");
            return (Criteria) this;
        }

        public Criteria andContemail2Between(String value1, String value2) {
            addCriterion("ContEmail2 between", value1, value2, "contemail2");
            return (Criteria) this;
        }

        public Criteria andContemail2NotBetween(String value1, String value2) {
            addCriterion("ContEmail2 not between", value1, value2, "contemail2");
            return (Criteria) this;
        }

        public Criteria andCorpnameEnIsNull() {
            addCriterion("CorpName_En is null");
            return (Criteria) this;
        }

        public Criteria andCorpnameEnIsNotNull() {
            addCriterion("CorpName_En is not null");
            return (Criteria) this;
        }

        public Criteria andCorpnameEnEqualTo(String value) {
            addCriterion("CorpName_En =", value, "corpnameEn");
            return (Criteria) this;
        }

        public Criteria andCorpnameEnNotEqualTo(String value) {
            addCriterion("CorpName_En <>", value, "corpnameEn");
            return (Criteria) this;
        }

        public Criteria andCorpnameEnGreaterThan(String value) {
            addCriterion("CorpName_En >", value, "corpnameEn");
            return (Criteria) this;
        }

        public Criteria andCorpnameEnGreaterThanOrEqualTo(String value) {
            addCriterion("CorpName_En >=", value, "corpnameEn");
            return (Criteria) this;
        }

        public Criteria andCorpnameEnLessThan(String value) {
            addCriterion("CorpName_En <", value, "corpnameEn");
            return (Criteria) this;
        }

        public Criteria andCorpnameEnLessThanOrEqualTo(String value) {
            addCriterion("CorpName_En <=", value, "corpnameEn");
            return (Criteria) this;
        }

        public Criteria andCorpnameEnLike(String value) {
            addCriterion("CorpName_En like", value, "corpnameEn");
            return (Criteria) this;
        }

        public Criteria andCorpnameEnNotLike(String value) {
            addCriterion("CorpName_En not like", value, "corpnameEn");
            return (Criteria) this;
        }

        public Criteria andCorpnameEnIn(List<String> values) {
            addCriterion("CorpName_En in", values, "corpnameEn");
            return (Criteria) this;
        }

        public Criteria andCorpnameEnNotIn(List<String> values) {
            addCriterion("CorpName_En not in", values, "corpnameEn");
            return (Criteria) this;
        }

        public Criteria andCorpnameEnBetween(String value1, String value2) {
            addCriterion("CorpName_En between", value1, value2, "corpnameEn");
            return (Criteria) this;
        }

        public Criteria andCorpnameEnNotBetween(String value1, String value2) {
            addCriterion("CorpName_En not between", value1, value2, "corpnameEn");
            return (Criteria) this;
        }

        public Criteria andAreaEnIsNull() {
            addCriterion("Area_En is null");
            return (Criteria) this;
        }

        public Criteria andAreaEnIsNotNull() {
            addCriterion("Area_En is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEnEqualTo(String value) {
            addCriterion("Area_En =", value, "areaEn");
            return (Criteria) this;
        }

        public Criteria andAreaEnNotEqualTo(String value) {
            addCriterion("Area_En <>", value, "areaEn");
            return (Criteria) this;
        }

        public Criteria andAreaEnGreaterThan(String value) {
            addCriterion("Area_En >", value, "areaEn");
            return (Criteria) this;
        }

        public Criteria andAreaEnGreaterThanOrEqualTo(String value) {
            addCriterion("Area_En >=", value, "areaEn");
            return (Criteria) this;
        }

        public Criteria andAreaEnLessThan(String value) {
            addCriterion("Area_En <", value, "areaEn");
            return (Criteria) this;
        }

        public Criteria andAreaEnLessThanOrEqualTo(String value) {
            addCriterion("Area_En <=", value, "areaEn");
            return (Criteria) this;
        }

        public Criteria andAreaEnLike(String value) {
            addCriterion("Area_En like", value, "areaEn");
            return (Criteria) this;
        }

        public Criteria andAreaEnNotLike(String value) {
            addCriterion("Area_En not like", value, "areaEn");
            return (Criteria) this;
        }

        public Criteria andAreaEnIn(List<String> values) {
            addCriterion("Area_En in", values, "areaEn");
            return (Criteria) this;
        }

        public Criteria andAreaEnNotIn(List<String> values) {
            addCriterion("Area_En not in", values, "areaEn");
            return (Criteria) this;
        }

        public Criteria andAreaEnBetween(String value1, String value2) {
            addCriterion("Area_En between", value1, value2, "areaEn");
            return (Criteria) this;
        }

        public Criteria andAreaEnNotBetween(String value1, String value2) {
            addCriterion("Area_En not between", value1, value2, "areaEn");
            return (Criteria) this;
        }

        public Criteria andZipEnIsNull() {
            addCriterion("Zip_En is null");
            return (Criteria) this;
        }

        public Criteria andZipEnIsNotNull() {
            addCriterion("Zip_En is not null");
            return (Criteria) this;
        }

        public Criteria andZipEnEqualTo(String value) {
            addCriterion("Zip_En =", value, "zipEn");
            return (Criteria) this;
        }

        public Criteria andZipEnNotEqualTo(String value) {
            addCriterion("Zip_En <>", value, "zipEn");
            return (Criteria) this;
        }

        public Criteria andZipEnGreaterThan(String value) {
            addCriterion("Zip_En >", value, "zipEn");
            return (Criteria) this;
        }

        public Criteria andZipEnGreaterThanOrEqualTo(String value) {
            addCriterion("Zip_En >=", value, "zipEn");
            return (Criteria) this;
        }

        public Criteria andZipEnLessThan(String value) {
            addCriterion("Zip_En <", value, "zipEn");
            return (Criteria) this;
        }

        public Criteria andZipEnLessThanOrEqualTo(String value) {
            addCriterion("Zip_En <=", value, "zipEn");
            return (Criteria) this;
        }

        public Criteria andZipEnLike(String value) {
            addCriterion("Zip_En like", value, "zipEn");
            return (Criteria) this;
        }

        public Criteria andZipEnNotLike(String value) {
            addCriterion("Zip_En not like", value, "zipEn");
            return (Criteria) this;
        }

        public Criteria andZipEnIn(List<String> values) {
            addCriterion("Zip_En in", values, "zipEn");
            return (Criteria) this;
        }

        public Criteria andZipEnNotIn(List<String> values) {
            addCriterion("Zip_En not in", values, "zipEn");
            return (Criteria) this;
        }

        public Criteria andZipEnBetween(String value1, String value2) {
            addCriterion("Zip_En between", value1, value2, "zipEn");
            return (Criteria) this;
        }

        public Criteria andZipEnNotBetween(String value1, String value2) {
            addCriterion("Zip_En not between", value1, value2, "zipEn");
            return (Criteria) this;
        }

        public Criteria andWebEnIsNull() {
            addCriterion("Web_En is null");
            return (Criteria) this;
        }

        public Criteria andWebEnIsNotNull() {
            addCriterion("Web_En is not null");
            return (Criteria) this;
        }

        public Criteria andWebEnEqualTo(String value) {
            addCriterion("Web_En =", value, "webEn");
            return (Criteria) this;
        }

        public Criteria andWebEnNotEqualTo(String value) {
            addCriterion("Web_En <>", value, "webEn");
            return (Criteria) this;
        }

        public Criteria andWebEnGreaterThan(String value) {
            addCriterion("Web_En >", value, "webEn");
            return (Criteria) this;
        }

        public Criteria andWebEnGreaterThanOrEqualTo(String value) {
            addCriterion("Web_En >=", value, "webEn");
            return (Criteria) this;
        }

        public Criteria andWebEnLessThan(String value) {
            addCriterion("Web_En <", value, "webEn");
            return (Criteria) this;
        }

        public Criteria andWebEnLessThanOrEqualTo(String value) {
            addCriterion("Web_En <=", value, "webEn");
            return (Criteria) this;
        }

        public Criteria andWebEnLike(String value) {
            addCriterion("Web_En like", value, "webEn");
            return (Criteria) this;
        }

        public Criteria andWebEnNotLike(String value) {
            addCriterion("Web_En not like", value, "webEn");
            return (Criteria) this;
        }

        public Criteria andWebEnIn(List<String> values) {
            addCriterion("Web_En in", values, "webEn");
            return (Criteria) this;
        }

        public Criteria andWebEnNotIn(List<String> values) {
            addCriterion("Web_En not in", values, "webEn");
            return (Criteria) this;
        }

        public Criteria andWebEnBetween(String value1, String value2) {
            addCriterion("Web_En between", value1, value2, "webEn");
            return (Criteria) this;
        }

        public Criteria andWebEnNotBetween(String value1, String value2) {
            addCriterion("Web_En not between", value1, value2, "webEn");
            return (Criteria) this;
        }

        public Criteria andImagenameEnIsNull() {
            addCriterion("imagename_en is null");
            return (Criteria) this;
        }

        public Criteria andImagenameEnIsNotNull() {
            addCriterion("imagename_en is not null");
            return (Criteria) this;
        }

        public Criteria andImagenameEnEqualTo(String value) {
            addCriterion("imagename_en =", value, "imagenameEn");
            return (Criteria) this;
        }

        public Criteria andImagenameEnNotEqualTo(String value) {
            addCriterion("imagename_en <>", value, "imagenameEn");
            return (Criteria) this;
        }

        public Criteria andImagenameEnGreaterThan(String value) {
            addCriterion("imagename_en >", value, "imagenameEn");
            return (Criteria) this;
        }

        public Criteria andImagenameEnGreaterThanOrEqualTo(String value) {
            addCriterion("imagename_en >=", value, "imagenameEn");
            return (Criteria) this;
        }

        public Criteria andImagenameEnLessThan(String value) {
            addCriterion("imagename_en <", value, "imagenameEn");
            return (Criteria) this;
        }

        public Criteria andImagenameEnLessThanOrEqualTo(String value) {
            addCriterion("imagename_en <=", value, "imagenameEn");
            return (Criteria) this;
        }

        public Criteria andImagenameEnLike(String value) {
            addCriterion("imagename_en like", value, "imagenameEn");
            return (Criteria) this;
        }

        public Criteria andImagenameEnNotLike(String value) {
            addCriterion("imagename_en not like", value, "imagenameEn");
            return (Criteria) this;
        }

        public Criteria andImagenameEnIn(List<String> values) {
            addCriterion("imagename_en in", values, "imagenameEn");
            return (Criteria) this;
        }

        public Criteria andImagenameEnNotIn(List<String> values) {
            addCriterion("imagename_en not in", values, "imagenameEn");
            return (Criteria) this;
        }

        public Criteria andImagenameEnBetween(String value1, String value2) {
            addCriterion("imagename_en between", value1, value2, "imagenameEn");
            return (Criteria) this;
        }

        public Criteria andImagenameEnNotBetween(String value1, String value2) {
            addCriterion("imagename_en not between", value1, value2, "imagenameEn");
            return (Criteria) this;
        }

        public Criteria andCorpphoneEnIsNull() {
            addCriterion("CorpPhone_En is null");
            return (Criteria) this;
        }

        public Criteria andCorpphoneEnIsNotNull() {
            addCriterion("CorpPhone_En is not null");
            return (Criteria) this;
        }

        public Criteria andCorpphoneEnEqualTo(String value) {
            addCriterion("CorpPhone_En =", value, "corpphoneEn");
            return (Criteria) this;
        }

        public Criteria andCorpphoneEnNotEqualTo(String value) {
            addCriterion("CorpPhone_En <>", value, "corpphoneEn");
            return (Criteria) this;
        }

        public Criteria andCorpphoneEnGreaterThan(String value) {
            addCriterion("CorpPhone_En >", value, "corpphoneEn");
            return (Criteria) this;
        }

        public Criteria andCorpphoneEnGreaterThanOrEqualTo(String value) {
            addCriterion("CorpPhone_En >=", value, "corpphoneEn");
            return (Criteria) this;
        }

        public Criteria andCorpphoneEnLessThan(String value) {
            addCriterion("CorpPhone_En <", value, "corpphoneEn");
            return (Criteria) this;
        }

        public Criteria andCorpphoneEnLessThanOrEqualTo(String value) {
            addCriterion("CorpPhone_En <=", value, "corpphoneEn");
            return (Criteria) this;
        }

        public Criteria andCorpphoneEnLike(String value) {
            addCriterion("CorpPhone_En like", value, "corpphoneEn");
            return (Criteria) this;
        }

        public Criteria andCorpphoneEnNotLike(String value) {
            addCriterion("CorpPhone_En not like", value, "corpphoneEn");
            return (Criteria) this;
        }

        public Criteria andCorpphoneEnIn(List<String> values) {
            addCriterion("CorpPhone_En in", values, "corpphoneEn");
            return (Criteria) this;
        }

        public Criteria andCorpphoneEnNotIn(List<String> values) {
            addCriterion("CorpPhone_En not in", values, "corpphoneEn");
            return (Criteria) this;
        }

        public Criteria andCorpphoneEnBetween(String value1, String value2) {
            addCriterion("CorpPhone_En between", value1, value2, "corpphoneEn");
            return (Criteria) this;
        }

        public Criteria andCorpphoneEnNotBetween(String value1, String value2) {
            addCriterion("CorpPhone_En not between", value1, value2, "corpphoneEn");
            return (Criteria) this;
        }

        public Criteria andCorpfaxEnIsNull() {
            addCriterion("CorpFax_En is null");
            return (Criteria) this;
        }

        public Criteria andCorpfaxEnIsNotNull() {
            addCriterion("CorpFax_En is not null");
            return (Criteria) this;
        }

        public Criteria andCorpfaxEnEqualTo(String value) {
            addCriterion("CorpFax_En =", value, "corpfaxEn");
            return (Criteria) this;
        }

        public Criteria andCorpfaxEnNotEqualTo(String value) {
            addCriterion("CorpFax_En <>", value, "corpfaxEn");
            return (Criteria) this;
        }

        public Criteria andCorpfaxEnGreaterThan(String value) {
            addCriterion("CorpFax_En >", value, "corpfaxEn");
            return (Criteria) this;
        }

        public Criteria andCorpfaxEnGreaterThanOrEqualTo(String value) {
            addCriterion("CorpFax_En >=", value, "corpfaxEn");
            return (Criteria) this;
        }

        public Criteria andCorpfaxEnLessThan(String value) {
            addCriterion("CorpFax_En <", value, "corpfaxEn");
            return (Criteria) this;
        }

        public Criteria andCorpfaxEnLessThanOrEqualTo(String value) {
            addCriterion("CorpFax_En <=", value, "corpfaxEn");
            return (Criteria) this;
        }

        public Criteria andCorpfaxEnLike(String value) {
            addCriterion("CorpFax_En like", value, "corpfaxEn");
            return (Criteria) this;
        }

        public Criteria andCorpfaxEnNotLike(String value) {
            addCriterion("CorpFax_En not like", value, "corpfaxEn");
            return (Criteria) this;
        }

        public Criteria andCorpfaxEnIn(List<String> values) {
            addCriterion("CorpFax_En in", values, "corpfaxEn");
            return (Criteria) this;
        }

        public Criteria andCorpfaxEnNotIn(List<String> values) {
            addCriterion("CorpFax_En not in", values, "corpfaxEn");
            return (Criteria) this;
        }

        public Criteria andCorpfaxEnBetween(String value1, String value2) {
            addCriterion("CorpFax_En between", value1, value2, "corpfaxEn");
            return (Criteria) this;
        }

        public Criteria andCorpfaxEnNotBetween(String value1, String value2) {
            addCriterion("CorpFax_En not between", value1, value2, "corpfaxEn");
            return (Criteria) this;
        }

        public Criteria andContnameEnIsNull() {
            addCriterion("ContName_En is null");
            return (Criteria) this;
        }

        public Criteria andContnameEnIsNotNull() {
            addCriterion("ContName_En is not null");
            return (Criteria) this;
        }

        public Criteria andContnameEnEqualTo(String value) {
            addCriterion("ContName_En =", value, "contnameEn");
            return (Criteria) this;
        }

        public Criteria andContnameEnNotEqualTo(String value) {
            addCriterion("ContName_En <>", value, "contnameEn");
            return (Criteria) this;
        }

        public Criteria andContnameEnGreaterThan(String value) {
            addCriterion("ContName_En >", value, "contnameEn");
            return (Criteria) this;
        }

        public Criteria andContnameEnGreaterThanOrEqualTo(String value) {
            addCriterion("ContName_En >=", value, "contnameEn");
            return (Criteria) this;
        }

        public Criteria andContnameEnLessThan(String value) {
            addCriterion("ContName_En <", value, "contnameEn");
            return (Criteria) this;
        }

        public Criteria andContnameEnLessThanOrEqualTo(String value) {
            addCriterion("ContName_En <=", value, "contnameEn");
            return (Criteria) this;
        }

        public Criteria andContnameEnLike(String value) {
            addCriterion("ContName_En like", value, "contnameEn");
            return (Criteria) this;
        }

        public Criteria andContnameEnNotLike(String value) {
            addCriterion("ContName_En not like", value, "contnameEn");
            return (Criteria) this;
        }

        public Criteria andContnameEnIn(List<String> values) {
            addCriterion("ContName_En in", values, "contnameEn");
            return (Criteria) this;
        }

        public Criteria andContnameEnNotIn(List<String> values) {
            addCriterion("ContName_En not in", values, "contnameEn");
            return (Criteria) this;
        }

        public Criteria andContnameEnBetween(String value1, String value2) {
            addCriterion("ContName_En between", value1, value2, "contnameEn");
            return (Criteria) this;
        }

        public Criteria andContnameEnNotBetween(String value1, String value2) {
            addCriterion("ContName_En not between", value1, value2, "contnameEn");
            return (Criteria) this;
        }

        public Criteria andContsexEnIsNull() {
            addCriterion("ContSex_En is null");
            return (Criteria) this;
        }

        public Criteria andContsexEnIsNotNull() {
            addCriterion("ContSex_En is not null");
            return (Criteria) this;
        }

        public Criteria andContsexEnEqualTo(String value) {
            addCriterion("ContSex_En =", value, "contsexEn");
            return (Criteria) this;
        }

        public Criteria andContsexEnNotEqualTo(String value) {
            addCriterion("ContSex_En <>", value, "contsexEn");
            return (Criteria) this;
        }

        public Criteria andContsexEnGreaterThan(String value) {
            addCriterion("ContSex_En >", value, "contsexEn");
            return (Criteria) this;
        }

        public Criteria andContsexEnGreaterThanOrEqualTo(String value) {
            addCriterion("ContSex_En >=", value, "contsexEn");
            return (Criteria) this;
        }

        public Criteria andContsexEnLessThan(String value) {
            addCriterion("ContSex_En <", value, "contsexEn");
            return (Criteria) this;
        }

        public Criteria andContsexEnLessThanOrEqualTo(String value) {
            addCriterion("ContSex_En <=", value, "contsexEn");
            return (Criteria) this;
        }

        public Criteria andContsexEnLike(String value) {
            addCriterion("ContSex_En like", value, "contsexEn");
            return (Criteria) this;
        }

        public Criteria andContsexEnNotLike(String value) {
            addCriterion("ContSex_En not like", value, "contsexEn");
            return (Criteria) this;
        }

        public Criteria andContsexEnIn(List<String> values) {
            addCriterion("ContSex_En in", values, "contsexEn");
            return (Criteria) this;
        }

        public Criteria andContsexEnNotIn(List<String> values) {
            addCriterion("ContSex_En not in", values, "contsexEn");
            return (Criteria) this;
        }

        public Criteria andContsexEnBetween(String value1, String value2) {
            addCriterion("ContSex_En between", value1, value2, "contsexEn");
            return (Criteria) this;
        }

        public Criteria andContsexEnNotBetween(String value1, String value2) {
            addCriterion("ContSex_En not between", value1, value2, "contsexEn");
            return (Criteria) this;
        }

        public Criteria andContjobEnIsNull() {
            addCriterion("ContJob_En is null");
            return (Criteria) this;
        }

        public Criteria andContjobEnIsNotNull() {
            addCriterion("ContJob_En is not null");
            return (Criteria) this;
        }

        public Criteria andContjobEnEqualTo(String value) {
            addCriterion("ContJob_En =", value, "contjobEn");
            return (Criteria) this;
        }

        public Criteria andContjobEnNotEqualTo(String value) {
            addCriterion("ContJob_En <>", value, "contjobEn");
            return (Criteria) this;
        }

        public Criteria andContjobEnGreaterThan(String value) {
            addCriterion("ContJob_En >", value, "contjobEn");
            return (Criteria) this;
        }

        public Criteria andContjobEnGreaterThanOrEqualTo(String value) {
            addCriterion("ContJob_En >=", value, "contjobEn");
            return (Criteria) this;
        }

        public Criteria andContjobEnLessThan(String value) {
            addCriterion("ContJob_En <", value, "contjobEn");
            return (Criteria) this;
        }

        public Criteria andContjobEnLessThanOrEqualTo(String value) {
            addCriterion("ContJob_En <=", value, "contjobEn");
            return (Criteria) this;
        }

        public Criteria andContjobEnLike(String value) {
            addCriterion("ContJob_En like", value, "contjobEn");
            return (Criteria) this;
        }

        public Criteria andContjobEnNotLike(String value) {
            addCriterion("ContJob_En not like", value, "contjobEn");
            return (Criteria) this;
        }

        public Criteria andContjobEnIn(List<String> values) {
            addCriterion("ContJob_En in", values, "contjobEn");
            return (Criteria) this;
        }

        public Criteria andContjobEnNotIn(List<String> values) {
            addCriterion("ContJob_En not in", values, "contjobEn");
            return (Criteria) this;
        }

        public Criteria andContjobEnBetween(String value1, String value2) {
            addCriterion("ContJob_En between", value1, value2, "contjobEn");
            return (Criteria) this;
        }

        public Criteria andContjobEnNotBetween(String value1, String value2) {
            addCriterion("ContJob_En not between", value1, value2, "contjobEn");
            return (Criteria) this;
        }

        public Criteria andConttelEnIsNull() {
            addCriterion("ContTel_En is null");
            return (Criteria) this;
        }

        public Criteria andConttelEnIsNotNull() {
            addCriterion("ContTel_En is not null");
            return (Criteria) this;
        }

        public Criteria andConttelEnEqualTo(String value) {
            addCriterion("ContTel_En =", value, "conttelEn");
            return (Criteria) this;
        }

        public Criteria andConttelEnNotEqualTo(String value) {
            addCriterion("ContTel_En <>", value, "conttelEn");
            return (Criteria) this;
        }

        public Criteria andConttelEnGreaterThan(String value) {
            addCriterion("ContTel_En >", value, "conttelEn");
            return (Criteria) this;
        }

        public Criteria andConttelEnGreaterThanOrEqualTo(String value) {
            addCriterion("ContTel_En >=", value, "conttelEn");
            return (Criteria) this;
        }

        public Criteria andConttelEnLessThan(String value) {
            addCriterion("ContTel_En <", value, "conttelEn");
            return (Criteria) this;
        }

        public Criteria andConttelEnLessThanOrEqualTo(String value) {
            addCriterion("ContTel_En <=", value, "conttelEn");
            return (Criteria) this;
        }

        public Criteria andConttelEnLike(String value) {
            addCriterion("ContTel_En like", value, "conttelEn");
            return (Criteria) this;
        }

        public Criteria andConttelEnNotLike(String value) {
            addCriterion("ContTel_En not like", value, "conttelEn");
            return (Criteria) this;
        }

        public Criteria andConttelEnIn(List<String> values) {
            addCriterion("ContTel_En in", values, "conttelEn");
            return (Criteria) this;
        }

        public Criteria andConttelEnNotIn(List<String> values) {
            addCriterion("ContTel_En not in", values, "conttelEn");
            return (Criteria) this;
        }

        public Criteria andConttelEnBetween(String value1, String value2) {
            addCriterion("ContTel_En between", value1, value2, "conttelEn");
            return (Criteria) this;
        }

        public Criteria andConttelEnNotBetween(String value1, String value2) {
            addCriterion("ContTel_En not between", value1, value2, "conttelEn");
            return (Criteria) this;
        }

        public Criteria andContfaxEnIsNull() {
            addCriterion("ContFax_En is null");
            return (Criteria) this;
        }

        public Criteria andContfaxEnIsNotNull() {
            addCriterion("ContFax_En is not null");
            return (Criteria) this;
        }

        public Criteria andContfaxEnEqualTo(String value) {
            addCriterion("ContFax_En =", value, "contfaxEn");
            return (Criteria) this;
        }

        public Criteria andContfaxEnNotEqualTo(String value) {
            addCriterion("ContFax_En <>", value, "contfaxEn");
            return (Criteria) this;
        }

        public Criteria andContfaxEnGreaterThan(String value) {
            addCriterion("ContFax_En >", value, "contfaxEn");
            return (Criteria) this;
        }

        public Criteria andContfaxEnGreaterThanOrEqualTo(String value) {
            addCriterion("ContFax_En >=", value, "contfaxEn");
            return (Criteria) this;
        }

        public Criteria andContfaxEnLessThan(String value) {
            addCriterion("ContFax_En <", value, "contfaxEn");
            return (Criteria) this;
        }

        public Criteria andContfaxEnLessThanOrEqualTo(String value) {
            addCriterion("ContFax_En <=", value, "contfaxEn");
            return (Criteria) this;
        }

        public Criteria andContfaxEnLike(String value) {
            addCriterion("ContFax_En like", value, "contfaxEn");
            return (Criteria) this;
        }

        public Criteria andContfaxEnNotLike(String value) {
            addCriterion("ContFax_En not like", value, "contfaxEn");
            return (Criteria) this;
        }

        public Criteria andContfaxEnIn(List<String> values) {
            addCriterion("ContFax_En in", values, "contfaxEn");
            return (Criteria) this;
        }

        public Criteria andContfaxEnNotIn(List<String> values) {
            addCriterion("ContFax_En not in", values, "contfaxEn");
            return (Criteria) this;
        }

        public Criteria andContfaxEnBetween(String value1, String value2) {
            addCriterion("ContFax_En between", value1, value2, "contfaxEn");
            return (Criteria) this;
        }

        public Criteria andContfaxEnNotBetween(String value1, String value2) {
            addCriterion("ContFax_En not between", value1, value2, "contfaxEn");
            return (Criteria) this;
        }

        public Criteria andContmobileEnIsNull() {
            addCriterion("ContMobile_En is null");
            return (Criteria) this;
        }

        public Criteria andContmobileEnIsNotNull() {
            addCriterion("ContMobile_En is not null");
            return (Criteria) this;
        }

        public Criteria andContmobileEnEqualTo(String value) {
            addCriterion("ContMobile_En =", value, "contmobileEn");
            return (Criteria) this;
        }

        public Criteria andContmobileEnNotEqualTo(String value) {
            addCriterion("ContMobile_En <>", value, "contmobileEn");
            return (Criteria) this;
        }

        public Criteria andContmobileEnGreaterThan(String value) {
            addCriterion("ContMobile_En >", value, "contmobileEn");
            return (Criteria) this;
        }

        public Criteria andContmobileEnGreaterThanOrEqualTo(String value) {
            addCriterion("ContMobile_En >=", value, "contmobileEn");
            return (Criteria) this;
        }

        public Criteria andContmobileEnLessThan(String value) {
            addCriterion("ContMobile_En <", value, "contmobileEn");
            return (Criteria) this;
        }

        public Criteria andContmobileEnLessThanOrEqualTo(String value) {
            addCriterion("ContMobile_En <=", value, "contmobileEn");
            return (Criteria) this;
        }

        public Criteria andContmobileEnLike(String value) {
            addCriterion("ContMobile_En like", value, "contmobileEn");
            return (Criteria) this;
        }

        public Criteria andContmobileEnNotLike(String value) {
            addCriterion("ContMobile_En not like", value, "contmobileEn");
            return (Criteria) this;
        }

        public Criteria andContmobileEnIn(List<String> values) {
            addCriterion("ContMobile_En in", values, "contmobileEn");
            return (Criteria) this;
        }

        public Criteria andContmobileEnNotIn(List<String> values) {
            addCriterion("ContMobile_En not in", values, "contmobileEn");
            return (Criteria) this;
        }

        public Criteria andContmobileEnBetween(String value1, String value2) {
            addCriterion("ContMobile_En between", value1, value2, "contmobileEn");
            return (Criteria) this;
        }

        public Criteria andContmobileEnNotBetween(String value1, String value2) {
            addCriterion("ContMobile_En not between", value1, value2, "contmobileEn");
            return (Criteria) this;
        }

        public Criteria andContemailEnIsNull() {
            addCriterion("ContEmail_En is null");
            return (Criteria) this;
        }

        public Criteria andContemailEnIsNotNull() {
            addCriterion("ContEmail_En is not null");
            return (Criteria) this;
        }

        public Criteria andContemailEnEqualTo(String value) {
            addCriterion("ContEmail_En =", value, "contemailEn");
            return (Criteria) this;
        }

        public Criteria andContemailEnNotEqualTo(String value) {
            addCriterion("ContEmail_En <>", value, "contemailEn");
            return (Criteria) this;
        }

        public Criteria andContemailEnGreaterThan(String value) {
            addCriterion("ContEmail_En >", value, "contemailEn");
            return (Criteria) this;
        }

        public Criteria andContemailEnGreaterThanOrEqualTo(String value) {
            addCriterion("ContEmail_En >=", value, "contemailEn");
            return (Criteria) this;
        }

        public Criteria andContemailEnLessThan(String value) {
            addCriterion("ContEmail_En <", value, "contemailEn");
            return (Criteria) this;
        }

        public Criteria andContemailEnLessThanOrEqualTo(String value) {
            addCriterion("ContEmail_En <=", value, "contemailEn");
            return (Criteria) this;
        }

        public Criteria andContemailEnLike(String value) {
            addCriterion("ContEmail_En like", value, "contemailEn");
            return (Criteria) this;
        }

        public Criteria andContemailEnNotLike(String value) {
            addCriterion("ContEmail_En not like", value, "contemailEn");
            return (Criteria) this;
        }

        public Criteria andContemailEnIn(List<String> values) {
            addCriterion("ContEmail_En in", values, "contemailEn");
            return (Criteria) this;
        }

        public Criteria andContemailEnNotIn(List<String> values) {
            addCriterion("ContEmail_En not in", values, "contemailEn");
            return (Criteria) this;
        }

        public Criteria andContemailEnBetween(String value1, String value2) {
            addCriterion("ContEmail_En between", value1, value2, "contemailEn");
            return (Criteria) this;
        }

        public Criteria andContemailEnNotBetween(String value1, String value2) {
            addCriterion("ContEmail_En not between", value1, value2, "contemailEn");
            return (Criteria) this;
        }

        public Criteria andContmsnEnIsNull() {
            addCriterion("ContMsn_En is null");
            return (Criteria) this;
        }

        public Criteria andContmsnEnIsNotNull() {
            addCriterion("ContMsn_En is not null");
            return (Criteria) this;
        }

        public Criteria andContmsnEnEqualTo(String value) {
            addCriterion("ContMsn_En =", value, "contmsnEn");
            return (Criteria) this;
        }

        public Criteria andContmsnEnNotEqualTo(String value) {
            addCriterion("ContMsn_En <>", value, "contmsnEn");
            return (Criteria) this;
        }

        public Criteria andContmsnEnGreaterThan(String value) {
            addCriterion("ContMsn_En >", value, "contmsnEn");
            return (Criteria) this;
        }

        public Criteria andContmsnEnGreaterThanOrEqualTo(String value) {
            addCriterion("ContMsn_En >=", value, "contmsnEn");
            return (Criteria) this;
        }

        public Criteria andContmsnEnLessThan(String value) {
            addCriterion("ContMsn_En <", value, "contmsnEn");
            return (Criteria) this;
        }

        public Criteria andContmsnEnLessThanOrEqualTo(String value) {
            addCriterion("ContMsn_En <=", value, "contmsnEn");
            return (Criteria) this;
        }

        public Criteria andContmsnEnLike(String value) {
            addCriterion("ContMsn_En like", value, "contmsnEn");
            return (Criteria) this;
        }

        public Criteria andContmsnEnNotLike(String value) {
            addCriterion("ContMsn_En not like", value, "contmsnEn");
            return (Criteria) this;
        }

        public Criteria andContmsnEnIn(List<String> values) {
            addCriterion("ContMsn_En in", values, "contmsnEn");
            return (Criteria) this;
        }

        public Criteria andContmsnEnNotIn(List<String> values) {
            addCriterion("ContMsn_En not in", values, "contmsnEn");
            return (Criteria) this;
        }

        public Criteria andContmsnEnBetween(String value1, String value2) {
            addCriterion("ContMsn_En between", value1, value2, "contmsnEn");
            return (Criteria) this;
        }

        public Criteria andContmsnEnNotBetween(String value1, String value2) {
            addCriterion("ContMsn_En not between", value1, value2, "contmsnEn");
            return (Criteria) this;
        }

        public Criteria andIsokEnIsNull() {
            addCriterion("IsOK_En is null");
            return (Criteria) this;
        }

        public Criteria andIsokEnIsNotNull() {
            addCriterion("IsOK_En is not null");
            return (Criteria) this;
        }

        public Criteria andIsokEnEqualTo(Integer value) {
            addCriterion("IsOK_En =", value, "isokEn");
            return (Criteria) this;
        }

        public Criteria andIsokEnNotEqualTo(Integer value) {
            addCriterion("IsOK_En <>", value, "isokEn");
            return (Criteria) this;
        }

        public Criteria andIsokEnGreaterThan(Integer value) {
            addCriterion("IsOK_En >", value, "isokEn");
            return (Criteria) this;
        }

        public Criteria andIsokEnGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsOK_En >=", value, "isokEn");
            return (Criteria) this;
        }

        public Criteria andIsokEnLessThan(Integer value) {
            addCriterion("IsOK_En <", value, "isokEn");
            return (Criteria) this;
        }

        public Criteria andIsokEnLessThanOrEqualTo(Integer value) {
            addCriterion("IsOK_En <=", value, "isokEn");
            return (Criteria) this;
        }

        public Criteria andIsokEnIn(List<Integer> values) {
            addCriterion("IsOK_En in", values, "isokEn");
            return (Criteria) this;
        }

        public Criteria andIsokEnNotIn(List<Integer> values) {
            addCriterion("IsOK_En not in", values, "isokEn");
            return (Criteria) this;
        }

        public Criteria andIsokEnBetween(Integer value1, Integer value2) {
            addCriterion("IsOK_En between", value1, value2, "isokEn");
            return (Criteria) this;
        }

        public Criteria andIsokEnNotBetween(Integer value1, Integer value2) {
            addCriterion("IsOK_En not between", value1, value2, "isokEn");
            return (Criteria) this;
        }

        public Criteria andIsbeifangIsNull() {
            addCriterion("IsBeiFang is null");
            return (Criteria) this;
        }

        public Criteria andIsbeifangIsNotNull() {
            addCriterion("IsBeiFang is not null");
            return (Criteria) this;
        }

        public Criteria andIsbeifangEqualTo(Integer value) {
            addCriterion("IsBeiFang =", value, "isbeifang");
            return (Criteria) this;
        }

        public Criteria andIsbeifangNotEqualTo(Integer value) {
            addCriterion("IsBeiFang <>", value, "isbeifang");
            return (Criteria) this;
        }

        public Criteria andIsbeifangGreaterThan(Integer value) {
            addCriterion("IsBeiFang >", value, "isbeifang");
            return (Criteria) this;
        }

        public Criteria andIsbeifangGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsBeiFang >=", value, "isbeifang");
            return (Criteria) this;
        }

        public Criteria andIsbeifangLessThan(Integer value) {
            addCriterion("IsBeiFang <", value, "isbeifang");
            return (Criteria) this;
        }

        public Criteria andIsbeifangLessThanOrEqualTo(Integer value) {
            addCriterion("IsBeiFang <=", value, "isbeifang");
            return (Criteria) this;
        }

        public Criteria andIsbeifangIn(List<Integer> values) {
            addCriterion("IsBeiFang in", values, "isbeifang");
            return (Criteria) this;
        }

        public Criteria andIsbeifangNotIn(List<Integer> values) {
            addCriterion("IsBeiFang not in", values, "isbeifang");
            return (Criteria) this;
        }

        public Criteria andIsbeifangBetween(Integer value1, Integer value2) {
            addCriterion("IsBeiFang between", value1, value2, "isbeifang");
            return (Criteria) this;
        }

        public Criteria andIsbeifangNotBetween(Integer value1, Integer value2) {
            addCriterion("IsBeiFang not between", value1, value2, "isbeifang");
            return (Criteria) this;
        }

        public Criteria andIsjpg01IsNull() {
            addCriterion("IsJPG01 is null");
            return (Criteria) this;
        }

        public Criteria andIsjpg01IsNotNull() {
            addCriterion("IsJPG01 is not null");
            return (Criteria) this;
        }

        public Criteria andIsjpg01EqualTo(Integer value) {
            addCriterion("IsJPG01 =", value, "isjpg01");
            return (Criteria) this;
        }

        public Criteria andIsjpg01NotEqualTo(Integer value) {
            addCriterion("IsJPG01 <>", value, "isjpg01");
            return (Criteria) this;
        }

        public Criteria andIsjpg01GreaterThan(Integer value) {
            addCriterion("IsJPG01 >", value, "isjpg01");
            return (Criteria) this;
        }

        public Criteria andIsjpg01GreaterThanOrEqualTo(Integer value) {
            addCriterion("IsJPG01 >=", value, "isjpg01");
            return (Criteria) this;
        }

        public Criteria andIsjpg01LessThan(Integer value) {
            addCriterion("IsJPG01 <", value, "isjpg01");
            return (Criteria) this;
        }

        public Criteria andIsjpg01LessThanOrEqualTo(Integer value) {
            addCriterion("IsJPG01 <=", value, "isjpg01");
            return (Criteria) this;
        }

        public Criteria andIsjpg01In(List<Integer> values) {
            addCriterion("IsJPG01 in", values, "isjpg01");
            return (Criteria) this;
        }

        public Criteria andIsjpg01NotIn(List<Integer> values) {
            addCriterion("IsJPG01 not in", values, "isjpg01");
            return (Criteria) this;
        }

        public Criteria andIsjpg01Between(Integer value1, Integer value2) {
            addCriterion("IsJPG01 between", value1, value2, "isjpg01");
            return (Criteria) this;
        }

        public Criteria andIsjpg01NotBetween(Integer value1, Integer value2) {
            addCriterion("IsJPG01 not between", value1, value2, "isjpg01");
            return (Criteria) this;
        }

        public Criteria andMoneypointIsNull() {
            addCriterion("MoneyPoint is null");
            return (Criteria) this;
        }

        public Criteria andMoneypointIsNotNull() {
            addCriterion("MoneyPoint is not null");
            return (Criteria) this;
        }

        public Criteria andMoneypointEqualTo(Integer value) {
            addCriterion("MoneyPoint =", value, "moneypoint");
            return (Criteria) this;
        }

        public Criteria andMoneypointNotEqualTo(Integer value) {
            addCriterion("MoneyPoint <>", value, "moneypoint");
            return (Criteria) this;
        }

        public Criteria andMoneypointGreaterThan(Integer value) {
            addCriterion("MoneyPoint >", value, "moneypoint");
            return (Criteria) this;
        }

        public Criteria andMoneypointGreaterThanOrEqualTo(Integer value) {
            addCriterion("MoneyPoint >=", value, "moneypoint");
            return (Criteria) this;
        }

        public Criteria andMoneypointLessThan(Integer value) {
            addCriterion("MoneyPoint <", value, "moneypoint");
            return (Criteria) this;
        }

        public Criteria andMoneypointLessThanOrEqualTo(Integer value) {
            addCriterion("MoneyPoint <=", value, "moneypoint");
            return (Criteria) this;
        }

        public Criteria andMoneypointIn(List<Integer> values) {
            addCriterion("MoneyPoint in", values, "moneypoint");
            return (Criteria) this;
        }

        public Criteria andMoneypointNotIn(List<Integer> values) {
            addCriterion("MoneyPoint not in", values, "moneypoint");
            return (Criteria) this;
        }

        public Criteria andMoneypointBetween(Integer value1, Integer value2) {
            addCriterion("MoneyPoint between", value1, value2, "moneypoint");
            return (Criteria) this;
        }

        public Criteria andMoneypointNotBetween(Integer value1, Integer value2) {
            addCriterion("MoneyPoint not between", value1, value2, "moneypoint");
            return (Criteria) this;
        }

        public Criteria andSxwhtnameIsNull() {
            addCriterion("SxwHtName is null");
            return (Criteria) this;
        }

        public Criteria andSxwhtnameIsNotNull() {
            addCriterion("SxwHtName is not null");
            return (Criteria) this;
        }

        public Criteria andSxwhtnameEqualTo(String value) {
            addCriterion("SxwHtName =", value, "sxwhtname");
            return (Criteria) this;
        }

        public Criteria andSxwhtnameNotEqualTo(String value) {
            addCriterion("SxwHtName <>", value, "sxwhtname");
            return (Criteria) this;
        }

        public Criteria andSxwhtnameGreaterThan(String value) {
            addCriterion("SxwHtName >", value, "sxwhtname");
            return (Criteria) this;
        }

        public Criteria andSxwhtnameGreaterThanOrEqualTo(String value) {
            addCriterion("SxwHtName >=", value, "sxwhtname");
            return (Criteria) this;
        }

        public Criteria andSxwhtnameLessThan(String value) {
            addCriterion("SxwHtName <", value, "sxwhtname");
            return (Criteria) this;
        }

        public Criteria andSxwhtnameLessThanOrEqualTo(String value) {
            addCriterion("SxwHtName <=", value, "sxwhtname");
            return (Criteria) this;
        }

        public Criteria andSxwhtnameLike(String value) {
            addCriterion("SxwHtName like", value, "sxwhtname");
            return (Criteria) this;
        }

        public Criteria andSxwhtnameNotLike(String value) {
            addCriterion("SxwHtName not like", value, "sxwhtname");
            return (Criteria) this;
        }

        public Criteria andSxwhtnameIn(List<String> values) {
            addCriterion("SxwHtName in", values, "sxwhtname");
            return (Criteria) this;
        }

        public Criteria andSxwhtnameNotIn(List<String> values) {
            addCriterion("SxwHtName not in", values, "sxwhtname");
            return (Criteria) this;
        }

        public Criteria andSxwhtnameBetween(String value1, String value2) {
            addCriterion("SxwHtName between", value1, value2, "sxwhtname");
            return (Criteria) this;
        }

        public Criteria andSxwhtnameNotBetween(String value1, String value2) {
            addCriterion("SxwHtName not between", value1, value2, "sxwhtname");
            return (Criteria) this;
        }

        public Criteria andCorpliceIsNull() {
            addCriterion("CorpLice is null");
            return (Criteria) this;
        }

        public Criteria andCorpliceIsNotNull() {
            addCriterion("CorpLice is not null");
            return (Criteria) this;
        }

        public Criteria andCorpliceEqualTo(String value) {
            addCriterion("CorpLice =", value, "corplice");
            return (Criteria) this;
        }

        public Criteria andCorpliceNotEqualTo(String value) {
            addCriterion("CorpLice <>", value, "corplice");
            return (Criteria) this;
        }

        public Criteria andCorpliceGreaterThan(String value) {
            addCriterion("CorpLice >", value, "corplice");
            return (Criteria) this;
        }

        public Criteria andCorpliceGreaterThanOrEqualTo(String value) {
            addCriterion("CorpLice >=", value, "corplice");
            return (Criteria) this;
        }

        public Criteria andCorpliceLessThan(String value) {
            addCriterion("CorpLice <", value, "corplice");
            return (Criteria) this;
        }

        public Criteria andCorpliceLessThanOrEqualTo(String value) {
            addCriterion("CorpLice <=", value, "corplice");
            return (Criteria) this;
        }

        public Criteria andCorpliceLike(String value) {
            addCriterion("CorpLice like", value, "corplice");
            return (Criteria) this;
        }

        public Criteria andCorpliceNotLike(String value) {
            addCriterion("CorpLice not like", value, "corplice");
            return (Criteria) this;
        }

        public Criteria andCorpliceIn(List<String> values) {
            addCriterion("CorpLice in", values, "corplice");
            return (Criteria) this;
        }

        public Criteria andCorpliceNotIn(List<String> values) {
            addCriterion("CorpLice not in", values, "corplice");
            return (Criteria) this;
        }

        public Criteria andCorpliceBetween(String value1, String value2) {
            addCriterion("CorpLice between", value1, value2, "corplice");
            return (Criteria) this;
        }

        public Criteria andCorpliceNotBetween(String value1, String value2) {
            addCriterion("CorpLice not between", value1, value2, "corplice");
            return (Criteria) this;
        }

        public Criteria andIsautocorpliceIsNull() {
            addCriterion("IsAutoCorpLice is null");
            return (Criteria) this;
        }

        public Criteria andIsautocorpliceIsNotNull() {
            addCriterion("IsAutoCorpLice is not null");
            return (Criteria) this;
        }

        public Criteria andIsautocorpliceEqualTo(Integer value) {
            addCriterion("IsAutoCorpLice =", value, "isautocorplice");
            return (Criteria) this;
        }

        public Criteria andIsautocorpliceNotEqualTo(Integer value) {
            addCriterion("IsAutoCorpLice <>", value, "isautocorplice");
            return (Criteria) this;
        }

        public Criteria andIsautocorpliceGreaterThan(Integer value) {
            addCriterion("IsAutoCorpLice >", value, "isautocorplice");
            return (Criteria) this;
        }

        public Criteria andIsautocorpliceGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsAutoCorpLice >=", value, "isautocorplice");
            return (Criteria) this;
        }

        public Criteria andIsautocorpliceLessThan(Integer value) {
            addCriterion("IsAutoCorpLice <", value, "isautocorplice");
            return (Criteria) this;
        }

        public Criteria andIsautocorpliceLessThanOrEqualTo(Integer value) {
            addCriterion("IsAutoCorpLice <=", value, "isautocorplice");
            return (Criteria) this;
        }

        public Criteria andIsautocorpliceIn(List<Integer> values) {
            addCriterion("IsAutoCorpLice in", values, "isautocorplice");
            return (Criteria) this;
        }

        public Criteria andIsautocorpliceNotIn(List<Integer> values) {
            addCriterion("IsAutoCorpLice not in", values, "isautocorplice");
            return (Criteria) this;
        }

        public Criteria andIsautocorpliceBetween(Integer value1, Integer value2) {
            addCriterion("IsAutoCorpLice between", value1, value2, "isautocorplice");
            return (Criteria) this;
        }

        public Criteria andIsautocorpliceNotBetween(Integer value1, Integer value2) {
            addCriterion("IsAutoCorpLice not between", value1, value2, "isautocorplice");
            return (Criteria) this;
        }

        public Criteria andCorplicedateIsNull() {
            addCriterion("CorpLiceDate is null");
            return (Criteria) this;
        }

        public Criteria andCorplicedateIsNotNull() {
            addCriterion("CorpLiceDate is not null");
            return (Criteria) this;
        }

        public Criteria andCorplicedateEqualTo(Date value) {
            addCriterion("CorpLiceDate =", value, "corplicedate");
            return (Criteria) this;
        }

        public Criteria andCorplicedateNotEqualTo(Date value) {
            addCriterion("CorpLiceDate <>", value, "corplicedate");
            return (Criteria) this;
        }

        public Criteria andCorplicedateGreaterThan(Date value) {
            addCriterion("CorpLiceDate >", value, "corplicedate");
            return (Criteria) this;
        }

        public Criteria andCorplicedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CorpLiceDate >=", value, "corplicedate");
            return (Criteria) this;
        }

        public Criteria andCorplicedateLessThan(Date value) {
            addCriterion("CorpLiceDate <", value, "corplicedate");
            return (Criteria) this;
        }

        public Criteria andCorplicedateLessThanOrEqualTo(Date value) {
            addCriterion("CorpLiceDate <=", value, "corplicedate");
            return (Criteria) this;
        }

        public Criteria andCorplicedateIn(List<Date> values) {
            addCriterion("CorpLiceDate in", values, "corplicedate");
            return (Criteria) this;
        }

        public Criteria andCorplicedateNotIn(List<Date> values) {
            addCriterion("CorpLiceDate not in", values, "corplicedate");
            return (Criteria) this;
        }

        public Criteria andCorplicedateBetween(Date value1, Date value2) {
            addCriterion("CorpLiceDate between", value1, value2, "corplicedate");
            return (Criteria) this;
        }

        public Criteria andCorplicedateNotBetween(Date value1, Date value2) {
            addCriterion("CorpLiceDate not between", value1, value2, "corplicedate");
            return (Criteria) this;
        }

        public Criteria andCorpregdateIsNull() {
            addCriterion("CorpRegDate is null");
            return (Criteria) this;
        }

        public Criteria andCorpregdateIsNotNull() {
            addCriterion("CorpRegDate is not null");
            return (Criteria) this;
        }

        public Criteria andCorpregdateEqualTo(String value) {
            addCriterion("CorpRegDate =", value, "corpregdate");
            return (Criteria) this;
        }

        public Criteria andCorpregdateNotEqualTo(String value) {
            addCriterion("CorpRegDate <>", value, "corpregdate");
            return (Criteria) this;
        }

        public Criteria andCorpregdateGreaterThan(String value) {
            addCriterion("CorpRegDate >", value, "corpregdate");
            return (Criteria) this;
        }

        public Criteria andCorpregdateGreaterThanOrEqualTo(String value) {
            addCriterion("CorpRegDate >=", value, "corpregdate");
            return (Criteria) this;
        }

        public Criteria andCorpregdateLessThan(String value) {
            addCriterion("CorpRegDate <", value, "corpregdate");
            return (Criteria) this;
        }

        public Criteria andCorpregdateLessThanOrEqualTo(String value) {
            addCriterion("CorpRegDate <=", value, "corpregdate");
            return (Criteria) this;
        }

        public Criteria andCorpregdateLike(String value) {
            addCriterion("CorpRegDate like", value, "corpregdate");
            return (Criteria) this;
        }

        public Criteria andCorpregdateNotLike(String value) {
            addCriterion("CorpRegDate not like", value, "corpregdate");
            return (Criteria) this;
        }

        public Criteria andCorpregdateIn(List<String> values) {
            addCriterion("CorpRegDate in", values, "corpregdate");
            return (Criteria) this;
        }

        public Criteria andCorpregdateNotIn(List<String> values) {
            addCriterion("CorpRegDate not in", values, "corpregdate");
            return (Criteria) this;
        }

        public Criteria andCorpregdateBetween(String value1, String value2) {
            addCriterion("CorpRegDate between", value1, value2, "corpregdate");
            return (Criteria) this;
        }

        public Criteria andCorpregdateNotBetween(String value1, String value2) {
            addCriterion("CorpRegDate not between", value1, value2, "corpregdate");
            return (Criteria) this;
        }

        public Criteria andCorpregmoneyIsNull() {
            addCriterion("CorpRegMoney is null");
            return (Criteria) this;
        }

        public Criteria andCorpregmoneyIsNotNull() {
            addCriterion("CorpRegMoney is not null");
            return (Criteria) this;
        }

        public Criteria andCorpregmoneyEqualTo(String value) {
            addCriterion("CorpRegMoney =", value, "corpregmoney");
            return (Criteria) this;
        }

        public Criteria andCorpregmoneyNotEqualTo(String value) {
            addCriterion("CorpRegMoney <>", value, "corpregmoney");
            return (Criteria) this;
        }

        public Criteria andCorpregmoneyGreaterThan(String value) {
            addCriterion("CorpRegMoney >", value, "corpregmoney");
            return (Criteria) this;
        }

        public Criteria andCorpregmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("CorpRegMoney >=", value, "corpregmoney");
            return (Criteria) this;
        }

        public Criteria andCorpregmoneyLessThan(String value) {
            addCriterion("CorpRegMoney <", value, "corpregmoney");
            return (Criteria) this;
        }

        public Criteria andCorpregmoneyLessThanOrEqualTo(String value) {
            addCriterion("CorpRegMoney <=", value, "corpregmoney");
            return (Criteria) this;
        }

        public Criteria andCorpregmoneyLike(String value) {
            addCriterion("CorpRegMoney like", value, "corpregmoney");
            return (Criteria) this;
        }

        public Criteria andCorpregmoneyNotLike(String value) {
            addCriterion("CorpRegMoney not like", value, "corpregmoney");
            return (Criteria) this;
        }

        public Criteria andCorpregmoneyIn(List<String> values) {
            addCriterion("CorpRegMoney in", values, "corpregmoney");
            return (Criteria) this;
        }

        public Criteria andCorpregmoneyNotIn(List<String> values) {
            addCriterion("CorpRegMoney not in", values, "corpregmoney");
            return (Criteria) this;
        }

        public Criteria andCorpregmoneyBetween(String value1, String value2) {
            addCriterion("CorpRegMoney between", value1, value2, "corpregmoney");
            return (Criteria) this;
        }

        public Criteria andCorpregmoneyNotBetween(String value1, String value2) {
            addCriterion("CorpRegMoney not between", value1, value2, "corpregmoney");
            return (Criteria) this;
        }

        public Criteria andCorpbanknoIsNull() {
            addCriterion("CorpBankNo is null");
            return (Criteria) this;
        }

        public Criteria andCorpbanknoIsNotNull() {
            addCriterion("CorpBankNo is not null");
            return (Criteria) this;
        }

        public Criteria andCorpbanknoEqualTo(String value) {
            addCriterion("CorpBankNo =", value, "corpbankno");
            return (Criteria) this;
        }

        public Criteria andCorpbanknoNotEqualTo(String value) {
            addCriterion("CorpBankNo <>", value, "corpbankno");
            return (Criteria) this;
        }

        public Criteria andCorpbanknoGreaterThan(String value) {
            addCriterion("CorpBankNo >", value, "corpbankno");
            return (Criteria) this;
        }

        public Criteria andCorpbanknoGreaterThanOrEqualTo(String value) {
            addCriterion("CorpBankNo >=", value, "corpbankno");
            return (Criteria) this;
        }

        public Criteria andCorpbanknoLessThan(String value) {
            addCriterion("CorpBankNo <", value, "corpbankno");
            return (Criteria) this;
        }

        public Criteria andCorpbanknoLessThanOrEqualTo(String value) {
            addCriterion("CorpBankNo <=", value, "corpbankno");
            return (Criteria) this;
        }

        public Criteria andCorpbanknoLike(String value) {
            addCriterion("CorpBankNo like", value, "corpbankno");
            return (Criteria) this;
        }

        public Criteria andCorpbanknoNotLike(String value) {
            addCriterion("CorpBankNo not like", value, "corpbankno");
            return (Criteria) this;
        }

        public Criteria andCorpbanknoIn(List<String> values) {
            addCriterion("CorpBankNo in", values, "corpbankno");
            return (Criteria) this;
        }

        public Criteria andCorpbanknoNotIn(List<String> values) {
            addCriterion("CorpBankNo not in", values, "corpbankno");
            return (Criteria) this;
        }

        public Criteria andCorpbanknoBetween(String value1, String value2) {
            addCriterion("CorpBankNo between", value1, value2, "corpbankno");
            return (Criteria) this;
        }

        public Criteria andCorpbanknoNotBetween(String value1, String value2) {
            addCriterion("CorpBankNo not between", value1, value2, "corpbankno");
            return (Criteria) this;
        }

        public Criteria andCorpbankpicIsNull() {
            addCriterion("CorpBankPic is null");
            return (Criteria) this;
        }

        public Criteria andCorpbankpicIsNotNull() {
            addCriterion("CorpBankPic is not null");
            return (Criteria) this;
        }

        public Criteria andCorpbankpicEqualTo(String value) {
            addCriterion("CorpBankPic =", value, "corpbankpic");
            return (Criteria) this;
        }

        public Criteria andCorpbankpicNotEqualTo(String value) {
            addCriterion("CorpBankPic <>", value, "corpbankpic");
            return (Criteria) this;
        }

        public Criteria andCorpbankpicGreaterThan(String value) {
            addCriterion("CorpBankPic >", value, "corpbankpic");
            return (Criteria) this;
        }

        public Criteria andCorpbankpicGreaterThanOrEqualTo(String value) {
            addCriterion("CorpBankPic >=", value, "corpbankpic");
            return (Criteria) this;
        }

        public Criteria andCorpbankpicLessThan(String value) {
            addCriterion("CorpBankPic <", value, "corpbankpic");
            return (Criteria) this;
        }

        public Criteria andCorpbankpicLessThanOrEqualTo(String value) {
            addCriterion("CorpBankPic <=", value, "corpbankpic");
            return (Criteria) this;
        }

        public Criteria andCorpbankpicLike(String value) {
            addCriterion("CorpBankPic like", value, "corpbankpic");
            return (Criteria) this;
        }

        public Criteria andCorpbankpicNotLike(String value) {
            addCriterion("CorpBankPic not like", value, "corpbankpic");
            return (Criteria) this;
        }

        public Criteria andCorpbankpicIn(List<String> values) {
            addCriterion("CorpBankPic in", values, "corpbankpic");
            return (Criteria) this;
        }

        public Criteria andCorpbankpicNotIn(List<String> values) {
            addCriterion("CorpBankPic not in", values, "corpbankpic");
            return (Criteria) this;
        }

        public Criteria andCorpbankpicBetween(String value1, String value2) {
            addCriterion("CorpBankPic between", value1, value2, "corpbankpic");
            return (Criteria) this;
        }

        public Criteria andCorpbankpicNotBetween(String value1, String value2) {
            addCriterion("CorpBankPic not between", value1, value2, "corpbankpic");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonameIsNull() {
            addCriterion("CorpBiaoName is null");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonameIsNotNull() {
            addCriterion("CorpBiaoName is not null");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonameEqualTo(String value) {
            addCriterion("CorpBiaoName =", value, "corpbiaoname");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonameNotEqualTo(String value) {
            addCriterion("CorpBiaoName <>", value, "corpbiaoname");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonameGreaterThan(String value) {
            addCriterion("CorpBiaoName >", value, "corpbiaoname");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonameGreaterThanOrEqualTo(String value) {
            addCriterion("CorpBiaoName >=", value, "corpbiaoname");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonameLessThan(String value) {
            addCriterion("CorpBiaoName <", value, "corpbiaoname");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonameLessThanOrEqualTo(String value) {
            addCriterion("CorpBiaoName <=", value, "corpbiaoname");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonameLike(String value) {
            addCriterion("CorpBiaoName like", value, "corpbiaoname");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonameNotLike(String value) {
            addCriterion("CorpBiaoName not like", value, "corpbiaoname");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonameIn(List<String> values) {
            addCriterion("CorpBiaoName in", values, "corpbiaoname");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonameNotIn(List<String> values) {
            addCriterion("CorpBiaoName not in", values, "corpbiaoname");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonameBetween(String value1, String value2) {
            addCriterion("CorpBiaoName between", value1, value2, "corpbiaoname");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonameNotBetween(String value1, String value2) {
            addCriterion("CorpBiaoName not between", value1, value2, "corpbiaoname");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonamemobileIsNull() {
            addCriterion("CorpBiaoNameMobile is null");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonamemobileIsNotNull() {
            addCriterion("CorpBiaoNameMobile is not null");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonamemobileEqualTo(String value) {
            addCriterion("CorpBiaoNameMobile =", value, "corpbiaonamemobile");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonamemobileNotEqualTo(String value) {
            addCriterion("CorpBiaoNameMobile <>", value, "corpbiaonamemobile");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonamemobileGreaterThan(String value) {
            addCriterion("CorpBiaoNameMobile >", value, "corpbiaonamemobile");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonamemobileGreaterThanOrEqualTo(String value) {
            addCriterion("CorpBiaoNameMobile >=", value, "corpbiaonamemobile");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonamemobileLessThan(String value) {
            addCriterion("CorpBiaoNameMobile <", value, "corpbiaonamemobile");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonamemobileLessThanOrEqualTo(String value) {
            addCriterion("CorpBiaoNameMobile <=", value, "corpbiaonamemobile");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonamemobileLike(String value) {
            addCriterion("CorpBiaoNameMobile like", value, "corpbiaonamemobile");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonamemobileNotLike(String value) {
            addCriterion("CorpBiaoNameMobile not like", value, "corpbiaonamemobile");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonamemobileIn(List<String> values) {
            addCriterion("CorpBiaoNameMobile in", values, "corpbiaonamemobile");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonamemobileNotIn(List<String> values) {
            addCriterion("CorpBiaoNameMobile not in", values, "corpbiaonamemobile");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonamemobileBetween(String value1, String value2) {
            addCriterion("CorpBiaoNameMobile between", value1, value2, "corpbiaonamemobile");
            return (Criteria) this;
        }

        public Criteria andCorpbiaonamemobileNotBetween(String value1, String value2) {
            addCriterion("CorpBiaoNameMobile not between", value1, value2, "corpbiaonamemobile");
            return (Criteria) this;
        }

        public Criteria andCorpmacSmjIsNull() {
            addCriterion("CorpMac_Smj is null");
            return (Criteria) this;
        }

        public Criteria andCorpmacSmjIsNotNull() {
            addCriterion("CorpMac_Smj is not null");
            return (Criteria) this;
        }

        public Criteria andCorpmacSmjEqualTo(String value) {
            addCriterion("CorpMac_Smj =", value, "corpmacSmj");
            return (Criteria) this;
        }

        public Criteria andCorpmacSmjNotEqualTo(String value) {
            addCriterion("CorpMac_Smj <>", value, "corpmacSmj");
            return (Criteria) this;
        }

        public Criteria andCorpmacSmjGreaterThan(String value) {
            addCriterion("CorpMac_Smj >", value, "corpmacSmj");
            return (Criteria) this;
        }

        public Criteria andCorpmacSmjGreaterThanOrEqualTo(String value) {
            addCriterion("CorpMac_Smj >=", value, "corpmacSmj");
            return (Criteria) this;
        }

        public Criteria andCorpmacSmjLessThan(String value) {
            addCriterion("CorpMac_Smj <", value, "corpmacSmj");
            return (Criteria) this;
        }

        public Criteria andCorpmacSmjLessThanOrEqualTo(String value) {
            addCriterion("CorpMac_Smj <=", value, "corpmacSmj");
            return (Criteria) this;
        }

        public Criteria andCorpmacSmjLike(String value) {
            addCriterion("CorpMac_Smj like", value, "corpmacSmj");
            return (Criteria) this;
        }

        public Criteria andCorpmacSmjNotLike(String value) {
            addCriterion("CorpMac_Smj not like", value, "corpmacSmj");
            return (Criteria) this;
        }

        public Criteria andCorpmacSmjIn(List<String> values) {
            addCriterion("CorpMac_Smj in", values, "corpmacSmj");
            return (Criteria) this;
        }

        public Criteria andCorpmacSmjNotIn(List<String> values) {
            addCriterion("CorpMac_Smj not in", values, "corpmacSmj");
            return (Criteria) this;
        }

        public Criteria andCorpmacSmjBetween(String value1, String value2) {
            addCriterion("CorpMac_Smj between", value1, value2, "corpmacSmj");
            return (Criteria) this;
        }

        public Criteria andCorpmacSmjNotBetween(String value1, String value2) {
            addCriterion("CorpMac_Smj not between", value1, value2, "corpmacSmj");
            return (Criteria) this;
        }

        public Criteria andCorpmacBtjIsNull() {
            addCriterion("CorpMac_Btj is null");
            return (Criteria) this;
        }

        public Criteria andCorpmacBtjIsNotNull() {
            addCriterion("CorpMac_Btj is not null");
            return (Criteria) this;
        }

        public Criteria andCorpmacBtjEqualTo(String value) {
            addCriterion("CorpMac_Btj =", value, "corpmacBtj");
            return (Criteria) this;
        }

        public Criteria andCorpmacBtjNotEqualTo(String value) {
            addCriterion("CorpMac_Btj <>", value, "corpmacBtj");
            return (Criteria) this;
        }

        public Criteria andCorpmacBtjGreaterThan(String value) {
            addCriterion("CorpMac_Btj >", value, "corpmacBtj");
            return (Criteria) this;
        }

        public Criteria andCorpmacBtjGreaterThanOrEqualTo(String value) {
            addCriterion("CorpMac_Btj >=", value, "corpmacBtj");
            return (Criteria) this;
        }

        public Criteria andCorpmacBtjLessThan(String value) {
            addCriterion("CorpMac_Btj <", value, "corpmacBtj");
            return (Criteria) this;
        }

        public Criteria andCorpmacBtjLessThanOrEqualTo(String value) {
            addCriterion("CorpMac_Btj <=", value, "corpmacBtj");
            return (Criteria) this;
        }

        public Criteria andCorpmacBtjLike(String value) {
            addCriterion("CorpMac_Btj like", value, "corpmacBtj");
            return (Criteria) this;
        }

        public Criteria andCorpmacBtjNotLike(String value) {
            addCriterion("CorpMac_Btj not like", value, "corpmacBtj");
            return (Criteria) this;
        }

        public Criteria andCorpmacBtjIn(List<String> values) {
            addCriterion("CorpMac_Btj in", values, "corpmacBtj");
            return (Criteria) this;
        }

        public Criteria andCorpmacBtjNotIn(List<String> values) {
            addCriterion("CorpMac_Btj not in", values, "corpmacBtj");
            return (Criteria) this;
        }

        public Criteria andCorpmacBtjBetween(String value1, String value2) {
            addCriterion("CorpMac_Btj between", value1, value2, "corpmacBtj");
            return (Criteria) this;
        }

        public Criteria andCorpmacBtjNotBetween(String value1, String value2) {
            addCriterion("CorpMac_Btj not between", value1, value2, "corpmacBtj");
            return (Criteria) this;
        }

        public Criteria andCorpmacCsjIsNull() {
            addCriterion("CorpMac_Csj is null");
            return (Criteria) this;
        }

        public Criteria andCorpmacCsjIsNotNull() {
            addCriterion("CorpMac_Csj is not null");
            return (Criteria) this;
        }

        public Criteria andCorpmacCsjEqualTo(String value) {
            addCriterion("CorpMac_Csj =", value, "corpmacCsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacCsjNotEqualTo(String value) {
            addCriterion("CorpMac_Csj <>", value, "corpmacCsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacCsjGreaterThan(String value) {
            addCriterion("CorpMac_Csj >", value, "corpmacCsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacCsjGreaterThanOrEqualTo(String value) {
            addCriterion("CorpMac_Csj >=", value, "corpmacCsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacCsjLessThan(String value) {
            addCriterion("CorpMac_Csj <", value, "corpmacCsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacCsjLessThanOrEqualTo(String value) {
            addCriterion("CorpMac_Csj <=", value, "corpmacCsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacCsjLike(String value) {
            addCriterion("CorpMac_Csj like", value, "corpmacCsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacCsjNotLike(String value) {
            addCriterion("CorpMac_Csj not like", value, "corpmacCsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacCsjIn(List<String> values) {
            addCriterion("CorpMac_Csj in", values, "corpmacCsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacCsjNotIn(List<String> values) {
            addCriterion("CorpMac_Csj not in", values, "corpmacCsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacCsjBetween(String value1, String value2) {
            addCriterion("CorpMac_Csj between", value1, value2, "corpmacCsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacCsjNotBetween(String value1, String value2) {
            addCriterion("CorpMac_Csj not between", value1, value2, "corpmacCsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacXsjIsNull() {
            addCriterion("CorpMac_Xsj is null");
            return (Criteria) this;
        }

        public Criteria andCorpmacXsjIsNotNull() {
            addCriterion("CorpMac_Xsj is not null");
            return (Criteria) this;
        }

        public Criteria andCorpmacXsjEqualTo(String value) {
            addCriterion("CorpMac_Xsj =", value, "corpmacXsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacXsjNotEqualTo(String value) {
            addCriterion("CorpMac_Xsj <>", value, "corpmacXsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacXsjGreaterThan(String value) {
            addCriterion("CorpMac_Xsj >", value, "corpmacXsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacXsjGreaterThanOrEqualTo(String value) {
            addCriterion("CorpMac_Xsj >=", value, "corpmacXsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacXsjLessThan(String value) {
            addCriterion("CorpMac_Xsj <", value, "corpmacXsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacXsjLessThanOrEqualTo(String value) {
            addCriterion("CorpMac_Xsj <=", value, "corpmacXsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacXsjLike(String value) {
            addCriterion("CorpMac_Xsj like", value, "corpmacXsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacXsjNotLike(String value) {
            addCriterion("CorpMac_Xsj not like", value, "corpmacXsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacXsjIn(List<String> values) {
            addCriterion("CorpMac_Xsj in", values, "corpmacXsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacXsjNotIn(List<String> values) {
            addCriterion("CorpMac_Xsj not in", values, "corpmacXsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacXsjBetween(String value1, String value2) {
            addCriterion("CorpMac_Xsj between", value1, value2, "corpmacXsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacXsjNotBetween(String value1, String value2) {
            addCriterion("CorpMac_Xsj not between", value1, value2, "corpmacXsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacJsjIsNull() {
            addCriterion("CorpMac_Jsj is null");
            return (Criteria) this;
        }

        public Criteria andCorpmacJsjIsNotNull() {
            addCriterion("CorpMac_Jsj is not null");
            return (Criteria) this;
        }

        public Criteria andCorpmacJsjEqualTo(String value) {
            addCriterion("CorpMac_Jsj =", value, "corpmacJsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacJsjNotEqualTo(String value) {
            addCriterion("CorpMac_Jsj <>", value, "corpmacJsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacJsjGreaterThan(String value) {
            addCriterion("CorpMac_Jsj >", value, "corpmacJsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacJsjGreaterThanOrEqualTo(String value) {
            addCriterion("CorpMac_Jsj >=", value, "corpmacJsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacJsjLessThan(String value) {
            addCriterion("CorpMac_Jsj <", value, "corpmacJsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacJsjLessThanOrEqualTo(String value) {
            addCriterion("CorpMac_Jsj <=", value, "corpmacJsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacJsjLike(String value) {
            addCriterion("CorpMac_Jsj like", value, "corpmacJsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacJsjNotLike(String value) {
            addCriterion("CorpMac_Jsj not like", value, "corpmacJsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacJsjIn(List<String> values) {
            addCriterion("CorpMac_Jsj in", values, "corpmacJsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacJsjNotIn(List<String> values) {
            addCriterion("CorpMac_Jsj not in", values, "corpmacJsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacJsjBetween(String value1, String value2) {
            addCriterion("CorpMac_Jsj between", value1, value2, "corpmacJsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacJsjNotBetween(String value1, String value2) {
            addCriterion("CorpMac_Jsj not between", value1, value2, "corpmacJsj");
            return (Criteria) this;
        }

        public Criteria andCorpmacLtjIsNull() {
            addCriterion("CorpMac_Ltj is null");
            return (Criteria) this;
        }

        public Criteria andCorpmacLtjIsNotNull() {
            addCriterion("CorpMac_Ltj is not null");
            return (Criteria) this;
        }

        public Criteria andCorpmacLtjEqualTo(String value) {
            addCriterion("CorpMac_Ltj =", value, "corpmacLtj");
            return (Criteria) this;
        }

        public Criteria andCorpmacLtjNotEqualTo(String value) {
            addCriterion("CorpMac_Ltj <>", value, "corpmacLtj");
            return (Criteria) this;
        }

        public Criteria andCorpmacLtjGreaterThan(String value) {
            addCriterion("CorpMac_Ltj >", value, "corpmacLtj");
            return (Criteria) this;
        }

        public Criteria andCorpmacLtjGreaterThanOrEqualTo(String value) {
            addCriterion("CorpMac_Ltj >=", value, "corpmacLtj");
            return (Criteria) this;
        }

        public Criteria andCorpmacLtjLessThan(String value) {
            addCriterion("CorpMac_Ltj <", value, "corpmacLtj");
            return (Criteria) this;
        }

        public Criteria andCorpmacLtjLessThanOrEqualTo(String value) {
            addCriterion("CorpMac_Ltj <=", value, "corpmacLtj");
            return (Criteria) this;
        }

        public Criteria andCorpmacLtjLike(String value) {
            addCriterion("CorpMac_Ltj like", value, "corpmacLtj");
            return (Criteria) this;
        }

        public Criteria andCorpmacLtjNotLike(String value) {
            addCriterion("CorpMac_Ltj not like", value, "corpmacLtj");
            return (Criteria) this;
        }

        public Criteria andCorpmacLtjIn(List<String> values) {
            addCriterion("CorpMac_Ltj in", values, "corpmacLtj");
            return (Criteria) this;
        }

        public Criteria andCorpmacLtjNotIn(List<String> values) {
            addCriterion("CorpMac_Ltj not in", values, "corpmacLtj");
            return (Criteria) this;
        }

        public Criteria andCorpmacLtjBetween(String value1, String value2) {
            addCriterion("CorpMac_Ltj between", value1, value2, "corpmacLtj");
            return (Criteria) this;
        }

        public Criteria andCorpmacLtjNotBetween(String value1, String value2) {
            addCriterion("CorpMac_Ltj not between", value1, value2, "corpmacLtj");
            return (Criteria) this;
        }

        public Criteria andCorpmacQlfIsNull() {
            addCriterion("CorpMac_Qlf is null");
            return (Criteria) this;
        }

        public Criteria andCorpmacQlfIsNotNull() {
            addCriterion("CorpMac_Qlf is not null");
            return (Criteria) this;
        }

        public Criteria andCorpmacQlfEqualTo(String value) {
            addCriterion("CorpMac_Qlf =", value, "corpmacQlf");
            return (Criteria) this;
        }

        public Criteria andCorpmacQlfNotEqualTo(String value) {
            addCriterion("CorpMac_Qlf <>", value, "corpmacQlf");
            return (Criteria) this;
        }

        public Criteria andCorpmacQlfGreaterThan(String value) {
            addCriterion("CorpMac_Qlf >", value, "corpmacQlf");
            return (Criteria) this;
        }

        public Criteria andCorpmacQlfGreaterThanOrEqualTo(String value) {
            addCriterion("CorpMac_Qlf >=", value, "corpmacQlf");
            return (Criteria) this;
        }

        public Criteria andCorpmacQlfLessThan(String value) {
            addCriterion("CorpMac_Qlf <", value, "corpmacQlf");
            return (Criteria) this;
        }

        public Criteria andCorpmacQlfLessThanOrEqualTo(String value) {
            addCriterion("CorpMac_Qlf <=", value, "corpmacQlf");
            return (Criteria) this;
        }

        public Criteria andCorpmacQlfLike(String value) {
            addCriterion("CorpMac_Qlf like", value, "corpmacQlf");
            return (Criteria) this;
        }

        public Criteria andCorpmacQlfNotLike(String value) {
            addCriterion("CorpMac_Qlf not like", value, "corpmacQlf");
            return (Criteria) this;
        }

        public Criteria andCorpmacQlfIn(List<String> values) {
            addCriterion("CorpMac_Qlf in", values, "corpmacQlf");
            return (Criteria) this;
        }

        public Criteria andCorpmacQlfNotIn(List<String> values) {
            addCriterion("CorpMac_Qlf not in", values, "corpmacQlf");
            return (Criteria) this;
        }

        public Criteria andCorpmacQlfBetween(String value1, String value2) {
            addCriterion("CorpMac_Qlf between", value1, value2, "corpmacQlf");
            return (Criteria) this;
        }

        public Criteria andCorpmacQlfNotBetween(String value1, String value2) {
            addCriterion("CorpMac_Qlf not between", value1, value2, "corpmacQlf");
            return (Criteria) this;
        }

        public Criteria andCorpmacWlfIsNull() {
            addCriterion("CorpMac_Wlf is null");
            return (Criteria) this;
        }

        public Criteria andCorpmacWlfIsNotNull() {
            addCriterion("CorpMac_Wlf is not null");
            return (Criteria) this;
        }

        public Criteria andCorpmacWlfEqualTo(String value) {
            addCriterion("CorpMac_Wlf =", value, "corpmacWlf");
            return (Criteria) this;
        }

        public Criteria andCorpmacWlfNotEqualTo(String value) {
            addCriterion("CorpMac_Wlf <>", value, "corpmacWlf");
            return (Criteria) this;
        }

        public Criteria andCorpmacWlfGreaterThan(String value) {
            addCriterion("CorpMac_Wlf >", value, "corpmacWlf");
            return (Criteria) this;
        }

        public Criteria andCorpmacWlfGreaterThanOrEqualTo(String value) {
            addCriterion("CorpMac_Wlf >=", value, "corpmacWlf");
            return (Criteria) this;
        }

        public Criteria andCorpmacWlfLessThan(String value) {
            addCriterion("CorpMac_Wlf <", value, "corpmacWlf");
            return (Criteria) this;
        }

        public Criteria andCorpmacWlfLessThanOrEqualTo(String value) {
            addCriterion("CorpMac_Wlf <=", value, "corpmacWlf");
            return (Criteria) this;
        }

        public Criteria andCorpmacWlfLike(String value) {
            addCriterion("CorpMac_Wlf like", value, "corpmacWlf");
            return (Criteria) this;
        }

        public Criteria andCorpmacWlfNotLike(String value) {
            addCriterion("CorpMac_Wlf not like", value, "corpmacWlf");
            return (Criteria) this;
        }

        public Criteria andCorpmacWlfIn(List<String> values) {
            addCriterion("CorpMac_Wlf in", values, "corpmacWlf");
            return (Criteria) this;
        }

        public Criteria andCorpmacWlfNotIn(List<String> values) {
            addCriterion("CorpMac_Wlf not in", values, "corpmacWlf");
            return (Criteria) this;
        }

        public Criteria andCorpmacWlfBetween(String value1, String value2) {
            addCriterion("CorpMac_Wlf between", value1, value2, "corpmacWlf");
            return (Criteria) this;
        }

        public Criteria andCorpmacWlfNotBetween(String value1, String value2) {
            addCriterion("CorpMac_Wlf not between", value1, value2, "corpmacWlf");
            return (Criteria) this;
        }

        public Criteria andCorpmacTestIsNull() {
            addCriterion("CorpMac_Test is null");
            return (Criteria) this;
        }

        public Criteria andCorpmacTestIsNotNull() {
            addCriterion("CorpMac_Test is not null");
            return (Criteria) this;
        }

        public Criteria andCorpmacTestEqualTo(String value) {
            addCriterion("CorpMac_Test =", value, "corpmacTest");
            return (Criteria) this;
        }

        public Criteria andCorpmacTestNotEqualTo(String value) {
            addCriterion("CorpMac_Test <>", value, "corpmacTest");
            return (Criteria) this;
        }

        public Criteria andCorpmacTestGreaterThan(String value) {
            addCriterion("CorpMac_Test >", value, "corpmacTest");
            return (Criteria) this;
        }

        public Criteria andCorpmacTestGreaterThanOrEqualTo(String value) {
            addCriterion("CorpMac_Test >=", value, "corpmacTest");
            return (Criteria) this;
        }

        public Criteria andCorpmacTestLessThan(String value) {
            addCriterion("CorpMac_Test <", value, "corpmacTest");
            return (Criteria) this;
        }

        public Criteria andCorpmacTestLessThanOrEqualTo(String value) {
            addCriterion("CorpMac_Test <=", value, "corpmacTest");
            return (Criteria) this;
        }

        public Criteria andCorpmacTestLike(String value) {
            addCriterion("CorpMac_Test like", value, "corpmacTest");
            return (Criteria) this;
        }

        public Criteria andCorpmacTestNotLike(String value) {
            addCriterion("CorpMac_Test not like", value, "corpmacTest");
            return (Criteria) this;
        }

        public Criteria andCorpmacTestIn(List<String> values) {
            addCriterion("CorpMac_Test in", values, "corpmacTest");
            return (Criteria) this;
        }

        public Criteria andCorpmacTestNotIn(List<String> values) {
            addCriterion("CorpMac_Test not in", values, "corpmacTest");
            return (Criteria) this;
        }

        public Criteria andCorpmacTestBetween(String value1, String value2) {
            addCriterion("CorpMac_Test between", value1, value2, "corpmacTest");
            return (Criteria) this;
        }

        public Criteria andCorpmacTestNotBetween(String value1, String value2) {
            addCriterion("CorpMac_Test not between", value1, value2, "corpmacTest");
            return (Criteria) this;
        }

        public Criteria andCorpgmYarnIsNull() {
            addCriterion("CorpGM_Yarn is null");
            return (Criteria) this;
        }

        public Criteria andCorpgmYarnIsNotNull() {
            addCriterion("CorpGM_Yarn is not null");
            return (Criteria) this;
        }

        public Criteria andCorpgmYarnEqualTo(String value) {
            addCriterion("CorpGM_Yarn =", value, "corpgmYarn");
            return (Criteria) this;
        }

        public Criteria andCorpgmYarnNotEqualTo(String value) {
            addCriterion("CorpGM_Yarn <>", value, "corpgmYarn");
            return (Criteria) this;
        }

        public Criteria andCorpgmYarnGreaterThan(String value) {
            addCriterion("CorpGM_Yarn >", value, "corpgmYarn");
            return (Criteria) this;
        }

        public Criteria andCorpgmYarnGreaterThanOrEqualTo(String value) {
            addCriterion("CorpGM_Yarn >=", value, "corpgmYarn");
            return (Criteria) this;
        }

        public Criteria andCorpgmYarnLessThan(String value) {
            addCriterion("CorpGM_Yarn <", value, "corpgmYarn");
            return (Criteria) this;
        }

        public Criteria andCorpgmYarnLessThanOrEqualTo(String value) {
            addCriterion("CorpGM_Yarn <=", value, "corpgmYarn");
            return (Criteria) this;
        }

        public Criteria andCorpgmYarnLike(String value) {
            addCriterion("CorpGM_Yarn like", value, "corpgmYarn");
            return (Criteria) this;
        }

        public Criteria andCorpgmYarnNotLike(String value) {
            addCriterion("CorpGM_Yarn not like", value, "corpgmYarn");
            return (Criteria) this;
        }

        public Criteria andCorpgmYarnIn(List<String> values) {
            addCriterion("CorpGM_Yarn in", values, "corpgmYarn");
            return (Criteria) this;
        }

        public Criteria andCorpgmYarnNotIn(List<String> values) {
            addCriterion("CorpGM_Yarn not in", values, "corpgmYarn");
            return (Criteria) this;
        }

        public Criteria andCorpgmYarnBetween(String value1, String value2) {
            addCriterion("CorpGM_Yarn between", value1, value2, "corpgmYarn");
            return (Criteria) this;
        }

        public Criteria andCorpgmYarnNotBetween(String value1, String value2) {
            addCriterion("CorpGM_Yarn not between", value1, value2, "corpgmYarn");
            return (Criteria) this;
        }

        public Criteria andCorpgmQlfIsNull() {
            addCriterion("CorpGM_Qlf is null");
            return (Criteria) this;
        }

        public Criteria andCorpgmQlfIsNotNull() {
            addCriterion("CorpGM_Qlf is not null");
            return (Criteria) this;
        }

        public Criteria andCorpgmQlfEqualTo(String value) {
            addCriterion("CorpGM_Qlf =", value, "corpgmQlf");
            return (Criteria) this;
        }

        public Criteria andCorpgmQlfNotEqualTo(String value) {
            addCriterion("CorpGM_Qlf <>", value, "corpgmQlf");
            return (Criteria) this;
        }

        public Criteria andCorpgmQlfGreaterThan(String value) {
            addCriterion("CorpGM_Qlf >", value, "corpgmQlf");
            return (Criteria) this;
        }

        public Criteria andCorpgmQlfGreaterThanOrEqualTo(String value) {
            addCriterion("CorpGM_Qlf >=", value, "corpgmQlf");
            return (Criteria) this;
        }

        public Criteria andCorpgmQlfLessThan(String value) {
            addCriterion("CorpGM_Qlf <", value, "corpgmQlf");
            return (Criteria) this;
        }

        public Criteria andCorpgmQlfLessThanOrEqualTo(String value) {
            addCriterion("CorpGM_Qlf <=", value, "corpgmQlf");
            return (Criteria) this;
        }

        public Criteria andCorpgmQlfLike(String value) {
            addCriterion("CorpGM_Qlf like", value, "corpgmQlf");
            return (Criteria) this;
        }

        public Criteria andCorpgmQlfNotLike(String value) {
            addCriterion("CorpGM_Qlf not like", value, "corpgmQlf");
            return (Criteria) this;
        }

        public Criteria andCorpgmQlfIn(List<String> values) {
            addCriterion("CorpGM_Qlf in", values, "corpgmQlf");
            return (Criteria) this;
        }

        public Criteria andCorpgmQlfNotIn(List<String> values) {
            addCriterion("CorpGM_Qlf not in", values, "corpgmQlf");
            return (Criteria) this;
        }

        public Criteria andCorpgmQlfBetween(String value1, String value2) {
            addCriterion("CorpGM_Qlf between", value1, value2, "corpgmQlf");
            return (Criteria) this;
        }

        public Criteria andCorpgmQlfNotBetween(String value1, String value2) {
            addCriterion("CorpGM_Qlf not between", value1, value2, "corpgmQlf");
            return (Criteria) this;
        }

        public Criteria andCorpgmWlfIsNull() {
            addCriterion("CorpGM_Wlf is null");
            return (Criteria) this;
        }

        public Criteria andCorpgmWlfIsNotNull() {
            addCriterion("CorpGM_Wlf is not null");
            return (Criteria) this;
        }

        public Criteria andCorpgmWlfEqualTo(String value) {
            addCriterion("CorpGM_Wlf =", value, "corpgmWlf");
            return (Criteria) this;
        }

        public Criteria andCorpgmWlfNotEqualTo(String value) {
            addCriterion("CorpGM_Wlf <>", value, "corpgmWlf");
            return (Criteria) this;
        }

        public Criteria andCorpgmWlfGreaterThan(String value) {
            addCriterion("CorpGM_Wlf >", value, "corpgmWlf");
            return (Criteria) this;
        }

        public Criteria andCorpgmWlfGreaterThanOrEqualTo(String value) {
            addCriterion("CorpGM_Wlf >=", value, "corpgmWlf");
            return (Criteria) this;
        }

        public Criteria andCorpgmWlfLessThan(String value) {
            addCriterion("CorpGM_Wlf <", value, "corpgmWlf");
            return (Criteria) this;
        }

        public Criteria andCorpgmWlfLessThanOrEqualTo(String value) {
            addCriterion("CorpGM_Wlf <=", value, "corpgmWlf");
            return (Criteria) this;
        }

        public Criteria andCorpgmWlfLike(String value) {
            addCriterion("CorpGM_Wlf like", value, "corpgmWlf");
            return (Criteria) this;
        }

        public Criteria andCorpgmWlfNotLike(String value) {
            addCriterion("CorpGM_Wlf not like", value, "corpgmWlf");
            return (Criteria) this;
        }

        public Criteria andCorpgmWlfIn(List<String> values) {
            addCriterion("CorpGM_Wlf in", values, "corpgmWlf");
            return (Criteria) this;
        }

        public Criteria andCorpgmWlfNotIn(List<String> values) {
            addCriterion("CorpGM_Wlf not in", values, "corpgmWlf");
            return (Criteria) this;
        }

        public Criteria andCorpgmWlfBetween(String value1, String value2) {
            addCriterion("CorpGM_Wlf between", value1, value2, "corpgmWlf");
            return (Criteria) this;
        }

        public Criteria andCorpgmWlfNotBetween(String value1, String value2) {
            addCriterion("CorpGM_Wlf not between", value1, value2, "corpgmWlf");
            return (Criteria) this;
        }

        public Criteria andCorpgmYearIsNull() {
            addCriterion("CorpGM_Year is null");
            return (Criteria) this;
        }

        public Criteria andCorpgmYearIsNotNull() {
            addCriterion("CorpGM_Year is not null");
            return (Criteria) this;
        }

        public Criteria andCorpgmYearEqualTo(String value) {
            addCriterion("CorpGM_Year =", value, "corpgmYear");
            return (Criteria) this;
        }

        public Criteria andCorpgmYearNotEqualTo(String value) {
            addCriterion("CorpGM_Year <>", value, "corpgmYear");
            return (Criteria) this;
        }

        public Criteria andCorpgmYearGreaterThan(String value) {
            addCriterion("CorpGM_Year >", value, "corpgmYear");
            return (Criteria) this;
        }

        public Criteria andCorpgmYearGreaterThanOrEqualTo(String value) {
            addCriterion("CorpGM_Year >=", value, "corpgmYear");
            return (Criteria) this;
        }

        public Criteria andCorpgmYearLessThan(String value) {
            addCriterion("CorpGM_Year <", value, "corpgmYear");
            return (Criteria) this;
        }

        public Criteria andCorpgmYearLessThanOrEqualTo(String value) {
            addCriterion("CorpGM_Year <=", value, "corpgmYear");
            return (Criteria) this;
        }

        public Criteria andCorpgmYearLike(String value) {
            addCriterion("CorpGM_Year like", value, "corpgmYear");
            return (Criteria) this;
        }

        public Criteria andCorpgmYearNotLike(String value) {
            addCriterion("CorpGM_Year not like", value, "corpgmYear");
            return (Criteria) this;
        }

        public Criteria andCorpgmYearIn(List<String> values) {
            addCriterion("CorpGM_Year in", values, "corpgmYear");
            return (Criteria) this;
        }

        public Criteria andCorpgmYearNotIn(List<String> values) {
            addCriterion("CorpGM_Year not in", values, "corpgmYear");
            return (Criteria) this;
        }

        public Criteria andCorpgmYearBetween(String value1, String value2) {
            addCriterion("CorpGM_Year between", value1, value2, "corpgmYear");
            return (Criteria) this;
        }

        public Criteria andCorpgmYearNotBetween(String value1, String value2) {
            addCriterion("CorpGM_Year not between", value1, value2, "corpgmYear");
            return (Criteria) this;
        }

        public Criteria andYarnbrandIsNull() {
            addCriterion("YarnBrand is null");
            return (Criteria) this;
        }

        public Criteria andYarnbrandIsNotNull() {
            addCriterion("YarnBrand is not null");
            return (Criteria) this;
        }

        public Criteria andYarnbrandEqualTo(String value) {
            addCriterion("YarnBrand =", value, "yarnbrand");
            return (Criteria) this;
        }

        public Criteria andYarnbrandNotEqualTo(String value) {
            addCriterion("YarnBrand <>", value, "yarnbrand");
            return (Criteria) this;
        }

        public Criteria andYarnbrandGreaterThan(String value) {
            addCriterion("YarnBrand >", value, "yarnbrand");
            return (Criteria) this;
        }

        public Criteria andYarnbrandGreaterThanOrEqualTo(String value) {
            addCriterion("YarnBrand >=", value, "yarnbrand");
            return (Criteria) this;
        }

        public Criteria andYarnbrandLessThan(String value) {
            addCriterion("YarnBrand <", value, "yarnbrand");
            return (Criteria) this;
        }

        public Criteria andYarnbrandLessThanOrEqualTo(String value) {
            addCriterion("YarnBrand <=", value, "yarnbrand");
            return (Criteria) this;
        }

        public Criteria andYarnbrandLike(String value) {
            addCriterion("YarnBrand like", value, "yarnbrand");
            return (Criteria) this;
        }

        public Criteria andYarnbrandNotLike(String value) {
            addCriterion("YarnBrand not like", value, "yarnbrand");
            return (Criteria) this;
        }

        public Criteria andYarnbrandIn(List<String> values) {
            addCriterion("YarnBrand in", values, "yarnbrand");
            return (Criteria) this;
        }

        public Criteria andYarnbrandNotIn(List<String> values) {
            addCriterion("YarnBrand not in", values, "yarnbrand");
            return (Criteria) this;
        }

        public Criteria andYarnbrandBetween(String value1, String value2) {
            addCriterion("YarnBrand between", value1, value2, "yarnbrand");
            return (Criteria) this;
        }

        public Criteria andYarnbrandNotBetween(String value1, String value2) {
            addCriterion("YarnBrand not between", value1, value2, "yarnbrand");
            return (Criteria) this;
        }

        public Criteria andCorpPriceIsNull() {
            addCriterion("Corp_Price is null");
            return (Criteria) this;
        }

        public Criteria andCorpPriceIsNotNull() {
            addCriterion("Corp_Price is not null");
            return (Criteria) this;
        }

        public Criteria andCorpPriceEqualTo(String value) {
            addCriterion("Corp_Price =", value, "corpPrice");
            return (Criteria) this;
        }

        public Criteria andCorpPriceNotEqualTo(String value) {
            addCriterion("Corp_Price <>", value, "corpPrice");
            return (Criteria) this;
        }

        public Criteria andCorpPriceGreaterThan(String value) {
            addCriterion("Corp_Price >", value, "corpPrice");
            return (Criteria) this;
        }

        public Criteria andCorpPriceGreaterThanOrEqualTo(String value) {
            addCriterion("Corp_Price >=", value, "corpPrice");
            return (Criteria) this;
        }

        public Criteria andCorpPriceLessThan(String value) {
            addCriterion("Corp_Price <", value, "corpPrice");
            return (Criteria) this;
        }

        public Criteria andCorpPriceLessThanOrEqualTo(String value) {
            addCriterion("Corp_Price <=", value, "corpPrice");
            return (Criteria) this;
        }

        public Criteria andCorpPriceLike(String value) {
            addCriterion("Corp_Price like", value, "corpPrice");
            return (Criteria) this;
        }

        public Criteria andCorpPriceNotLike(String value) {
            addCriterion("Corp_Price not like", value, "corpPrice");
            return (Criteria) this;
        }

        public Criteria andCorpPriceIn(List<String> values) {
            addCriterion("Corp_Price in", values, "corpPrice");
            return (Criteria) this;
        }

        public Criteria andCorpPriceNotIn(List<String> values) {
            addCriterion("Corp_Price not in", values, "corpPrice");
            return (Criteria) this;
        }

        public Criteria andCorpPriceBetween(String value1, String value2) {
            addCriterion("Corp_Price between", value1, value2, "corpPrice");
            return (Criteria) this;
        }

        public Criteria andCorpPriceNotBetween(String value1, String value2) {
            addCriterion("Corp_Price not between", value1, value2, "corpPrice");
            return (Criteria) this;
        }

        public Criteria andCorpSxwIsNull() {
            addCriterion("Corp_Sxw is null");
            return (Criteria) this;
        }

        public Criteria andCorpSxwIsNotNull() {
            addCriterion("Corp_Sxw is not null");
            return (Criteria) this;
        }

        public Criteria andCorpSxwEqualTo(String value) {
            addCriterion("Corp_Sxw =", value, "corpSxw");
            return (Criteria) this;
        }

        public Criteria andCorpSxwNotEqualTo(String value) {
            addCriterion("Corp_Sxw <>", value, "corpSxw");
            return (Criteria) this;
        }

        public Criteria andCorpSxwGreaterThan(String value) {
            addCriterion("Corp_Sxw >", value, "corpSxw");
            return (Criteria) this;
        }

        public Criteria andCorpSxwGreaterThanOrEqualTo(String value) {
            addCriterion("Corp_Sxw >=", value, "corpSxw");
            return (Criteria) this;
        }

        public Criteria andCorpSxwLessThan(String value) {
            addCriterion("Corp_Sxw <", value, "corpSxw");
            return (Criteria) this;
        }

        public Criteria andCorpSxwLessThanOrEqualTo(String value) {
            addCriterion("Corp_Sxw <=", value, "corpSxw");
            return (Criteria) this;
        }

        public Criteria andCorpSxwLike(String value) {
            addCriterion("Corp_Sxw like", value, "corpSxw");
            return (Criteria) this;
        }

        public Criteria andCorpSxwNotLike(String value) {
            addCriterion("Corp_Sxw not like", value, "corpSxw");
            return (Criteria) this;
        }

        public Criteria andCorpSxwIn(List<String> values) {
            addCriterion("Corp_Sxw in", values, "corpSxw");
            return (Criteria) this;
        }

        public Criteria andCorpSxwNotIn(List<String> values) {
            addCriterion("Corp_Sxw not in", values, "corpSxw");
            return (Criteria) this;
        }

        public Criteria andCorpSxwBetween(String value1, String value2) {
            addCriterion("Corp_Sxw between", value1, value2, "corpSxw");
            return (Criteria) this;
        }

        public Criteria andCorpSxwNotBetween(String value1, String value2) {
            addCriterion("Corp_Sxw not between", value1, value2, "corpSxw");
            return (Criteria) this;
        }

        public Criteria andAllmoneyIsNull() {
            addCriterion("AllMoney is null");
            return (Criteria) this;
        }

        public Criteria andAllmoneyIsNotNull() {
            addCriterion("AllMoney is not null");
            return (Criteria) this;
        }

        public Criteria andAllmoneyEqualTo(String value) {
            addCriterion("AllMoney =", value, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyNotEqualTo(String value) {
            addCriterion("AllMoney <>", value, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyGreaterThan(String value) {
            addCriterion("AllMoney >", value, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("AllMoney >=", value, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyLessThan(String value) {
            addCriterion("AllMoney <", value, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyLessThanOrEqualTo(String value) {
            addCriterion("AllMoney <=", value, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyLike(String value) {
            addCriterion("AllMoney like", value, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyNotLike(String value) {
            addCriterion("AllMoney not like", value, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyIn(List<String> values) {
            addCriterion("AllMoney in", values, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyNotIn(List<String> values) {
            addCriterion("AllMoney not in", values, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyBetween(String value1, String value2) {
            addCriterion("AllMoney between", value1, value2, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyNotBetween(String value1, String value2) {
            addCriterion("AllMoney not between", value1, value2, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAddmoneyIsNull() {
            addCriterion("AddMoney is null");
            return (Criteria) this;
        }

        public Criteria andAddmoneyIsNotNull() {
            addCriterion("AddMoney is not null");
            return (Criteria) this;
        }

        public Criteria andAddmoneyEqualTo(String value) {
            addCriterion("AddMoney =", value, "addmoney");
            return (Criteria) this;
        }

        public Criteria andAddmoneyNotEqualTo(String value) {
            addCriterion("AddMoney <>", value, "addmoney");
            return (Criteria) this;
        }

        public Criteria andAddmoneyGreaterThan(String value) {
            addCriterion("AddMoney >", value, "addmoney");
            return (Criteria) this;
        }

        public Criteria andAddmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("AddMoney >=", value, "addmoney");
            return (Criteria) this;
        }

        public Criteria andAddmoneyLessThan(String value) {
            addCriterion("AddMoney <", value, "addmoney");
            return (Criteria) this;
        }

        public Criteria andAddmoneyLessThanOrEqualTo(String value) {
            addCriterion("AddMoney <=", value, "addmoney");
            return (Criteria) this;
        }

        public Criteria andAddmoneyLike(String value) {
            addCriterion("AddMoney like", value, "addmoney");
            return (Criteria) this;
        }

        public Criteria andAddmoneyNotLike(String value) {
            addCriterion("AddMoney not like", value, "addmoney");
            return (Criteria) this;
        }

        public Criteria andAddmoneyIn(List<String> values) {
            addCriterion("AddMoney in", values, "addmoney");
            return (Criteria) this;
        }

        public Criteria andAddmoneyNotIn(List<String> values) {
            addCriterion("AddMoney not in", values, "addmoney");
            return (Criteria) this;
        }

        public Criteria andAddmoneyBetween(String value1, String value2) {
            addCriterion("AddMoney between", value1, value2, "addmoney");
            return (Criteria) this;
        }

        public Criteria andAddmoneyNotBetween(String value1, String value2) {
            addCriterion("AddMoney not between", value1, value2, "addmoney");
            return (Criteria) this;
        }

        public Criteria andIslostIsNull() {
            addCriterion("IsLost is null");
            return (Criteria) this;
        }

        public Criteria andIslostIsNotNull() {
            addCriterion("IsLost is not null");
            return (Criteria) this;
        }

        public Criteria andIslostEqualTo(String value) {
            addCriterion("IsLost =", value, "islost");
            return (Criteria) this;
        }

        public Criteria andIslostNotEqualTo(String value) {
            addCriterion("IsLost <>", value, "islost");
            return (Criteria) this;
        }

        public Criteria andIslostGreaterThan(String value) {
            addCriterion("IsLost >", value, "islost");
            return (Criteria) this;
        }

        public Criteria andIslostGreaterThanOrEqualTo(String value) {
            addCriterion("IsLost >=", value, "islost");
            return (Criteria) this;
        }

        public Criteria andIslostLessThan(String value) {
            addCriterion("IsLost <", value, "islost");
            return (Criteria) this;
        }

        public Criteria andIslostLessThanOrEqualTo(String value) {
            addCriterion("IsLost <=", value, "islost");
            return (Criteria) this;
        }

        public Criteria andIslostLike(String value) {
            addCriterion("IsLost like", value, "islost");
            return (Criteria) this;
        }

        public Criteria andIslostNotLike(String value) {
            addCriterion("IsLost not like", value, "islost");
            return (Criteria) this;
        }

        public Criteria andIslostIn(List<String> values) {
            addCriterion("IsLost in", values, "islost");
            return (Criteria) this;
        }

        public Criteria andIslostNotIn(List<String> values) {
            addCriterion("IsLost not in", values, "islost");
            return (Criteria) this;
        }

        public Criteria andIslostBetween(String value1, String value2) {
            addCriterion("IsLost between", value1, value2, "islost");
            return (Criteria) this;
        }

        public Criteria andIslostNotBetween(String value1, String value2) {
            addCriterion("IsLost not between", value1, value2, "islost");
            return (Criteria) this;
        }

        public Criteria andIssmsokIsNull() {
            addCriterion("IsSmsOK is null");
            return (Criteria) this;
        }

        public Criteria andIssmsokIsNotNull() {
            addCriterion("IsSmsOK is not null");
            return (Criteria) this;
        }

        public Criteria andIssmsokEqualTo(Integer value) {
            addCriterion("IsSmsOK =", value, "issmsok");
            return (Criteria) this;
        }

        public Criteria andIssmsokNotEqualTo(Integer value) {
            addCriterion("IsSmsOK <>", value, "issmsok");
            return (Criteria) this;
        }

        public Criteria andIssmsokGreaterThan(Integer value) {
            addCriterion("IsSmsOK >", value, "issmsok");
            return (Criteria) this;
        }

        public Criteria andIssmsokGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsSmsOK >=", value, "issmsok");
            return (Criteria) this;
        }

        public Criteria andIssmsokLessThan(Integer value) {
            addCriterion("IsSmsOK <", value, "issmsok");
            return (Criteria) this;
        }

        public Criteria andIssmsokLessThanOrEqualTo(Integer value) {
            addCriterion("IsSmsOK <=", value, "issmsok");
            return (Criteria) this;
        }

        public Criteria andIssmsokIn(List<Integer> values) {
            addCriterion("IsSmsOK in", values, "issmsok");
            return (Criteria) this;
        }

        public Criteria andIssmsokNotIn(List<Integer> values) {
            addCriterion("IsSmsOK not in", values, "issmsok");
            return (Criteria) this;
        }

        public Criteria andIssmsokBetween(Integer value1, Integer value2) {
            addCriterion("IsSmsOK between", value1, value2, "issmsok");
            return (Criteria) this;
        }

        public Criteria andIssmsokNotBetween(Integer value1, Integer value2) {
            addCriterion("IsSmsOK not between", value1, value2, "issmsok");
            return (Criteria) this;
        }

        public Criteria andIsbuysmsokIsNull() {
            addCriterion("IsBuySmsOK is null");
            return (Criteria) this;
        }

        public Criteria andIsbuysmsokIsNotNull() {
            addCriterion("IsBuySmsOK is not null");
            return (Criteria) this;
        }

        public Criteria andIsbuysmsokEqualTo(Integer value) {
            addCriterion("IsBuySmsOK =", value, "isbuysmsok");
            return (Criteria) this;
        }

        public Criteria andIsbuysmsokNotEqualTo(Integer value) {
            addCriterion("IsBuySmsOK <>", value, "isbuysmsok");
            return (Criteria) this;
        }

        public Criteria andIsbuysmsokGreaterThan(Integer value) {
            addCriterion("IsBuySmsOK >", value, "isbuysmsok");
            return (Criteria) this;
        }

        public Criteria andIsbuysmsokGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsBuySmsOK >=", value, "isbuysmsok");
            return (Criteria) this;
        }

        public Criteria andIsbuysmsokLessThan(Integer value) {
            addCriterion("IsBuySmsOK <", value, "isbuysmsok");
            return (Criteria) this;
        }

        public Criteria andIsbuysmsokLessThanOrEqualTo(Integer value) {
            addCriterion("IsBuySmsOK <=", value, "isbuysmsok");
            return (Criteria) this;
        }

        public Criteria andIsbuysmsokIn(List<Integer> values) {
            addCriterion("IsBuySmsOK in", values, "isbuysmsok");
            return (Criteria) this;
        }

        public Criteria andIsbuysmsokNotIn(List<Integer> values) {
            addCriterion("IsBuySmsOK not in", values, "isbuysmsok");
            return (Criteria) this;
        }

        public Criteria andIsbuysmsokBetween(Integer value1, Integer value2) {
            addCriterion("IsBuySmsOK between", value1, value2, "isbuysmsok");
            return (Criteria) this;
        }

        public Criteria andIsbuysmsokNotBetween(Integer value1, Integer value2) {
            addCriterion("IsBuySmsOK not between", value1, value2, "isbuysmsok");
            return (Criteria) this;
        }

        public Criteria andCorpcatewuIsNull() {
            addCriterion("CorpCateWu is null");
            return (Criteria) this;
        }

        public Criteria andCorpcatewuIsNotNull() {
            addCriterion("CorpCateWu is not null");
            return (Criteria) this;
        }

        public Criteria andCorpcatewuEqualTo(String value) {
            addCriterion("CorpCateWu =", value, "corpcatewu");
            return (Criteria) this;
        }

        public Criteria andCorpcatewuNotEqualTo(String value) {
            addCriterion("CorpCateWu <>", value, "corpcatewu");
            return (Criteria) this;
        }

        public Criteria andCorpcatewuGreaterThan(String value) {
            addCriterion("CorpCateWu >", value, "corpcatewu");
            return (Criteria) this;
        }

        public Criteria andCorpcatewuGreaterThanOrEqualTo(String value) {
            addCriterion("CorpCateWu >=", value, "corpcatewu");
            return (Criteria) this;
        }

        public Criteria andCorpcatewuLessThan(String value) {
            addCriterion("CorpCateWu <", value, "corpcatewu");
            return (Criteria) this;
        }

        public Criteria andCorpcatewuLessThanOrEqualTo(String value) {
            addCriterion("CorpCateWu <=", value, "corpcatewu");
            return (Criteria) this;
        }

        public Criteria andCorpcatewuLike(String value) {
            addCriterion("CorpCateWu like", value, "corpcatewu");
            return (Criteria) this;
        }

        public Criteria andCorpcatewuNotLike(String value) {
            addCriterion("CorpCateWu not like", value, "corpcatewu");
            return (Criteria) this;
        }

        public Criteria andCorpcatewuIn(List<String> values) {
            addCriterion("CorpCateWu in", values, "corpcatewu");
            return (Criteria) this;
        }

        public Criteria andCorpcatewuNotIn(List<String> values) {
            addCriterion("CorpCateWu not in", values, "corpcatewu");
            return (Criteria) this;
        }

        public Criteria andCorpcatewuBetween(String value1, String value2) {
            addCriterion("CorpCateWu between", value1, value2, "corpcatewu");
            return (Criteria) this;
        }

        public Criteria andCorpcatewuNotBetween(String value1, String value2) {
            addCriterion("CorpCateWu not between", value1, value2, "corpcatewu");
            return (Criteria) this;
        }

        public Criteria andIscom4IsNull() {
            addCriterion("IsCom4 is null");
            return (Criteria) this;
        }

        public Criteria andIscom4IsNotNull() {
            addCriterion("IsCom4 is not null");
            return (Criteria) this;
        }

        public Criteria andIscom4EqualTo(Integer value) {
            addCriterion("IsCom4 =", value, "iscom4");
            return (Criteria) this;
        }

        public Criteria andIscom4NotEqualTo(Integer value) {
            addCriterion("IsCom4 <>", value, "iscom4");
            return (Criteria) this;
        }

        public Criteria andIscom4GreaterThan(Integer value) {
            addCriterion("IsCom4 >", value, "iscom4");
            return (Criteria) this;
        }

        public Criteria andIscom4GreaterThanOrEqualTo(Integer value) {
            addCriterion("IsCom4 >=", value, "iscom4");
            return (Criteria) this;
        }

        public Criteria andIscom4LessThan(Integer value) {
            addCriterion("IsCom4 <", value, "iscom4");
            return (Criteria) this;
        }

        public Criteria andIscom4LessThanOrEqualTo(Integer value) {
            addCriterion("IsCom4 <=", value, "iscom4");
            return (Criteria) this;
        }

        public Criteria andIscom4In(List<Integer> values) {
            addCriterion("IsCom4 in", values, "iscom4");
            return (Criteria) this;
        }

        public Criteria andIscom4NotIn(List<Integer> values) {
            addCriterion("IsCom4 not in", values, "iscom4");
            return (Criteria) this;
        }

        public Criteria andIscom4Between(Integer value1, Integer value2) {
            addCriterion("IsCom4 between", value1, value2, "iscom4");
            return (Criteria) this;
        }

        public Criteria andIscom4NotBetween(Integer value1, Integer value2) {
            addCriterion("IsCom4 not between", value1, value2, "iscom4");
            return (Criteria) this;
        }

        public Criteria andCorpcategcIsNull() {
            addCriterion("CorpCateGC is null");
            return (Criteria) this;
        }

        public Criteria andCorpcategcIsNotNull() {
            addCriterion("CorpCateGC is not null");
            return (Criteria) this;
        }

        public Criteria andCorpcategcEqualTo(String value) {
            addCriterion("CorpCateGC =", value, "corpcategc");
            return (Criteria) this;
        }

        public Criteria andCorpcategcNotEqualTo(String value) {
            addCriterion("CorpCateGC <>", value, "corpcategc");
            return (Criteria) this;
        }

        public Criteria andCorpcategcGreaterThan(String value) {
            addCriterion("CorpCateGC >", value, "corpcategc");
            return (Criteria) this;
        }

        public Criteria andCorpcategcGreaterThanOrEqualTo(String value) {
            addCriterion("CorpCateGC >=", value, "corpcategc");
            return (Criteria) this;
        }

        public Criteria andCorpcategcLessThan(String value) {
            addCriterion("CorpCateGC <", value, "corpcategc");
            return (Criteria) this;
        }

        public Criteria andCorpcategcLessThanOrEqualTo(String value) {
            addCriterion("CorpCateGC <=", value, "corpcategc");
            return (Criteria) this;
        }

        public Criteria andCorpcategcLike(String value) {
            addCriterion("CorpCateGC like", value, "corpcategc");
            return (Criteria) this;
        }

        public Criteria andCorpcategcNotLike(String value) {
            addCriterion("CorpCateGC not like", value, "corpcategc");
            return (Criteria) this;
        }

        public Criteria andCorpcategcIn(List<String> values) {
            addCriterion("CorpCateGC in", values, "corpcategc");
            return (Criteria) this;
        }

        public Criteria andCorpcategcNotIn(List<String> values) {
            addCriterion("CorpCateGC not in", values, "corpcategc");
            return (Criteria) this;
        }

        public Criteria andCorpcategcBetween(String value1, String value2) {
            addCriterion("CorpCateGC between", value1, value2, "corpcategc");
            return (Criteria) this;
        }

        public Criteria andCorpcategcNotBetween(String value1, String value2) {
            addCriterion("CorpCateGC not between", value1, value2, "corpcategc");
            return (Criteria) this;
        }

        public Criteria andCorpweburlSxwIsNull() {
            addCriterion("CorpWebUrl_Sxw is null");
            return (Criteria) this;
        }

        public Criteria andCorpweburlSxwIsNotNull() {
            addCriterion("CorpWebUrl_Sxw is not null");
            return (Criteria) this;
        }

        public Criteria andCorpweburlSxwEqualTo(String value) {
            addCriterion("CorpWebUrl_Sxw =", value, "corpweburlSxw");
            return (Criteria) this;
        }

        public Criteria andCorpweburlSxwNotEqualTo(String value) {
            addCriterion("CorpWebUrl_Sxw <>", value, "corpweburlSxw");
            return (Criteria) this;
        }

        public Criteria andCorpweburlSxwGreaterThan(String value) {
            addCriterion("CorpWebUrl_Sxw >", value, "corpweburlSxw");
            return (Criteria) this;
        }

        public Criteria andCorpweburlSxwGreaterThanOrEqualTo(String value) {
            addCriterion("CorpWebUrl_Sxw >=", value, "corpweburlSxw");
            return (Criteria) this;
        }

        public Criteria andCorpweburlSxwLessThan(String value) {
            addCriterion("CorpWebUrl_Sxw <", value, "corpweburlSxw");
            return (Criteria) this;
        }

        public Criteria andCorpweburlSxwLessThanOrEqualTo(String value) {
            addCriterion("CorpWebUrl_Sxw <=", value, "corpweburlSxw");
            return (Criteria) this;
        }

        public Criteria andCorpweburlSxwLike(String value) {
            addCriterion("CorpWebUrl_Sxw like", value, "corpweburlSxw");
            return (Criteria) this;
        }

        public Criteria andCorpweburlSxwNotLike(String value) {
            addCriterion("CorpWebUrl_Sxw not like", value, "corpweburlSxw");
            return (Criteria) this;
        }

        public Criteria andCorpweburlSxwIn(List<String> values) {
            addCriterion("CorpWebUrl_Sxw in", values, "corpweburlSxw");
            return (Criteria) this;
        }

        public Criteria andCorpweburlSxwNotIn(List<String> values) {
            addCriterion("CorpWebUrl_Sxw not in", values, "corpweburlSxw");
            return (Criteria) this;
        }

        public Criteria andCorpweburlSxwBetween(String value1, String value2) {
            addCriterion("CorpWebUrl_Sxw between", value1, value2, "corpweburlSxw");
            return (Criteria) this;
        }

        public Criteria andCorpweburlSxwNotBetween(String value1, String value2) {
            addCriterion("CorpWebUrl_Sxw not between", value1, value2, "corpweburlSxw");
            return (Criteria) this;
        }

        public Criteria andDbtimeIsNull() {
            addCriterion("dbtime is null");
            return (Criteria) this;
        }

        public Criteria andDbtimeIsNotNull() {
            addCriterion("dbtime is not null");
            return (Criteria) this;
        }

        public Criteria andDbtimeEqualTo(Date value) {
            addCriterion("dbtime =", value, "dbtime");
            return (Criteria) this;
        }

        public Criteria andDbtimeNotEqualTo(Date value) {
            addCriterion("dbtime <>", value, "dbtime");
            return (Criteria) this;
        }

        public Criteria andDbtimeGreaterThan(Date value) {
            addCriterion("dbtime >", value, "dbtime");
            return (Criteria) this;
        }

        public Criteria andDbtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dbtime >=", value, "dbtime");
            return (Criteria) this;
        }

        public Criteria andDbtimeLessThan(Date value) {
            addCriterion("dbtime <", value, "dbtime");
            return (Criteria) this;
        }

        public Criteria andDbtimeLessThanOrEqualTo(Date value) {
            addCriterion("dbtime <=", value, "dbtime");
            return (Criteria) this;
        }

        public Criteria andDbtimeIn(List<Date> values) {
            addCriterion("dbtime in", values, "dbtime");
            return (Criteria) this;
        }

        public Criteria andDbtimeNotIn(List<Date> values) {
            addCriterion("dbtime not in", values, "dbtime");
            return (Criteria) this;
        }

        public Criteria andDbtimeBetween(Date value1, Date value2) {
            addCriterion("dbtime between", value1, value2, "dbtime");
            return (Criteria) this;
        }

        public Criteria andDbtimeNotBetween(Date value1, Date value2) {
            addCriterion("dbtime not between", value1, value2, "dbtime");
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

        public Criteria andIswktIsNull() {
            addCriterion("iswkt is null");
            return (Criteria) this;
        }

        public Criteria andIswktIsNotNull() {
            addCriterion("iswkt is not null");
            return (Criteria) this;
        }

        public Criteria andIswktEqualTo(Integer value) {
            addCriterion("iswkt =", value, "iswkt");
            return (Criteria) this;
        }

        public Criteria andIswktNotEqualTo(Integer value) {
            addCriterion("iswkt <>", value, "iswkt");
            return (Criteria) this;
        }

        public Criteria andIswktGreaterThan(Integer value) {
            addCriterion("iswkt >", value, "iswkt");
            return (Criteria) this;
        }

        public Criteria andIswktGreaterThanOrEqualTo(Integer value) {
            addCriterion("iswkt >=", value, "iswkt");
            return (Criteria) this;
        }

        public Criteria andIswktLessThan(Integer value) {
            addCriterion("iswkt <", value, "iswkt");
            return (Criteria) this;
        }

        public Criteria andIswktLessThanOrEqualTo(Integer value) {
            addCriterion("iswkt <=", value, "iswkt");
            return (Criteria) this;
        }

        public Criteria andIswktIn(List<Integer> values) {
            addCriterion("iswkt in", values, "iswkt");
            return (Criteria) this;
        }

        public Criteria andIswktNotIn(List<Integer> values) {
            addCriterion("iswkt not in", values, "iswkt");
            return (Criteria) this;
        }

        public Criteria andIswktBetween(Integer value1, Integer value2) {
            addCriterion("iswkt between", value1, value2, "iswkt");
            return (Criteria) this;
        }

        public Criteria andIswktNotBetween(Integer value1, Integer value2) {
            addCriterion("iswkt not between", value1, value2, "iswkt");
            return (Criteria) this;
        }

        public Criteria andDatesourceIsNull() {
            addCriterion("Datesource is null");
            return (Criteria) this;
        }

        public Criteria andDatesourceIsNotNull() {
            addCriterion("Datesource is not null");
            return (Criteria) this;
        }

        public Criteria andDatesourceEqualTo(Integer value) {
            addCriterion("Datesource =", value, "datesource");
            return (Criteria) this;
        }

        public Criteria andDatesourceNotEqualTo(Integer value) {
            addCriterion("Datesource <>", value, "datesource");
            return (Criteria) this;
        }

        public Criteria andDatesourceGreaterThan(Integer value) {
            addCriterion("Datesource >", value, "datesource");
            return (Criteria) this;
        }

        public Criteria andDatesourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("Datesource >=", value, "datesource");
            return (Criteria) this;
        }

        public Criteria andDatesourceLessThan(Integer value) {
            addCriterion("Datesource <", value, "datesource");
            return (Criteria) this;
        }

        public Criteria andDatesourceLessThanOrEqualTo(Integer value) {
            addCriterion("Datesource <=", value, "datesource");
            return (Criteria) this;
        }

        public Criteria andDatesourceIn(List<Integer> values) {
            addCriterion("Datesource in", values, "datesource");
            return (Criteria) this;
        }

        public Criteria andDatesourceNotIn(List<Integer> values) {
            addCriterion("Datesource not in", values, "datesource");
            return (Criteria) this;
        }

        public Criteria andDatesourceBetween(Integer value1, Integer value2) {
            addCriterion("Datesource between", value1, value2, "datesource");
            return (Criteria) this;
        }

        public Criteria andDatesourceNotBetween(Integer value1, Integer value2) {
            addCriterion("Datesource not between", value1, value2, "datesource");
            return (Criteria) this;
        }

        public Criteria andDateidIsNull() {
            addCriterion("DateID is null");
            return (Criteria) this;
        }

        public Criteria andDateidIsNotNull() {
            addCriterion("DateID is not null");
            return (Criteria) this;
        }

        public Criteria andDateidEqualTo(Integer value) {
            addCriterion("DateID =", value, "dateid");
            return (Criteria) this;
        }

        public Criteria andDateidNotEqualTo(Integer value) {
            addCriterion("DateID <>", value, "dateid");
            return (Criteria) this;
        }

        public Criteria andDateidGreaterThan(Integer value) {
            addCriterion("DateID >", value, "dateid");
            return (Criteria) this;
        }

        public Criteria andDateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DateID >=", value, "dateid");
            return (Criteria) this;
        }

        public Criteria andDateidLessThan(Integer value) {
            addCriterion("DateID <", value, "dateid");
            return (Criteria) this;
        }

        public Criteria andDateidLessThanOrEqualTo(Integer value) {
            addCriterion("DateID <=", value, "dateid");
            return (Criteria) this;
        }

        public Criteria andDateidIn(List<Integer> values) {
            addCriterion("DateID in", values, "dateid");
            return (Criteria) this;
        }

        public Criteria andDateidNotIn(List<Integer> values) {
            addCriterion("DateID not in", values, "dateid");
            return (Criteria) this;
        }

        public Criteria andDateidBetween(Integer value1, Integer value2) {
            addCriterion("DateID between", value1, value2, "dateid");
            return (Criteria) this;
        }

        public Criteria andDateidNotBetween(Integer value1, Integer value2) {
            addCriterion("DateID not between", value1, value2, "dateid");
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