package com.js.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SMoneycorpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SMoneycorpExample() {
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

        public Criteria andSortCorpNameIsNull() {
            addCriterion("SortCorpName is null");
            return (Criteria) this;
        }

        public Criteria andSortCorpNameIsNotNull() {
            addCriterion("SortCorpName is not null");
            return (Criteria) this;
        }

        public Criteria andSortCorpNameEqualTo(String value) {
            addCriterion("SortCorpName =", value, "sortCorpName");
            return (Criteria) this;
        }

        public Criteria andSortCorpNameNotEqualTo(String value) {
            addCriterion("SortCorpName <>", value, "sortCorpName");
            return (Criteria) this;
        }

        public Criteria andSortCorpNameGreaterThan(String value) {
            addCriterion("SortCorpName >", value, "sortCorpName");
            return (Criteria) this;
        }

        public Criteria andSortCorpNameGreaterThanOrEqualTo(String value) {
            addCriterion("SortCorpName >=", value, "sortCorpName");
            return (Criteria) this;
        }

        public Criteria andSortCorpNameLessThan(String value) {
            addCriterion("SortCorpName <", value, "sortCorpName");
            return (Criteria) this;
        }

        public Criteria andSortCorpNameLessThanOrEqualTo(String value) {
            addCriterion("SortCorpName <=", value, "sortCorpName");
            return (Criteria) this;
        }

        public Criteria andSortCorpNameLike(String value) {
            addCriterion("SortCorpName like", value, "sortCorpName");
            return (Criteria) this;
        }

        public Criteria andSortCorpNameNotLike(String value) {
            addCriterion("SortCorpName not like", value, "sortCorpName");
            return (Criteria) this;
        }

        public Criteria andSortCorpNameIn(List<String> values) {
            addCriterion("SortCorpName in", values, "sortCorpName");
            return (Criteria) this;
        }

        public Criteria andSortCorpNameNotIn(List<String> values) {
            addCriterion("SortCorpName not in", values, "sortCorpName");
            return (Criteria) this;
        }

        public Criteria andSortCorpNameBetween(String value1, String value2) {
            addCriterion("SortCorpName between", value1, value2, "sortCorpName");
            return (Criteria) this;
        }

        public Criteria andSortCorpNameNotBetween(String value1, String value2) {
            addCriterion("SortCorpName not between", value1, value2, "sortCorpName");
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

        public Criteria andUserNameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("UserName =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("UserName >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("UserName <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("UserName like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("UserName not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("UserName in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPassWordIsNull() {
            addCriterion("PassWord is null");
            return (Criteria) this;
        }

        public Criteria andPassWordIsNotNull() {
            addCriterion("PassWord is not null");
            return (Criteria) this;
        }

        public Criteria andPassWordEqualTo(String value) {
            addCriterion("PassWord =", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotEqualTo(String value) {
            addCriterion("PassWord <>", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThan(String value) {
            addCriterion("PassWord >", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThanOrEqualTo(String value) {
            addCriterion("PassWord >=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThan(String value) {
            addCriterion("PassWord <", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThanOrEqualTo(String value) {
            addCriterion("PassWord <=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLike(String value) {
            addCriterion("PassWord like", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotLike(String value) {
            addCriterion("PassWord not like", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordIn(List<String> values) {
            addCriterion("PassWord in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotIn(List<String> values) {
            addCriterion("PassWord not in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordBetween(String value1, String value2) {
            addCriterion("PassWord between", value1, value2, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotBetween(String value1, String value2) {
            addCriterion("PassWord not between", value1, value2, "passWord");
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

        public Criteria andContMobIsNull() {
            addCriterion("ContMob is null");
            return (Criteria) this;
        }

        public Criteria andContMobIsNotNull() {
            addCriterion("ContMob is not null");
            return (Criteria) this;
        }

        public Criteria andContMobEqualTo(String value) {
            addCriterion("ContMob =", value, "contMob");
            return (Criteria) this;
        }

        public Criteria andContMobNotEqualTo(String value) {
            addCriterion("ContMob <>", value, "contMob");
            return (Criteria) this;
        }

        public Criteria andContMobGreaterThan(String value) {
            addCriterion("ContMob >", value, "contMob");
            return (Criteria) this;
        }

        public Criteria andContMobGreaterThanOrEqualTo(String value) {
            addCriterion("ContMob >=", value, "contMob");
            return (Criteria) this;
        }

        public Criteria andContMobLessThan(String value) {
            addCriterion("ContMob <", value, "contMob");
            return (Criteria) this;
        }

        public Criteria andContMobLessThanOrEqualTo(String value) {
            addCriterion("ContMob <=", value, "contMob");
            return (Criteria) this;
        }

        public Criteria andContMobLike(String value) {
            addCriterion("ContMob like", value, "contMob");
            return (Criteria) this;
        }

        public Criteria andContMobNotLike(String value) {
            addCriterion("ContMob not like", value, "contMob");
            return (Criteria) this;
        }

        public Criteria andContMobIn(List<String> values) {
            addCriterion("ContMob in", values, "contMob");
            return (Criteria) this;
        }

        public Criteria andContMobNotIn(List<String> values) {
            addCriterion("ContMob not in", values, "contMob");
            return (Criteria) this;
        }

        public Criteria andContMobBetween(String value1, String value2) {
            addCriterion("ContMob between", value1, value2, "contMob");
            return (Criteria) this;
        }

        public Criteria andContMobNotBetween(String value1, String value2) {
            addCriterion("ContMob not between", value1, value2, "contMob");
            return (Criteria) this;
        }

        public Criteria andContEmailIsNull() {
            addCriterion("ContEmail is null");
            return (Criteria) this;
        }

        public Criteria andContEmailIsNotNull() {
            addCriterion("ContEmail is not null");
            return (Criteria) this;
        }

        public Criteria andContEmailEqualTo(String value) {
            addCriterion("ContEmail =", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailNotEqualTo(String value) {
            addCriterion("ContEmail <>", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailGreaterThan(String value) {
            addCriterion("ContEmail >", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailGreaterThanOrEqualTo(String value) {
            addCriterion("ContEmail >=", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailLessThan(String value) {
            addCriterion("ContEmail <", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailLessThanOrEqualTo(String value) {
            addCriterion("ContEmail <=", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailLike(String value) {
            addCriterion("ContEmail like", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailNotLike(String value) {
            addCriterion("ContEmail not like", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailIn(List<String> values) {
            addCriterion("ContEmail in", values, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailNotIn(List<String> values) {
            addCriterion("ContEmail not in", values, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailBetween(String value1, String value2) {
            addCriterion("ContEmail between", value1, value2, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailNotBetween(String value1, String value2) {
            addCriterion("ContEmail not between", value1, value2, "contEmail");
            return (Criteria) this;
        }

        public Criteria andZgsxwContNameIsNull() {
            addCriterion("ZgsxwContName is null");
            return (Criteria) this;
        }

        public Criteria andZgsxwContNameIsNotNull() {
            addCriterion("ZgsxwContName is not null");
            return (Criteria) this;
        }

        public Criteria andZgsxwContNameEqualTo(String value) {
            addCriterion("ZgsxwContName =", value, "zgsxwContName");
            return (Criteria) this;
        }

        public Criteria andZgsxwContNameNotEqualTo(String value) {
            addCriterion("ZgsxwContName <>", value, "zgsxwContName");
            return (Criteria) this;
        }

        public Criteria andZgsxwContNameGreaterThan(String value) {
            addCriterion("ZgsxwContName >", value, "zgsxwContName");
            return (Criteria) this;
        }

        public Criteria andZgsxwContNameGreaterThanOrEqualTo(String value) {
            addCriterion("ZgsxwContName >=", value, "zgsxwContName");
            return (Criteria) this;
        }

        public Criteria andZgsxwContNameLessThan(String value) {
            addCriterion("ZgsxwContName <", value, "zgsxwContName");
            return (Criteria) this;
        }

        public Criteria andZgsxwContNameLessThanOrEqualTo(String value) {
            addCriterion("ZgsxwContName <=", value, "zgsxwContName");
            return (Criteria) this;
        }

        public Criteria andZgsxwContNameLike(String value) {
            addCriterion("ZgsxwContName like", value, "zgsxwContName");
            return (Criteria) this;
        }

        public Criteria andZgsxwContNameNotLike(String value) {
            addCriterion("ZgsxwContName not like", value, "zgsxwContName");
            return (Criteria) this;
        }

        public Criteria andZgsxwContNameIn(List<String> values) {
            addCriterion("ZgsxwContName in", values, "zgsxwContName");
            return (Criteria) this;
        }

        public Criteria andZgsxwContNameNotIn(List<String> values) {
            addCriterion("ZgsxwContName not in", values, "zgsxwContName");
            return (Criteria) this;
        }

        public Criteria andZgsxwContNameBetween(String value1, String value2) {
            addCriterion("ZgsxwContName between", value1, value2, "zgsxwContName");
            return (Criteria) this;
        }

        public Criteria andZgsxwContNameNotBetween(String value1, String value2) {
            addCriterion("ZgsxwContName not between", value1, value2, "zgsxwContName");
            return (Criteria) this;
        }

        public Criteria andExecNameIsNull() {
            addCriterion("ExecName is null");
            return (Criteria) this;
        }

        public Criteria andExecNameIsNotNull() {
            addCriterion("ExecName is not null");
            return (Criteria) this;
        }

        public Criteria andExecNameEqualTo(String value) {
            addCriterion("ExecName =", value, "execName");
            return (Criteria) this;
        }

        public Criteria andExecNameNotEqualTo(String value) {
            addCriterion("ExecName <>", value, "execName");
            return (Criteria) this;
        }

        public Criteria andExecNameGreaterThan(String value) {
            addCriterion("ExecName >", value, "execName");
            return (Criteria) this;
        }

        public Criteria andExecNameGreaterThanOrEqualTo(String value) {
            addCriterion("ExecName >=", value, "execName");
            return (Criteria) this;
        }

        public Criteria andExecNameLessThan(String value) {
            addCriterion("ExecName <", value, "execName");
            return (Criteria) this;
        }

        public Criteria andExecNameLessThanOrEqualTo(String value) {
            addCriterion("ExecName <=", value, "execName");
            return (Criteria) this;
        }

        public Criteria andExecNameLike(String value) {
            addCriterion("ExecName like", value, "execName");
            return (Criteria) this;
        }

        public Criteria andExecNameNotLike(String value) {
            addCriterion("ExecName not like", value, "execName");
            return (Criteria) this;
        }

        public Criteria andExecNameIn(List<String> values) {
            addCriterion("ExecName in", values, "execName");
            return (Criteria) this;
        }

        public Criteria andExecNameNotIn(List<String> values) {
            addCriterion("ExecName not in", values, "execName");
            return (Criteria) this;
        }

        public Criteria andExecNameBetween(String value1, String value2) {
            addCriterion("ExecName between", value1, value2, "execName");
            return (Criteria) this;
        }

        public Criteria andExecNameNotBetween(String value1, String value2) {
            addCriterion("ExecName not between", value1, value2, "execName");
            return (Criteria) this;
        }

        public Criteria andMoneyDateIsNull() {
            addCriterion("MoneyDate is null");
            return (Criteria) this;
        }

        public Criteria andMoneyDateIsNotNull() {
            addCriterion("MoneyDate is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyDateEqualTo(Date value) {
            addCriterion("MoneyDate =", value, "moneyDate");
            return (Criteria) this;
        }

        public Criteria andMoneyDateNotEqualTo(Date value) {
            addCriterion("MoneyDate <>", value, "moneyDate");
            return (Criteria) this;
        }

        public Criteria andMoneyDateGreaterThan(Date value) {
            addCriterion("MoneyDate >", value, "moneyDate");
            return (Criteria) this;
        }

        public Criteria andMoneyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("MoneyDate >=", value, "moneyDate");
            return (Criteria) this;
        }

        public Criteria andMoneyDateLessThan(Date value) {
            addCriterion("MoneyDate <", value, "moneyDate");
            return (Criteria) this;
        }

        public Criteria andMoneyDateLessThanOrEqualTo(Date value) {
            addCriterion("MoneyDate <=", value, "moneyDate");
            return (Criteria) this;
        }

        public Criteria andMoneyDateIn(List<Date> values) {
            addCriterion("MoneyDate in", values, "moneyDate");
            return (Criteria) this;
        }

        public Criteria andMoneyDateNotIn(List<Date> values) {
            addCriterion("MoneyDate not in", values, "moneyDate");
            return (Criteria) this;
        }

        public Criteria andMoneyDateBetween(Date value1, Date value2) {
            addCriterion("MoneyDate between", value1, value2, "moneyDate");
            return (Criteria) this;
        }

        public Criteria andMoneyDateNotBetween(Date value1, Date value2) {
            addCriterion("MoneyDate not between", value1, value2, "moneyDate");
            return (Criteria) this;
        }

        public Criteria andMoneyNoIsNull() {
            addCriterion("MoneyNo is null");
            return (Criteria) this;
        }

        public Criteria andMoneyNoIsNotNull() {
            addCriterion("MoneyNo is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyNoEqualTo(String value) {
            addCriterion("MoneyNo =", value, "moneyNo");
            return (Criteria) this;
        }

        public Criteria andMoneyNoNotEqualTo(String value) {
            addCriterion("MoneyNo <>", value, "moneyNo");
            return (Criteria) this;
        }

        public Criteria andMoneyNoGreaterThan(String value) {
            addCriterion("MoneyNo >", value, "moneyNo");
            return (Criteria) this;
        }

        public Criteria andMoneyNoGreaterThanOrEqualTo(String value) {
            addCriterion("MoneyNo >=", value, "moneyNo");
            return (Criteria) this;
        }

        public Criteria andMoneyNoLessThan(String value) {
            addCriterion("MoneyNo <", value, "moneyNo");
            return (Criteria) this;
        }

        public Criteria andMoneyNoLessThanOrEqualTo(String value) {
            addCriterion("MoneyNo <=", value, "moneyNo");
            return (Criteria) this;
        }

        public Criteria andMoneyNoLike(String value) {
            addCriterion("MoneyNo like", value, "moneyNo");
            return (Criteria) this;
        }

        public Criteria andMoneyNoNotLike(String value) {
            addCriterion("MoneyNo not like", value, "moneyNo");
            return (Criteria) this;
        }

        public Criteria andMoneyNoIn(List<String> values) {
            addCriterion("MoneyNo in", values, "moneyNo");
            return (Criteria) this;
        }

        public Criteria andMoneyNoNotIn(List<String> values) {
            addCriterion("MoneyNo not in", values, "moneyNo");
            return (Criteria) this;
        }

        public Criteria andMoneyNoBetween(String value1, String value2) {
            addCriterion("MoneyNo between", value1, value2, "moneyNo");
            return (Criteria) this;
        }

        public Criteria andMoneyNoNotBetween(String value1, String value2) {
            addCriterion("MoneyNo not between", value1, value2, "moneyNo");
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

        public Criteria andTMoneyDateIsNull() {
            addCriterion("TMoneyDate is null");
            return (Criteria) this;
        }

        public Criteria andTMoneyDateIsNotNull() {
            addCriterion("TMoneyDate is not null");
            return (Criteria) this;
        }

        public Criteria andTMoneyDateEqualTo(Date value) {
            addCriterion("TMoneyDate =", value, "TMoneyDate");
            return (Criteria) this;
        }

        public Criteria andTMoneyDateNotEqualTo(Date value) {
            addCriterion("TMoneyDate <>", value, "TMoneyDate");
            return (Criteria) this;
        }

        public Criteria andTMoneyDateGreaterThan(Date value) {
            addCriterion("TMoneyDate >", value, "TMoneyDate");
            return (Criteria) this;
        }

        public Criteria andTMoneyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TMoneyDate >=", value, "TMoneyDate");
            return (Criteria) this;
        }

        public Criteria andTMoneyDateLessThan(Date value) {
            addCriterion("TMoneyDate <", value, "TMoneyDate");
            return (Criteria) this;
        }

        public Criteria andTMoneyDateLessThanOrEqualTo(Date value) {
            addCriterion("TMoneyDate <=", value, "TMoneyDate");
            return (Criteria) this;
        }

        public Criteria andTMoneyDateIn(List<Date> values) {
            addCriterion("TMoneyDate in", values, "TMoneyDate");
            return (Criteria) this;
        }

        public Criteria andTMoneyDateNotIn(List<Date> values) {
            addCriterion("TMoneyDate not in", values, "TMoneyDate");
            return (Criteria) this;
        }

        public Criteria andTMoneyDateBetween(Date value1, Date value2) {
            addCriterion("TMoneyDate between", value1, value2, "TMoneyDate");
            return (Criteria) this;
        }

        public Criteria andTMoneyDateNotBetween(Date value1, Date value2) {
            addCriterion("TMoneyDate not between", value1, value2, "TMoneyDate");
            return (Criteria) this;
        }

        public Criteria andTMoneyNoIsNull() {
            addCriterion("TMoneyNo is null");
            return (Criteria) this;
        }

        public Criteria andTMoneyNoIsNotNull() {
            addCriterion("TMoneyNo is not null");
            return (Criteria) this;
        }

        public Criteria andTMoneyNoEqualTo(String value) {
            addCriterion("TMoneyNo =", value, "TMoneyNo");
            return (Criteria) this;
        }

        public Criteria andTMoneyNoNotEqualTo(String value) {
            addCriterion("TMoneyNo <>", value, "TMoneyNo");
            return (Criteria) this;
        }

        public Criteria andTMoneyNoGreaterThan(String value) {
            addCriterion("TMoneyNo >", value, "TMoneyNo");
            return (Criteria) this;
        }

        public Criteria andTMoneyNoGreaterThanOrEqualTo(String value) {
            addCriterion("TMoneyNo >=", value, "TMoneyNo");
            return (Criteria) this;
        }

        public Criteria andTMoneyNoLessThan(String value) {
            addCriterion("TMoneyNo <", value, "TMoneyNo");
            return (Criteria) this;
        }

        public Criteria andTMoneyNoLessThanOrEqualTo(String value) {
            addCriterion("TMoneyNo <=", value, "TMoneyNo");
            return (Criteria) this;
        }

        public Criteria andTMoneyNoLike(String value) {
            addCriterion("TMoneyNo like", value, "TMoneyNo");
            return (Criteria) this;
        }

        public Criteria andTMoneyNoNotLike(String value) {
            addCriterion("TMoneyNo not like", value, "TMoneyNo");
            return (Criteria) this;
        }

        public Criteria andTMoneyNoIn(List<String> values) {
            addCriterion("TMoneyNo in", values, "TMoneyNo");
            return (Criteria) this;
        }

        public Criteria andTMoneyNoNotIn(List<String> values) {
            addCriterion("TMoneyNo not in", values, "TMoneyNo");
            return (Criteria) this;
        }

        public Criteria andTMoneyNoBetween(String value1, String value2) {
            addCriterion("TMoneyNo between", value1, value2, "TMoneyNo");
            return (Criteria) this;
        }

        public Criteria andTMoneyNoNotBetween(String value1, String value2) {
            addCriterion("TMoneyNo not between", value1, value2, "TMoneyNo");
            return (Criteria) this;
        }

        public Criteria andTEndDateIsNull() {
            addCriterion("TEndDate is null");
            return (Criteria) this;
        }

        public Criteria andTEndDateIsNotNull() {
            addCriterion("TEndDate is not null");
            return (Criteria) this;
        }

        public Criteria andTEndDateEqualTo(Date value) {
            addCriterion("TEndDate =", value, "TEndDate");
            return (Criteria) this;
        }

        public Criteria andTEndDateNotEqualTo(Date value) {
            addCriterion("TEndDate <>", value, "TEndDate");
            return (Criteria) this;
        }

        public Criteria andTEndDateGreaterThan(Date value) {
            addCriterion("TEndDate >", value, "TEndDate");
            return (Criteria) this;
        }

        public Criteria andTEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TEndDate >=", value, "TEndDate");
            return (Criteria) this;
        }

        public Criteria andTEndDateLessThan(Date value) {
            addCriterion("TEndDate <", value, "TEndDate");
            return (Criteria) this;
        }

        public Criteria andTEndDateLessThanOrEqualTo(Date value) {
            addCriterion("TEndDate <=", value, "TEndDate");
            return (Criteria) this;
        }

        public Criteria andTEndDateIn(List<Date> values) {
            addCriterion("TEndDate in", values, "TEndDate");
            return (Criteria) this;
        }

        public Criteria andTEndDateNotIn(List<Date> values) {
            addCriterion("TEndDate not in", values, "TEndDate");
            return (Criteria) this;
        }

        public Criteria andTEndDateBetween(Date value1, Date value2) {
            addCriterion("TEndDate between", value1, value2, "TEndDate");
            return (Criteria) this;
        }

        public Criteria andTEndDateNotBetween(Date value1, Date value2) {
            addCriterion("TEndDate not between", value1, value2, "TEndDate");
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

        public Criteria andMoneyOKIsNull() {
            addCriterion("MoneyOK is null");
            return (Criteria) this;
        }

        public Criteria andMoneyOKIsNotNull() {
            addCriterion("MoneyOK is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyOKEqualTo(Integer value) {
            addCriterion("MoneyOK =", value, "moneyOK");
            return (Criteria) this;
        }

        public Criteria andMoneyOKNotEqualTo(Integer value) {
            addCriterion("MoneyOK <>", value, "moneyOK");
            return (Criteria) this;
        }

        public Criteria andMoneyOKGreaterThan(Integer value) {
            addCriterion("MoneyOK >", value, "moneyOK");
            return (Criteria) this;
        }

        public Criteria andMoneyOKGreaterThanOrEqualTo(Integer value) {
            addCriterion("MoneyOK >=", value, "moneyOK");
            return (Criteria) this;
        }

        public Criteria andMoneyOKLessThan(Integer value) {
            addCriterion("MoneyOK <", value, "moneyOK");
            return (Criteria) this;
        }

        public Criteria andMoneyOKLessThanOrEqualTo(Integer value) {
            addCriterion("MoneyOK <=", value, "moneyOK");
            return (Criteria) this;
        }

        public Criteria andMoneyOKIn(List<Integer> values) {
            addCriterion("MoneyOK in", values, "moneyOK");
            return (Criteria) this;
        }

        public Criteria andMoneyOKNotIn(List<Integer> values) {
            addCriterion("MoneyOK not in", values, "moneyOK");
            return (Criteria) this;
        }

        public Criteria andMoneyOKBetween(Integer value1, Integer value2) {
            addCriterion("MoneyOK between", value1, value2, "moneyOK");
            return (Criteria) this;
        }

        public Criteria andMoneyOKNotBetween(Integer value1, Integer value2) {
            addCriterion("MoneyOK not between", value1, value2, "moneyOK");
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

        public Criteria andIsNewCorpIsNull() {
            addCriterion("IsNewCorp is null");
            return (Criteria) this;
        }

        public Criteria andIsNewCorpIsNotNull() {
            addCriterion("IsNewCorp is not null");
            return (Criteria) this;
        }

        public Criteria andIsNewCorpEqualTo(Integer value) {
            addCriterion("IsNewCorp =", value, "isNewCorp");
            return (Criteria) this;
        }

        public Criteria andIsNewCorpNotEqualTo(Integer value) {
            addCriterion("IsNewCorp <>", value, "isNewCorp");
            return (Criteria) this;
        }

        public Criteria andIsNewCorpGreaterThan(Integer value) {
            addCriterion("IsNewCorp >", value, "isNewCorp");
            return (Criteria) this;
        }

        public Criteria andIsNewCorpGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsNewCorp >=", value, "isNewCorp");
            return (Criteria) this;
        }

        public Criteria andIsNewCorpLessThan(Integer value) {
            addCriterion("IsNewCorp <", value, "isNewCorp");
            return (Criteria) this;
        }

        public Criteria andIsNewCorpLessThanOrEqualTo(Integer value) {
            addCriterion("IsNewCorp <=", value, "isNewCorp");
            return (Criteria) this;
        }

        public Criteria andIsNewCorpIn(List<Integer> values) {
            addCriterion("IsNewCorp in", values, "isNewCorp");
            return (Criteria) this;
        }

        public Criteria andIsNewCorpNotIn(List<Integer> values) {
            addCriterion("IsNewCorp not in", values, "isNewCorp");
            return (Criteria) this;
        }

        public Criteria andIsNewCorpBetween(Integer value1, Integer value2) {
            addCriterion("IsNewCorp between", value1, value2, "isNewCorp");
            return (Criteria) this;
        }

        public Criteria andIsNewCorpNotBetween(Integer value1, Integer value2) {
            addCriterion("IsNewCorp not between", value1, value2, "isNewCorp");
            return (Criteria) this;
        }

        public Criteria andIsFibreCorpIsNull() {
            addCriterion("IsFibreCorp is null");
            return (Criteria) this;
        }

        public Criteria andIsFibreCorpIsNotNull() {
            addCriterion("IsFibreCorp is not null");
            return (Criteria) this;
        }

        public Criteria andIsFibreCorpEqualTo(Integer value) {
            addCriterion("IsFibreCorp =", value, "isFibreCorp");
            return (Criteria) this;
        }

        public Criteria andIsFibreCorpNotEqualTo(Integer value) {
            addCriterion("IsFibreCorp <>", value, "isFibreCorp");
            return (Criteria) this;
        }

        public Criteria andIsFibreCorpGreaterThan(Integer value) {
            addCriterion("IsFibreCorp >", value, "isFibreCorp");
            return (Criteria) this;
        }

        public Criteria andIsFibreCorpGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsFibreCorp >=", value, "isFibreCorp");
            return (Criteria) this;
        }

        public Criteria andIsFibreCorpLessThan(Integer value) {
            addCriterion("IsFibreCorp <", value, "isFibreCorp");
            return (Criteria) this;
        }

        public Criteria andIsFibreCorpLessThanOrEqualTo(Integer value) {
            addCriterion("IsFibreCorp <=", value, "isFibreCorp");
            return (Criteria) this;
        }

        public Criteria andIsFibreCorpIn(List<Integer> values) {
            addCriterion("IsFibreCorp in", values, "isFibreCorp");
            return (Criteria) this;
        }

        public Criteria andIsFibreCorpNotIn(List<Integer> values) {
            addCriterion("IsFibreCorp not in", values, "isFibreCorp");
            return (Criteria) this;
        }

        public Criteria andIsFibreCorpBetween(Integer value1, Integer value2) {
            addCriterion("IsFibreCorp between", value1, value2, "isFibreCorp");
            return (Criteria) this;
        }

        public Criteria andIsFibreCorpNotBetween(Integer value1, Integer value2) {
            addCriterion("IsFibreCorp not between", value1, value2, "isFibreCorp");
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

        public Criteria andHtImgIsNull() {
            addCriterion("HtImg is null");
            return (Criteria) this;
        }

        public Criteria andHtImgIsNotNull() {
            addCriterion("HtImg is not null");
            return (Criteria) this;
        }

        public Criteria andHtImgEqualTo(String value) {
            addCriterion("HtImg =", value, "htImg");
            return (Criteria) this;
        }

        public Criteria andHtImgNotEqualTo(String value) {
            addCriterion("HtImg <>", value, "htImg");
            return (Criteria) this;
        }

        public Criteria andHtImgGreaterThan(String value) {
            addCriterion("HtImg >", value, "htImg");
            return (Criteria) this;
        }

        public Criteria andHtImgGreaterThanOrEqualTo(String value) {
            addCriterion("HtImg >=", value, "htImg");
            return (Criteria) this;
        }

        public Criteria andHtImgLessThan(String value) {
            addCriterion("HtImg <", value, "htImg");
            return (Criteria) this;
        }

        public Criteria andHtImgLessThanOrEqualTo(String value) {
            addCriterion("HtImg <=", value, "htImg");
            return (Criteria) this;
        }

        public Criteria andHtImgLike(String value) {
            addCriterion("HtImg like", value, "htImg");
            return (Criteria) this;
        }

        public Criteria andHtImgNotLike(String value) {
            addCriterion("HtImg not like", value, "htImg");
            return (Criteria) this;
        }

        public Criteria andHtImgIn(List<String> values) {
            addCriterion("HtImg in", values, "htImg");
            return (Criteria) this;
        }

        public Criteria andHtImgNotIn(List<String> values) {
            addCriterion("HtImg not in", values, "htImg");
            return (Criteria) this;
        }

        public Criteria andHtImgBetween(String value1, String value2) {
            addCriterion("HtImg between", value1, value2, "htImg");
            return (Criteria) this;
        }

        public Criteria andHtImgNotBetween(String value1, String value2) {
            addCriterion("HtImg not between", value1, value2, "htImg");
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

        public Criteria andIsScIsNull() {
            addCriterion("IsSc is null");
            return (Criteria) this;
        }

        public Criteria andIsScIsNotNull() {
            addCriterion("IsSc is not null");
            return (Criteria) this;
        }

        public Criteria andIsScEqualTo(Integer value) {
            addCriterion("IsSc =", value, "isSc");
            return (Criteria) this;
        }

        public Criteria andIsScNotEqualTo(Integer value) {
            addCriterion("IsSc <>", value, "isSc");
            return (Criteria) this;
        }

        public Criteria andIsScGreaterThan(Integer value) {
            addCriterion("IsSc >", value, "isSc");
            return (Criteria) this;
        }

        public Criteria andIsScGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsSc >=", value, "isSc");
            return (Criteria) this;
        }

        public Criteria andIsScLessThan(Integer value) {
            addCriterion("IsSc <", value, "isSc");
            return (Criteria) this;
        }

        public Criteria andIsScLessThanOrEqualTo(Integer value) {
            addCriterion("IsSc <=", value, "isSc");
            return (Criteria) this;
        }

        public Criteria andIsScIn(List<Integer> values) {
            addCriterion("IsSc in", values, "isSc");
            return (Criteria) this;
        }

        public Criteria andIsScNotIn(List<Integer> values) {
            addCriterion("IsSc not in", values, "isSc");
            return (Criteria) this;
        }

        public Criteria andIsScBetween(Integer value1, Integer value2) {
            addCriterion("IsSc between", value1, value2, "isSc");
            return (Criteria) this;
        }

        public Criteria andIsScNotBetween(Integer value1, Integer value2) {
            addCriterion("IsSc not between", value1, value2, "isSc");
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