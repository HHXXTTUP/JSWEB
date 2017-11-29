package com.js.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SProdinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SProdinfoExample() {
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

        public Criteria andBigCateIsNull() {
            addCriterion("BigCate is null");
            return (Criteria) this;
        }

        public Criteria andBigCateIsNotNull() {
            addCriterion("BigCate is not null");
            return (Criteria) this;
        }

        public Criteria andBigCateEqualTo(String value) {
            addCriterion("BigCate =", value, "bigCate");
            return (Criteria) this;
        }

        public Criteria andBigCateNotEqualTo(String value) {
            addCriterion("BigCate <>", value, "bigCate");
            return (Criteria) this;
        }

        public Criteria andBigCateGreaterThan(String value) {
            addCriterion("BigCate >", value, "bigCate");
            return (Criteria) this;
        }

        public Criteria andBigCateGreaterThanOrEqualTo(String value) {
            addCriterion("BigCate >=", value, "bigCate");
            return (Criteria) this;
        }

        public Criteria andBigCateLessThan(String value) {
            addCriterion("BigCate <", value, "bigCate");
            return (Criteria) this;
        }

        public Criteria andBigCateLessThanOrEqualTo(String value) {
            addCriterion("BigCate <=", value, "bigCate");
            return (Criteria) this;
        }

        public Criteria andBigCateLike(String value) {
            addCriterion("BigCate like", value, "bigCate");
            return (Criteria) this;
        }

        public Criteria andBigCateNotLike(String value) {
            addCriterion("BigCate not like", value, "bigCate");
            return (Criteria) this;
        }

        public Criteria andBigCateIn(List<String> values) {
            addCriterion("BigCate in", values, "bigCate");
            return (Criteria) this;
        }

        public Criteria andBigCateNotIn(List<String> values) {
            addCriterion("BigCate not in", values, "bigCate");
            return (Criteria) this;
        }

        public Criteria andBigCateBetween(String value1, String value2) {
            addCriterion("BigCate between", value1, value2, "bigCate");
            return (Criteria) this;
        }

        public Criteria andBigCateNotBetween(String value1, String value2) {
            addCriterion("BigCate not between", value1, value2, "bigCate");
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

        public Criteria andProdNameIsNull() {
            addCriterion("ProdName is null");
            return (Criteria) this;
        }

        public Criteria andProdNameIsNotNull() {
            addCriterion("ProdName is not null");
            return (Criteria) this;
        }

        public Criteria andProdNameEqualTo(String value) {
            addCriterion("ProdName =", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotEqualTo(String value) {
            addCriterion("ProdName <>", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameGreaterThan(String value) {
            addCriterion("ProdName >", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameGreaterThanOrEqualTo(String value) {
            addCriterion("ProdName >=", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLessThan(String value) {
            addCriterion("ProdName <", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLessThanOrEqualTo(String value) {
            addCriterion("ProdName <=", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLike(String value) {
            addCriterion("ProdName like", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotLike(String value) {
            addCriterion("ProdName not like", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameIn(List<String> values) {
            addCriterion("ProdName in", values, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotIn(List<String> values) {
            addCriterion("ProdName not in", values, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameBetween(String value1, String value2) {
            addCriterion("ProdName between", value1, value2, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotBetween(String value1, String value2) {
            addCriterion("ProdName not between", value1, value2, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdCountIsNull() {
            addCriterion("ProdCount is null");
            return (Criteria) this;
        }

        public Criteria andProdCountIsNotNull() {
            addCriterion("ProdCount is not null");
            return (Criteria) this;
        }

        public Criteria andProdCountEqualTo(Double value) {
            addCriterion("ProdCount =", value, "prodCount");
            return (Criteria) this;
        }

        public Criteria andProdCountNotEqualTo(Double value) {
            addCriterion("ProdCount <>", value, "prodCount");
            return (Criteria) this;
        }

        public Criteria andProdCountGreaterThan(Double value) {
            addCriterion("ProdCount >", value, "prodCount");
            return (Criteria) this;
        }

        public Criteria andProdCountGreaterThanOrEqualTo(Double value) {
            addCriterion("ProdCount >=", value, "prodCount");
            return (Criteria) this;
        }

        public Criteria andProdCountLessThan(Double value) {
            addCriterion("ProdCount <", value, "prodCount");
            return (Criteria) this;
        }

        public Criteria andProdCountLessThanOrEqualTo(Double value) {
            addCriterion("ProdCount <=", value, "prodCount");
            return (Criteria) this;
        }

        public Criteria andProdCountIn(List<Double> values) {
            addCriterion("ProdCount in", values, "prodCount");
            return (Criteria) this;
        }

        public Criteria andProdCountNotIn(List<Double> values) {
            addCriterion("ProdCount not in", values, "prodCount");
            return (Criteria) this;
        }

        public Criteria andProdCountBetween(Double value1, Double value2) {
            addCriterion("ProdCount between", value1, value2, "prodCount");
            return (Criteria) this;
        }

        public Criteria andProdCountNotBetween(Double value1, Double value2) {
            addCriterion("ProdCount not between", value1, value2, "prodCount");
            return (Criteria) this;
        }

        public Criteria andProdCountDwIsNull() {
            addCriterion("ProdCountDw is null");
            return (Criteria) this;
        }

        public Criteria andProdCountDwIsNotNull() {
            addCriterion("ProdCountDw is not null");
            return (Criteria) this;
        }

        public Criteria andProdCountDwEqualTo(String value) {
            addCriterion("ProdCountDw =", value, "prodCountDw");
            return (Criteria) this;
        }

        public Criteria andProdCountDwNotEqualTo(String value) {
            addCriterion("ProdCountDw <>", value, "prodCountDw");
            return (Criteria) this;
        }

        public Criteria andProdCountDwGreaterThan(String value) {
            addCriterion("ProdCountDw >", value, "prodCountDw");
            return (Criteria) this;
        }

        public Criteria andProdCountDwGreaterThanOrEqualTo(String value) {
            addCriterion("ProdCountDw >=", value, "prodCountDw");
            return (Criteria) this;
        }

        public Criteria andProdCountDwLessThan(String value) {
            addCriterion("ProdCountDw <", value, "prodCountDw");
            return (Criteria) this;
        }

        public Criteria andProdCountDwLessThanOrEqualTo(String value) {
            addCriterion("ProdCountDw <=", value, "prodCountDw");
            return (Criteria) this;
        }

        public Criteria andProdCountDwLike(String value) {
            addCriterion("ProdCountDw like", value, "prodCountDw");
            return (Criteria) this;
        }

        public Criteria andProdCountDwNotLike(String value) {
            addCriterion("ProdCountDw not like", value, "prodCountDw");
            return (Criteria) this;
        }

        public Criteria andProdCountDwIn(List<String> values) {
            addCriterion("ProdCountDw in", values, "prodCountDw");
            return (Criteria) this;
        }

        public Criteria andProdCountDwNotIn(List<String> values) {
            addCriterion("ProdCountDw not in", values, "prodCountDw");
            return (Criteria) this;
        }

        public Criteria andProdCountDwBetween(String value1, String value2) {
            addCriterion("ProdCountDw between", value1, value2, "prodCountDw");
            return (Criteria) this;
        }

        public Criteria andProdCountDwNotBetween(String value1, String value2) {
            addCriterion("ProdCountDw not between", value1, value2, "prodCountDw");
            return (Criteria) this;
        }

        public Criteria andProdCateIsNull() {
            addCriterion("ProdCate is null");
            return (Criteria) this;
        }

        public Criteria andProdCateIsNotNull() {
            addCriterion("ProdCate is not null");
            return (Criteria) this;
        }

        public Criteria andProdCateEqualTo(String value) {
            addCriterion("ProdCate =", value, "prodCate");
            return (Criteria) this;
        }

        public Criteria andProdCateNotEqualTo(String value) {
            addCriterion("ProdCate <>", value, "prodCate");
            return (Criteria) this;
        }

        public Criteria andProdCateGreaterThan(String value) {
            addCriterion("ProdCate >", value, "prodCate");
            return (Criteria) this;
        }

        public Criteria andProdCateGreaterThanOrEqualTo(String value) {
            addCriterion("ProdCate >=", value, "prodCate");
            return (Criteria) this;
        }

        public Criteria andProdCateLessThan(String value) {
            addCriterion("ProdCate <", value, "prodCate");
            return (Criteria) this;
        }

        public Criteria andProdCateLessThanOrEqualTo(String value) {
            addCriterion("ProdCate <=", value, "prodCate");
            return (Criteria) this;
        }

        public Criteria andProdCateLike(String value) {
            addCriterion("ProdCate like", value, "prodCate");
            return (Criteria) this;
        }

        public Criteria andProdCateNotLike(String value) {
            addCriterion("ProdCate not like", value, "prodCate");
            return (Criteria) this;
        }

        public Criteria andProdCateIn(List<String> values) {
            addCriterion("ProdCate in", values, "prodCate");
            return (Criteria) this;
        }

        public Criteria andProdCateNotIn(List<String> values) {
            addCriterion("ProdCate not in", values, "prodCate");
            return (Criteria) this;
        }

        public Criteria andProdCateBetween(String value1, String value2) {
            addCriterion("ProdCate between", value1, value2, "prodCate");
            return (Criteria) this;
        }

        public Criteria andProdCateNotBetween(String value1, String value2) {
            addCriterion("ProdCate not between", value1, value2, "prodCate");
            return (Criteria) this;
        }

        public Criteria andProdOtherCateIsNull() {
            addCriterion("ProdOtherCate is null");
            return (Criteria) this;
        }

        public Criteria andProdOtherCateIsNotNull() {
            addCriterion("ProdOtherCate is not null");
            return (Criteria) this;
        }

        public Criteria andProdOtherCateEqualTo(String value) {
            addCriterion("ProdOtherCate =", value, "prodOtherCate");
            return (Criteria) this;
        }

        public Criteria andProdOtherCateNotEqualTo(String value) {
            addCriterion("ProdOtherCate <>", value, "prodOtherCate");
            return (Criteria) this;
        }

        public Criteria andProdOtherCateGreaterThan(String value) {
            addCriterion("ProdOtherCate >", value, "prodOtherCate");
            return (Criteria) this;
        }

        public Criteria andProdOtherCateGreaterThanOrEqualTo(String value) {
            addCriterion("ProdOtherCate >=", value, "prodOtherCate");
            return (Criteria) this;
        }

        public Criteria andProdOtherCateLessThan(String value) {
            addCriterion("ProdOtherCate <", value, "prodOtherCate");
            return (Criteria) this;
        }

        public Criteria andProdOtherCateLessThanOrEqualTo(String value) {
            addCriterion("ProdOtherCate <=", value, "prodOtherCate");
            return (Criteria) this;
        }

        public Criteria andProdOtherCateLike(String value) {
            addCriterion("ProdOtherCate like", value, "prodOtherCate");
            return (Criteria) this;
        }

        public Criteria andProdOtherCateNotLike(String value) {
            addCriterion("ProdOtherCate not like", value, "prodOtherCate");
            return (Criteria) this;
        }

        public Criteria andProdOtherCateIn(List<String> values) {
            addCriterion("ProdOtherCate in", values, "prodOtherCate");
            return (Criteria) this;
        }

        public Criteria andProdOtherCateNotIn(List<String> values) {
            addCriterion("ProdOtherCate not in", values, "prodOtherCate");
            return (Criteria) this;
        }

        public Criteria andProdOtherCateBetween(String value1, String value2) {
            addCriterion("ProdOtherCate between", value1, value2, "prodOtherCate");
            return (Criteria) this;
        }

        public Criteria andProdOtherCateNotBetween(String value1, String value2) {
            addCriterion("ProdOtherCate not between", value1, value2, "prodOtherCate");
            return (Criteria) this;
        }

        public Criteria andUsterClassIsNull() {
            addCriterion("UsterClass is null");
            return (Criteria) this;
        }

        public Criteria andUsterClassIsNotNull() {
            addCriterion("UsterClass is not null");
            return (Criteria) this;
        }

        public Criteria andUsterClassEqualTo(String value) {
            addCriterion("UsterClass =", value, "usterClass");
            return (Criteria) this;
        }

        public Criteria andUsterClassNotEqualTo(String value) {
            addCriterion("UsterClass <>", value, "usterClass");
            return (Criteria) this;
        }

        public Criteria andUsterClassGreaterThan(String value) {
            addCriterion("UsterClass >", value, "usterClass");
            return (Criteria) this;
        }

        public Criteria andUsterClassGreaterThanOrEqualTo(String value) {
            addCriterion("UsterClass >=", value, "usterClass");
            return (Criteria) this;
        }

        public Criteria andUsterClassLessThan(String value) {
            addCriterion("UsterClass <", value, "usterClass");
            return (Criteria) this;
        }

        public Criteria andUsterClassLessThanOrEqualTo(String value) {
            addCriterion("UsterClass <=", value, "usterClass");
            return (Criteria) this;
        }

        public Criteria andUsterClassLike(String value) {
            addCriterion("UsterClass like", value, "usterClass");
            return (Criteria) this;
        }

        public Criteria andUsterClassNotLike(String value) {
            addCriterion("UsterClass not like", value, "usterClass");
            return (Criteria) this;
        }

        public Criteria andUsterClassIn(List<String> values) {
            addCriterion("UsterClass in", values, "usterClass");
            return (Criteria) this;
        }

        public Criteria andUsterClassNotIn(List<String> values) {
            addCriterion("UsterClass not in", values, "usterClass");
            return (Criteria) this;
        }

        public Criteria andUsterClassBetween(String value1, String value2) {
            addCriterion("UsterClass between", value1, value2, "usterClass");
            return (Criteria) this;
        }

        public Criteria andUsterClassNotBetween(String value1, String value2) {
            addCriterion("UsterClass not between", value1, value2, "usterClass");
            return (Criteria) this;
        }

        public Criteria andProdSizeIsNull() {
            addCriterion("ProdSize is null");
            return (Criteria) this;
        }

        public Criteria andProdSizeIsNotNull() {
            addCriterion("ProdSize is not null");
            return (Criteria) this;
        }

        public Criteria andProdSizeEqualTo(String value) {
            addCriterion("ProdSize =", value, "prodSize");
            return (Criteria) this;
        }

        public Criteria andProdSizeNotEqualTo(String value) {
            addCriterion("ProdSize <>", value, "prodSize");
            return (Criteria) this;
        }

        public Criteria andProdSizeGreaterThan(String value) {
            addCriterion("ProdSize >", value, "prodSize");
            return (Criteria) this;
        }

        public Criteria andProdSizeGreaterThanOrEqualTo(String value) {
            addCriterion("ProdSize >=", value, "prodSize");
            return (Criteria) this;
        }

        public Criteria andProdSizeLessThan(String value) {
            addCriterion("ProdSize <", value, "prodSize");
            return (Criteria) this;
        }

        public Criteria andProdSizeLessThanOrEqualTo(String value) {
            addCriterion("ProdSize <=", value, "prodSize");
            return (Criteria) this;
        }

        public Criteria andProdSizeLike(String value) {
            addCriterion("ProdSize like", value, "prodSize");
            return (Criteria) this;
        }

        public Criteria andProdSizeNotLike(String value) {
            addCriterion("ProdSize not like", value, "prodSize");
            return (Criteria) this;
        }

        public Criteria andProdSizeIn(List<String> values) {
            addCriterion("ProdSize in", values, "prodSize");
            return (Criteria) this;
        }

        public Criteria andProdSizeNotIn(List<String> values) {
            addCriterion("ProdSize not in", values, "prodSize");
            return (Criteria) this;
        }

        public Criteria andProdSizeBetween(String value1, String value2) {
            addCriterion("ProdSize between", value1, value2, "prodSize");
            return (Criteria) this;
        }

        public Criteria andProdSizeNotBetween(String value1, String value2) {
            addCriterion("ProdSize not between", value1, value2, "prodSize");
            return (Criteria) this;
        }

        public Criteria andProdBigCateIsNull() {
            addCriterion("ProdBigCate is null");
            return (Criteria) this;
        }

        public Criteria andProdBigCateIsNotNull() {
            addCriterion("ProdBigCate is not null");
            return (Criteria) this;
        }

        public Criteria andProdBigCateEqualTo(Integer value) {
            addCriterion("ProdBigCate =", value, "prodBigCate");
            return (Criteria) this;
        }

        public Criteria andProdBigCateNotEqualTo(Integer value) {
            addCriterion("ProdBigCate <>", value, "prodBigCate");
            return (Criteria) this;
        }

        public Criteria andProdBigCateGreaterThan(Integer value) {
            addCriterion("ProdBigCate >", value, "prodBigCate");
            return (Criteria) this;
        }

        public Criteria andProdBigCateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProdBigCate >=", value, "prodBigCate");
            return (Criteria) this;
        }

        public Criteria andProdBigCateLessThan(Integer value) {
            addCriterion("ProdBigCate <", value, "prodBigCate");
            return (Criteria) this;
        }

        public Criteria andProdBigCateLessThanOrEqualTo(Integer value) {
            addCriterion("ProdBigCate <=", value, "prodBigCate");
            return (Criteria) this;
        }

        public Criteria andProdBigCateIn(List<Integer> values) {
            addCriterion("ProdBigCate in", values, "prodBigCate");
            return (Criteria) this;
        }

        public Criteria andProdBigCateNotIn(List<Integer> values) {
            addCriterion("ProdBigCate not in", values, "prodBigCate");
            return (Criteria) this;
        }

        public Criteria andProdBigCateBetween(Integer value1, Integer value2) {
            addCriterion("ProdBigCate between", value1, value2, "prodBigCate");
            return (Criteria) this;
        }

        public Criteria andProdBigCateNotBetween(Integer value1, Integer value2) {
            addCriterion("ProdBigCate not between", value1, value2, "prodBigCate");
            return (Criteria) this;
        }

        public Criteria andYarnCateIsNull() {
            addCriterion("YarnCate is null");
            return (Criteria) this;
        }

        public Criteria andYarnCateIsNotNull() {
            addCriterion("YarnCate is not null");
            return (Criteria) this;
        }

        public Criteria andYarnCateEqualTo(String value) {
            addCriterion("YarnCate =", value, "yarnCate");
            return (Criteria) this;
        }

        public Criteria andYarnCateNotEqualTo(String value) {
            addCriterion("YarnCate <>", value, "yarnCate");
            return (Criteria) this;
        }

        public Criteria andYarnCateGreaterThan(String value) {
            addCriterion("YarnCate >", value, "yarnCate");
            return (Criteria) this;
        }

        public Criteria andYarnCateGreaterThanOrEqualTo(String value) {
            addCriterion("YarnCate >=", value, "yarnCate");
            return (Criteria) this;
        }

        public Criteria andYarnCateLessThan(String value) {
            addCriterion("YarnCate <", value, "yarnCate");
            return (Criteria) this;
        }

        public Criteria andYarnCateLessThanOrEqualTo(String value) {
            addCriterion("YarnCate <=", value, "yarnCate");
            return (Criteria) this;
        }

        public Criteria andYarnCateLike(String value) {
            addCriterion("YarnCate like", value, "yarnCate");
            return (Criteria) this;
        }

        public Criteria andYarnCateNotLike(String value) {
            addCriterion("YarnCate not like", value, "yarnCate");
            return (Criteria) this;
        }

        public Criteria andYarnCateIn(List<String> values) {
            addCriterion("YarnCate in", values, "yarnCate");
            return (Criteria) this;
        }

        public Criteria andYarnCateNotIn(List<String> values) {
            addCriterion("YarnCate not in", values, "yarnCate");
            return (Criteria) this;
        }

        public Criteria andYarnCateBetween(String value1, String value2) {
            addCriterion("YarnCate between", value1, value2, "yarnCate");
            return (Criteria) this;
        }

        public Criteria andYarnCateNotBetween(String value1, String value2) {
            addCriterion("YarnCate not between", value1, value2, "yarnCate");
            return (Criteria) this;
        }

        public Criteria andProdDsGxIsNull() {
            addCriterion("ProdDsGx is null");
            return (Criteria) this;
        }

        public Criteria andProdDsGxIsNotNull() {
            addCriterion("ProdDsGx is not null");
            return (Criteria) this;
        }

        public Criteria andProdDsGxEqualTo(String value) {
            addCriterion("ProdDsGx =", value, "prodDsGx");
            return (Criteria) this;
        }

        public Criteria andProdDsGxNotEqualTo(String value) {
            addCriterion("ProdDsGx <>", value, "prodDsGx");
            return (Criteria) this;
        }

        public Criteria andProdDsGxGreaterThan(String value) {
            addCriterion("ProdDsGx >", value, "prodDsGx");
            return (Criteria) this;
        }

        public Criteria andProdDsGxGreaterThanOrEqualTo(String value) {
            addCriterion("ProdDsGx >=", value, "prodDsGx");
            return (Criteria) this;
        }

        public Criteria andProdDsGxLessThan(String value) {
            addCriterion("ProdDsGx <", value, "prodDsGx");
            return (Criteria) this;
        }

        public Criteria andProdDsGxLessThanOrEqualTo(String value) {
            addCriterion("ProdDsGx <=", value, "prodDsGx");
            return (Criteria) this;
        }

        public Criteria andProdDsGxLike(String value) {
            addCriterion("ProdDsGx like", value, "prodDsGx");
            return (Criteria) this;
        }

        public Criteria andProdDsGxNotLike(String value) {
            addCriterion("ProdDsGx not like", value, "prodDsGx");
            return (Criteria) this;
        }

        public Criteria andProdDsGxIn(List<String> values) {
            addCriterion("ProdDsGx in", values, "prodDsGx");
            return (Criteria) this;
        }

        public Criteria andProdDsGxNotIn(List<String> values) {
            addCriterion("ProdDsGx not in", values, "prodDsGx");
            return (Criteria) this;
        }

        public Criteria andProdDsGxBetween(String value1, String value2) {
            addCriterion("ProdDsGx between", value1, value2, "prodDsGx");
            return (Criteria) this;
        }

        public Criteria andProdDsGxNotBetween(String value1, String value2) {
            addCriterion("ProdDsGx not between", value1, value2, "prodDsGx");
            return (Criteria) this;
        }

        public Criteria andProdGxNumIsNull() {
            addCriterion("ProdGxNum is null");
            return (Criteria) this;
        }

        public Criteria andProdGxNumIsNotNull() {
            addCriterion("ProdGxNum is not null");
            return (Criteria) this;
        }

        public Criteria andProdGxNumEqualTo(String value) {
            addCriterion("ProdGxNum =", value, "prodGxNum");
            return (Criteria) this;
        }

        public Criteria andProdGxNumNotEqualTo(String value) {
            addCriterion("ProdGxNum <>", value, "prodGxNum");
            return (Criteria) this;
        }

        public Criteria andProdGxNumGreaterThan(String value) {
            addCriterion("ProdGxNum >", value, "prodGxNum");
            return (Criteria) this;
        }

        public Criteria andProdGxNumGreaterThanOrEqualTo(String value) {
            addCriterion("ProdGxNum >=", value, "prodGxNum");
            return (Criteria) this;
        }

        public Criteria andProdGxNumLessThan(String value) {
            addCriterion("ProdGxNum <", value, "prodGxNum");
            return (Criteria) this;
        }

        public Criteria andProdGxNumLessThanOrEqualTo(String value) {
            addCriterion("ProdGxNum <=", value, "prodGxNum");
            return (Criteria) this;
        }

        public Criteria andProdGxNumLike(String value) {
            addCriterion("ProdGxNum like", value, "prodGxNum");
            return (Criteria) this;
        }

        public Criteria andProdGxNumNotLike(String value) {
            addCriterion("ProdGxNum not like", value, "prodGxNum");
            return (Criteria) this;
        }

        public Criteria andProdGxNumIn(List<String> values) {
            addCriterion("ProdGxNum in", values, "prodGxNum");
            return (Criteria) this;
        }

        public Criteria andProdGxNumNotIn(List<String> values) {
            addCriterion("ProdGxNum not in", values, "prodGxNum");
            return (Criteria) this;
        }

        public Criteria andProdGxNumBetween(String value1, String value2) {
            addCriterion("ProdGxNum between", value1, value2, "prodGxNum");
            return (Criteria) this;
        }

        public Criteria andProdGxNumNotBetween(String value1, String value2) {
            addCriterion("ProdGxNum not between", value1, value2, "prodGxNum");
            return (Criteria) this;
        }

        public Criteria andProdUseIsNull() {
            addCriterion("ProdUse is null");
            return (Criteria) this;
        }

        public Criteria andProdUseIsNotNull() {
            addCriterion("ProdUse is not null");
            return (Criteria) this;
        }

        public Criteria andProdUseEqualTo(String value) {
            addCriterion("ProdUse =", value, "prodUse");
            return (Criteria) this;
        }

        public Criteria andProdUseNotEqualTo(String value) {
            addCriterion("ProdUse <>", value, "prodUse");
            return (Criteria) this;
        }

        public Criteria andProdUseGreaterThan(String value) {
            addCriterion("ProdUse >", value, "prodUse");
            return (Criteria) this;
        }

        public Criteria andProdUseGreaterThanOrEqualTo(String value) {
            addCriterion("ProdUse >=", value, "prodUse");
            return (Criteria) this;
        }

        public Criteria andProdUseLessThan(String value) {
            addCriterion("ProdUse <", value, "prodUse");
            return (Criteria) this;
        }

        public Criteria andProdUseLessThanOrEqualTo(String value) {
            addCriterion("ProdUse <=", value, "prodUse");
            return (Criteria) this;
        }

        public Criteria andProdUseLike(String value) {
            addCriterion("ProdUse like", value, "prodUse");
            return (Criteria) this;
        }

        public Criteria andProdUseNotLike(String value) {
            addCriterion("ProdUse not like", value, "prodUse");
            return (Criteria) this;
        }

        public Criteria andProdUseIn(List<String> values) {
            addCriterion("ProdUse in", values, "prodUse");
            return (Criteria) this;
        }

        public Criteria andProdUseNotIn(List<String> values) {
            addCriterion("ProdUse not in", values, "prodUse");
            return (Criteria) this;
        }

        public Criteria andProdUseBetween(String value1, String value2) {
            addCriterion("ProdUse between", value1, value2, "prodUse");
            return (Criteria) this;
        }

        public Criteria andProdUseNotBetween(String value1, String value2) {
            addCriterion("ProdUse not between", value1, value2, "prodUse");
            return (Criteria) this;
        }

        public Criteria andFibreSourIsNull() {
            addCriterion("FibreSour is null");
            return (Criteria) this;
        }

        public Criteria andFibreSourIsNotNull() {
            addCriterion("FibreSour is not null");
            return (Criteria) this;
        }

        public Criteria andFibreSourEqualTo(String value) {
            addCriterion("FibreSour =", value, "fibreSour");
            return (Criteria) this;
        }

        public Criteria andFibreSourNotEqualTo(String value) {
            addCriterion("FibreSour <>", value, "fibreSour");
            return (Criteria) this;
        }

        public Criteria andFibreSourGreaterThan(String value) {
            addCriterion("FibreSour >", value, "fibreSour");
            return (Criteria) this;
        }

        public Criteria andFibreSourGreaterThanOrEqualTo(String value) {
            addCriterion("FibreSour >=", value, "fibreSour");
            return (Criteria) this;
        }

        public Criteria andFibreSourLessThan(String value) {
            addCriterion("FibreSour <", value, "fibreSour");
            return (Criteria) this;
        }

        public Criteria andFibreSourLessThanOrEqualTo(String value) {
            addCriterion("FibreSour <=", value, "fibreSour");
            return (Criteria) this;
        }

        public Criteria andFibreSourLike(String value) {
            addCriterion("FibreSour like", value, "fibreSour");
            return (Criteria) this;
        }

        public Criteria andFibreSourNotLike(String value) {
            addCriterion("FibreSour not like", value, "fibreSour");
            return (Criteria) this;
        }

        public Criteria andFibreSourIn(List<String> values) {
            addCriterion("FibreSour in", values, "fibreSour");
            return (Criteria) this;
        }

        public Criteria andFibreSourNotIn(List<String> values) {
            addCriterion("FibreSour not in", values, "fibreSour");
            return (Criteria) this;
        }

        public Criteria andFibreSourBetween(String value1, String value2) {
            addCriterion("FibreSour between", value1, value2, "fibreSour");
            return (Criteria) this;
        }

        public Criteria andFibreSourNotBetween(String value1, String value2) {
            addCriterion("FibreSour not between", value1, value2, "fibreSour");
            return (Criteria) this;
        }

        public Criteria andProdCate1IsNull() {
            addCriterion("ProdCate1 is null");
            return (Criteria) this;
        }

        public Criteria andProdCate1IsNotNull() {
            addCriterion("ProdCate1 is not null");
            return (Criteria) this;
        }

        public Criteria andProdCate1EqualTo(Integer value) {
            addCriterion("ProdCate1 =", value, "prodCate1");
            return (Criteria) this;
        }

        public Criteria andProdCate1NotEqualTo(Integer value) {
            addCriterion("ProdCate1 <>", value, "prodCate1");
            return (Criteria) this;
        }

        public Criteria andProdCate1GreaterThan(Integer value) {
            addCriterion("ProdCate1 >", value, "prodCate1");
            return (Criteria) this;
        }

        public Criteria andProdCate1GreaterThanOrEqualTo(Integer value) {
            addCriterion("ProdCate1 >=", value, "prodCate1");
            return (Criteria) this;
        }

        public Criteria andProdCate1LessThan(Integer value) {
            addCriterion("ProdCate1 <", value, "prodCate1");
            return (Criteria) this;
        }

        public Criteria andProdCate1LessThanOrEqualTo(Integer value) {
            addCriterion("ProdCate1 <=", value, "prodCate1");
            return (Criteria) this;
        }

        public Criteria andProdCate1In(List<Integer> values) {
            addCriterion("ProdCate1 in", values, "prodCate1");
            return (Criteria) this;
        }

        public Criteria andProdCate1NotIn(List<Integer> values) {
            addCriterion("ProdCate1 not in", values, "prodCate1");
            return (Criteria) this;
        }

        public Criteria andProdCate1Between(Integer value1, Integer value2) {
            addCriterion("ProdCate1 between", value1, value2, "prodCate1");
            return (Criteria) this;
        }

        public Criteria andProdCate1NotBetween(Integer value1, Integer value2) {
            addCriterion("ProdCate1 not between", value1, value2, "prodCate1");
            return (Criteria) this;
        }

        public Criteria andProdCate2IsNull() {
            addCriterion("ProdCate2 is null");
            return (Criteria) this;
        }

        public Criteria andProdCate2IsNotNull() {
            addCriterion("ProdCate2 is not null");
            return (Criteria) this;
        }

        public Criteria andProdCate2EqualTo(Integer value) {
            addCriterion("ProdCate2 =", value, "prodCate2");
            return (Criteria) this;
        }

        public Criteria andProdCate2NotEqualTo(Integer value) {
            addCriterion("ProdCate2 <>", value, "prodCate2");
            return (Criteria) this;
        }

        public Criteria andProdCate2GreaterThan(Integer value) {
            addCriterion("ProdCate2 >", value, "prodCate2");
            return (Criteria) this;
        }

        public Criteria andProdCate2GreaterThanOrEqualTo(Integer value) {
            addCriterion("ProdCate2 >=", value, "prodCate2");
            return (Criteria) this;
        }

        public Criteria andProdCate2LessThan(Integer value) {
            addCriterion("ProdCate2 <", value, "prodCate2");
            return (Criteria) this;
        }

        public Criteria andProdCate2LessThanOrEqualTo(Integer value) {
            addCriterion("ProdCate2 <=", value, "prodCate2");
            return (Criteria) this;
        }

        public Criteria andProdCate2In(List<Integer> values) {
            addCriterion("ProdCate2 in", values, "prodCate2");
            return (Criteria) this;
        }

        public Criteria andProdCate2NotIn(List<Integer> values) {
            addCriterion("ProdCate2 not in", values, "prodCate2");
            return (Criteria) this;
        }

        public Criteria andProdCate2Between(Integer value1, Integer value2) {
            addCriterion("ProdCate2 between", value1, value2, "prodCate2");
            return (Criteria) this;
        }

        public Criteria andProdCate2NotBetween(Integer value1, Integer value2) {
            addCriterion("ProdCate2 not between", value1, value2, "prodCate2");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("Price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("Price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("Price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPackIsNull() {
            addCriterion("Pack is null");
            return (Criteria) this;
        }

        public Criteria andPackIsNotNull() {
            addCriterion("Pack is not null");
            return (Criteria) this;
        }

        public Criteria andPackEqualTo(String value) {
            addCriterion("Pack =", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotEqualTo(String value) {
            addCriterion("Pack <>", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackGreaterThan(String value) {
            addCriterion("Pack >", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackGreaterThanOrEqualTo(String value) {
            addCriterion("Pack >=", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackLessThan(String value) {
            addCriterion("Pack <", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackLessThanOrEqualTo(String value) {
            addCriterion("Pack <=", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackLike(String value) {
            addCriterion("Pack like", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotLike(String value) {
            addCriterion("Pack not like", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackIn(List<String> values) {
            addCriterion("Pack in", values, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotIn(List<String> values) {
            addCriterion("Pack not in", values, "pack");
            return (Criteria) this;
        }

        public Criteria andPackBetween(String value1, String value2) {
            addCriterion("Pack between", value1, value2, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotBetween(String value1, String value2) {
            addCriterion("Pack not between", value1, value2, "pack");
            return (Criteria) this;
        }

        public Criteria andProdimageIsNull() {
            addCriterion("prodimage is null");
            return (Criteria) this;
        }

        public Criteria andProdimageIsNotNull() {
            addCriterion("prodimage is not null");
            return (Criteria) this;
        }

        public Criteria andProdimageEqualTo(String value) {
            addCriterion("prodimage =", value, "prodimage");
            return (Criteria) this;
        }

        public Criteria andProdimageNotEqualTo(String value) {
            addCriterion("prodimage <>", value, "prodimage");
            return (Criteria) this;
        }

        public Criteria andProdimageGreaterThan(String value) {
            addCriterion("prodimage >", value, "prodimage");
            return (Criteria) this;
        }

        public Criteria andProdimageGreaterThanOrEqualTo(String value) {
            addCriterion("prodimage >=", value, "prodimage");
            return (Criteria) this;
        }

        public Criteria andProdimageLessThan(String value) {
            addCriterion("prodimage <", value, "prodimage");
            return (Criteria) this;
        }

        public Criteria andProdimageLessThanOrEqualTo(String value) {
            addCriterion("prodimage <=", value, "prodimage");
            return (Criteria) this;
        }

        public Criteria andProdimageLike(String value) {
            addCriterion("prodimage like", value, "prodimage");
            return (Criteria) this;
        }

        public Criteria andProdimageNotLike(String value) {
            addCriterion("prodimage not like", value, "prodimage");
            return (Criteria) this;
        }

        public Criteria andProdimageIn(List<String> values) {
            addCriterion("prodimage in", values, "prodimage");
            return (Criteria) this;
        }

        public Criteria andProdimageNotIn(List<String> values) {
            addCriterion("prodimage not in", values, "prodimage");
            return (Criteria) this;
        }

        public Criteria andProdimageBetween(String value1, String value2) {
            addCriterion("prodimage between", value1, value2, "prodimage");
            return (Criteria) this;
        }

        public Criteria andProdimageNotBetween(String value1, String value2) {
            addCriterion("prodimage not between", value1, value2, "prodimage");
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

        public Criteria andAddDateOneIsNull() {
            addCriterion("AddDateOne is null");
            return (Criteria) this;
        }

        public Criteria andAddDateOneIsNotNull() {
            addCriterion("AddDateOne is not null");
            return (Criteria) this;
        }

        public Criteria andAddDateOneEqualTo(Date value) {
            addCriterion("AddDateOne =", value, "addDateOne");
            return (Criteria) this;
        }

        public Criteria andAddDateOneNotEqualTo(Date value) {
            addCriterion("AddDateOne <>", value, "addDateOne");
            return (Criteria) this;
        }

        public Criteria andAddDateOneGreaterThan(Date value) {
            addCriterion("AddDateOne >", value, "addDateOne");
            return (Criteria) this;
        }

        public Criteria andAddDateOneGreaterThanOrEqualTo(Date value) {
            addCriterion("AddDateOne >=", value, "addDateOne");
            return (Criteria) this;
        }

        public Criteria andAddDateOneLessThan(Date value) {
            addCriterion("AddDateOne <", value, "addDateOne");
            return (Criteria) this;
        }

        public Criteria andAddDateOneLessThanOrEqualTo(Date value) {
            addCriterion("AddDateOne <=", value, "addDateOne");
            return (Criteria) this;
        }

        public Criteria andAddDateOneIn(List<Date> values) {
            addCriterion("AddDateOne in", values, "addDateOne");
            return (Criteria) this;
        }

        public Criteria andAddDateOneNotIn(List<Date> values) {
            addCriterion("AddDateOne not in", values, "addDateOne");
            return (Criteria) this;
        }

        public Criteria andAddDateOneBetween(Date value1, Date value2) {
            addCriterion("AddDateOne between", value1, value2, "addDateOne");
            return (Criteria) this;
        }

        public Criteria andAddDateOneNotBetween(Date value1, Date value2) {
            addCriterion("AddDateOne not between", value1, value2, "addDateOne");
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

        public Criteria andGoodNoIsNull() {
            addCriterion("GoodNo is null");
            return (Criteria) this;
        }

        public Criteria andGoodNoIsNotNull() {
            addCriterion("GoodNo is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNoEqualTo(Integer value) {
            addCriterion("GoodNo =", value, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoNotEqualTo(Integer value) {
            addCriterion("GoodNo <>", value, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoGreaterThan(Integer value) {
            addCriterion("GoodNo >", value, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("GoodNo >=", value, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoLessThan(Integer value) {
            addCriterion("GoodNo <", value, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoLessThanOrEqualTo(Integer value) {
            addCriterion("GoodNo <=", value, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoIn(List<Integer> values) {
            addCriterion("GoodNo in", values, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoNotIn(List<Integer> values) {
            addCriterion("GoodNo not in", values, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoBetween(Integer value1, Integer value2) {
            addCriterion("GoodNo between", value1, value2, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoNotBetween(Integer value1, Integer value2) {
            addCriterion("GoodNo not between", value1, value2, "goodNo");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNull() {
            addCriterion("IsNew is null");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNotNull() {
            addCriterion("IsNew is not null");
            return (Criteria) this;
        }

        public Criteria andIsNewEqualTo(Integer value) {
            addCriterion("IsNew =", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotEqualTo(Integer value) {
            addCriterion("IsNew <>", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThan(Integer value) {
            addCriterion("IsNew >", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsNew >=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThan(Integer value) {
            addCriterion("IsNew <", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThanOrEqualTo(Integer value) {
            addCriterion("IsNew <=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewIn(List<Integer> values) {
            addCriterion("IsNew in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotIn(List<Integer> values) {
            addCriterion("IsNew not in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewBetween(Integer value1, Integer value2) {
            addCriterion("IsNew between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotBetween(Integer value1, Integer value2) {
            addCriterion("IsNew not between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsBj2010IsNull() {
            addCriterion("IsBj2010 is null");
            return (Criteria) this;
        }

        public Criteria andIsBj2010IsNotNull() {
            addCriterion("IsBj2010 is not null");
            return (Criteria) this;
        }

        public Criteria andIsBj2010EqualTo(Integer value) {
            addCriterion("IsBj2010 =", value, "isBj2010");
            return (Criteria) this;
        }

        public Criteria andIsBj2010NotEqualTo(Integer value) {
            addCriterion("IsBj2010 <>", value, "isBj2010");
            return (Criteria) this;
        }

        public Criteria andIsBj2010GreaterThan(Integer value) {
            addCriterion("IsBj2010 >", value, "isBj2010");
            return (Criteria) this;
        }

        public Criteria andIsBj2010GreaterThanOrEqualTo(Integer value) {
            addCriterion("IsBj2010 >=", value, "isBj2010");
            return (Criteria) this;
        }

        public Criteria andIsBj2010LessThan(Integer value) {
            addCriterion("IsBj2010 <", value, "isBj2010");
            return (Criteria) this;
        }

        public Criteria andIsBj2010LessThanOrEqualTo(Integer value) {
            addCriterion("IsBj2010 <=", value, "isBj2010");
            return (Criteria) this;
        }

        public Criteria andIsBj2010In(List<Integer> values) {
            addCriterion("IsBj2010 in", values, "isBj2010");
            return (Criteria) this;
        }

        public Criteria andIsBj2010NotIn(List<Integer> values) {
            addCriterion("IsBj2010 not in", values, "isBj2010");
            return (Criteria) this;
        }

        public Criteria andIsBj2010Between(Integer value1, Integer value2) {
            addCriterion("IsBj2010 between", value1, value2, "isBj2010");
            return (Criteria) this;
        }

        public Criteria andIsBj2010NotBetween(Integer value1, Integer value2) {
            addCriterion("IsBj2010 not between", value1, value2, "isBj2010");
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

        public Criteria andIPIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIPIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIPEqualTo(String value) {
            addCriterion("IP =", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotEqualTo(String value) {
            addCriterion("IP <>", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPGreaterThan(String value) {
            addCriterion("IP >", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPLessThan(String value) {
            addCriterion("IP <", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPLike(String value) {
            addCriterion("IP like", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotLike(String value) {
            addCriterion("IP not like", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPIn(List<String> values) {
            addCriterion("IP in", values, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotIn(List<String> values) {
            addCriterion("IP not in", values, "IP");
            return (Criteria) this;
        }

        public Criteria andIPBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "IP");
            return (Criteria) this;
        }

        public Criteria andIsUsterIsNull() {
            addCriterion("IsUster is null");
            return (Criteria) this;
        }

        public Criteria andIsUsterIsNotNull() {
            addCriterion("IsUster is not null");
            return (Criteria) this;
        }

        public Criteria andIsUsterEqualTo(Integer value) {
            addCriterion("IsUster =", value, "isUster");
            return (Criteria) this;
        }

        public Criteria andIsUsterNotEqualTo(Integer value) {
            addCriterion("IsUster <>", value, "isUster");
            return (Criteria) this;
        }

        public Criteria andIsUsterGreaterThan(Integer value) {
            addCriterion("IsUster >", value, "isUster");
            return (Criteria) this;
        }

        public Criteria andIsUsterGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsUster >=", value, "isUster");
            return (Criteria) this;
        }

        public Criteria andIsUsterLessThan(Integer value) {
            addCriterion("IsUster <", value, "isUster");
            return (Criteria) this;
        }

        public Criteria andIsUsterLessThanOrEqualTo(Integer value) {
            addCriterion("IsUster <=", value, "isUster");
            return (Criteria) this;
        }

        public Criteria andIsUsterIn(List<Integer> values) {
            addCriterion("IsUster in", values, "isUster");
            return (Criteria) this;
        }

        public Criteria andIsUsterNotIn(List<Integer> values) {
            addCriterion("IsUster not in", values, "isUster");
            return (Criteria) this;
        }

        public Criteria andIsUsterBetween(Integer value1, Integer value2) {
            addCriterion("IsUster between", value1, value2, "isUster");
            return (Criteria) this;
        }

        public Criteria andIsUsterNotBetween(Integer value1, Integer value2) {
            addCriterion("IsUster not between", value1, value2, "isUster");
            return (Criteria) this;
        }

        public Criteria andIsJPG01IsNull() {
            addCriterion("IsJPG01 is null");
            return (Criteria) this;
        }

        public Criteria andIsJPG01IsNotNull() {
            addCriterion("IsJPG01 is not null");
            return (Criteria) this;
        }

        public Criteria andIsJPG01EqualTo(Integer value) {
            addCriterion("IsJPG01 =", value, "isJPG01");
            return (Criteria) this;
        }

        public Criteria andIsJPG01NotEqualTo(Integer value) {
            addCriterion("IsJPG01 <>", value, "isJPG01");
            return (Criteria) this;
        }

        public Criteria andIsJPG01GreaterThan(Integer value) {
            addCriterion("IsJPG01 >", value, "isJPG01");
            return (Criteria) this;
        }

        public Criteria andIsJPG01GreaterThanOrEqualTo(Integer value) {
            addCriterion("IsJPG01 >=", value, "isJPG01");
            return (Criteria) this;
        }

        public Criteria andIsJPG01LessThan(Integer value) {
            addCriterion("IsJPG01 <", value, "isJPG01");
            return (Criteria) this;
        }

        public Criteria andIsJPG01LessThanOrEqualTo(Integer value) {
            addCriterion("IsJPG01 <=", value, "isJPG01");
            return (Criteria) this;
        }

        public Criteria andIsJPG01In(List<Integer> values) {
            addCriterion("IsJPG01 in", values, "isJPG01");
            return (Criteria) this;
        }

        public Criteria andIsJPG01NotIn(List<Integer> values) {
            addCriterion("IsJPG01 not in", values, "isJPG01");
            return (Criteria) this;
        }

        public Criteria andIsJPG01Between(Integer value1, Integer value2) {
            addCriterion("IsJPG01 between", value1, value2, "isJPG01");
            return (Criteria) this;
        }

        public Criteria andIsJPG01NotBetween(Integer value1, Integer value2) {
            addCriterion("IsJPG01 not between", value1, value2, "isJPG01");
            return (Criteria) this;
        }

        public Criteria andProdNoIsNull() {
            addCriterion("ProdNo is null");
            return (Criteria) this;
        }

        public Criteria andProdNoIsNotNull() {
            addCriterion("ProdNo is not null");
            return (Criteria) this;
        }

        public Criteria andProdNoEqualTo(Integer value) {
            addCriterion("ProdNo =", value, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoNotEqualTo(Integer value) {
            addCriterion("ProdNo <>", value, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoGreaterThan(Integer value) {
            addCriterion("ProdNo >", value, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProdNo >=", value, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoLessThan(Integer value) {
            addCriterion("ProdNo <", value, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoLessThanOrEqualTo(Integer value) {
            addCriterion("ProdNo <=", value, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoIn(List<Integer> values) {
            addCriterion("ProdNo in", values, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoNotIn(List<Integer> values) {
            addCriterion("ProdNo not in", values, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoBetween(Integer value1, Integer value2) {
            addCriterion("ProdNo between", value1, value2, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoNotBetween(Integer value1, Integer value2) {
            addCriterion("ProdNo not between", value1, value2, "prodNo");
            return (Criteria) this;
        }

        public Criteria andSearchNoIsNull() {
            addCriterion("SearchNo is null");
            return (Criteria) this;
        }

        public Criteria andSearchNoIsNotNull() {
            addCriterion("SearchNo is not null");
            return (Criteria) this;
        }

        public Criteria andSearchNoEqualTo(Integer value) {
            addCriterion("SearchNo =", value, "searchNo");
            return (Criteria) this;
        }

        public Criteria andSearchNoNotEqualTo(Integer value) {
            addCriterion("SearchNo <>", value, "searchNo");
            return (Criteria) this;
        }

        public Criteria andSearchNoGreaterThan(Integer value) {
            addCriterion("SearchNo >", value, "searchNo");
            return (Criteria) this;
        }

        public Criteria andSearchNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("SearchNo >=", value, "searchNo");
            return (Criteria) this;
        }

        public Criteria andSearchNoLessThan(Integer value) {
            addCriterion("SearchNo <", value, "searchNo");
            return (Criteria) this;
        }

        public Criteria andSearchNoLessThanOrEqualTo(Integer value) {
            addCriterion("SearchNo <=", value, "searchNo");
            return (Criteria) this;
        }

        public Criteria andSearchNoIn(List<Integer> values) {
            addCriterion("SearchNo in", values, "searchNo");
            return (Criteria) this;
        }

        public Criteria andSearchNoNotIn(List<Integer> values) {
            addCriterion("SearchNo not in", values, "searchNo");
            return (Criteria) this;
        }

        public Criteria andSearchNoBetween(Integer value1, Integer value2) {
            addCriterion("SearchNo between", value1, value2, "searchNo");
            return (Criteria) this;
        }

        public Criteria andSearchNoNotBetween(Integer value1, Integer value2) {
            addCriterion("SearchNo not between", value1, value2, "searchNo");
            return (Criteria) this;
        }

        public Criteria andIsCom4IsNull() {
            addCriterion("IsCom4 is null");
            return (Criteria) this;
        }

        public Criteria andIsCom4IsNotNull() {
            addCriterion("IsCom4 is not null");
            return (Criteria) this;
        }

        public Criteria andIsCom4EqualTo(Integer value) {
            addCriterion("IsCom4 =", value, "isCom4");
            return (Criteria) this;
        }

        public Criteria andIsCom4NotEqualTo(Integer value) {
            addCriterion("IsCom4 <>", value, "isCom4");
            return (Criteria) this;
        }

        public Criteria andIsCom4GreaterThan(Integer value) {
            addCriterion("IsCom4 >", value, "isCom4");
            return (Criteria) this;
        }

        public Criteria andIsCom4GreaterThanOrEqualTo(Integer value) {
            addCriterion("IsCom4 >=", value, "isCom4");
            return (Criteria) this;
        }

        public Criteria andIsCom4LessThan(Integer value) {
            addCriterion("IsCom4 <", value, "isCom4");
            return (Criteria) this;
        }

        public Criteria andIsCom4LessThanOrEqualTo(Integer value) {
            addCriterion("IsCom4 <=", value, "isCom4");
            return (Criteria) this;
        }

        public Criteria andIsCom4In(List<Integer> values) {
            addCriterion("IsCom4 in", values, "isCom4");
            return (Criteria) this;
        }

        public Criteria andIsCom4NotIn(List<Integer> values) {
            addCriterion("IsCom4 not in", values, "isCom4");
            return (Criteria) this;
        }

        public Criteria andIsCom4Between(Integer value1, Integer value2) {
            addCriterion("IsCom4 between", value1, value2, "isCom4");
            return (Criteria) this;
        }

        public Criteria andIsCom4NotBetween(Integer value1, Integer value2) {
            addCriterion("IsCom4 not between", value1, value2, "isCom4");
            return (Criteria) this;
        }

        public Criteria andTagsIsNull() {
            addCriterion("Tags is null");
            return (Criteria) this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("Tags is not null");
            return (Criteria) this;
        }

        public Criteria andTagsEqualTo(String value) {
            addCriterion("Tags =", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotEqualTo(String value) {
            addCriterion("Tags <>", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThan(String value) {
            addCriterion("Tags >", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(String value) {
            addCriterion("Tags >=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThan(String value) {
            addCriterion("Tags <", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThanOrEqualTo(String value) {
            addCriterion("Tags <=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLike(String value) {
            addCriterion("Tags like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotLike(String value) {
            addCriterion("Tags not like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsIn(List<String> values) {
            addCriterion("Tags in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotIn(List<String> values) {
            addCriterion("Tags not in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsBetween(String value1, String value2) {
            addCriterion("Tags between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotBetween(String value1, String value2) {
            addCriterion("Tags not between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andHtMemoIsNull() {
            addCriterion("HtMemo is null");
            return (Criteria) this;
        }

        public Criteria andHtMemoIsNotNull() {
            addCriterion("HtMemo is not null");
            return (Criteria) this;
        }

        public Criteria andHtMemoEqualTo(String value) {
            addCriterion("HtMemo =", value, "htMemo");
            return (Criteria) this;
        }

        public Criteria andHtMemoNotEqualTo(String value) {
            addCriterion("HtMemo <>", value, "htMemo");
            return (Criteria) this;
        }

        public Criteria andHtMemoGreaterThan(String value) {
            addCriterion("HtMemo >", value, "htMemo");
            return (Criteria) this;
        }

        public Criteria andHtMemoGreaterThanOrEqualTo(String value) {
            addCriterion("HtMemo >=", value, "htMemo");
            return (Criteria) this;
        }

        public Criteria andHtMemoLessThan(String value) {
            addCriterion("HtMemo <", value, "htMemo");
            return (Criteria) this;
        }

        public Criteria andHtMemoLessThanOrEqualTo(String value) {
            addCriterion("HtMemo <=", value, "htMemo");
            return (Criteria) this;
        }

        public Criteria andHtMemoLike(String value) {
            addCriterion("HtMemo like", value, "htMemo");
            return (Criteria) this;
        }

        public Criteria andHtMemoNotLike(String value) {
            addCriterion("HtMemo not like", value, "htMemo");
            return (Criteria) this;
        }

        public Criteria andHtMemoIn(List<String> values) {
            addCriterion("HtMemo in", values, "htMemo");
            return (Criteria) this;
        }

        public Criteria andHtMemoNotIn(List<String> values) {
            addCriterion("HtMemo not in", values, "htMemo");
            return (Criteria) this;
        }

        public Criteria andHtMemoBetween(String value1, String value2) {
            addCriterion("HtMemo between", value1, value2, "htMemo");
            return (Criteria) this;
        }

        public Criteria andHtMemoNotBetween(String value1, String value2) {
            addCriterion("HtMemo not between", value1, value2, "htMemo");
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