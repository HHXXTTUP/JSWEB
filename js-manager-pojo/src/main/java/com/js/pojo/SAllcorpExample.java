package com.js.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SAllcorpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SAllcorpExample() {
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

        public Criteria andCorpNameIsNull() {
            addCriterion("CorpName is null");
            return (Criteria) this;
        }

        public Criteria andCorpNameIsNotNull() {
            addCriterion("CorpName is not null");
            return (Criteria) this;
        }

        public Criteria andCorpNameEqualTo(String value) {
            addCriterion("CorpName =", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotEqualTo(String value) {
            addCriterion("CorpName <>", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameGreaterThan(String value) {
            addCriterion("CorpName >", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameGreaterThanOrEqualTo(String value) {
            addCriterion("CorpName >=", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameLessThan(String value) {
            addCriterion("CorpName <", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameLessThanOrEqualTo(String value) {
            addCriterion("CorpName <=", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameLike(String value) {
            addCriterion("CorpName like", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotLike(String value) {
            addCriterion("CorpName not like", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameIn(List<String> values) {
            addCriterion("CorpName in", values, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotIn(List<String> values) {
            addCriterion("CorpName not in", values, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameBetween(String value1, String value2) {
            addCriterion("CorpName between", value1, value2, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotBetween(String value1, String value2) {
            addCriterion("CorpName not between", value1, value2, "corpName");
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

        public Criteria andCorpAutoIDIsNull() {
            addCriterion("CorpAutoID is null");
            return (Criteria) this;
        }

        public Criteria andCorpAutoIDIsNotNull() {
            addCriterion("CorpAutoID is not null");
            return (Criteria) this;
        }

        public Criteria andCorpAutoIDEqualTo(Integer value) {
            addCriterion("CorpAutoID =", value, "corpAutoID");
            return (Criteria) this;
        }

        public Criteria andCorpAutoIDNotEqualTo(Integer value) {
            addCriterion("CorpAutoID <>", value, "corpAutoID");
            return (Criteria) this;
        }

        public Criteria andCorpAutoIDGreaterThan(Integer value) {
            addCriterion("CorpAutoID >", value, "corpAutoID");
            return (Criteria) this;
        }

        public Criteria andCorpAutoIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("CorpAutoID >=", value, "corpAutoID");
            return (Criteria) this;
        }

        public Criteria andCorpAutoIDLessThan(Integer value) {
            addCriterion("CorpAutoID <", value, "corpAutoID");
            return (Criteria) this;
        }

        public Criteria andCorpAutoIDLessThanOrEqualTo(Integer value) {
            addCriterion("CorpAutoID <=", value, "corpAutoID");
            return (Criteria) this;
        }

        public Criteria andCorpAutoIDIn(List<Integer> values) {
            addCriterion("CorpAutoID in", values, "corpAutoID");
            return (Criteria) this;
        }

        public Criteria andCorpAutoIDNotIn(List<Integer> values) {
            addCriterion("CorpAutoID not in", values, "corpAutoID");
            return (Criteria) this;
        }

        public Criteria andCorpAutoIDBetween(Integer value1, Integer value2) {
            addCriterion("CorpAutoID between", value1, value2, "corpAutoID");
            return (Criteria) this;
        }

        public Criteria andCorpAutoIDNotBetween(Integer value1, Integer value2) {
            addCriterion("CorpAutoID not between", value1, value2, "corpAutoID");
            return (Criteria) this;
        }

        public Criteria andCorpIDIsNull() {
            addCriterion("CorpID is null");
            return (Criteria) this;
        }

        public Criteria andCorpIDIsNotNull() {
            addCriterion("CorpID is not null");
            return (Criteria) this;
        }

        public Criteria andCorpIDEqualTo(Integer value) {
            addCriterion("CorpID =", value, "corpID");
            return (Criteria) this;
        }

        public Criteria andCorpIDNotEqualTo(Integer value) {
            addCriterion("CorpID <>", value, "corpID");
            return (Criteria) this;
        }

        public Criteria andCorpIDGreaterThan(Integer value) {
            addCriterion("CorpID >", value, "corpID");
            return (Criteria) this;
        }

        public Criteria andCorpIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("CorpID >=", value, "corpID");
            return (Criteria) this;
        }

        public Criteria andCorpIDLessThan(Integer value) {
            addCriterion("CorpID <", value, "corpID");
            return (Criteria) this;
        }

        public Criteria andCorpIDLessThanOrEqualTo(Integer value) {
            addCriterion("CorpID <=", value, "corpID");
            return (Criteria) this;
        }

        public Criteria andCorpIDIn(List<Integer> values) {
            addCriterion("CorpID in", values, "corpID");
            return (Criteria) this;
        }

        public Criteria andCorpIDNotIn(List<Integer> values) {
            addCriterion("CorpID not in", values, "corpID");
            return (Criteria) this;
        }

        public Criteria andCorpIDBetween(Integer value1, Integer value2) {
            addCriterion("CorpID between", value1, value2, "corpID");
            return (Criteria) this;
        }

        public Criteria andCorpIDNotBetween(Integer value1, Integer value2) {
            addCriterion("CorpID not between", value1, value2, "corpID");
            return (Criteria) this;
        }

        public Criteria andLinkManIsNull() {
            addCriterion("LinkMan is null");
            return (Criteria) this;
        }

        public Criteria andLinkManIsNotNull() {
            addCriterion("LinkMan is not null");
            return (Criteria) this;
        }

        public Criteria andLinkManEqualTo(String value) {
            addCriterion("LinkMan =", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotEqualTo(String value) {
            addCriterion("LinkMan <>", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManGreaterThan(String value) {
            addCriterion("LinkMan >", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManGreaterThanOrEqualTo(String value) {
            addCriterion("LinkMan >=", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManLessThan(String value) {
            addCriterion("LinkMan <", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManLessThanOrEqualTo(String value) {
            addCriterion("LinkMan <=", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManLike(String value) {
            addCriterion("LinkMan like", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotLike(String value) {
            addCriterion("LinkMan not like", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManIn(List<String> values) {
            addCriterion("LinkMan in", values, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotIn(List<String> values) {
            addCriterion("LinkMan not in", values, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManBetween(String value1, String value2) {
            addCriterion("LinkMan between", value1, value2, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotBetween(String value1, String value2) {
            addCriterion("LinkMan not between", value1, value2, "linkMan");
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

        public Criteria andCityIsNull() {
            addCriterion("City is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("City is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("City =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("City <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("City >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("City >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("City <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("City <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("City like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("City not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("City in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("City not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("City between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("City not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andJobCateIsNull() {
            addCriterion("JobCate is null");
            return (Criteria) this;
        }

        public Criteria andJobCateIsNotNull() {
            addCriterion("JobCate is not null");
            return (Criteria) this;
        }

        public Criteria andJobCateEqualTo(String value) {
            addCriterion("JobCate =", value, "jobCate");
            return (Criteria) this;
        }

        public Criteria andJobCateNotEqualTo(String value) {
            addCriterion("JobCate <>", value, "jobCate");
            return (Criteria) this;
        }

        public Criteria andJobCateGreaterThan(String value) {
            addCriterion("JobCate >", value, "jobCate");
            return (Criteria) this;
        }

        public Criteria andJobCateGreaterThanOrEqualTo(String value) {
            addCriterion("JobCate >=", value, "jobCate");
            return (Criteria) this;
        }

        public Criteria andJobCateLessThan(String value) {
            addCriterion("JobCate <", value, "jobCate");
            return (Criteria) this;
        }

        public Criteria andJobCateLessThanOrEqualTo(String value) {
            addCriterion("JobCate <=", value, "jobCate");
            return (Criteria) this;
        }

        public Criteria andJobCateLike(String value) {
            addCriterion("JobCate like", value, "jobCate");
            return (Criteria) this;
        }

        public Criteria andJobCateNotLike(String value) {
            addCriterion("JobCate not like", value, "jobCate");
            return (Criteria) this;
        }

        public Criteria andJobCateIn(List<String> values) {
            addCriterion("JobCate in", values, "jobCate");
            return (Criteria) this;
        }

        public Criteria andJobCateNotIn(List<String> values) {
            addCriterion("JobCate not in", values, "jobCate");
            return (Criteria) this;
        }

        public Criteria andJobCateBetween(String value1, String value2) {
            addCriterion("JobCate between", value1, value2, "jobCate");
            return (Criteria) this;
        }

        public Criteria andJobCateNotBetween(String value1, String value2) {
            addCriterion("JobCate not between", value1, value2, "jobCate");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("Job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("Job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("Job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("Job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("Job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("Job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("Job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("Job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("Job like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("Job not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("Job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("Job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("Job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("Job not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("Phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("Phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("Phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("Phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("Phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("Phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("Phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("Phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("Phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("Phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("Phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("Phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("Phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("Fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("Fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("Fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("Fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("Fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("Fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("Fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("Fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("Fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("Fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("Fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("Fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("Fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("Fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("Mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("Mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("Mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("Mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("Mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("Mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("Mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("Mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("Mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("Mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("Mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("Mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("Mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("Mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
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

        public Criteria andPostIsNull() {
            addCriterion("Post is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("Post is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("Post =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("Post <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("Post >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("Post >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("Post <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("Post <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("Post like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("Post not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("Post in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("Post not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("Post between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("Post not between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andIsLuofeiIsNull() {
            addCriterion("IsLuofei is null");
            return (Criteria) this;
        }

        public Criteria andIsLuofeiIsNotNull() {
            addCriterion("IsLuofei is not null");
            return (Criteria) this;
        }

        public Criteria andIsLuofeiEqualTo(Integer value) {
            addCriterion("IsLuofei =", value, "isLuofei");
            return (Criteria) this;
        }

        public Criteria andIsLuofeiNotEqualTo(Integer value) {
            addCriterion("IsLuofei <>", value, "isLuofei");
            return (Criteria) this;
        }

        public Criteria andIsLuofeiGreaterThan(Integer value) {
            addCriterion("IsLuofei >", value, "isLuofei");
            return (Criteria) this;
        }

        public Criteria andIsLuofeiGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsLuofei >=", value, "isLuofei");
            return (Criteria) this;
        }

        public Criteria andIsLuofeiLessThan(Integer value) {
            addCriterion("IsLuofei <", value, "isLuofei");
            return (Criteria) this;
        }

        public Criteria andIsLuofeiLessThanOrEqualTo(Integer value) {
            addCriterion("IsLuofei <=", value, "isLuofei");
            return (Criteria) this;
        }

        public Criteria andIsLuofeiIn(List<Integer> values) {
            addCriterion("IsLuofei in", values, "isLuofei");
            return (Criteria) this;
        }

        public Criteria andIsLuofeiNotIn(List<Integer> values) {
            addCriterion("IsLuofei not in", values, "isLuofei");
            return (Criteria) this;
        }

        public Criteria andIsLuofeiBetween(Integer value1, Integer value2) {
            addCriterion("IsLuofei between", value1, value2, "isLuofei");
            return (Criteria) this;
        }

        public Criteria andIsLuofeiNotBetween(Integer value1, Integer value2) {
            addCriterion("IsLuofei not between", value1, value2, "isLuofei");
            return (Criteria) this;
        }

        public Criteria andIsFzddIsNull() {
            addCriterion("IsFzdd is null");
            return (Criteria) this;
        }

        public Criteria andIsFzddIsNotNull() {
            addCriterion("IsFzdd is not null");
            return (Criteria) this;
        }

        public Criteria andIsFzddEqualTo(Integer value) {
            addCriterion("IsFzdd =", value, "isFzdd");
            return (Criteria) this;
        }

        public Criteria andIsFzddNotEqualTo(Integer value) {
            addCriterion("IsFzdd <>", value, "isFzdd");
            return (Criteria) this;
        }

        public Criteria andIsFzddGreaterThan(Integer value) {
            addCriterion("IsFzdd >", value, "isFzdd");
            return (Criteria) this;
        }

        public Criteria andIsFzddGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsFzdd >=", value, "isFzdd");
            return (Criteria) this;
        }

        public Criteria andIsFzddLessThan(Integer value) {
            addCriterion("IsFzdd <", value, "isFzdd");
            return (Criteria) this;
        }

        public Criteria andIsFzddLessThanOrEqualTo(Integer value) {
            addCriterion("IsFzdd <=", value, "isFzdd");
            return (Criteria) this;
        }

        public Criteria andIsFzddIn(List<Integer> values) {
            addCriterion("IsFzdd in", values, "isFzdd");
            return (Criteria) this;
        }

        public Criteria andIsFzddNotIn(List<Integer> values) {
            addCriterion("IsFzdd not in", values, "isFzdd");
            return (Criteria) this;
        }

        public Criteria andIsFzddBetween(Integer value1, Integer value2) {
            addCriterion("IsFzdd between", value1, value2, "isFzdd");
            return (Criteria) this;
        }

        public Criteria andIsFzddNotBetween(Integer value1, Integer value2) {
            addCriterion("IsFzdd not between", value1, value2, "isFzdd");
            return (Criteria) this;
        }

        public Criteria andIsZSJLBIsNull() {
            addCriterion("IsZSJLB is null");
            return (Criteria) this;
        }

        public Criteria andIsZSJLBIsNotNull() {
            addCriterion("IsZSJLB is not null");
            return (Criteria) this;
        }

        public Criteria andIsZSJLBEqualTo(Integer value) {
            addCriterion("IsZSJLB =", value, "isZSJLB");
            return (Criteria) this;
        }

        public Criteria andIsZSJLBNotEqualTo(Integer value) {
            addCriterion("IsZSJLB <>", value, "isZSJLB");
            return (Criteria) this;
        }

        public Criteria andIsZSJLBGreaterThan(Integer value) {
            addCriterion("IsZSJLB >", value, "isZSJLB");
            return (Criteria) this;
        }

        public Criteria andIsZSJLBGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsZSJLB >=", value, "isZSJLB");
            return (Criteria) this;
        }

        public Criteria andIsZSJLBLessThan(Integer value) {
            addCriterion("IsZSJLB <", value, "isZSJLB");
            return (Criteria) this;
        }

        public Criteria andIsZSJLBLessThanOrEqualTo(Integer value) {
            addCriterion("IsZSJLB <=", value, "isZSJLB");
            return (Criteria) this;
        }

        public Criteria andIsZSJLBIn(List<Integer> values) {
            addCriterion("IsZSJLB in", values, "isZSJLB");
            return (Criteria) this;
        }

        public Criteria andIsZSJLBNotIn(List<Integer> values) {
            addCriterion("IsZSJLB not in", values, "isZSJLB");
            return (Criteria) this;
        }

        public Criteria andIsZSJLBBetween(Integer value1, Integer value2) {
            addCriterion("IsZSJLB between", value1, value2, "isZSJLB");
            return (Criteria) this;
        }

        public Criteria andIsZSJLBNotBetween(Integer value1, Integer value2) {
            addCriterion("IsZSJLB not between", value1, value2, "isZSJLB");
            return (Criteria) this;
        }

        public Criteria andZSJLB_KDIsNull() {
            addCriterion("ZSJLB_KD is null");
            return (Criteria) this;
        }

        public Criteria andZSJLB_KDIsNotNull() {
            addCriterion("ZSJLB_KD is not null");
            return (Criteria) this;
        }

        public Criteria andZSJLB_KDEqualTo(String value) {
            addCriterion("ZSJLB_KD =", value, "ZSJLB_KD");
            return (Criteria) this;
        }

        public Criteria andZSJLB_KDNotEqualTo(String value) {
            addCriterion("ZSJLB_KD <>", value, "ZSJLB_KD");
            return (Criteria) this;
        }

        public Criteria andZSJLB_KDGreaterThan(String value) {
            addCriterion("ZSJLB_KD >", value, "ZSJLB_KD");
            return (Criteria) this;
        }

        public Criteria andZSJLB_KDGreaterThanOrEqualTo(String value) {
            addCriterion("ZSJLB_KD >=", value, "ZSJLB_KD");
            return (Criteria) this;
        }

        public Criteria andZSJLB_KDLessThan(String value) {
            addCriterion("ZSJLB_KD <", value, "ZSJLB_KD");
            return (Criteria) this;
        }

        public Criteria andZSJLB_KDLessThanOrEqualTo(String value) {
            addCriterion("ZSJLB_KD <=", value, "ZSJLB_KD");
            return (Criteria) this;
        }

        public Criteria andZSJLB_KDLike(String value) {
            addCriterion("ZSJLB_KD like", value, "ZSJLB_KD");
            return (Criteria) this;
        }

        public Criteria andZSJLB_KDNotLike(String value) {
            addCriterion("ZSJLB_KD not like", value, "ZSJLB_KD");
            return (Criteria) this;
        }

        public Criteria andZSJLB_KDIn(List<String> values) {
            addCriterion("ZSJLB_KD in", values, "ZSJLB_KD");
            return (Criteria) this;
        }

        public Criteria andZSJLB_KDNotIn(List<String> values) {
            addCriterion("ZSJLB_KD not in", values, "ZSJLB_KD");
            return (Criteria) this;
        }

        public Criteria andZSJLB_KDBetween(String value1, String value2) {
            addCriterion("ZSJLB_KD between", value1, value2, "ZSJLB_KD");
            return (Criteria) this;
        }

        public Criteria andZSJLB_KDNotBetween(String value1, String value2) {
            addCriterion("ZSJLB_KD not between", value1, value2, "ZSJLB_KD");
            return (Criteria) this;
        }

        public Criteria andZSJLB_JiNameIsNull() {
            addCriterion("ZSJLB_JiName is null");
            return (Criteria) this;
        }

        public Criteria andZSJLB_JiNameIsNotNull() {
            addCriterion("ZSJLB_JiName is not null");
            return (Criteria) this;
        }

        public Criteria andZSJLB_JiNameEqualTo(Integer value) {
            addCriterion("ZSJLB_JiName =", value, "ZSJLB_JiName");
            return (Criteria) this;
        }

        public Criteria andZSJLB_JiNameNotEqualTo(Integer value) {
            addCriterion("ZSJLB_JiName <>", value, "ZSJLB_JiName");
            return (Criteria) this;
        }

        public Criteria andZSJLB_JiNameGreaterThan(Integer value) {
            addCriterion("ZSJLB_JiName >", value, "ZSJLB_JiName");
            return (Criteria) this;
        }

        public Criteria andZSJLB_JiNameGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZSJLB_JiName >=", value, "ZSJLB_JiName");
            return (Criteria) this;
        }

        public Criteria andZSJLB_JiNameLessThan(Integer value) {
            addCriterion("ZSJLB_JiName <", value, "ZSJLB_JiName");
            return (Criteria) this;
        }

        public Criteria andZSJLB_JiNameLessThanOrEqualTo(Integer value) {
            addCriterion("ZSJLB_JiName <=", value, "ZSJLB_JiName");
            return (Criteria) this;
        }

        public Criteria andZSJLB_JiNameIn(List<Integer> values) {
            addCriterion("ZSJLB_JiName in", values, "ZSJLB_JiName");
            return (Criteria) this;
        }

        public Criteria andZSJLB_JiNameNotIn(List<Integer> values) {
            addCriterion("ZSJLB_JiName not in", values, "ZSJLB_JiName");
            return (Criteria) this;
        }

        public Criteria andZSJLB_JiNameBetween(Integer value1, Integer value2) {
            addCriterion("ZSJLB_JiName between", value1, value2, "ZSJLB_JiName");
            return (Criteria) this;
        }

        public Criteria andZSJLB_JiNameNotBetween(Integer value1, Integer value2) {
            addCriterion("ZSJLB_JiName not between", value1, value2, "ZSJLB_JiName");
            return (Criteria) this;
        }

        public Criteria andZSJLB_JiNumIsNull() {
            addCriterion("ZSJLB_JiNum is null");
            return (Criteria) this;
        }

        public Criteria andZSJLB_JiNumIsNotNull() {
            addCriterion("ZSJLB_JiNum is not null");
            return (Criteria) this;
        }

        public Criteria andZSJLB_JiNumEqualTo(Integer value) {
            addCriterion("ZSJLB_JiNum =", value, "ZSJLB_JiNum");
            return (Criteria) this;
        }

        public Criteria andZSJLB_JiNumNotEqualTo(Integer value) {
            addCriterion("ZSJLB_JiNum <>", value, "ZSJLB_JiNum");
            return (Criteria) this;
        }

        public Criteria andZSJLB_JiNumGreaterThan(Integer value) {
            addCriterion("ZSJLB_JiNum >", value, "ZSJLB_JiNum");
            return (Criteria) this;
        }

        public Criteria andZSJLB_JiNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZSJLB_JiNum >=", value, "ZSJLB_JiNum");
            return (Criteria) this;
        }

        public Criteria andZSJLB_JiNumLessThan(Integer value) {
            addCriterion("ZSJLB_JiNum <", value, "ZSJLB_JiNum");
            return (Criteria) this;
        }

        public Criteria andZSJLB_JiNumLessThanOrEqualTo(Integer value) {
            addCriterion("ZSJLB_JiNum <=", value, "ZSJLB_JiNum");
            return (Criteria) this;
        }

        public Criteria andZSJLB_JiNumIn(List<Integer> values) {
            addCriterion("ZSJLB_JiNum in", values, "ZSJLB_JiNum");
            return (Criteria) this;
        }

        public Criteria andZSJLB_JiNumNotIn(List<Integer> values) {
            addCriterion("ZSJLB_JiNum not in", values, "ZSJLB_JiNum");
            return (Criteria) this;
        }

        public Criteria andZSJLB_JiNumBetween(Integer value1, Integer value2) {
            addCriterion("ZSJLB_JiNum between", value1, value2, "ZSJLB_JiNum");
            return (Criteria) this;
        }

        public Criteria andZSJLB_JiNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ZSJLB_JiNum not between", value1, value2, "ZSJLB_JiNum");
            return (Criteria) this;
        }

        public Criteria andIsNewsSmsIsNull() {
            addCriterion("IsNewsSms is null");
            return (Criteria) this;
        }

        public Criteria andIsNewsSmsIsNotNull() {
            addCriterion("IsNewsSms is not null");
            return (Criteria) this;
        }

        public Criteria andIsNewsSmsEqualTo(Integer value) {
            addCriterion("IsNewsSms =", value, "isNewsSms");
            return (Criteria) this;
        }

        public Criteria andIsNewsSmsNotEqualTo(Integer value) {
            addCriterion("IsNewsSms <>", value, "isNewsSms");
            return (Criteria) this;
        }

        public Criteria andIsNewsSmsGreaterThan(Integer value) {
            addCriterion("IsNewsSms >", value, "isNewsSms");
            return (Criteria) this;
        }

        public Criteria andIsNewsSmsGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsNewsSms >=", value, "isNewsSms");
            return (Criteria) this;
        }

        public Criteria andIsNewsSmsLessThan(Integer value) {
            addCriterion("IsNewsSms <", value, "isNewsSms");
            return (Criteria) this;
        }

        public Criteria andIsNewsSmsLessThanOrEqualTo(Integer value) {
            addCriterion("IsNewsSms <=", value, "isNewsSms");
            return (Criteria) this;
        }

        public Criteria andIsNewsSmsIn(List<Integer> values) {
            addCriterion("IsNewsSms in", values, "isNewsSms");
            return (Criteria) this;
        }

        public Criteria andIsNewsSmsNotIn(List<Integer> values) {
            addCriterion("IsNewsSms not in", values, "isNewsSms");
            return (Criteria) this;
        }

        public Criteria andIsNewsSmsBetween(Integer value1, Integer value2) {
            addCriterion("IsNewsSms between", value1, value2, "isNewsSms");
            return (Criteria) this;
        }

        public Criteria andIsNewsSmsNotBetween(Integer value1, Integer value2) {
            addCriterion("IsNewsSms not between", value1, value2, "isNewsSms");
            return (Criteria) this;
        }

        public Criteria andIsNewsEmailFJIsNull() {
            addCriterion("IsNewsEmailFJ is null");
            return (Criteria) this;
        }

        public Criteria andIsNewsEmailFJIsNotNull() {
            addCriterion("IsNewsEmailFJ is not null");
            return (Criteria) this;
        }

        public Criteria andIsNewsEmailFJEqualTo(Integer value) {
            addCriterion("IsNewsEmailFJ =", value, "isNewsEmailFJ");
            return (Criteria) this;
        }

        public Criteria andIsNewsEmailFJNotEqualTo(Integer value) {
            addCriterion("IsNewsEmailFJ <>", value, "isNewsEmailFJ");
            return (Criteria) this;
        }

        public Criteria andIsNewsEmailFJGreaterThan(Integer value) {
            addCriterion("IsNewsEmailFJ >", value, "isNewsEmailFJ");
            return (Criteria) this;
        }

        public Criteria andIsNewsEmailFJGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsNewsEmailFJ >=", value, "isNewsEmailFJ");
            return (Criteria) this;
        }

        public Criteria andIsNewsEmailFJLessThan(Integer value) {
            addCriterion("IsNewsEmailFJ <", value, "isNewsEmailFJ");
            return (Criteria) this;
        }

        public Criteria andIsNewsEmailFJLessThanOrEqualTo(Integer value) {
            addCriterion("IsNewsEmailFJ <=", value, "isNewsEmailFJ");
            return (Criteria) this;
        }

        public Criteria andIsNewsEmailFJIn(List<Integer> values) {
            addCriterion("IsNewsEmailFJ in", values, "isNewsEmailFJ");
            return (Criteria) this;
        }

        public Criteria andIsNewsEmailFJNotIn(List<Integer> values) {
            addCriterion("IsNewsEmailFJ not in", values, "isNewsEmailFJ");
            return (Criteria) this;
        }

        public Criteria andIsNewsEmailFJBetween(Integer value1, Integer value2) {
            addCriterion("IsNewsEmailFJ between", value1, value2, "isNewsEmailFJ");
            return (Criteria) this;
        }

        public Criteria andIsNewsEmailFJNotBetween(Integer value1, Integer value2) {
            addCriterion("IsNewsEmailFJ not between", value1, value2, "isNewsEmailFJ");
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

        public Criteria andEditDateIsNull() {
            addCriterion("EditDate is null");
            return (Criteria) this;
        }

        public Criteria andEditDateIsNotNull() {
            addCriterion("EditDate is not null");
            return (Criteria) this;
        }

        public Criteria andEditDateEqualTo(Date value) {
            addCriterion("EditDate =", value, "editDate");
            return (Criteria) this;
        }

        public Criteria andEditDateNotEqualTo(Date value) {
            addCriterion("EditDate <>", value, "editDate");
            return (Criteria) this;
        }

        public Criteria andEditDateGreaterThan(Date value) {
            addCriterion("EditDate >", value, "editDate");
            return (Criteria) this;
        }

        public Criteria andEditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("EditDate >=", value, "editDate");
            return (Criteria) this;
        }

        public Criteria andEditDateLessThan(Date value) {
            addCriterion("EditDate <", value, "editDate");
            return (Criteria) this;
        }

        public Criteria andEditDateLessThanOrEqualTo(Date value) {
            addCriterion("EditDate <=", value, "editDate");
            return (Criteria) this;
        }

        public Criteria andEditDateIn(List<Date> values) {
            addCriterion("EditDate in", values, "editDate");
            return (Criteria) this;
        }

        public Criteria andEditDateNotIn(List<Date> values) {
            addCriterion("EditDate not in", values, "editDate");
            return (Criteria) this;
        }

        public Criteria andEditDateBetween(Date value1, Date value2) {
            addCriterion("EditDate between", value1, value2, "editDate");
            return (Criteria) this;
        }

        public Criteria andEditDateNotBetween(Date value1, Date value2) {
            addCriterion("EditDate not between", value1, value2, "editDate");
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

        public Criteria andIsZhuIsNull() {
            addCriterion("IsZhu is null");
            return (Criteria) this;
        }

        public Criteria andIsZhuIsNotNull() {
            addCriterion("IsZhu is not null");
            return (Criteria) this;
        }

        public Criteria andIsZhuEqualTo(Integer value) {
            addCriterion("IsZhu =", value, "isZhu");
            return (Criteria) this;
        }

        public Criteria andIsZhuNotEqualTo(Integer value) {
            addCriterion("IsZhu <>", value, "isZhu");
            return (Criteria) this;
        }

        public Criteria andIsZhuGreaterThan(Integer value) {
            addCriterion("IsZhu >", value, "isZhu");
            return (Criteria) this;
        }

        public Criteria andIsZhuGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsZhu >=", value, "isZhu");
            return (Criteria) this;
        }

        public Criteria andIsZhuLessThan(Integer value) {
            addCriterion("IsZhu <", value, "isZhu");
            return (Criteria) this;
        }

        public Criteria andIsZhuLessThanOrEqualTo(Integer value) {
            addCriterion("IsZhu <=", value, "isZhu");
            return (Criteria) this;
        }

        public Criteria andIsZhuIn(List<Integer> values) {
            addCriterion("IsZhu in", values, "isZhu");
            return (Criteria) this;
        }

        public Criteria andIsZhuNotIn(List<Integer> values) {
            addCriterion("IsZhu not in", values, "isZhu");
            return (Criteria) this;
        }

        public Criteria andIsZhuBetween(Integer value1, Integer value2) {
            addCriterion("IsZhu between", value1, value2, "isZhu");
            return (Criteria) this;
        }

        public Criteria andIsZhuNotBetween(Integer value1, Integer value2) {
            addCriterion("IsZhu not between", value1, value2, "isZhu");
            return (Criteria) this;
        }

        public Criteria andIsFibreIsNull() {
            addCriterion("IsFibre is null");
            return (Criteria) this;
        }

        public Criteria andIsFibreIsNotNull() {
            addCriterion("IsFibre is not null");
            return (Criteria) this;
        }

        public Criteria andIsFibreEqualTo(Integer value) {
            addCriterion("IsFibre =", value, "isFibre");
            return (Criteria) this;
        }

        public Criteria andIsFibreNotEqualTo(Integer value) {
            addCriterion("IsFibre <>", value, "isFibre");
            return (Criteria) this;
        }

        public Criteria andIsFibreGreaterThan(Integer value) {
            addCriterion("IsFibre >", value, "isFibre");
            return (Criteria) this;
        }

        public Criteria andIsFibreGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsFibre >=", value, "isFibre");
            return (Criteria) this;
        }

        public Criteria andIsFibreLessThan(Integer value) {
            addCriterion("IsFibre <", value, "isFibre");
            return (Criteria) this;
        }

        public Criteria andIsFibreLessThanOrEqualTo(Integer value) {
            addCriterion("IsFibre <=", value, "isFibre");
            return (Criteria) this;
        }

        public Criteria andIsFibreIn(List<Integer> values) {
            addCriterion("IsFibre in", values, "isFibre");
            return (Criteria) this;
        }

        public Criteria andIsFibreNotIn(List<Integer> values) {
            addCriterion("IsFibre not in", values, "isFibre");
            return (Criteria) this;
        }

        public Criteria andIsFibreBetween(Integer value1, Integer value2) {
            addCriterion("IsFibre between", value1, value2, "isFibre");
            return (Criteria) this;
        }

        public Criteria andIsFibreNotBetween(Integer value1, Integer value2) {
            addCriterion("IsFibre not between", value1, value2, "isFibre");
            return (Criteria) this;
        }

        public Criteria andStatus2IsNull() {
            addCriterion("Status2 is null");
            return (Criteria) this;
        }

        public Criteria andStatus2IsNotNull() {
            addCriterion("Status2 is not null");
            return (Criteria) this;
        }

        public Criteria andStatus2EqualTo(String value) {
            addCriterion("Status2 =", value, "status2");
            return (Criteria) this;
        }

        public Criteria andStatus2NotEqualTo(String value) {
            addCriterion("Status2 <>", value, "status2");
            return (Criteria) this;
        }

        public Criteria andStatus2GreaterThan(String value) {
            addCriterion("Status2 >", value, "status2");
            return (Criteria) this;
        }

        public Criteria andStatus2GreaterThanOrEqualTo(String value) {
            addCriterion("Status2 >=", value, "status2");
            return (Criteria) this;
        }

        public Criteria andStatus2LessThan(String value) {
            addCriterion("Status2 <", value, "status2");
            return (Criteria) this;
        }

        public Criteria andStatus2LessThanOrEqualTo(String value) {
            addCriterion("Status2 <=", value, "status2");
            return (Criteria) this;
        }

        public Criteria andStatus2Like(String value) {
            addCriterion("Status2 like", value, "status2");
            return (Criteria) this;
        }

        public Criteria andStatus2NotLike(String value) {
            addCriterion("Status2 not like", value, "status2");
            return (Criteria) this;
        }

        public Criteria andStatus2In(List<String> values) {
            addCriterion("Status2 in", values, "status2");
            return (Criteria) this;
        }

        public Criteria andStatus2NotIn(List<String> values) {
            addCriterion("Status2 not in", values, "status2");
            return (Criteria) this;
        }

        public Criteria andStatus2Between(String value1, String value2) {
            addCriterion("Status2 between", value1, value2, "status2");
            return (Criteria) this;
        }

        public Criteria andStatus2NotBetween(String value1, String value2) {
            addCriterion("Status2 not between", value1, value2, "status2");
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

        public Criteria andIsZGSXIsNull() {
            addCriterion("IsZGSX is null");
            return (Criteria) this;
        }

        public Criteria andIsZGSXIsNotNull() {
            addCriterion("IsZGSX is not null");
            return (Criteria) this;
        }

        public Criteria andIsZGSXEqualTo(Integer value) {
            addCriterion("IsZGSX =", value, "isZGSX");
            return (Criteria) this;
        }

        public Criteria andIsZGSXNotEqualTo(Integer value) {
            addCriterion("IsZGSX <>", value, "isZGSX");
            return (Criteria) this;
        }

        public Criteria andIsZGSXGreaterThan(Integer value) {
            addCriterion("IsZGSX >", value, "isZGSX");
            return (Criteria) this;
        }

        public Criteria andIsZGSXGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsZGSX >=", value, "isZGSX");
            return (Criteria) this;
        }

        public Criteria andIsZGSXLessThan(Integer value) {
            addCriterion("IsZGSX <", value, "isZGSX");
            return (Criteria) this;
        }

        public Criteria andIsZGSXLessThanOrEqualTo(Integer value) {
            addCriterion("IsZGSX <=", value, "isZGSX");
            return (Criteria) this;
        }

        public Criteria andIsZGSXIn(List<Integer> values) {
            addCriterion("IsZGSX in", values, "isZGSX");
            return (Criteria) this;
        }

        public Criteria andIsZGSXNotIn(List<Integer> values) {
            addCriterion("IsZGSX not in", values, "isZGSX");
            return (Criteria) this;
        }

        public Criteria andIsZGSXBetween(Integer value1, Integer value2) {
            addCriterion("IsZGSX between", value1, value2, "isZGSX");
            return (Criteria) this;
        }

        public Criteria andIsZGSXNotBetween(Integer value1, Integer value2) {
            addCriterion("IsZGSX not between", value1, value2, "isZGSX");
            return (Criteria) this;
        }

        public Criteria andZgSx_FYIsNull() {
            addCriterion("ZgSx_FY is null");
            return (Criteria) this;
        }

        public Criteria andZgSx_FYIsNotNull() {
            addCriterion("ZgSx_FY is not null");
            return (Criteria) this;
        }

        public Criteria andZgSx_FYEqualTo(String value) {
            addCriterion("ZgSx_FY =", value, "zgSx_FY");
            return (Criteria) this;
        }

        public Criteria andZgSx_FYNotEqualTo(String value) {
            addCriterion("ZgSx_FY <>", value, "zgSx_FY");
            return (Criteria) this;
        }

        public Criteria andZgSx_FYGreaterThan(String value) {
            addCriterion("ZgSx_FY >", value, "zgSx_FY");
            return (Criteria) this;
        }

        public Criteria andZgSx_FYGreaterThanOrEqualTo(String value) {
            addCriterion("ZgSx_FY >=", value, "zgSx_FY");
            return (Criteria) this;
        }

        public Criteria andZgSx_FYLessThan(String value) {
            addCriterion("ZgSx_FY <", value, "zgSx_FY");
            return (Criteria) this;
        }

        public Criteria andZgSx_FYLessThanOrEqualTo(String value) {
            addCriterion("ZgSx_FY <=", value, "zgSx_FY");
            return (Criteria) this;
        }

        public Criteria andZgSx_FYLike(String value) {
            addCriterion("ZgSx_FY like", value, "zgSx_FY");
            return (Criteria) this;
        }

        public Criteria andZgSx_FYNotLike(String value) {
            addCriterion("ZgSx_FY not like", value, "zgSx_FY");
            return (Criteria) this;
        }

        public Criteria andZgSx_FYIn(List<String> values) {
            addCriterion("ZgSx_FY in", values, "zgSx_FY");
            return (Criteria) this;
        }

        public Criteria andZgSx_FYNotIn(List<String> values) {
            addCriterion("ZgSx_FY not in", values, "zgSx_FY");
            return (Criteria) this;
        }

        public Criteria andZgSx_FYBetween(String value1, String value2) {
            addCriterion("ZgSx_FY between", value1, value2, "zgSx_FY");
            return (Criteria) this;
        }

        public Criteria andZgSx_FYNotBetween(String value1, String value2) {
            addCriterion("ZgSx_FY not between", value1, value2, "zgSx_FY");
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