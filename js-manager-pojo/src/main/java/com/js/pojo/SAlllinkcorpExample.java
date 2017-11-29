package com.js.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SAlllinkcorpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SAlllinkcorpExample() {
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

        public Criteria andContPhoneIsNull() {
            addCriterion("ContPhone is null");
            return (Criteria) this;
        }

        public Criteria andContPhoneIsNotNull() {
            addCriterion("ContPhone is not null");
            return (Criteria) this;
        }

        public Criteria andContPhoneEqualTo(String value) {
            addCriterion("ContPhone =", value, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneNotEqualTo(String value) {
            addCriterion("ContPhone <>", value, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneGreaterThan(String value) {
            addCriterion("ContPhone >", value, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ContPhone >=", value, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneLessThan(String value) {
            addCriterion("ContPhone <", value, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneLessThanOrEqualTo(String value) {
            addCriterion("ContPhone <=", value, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneLike(String value) {
            addCriterion("ContPhone like", value, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneNotLike(String value) {
            addCriterion("ContPhone not like", value, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneIn(List<String> values) {
            addCriterion("ContPhone in", values, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneNotIn(List<String> values) {
            addCriterion("ContPhone not in", values, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneBetween(String value1, String value2) {
            addCriterion("ContPhone between", value1, value2, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneNotBetween(String value1, String value2) {
            addCriterion("ContPhone not between", value1, value2, "contPhone");
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

        public Criteria andMsnIsNull() {
            addCriterion("Msn is null");
            return (Criteria) this;
        }

        public Criteria andMsnIsNotNull() {
            addCriterion("Msn is not null");
            return (Criteria) this;
        }

        public Criteria andMsnEqualTo(String value) {
            addCriterion("Msn =", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotEqualTo(String value) {
            addCriterion("Msn <>", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnGreaterThan(String value) {
            addCriterion("Msn >", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnGreaterThanOrEqualTo(String value) {
            addCriterion("Msn >=", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnLessThan(String value) {
            addCriterion("Msn <", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnLessThanOrEqualTo(String value) {
            addCriterion("Msn <=", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnLike(String value) {
            addCriterion("Msn like", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotLike(String value) {
            addCriterion("Msn not like", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnIn(List<String> values) {
            addCriterion("Msn in", values, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotIn(List<String> values) {
            addCriterion("Msn not in", values, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnBetween(String value1, String value2) {
            addCriterion("Msn between", value1, value2, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotBetween(String value1, String value2) {
            addCriterion("Msn not between", value1, value2, "msn");
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

        public Criteria andIsUster2007IsNull() {
            addCriterion("IsUster2007 is null");
            return (Criteria) this;
        }

        public Criteria andIsUster2007IsNotNull() {
            addCriterion("IsUster2007 is not null");
            return (Criteria) this;
        }

        public Criteria andIsUster2007EqualTo(Integer value) {
            addCriterion("IsUster2007 =", value, "isUster2007");
            return (Criteria) this;
        }

        public Criteria andIsUster2007NotEqualTo(Integer value) {
            addCriterion("IsUster2007 <>", value, "isUster2007");
            return (Criteria) this;
        }

        public Criteria andIsUster2007GreaterThan(Integer value) {
            addCriterion("IsUster2007 >", value, "isUster2007");
            return (Criteria) this;
        }

        public Criteria andIsUster2007GreaterThanOrEqualTo(Integer value) {
            addCriterion("IsUster2007 >=", value, "isUster2007");
            return (Criteria) this;
        }

        public Criteria andIsUster2007LessThan(Integer value) {
            addCriterion("IsUster2007 <", value, "isUster2007");
            return (Criteria) this;
        }

        public Criteria andIsUster2007LessThanOrEqualTo(Integer value) {
            addCriterion("IsUster2007 <=", value, "isUster2007");
            return (Criteria) this;
        }

        public Criteria andIsUster2007In(List<Integer> values) {
            addCriterion("IsUster2007 in", values, "isUster2007");
            return (Criteria) this;
        }

        public Criteria andIsUster2007NotIn(List<Integer> values) {
            addCriterion("IsUster2007 not in", values, "isUster2007");
            return (Criteria) this;
        }

        public Criteria andIsUster2007Between(Integer value1, Integer value2) {
            addCriterion("IsUster2007 between", value1, value2, "isUster2007");
            return (Criteria) this;
        }

        public Criteria andIsUster2007NotBetween(Integer value1, Integer value2) {
            addCriterion("IsUster2007 not between", value1, value2, "isUster2007");
            return (Criteria) this;
        }

        public Criteria andIsAllCorpGoodIsNull() {
            addCriterion("IsAllCorpGood is null");
            return (Criteria) this;
        }

        public Criteria andIsAllCorpGoodIsNotNull() {
            addCriterion("IsAllCorpGood is not null");
            return (Criteria) this;
        }

        public Criteria andIsAllCorpGoodEqualTo(Integer value) {
            addCriterion("IsAllCorpGood =", value, "isAllCorpGood");
            return (Criteria) this;
        }

        public Criteria andIsAllCorpGoodNotEqualTo(Integer value) {
            addCriterion("IsAllCorpGood <>", value, "isAllCorpGood");
            return (Criteria) this;
        }

        public Criteria andIsAllCorpGoodGreaterThan(Integer value) {
            addCriterion("IsAllCorpGood >", value, "isAllCorpGood");
            return (Criteria) this;
        }

        public Criteria andIsAllCorpGoodGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsAllCorpGood >=", value, "isAllCorpGood");
            return (Criteria) this;
        }

        public Criteria andIsAllCorpGoodLessThan(Integer value) {
            addCriterion("IsAllCorpGood <", value, "isAllCorpGood");
            return (Criteria) this;
        }

        public Criteria andIsAllCorpGoodLessThanOrEqualTo(Integer value) {
            addCriterion("IsAllCorpGood <=", value, "isAllCorpGood");
            return (Criteria) this;
        }

        public Criteria andIsAllCorpGoodIn(List<Integer> values) {
            addCriterion("IsAllCorpGood in", values, "isAllCorpGood");
            return (Criteria) this;
        }

        public Criteria andIsAllCorpGoodNotIn(List<Integer> values) {
            addCriterion("IsAllCorpGood not in", values, "isAllCorpGood");
            return (Criteria) this;
        }

        public Criteria andIsAllCorpGoodBetween(Integer value1, Integer value2) {
            addCriterion("IsAllCorpGood between", value1, value2, "isAllCorpGood");
            return (Criteria) this;
        }

        public Criteria andIsAllCorpGoodNotBetween(Integer value1, Integer value2) {
            addCriterion("IsAllCorpGood not between", value1, value2, "isAllCorpGood");
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

        public Criteria andGM_HDFIsNull() {
            addCriterion("GM_HDF is null");
            return (Criteria) this;
        }

        public Criteria andGM_HDFIsNotNull() {
            addCriterion("GM_HDF is not null");
            return (Criteria) this;
        }

        public Criteria andGM_HDFEqualTo(String value) {
            addCriterion("GM_HDF =", value, "GM_HDF");
            return (Criteria) this;
        }

        public Criteria andGM_HDFNotEqualTo(String value) {
            addCriterion("GM_HDF <>", value, "GM_HDF");
            return (Criteria) this;
        }

        public Criteria andGM_HDFGreaterThan(String value) {
            addCriterion("GM_HDF >", value, "GM_HDF");
            return (Criteria) this;
        }

        public Criteria andGM_HDFGreaterThanOrEqualTo(String value) {
            addCriterion("GM_HDF >=", value, "GM_HDF");
            return (Criteria) this;
        }

        public Criteria andGM_HDFLessThan(String value) {
            addCriterion("GM_HDF <", value, "GM_HDF");
            return (Criteria) this;
        }

        public Criteria andGM_HDFLessThanOrEqualTo(String value) {
            addCriterion("GM_HDF <=", value, "GM_HDF");
            return (Criteria) this;
        }

        public Criteria andGM_HDFLike(String value) {
            addCriterion("GM_HDF like", value, "GM_HDF");
            return (Criteria) this;
        }

        public Criteria andGM_HDFNotLike(String value) {
            addCriterion("GM_HDF not like", value, "GM_HDF");
            return (Criteria) this;
        }

        public Criteria andGM_HDFIn(List<String> values) {
            addCriterion("GM_HDF in", values, "GM_HDF");
            return (Criteria) this;
        }

        public Criteria andGM_HDFNotIn(List<String> values) {
            addCriterion("GM_HDF not in", values, "GM_HDF");
            return (Criteria) this;
        }

        public Criteria andGM_HDFBetween(String value1, String value2) {
            addCriterion("GM_HDF between", value1, value2, "GM_HDF");
            return (Criteria) this;
        }

        public Criteria andGM_HDFNotBetween(String value1, String value2) {
            addCriterion("GM_HDF not between", value1, value2, "GM_HDF");
            return (Criteria) this;
        }

        public Criteria andGM_JMFIsNull() {
            addCriterion("GM_JMF is null");
            return (Criteria) this;
        }

        public Criteria andGM_JMFIsNotNull() {
            addCriterion("GM_JMF is not null");
            return (Criteria) this;
        }

        public Criteria andGM_JMFEqualTo(String value) {
            addCriterion("GM_JMF =", value, "GM_JMF");
            return (Criteria) this;
        }

        public Criteria andGM_JMFNotEqualTo(String value) {
            addCriterion("GM_JMF <>", value, "GM_JMF");
            return (Criteria) this;
        }

        public Criteria andGM_JMFGreaterThan(String value) {
            addCriterion("GM_JMF >", value, "GM_JMF");
            return (Criteria) this;
        }

        public Criteria andGM_JMFGreaterThanOrEqualTo(String value) {
            addCriterion("GM_JMF >=", value, "GM_JMF");
            return (Criteria) this;
        }

        public Criteria andGM_JMFLessThan(String value) {
            addCriterion("GM_JMF <", value, "GM_JMF");
            return (Criteria) this;
        }

        public Criteria andGM_JMFLessThanOrEqualTo(String value) {
            addCriterion("GM_JMF <=", value, "GM_JMF");
            return (Criteria) this;
        }

        public Criteria andGM_JMFLike(String value) {
            addCriterion("GM_JMF like", value, "GM_JMF");
            return (Criteria) this;
        }

        public Criteria andGM_JMFNotLike(String value) {
            addCriterion("GM_JMF not like", value, "GM_JMF");
            return (Criteria) this;
        }

        public Criteria andGM_JMFIn(List<String> values) {
            addCriterion("GM_JMF in", values, "GM_JMF");
            return (Criteria) this;
        }

        public Criteria andGM_JMFNotIn(List<String> values) {
            addCriterion("GM_JMF not in", values, "GM_JMF");
            return (Criteria) this;
        }

        public Criteria andGM_JMFBetween(String value1, String value2) {
            addCriterion("GM_JMF between", value1, value2, "GM_JMF");
            return (Criteria) this;
        }

        public Criteria andGM_JMFNotBetween(String value1, String value2) {
            addCriterion("GM_JMF not between", value1, value2, "GM_JMF");
            return (Criteria) this;
        }

        public Criteria andGM_ZBFIsNull() {
            addCriterion("GM_ZBF is null");
            return (Criteria) this;
        }

        public Criteria andGM_ZBFIsNotNull() {
            addCriterion("GM_ZBF is not null");
            return (Criteria) this;
        }

        public Criteria andGM_ZBFEqualTo(String value) {
            addCriterion("GM_ZBF =", value, "GM_ZBF");
            return (Criteria) this;
        }

        public Criteria andGM_ZBFNotEqualTo(String value) {
            addCriterion("GM_ZBF <>", value, "GM_ZBF");
            return (Criteria) this;
        }

        public Criteria andGM_ZBFGreaterThan(String value) {
            addCriterion("GM_ZBF >", value, "GM_ZBF");
            return (Criteria) this;
        }

        public Criteria andGM_ZBFGreaterThanOrEqualTo(String value) {
            addCriterion("GM_ZBF >=", value, "GM_ZBF");
            return (Criteria) this;
        }

        public Criteria andGM_ZBFLessThan(String value) {
            addCriterion("GM_ZBF <", value, "GM_ZBF");
            return (Criteria) this;
        }

        public Criteria andGM_ZBFLessThanOrEqualTo(String value) {
            addCriterion("GM_ZBF <=", value, "GM_ZBF");
            return (Criteria) this;
        }

        public Criteria andGM_ZBFLike(String value) {
            addCriterion("GM_ZBF like", value, "GM_ZBF");
            return (Criteria) this;
        }

        public Criteria andGM_ZBFNotLike(String value) {
            addCriterion("GM_ZBF not like", value, "GM_ZBF");
            return (Criteria) this;
        }

        public Criteria andGM_ZBFIn(List<String> values) {
            addCriterion("GM_ZBF in", values, "GM_ZBF");
            return (Criteria) this;
        }

        public Criteria andGM_ZBFNotIn(List<String> values) {
            addCriterion("GM_ZBF not in", values, "GM_ZBF");
            return (Criteria) this;
        }

        public Criteria andGM_ZBFBetween(String value1, String value2) {
            addCriterion("GM_ZBF between", value1, value2, "GM_ZBF");
            return (Criteria) this;
        }

        public Criteria andGM_ZBFNotBetween(String value1, String value2) {
            addCriterion("GM_ZBF not between", value1, value2, "GM_ZBF");
            return (Criteria) this;
        }

        public Criteria andGM_PQFIsNull() {
            addCriterion("GM_PQF is null");
            return (Criteria) this;
        }

        public Criteria andGM_PQFIsNotNull() {
            addCriterion("GM_PQF is not null");
            return (Criteria) this;
        }

        public Criteria andGM_PQFEqualTo(String value) {
            addCriterion("GM_PQF =", value, "GM_PQF");
            return (Criteria) this;
        }

        public Criteria andGM_PQFNotEqualTo(String value) {
            addCriterion("GM_PQF <>", value, "GM_PQF");
            return (Criteria) this;
        }

        public Criteria andGM_PQFGreaterThan(String value) {
            addCriterion("GM_PQF >", value, "GM_PQF");
            return (Criteria) this;
        }

        public Criteria andGM_PQFGreaterThanOrEqualTo(String value) {
            addCriterion("GM_PQF >=", value, "GM_PQF");
            return (Criteria) this;
        }

        public Criteria andGM_PQFLessThan(String value) {
            addCriterion("GM_PQF <", value, "GM_PQF");
            return (Criteria) this;
        }

        public Criteria andGM_PQFLessThanOrEqualTo(String value) {
            addCriterion("GM_PQF <=", value, "GM_PQF");
            return (Criteria) this;
        }

        public Criteria andGM_PQFLike(String value) {
            addCriterion("GM_PQF like", value, "GM_PQF");
            return (Criteria) this;
        }

        public Criteria andGM_PQFNotLike(String value) {
            addCriterion("GM_PQF not like", value, "GM_PQF");
            return (Criteria) this;
        }

        public Criteria andGM_PQFIn(List<String> values) {
            addCriterion("GM_PQF in", values, "GM_PQF");
            return (Criteria) this;
        }

        public Criteria andGM_PQFNotIn(List<String> values) {
            addCriterion("GM_PQF not in", values, "GM_PQF");
            return (Criteria) this;
        }

        public Criteria andGM_PQFBetween(String value1, String value2) {
            addCriterion("GM_PQF between", value1, value2, "GM_PQF");
            return (Criteria) this;
        }

        public Criteria andGM_PQFNotBetween(String value1, String value2) {
            addCriterion("GM_PQF not between", value1, value2, "GM_PQF");
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

        public Criteria andCorpSortIsNull() {
            addCriterion("CorpSort is null");
            return (Criteria) this;
        }

        public Criteria andCorpSortIsNotNull() {
            addCriterion("CorpSort is not null");
            return (Criteria) this;
        }

        public Criteria andCorpSortEqualTo(String value) {
            addCriterion("CorpSort =", value, "corpSort");
            return (Criteria) this;
        }

        public Criteria andCorpSortNotEqualTo(String value) {
            addCriterion("CorpSort <>", value, "corpSort");
            return (Criteria) this;
        }

        public Criteria andCorpSortGreaterThan(String value) {
            addCriterion("CorpSort >", value, "corpSort");
            return (Criteria) this;
        }

        public Criteria andCorpSortGreaterThanOrEqualTo(String value) {
            addCriterion("CorpSort >=", value, "corpSort");
            return (Criteria) this;
        }

        public Criteria andCorpSortLessThan(String value) {
            addCriterion("CorpSort <", value, "corpSort");
            return (Criteria) this;
        }

        public Criteria andCorpSortLessThanOrEqualTo(String value) {
            addCriterion("CorpSort <=", value, "corpSort");
            return (Criteria) this;
        }

        public Criteria andCorpSortLike(String value) {
            addCriterion("CorpSort like", value, "corpSort");
            return (Criteria) this;
        }

        public Criteria andCorpSortNotLike(String value) {
            addCriterion("CorpSort not like", value, "corpSort");
            return (Criteria) this;
        }

        public Criteria andCorpSortIn(List<String> values) {
            addCriterion("CorpSort in", values, "corpSort");
            return (Criteria) this;
        }

        public Criteria andCorpSortNotIn(List<String> values) {
            addCriterion("CorpSort not in", values, "corpSort");
            return (Criteria) this;
        }

        public Criteria andCorpSortBetween(String value1, String value2) {
            addCriterion("CorpSort between", value1, value2, "corpSort");
            return (Criteria) this;
        }

        public Criteria andCorpSortNotBetween(String value1, String value2) {
            addCriterion("CorpSort not between", value1, value2, "corpSort");
            return (Criteria) this;
        }

        public Criteria andNewCateIsNull() {
            addCriterion("NewCate is null");
            return (Criteria) this;
        }

        public Criteria andNewCateIsNotNull() {
            addCriterion("NewCate is not null");
            return (Criteria) this;
        }

        public Criteria andNewCateEqualTo(Integer value) {
            addCriterion("NewCate =", value, "newCate");
            return (Criteria) this;
        }

        public Criteria andNewCateNotEqualTo(Integer value) {
            addCriterion("NewCate <>", value, "newCate");
            return (Criteria) this;
        }

        public Criteria andNewCateGreaterThan(Integer value) {
            addCriterion("NewCate >", value, "newCate");
            return (Criteria) this;
        }

        public Criteria andNewCateGreaterThanOrEqualTo(Integer value) {
            addCriterion("NewCate >=", value, "newCate");
            return (Criteria) this;
        }

        public Criteria andNewCateLessThan(Integer value) {
            addCriterion("NewCate <", value, "newCate");
            return (Criteria) this;
        }

        public Criteria andNewCateLessThanOrEqualTo(Integer value) {
            addCriterion("NewCate <=", value, "newCate");
            return (Criteria) this;
        }

        public Criteria andNewCateIn(List<Integer> values) {
            addCriterion("NewCate in", values, "newCate");
            return (Criteria) this;
        }

        public Criteria andNewCateNotIn(List<Integer> values) {
            addCriterion("NewCate not in", values, "newCate");
            return (Criteria) this;
        }

        public Criteria andNewCateBetween(Integer value1, Integer value2) {
            addCriterion("NewCate between", value1, value2, "newCate");
            return (Criteria) this;
        }

        public Criteria andNewCateNotBetween(Integer value1, Integer value2) {
            addCriterion("NewCate not between", value1, value2, "newCate");
            return (Criteria) this;
        }

        public Criteria andNewBigCateIsNull() {
            addCriterion("NewBigCate is null");
            return (Criteria) this;
        }

        public Criteria andNewBigCateIsNotNull() {
            addCriterion("NewBigCate is not null");
            return (Criteria) this;
        }

        public Criteria andNewBigCateEqualTo(Integer value) {
            addCriterion("NewBigCate =", value, "newBigCate");
            return (Criteria) this;
        }

        public Criteria andNewBigCateNotEqualTo(Integer value) {
            addCriterion("NewBigCate <>", value, "newBigCate");
            return (Criteria) this;
        }

        public Criteria andNewBigCateGreaterThan(Integer value) {
            addCriterion("NewBigCate >", value, "newBigCate");
            return (Criteria) this;
        }

        public Criteria andNewBigCateGreaterThanOrEqualTo(Integer value) {
            addCriterion("NewBigCate >=", value, "newBigCate");
            return (Criteria) this;
        }

        public Criteria andNewBigCateLessThan(Integer value) {
            addCriterion("NewBigCate <", value, "newBigCate");
            return (Criteria) this;
        }

        public Criteria andNewBigCateLessThanOrEqualTo(Integer value) {
            addCriterion("NewBigCate <=", value, "newBigCate");
            return (Criteria) this;
        }

        public Criteria andNewBigCateIn(List<Integer> values) {
            addCriterion("NewBigCate in", values, "newBigCate");
            return (Criteria) this;
        }

        public Criteria andNewBigCateNotIn(List<Integer> values) {
            addCriterion("NewBigCate not in", values, "newBigCate");
            return (Criteria) this;
        }

        public Criteria andNewBigCateBetween(Integer value1, Integer value2) {
            addCriterion("NewBigCate between", value1, value2, "newBigCate");
            return (Criteria) this;
        }

        public Criteria andNewBigCateNotBetween(Integer value1, Integer value2) {
            addCriterion("NewBigCate not between", value1, value2, "newBigCate");
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