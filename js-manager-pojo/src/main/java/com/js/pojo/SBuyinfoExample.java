package com.js.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SBuyinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SBuyinfoExample() {
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

        public Criteria andBuyCateIsNull() {
            addCriterion("BuyCate is null");
            return (Criteria) this;
        }

        public Criteria andBuyCateIsNotNull() {
            addCriterion("BuyCate is not null");
            return (Criteria) this;
        }

        public Criteria andBuyCateEqualTo(String value) {
            addCriterion("BuyCate =", value, "buyCate");
            return (Criteria) this;
        }

        public Criteria andBuyCateNotEqualTo(String value) {
            addCriterion("BuyCate <>", value, "buyCate");
            return (Criteria) this;
        }

        public Criteria andBuyCateGreaterThan(String value) {
            addCriterion("BuyCate >", value, "buyCate");
            return (Criteria) this;
        }

        public Criteria andBuyCateGreaterThanOrEqualTo(String value) {
            addCriterion("BuyCate >=", value, "buyCate");
            return (Criteria) this;
        }

        public Criteria andBuyCateLessThan(String value) {
            addCriterion("BuyCate <", value, "buyCate");
            return (Criteria) this;
        }

        public Criteria andBuyCateLessThanOrEqualTo(String value) {
            addCriterion("BuyCate <=", value, "buyCate");
            return (Criteria) this;
        }

        public Criteria andBuyCateLike(String value) {
            addCriterion("BuyCate like", value, "buyCate");
            return (Criteria) this;
        }

        public Criteria andBuyCateNotLike(String value) {
            addCriterion("BuyCate not like", value, "buyCate");
            return (Criteria) this;
        }

        public Criteria andBuyCateIn(List<String> values) {
            addCriterion("BuyCate in", values, "buyCate");
            return (Criteria) this;
        }

        public Criteria andBuyCateNotIn(List<String> values) {
            addCriterion("BuyCate not in", values, "buyCate");
            return (Criteria) this;
        }

        public Criteria andBuyCateBetween(String value1, String value2) {
            addCriterion("BuyCate between", value1, value2, "buyCate");
            return (Criteria) this;
        }

        public Criteria andBuyCateNotBetween(String value1, String value2) {
            addCriterion("BuyCate not between", value1, value2, "buyCate");
            return (Criteria) this;
        }

        public Criteria andBuyClassIsNull() {
            addCriterion("BuyClass is null");
            return (Criteria) this;
        }

        public Criteria andBuyClassIsNotNull() {
            addCriterion("BuyClass is not null");
            return (Criteria) this;
        }

        public Criteria andBuyClassEqualTo(String value) {
            addCriterion("BuyClass =", value, "buyClass");
            return (Criteria) this;
        }

        public Criteria andBuyClassNotEqualTo(String value) {
            addCriterion("BuyClass <>", value, "buyClass");
            return (Criteria) this;
        }

        public Criteria andBuyClassGreaterThan(String value) {
            addCriterion("BuyClass >", value, "buyClass");
            return (Criteria) this;
        }

        public Criteria andBuyClassGreaterThanOrEqualTo(String value) {
            addCriterion("BuyClass >=", value, "buyClass");
            return (Criteria) this;
        }

        public Criteria andBuyClassLessThan(String value) {
            addCriterion("BuyClass <", value, "buyClass");
            return (Criteria) this;
        }

        public Criteria andBuyClassLessThanOrEqualTo(String value) {
            addCriterion("BuyClass <=", value, "buyClass");
            return (Criteria) this;
        }

        public Criteria andBuyClassLike(String value) {
            addCriterion("BuyClass like", value, "buyClass");
            return (Criteria) this;
        }

        public Criteria andBuyClassNotLike(String value) {
            addCriterion("BuyClass not like", value, "buyClass");
            return (Criteria) this;
        }

        public Criteria andBuyClassIn(List<String> values) {
            addCriterion("BuyClass in", values, "buyClass");
            return (Criteria) this;
        }

        public Criteria andBuyClassNotIn(List<String> values) {
            addCriterion("BuyClass not in", values, "buyClass");
            return (Criteria) this;
        }

        public Criteria andBuyClassBetween(String value1, String value2) {
            addCriterion("BuyClass between", value1, value2, "buyClass");
            return (Criteria) this;
        }

        public Criteria andBuyClassNotBetween(String value1, String value2) {
            addCriterion("BuyClass not between", value1, value2, "buyClass");
            return (Criteria) this;
        }

        public Criteria andUserIDIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUserIDIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIDEqualTo(Integer value) {
            addCriterion("UserID =", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotEqualTo(Integer value) {
            addCriterion("UserID <>", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDGreaterThan(Integer value) {
            addCriterion("UserID >", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserID >=", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLessThan(Integer value) {
            addCriterion("UserID <", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLessThanOrEqualTo(Integer value) {
            addCriterion("UserID <=", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDIn(List<Integer> values) {
            addCriterion("UserID in", values, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotIn(List<Integer> values) {
            addCriterion("UserID not in", values, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDBetween(Integer value1, Integer value2) {
            addCriterion("UserID between", value1, value2, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotBetween(Integer value1, Integer value2) {
            addCriterion("UserID not between", value1, value2, "userID");
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

        public Criteria andCorpnameIsNull() {
            addCriterion("Corpname is null");
            return (Criteria) this;
        }

        public Criteria andCorpnameIsNotNull() {
            addCriterion("Corpname is not null");
            return (Criteria) this;
        }

        public Criteria andCorpnameEqualTo(String value) {
            addCriterion("Corpname =", value, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameNotEqualTo(String value) {
            addCriterion("Corpname <>", value, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameGreaterThan(String value) {
            addCriterion("Corpname >", value, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameGreaterThanOrEqualTo(String value) {
            addCriterion("Corpname >=", value, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameLessThan(String value) {
            addCriterion("Corpname <", value, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameLessThanOrEqualTo(String value) {
            addCriterion("Corpname <=", value, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameLike(String value) {
            addCriterion("Corpname like", value, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameNotLike(String value) {
            addCriterion("Corpname not like", value, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameIn(List<String> values) {
            addCriterion("Corpname in", values, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameNotIn(List<String> values) {
            addCriterion("Corpname not in", values, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameBetween(String value1, String value2) {
            addCriterion("Corpname between", value1, value2, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameNotBetween(String value1, String value2) {
            addCriterion("Corpname not between", value1, value2, "corpname");
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

        public Criteria andBuyPriceIsNull() {
            addCriterion("BuyPrice is null");
            return (Criteria) this;
        }

        public Criteria andBuyPriceIsNotNull() {
            addCriterion("BuyPrice is not null");
            return (Criteria) this;
        }

        public Criteria andBuyPriceEqualTo(String value) {
            addCriterion("BuyPrice =", value, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceNotEqualTo(String value) {
            addCriterion("BuyPrice <>", value, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceGreaterThan(String value) {
            addCriterion("BuyPrice >", value, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceGreaterThanOrEqualTo(String value) {
            addCriterion("BuyPrice >=", value, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceLessThan(String value) {
            addCriterion("BuyPrice <", value, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceLessThanOrEqualTo(String value) {
            addCriterion("BuyPrice <=", value, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceLike(String value) {
            addCriterion("BuyPrice like", value, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceNotLike(String value) {
            addCriterion("BuyPrice not like", value, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceIn(List<String> values) {
            addCriterion("BuyPrice in", values, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceNotIn(List<String> values) {
            addCriterion("BuyPrice not in", values, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceBetween(String value1, String value2) {
            addCriterion("BuyPrice between", value1, value2, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceNotBetween(String value1, String value2) {
            addCriterion("BuyPrice not between", value1, value2, "buyPrice");
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

        public Criteria andValidtimeIsNull() {
            addCriterion("Validtime is null");
            return (Criteria) this;
        }

        public Criteria andValidtimeIsNotNull() {
            addCriterion("Validtime is not null");
            return (Criteria) this;
        }

        public Criteria andValidtimeEqualTo(Integer value) {
            addCriterion("Validtime =", value, "validtime");
            return (Criteria) this;
        }

        public Criteria andValidtimeNotEqualTo(Integer value) {
            addCriterion("Validtime <>", value, "validtime");
            return (Criteria) this;
        }

        public Criteria andValidtimeGreaterThan(Integer value) {
            addCriterion("Validtime >", value, "validtime");
            return (Criteria) this;
        }

        public Criteria andValidtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Validtime >=", value, "validtime");
            return (Criteria) this;
        }

        public Criteria andValidtimeLessThan(Integer value) {
            addCriterion("Validtime <", value, "validtime");
            return (Criteria) this;
        }

        public Criteria andValidtimeLessThanOrEqualTo(Integer value) {
            addCriterion("Validtime <=", value, "validtime");
            return (Criteria) this;
        }

        public Criteria andValidtimeIn(List<Integer> values) {
            addCriterion("Validtime in", values, "validtime");
            return (Criteria) this;
        }

        public Criteria andValidtimeNotIn(List<Integer> values) {
            addCriterion("Validtime not in", values, "validtime");
            return (Criteria) this;
        }

        public Criteria andValidtimeBetween(Integer value1, Integer value2) {
            addCriterion("Validtime between", value1, value2, "validtime");
            return (Criteria) this;
        }

        public Criteria andValidtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("Validtime not between", value1, value2, "validtime");
            return (Criteria) this;
        }

        public Criteria andProdImageIsNull() {
            addCriterion("ProdImage is null");
            return (Criteria) this;
        }

        public Criteria andProdImageIsNotNull() {
            addCriterion("ProdImage is not null");
            return (Criteria) this;
        }

        public Criteria andProdImageEqualTo(String value) {
            addCriterion("ProdImage =", value, "prodImage");
            return (Criteria) this;
        }

        public Criteria andProdImageNotEqualTo(String value) {
            addCriterion("ProdImage <>", value, "prodImage");
            return (Criteria) this;
        }

        public Criteria andProdImageGreaterThan(String value) {
            addCriterion("ProdImage >", value, "prodImage");
            return (Criteria) this;
        }

        public Criteria andProdImageGreaterThanOrEqualTo(String value) {
            addCriterion("ProdImage >=", value, "prodImage");
            return (Criteria) this;
        }

        public Criteria andProdImageLessThan(String value) {
            addCriterion("ProdImage <", value, "prodImage");
            return (Criteria) this;
        }

        public Criteria andProdImageLessThanOrEqualTo(String value) {
            addCriterion("ProdImage <=", value, "prodImage");
            return (Criteria) this;
        }

        public Criteria andProdImageLike(String value) {
            addCriterion("ProdImage like", value, "prodImage");
            return (Criteria) this;
        }

        public Criteria andProdImageNotLike(String value) {
            addCriterion("ProdImage not like", value, "prodImage");
            return (Criteria) this;
        }

        public Criteria andProdImageIn(List<String> values) {
            addCriterion("ProdImage in", values, "prodImage");
            return (Criteria) this;
        }

        public Criteria andProdImageNotIn(List<String> values) {
            addCriterion("ProdImage not in", values, "prodImage");
            return (Criteria) this;
        }

        public Criteria andProdImageBetween(String value1, String value2) {
            addCriterion("ProdImage between", value1, value2, "prodImage");
            return (Criteria) this;
        }

        public Criteria andProdImageNotBetween(String value1, String value2) {
            addCriterion("ProdImage not between", value1, value2, "prodImage");
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

        public Criteria andIsAutoIsNull() {
            addCriterion("IsAuto is null");
            return (Criteria) this;
        }

        public Criteria andIsAutoIsNotNull() {
            addCriterion("IsAuto is not null");
            return (Criteria) this;
        }

        public Criteria andIsAutoEqualTo(Integer value) {
            addCriterion("IsAuto =", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoNotEqualTo(Integer value) {
            addCriterion("IsAuto <>", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoGreaterThan(Integer value) {
            addCriterion("IsAuto >", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsAuto >=", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoLessThan(Integer value) {
            addCriterion("IsAuto <", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoLessThanOrEqualTo(Integer value) {
            addCriterion("IsAuto <=", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoIn(List<Integer> values) {
            addCriterion("IsAuto in", values, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoNotIn(List<Integer> values) {
            addCriterion("IsAuto not in", values, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoBetween(Integer value1, Integer value2) {
            addCriterion("IsAuto between", value1, value2, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoNotBetween(Integer value1, Integer value2) {
            addCriterion("IsAuto not between", value1, value2, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsEnIsNull() {
            addCriterion("IsEn is null");
            return (Criteria) this;
        }

        public Criteria andIsEnIsNotNull() {
            addCriterion("IsEn is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnEqualTo(Integer value) {
            addCriterion("IsEn =", value, "isEn");
            return (Criteria) this;
        }

        public Criteria andIsEnNotEqualTo(Integer value) {
            addCriterion("IsEn <>", value, "isEn");
            return (Criteria) this;
        }

        public Criteria andIsEnGreaterThan(Integer value) {
            addCriterion("IsEn >", value, "isEn");
            return (Criteria) this;
        }

        public Criteria andIsEnGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsEn >=", value, "isEn");
            return (Criteria) this;
        }

        public Criteria andIsEnLessThan(Integer value) {
            addCriterion("IsEn <", value, "isEn");
            return (Criteria) this;
        }

        public Criteria andIsEnLessThanOrEqualTo(Integer value) {
            addCriterion("IsEn <=", value, "isEn");
            return (Criteria) this;
        }

        public Criteria andIsEnIn(List<Integer> values) {
            addCriterion("IsEn in", values, "isEn");
            return (Criteria) this;
        }

        public Criteria andIsEnNotIn(List<Integer> values) {
            addCriterion("IsEn not in", values, "isEn");
            return (Criteria) this;
        }

        public Criteria andIsEnBetween(Integer value1, Integer value2) {
            addCriterion("IsEn between", value1, value2, "isEn");
            return (Criteria) this;
        }

        public Criteria andIsEnNotBetween(Integer value1, Integer value2) {
            addCriterion("IsEn not between", value1, value2, "isEn");
            return (Criteria) this;
        }

        public Criteria andIsAllMobileIsNull() {
            addCriterion("IsAllMobile is null");
            return (Criteria) this;
        }

        public Criteria andIsAllMobileIsNotNull() {
            addCriterion("IsAllMobile is not null");
            return (Criteria) this;
        }

        public Criteria andIsAllMobileEqualTo(Integer value) {
            addCriterion("IsAllMobile =", value, "isAllMobile");
            return (Criteria) this;
        }

        public Criteria andIsAllMobileNotEqualTo(Integer value) {
            addCriterion("IsAllMobile <>", value, "isAllMobile");
            return (Criteria) this;
        }

        public Criteria andIsAllMobileGreaterThan(Integer value) {
            addCriterion("IsAllMobile >", value, "isAllMobile");
            return (Criteria) this;
        }

        public Criteria andIsAllMobileGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsAllMobile >=", value, "isAllMobile");
            return (Criteria) this;
        }

        public Criteria andIsAllMobileLessThan(Integer value) {
            addCriterion("IsAllMobile <", value, "isAllMobile");
            return (Criteria) this;
        }

        public Criteria andIsAllMobileLessThanOrEqualTo(Integer value) {
            addCriterion("IsAllMobile <=", value, "isAllMobile");
            return (Criteria) this;
        }

        public Criteria andIsAllMobileIn(List<Integer> values) {
            addCriterion("IsAllMobile in", values, "isAllMobile");
            return (Criteria) this;
        }

        public Criteria andIsAllMobileNotIn(List<Integer> values) {
            addCriterion("IsAllMobile not in", values, "isAllMobile");
            return (Criteria) this;
        }

        public Criteria andIsAllMobileBetween(Integer value1, Integer value2) {
            addCriterion("IsAllMobile between", value1, value2, "isAllMobile");
            return (Criteria) this;
        }

        public Criteria andIsAllMobileNotBetween(Integer value1, Integer value2) {
            addCriterion("IsAllMobile not between", value1, value2, "isAllMobile");
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

        public Criteria andIsSpecIsNull() {
            addCriterion("IsSpec is null");
            return (Criteria) this;
        }

        public Criteria andIsSpecIsNotNull() {
            addCriterion("IsSpec is not null");
            return (Criteria) this;
        }

        public Criteria andIsSpecEqualTo(Integer value) {
            addCriterion("IsSpec =", value, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSpecNotEqualTo(Integer value) {
            addCriterion("IsSpec <>", value, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSpecGreaterThan(Integer value) {
            addCriterion("IsSpec >", value, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSpecGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsSpec >=", value, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSpecLessThan(Integer value) {
            addCriterion("IsSpec <", value, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSpecLessThanOrEqualTo(Integer value) {
            addCriterion("IsSpec <=", value, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSpecIn(List<Integer> values) {
            addCriterion("IsSpec in", values, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSpecNotIn(List<Integer> values) {
            addCriterion("IsSpec not in", values, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSpecBetween(Integer value1, Integer value2) {
            addCriterion("IsSpec between", value1, value2, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSpecNotBetween(Integer value1, Integer value2) {
            addCriterion("IsSpec not between", value1, value2, "isSpec");
            return (Criteria) this;
        }

        public Criteria andAutoDateIsNull() {
            addCriterion("AutoDate is null");
            return (Criteria) this;
        }

        public Criteria andAutoDateIsNotNull() {
            addCriterion("AutoDate is not null");
            return (Criteria) this;
        }

        public Criteria andAutoDateEqualTo(Date value) {
            addCriterion("AutoDate =", value, "autoDate");
            return (Criteria) this;
        }

        public Criteria andAutoDateNotEqualTo(Date value) {
            addCriterion("AutoDate <>", value, "autoDate");
            return (Criteria) this;
        }

        public Criteria andAutoDateGreaterThan(Date value) {
            addCriterion("AutoDate >", value, "autoDate");
            return (Criteria) this;
        }

        public Criteria andAutoDateGreaterThanOrEqualTo(Date value) {
            addCriterion("AutoDate >=", value, "autoDate");
            return (Criteria) this;
        }

        public Criteria andAutoDateLessThan(Date value) {
            addCriterion("AutoDate <", value, "autoDate");
            return (Criteria) this;
        }

        public Criteria andAutoDateLessThanOrEqualTo(Date value) {
            addCriterion("AutoDate <=", value, "autoDate");
            return (Criteria) this;
        }

        public Criteria andAutoDateIn(List<Date> values) {
            addCriterion("AutoDate in", values, "autoDate");
            return (Criteria) this;
        }

        public Criteria andAutoDateNotIn(List<Date> values) {
            addCriterion("AutoDate not in", values, "autoDate");
            return (Criteria) this;
        }

        public Criteria andAutoDateBetween(Date value1, Date value2) {
            addCriterion("AutoDate between", value1, value2, "autoDate");
            return (Criteria) this;
        }

        public Criteria andAutoDateNotBetween(Date value1, Date value2) {
            addCriterion("AutoDate not between", value1, value2, "autoDate");
            return (Criteria) this;
        }

        public Criteria andSxwMemo2IsNull() {
            addCriterion("SxwMemo2 is null");
            return (Criteria) this;
        }

        public Criteria andSxwMemo2IsNotNull() {
            addCriterion("SxwMemo2 is not null");
            return (Criteria) this;
        }

        public Criteria andSxwMemo2EqualTo(String value) {
            addCriterion("SxwMemo2 =", value, "sxwMemo2");
            return (Criteria) this;
        }

        public Criteria andSxwMemo2NotEqualTo(String value) {
            addCriterion("SxwMemo2 <>", value, "sxwMemo2");
            return (Criteria) this;
        }

        public Criteria andSxwMemo2GreaterThan(String value) {
            addCriterion("SxwMemo2 >", value, "sxwMemo2");
            return (Criteria) this;
        }

        public Criteria andSxwMemo2GreaterThanOrEqualTo(String value) {
            addCriterion("SxwMemo2 >=", value, "sxwMemo2");
            return (Criteria) this;
        }

        public Criteria andSxwMemo2LessThan(String value) {
            addCriterion("SxwMemo2 <", value, "sxwMemo2");
            return (Criteria) this;
        }

        public Criteria andSxwMemo2LessThanOrEqualTo(String value) {
            addCriterion("SxwMemo2 <=", value, "sxwMemo2");
            return (Criteria) this;
        }

        public Criteria andSxwMemo2Like(String value) {
            addCriterion("SxwMemo2 like", value, "sxwMemo2");
            return (Criteria) this;
        }

        public Criteria andSxwMemo2NotLike(String value) {
            addCriterion("SxwMemo2 not like", value, "sxwMemo2");
            return (Criteria) this;
        }

        public Criteria andSxwMemo2In(List<String> values) {
            addCriterion("SxwMemo2 in", values, "sxwMemo2");
            return (Criteria) this;
        }

        public Criteria andSxwMemo2NotIn(List<String> values) {
            addCriterion("SxwMemo2 not in", values, "sxwMemo2");
            return (Criteria) this;
        }

        public Criteria andSxwMemo2Between(String value1, String value2) {
            addCriterion("SxwMemo2 between", value1, value2, "sxwMemo2");
            return (Criteria) this;
        }

        public Criteria andSxwMemo2NotBetween(String value1, String value2) {
            addCriterion("SxwMemo2 not between", value1, value2, "sxwMemo2");
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

        public Criteria andAddIPIsNull() {
            addCriterion("AddIP is null");
            return (Criteria) this;
        }

        public Criteria andAddIPIsNotNull() {
            addCriterion("AddIP is not null");
            return (Criteria) this;
        }

        public Criteria andAddIPEqualTo(String value) {
            addCriterion("AddIP =", value, "addIP");
            return (Criteria) this;
        }

        public Criteria andAddIPNotEqualTo(String value) {
            addCriterion("AddIP <>", value, "addIP");
            return (Criteria) this;
        }

        public Criteria andAddIPGreaterThan(String value) {
            addCriterion("AddIP >", value, "addIP");
            return (Criteria) this;
        }

        public Criteria andAddIPGreaterThanOrEqualTo(String value) {
            addCriterion("AddIP >=", value, "addIP");
            return (Criteria) this;
        }

        public Criteria andAddIPLessThan(String value) {
            addCriterion("AddIP <", value, "addIP");
            return (Criteria) this;
        }

        public Criteria andAddIPLessThanOrEqualTo(String value) {
            addCriterion("AddIP <=", value, "addIP");
            return (Criteria) this;
        }

        public Criteria andAddIPLike(String value) {
            addCriterion("AddIP like", value, "addIP");
            return (Criteria) this;
        }

        public Criteria andAddIPNotLike(String value) {
            addCriterion("AddIP not like", value, "addIP");
            return (Criteria) this;
        }

        public Criteria andAddIPIn(List<String> values) {
            addCriterion("AddIP in", values, "addIP");
            return (Criteria) this;
        }

        public Criteria andAddIPNotIn(List<String> values) {
            addCriterion("AddIP not in", values, "addIP");
            return (Criteria) this;
        }

        public Criteria andAddIPBetween(String value1, String value2) {
            addCriterion("AddIP between", value1, value2, "addIP");
            return (Criteria) this;
        }

        public Criteria andAddIPNotBetween(String value1, String value2) {
            addCriterion("AddIP not between", value1, value2, "addIP");
            return (Criteria) this;
        }

        public Criteria andIsHiddenContIsNull() {
            addCriterion("IsHiddenCont is null");
            return (Criteria) this;
        }

        public Criteria andIsHiddenContIsNotNull() {
            addCriterion("IsHiddenCont is not null");
            return (Criteria) this;
        }

        public Criteria andIsHiddenContEqualTo(Integer value) {
            addCriterion("IsHiddenCont =", value, "isHiddenCont");
            return (Criteria) this;
        }

        public Criteria andIsHiddenContNotEqualTo(Integer value) {
            addCriterion("IsHiddenCont <>", value, "isHiddenCont");
            return (Criteria) this;
        }

        public Criteria andIsHiddenContGreaterThan(Integer value) {
            addCriterion("IsHiddenCont >", value, "isHiddenCont");
            return (Criteria) this;
        }

        public Criteria andIsHiddenContGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsHiddenCont >=", value, "isHiddenCont");
            return (Criteria) this;
        }

        public Criteria andIsHiddenContLessThan(Integer value) {
            addCriterion("IsHiddenCont <", value, "isHiddenCont");
            return (Criteria) this;
        }

        public Criteria andIsHiddenContLessThanOrEqualTo(Integer value) {
            addCriterion("IsHiddenCont <=", value, "isHiddenCont");
            return (Criteria) this;
        }

        public Criteria andIsHiddenContIn(List<Integer> values) {
            addCriterion("IsHiddenCont in", values, "isHiddenCont");
            return (Criteria) this;
        }

        public Criteria andIsHiddenContNotIn(List<Integer> values) {
            addCriterion("IsHiddenCont not in", values, "isHiddenCont");
            return (Criteria) this;
        }

        public Criteria andIsHiddenContBetween(Integer value1, Integer value2) {
            addCriterion("IsHiddenCont between", value1, value2, "isHiddenCont");
            return (Criteria) this;
        }

        public Criteria andIsHiddenContNotBetween(Integer value1, Integer value2) {
            addCriterion("IsHiddenCont not between", value1, value2, "isHiddenCont");
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

        public Criteria andIsTuanIsNull() {
            addCriterion("IsTuan is null");
            return (Criteria) this;
        }

        public Criteria andIsTuanIsNotNull() {
            addCriterion("IsTuan is not null");
            return (Criteria) this;
        }

        public Criteria andIsTuanEqualTo(Integer value) {
            addCriterion("IsTuan =", value, "isTuan");
            return (Criteria) this;
        }

        public Criteria andIsTuanNotEqualTo(Integer value) {
            addCriterion("IsTuan <>", value, "isTuan");
            return (Criteria) this;
        }

        public Criteria andIsTuanGreaterThan(Integer value) {
            addCriterion("IsTuan >", value, "isTuan");
            return (Criteria) this;
        }

        public Criteria andIsTuanGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsTuan >=", value, "isTuan");
            return (Criteria) this;
        }

        public Criteria andIsTuanLessThan(Integer value) {
            addCriterion("IsTuan <", value, "isTuan");
            return (Criteria) this;
        }

        public Criteria andIsTuanLessThanOrEqualTo(Integer value) {
            addCriterion("IsTuan <=", value, "isTuan");
            return (Criteria) this;
        }

        public Criteria andIsTuanIn(List<Integer> values) {
            addCriterion("IsTuan in", values, "isTuan");
            return (Criteria) this;
        }

        public Criteria andIsTuanNotIn(List<Integer> values) {
            addCriterion("IsTuan not in", values, "isTuan");
            return (Criteria) this;
        }

        public Criteria andIsTuanBetween(Integer value1, Integer value2) {
            addCriterion("IsTuan between", value1, value2, "isTuan");
            return (Criteria) this;
        }

        public Criteria andIsTuanNotBetween(Integer value1, Integer value2) {
            addCriterion("IsTuan not between", value1, value2, "isTuan");
            return (Criteria) this;
        }

        public Criteria andIsPriceSmsIsNull() {
            addCriterion("IsPriceSms is null");
            return (Criteria) this;
        }

        public Criteria andIsPriceSmsIsNotNull() {
            addCriterion("IsPriceSms is not null");
            return (Criteria) this;
        }

        public Criteria andIsPriceSmsEqualTo(Integer value) {
            addCriterion("IsPriceSms =", value, "isPriceSms");
            return (Criteria) this;
        }

        public Criteria andIsPriceSmsNotEqualTo(Integer value) {
            addCriterion("IsPriceSms <>", value, "isPriceSms");
            return (Criteria) this;
        }

        public Criteria andIsPriceSmsGreaterThan(Integer value) {
            addCriterion("IsPriceSms >", value, "isPriceSms");
            return (Criteria) this;
        }

        public Criteria andIsPriceSmsGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsPriceSms >=", value, "isPriceSms");
            return (Criteria) this;
        }

        public Criteria andIsPriceSmsLessThan(Integer value) {
            addCriterion("IsPriceSms <", value, "isPriceSms");
            return (Criteria) this;
        }

        public Criteria andIsPriceSmsLessThanOrEqualTo(Integer value) {
            addCriterion("IsPriceSms <=", value, "isPriceSms");
            return (Criteria) this;
        }

        public Criteria andIsPriceSmsIn(List<Integer> values) {
            addCriterion("IsPriceSms in", values, "isPriceSms");
            return (Criteria) this;
        }

        public Criteria andIsPriceSmsNotIn(List<Integer> values) {
            addCriterion("IsPriceSms not in", values, "isPriceSms");
            return (Criteria) this;
        }

        public Criteria andIsPriceSmsBetween(Integer value1, Integer value2) {
            addCriterion("IsPriceSms between", value1, value2, "isPriceSms");
            return (Criteria) this;
        }

        public Criteria andIsPriceSmsNotBetween(Integer value1, Integer value2) {
            addCriterion("IsPriceSms not between", value1, value2, "isPriceSms");
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

        public Criteria andProdCountIsNull() {
            addCriterion("ProdCount is null");
            return (Criteria) this;
        }

        public Criteria andProdCountIsNotNull() {
            addCriterion("ProdCount is not null");
            return (Criteria) this;
        }

        public Criteria andProdCountEqualTo(String value) {
            addCriterion("ProdCount =", value, "prodCount");
            return (Criteria) this;
        }

        public Criteria andProdCountNotEqualTo(String value) {
            addCriterion("ProdCount <>", value, "prodCount");
            return (Criteria) this;
        }

        public Criteria andProdCountGreaterThan(String value) {
            addCriterion("ProdCount >", value, "prodCount");
            return (Criteria) this;
        }

        public Criteria andProdCountGreaterThanOrEqualTo(String value) {
            addCriterion("ProdCount >=", value, "prodCount");
            return (Criteria) this;
        }

        public Criteria andProdCountLessThan(String value) {
            addCriterion("ProdCount <", value, "prodCount");
            return (Criteria) this;
        }

        public Criteria andProdCountLessThanOrEqualTo(String value) {
            addCriterion("ProdCount <=", value, "prodCount");
            return (Criteria) this;
        }

        public Criteria andProdCountLike(String value) {
            addCriterion("ProdCount like", value, "prodCount");
            return (Criteria) this;
        }

        public Criteria andProdCountNotLike(String value) {
            addCriterion("ProdCount not like", value, "prodCount");
            return (Criteria) this;
        }

        public Criteria andProdCountIn(List<String> values) {
            addCriterion("ProdCount in", values, "prodCount");
            return (Criteria) this;
        }

        public Criteria andProdCountNotIn(List<String> values) {
            addCriterion("ProdCount not in", values, "prodCount");
            return (Criteria) this;
        }

        public Criteria andProdCountBetween(String value1, String value2) {
            addCriterion("ProdCount between", value1, value2, "prodCount");
            return (Criteria) this;
        }

        public Criteria andProdCountNotBetween(String value1, String value2) {
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

        public Criteria andProdFsFsIsNull() {
            addCriterion("ProdFsFs is null");
            return (Criteria) this;
        }

        public Criteria andProdFsFsIsNotNull() {
            addCriterion("ProdFsFs is not null");
            return (Criteria) this;
        }

        public Criteria andProdFsFsEqualTo(String value) {
            addCriterion("ProdFsFs =", value, "prodFsFs");
            return (Criteria) this;
        }

        public Criteria andProdFsFsNotEqualTo(String value) {
            addCriterion("ProdFsFs <>", value, "prodFsFs");
            return (Criteria) this;
        }

        public Criteria andProdFsFsGreaterThan(String value) {
            addCriterion("ProdFsFs >", value, "prodFsFs");
            return (Criteria) this;
        }

        public Criteria andProdFsFsGreaterThanOrEqualTo(String value) {
            addCriterion("ProdFsFs >=", value, "prodFsFs");
            return (Criteria) this;
        }

        public Criteria andProdFsFsLessThan(String value) {
            addCriterion("ProdFsFs <", value, "prodFsFs");
            return (Criteria) this;
        }

        public Criteria andProdFsFsLessThanOrEqualTo(String value) {
            addCriterion("ProdFsFs <=", value, "prodFsFs");
            return (Criteria) this;
        }

        public Criteria andProdFsFsLike(String value) {
            addCriterion("ProdFsFs like", value, "prodFsFs");
            return (Criteria) this;
        }

        public Criteria andProdFsFsNotLike(String value) {
            addCriterion("ProdFsFs not like", value, "prodFsFs");
            return (Criteria) this;
        }

        public Criteria andProdFsFsIn(List<String> values) {
            addCriterion("ProdFsFs in", values, "prodFsFs");
            return (Criteria) this;
        }

        public Criteria andProdFsFsNotIn(List<String> values) {
            addCriterion("ProdFsFs not in", values, "prodFsFs");
            return (Criteria) this;
        }

        public Criteria andProdFsFsBetween(String value1, String value2) {
            addCriterion("ProdFsFs between", value1, value2, "prodFsFs");
            return (Criteria) this;
        }

        public Criteria andProdFsFsNotBetween(String value1, String value2) {
            addCriterion("ProdFsFs not between", value1, value2, "prodFsFs");
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

        public Criteria andCorpTypeIsNull() {
            addCriterion("CorpType is null");
            return (Criteria) this;
        }

        public Criteria andCorpTypeIsNotNull() {
            addCriterion("CorpType is not null");
            return (Criteria) this;
        }

        public Criteria andCorpTypeEqualTo(String value) {
            addCriterion("CorpType =", value, "corpType");
            return (Criteria) this;
        }

        public Criteria andCorpTypeNotEqualTo(String value) {
            addCriterion("CorpType <>", value, "corpType");
            return (Criteria) this;
        }

        public Criteria andCorpTypeGreaterThan(String value) {
            addCriterion("CorpType >", value, "corpType");
            return (Criteria) this;
        }

        public Criteria andCorpTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CorpType >=", value, "corpType");
            return (Criteria) this;
        }

        public Criteria andCorpTypeLessThan(String value) {
            addCriterion("CorpType <", value, "corpType");
            return (Criteria) this;
        }

        public Criteria andCorpTypeLessThanOrEqualTo(String value) {
            addCriterion("CorpType <=", value, "corpType");
            return (Criteria) this;
        }

        public Criteria andCorpTypeLike(String value) {
            addCriterion("CorpType like", value, "corpType");
            return (Criteria) this;
        }

        public Criteria andCorpTypeNotLike(String value) {
            addCriterion("CorpType not like", value, "corpType");
            return (Criteria) this;
        }

        public Criteria andCorpTypeIn(List<String> values) {
            addCriterion("CorpType in", values, "corpType");
            return (Criteria) this;
        }

        public Criteria andCorpTypeNotIn(List<String> values) {
            addCriterion("CorpType not in", values, "corpType");
            return (Criteria) this;
        }

        public Criteria andCorpTypeBetween(String value1, String value2) {
            addCriterion("CorpType between", value1, value2, "corpType");
            return (Criteria) this;
        }

        public Criteria andCorpTypeNotBetween(String value1, String value2) {
            addCriterion("CorpType not between", value1, value2, "corpType");
            return (Criteria) this;
        }

        public Criteria andBadCorpIDIsNull() {
            addCriterion("BadCorpID is null");
            return (Criteria) this;
        }

        public Criteria andBadCorpIDIsNotNull() {
            addCriterion("BadCorpID is not null");
            return (Criteria) this;
        }

        public Criteria andBadCorpIDEqualTo(String value) {
            addCriterion("BadCorpID =", value, "badCorpID");
            return (Criteria) this;
        }

        public Criteria andBadCorpIDNotEqualTo(String value) {
            addCriterion("BadCorpID <>", value, "badCorpID");
            return (Criteria) this;
        }

        public Criteria andBadCorpIDGreaterThan(String value) {
            addCriterion("BadCorpID >", value, "badCorpID");
            return (Criteria) this;
        }

        public Criteria andBadCorpIDGreaterThanOrEqualTo(String value) {
            addCriterion("BadCorpID >=", value, "badCorpID");
            return (Criteria) this;
        }

        public Criteria andBadCorpIDLessThan(String value) {
            addCriterion("BadCorpID <", value, "badCorpID");
            return (Criteria) this;
        }

        public Criteria andBadCorpIDLessThanOrEqualTo(String value) {
            addCriterion("BadCorpID <=", value, "badCorpID");
            return (Criteria) this;
        }

        public Criteria andBadCorpIDLike(String value) {
            addCriterion("BadCorpID like", value, "badCorpID");
            return (Criteria) this;
        }

        public Criteria andBadCorpIDNotLike(String value) {
            addCriterion("BadCorpID not like", value, "badCorpID");
            return (Criteria) this;
        }

        public Criteria andBadCorpIDIn(List<String> values) {
            addCriterion("BadCorpID in", values, "badCorpID");
            return (Criteria) this;
        }

        public Criteria andBadCorpIDNotIn(List<String> values) {
            addCriterion("BadCorpID not in", values, "badCorpID");
            return (Criteria) this;
        }

        public Criteria andBadCorpIDBetween(String value1, String value2) {
            addCriterion("BadCorpID between", value1, value2, "badCorpID");
            return (Criteria) this;
        }

        public Criteria andBadCorpIDNotBetween(String value1, String value2) {
            addCriterion("BadCorpID not between", value1, value2, "badCorpID");
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