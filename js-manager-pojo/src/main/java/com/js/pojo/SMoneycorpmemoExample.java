package com.js.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SMoneycorpmemoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SMoneycorpmemoExample() {
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

        public Criteria andIsSCIsNull() {
            addCriterion("IsSC is null");
            return (Criteria) this;
        }

        public Criteria andIsSCIsNotNull() {
            addCriterion("IsSC is not null");
            return (Criteria) this;
        }

        public Criteria andIsSCEqualTo(Integer value) {
            addCriterion("IsSC =", value, "isSC");
            return (Criteria) this;
        }

        public Criteria andIsSCNotEqualTo(Integer value) {
            addCriterion("IsSC <>", value, "isSC");
            return (Criteria) this;
        }

        public Criteria andIsSCGreaterThan(Integer value) {
            addCriterion("IsSC >", value, "isSC");
            return (Criteria) this;
        }

        public Criteria andIsSCGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsSC >=", value, "isSC");
            return (Criteria) this;
        }

        public Criteria andIsSCLessThan(Integer value) {
            addCriterion("IsSC <", value, "isSC");
            return (Criteria) this;
        }

        public Criteria andIsSCLessThanOrEqualTo(Integer value) {
            addCriterion("IsSC <=", value, "isSC");
            return (Criteria) this;
        }

        public Criteria andIsSCIn(List<Integer> values) {
            addCriterion("IsSC in", values, "isSC");
            return (Criteria) this;
        }

        public Criteria andIsSCNotIn(List<Integer> values) {
            addCriterion("IsSC not in", values, "isSC");
            return (Criteria) this;
        }

        public Criteria andIsSCBetween(Integer value1, Integer value2) {
            addCriterion("IsSC between", value1, value2, "isSC");
            return (Criteria) this;
        }

        public Criteria andIsSCNotBetween(Integer value1, Integer value2) {
            addCriterion("IsSC not between", value1, value2, "isSC");
            return (Criteria) this;
        }

        public Criteria andMoneyCateIsNull() {
            addCriterion("MoneyCate is null");
            return (Criteria) this;
        }

        public Criteria andMoneyCateIsNotNull() {
            addCriterion("MoneyCate is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyCateEqualTo(String value) {
            addCriterion("MoneyCate =", value, "moneyCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCateNotEqualTo(String value) {
            addCriterion("MoneyCate <>", value, "moneyCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCateGreaterThan(String value) {
            addCriterion("MoneyCate >", value, "moneyCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCateGreaterThanOrEqualTo(String value) {
            addCriterion("MoneyCate >=", value, "moneyCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCateLessThan(String value) {
            addCriterion("MoneyCate <", value, "moneyCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCateLessThanOrEqualTo(String value) {
            addCriterion("MoneyCate <=", value, "moneyCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCateLike(String value) {
            addCriterion("MoneyCate like", value, "moneyCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCateNotLike(String value) {
            addCriterion("MoneyCate not like", value, "moneyCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCateIn(List<String> values) {
            addCriterion("MoneyCate in", values, "moneyCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCateNotIn(List<String> values) {
            addCriterion("MoneyCate not in", values, "moneyCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCateBetween(String value1, String value2) {
            addCriterion("MoneyCate between", value1, value2, "moneyCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCateNotBetween(String value1, String value2) {
            addCriterion("MoneyCate not between", value1, value2, "moneyCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_JsIsNull() {
            addCriterion("MoneyCate_Js is null");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_JsIsNotNull() {
            addCriterion("MoneyCate_Js is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_JsEqualTo(String value) {
            addCriterion("MoneyCate_Js =", value, "moneyCate_Js");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_JsNotEqualTo(String value) {
            addCriterion("MoneyCate_Js <>", value, "moneyCate_Js");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_JsGreaterThan(String value) {
            addCriterion("MoneyCate_Js >", value, "moneyCate_Js");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_JsGreaterThanOrEqualTo(String value) {
            addCriterion("MoneyCate_Js >=", value, "moneyCate_Js");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_JsLessThan(String value) {
            addCriterion("MoneyCate_Js <", value, "moneyCate_Js");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_JsLessThanOrEqualTo(String value) {
            addCriterion("MoneyCate_Js <=", value, "moneyCate_Js");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_JsLike(String value) {
            addCriterion("MoneyCate_Js like", value, "moneyCate_Js");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_JsNotLike(String value) {
            addCriterion("MoneyCate_Js not like", value, "moneyCate_Js");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_JsIn(List<String> values) {
            addCriterion("MoneyCate_Js in", values, "moneyCate_Js");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_JsNotIn(List<String> values) {
            addCriterion("MoneyCate_Js not in", values, "moneyCate_Js");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_JsBetween(String value1, String value2) {
            addCriterion("MoneyCate_Js between", value1, value2, "moneyCate_Js");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_JsNotBetween(String value1, String value2) {
            addCriterion("MoneyCate_Js not between", value1, value2, "moneyCate_Js");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_FztIsNull() {
            addCriterion("MoneyCate_Fzt is null");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_FztIsNotNull() {
            addCriterion("MoneyCate_Fzt is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_FztEqualTo(String value) {
            addCriterion("MoneyCate_Fzt =", value, "moneyCate_Fzt");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_FztNotEqualTo(String value) {
            addCriterion("MoneyCate_Fzt <>", value, "moneyCate_Fzt");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_FztGreaterThan(String value) {
            addCriterion("MoneyCate_Fzt >", value, "moneyCate_Fzt");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_FztGreaterThanOrEqualTo(String value) {
            addCriterion("MoneyCate_Fzt >=", value, "moneyCate_Fzt");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_FztLessThan(String value) {
            addCriterion("MoneyCate_Fzt <", value, "moneyCate_Fzt");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_FztLessThanOrEqualTo(String value) {
            addCriterion("MoneyCate_Fzt <=", value, "moneyCate_Fzt");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_FztLike(String value) {
            addCriterion("MoneyCate_Fzt like", value, "moneyCate_Fzt");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_FztNotLike(String value) {
            addCriterion("MoneyCate_Fzt not like", value, "moneyCate_Fzt");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_FztIn(List<String> values) {
            addCriterion("MoneyCate_Fzt in", values, "moneyCate_Fzt");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_FztNotIn(List<String> values) {
            addCriterion("MoneyCate_Fzt not in", values, "moneyCate_Fzt");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_FztBetween(String value1, String value2) {
            addCriterion("MoneyCate_Fzt between", value1, value2, "moneyCate_Fzt");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_FztNotBetween(String value1, String value2) {
            addCriterion("MoneyCate_Fzt not between", value1, value2, "moneyCate_Fzt");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_ESIsNull() {
            addCriterion("MoneyCate_ES is null");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_ESIsNotNull() {
            addCriterion("MoneyCate_ES is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_ESEqualTo(String value) {
            addCriterion("MoneyCate_ES =", value, "moneyCate_ES");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_ESNotEqualTo(String value) {
            addCriterion("MoneyCate_ES <>", value, "moneyCate_ES");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_ESGreaterThan(String value) {
            addCriterion("MoneyCate_ES >", value, "moneyCate_ES");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_ESGreaterThanOrEqualTo(String value) {
            addCriterion("MoneyCate_ES >=", value, "moneyCate_ES");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_ESLessThan(String value) {
            addCriterion("MoneyCate_ES <", value, "moneyCate_ES");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_ESLessThanOrEqualTo(String value) {
            addCriterion("MoneyCate_ES <=", value, "moneyCate_ES");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_ESLike(String value) {
            addCriterion("MoneyCate_ES like", value, "moneyCate_ES");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_ESNotLike(String value) {
            addCriterion("MoneyCate_ES not like", value, "moneyCate_ES");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_ESIn(List<String> values) {
            addCriterion("MoneyCate_ES in", values, "moneyCate_ES");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_ESNotIn(List<String> values) {
            addCriterion("MoneyCate_ES not in", values, "moneyCate_ES");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_ESBetween(String value1, String value2) {
            addCriterion("MoneyCate_ES between", value1, value2, "moneyCate_ES");
            return (Criteria) this;
        }

        public Criteria andMoneyCate_ESNotBetween(String value1, String value2) {
            addCriterion("MoneyCate_ES not between", value1, value2, "moneyCate_ES");
            return (Criteria) this;
        }

        public Criteria andMoneyInOutIsNull() {
            addCriterion("MoneyInOut is null");
            return (Criteria) this;
        }

        public Criteria andMoneyInOutIsNotNull() {
            addCriterion("MoneyInOut is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyInOutEqualTo(Integer value) {
            addCriterion("MoneyInOut =", value, "moneyInOut");
            return (Criteria) this;
        }

        public Criteria andMoneyInOutNotEqualTo(Integer value) {
            addCriterion("MoneyInOut <>", value, "moneyInOut");
            return (Criteria) this;
        }

        public Criteria andMoneyInOutGreaterThan(Integer value) {
            addCriterion("MoneyInOut >", value, "moneyInOut");
            return (Criteria) this;
        }

        public Criteria andMoneyInOutGreaterThanOrEqualTo(Integer value) {
            addCriterion("MoneyInOut >=", value, "moneyInOut");
            return (Criteria) this;
        }

        public Criteria andMoneyInOutLessThan(Integer value) {
            addCriterion("MoneyInOut <", value, "moneyInOut");
            return (Criteria) this;
        }

        public Criteria andMoneyInOutLessThanOrEqualTo(Integer value) {
            addCriterion("MoneyInOut <=", value, "moneyInOut");
            return (Criteria) this;
        }

        public Criteria andMoneyInOutIn(List<Integer> values) {
            addCriterion("MoneyInOut in", values, "moneyInOut");
            return (Criteria) this;
        }

        public Criteria andMoneyInOutNotIn(List<Integer> values) {
            addCriterion("MoneyInOut not in", values, "moneyInOut");
            return (Criteria) this;
        }

        public Criteria andMoneyInOutBetween(Integer value1, Integer value2) {
            addCriterion("MoneyInOut between", value1, value2, "moneyInOut");
            return (Criteria) this;
        }

        public Criteria andMoneyInOutNotBetween(Integer value1, Integer value2) {
            addCriterion("MoneyInOut not between", value1, value2, "moneyInOut");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney1IsNull() {
            addCriterion("MoneyMenuMoney1 is null");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney1IsNotNull() {
            addCriterion("MoneyMenuMoney1 is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney1EqualTo(Double value) {
            addCriterion("MoneyMenuMoney1 =", value, "moneyMenuMoney1");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney1NotEqualTo(Double value) {
            addCriterion("MoneyMenuMoney1 <>", value, "moneyMenuMoney1");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney1GreaterThan(Double value) {
            addCriterion("MoneyMenuMoney1 >", value, "moneyMenuMoney1");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney1GreaterThanOrEqualTo(Double value) {
            addCriterion("MoneyMenuMoney1 >=", value, "moneyMenuMoney1");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney1LessThan(Double value) {
            addCriterion("MoneyMenuMoney1 <", value, "moneyMenuMoney1");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney1LessThanOrEqualTo(Double value) {
            addCriterion("MoneyMenuMoney1 <=", value, "moneyMenuMoney1");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney1In(List<Double> values) {
            addCriterion("MoneyMenuMoney1 in", values, "moneyMenuMoney1");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney1NotIn(List<Double> values) {
            addCriterion("MoneyMenuMoney1 not in", values, "moneyMenuMoney1");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney1Between(Double value1, Double value2) {
            addCriterion("MoneyMenuMoney1 between", value1, value2, "moneyMenuMoney1");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney1NotBetween(Double value1, Double value2) {
            addCriterion("MoneyMenuMoney1 not between", value1, value2, "moneyMenuMoney1");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney2IsNull() {
            addCriterion("MoneyMenuMoney2 is null");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney2IsNotNull() {
            addCriterion("MoneyMenuMoney2 is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney2EqualTo(Double value) {
            addCriterion("MoneyMenuMoney2 =", value, "moneyMenuMoney2");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney2NotEqualTo(Double value) {
            addCriterion("MoneyMenuMoney2 <>", value, "moneyMenuMoney2");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney2GreaterThan(Double value) {
            addCriterion("MoneyMenuMoney2 >", value, "moneyMenuMoney2");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney2GreaterThanOrEqualTo(Double value) {
            addCriterion("MoneyMenuMoney2 >=", value, "moneyMenuMoney2");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney2LessThan(Double value) {
            addCriterion("MoneyMenuMoney2 <", value, "moneyMenuMoney2");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney2LessThanOrEqualTo(Double value) {
            addCriterion("MoneyMenuMoney2 <=", value, "moneyMenuMoney2");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney2In(List<Double> values) {
            addCriterion("MoneyMenuMoney2 in", values, "moneyMenuMoney2");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney2NotIn(List<Double> values) {
            addCriterion("MoneyMenuMoney2 not in", values, "moneyMenuMoney2");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney2Between(Double value1, Double value2) {
            addCriterion("MoneyMenuMoney2 between", value1, value2, "moneyMenuMoney2");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney2NotBetween(Double value1, Double value2) {
            addCriterion("MoneyMenuMoney2 not between", value1, value2, "moneyMenuMoney2");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney3IsNull() {
            addCriterion("MoneyMenuMoney3 is null");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney3IsNotNull() {
            addCriterion("MoneyMenuMoney3 is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney3EqualTo(Double value) {
            addCriterion("MoneyMenuMoney3 =", value, "moneyMenuMoney3");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney3NotEqualTo(Double value) {
            addCriterion("MoneyMenuMoney3 <>", value, "moneyMenuMoney3");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney3GreaterThan(Double value) {
            addCriterion("MoneyMenuMoney3 >", value, "moneyMenuMoney3");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney3GreaterThanOrEqualTo(Double value) {
            addCriterion("MoneyMenuMoney3 >=", value, "moneyMenuMoney3");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney3LessThan(Double value) {
            addCriterion("MoneyMenuMoney3 <", value, "moneyMenuMoney3");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney3LessThanOrEqualTo(Double value) {
            addCriterion("MoneyMenuMoney3 <=", value, "moneyMenuMoney3");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney3In(List<Double> values) {
            addCriterion("MoneyMenuMoney3 in", values, "moneyMenuMoney3");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney3NotIn(List<Double> values) {
            addCriterion("MoneyMenuMoney3 not in", values, "moneyMenuMoney3");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney3Between(Double value1, Double value2) {
            addCriterion("MoneyMenuMoney3 between", value1, value2, "moneyMenuMoney3");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney3NotBetween(Double value1, Double value2) {
            addCriterion("MoneyMenuMoney3 not between", value1, value2, "moneyMenuMoney3");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney4IsNull() {
            addCriterion("MoneyMenuMoney4 is null");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney4IsNotNull() {
            addCriterion("MoneyMenuMoney4 is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney4EqualTo(Double value) {
            addCriterion("MoneyMenuMoney4 =", value, "moneyMenuMoney4");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney4NotEqualTo(Double value) {
            addCriterion("MoneyMenuMoney4 <>", value, "moneyMenuMoney4");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney4GreaterThan(Double value) {
            addCriterion("MoneyMenuMoney4 >", value, "moneyMenuMoney4");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney4GreaterThanOrEqualTo(Double value) {
            addCriterion("MoneyMenuMoney4 >=", value, "moneyMenuMoney4");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney4LessThan(Double value) {
            addCriterion("MoneyMenuMoney4 <", value, "moneyMenuMoney4");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney4LessThanOrEqualTo(Double value) {
            addCriterion("MoneyMenuMoney4 <=", value, "moneyMenuMoney4");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney4In(List<Double> values) {
            addCriterion("MoneyMenuMoney4 in", values, "moneyMenuMoney4");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney4NotIn(List<Double> values) {
            addCriterion("MoneyMenuMoney4 not in", values, "moneyMenuMoney4");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney4Between(Double value1, Double value2) {
            addCriterion("MoneyMenuMoney4 between", value1, value2, "moneyMenuMoney4");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney4NotBetween(Double value1, Double value2) {
            addCriterion("MoneyMenuMoney4 not between", value1, value2, "moneyMenuMoney4");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney5IsNull() {
            addCriterion("MoneyMenuMoney5 is null");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney5IsNotNull() {
            addCriterion("MoneyMenuMoney5 is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney5EqualTo(Double value) {
            addCriterion("MoneyMenuMoney5 =", value, "moneyMenuMoney5");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney5NotEqualTo(Double value) {
            addCriterion("MoneyMenuMoney5 <>", value, "moneyMenuMoney5");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney5GreaterThan(Double value) {
            addCriterion("MoneyMenuMoney5 >", value, "moneyMenuMoney5");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney5GreaterThanOrEqualTo(Double value) {
            addCriterion("MoneyMenuMoney5 >=", value, "moneyMenuMoney5");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney5LessThan(Double value) {
            addCriterion("MoneyMenuMoney5 <", value, "moneyMenuMoney5");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney5LessThanOrEqualTo(Double value) {
            addCriterion("MoneyMenuMoney5 <=", value, "moneyMenuMoney5");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney5In(List<Double> values) {
            addCriterion("MoneyMenuMoney5 in", values, "moneyMenuMoney5");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney5NotIn(List<Double> values) {
            addCriterion("MoneyMenuMoney5 not in", values, "moneyMenuMoney5");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney5Between(Double value1, Double value2) {
            addCriterion("MoneyMenuMoney5 between", value1, value2, "moneyMenuMoney5");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney5NotBetween(Double value1, Double value2) {
            addCriterion("MoneyMenuMoney5 not between", value1, value2, "moneyMenuMoney5");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney6IsNull() {
            addCriterion("MoneyMenuMoney6 is null");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney6IsNotNull() {
            addCriterion("MoneyMenuMoney6 is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney6EqualTo(Double value) {
            addCriterion("MoneyMenuMoney6 =", value, "moneyMenuMoney6");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney6NotEqualTo(Double value) {
            addCriterion("MoneyMenuMoney6 <>", value, "moneyMenuMoney6");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney6GreaterThan(Double value) {
            addCriterion("MoneyMenuMoney6 >", value, "moneyMenuMoney6");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney6GreaterThanOrEqualTo(Double value) {
            addCriterion("MoneyMenuMoney6 >=", value, "moneyMenuMoney6");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney6LessThan(Double value) {
            addCriterion("MoneyMenuMoney6 <", value, "moneyMenuMoney6");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney6LessThanOrEqualTo(Double value) {
            addCriterion("MoneyMenuMoney6 <=", value, "moneyMenuMoney6");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney6In(List<Double> values) {
            addCriterion("MoneyMenuMoney6 in", values, "moneyMenuMoney6");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney6NotIn(List<Double> values) {
            addCriterion("MoneyMenuMoney6 not in", values, "moneyMenuMoney6");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney6Between(Double value1, Double value2) {
            addCriterion("MoneyMenuMoney6 between", value1, value2, "moneyMenuMoney6");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney6NotBetween(Double value1, Double value2) {
            addCriterion("MoneyMenuMoney6 not between", value1, value2, "moneyMenuMoney6");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney7IsNull() {
            addCriterion("MoneyMenuMoney7 is null");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney7IsNotNull() {
            addCriterion("MoneyMenuMoney7 is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney7EqualTo(Double value) {
            addCriterion("MoneyMenuMoney7 =", value, "moneyMenuMoney7");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney7NotEqualTo(Double value) {
            addCriterion("MoneyMenuMoney7 <>", value, "moneyMenuMoney7");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney7GreaterThan(Double value) {
            addCriterion("MoneyMenuMoney7 >", value, "moneyMenuMoney7");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney7GreaterThanOrEqualTo(Double value) {
            addCriterion("MoneyMenuMoney7 >=", value, "moneyMenuMoney7");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney7LessThan(Double value) {
            addCriterion("MoneyMenuMoney7 <", value, "moneyMenuMoney7");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney7LessThanOrEqualTo(Double value) {
            addCriterion("MoneyMenuMoney7 <=", value, "moneyMenuMoney7");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney7In(List<Double> values) {
            addCriterion("MoneyMenuMoney7 in", values, "moneyMenuMoney7");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney7NotIn(List<Double> values) {
            addCriterion("MoneyMenuMoney7 not in", values, "moneyMenuMoney7");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney7Between(Double value1, Double value2) {
            addCriterion("MoneyMenuMoney7 between", value1, value2, "moneyMenuMoney7");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney7NotBetween(Double value1, Double value2) {
            addCriterion("MoneyMenuMoney7 not between", value1, value2, "moneyMenuMoney7");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney8IsNull() {
            addCriterion("MoneyMenuMoney8 is null");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney8IsNotNull() {
            addCriterion("MoneyMenuMoney8 is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney8EqualTo(Double value) {
            addCriterion("MoneyMenuMoney8 =", value, "moneyMenuMoney8");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney8NotEqualTo(Double value) {
            addCriterion("MoneyMenuMoney8 <>", value, "moneyMenuMoney8");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney8GreaterThan(Double value) {
            addCriterion("MoneyMenuMoney8 >", value, "moneyMenuMoney8");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney8GreaterThanOrEqualTo(Double value) {
            addCriterion("MoneyMenuMoney8 >=", value, "moneyMenuMoney8");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney8LessThan(Double value) {
            addCriterion("MoneyMenuMoney8 <", value, "moneyMenuMoney8");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney8LessThanOrEqualTo(Double value) {
            addCriterion("MoneyMenuMoney8 <=", value, "moneyMenuMoney8");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney8In(List<Double> values) {
            addCriterion("MoneyMenuMoney8 in", values, "moneyMenuMoney8");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney8NotIn(List<Double> values) {
            addCriterion("MoneyMenuMoney8 not in", values, "moneyMenuMoney8");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney8Between(Double value1, Double value2) {
            addCriterion("MoneyMenuMoney8 between", value1, value2, "moneyMenuMoney8");
            return (Criteria) this;
        }

        public Criteria andMoneyMenuMoney8NotBetween(Double value1, Double value2) {
            addCriterion("MoneyMenuMoney8 not between", value1, value2, "moneyMenuMoney8");
            return (Criteria) this;
        }

        public Criteria andMoneyIDIsNull() {
            addCriterion("MoneyID is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIDIsNotNull() {
            addCriterion("MoneyID is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyIDEqualTo(Integer value) {
            addCriterion("MoneyID =", value, "moneyID");
            return (Criteria) this;
        }

        public Criteria andMoneyIDNotEqualTo(Integer value) {
            addCriterion("MoneyID <>", value, "moneyID");
            return (Criteria) this;
        }

        public Criteria andMoneyIDGreaterThan(Integer value) {
            addCriterion("MoneyID >", value, "moneyID");
            return (Criteria) this;
        }

        public Criteria andMoneyIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("MoneyID >=", value, "moneyID");
            return (Criteria) this;
        }

        public Criteria andMoneyIDLessThan(Integer value) {
            addCriterion("MoneyID <", value, "moneyID");
            return (Criteria) this;
        }

        public Criteria andMoneyIDLessThanOrEqualTo(Integer value) {
            addCriterion("MoneyID <=", value, "moneyID");
            return (Criteria) this;
        }

        public Criteria andMoneyIDIn(List<Integer> values) {
            addCriterion("MoneyID in", values, "moneyID");
            return (Criteria) this;
        }

        public Criteria andMoneyIDNotIn(List<Integer> values) {
            addCriterion("MoneyID not in", values, "moneyID");
            return (Criteria) this;
        }

        public Criteria andMoneyIDBetween(Integer value1, Integer value2) {
            addCriterion("MoneyID between", value1, value2, "moneyID");
            return (Criteria) this;
        }

        public Criteria andMoneyIDNotBetween(Integer value1, Integer value2) {
            addCriterion("MoneyID not between", value1, value2, "moneyID");
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

        public Criteria andGlCorpCateIsNull() {
            addCriterion("GlCorpCate is null");
            return (Criteria) this;
        }

        public Criteria andGlCorpCateIsNotNull() {
            addCriterion("GlCorpCate is not null");
            return (Criteria) this;
        }

        public Criteria andGlCorpCateEqualTo(String value) {
            addCriterion("GlCorpCate =", value, "glCorpCate");
            return (Criteria) this;
        }

        public Criteria andGlCorpCateNotEqualTo(String value) {
            addCriterion("GlCorpCate <>", value, "glCorpCate");
            return (Criteria) this;
        }

        public Criteria andGlCorpCateGreaterThan(String value) {
            addCriterion("GlCorpCate >", value, "glCorpCate");
            return (Criteria) this;
        }

        public Criteria andGlCorpCateGreaterThanOrEqualTo(String value) {
            addCriterion("GlCorpCate >=", value, "glCorpCate");
            return (Criteria) this;
        }

        public Criteria andGlCorpCateLessThan(String value) {
            addCriterion("GlCorpCate <", value, "glCorpCate");
            return (Criteria) this;
        }

        public Criteria andGlCorpCateLessThanOrEqualTo(String value) {
            addCriterion("GlCorpCate <=", value, "glCorpCate");
            return (Criteria) this;
        }

        public Criteria andGlCorpCateLike(String value) {
            addCriterion("GlCorpCate like", value, "glCorpCate");
            return (Criteria) this;
        }

        public Criteria andGlCorpCateNotLike(String value) {
            addCriterion("GlCorpCate not like", value, "glCorpCate");
            return (Criteria) this;
        }

        public Criteria andGlCorpCateIn(List<String> values) {
            addCriterion("GlCorpCate in", values, "glCorpCate");
            return (Criteria) this;
        }

        public Criteria andGlCorpCateNotIn(List<String> values) {
            addCriterion("GlCorpCate not in", values, "glCorpCate");
            return (Criteria) this;
        }

        public Criteria andGlCorpCateBetween(String value1, String value2) {
            addCriterion("GlCorpCate between", value1, value2, "glCorpCate");
            return (Criteria) this;
        }

        public Criteria andGlCorpCateNotBetween(String value1, String value2) {
            addCriterion("GlCorpCate not between", value1, value2, "glCorpCate");
            return (Criteria) this;
        }

        public Criteria andGlCorpIDIsNull() {
            addCriterion("GlCorpID is null");
            return (Criteria) this;
        }

        public Criteria andGlCorpIDIsNotNull() {
            addCriterion("GlCorpID is not null");
            return (Criteria) this;
        }

        public Criteria andGlCorpIDEqualTo(Integer value) {
            addCriterion("GlCorpID =", value, "glCorpID");
            return (Criteria) this;
        }

        public Criteria andGlCorpIDNotEqualTo(Integer value) {
            addCriterion("GlCorpID <>", value, "glCorpID");
            return (Criteria) this;
        }

        public Criteria andGlCorpIDGreaterThan(Integer value) {
            addCriterion("GlCorpID >", value, "glCorpID");
            return (Criteria) this;
        }

        public Criteria andGlCorpIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("GlCorpID >=", value, "glCorpID");
            return (Criteria) this;
        }

        public Criteria andGlCorpIDLessThan(Integer value) {
            addCriterion("GlCorpID <", value, "glCorpID");
            return (Criteria) this;
        }

        public Criteria andGlCorpIDLessThanOrEqualTo(Integer value) {
            addCriterion("GlCorpID <=", value, "glCorpID");
            return (Criteria) this;
        }

        public Criteria andGlCorpIDIn(List<Integer> values) {
            addCriterion("GlCorpID in", values, "glCorpID");
            return (Criteria) this;
        }

        public Criteria andGlCorpIDNotIn(List<Integer> values) {
            addCriterion("GlCorpID not in", values, "glCorpID");
            return (Criteria) this;
        }

        public Criteria andGlCorpIDBetween(Integer value1, Integer value2) {
            addCriterion("GlCorpID between", value1, value2, "glCorpID");
            return (Criteria) this;
        }

        public Criteria andGlCorpIDNotBetween(Integer value1, Integer value2) {
            addCriterion("GlCorpID not between", value1, value2, "glCorpID");
            return (Criteria) this;
        }

        public Criteria andGlCorpNameIsNull() {
            addCriterion("GlCorpName is null");
            return (Criteria) this;
        }

        public Criteria andGlCorpNameIsNotNull() {
            addCriterion("GlCorpName is not null");
            return (Criteria) this;
        }

        public Criteria andGlCorpNameEqualTo(String value) {
            addCriterion("GlCorpName =", value, "glCorpName");
            return (Criteria) this;
        }

        public Criteria andGlCorpNameNotEqualTo(String value) {
            addCriterion("GlCorpName <>", value, "glCorpName");
            return (Criteria) this;
        }

        public Criteria andGlCorpNameGreaterThan(String value) {
            addCriterion("GlCorpName >", value, "glCorpName");
            return (Criteria) this;
        }

        public Criteria andGlCorpNameGreaterThanOrEqualTo(String value) {
            addCriterion("GlCorpName >=", value, "glCorpName");
            return (Criteria) this;
        }

        public Criteria andGlCorpNameLessThan(String value) {
            addCriterion("GlCorpName <", value, "glCorpName");
            return (Criteria) this;
        }

        public Criteria andGlCorpNameLessThanOrEqualTo(String value) {
            addCriterion("GlCorpName <=", value, "glCorpName");
            return (Criteria) this;
        }

        public Criteria andGlCorpNameLike(String value) {
            addCriterion("GlCorpName like", value, "glCorpName");
            return (Criteria) this;
        }

        public Criteria andGlCorpNameNotLike(String value) {
            addCriterion("GlCorpName not like", value, "glCorpName");
            return (Criteria) this;
        }

        public Criteria andGlCorpNameIn(List<String> values) {
            addCriterion("GlCorpName in", values, "glCorpName");
            return (Criteria) this;
        }

        public Criteria andGlCorpNameNotIn(List<String> values) {
            addCriterion("GlCorpName not in", values, "glCorpName");
            return (Criteria) this;
        }

        public Criteria andGlCorpNameBetween(String value1, String value2) {
            addCriterion("GlCorpName between", value1, value2, "glCorpName");
            return (Criteria) this;
        }

        public Criteria andGlCorpNameNotBetween(String value1, String value2) {
            addCriterion("GlCorpName not between", value1, value2, "glCorpName");
            return (Criteria) this;
        }

        public Criteria andCorpSuiIsNull() {
            addCriterion("CorpSui is null");
            return (Criteria) this;
        }

        public Criteria andCorpSuiIsNotNull() {
            addCriterion("CorpSui is not null");
            return (Criteria) this;
        }

        public Criteria andCorpSuiEqualTo(String value) {
            addCriterion("CorpSui =", value, "corpSui");
            return (Criteria) this;
        }

        public Criteria andCorpSuiNotEqualTo(String value) {
            addCriterion("CorpSui <>", value, "corpSui");
            return (Criteria) this;
        }

        public Criteria andCorpSuiGreaterThan(String value) {
            addCriterion("CorpSui >", value, "corpSui");
            return (Criteria) this;
        }

        public Criteria andCorpSuiGreaterThanOrEqualTo(String value) {
            addCriterion("CorpSui >=", value, "corpSui");
            return (Criteria) this;
        }

        public Criteria andCorpSuiLessThan(String value) {
            addCriterion("CorpSui <", value, "corpSui");
            return (Criteria) this;
        }

        public Criteria andCorpSuiLessThanOrEqualTo(String value) {
            addCriterion("CorpSui <=", value, "corpSui");
            return (Criteria) this;
        }

        public Criteria andCorpSuiLike(String value) {
            addCriterion("CorpSui like", value, "corpSui");
            return (Criteria) this;
        }

        public Criteria andCorpSuiNotLike(String value) {
            addCriterion("CorpSui not like", value, "corpSui");
            return (Criteria) this;
        }

        public Criteria andCorpSuiIn(List<String> values) {
            addCriterion("CorpSui in", values, "corpSui");
            return (Criteria) this;
        }

        public Criteria andCorpSuiNotIn(List<String> values) {
            addCriterion("CorpSui not in", values, "corpSui");
            return (Criteria) this;
        }

        public Criteria andCorpSuiBetween(String value1, String value2) {
            addCriterion("CorpSui between", value1, value2, "corpSui");
            return (Criteria) this;
        }

        public Criteria andCorpSuiNotBetween(String value1, String value2) {
            addCriterion("CorpSui not between", value1, value2, "corpSui");
            return (Criteria) this;
        }

        public Criteria andCorpAddressIsNull() {
            addCriterion("CorpAddress is null");
            return (Criteria) this;
        }

        public Criteria andCorpAddressIsNotNull() {
            addCriterion("CorpAddress is not null");
            return (Criteria) this;
        }

        public Criteria andCorpAddressEqualTo(String value) {
            addCriterion("CorpAddress =", value, "corpAddress");
            return (Criteria) this;
        }

        public Criteria andCorpAddressNotEqualTo(String value) {
            addCriterion("CorpAddress <>", value, "corpAddress");
            return (Criteria) this;
        }

        public Criteria andCorpAddressGreaterThan(String value) {
            addCriterion("CorpAddress >", value, "corpAddress");
            return (Criteria) this;
        }

        public Criteria andCorpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CorpAddress >=", value, "corpAddress");
            return (Criteria) this;
        }

        public Criteria andCorpAddressLessThan(String value) {
            addCriterion("CorpAddress <", value, "corpAddress");
            return (Criteria) this;
        }

        public Criteria andCorpAddressLessThanOrEqualTo(String value) {
            addCriterion("CorpAddress <=", value, "corpAddress");
            return (Criteria) this;
        }

        public Criteria andCorpAddressLike(String value) {
            addCriterion("CorpAddress like", value, "corpAddress");
            return (Criteria) this;
        }

        public Criteria andCorpAddressNotLike(String value) {
            addCriterion("CorpAddress not like", value, "corpAddress");
            return (Criteria) this;
        }

        public Criteria andCorpAddressIn(List<String> values) {
            addCriterion("CorpAddress in", values, "corpAddress");
            return (Criteria) this;
        }

        public Criteria andCorpAddressNotIn(List<String> values) {
            addCriterion("CorpAddress not in", values, "corpAddress");
            return (Criteria) this;
        }

        public Criteria andCorpAddressBetween(String value1, String value2) {
            addCriterion("CorpAddress between", value1, value2, "corpAddress");
            return (Criteria) this;
        }

        public Criteria andCorpAddressNotBetween(String value1, String value2) {
            addCriterion("CorpAddress not between", value1, value2, "corpAddress");
            return (Criteria) this;
        }

        public Criteria andCorpBankNoIsNull() {
            addCriterion("CorpBankNo is null");
            return (Criteria) this;
        }

        public Criteria andCorpBankNoIsNotNull() {
            addCriterion("CorpBankNo is not null");
            return (Criteria) this;
        }

        public Criteria andCorpBankNoEqualTo(String value) {
            addCriterion("CorpBankNo =", value, "corpBankNo");
            return (Criteria) this;
        }

        public Criteria andCorpBankNoNotEqualTo(String value) {
            addCriterion("CorpBankNo <>", value, "corpBankNo");
            return (Criteria) this;
        }

        public Criteria andCorpBankNoGreaterThan(String value) {
            addCriterion("CorpBankNo >", value, "corpBankNo");
            return (Criteria) this;
        }

        public Criteria andCorpBankNoGreaterThanOrEqualTo(String value) {
            addCriterion("CorpBankNo >=", value, "corpBankNo");
            return (Criteria) this;
        }

        public Criteria andCorpBankNoLessThan(String value) {
            addCriterion("CorpBankNo <", value, "corpBankNo");
            return (Criteria) this;
        }

        public Criteria andCorpBankNoLessThanOrEqualTo(String value) {
            addCriterion("CorpBankNo <=", value, "corpBankNo");
            return (Criteria) this;
        }

        public Criteria andCorpBankNoLike(String value) {
            addCriterion("CorpBankNo like", value, "corpBankNo");
            return (Criteria) this;
        }

        public Criteria andCorpBankNoNotLike(String value) {
            addCriterion("CorpBankNo not like", value, "corpBankNo");
            return (Criteria) this;
        }

        public Criteria andCorpBankNoIn(List<String> values) {
            addCriterion("CorpBankNo in", values, "corpBankNo");
            return (Criteria) this;
        }

        public Criteria andCorpBankNoNotIn(List<String> values) {
            addCriterion("CorpBankNo not in", values, "corpBankNo");
            return (Criteria) this;
        }

        public Criteria andCorpBankNoBetween(String value1, String value2) {
            addCriterion("CorpBankNo between", value1, value2, "corpBankNo");
            return (Criteria) this;
        }

        public Criteria andCorpBankNoNotBetween(String value1, String value2) {
            addCriterion("CorpBankNo not between", value1, value2, "corpBankNo");
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

        public Criteria andHuiNameIsNull() {
            addCriterion("HuiName is null");
            return (Criteria) this;
        }

        public Criteria andHuiNameIsNotNull() {
            addCriterion("HuiName is not null");
            return (Criteria) this;
        }

        public Criteria andHuiNameEqualTo(String value) {
            addCriterion("HuiName =", value, "huiName");
            return (Criteria) this;
        }

        public Criteria andHuiNameNotEqualTo(String value) {
            addCriterion("HuiName <>", value, "huiName");
            return (Criteria) this;
        }

        public Criteria andHuiNameGreaterThan(String value) {
            addCriterion("HuiName >", value, "huiName");
            return (Criteria) this;
        }

        public Criteria andHuiNameGreaterThanOrEqualTo(String value) {
            addCriterion("HuiName >=", value, "huiName");
            return (Criteria) this;
        }

        public Criteria andHuiNameLessThan(String value) {
            addCriterion("HuiName <", value, "huiName");
            return (Criteria) this;
        }

        public Criteria andHuiNameLessThanOrEqualTo(String value) {
            addCriterion("HuiName <=", value, "huiName");
            return (Criteria) this;
        }

        public Criteria andHuiNameLike(String value) {
            addCriterion("HuiName like", value, "huiName");
            return (Criteria) this;
        }

        public Criteria andHuiNameNotLike(String value) {
            addCriterion("HuiName not like", value, "huiName");
            return (Criteria) this;
        }

        public Criteria andHuiNameIn(List<String> values) {
            addCriterion("HuiName in", values, "huiName");
            return (Criteria) this;
        }

        public Criteria andHuiNameNotIn(List<String> values) {
            addCriterion("HuiName not in", values, "huiName");
            return (Criteria) this;
        }

        public Criteria andHuiNameBetween(String value1, String value2) {
            addCriterion("HuiName between", value1, value2, "huiName");
            return (Criteria) this;
        }

        public Criteria andHuiNameNotBetween(String value1, String value2) {
            addCriterion("HuiName not between", value1, value2, "huiName");
            return (Criteria) this;
        }

        public Criteria andHuiNumIsNull() {
            addCriterion("HuiNum is null");
            return (Criteria) this;
        }

        public Criteria andHuiNumIsNotNull() {
            addCriterion("HuiNum is not null");
            return (Criteria) this;
        }

        public Criteria andHuiNumEqualTo(String value) {
            addCriterion("HuiNum =", value, "huiNum");
            return (Criteria) this;
        }

        public Criteria andHuiNumNotEqualTo(String value) {
            addCriterion("HuiNum <>", value, "huiNum");
            return (Criteria) this;
        }

        public Criteria andHuiNumGreaterThan(String value) {
            addCriterion("HuiNum >", value, "huiNum");
            return (Criteria) this;
        }

        public Criteria andHuiNumGreaterThanOrEqualTo(String value) {
            addCriterion("HuiNum >=", value, "huiNum");
            return (Criteria) this;
        }

        public Criteria andHuiNumLessThan(String value) {
            addCriterion("HuiNum <", value, "huiNum");
            return (Criteria) this;
        }

        public Criteria andHuiNumLessThanOrEqualTo(String value) {
            addCriterion("HuiNum <=", value, "huiNum");
            return (Criteria) this;
        }

        public Criteria andHuiNumLike(String value) {
            addCriterion("HuiNum like", value, "huiNum");
            return (Criteria) this;
        }

        public Criteria andHuiNumNotLike(String value) {
            addCriterion("HuiNum not like", value, "huiNum");
            return (Criteria) this;
        }

        public Criteria andHuiNumIn(List<String> values) {
            addCriterion("HuiNum in", values, "huiNum");
            return (Criteria) this;
        }

        public Criteria andHuiNumNotIn(List<String> values) {
            addCriterion("HuiNum not in", values, "huiNum");
            return (Criteria) this;
        }

        public Criteria andHuiNumBetween(String value1, String value2) {
            addCriterion("HuiNum between", value1, value2, "huiNum");
            return (Criteria) this;
        }

        public Criteria andHuiNumNotBetween(String value1, String value2) {
            addCriterion("HuiNum not between", value1, value2, "huiNum");
            return (Criteria) this;
        }

        public Criteria andLinkNameIsNull() {
            addCriterion("LinkName is null");
            return (Criteria) this;
        }

        public Criteria andLinkNameIsNotNull() {
            addCriterion("LinkName is not null");
            return (Criteria) this;
        }

        public Criteria andLinkNameEqualTo(String value) {
            addCriterion("LinkName =", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotEqualTo(String value) {
            addCriterion("LinkName <>", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameGreaterThan(String value) {
            addCriterion("LinkName >", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameGreaterThanOrEqualTo(String value) {
            addCriterion("LinkName >=", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameLessThan(String value) {
            addCriterion("LinkName <", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameLessThanOrEqualTo(String value) {
            addCriterion("LinkName <=", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameLike(String value) {
            addCriterion("LinkName like", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotLike(String value) {
            addCriterion("LinkName not like", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameIn(List<String> values) {
            addCriterion("LinkName in", values, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotIn(List<String> values) {
            addCriterion("LinkName not in", values, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameBetween(String value1, String value2) {
            addCriterion("LinkName between", value1, value2, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotBetween(String value1, String value2) {
            addCriterion("LinkName not between", value1, value2, "linkName");
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

        public Criteria andMoneyCorpCateIsNull() {
            addCriterion("MoneyCorpCate is null");
            return (Criteria) this;
        }

        public Criteria andMoneyCorpCateIsNotNull() {
            addCriterion("MoneyCorpCate is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyCorpCateEqualTo(String value) {
            addCriterion("MoneyCorpCate =", value, "moneyCorpCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCorpCateNotEqualTo(String value) {
            addCriterion("MoneyCorpCate <>", value, "moneyCorpCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCorpCateGreaterThan(String value) {
            addCriterion("MoneyCorpCate >", value, "moneyCorpCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCorpCateGreaterThanOrEqualTo(String value) {
            addCriterion("MoneyCorpCate >=", value, "moneyCorpCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCorpCateLessThan(String value) {
            addCriterion("MoneyCorpCate <", value, "moneyCorpCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCorpCateLessThanOrEqualTo(String value) {
            addCriterion("MoneyCorpCate <=", value, "moneyCorpCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCorpCateLike(String value) {
            addCriterion("MoneyCorpCate like", value, "moneyCorpCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCorpCateNotLike(String value) {
            addCriterion("MoneyCorpCate not like", value, "moneyCorpCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCorpCateIn(List<String> values) {
            addCriterion("MoneyCorpCate in", values, "moneyCorpCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCorpCateNotIn(List<String> values) {
            addCriterion("MoneyCorpCate not in", values, "moneyCorpCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCorpCateBetween(String value1, String value2) {
            addCriterion("MoneyCorpCate between", value1, value2, "moneyCorpCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCorpCateNotBetween(String value1, String value2) {
            addCriterion("MoneyCorpCate not between", value1, value2, "moneyCorpCate");
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

        public Criteria andMoneyEqualTo(Double value) {
            addCriterion("Money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Double value) {
            addCriterion("Money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Double value) {
            addCriterion("Money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("Money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Double value) {
            addCriterion("Money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Double value) {
            addCriterion("Money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Double> values) {
            addCriterion("Money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Double> values) {
            addCriterion("Money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Double value1, Double value2) {
            addCriterion("Money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Double value1, Double value2) {
            addCriterion("Money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoney22IsNull() {
            addCriterion("Money22 is null");
            return (Criteria) this;
        }

        public Criteria andMoney22IsNotNull() {
            addCriterion("Money22 is not null");
            return (Criteria) this;
        }

        public Criteria andMoney22EqualTo(String value) {
            addCriterion("Money22 =", value, "money22");
            return (Criteria) this;
        }

        public Criteria andMoney22NotEqualTo(String value) {
            addCriterion("Money22 <>", value, "money22");
            return (Criteria) this;
        }

        public Criteria andMoney22GreaterThan(String value) {
            addCriterion("Money22 >", value, "money22");
            return (Criteria) this;
        }

        public Criteria andMoney22GreaterThanOrEqualTo(String value) {
            addCriterion("Money22 >=", value, "money22");
            return (Criteria) this;
        }

        public Criteria andMoney22LessThan(String value) {
            addCriterion("Money22 <", value, "money22");
            return (Criteria) this;
        }

        public Criteria andMoney22LessThanOrEqualTo(String value) {
            addCriterion("Money22 <=", value, "money22");
            return (Criteria) this;
        }

        public Criteria andMoney22Like(String value) {
            addCriterion("Money22 like", value, "money22");
            return (Criteria) this;
        }

        public Criteria andMoney22NotLike(String value) {
            addCriterion("Money22 not like", value, "money22");
            return (Criteria) this;
        }

        public Criteria andMoney22In(List<String> values) {
            addCriterion("Money22 in", values, "money22");
            return (Criteria) this;
        }

        public Criteria andMoney22NotIn(List<String> values) {
            addCriterion("Money22 not in", values, "money22");
            return (Criteria) this;
        }

        public Criteria andMoney22Between(String value1, String value2) {
            addCriterion("Money22 between", value1, value2, "money22");
            return (Criteria) this;
        }

        public Criteria andMoney22NotBetween(String value1, String value2) {
            addCriterion("Money22 not between", value1, value2, "money22");
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

        public Criteria andAddNameIsNull() {
            addCriterion("AddName is null");
            return (Criteria) this;
        }

        public Criteria andAddNameIsNotNull() {
            addCriterion("AddName is not null");
            return (Criteria) this;
        }

        public Criteria andAddNameEqualTo(String value) {
            addCriterion("AddName =", value, "addName");
            return (Criteria) this;
        }

        public Criteria andAddNameNotEqualTo(String value) {
            addCriterion("AddName <>", value, "addName");
            return (Criteria) this;
        }

        public Criteria andAddNameGreaterThan(String value) {
            addCriterion("AddName >", value, "addName");
            return (Criteria) this;
        }

        public Criteria andAddNameGreaterThanOrEqualTo(String value) {
            addCriterion("AddName >=", value, "addName");
            return (Criteria) this;
        }

        public Criteria andAddNameLessThan(String value) {
            addCriterion("AddName <", value, "addName");
            return (Criteria) this;
        }

        public Criteria andAddNameLessThanOrEqualTo(String value) {
            addCriterion("AddName <=", value, "addName");
            return (Criteria) this;
        }

        public Criteria andAddNameLike(String value) {
            addCriterion("AddName like", value, "addName");
            return (Criteria) this;
        }

        public Criteria andAddNameNotLike(String value) {
            addCriterion("AddName not like", value, "addName");
            return (Criteria) this;
        }

        public Criteria andAddNameIn(List<String> values) {
            addCriterion("AddName in", values, "addName");
            return (Criteria) this;
        }

        public Criteria andAddNameNotIn(List<String> values) {
            addCriterion("AddName not in", values, "addName");
            return (Criteria) this;
        }

        public Criteria andAddNameBetween(String value1, String value2) {
            addCriterion("AddName between", value1, value2, "addName");
            return (Criteria) this;
        }

        public Criteria andAddNameNotBetween(String value1, String value2) {
            addCriterion("AddName not between", value1, value2, "addName");
            return (Criteria) this;
        }

        public Criteria andPiaoCorpNameIsNull() {
            addCriterion("PiaoCorpName is null");
            return (Criteria) this;
        }

        public Criteria andPiaoCorpNameIsNotNull() {
            addCriterion("PiaoCorpName is not null");
            return (Criteria) this;
        }

        public Criteria andPiaoCorpNameEqualTo(String value) {
            addCriterion("PiaoCorpName =", value, "piaoCorpName");
            return (Criteria) this;
        }

        public Criteria andPiaoCorpNameNotEqualTo(String value) {
            addCriterion("PiaoCorpName <>", value, "piaoCorpName");
            return (Criteria) this;
        }

        public Criteria andPiaoCorpNameGreaterThan(String value) {
            addCriterion("PiaoCorpName >", value, "piaoCorpName");
            return (Criteria) this;
        }

        public Criteria andPiaoCorpNameGreaterThanOrEqualTo(String value) {
            addCriterion("PiaoCorpName >=", value, "piaoCorpName");
            return (Criteria) this;
        }

        public Criteria andPiaoCorpNameLessThan(String value) {
            addCriterion("PiaoCorpName <", value, "piaoCorpName");
            return (Criteria) this;
        }

        public Criteria andPiaoCorpNameLessThanOrEqualTo(String value) {
            addCriterion("PiaoCorpName <=", value, "piaoCorpName");
            return (Criteria) this;
        }

        public Criteria andPiaoCorpNameLike(String value) {
            addCriterion("PiaoCorpName like", value, "piaoCorpName");
            return (Criteria) this;
        }

        public Criteria andPiaoCorpNameNotLike(String value) {
            addCriterion("PiaoCorpName not like", value, "piaoCorpName");
            return (Criteria) this;
        }

        public Criteria andPiaoCorpNameIn(List<String> values) {
            addCriterion("PiaoCorpName in", values, "piaoCorpName");
            return (Criteria) this;
        }

        public Criteria andPiaoCorpNameNotIn(List<String> values) {
            addCriterion("PiaoCorpName not in", values, "piaoCorpName");
            return (Criteria) this;
        }

        public Criteria andPiaoCorpNameBetween(String value1, String value2) {
            addCriterion("PiaoCorpName between", value1, value2, "piaoCorpName");
            return (Criteria) this;
        }

        public Criteria andPiaoCorpNameNotBetween(String value1, String value2) {
            addCriterion("PiaoCorpName not between", value1, value2, "piaoCorpName");
            return (Criteria) this;
        }

        public Criteria andMoneyFileIsNull() {
            addCriterion("MoneyFile is null");
            return (Criteria) this;
        }

        public Criteria andMoneyFileIsNotNull() {
            addCriterion("MoneyFile is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyFileEqualTo(String value) {
            addCriterion("MoneyFile =", value, "moneyFile");
            return (Criteria) this;
        }

        public Criteria andMoneyFileNotEqualTo(String value) {
            addCriterion("MoneyFile <>", value, "moneyFile");
            return (Criteria) this;
        }

        public Criteria andMoneyFileGreaterThan(String value) {
            addCriterion("MoneyFile >", value, "moneyFile");
            return (Criteria) this;
        }

        public Criteria andMoneyFileGreaterThanOrEqualTo(String value) {
            addCriterion("MoneyFile >=", value, "moneyFile");
            return (Criteria) this;
        }

        public Criteria andMoneyFileLessThan(String value) {
            addCriterion("MoneyFile <", value, "moneyFile");
            return (Criteria) this;
        }

        public Criteria andMoneyFileLessThanOrEqualTo(String value) {
            addCriterion("MoneyFile <=", value, "moneyFile");
            return (Criteria) this;
        }

        public Criteria andMoneyFileLike(String value) {
            addCriterion("MoneyFile like", value, "moneyFile");
            return (Criteria) this;
        }

        public Criteria andMoneyFileNotLike(String value) {
            addCriterion("MoneyFile not like", value, "moneyFile");
            return (Criteria) this;
        }

        public Criteria andMoneyFileIn(List<String> values) {
            addCriterion("MoneyFile in", values, "moneyFile");
            return (Criteria) this;
        }

        public Criteria andMoneyFileNotIn(List<String> values) {
            addCriterion("MoneyFile not in", values, "moneyFile");
            return (Criteria) this;
        }

        public Criteria andMoneyFileBetween(String value1, String value2) {
            addCriterion("MoneyFile between", value1, value2, "moneyFile");
            return (Criteria) this;
        }

        public Criteria andMoneyFileNotBetween(String value1, String value2) {
            addCriterion("MoneyFile not between", value1, value2, "moneyFile");
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

        public Criteria andCXP_CorpNameIsNull() {
            addCriterion("CXP_CorpName is null");
            return (Criteria) this;
        }

        public Criteria andCXP_CorpNameIsNotNull() {
            addCriterion("CXP_CorpName is not null");
            return (Criteria) this;
        }

        public Criteria andCXP_CorpNameEqualTo(String value) {
            addCriterion("CXP_CorpName =", value, "CXP_CorpName");
            return (Criteria) this;
        }

        public Criteria andCXP_CorpNameNotEqualTo(String value) {
            addCriterion("CXP_CorpName <>", value, "CXP_CorpName");
            return (Criteria) this;
        }

        public Criteria andCXP_CorpNameGreaterThan(String value) {
            addCriterion("CXP_CorpName >", value, "CXP_CorpName");
            return (Criteria) this;
        }

        public Criteria andCXP_CorpNameGreaterThanOrEqualTo(String value) {
            addCriterion("CXP_CorpName >=", value, "CXP_CorpName");
            return (Criteria) this;
        }

        public Criteria andCXP_CorpNameLessThan(String value) {
            addCriterion("CXP_CorpName <", value, "CXP_CorpName");
            return (Criteria) this;
        }

        public Criteria andCXP_CorpNameLessThanOrEqualTo(String value) {
            addCriterion("CXP_CorpName <=", value, "CXP_CorpName");
            return (Criteria) this;
        }

        public Criteria andCXP_CorpNameLike(String value) {
            addCriterion("CXP_CorpName like", value, "CXP_CorpName");
            return (Criteria) this;
        }

        public Criteria andCXP_CorpNameNotLike(String value) {
            addCriterion("CXP_CorpName not like", value, "CXP_CorpName");
            return (Criteria) this;
        }

        public Criteria andCXP_CorpNameIn(List<String> values) {
            addCriterion("CXP_CorpName in", values, "CXP_CorpName");
            return (Criteria) this;
        }

        public Criteria andCXP_CorpNameNotIn(List<String> values) {
            addCriterion("CXP_CorpName not in", values, "CXP_CorpName");
            return (Criteria) this;
        }

        public Criteria andCXP_CorpNameBetween(String value1, String value2) {
            addCriterion("CXP_CorpName between", value1, value2, "CXP_CorpName");
            return (Criteria) this;
        }

        public Criteria andCXP_CorpNameNotBetween(String value1, String value2) {
            addCriterion("CXP_CorpName not between", value1, value2, "CXP_CorpName");
            return (Criteria) this;
        }

        public Criteria andCXP_DateIsNull() {
            addCriterion("CXP_Date is null");
            return (Criteria) this;
        }

        public Criteria andCXP_DateIsNotNull() {
            addCriterion("CXP_Date is not null");
            return (Criteria) this;
        }

        public Criteria andCXP_DateEqualTo(Date value) {
            addCriterion("CXP_Date =", value, "CXP_Date");
            return (Criteria) this;
        }

        public Criteria andCXP_DateNotEqualTo(Date value) {
            addCriterion("CXP_Date <>", value, "CXP_Date");
            return (Criteria) this;
        }

        public Criteria andCXP_DateGreaterThan(Date value) {
            addCriterion("CXP_Date >", value, "CXP_Date");
            return (Criteria) this;
        }

        public Criteria andCXP_DateGreaterThanOrEqualTo(Date value) {
            addCriterion("CXP_Date >=", value, "CXP_Date");
            return (Criteria) this;
        }

        public Criteria andCXP_DateLessThan(Date value) {
            addCriterion("CXP_Date <", value, "CXP_Date");
            return (Criteria) this;
        }

        public Criteria andCXP_DateLessThanOrEqualTo(Date value) {
            addCriterion("CXP_Date <=", value, "CXP_Date");
            return (Criteria) this;
        }

        public Criteria andCXP_DateIn(List<Date> values) {
            addCriterion("CXP_Date in", values, "CXP_Date");
            return (Criteria) this;
        }

        public Criteria andCXP_DateNotIn(List<Date> values) {
            addCriterion("CXP_Date not in", values, "CXP_Date");
            return (Criteria) this;
        }

        public Criteria andCXP_DateBetween(Date value1, Date value2) {
            addCriterion("CXP_Date between", value1, value2, "CXP_Date");
            return (Criteria) this;
        }

        public Criteria andCXP_DateNotBetween(Date value1, Date value2) {
            addCriterion("CXP_Date not between", value1, value2, "CXP_Date");
            return (Criteria) this;
        }

        public Criteria andCXP_MoneyIsNull() {
            addCriterion("CXP_Money is null");
            return (Criteria) this;
        }

        public Criteria andCXP_MoneyIsNotNull() {
            addCriterion("CXP_Money is not null");
            return (Criteria) this;
        }

        public Criteria andCXP_MoneyEqualTo(String value) {
            addCriterion("CXP_Money =", value, "CXP_Money");
            return (Criteria) this;
        }

        public Criteria andCXP_MoneyNotEqualTo(String value) {
            addCriterion("CXP_Money <>", value, "CXP_Money");
            return (Criteria) this;
        }

        public Criteria andCXP_MoneyGreaterThan(String value) {
            addCriterion("CXP_Money >", value, "CXP_Money");
            return (Criteria) this;
        }

        public Criteria andCXP_MoneyGreaterThanOrEqualTo(String value) {
            addCriterion("CXP_Money >=", value, "CXP_Money");
            return (Criteria) this;
        }

        public Criteria andCXP_MoneyLessThan(String value) {
            addCriterion("CXP_Money <", value, "CXP_Money");
            return (Criteria) this;
        }

        public Criteria andCXP_MoneyLessThanOrEqualTo(String value) {
            addCriterion("CXP_Money <=", value, "CXP_Money");
            return (Criteria) this;
        }

        public Criteria andCXP_MoneyLike(String value) {
            addCriterion("CXP_Money like", value, "CXP_Money");
            return (Criteria) this;
        }

        public Criteria andCXP_MoneyNotLike(String value) {
            addCriterion("CXP_Money not like", value, "CXP_Money");
            return (Criteria) this;
        }

        public Criteria andCXP_MoneyIn(List<String> values) {
            addCriterion("CXP_Money in", values, "CXP_Money");
            return (Criteria) this;
        }

        public Criteria andCXP_MoneyNotIn(List<String> values) {
            addCriterion("CXP_Money not in", values, "CXP_Money");
            return (Criteria) this;
        }

        public Criteria andCXP_MoneyBetween(String value1, String value2) {
            addCriterion("CXP_Money between", value1, value2, "CXP_Money");
            return (Criteria) this;
        }

        public Criteria andCXP_MoneyNotBetween(String value1, String value2) {
            addCriterion("CXP_Money not between", value1, value2, "CXP_Money");
            return (Criteria) this;
        }

        public Criteria andCXP_GRIsNull() {
            addCriterion("CXP_GR is null");
            return (Criteria) this;
        }

        public Criteria andCXP_GRIsNotNull() {
            addCriterion("CXP_GR is not null");
            return (Criteria) this;
        }

        public Criteria andCXP_GREqualTo(String value) {
            addCriterion("CXP_GR =", value, "CXP_GR");
            return (Criteria) this;
        }

        public Criteria andCXP_GRNotEqualTo(String value) {
            addCriterion("CXP_GR <>", value, "CXP_GR");
            return (Criteria) this;
        }

        public Criteria andCXP_GRGreaterThan(String value) {
            addCriterion("CXP_GR >", value, "CXP_GR");
            return (Criteria) this;
        }

        public Criteria andCXP_GRGreaterThanOrEqualTo(String value) {
            addCriterion("CXP_GR >=", value, "CXP_GR");
            return (Criteria) this;
        }

        public Criteria andCXP_GRLessThan(String value) {
            addCriterion("CXP_GR <", value, "CXP_GR");
            return (Criteria) this;
        }

        public Criteria andCXP_GRLessThanOrEqualTo(String value) {
            addCriterion("CXP_GR <=", value, "CXP_GR");
            return (Criteria) this;
        }

        public Criteria andCXP_GRLike(String value) {
            addCriterion("CXP_GR like", value, "CXP_GR");
            return (Criteria) this;
        }

        public Criteria andCXP_GRNotLike(String value) {
            addCriterion("CXP_GR not like", value, "CXP_GR");
            return (Criteria) this;
        }

        public Criteria andCXP_GRIn(List<String> values) {
            addCriterion("CXP_GR in", values, "CXP_GR");
            return (Criteria) this;
        }

        public Criteria andCXP_GRNotIn(List<String> values) {
            addCriterion("CXP_GR not in", values, "CXP_GR");
            return (Criteria) this;
        }

        public Criteria andCXP_GRBetween(String value1, String value2) {
            addCriterion("CXP_GR between", value1, value2, "CXP_GR");
            return (Criteria) this;
        }

        public Criteria andCXP_GRNotBetween(String value1, String value2) {
            addCriterion("CXP_GR not between", value1, value2, "CXP_GR");
            return (Criteria) this;
        }

        public Criteria andCXP_GR2IsNull() {
            addCriterion("CXP_GR2 is null");
            return (Criteria) this;
        }

        public Criteria andCXP_GR2IsNotNull() {
            addCriterion("CXP_GR2 is not null");
            return (Criteria) this;
        }

        public Criteria andCXP_GR2EqualTo(String value) {
            addCriterion("CXP_GR2 =", value, "CXP_GR2");
            return (Criteria) this;
        }

        public Criteria andCXP_GR2NotEqualTo(String value) {
            addCriterion("CXP_GR2 <>", value, "CXP_GR2");
            return (Criteria) this;
        }

        public Criteria andCXP_GR2GreaterThan(String value) {
            addCriterion("CXP_GR2 >", value, "CXP_GR2");
            return (Criteria) this;
        }

        public Criteria andCXP_GR2GreaterThanOrEqualTo(String value) {
            addCriterion("CXP_GR2 >=", value, "CXP_GR2");
            return (Criteria) this;
        }

        public Criteria andCXP_GR2LessThan(String value) {
            addCriterion("CXP_GR2 <", value, "CXP_GR2");
            return (Criteria) this;
        }

        public Criteria andCXP_GR2LessThanOrEqualTo(String value) {
            addCriterion("CXP_GR2 <=", value, "CXP_GR2");
            return (Criteria) this;
        }

        public Criteria andCXP_GR2Like(String value) {
            addCriterion("CXP_GR2 like", value, "CXP_GR2");
            return (Criteria) this;
        }

        public Criteria andCXP_GR2NotLike(String value) {
            addCriterion("CXP_GR2 not like", value, "CXP_GR2");
            return (Criteria) this;
        }

        public Criteria andCXP_GR2In(List<String> values) {
            addCriterion("CXP_GR2 in", values, "CXP_GR2");
            return (Criteria) this;
        }

        public Criteria andCXP_GR2NotIn(List<String> values) {
            addCriterion("CXP_GR2 not in", values, "CXP_GR2");
            return (Criteria) this;
        }

        public Criteria andCXP_GR2Between(String value1, String value2) {
            addCriterion("CXP_GR2 between", value1, value2, "CXP_GR2");
            return (Criteria) this;
        }

        public Criteria andCXP_GR2NotBetween(String value1, String value2) {
            addCriterion("CXP_GR2 not between", value1, value2, "CXP_GR2");
            return (Criteria) this;
        }

        public Criteria andCXP_GR3IsNull() {
            addCriterion("CXP_GR3 is null");
            return (Criteria) this;
        }

        public Criteria andCXP_GR3IsNotNull() {
            addCriterion("CXP_GR3 is not null");
            return (Criteria) this;
        }

        public Criteria andCXP_GR3EqualTo(String value) {
            addCriterion("CXP_GR3 =", value, "CXP_GR3");
            return (Criteria) this;
        }

        public Criteria andCXP_GR3NotEqualTo(String value) {
            addCriterion("CXP_GR3 <>", value, "CXP_GR3");
            return (Criteria) this;
        }

        public Criteria andCXP_GR3GreaterThan(String value) {
            addCriterion("CXP_GR3 >", value, "CXP_GR3");
            return (Criteria) this;
        }

        public Criteria andCXP_GR3GreaterThanOrEqualTo(String value) {
            addCriterion("CXP_GR3 >=", value, "CXP_GR3");
            return (Criteria) this;
        }

        public Criteria andCXP_GR3LessThan(String value) {
            addCriterion("CXP_GR3 <", value, "CXP_GR3");
            return (Criteria) this;
        }

        public Criteria andCXP_GR3LessThanOrEqualTo(String value) {
            addCriterion("CXP_GR3 <=", value, "CXP_GR3");
            return (Criteria) this;
        }

        public Criteria andCXP_GR3Like(String value) {
            addCriterion("CXP_GR3 like", value, "CXP_GR3");
            return (Criteria) this;
        }

        public Criteria andCXP_GR3NotLike(String value) {
            addCriterion("CXP_GR3 not like", value, "CXP_GR3");
            return (Criteria) this;
        }

        public Criteria andCXP_GR3In(List<String> values) {
            addCriterion("CXP_GR3 in", values, "CXP_GR3");
            return (Criteria) this;
        }

        public Criteria andCXP_GR3NotIn(List<String> values) {
            addCriterion("CXP_GR3 not in", values, "CXP_GR3");
            return (Criteria) this;
        }

        public Criteria andCXP_GR3Between(String value1, String value2) {
            addCriterion("CXP_GR3 between", value1, value2, "CXP_GR3");
            return (Criteria) this;
        }

        public Criteria andCXP_GR3NotBetween(String value1, String value2) {
            addCriterion("CXP_GR3 not between", value1, value2, "CXP_GR3");
            return (Criteria) this;
        }

        public Criteria andCXP_GSCateIsNull() {
            addCriterion("CXP_GSCate is null");
            return (Criteria) this;
        }

        public Criteria andCXP_GSCateIsNotNull() {
            addCriterion("CXP_GSCate is not null");
            return (Criteria) this;
        }

        public Criteria andCXP_GSCateEqualTo(String value) {
            addCriterion("CXP_GSCate =", value, "CXP_GSCate");
            return (Criteria) this;
        }

        public Criteria andCXP_GSCateNotEqualTo(String value) {
            addCriterion("CXP_GSCate <>", value, "CXP_GSCate");
            return (Criteria) this;
        }

        public Criteria andCXP_GSCateGreaterThan(String value) {
            addCriterion("CXP_GSCate >", value, "CXP_GSCate");
            return (Criteria) this;
        }

        public Criteria andCXP_GSCateGreaterThanOrEqualTo(String value) {
            addCriterion("CXP_GSCate >=", value, "CXP_GSCate");
            return (Criteria) this;
        }

        public Criteria andCXP_GSCateLessThan(String value) {
            addCriterion("CXP_GSCate <", value, "CXP_GSCate");
            return (Criteria) this;
        }

        public Criteria andCXP_GSCateLessThanOrEqualTo(String value) {
            addCriterion("CXP_GSCate <=", value, "CXP_GSCate");
            return (Criteria) this;
        }

        public Criteria andCXP_GSCateLike(String value) {
            addCriterion("CXP_GSCate like", value, "CXP_GSCate");
            return (Criteria) this;
        }

        public Criteria andCXP_GSCateNotLike(String value) {
            addCriterion("CXP_GSCate not like", value, "CXP_GSCate");
            return (Criteria) this;
        }

        public Criteria andCXP_GSCateIn(List<String> values) {
            addCriterion("CXP_GSCate in", values, "CXP_GSCate");
            return (Criteria) this;
        }

        public Criteria andCXP_GSCateNotIn(List<String> values) {
            addCriterion("CXP_GSCate not in", values, "CXP_GSCate");
            return (Criteria) this;
        }

        public Criteria andCXP_GSCateBetween(String value1, String value2) {
            addCriterion("CXP_GSCate between", value1, value2, "CXP_GSCate");
            return (Criteria) this;
        }

        public Criteria andCXP_GSCateNotBetween(String value1, String value2) {
            addCriterion("CXP_GSCate not between", value1, value2, "CXP_GSCate");
            return (Criteria) this;
        }

        public Criteria andCXP_JSIsNull() {
            addCriterion("CXP_JS is null");
            return (Criteria) this;
        }

        public Criteria andCXP_JSIsNotNull() {
            addCriterion("CXP_JS is not null");
            return (Criteria) this;
        }

        public Criteria andCXP_JSEqualTo(String value) {
            addCriterion("CXP_JS =", value, "CXP_JS");
            return (Criteria) this;
        }

        public Criteria andCXP_JSNotEqualTo(String value) {
            addCriterion("CXP_JS <>", value, "CXP_JS");
            return (Criteria) this;
        }

        public Criteria andCXP_JSGreaterThan(String value) {
            addCriterion("CXP_JS >", value, "CXP_JS");
            return (Criteria) this;
        }

        public Criteria andCXP_JSGreaterThanOrEqualTo(String value) {
            addCriterion("CXP_JS >=", value, "CXP_JS");
            return (Criteria) this;
        }

        public Criteria andCXP_JSLessThan(String value) {
            addCriterion("CXP_JS <", value, "CXP_JS");
            return (Criteria) this;
        }

        public Criteria andCXP_JSLessThanOrEqualTo(String value) {
            addCriterion("CXP_JS <=", value, "CXP_JS");
            return (Criteria) this;
        }

        public Criteria andCXP_JSLike(String value) {
            addCriterion("CXP_JS like", value, "CXP_JS");
            return (Criteria) this;
        }

        public Criteria andCXP_JSNotLike(String value) {
            addCriterion("CXP_JS not like", value, "CXP_JS");
            return (Criteria) this;
        }

        public Criteria andCXP_JSIn(List<String> values) {
            addCriterion("CXP_JS in", values, "CXP_JS");
            return (Criteria) this;
        }

        public Criteria andCXP_JSNotIn(List<String> values) {
            addCriterion("CXP_JS not in", values, "CXP_JS");
            return (Criteria) this;
        }

        public Criteria andCXP_JSBetween(String value1, String value2) {
            addCriterion("CXP_JS between", value1, value2, "CXP_JS");
            return (Criteria) this;
        }

        public Criteria andCXP_JSNotBetween(String value1, String value2) {
            addCriterion("CXP_JS not between", value1, value2, "CXP_JS");
            return (Criteria) this;
        }

        public Criteria andCXP_JSKJIsNull() {
            addCriterion("CXP_JSKJ is null");
            return (Criteria) this;
        }

        public Criteria andCXP_JSKJIsNotNull() {
            addCriterion("CXP_JSKJ is not null");
            return (Criteria) this;
        }

        public Criteria andCXP_JSKJEqualTo(String value) {
            addCriterion("CXP_JSKJ =", value, "CXP_JSKJ");
            return (Criteria) this;
        }

        public Criteria andCXP_JSKJNotEqualTo(String value) {
            addCriterion("CXP_JSKJ <>", value, "CXP_JSKJ");
            return (Criteria) this;
        }

        public Criteria andCXP_JSKJGreaterThan(String value) {
            addCriterion("CXP_JSKJ >", value, "CXP_JSKJ");
            return (Criteria) this;
        }

        public Criteria andCXP_JSKJGreaterThanOrEqualTo(String value) {
            addCriterion("CXP_JSKJ >=", value, "CXP_JSKJ");
            return (Criteria) this;
        }

        public Criteria andCXP_JSKJLessThan(String value) {
            addCriterion("CXP_JSKJ <", value, "CXP_JSKJ");
            return (Criteria) this;
        }

        public Criteria andCXP_JSKJLessThanOrEqualTo(String value) {
            addCriterion("CXP_JSKJ <=", value, "CXP_JSKJ");
            return (Criteria) this;
        }

        public Criteria andCXP_JSKJLike(String value) {
            addCriterion("CXP_JSKJ like", value, "CXP_JSKJ");
            return (Criteria) this;
        }

        public Criteria andCXP_JSKJNotLike(String value) {
            addCriterion("CXP_JSKJ not like", value, "CXP_JSKJ");
            return (Criteria) this;
        }

        public Criteria andCXP_JSKJIn(List<String> values) {
            addCriterion("CXP_JSKJ in", values, "CXP_JSKJ");
            return (Criteria) this;
        }

        public Criteria andCXP_JSKJNotIn(List<String> values) {
            addCriterion("CXP_JSKJ not in", values, "CXP_JSKJ");
            return (Criteria) this;
        }

        public Criteria andCXP_JSKJBetween(String value1, String value2) {
            addCriterion("CXP_JSKJ between", value1, value2, "CXP_JSKJ");
            return (Criteria) this;
        }

        public Criteria andCXP_JSKJNotBetween(String value1, String value2) {
            addCriterion("CXP_JSKJ not between", value1, value2, "CXP_JSKJ");
            return (Criteria) this;
        }

        public Criteria andCXP_WXIsNull() {
            addCriterion("CXP_WX is null");
            return (Criteria) this;
        }

        public Criteria andCXP_WXIsNotNull() {
            addCriterion("CXP_WX is not null");
            return (Criteria) this;
        }

        public Criteria andCXP_WXEqualTo(String value) {
            addCriterion("CXP_WX =", value, "CXP_WX");
            return (Criteria) this;
        }

        public Criteria andCXP_WXNotEqualTo(String value) {
            addCriterion("CXP_WX <>", value, "CXP_WX");
            return (Criteria) this;
        }

        public Criteria andCXP_WXGreaterThan(String value) {
            addCriterion("CXP_WX >", value, "CXP_WX");
            return (Criteria) this;
        }

        public Criteria andCXP_WXGreaterThanOrEqualTo(String value) {
            addCriterion("CXP_WX >=", value, "CXP_WX");
            return (Criteria) this;
        }

        public Criteria andCXP_WXLessThan(String value) {
            addCriterion("CXP_WX <", value, "CXP_WX");
            return (Criteria) this;
        }

        public Criteria andCXP_WXLessThanOrEqualTo(String value) {
            addCriterion("CXP_WX <=", value, "CXP_WX");
            return (Criteria) this;
        }

        public Criteria andCXP_WXLike(String value) {
            addCriterion("CXP_WX like", value, "CXP_WX");
            return (Criteria) this;
        }

        public Criteria andCXP_WXNotLike(String value) {
            addCriterion("CXP_WX not like", value, "CXP_WX");
            return (Criteria) this;
        }

        public Criteria andCXP_WXIn(List<String> values) {
            addCriterion("CXP_WX in", values, "CXP_WX");
            return (Criteria) this;
        }

        public Criteria andCXP_WXNotIn(List<String> values) {
            addCriterion("CXP_WX not in", values, "CXP_WX");
            return (Criteria) this;
        }

        public Criteria andCXP_WXBetween(String value1, String value2) {
            addCriterion("CXP_WX between", value1, value2, "CXP_WX");
            return (Criteria) this;
        }

        public Criteria andCXP_WXNotBetween(String value1, String value2) {
            addCriterion("CXP_WX not between", value1, value2, "CXP_WX");
            return (Criteria) this;
        }

        public Criteria andCXP_WX2IsNull() {
            addCriterion("CXP_WX2 is null");
            return (Criteria) this;
        }

        public Criteria andCXP_WX2IsNotNull() {
            addCriterion("CXP_WX2 is not null");
            return (Criteria) this;
        }

        public Criteria andCXP_WX2EqualTo(String value) {
            addCriterion("CXP_WX2 =", value, "CXP_WX2");
            return (Criteria) this;
        }

        public Criteria andCXP_WX2NotEqualTo(String value) {
            addCriterion("CXP_WX2 <>", value, "CXP_WX2");
            return (Criteria) this;
        }

        public Criteria andCXP_WX2GreaterThan(String value) {
            addCriterion("CXP_WX2 >", value, "CXP_WX2");
            return (Criteria) this;
        }

        public Criteria andCXP_WX2GreaterThanOrEqualTo(String value) {
            addCriterion("CXP_WX2 >=", value, "CXP_WX2");
            return (Criteria) this;
        }

        public Criteria andCXP_WX2LessThan(String value) {
            addCriterion("CXP_WX2 <", value, "CXP_WX2");
            return (Criteria) this;
        }

        public Criteria andCXP_WX2LessThanOrEqualTo(String value) {
            addCriterion("CXP_WX2 <=", value, "CXP_WX2");
            return (Criteria) this;
        }

        public Criteria andCXP_WX2Like(String value) {
            addCriterion("CXP_WX2 like", value, "CXP_WX2");
            return (Criteria) this;
        }

        public Criteria andCXP_WX2NotLike(String value) {
            addCriterion("CXP_WX2 not like", value, "CXP_WX2");
            return (Criteria) this;
        }

        public Criteria andCXP_WX2In(List<String> values) {
            addCriterion("CXP_WX2 in", values, "CXP_WX2");
            return (Criteria) this;
        }

        public Criteria andCXP_WX2NotIn(List<String> values) {
            addCriterion("CXP_WX2 not in", values, "CXP_WX2");
            return (Criteria) this;
        }

        public Criteria andCXP_WX2Between(String value1, String value2) {
            addCriterion("CXP_WX2 between", value1, value2, "CXP_WX2");
            return (Criteria) this;
        }

        public Criteria andCXP_WX2NotBetween(String value1, String value2) {
            addCriterion("CXP_WX2 not between", value1, value2, "CXP_WX2");
            return (Criteria) this;
        }

        public Criteria andCXP_WX3IsNull() {
            addCriterion("CXP_WX3 is null");
            return (Criteria) this;
        }

        public Criteria andCXP_WX3IsNotNull() {
            addCriterion("CXP_WX3 is not null");
            return (Criteria) this;
        }

        public Criteria andCXP_WX3EqualTo(String value) {
            addCriterion("CXP_WX3 =", value, "CXP_WX3");
            return (Criteria) this;
        }

        public Criteria andCXP_WX3NotEqualTo(String value) {
            addCriterion("CXP_WX3 <>", value, "CXP_WX3");
            return (Criteria) this;
        }

        public Criteria andCXP_WX3GreaterThan(String value) {
            addCriterion("CXP_WX3 >", value, "CXP_WX3");
            return (Criteria) this;
        }

        public Criteria andCXP_WX3GreaterThanOrEqualTo(String value) {
            addCriterion("CXP_WX3 >=", value, "CXP_WX3");
            return (Criteria) this;
        }

        public Criteria andCXP_WX3LessThan(String value) {
            addCriterion("CXP_WX3 <", value, "CXP_WX3");
            return (Criteria) this;
        }

        public Criteria andCXP_WX3LessThanOrEqualTo(String value) {
            addCriterion("CXP_WX3 <=", value, "CXP_WX3");
            return (Criteria) this;
        }

        public Criteria andCXP_WX3Like(String value) {
            addCriterion("CXP_WX3 like", value, "CXP_WX3");
            return (Criteria) this;
        }

        public Criteria andCXP_WX3NotLike(String value) {
            addCriterion("CXP_WX3 not like", value, "CXP_WX3");
            return (Criteria) this;
        }

        public Criteria andCXP_WX3In(List<String> values) {
            addCriterion("CXP_WX3 in", values, "CXP_WX3");
            return (Criteria) this;
        }

        public Criteria andCXP_WX3NotIn(List<String> values) {
            addCriterion("CXP_WX3 not in", values, "CXP_WX3");
            return (Criteria) this;
        }

        public Criteria andCXP_WX3Between(String value1, String value2) {
            addCriterion("CXP_WX3 between", value1, value2, "CXP_WX3");
            return (Criteria) this;
        }

        public Criteria andCXP_WX3NotBetween(String value1, String value2) {
            addCriterion("CXP_WX3 not between", value1, value2, "CXP_WX3");
            return (Criteria) this;
        }

        public Criteria andCXP_XJIsNull() {
            addCriterion("CXP_XJ is null");
            return (Criteria) this;
        }

        public Criteria andCXP_XJIsNotNull() {
            addCriterion("CXP_XJ is not null");
            return (Criteria) this;
        }

        public Criteria andCXP_XJEqualTo(String value) {
            addCriterion("CXP_XJ =", value, "CXP_XJ");
            return (Criteria) this;
        }

        public Criteria andCXP_XJNotEqualTo(String value) {
            addCriterion("CXP_XJ <>", value, "CXP_XJ");
            return (Criteria) this;
        }

        public Criteria andCXP_XJGreaterThan(String value) {
            addCriterion("CXP_XJ >", value, "CXP_XJ");
            return (Criteria) this;
        }

        public Criteria andCXP_XJGreaterThanOrEqualTo(String value) {
            addCriterion("CXP_XJ >=", value, "CXP_XJ");
            return (Criteria) this;
        }

        public Criteria andCXP_XJLessThan(String value) {
            addCriterion("CXP_XJ <", value, "CXP_XJ");
            return (Criteria) this;
        }

        public Criteria andCXP_XJLessThanOrEqualTo(String value) {
            addCriterion("CXP_XJ <=", value, "CXP_XJ");
            return (Criteria) this;
        }

        public Criteria andCXP_XJLike(String value) {
            addCriterion("CXP_XJ like", value, "CXP_XJ");
            return (Criteria) this;
        }

        public Criteria andCXP_XJNotLike(String value) {
            addCriterion("CXP_XJ not like", value, "CXP_XJ");
            return (Criteria) this;
        }

        public Criteria andCXP_XJIn(List<String> values) {
            addCriterion("CXP_XJ in", values, "CXP_XJ");
            return (Criteria) this;
        }

        public Criteria andCXP_XJNotIn(List<String> values) {
            addCriterion("CXP_XJ not in", values, "CXP_XJ");
            return (Criteria) this;
        }

        public Criteria andCXP_XJBetween(String value1, String value2) {
            addCriterion("CXP_XJ between", value1, value2, "CXP_XJ");
            return (Criteria) this;
        }

        public Criteria andCXP_XJNotBetween(String value1, String value2) {
            addCriterion("CXP_XJ not between", value1, value2, "CXP_XJ");
            return (Criteria) this;
        }

        public Criteria andCXP_CDIsNull() {
            addCriterion("CXP_CD is null");
            return (Criteria) this;
        }

        public Criteria andCXP_CDIsNotNull() {
            addCriterion("CXP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andCXP_CDEqualTo(String value) {
            addCriterion("CXP_CD =", value, "CXP_CD");
            return (Criteria) this;
        }

        public Criteria andCXP_CDNotEqualTo(String value) {
            addCriterion("CXP_CD <>", value, "CXP_CD");
            return (Criteria) this;
        }

        public Criteria andCXP_CDGreaterThan(String value) {
            addCriterion("CXP_CD >", value, "CXP_CD");
            return (Criteria) this;
        }

        public Criteria andCXP_CDGreaterThanOrEqualTo(String value) {
            addCriterion("CXP_CD >=", value, "CXP_CD");
            return (Criteria) this;
        }

        public Criteria andCXP_CDLessThan(String value) {
            addCriterion("CXP_CD <", value, "CXP_CD");
            return (Criteria) this;
        }

        public Criteria andCXP_CDLessThanOrEqualTo(String value) {
            addCriterion("CXP_CD <=", value, "CXP_CD");
            return (Criteria) this;
        }

        public Criteria andCXP_CDLike(String value) {
            addCriterion("CXP_CD like", value, "CXP_CD");
            return (Criteria) this;
        }

        public Criteria andCXP_CDNotLike(String value) {
            addCriterion("CXP_CD not like", value, "CXP_CD");
            return (Criteria) this;
        }

        public Criteria andCXP_CDIn(List<String> values) {
            addCriterion("CXP_CD in", values, "CXP_CD");
            return (Criteria) this;
        }

        public Criteria andCXP_CDNotIn(List<String> values) {
            addCriterion("CXP_CD not in", values, "CXP_CD");
            return (Criteria) this;
        }

        public Criteria andCXP_CDBetween(String value1, String value2) {
            addCriterion("CXP_CD between", value1, value2, "CXP_CD");
            return (Criteria) this;
        }

        public Criteria andCXP_CDNotBetween(String value1, String value2) {
            addCriterion("CXP_CD not between", value1, value2, "CXP_CD");
            return (Criteria) this;
        }

        public Criteria andCXP_MianIsNull() {
            addCriterion("CXP_Mian is null");
            return (Criteria) this;
        }

        public Criteria andCXP_MianIsNotNull() {
            addCriterion("CXP_Mian is not null");
            return (Criteria) this;
        }

        public Criteria andCXP_MianEqualTo(String value) {
            addCriterion("CXP_Mian =", value, "CXP_Mian");
            return (Criteria) this;
        }

        public Criteria andCXP_MianNotEqualTo(String value) {
            addCriterion("CXP_Mian <>", value, "CXP_Mian");
            return (Criteria) this;
        }

        public Criteria andCXP_MianGreaterThan(String value) {
            addCriterion("CXP_Mian >", value, "CXP_Mian");
            return (Criteria) this;
        }

        public Criteria andCXP_MianGreaterThanOrEqualTo(String value) {
            addCriterion("CXP_Mian >=", value, "CXP_Mian");
            return (Criteria) this;
        }

        public Criteria andCXP_MianLessThan(String value) {
            addCriterion("CXP_Mian <", value, "CXP_Mian");
            return (Criteria) this;
        }

        public Criteria andCXP_MianLessThanOrEqualTo(String value) {
            addCriterion("CXP_Mian <=", value, "CXP_Mian");
            return (Criteria) this;
        }

        public Criteria andCXP_MianLike(String value) {
            addCriterion("CXP_Mian like", value, "CXP_Mian");
            return (Criteria) this;
        }

        public Criteria andCXP_MianNotLike(String value) {
            addCriterion("CXP_Mian not like", value, "CXP_Mian");
            return (Criteria) this;
        }

        public Criteria andCXP_MianIn(List<String> values) {
            addCriterion("CXP_Mian in", values, "CXP_Mian");
            return (Criteria) this;
        }

        public Criteria andCXP_MianNotIn(List<String> values) {
            addCriterion("CXP_Mian not in", values, "CXP_Mian");
            return (Criteria) this;
        }

        public Criteria andCXP_MianBetween(String value1, String value2) {
            addCriterion("CXP_Mian between", value1, value2, "CXP_Mian");
            return (Criteria) this;
        }

        public Criteria andCXP_MianNotBetween(String value1, String value2) {
            addCriterion("CXP_Mian not between", value1, value2, "CXP_Mian");
            return (Criteria) this;
        }

        public Criteria andHui_MCorpIsNull() {
            addCriterion("Hui_MCorp is null");
            return (Criteria) this;
        }

        public Criteria andHui_MCorpIsNotNull() {
            addCriterion("Hui_MCorp is not null");
            return (Criteria) this;
        }

        public Criteria andHui_MCorpEqualTo(Double value) {
            addCriterion("Hui_MCorp =", value, "hui_MCorp");
            return (Criteria) this;
        }

        public Criteria andHui_MCorpNotEqualTo(Double value) {
            addCriterion("Hui_MCorp <>", value, "hui_MCorp");
            return (Criteria) this;
        }

        public Criteria andHui_MCorpGreaterThan(Double value) {
            addCriterion("Hui_MCorp >", value, "hui_MCorp");
            return (Criteria) this;
        }

        public Criteria andHui_MCorpGreaterThanOrEqualTo(Double value) {
            addCriterion("Hui_MCorp >=", value, "hui_MCorp");
            return (Criteria) this;
        }

        public Criteria andHui_MCorpLessThan(Double value) {
            addCriterion("Hui_MCorp <", value, "hui_MCorp");
            return (Criteria) this;
        }

        public Criteria andHui_MCorpLessThanOrEqualTo(Double value) {
            addCriterion("Hui_MCorp <=", value, "hui_MCorp");
            return (Criteria) this;
        }

        public Criteria andHui_MCorpIn(List<Double> values) {
            addCriterion("Hui_MCorp in", values, "hui_MCorp");
            return (Criteria) this;
        }

        public Criteria andHui_MCorpNotIn(List<Double> values) {
            addCriterion("Hui_MCorp not in", values, "hui_MCorp");
            return (Criteria) this;
        }

        public Criteria andHui_MCorpBetween(Double value1, Double value2) {
            addCriterion("Hui_MCorp between", value1, value2, "hui_MCorp");
            return (Criteria) this;
        }

        public Criteria andHui_MCorpNotBetween(Double value1, Double value2) {
            addCriterion("Hui_MCorp not between", value1, value2, "hui_MCorp");
            return (Criteria) this;
        }

        public Criteria andMoneyPerCateIsNull() {
            addCriterion("MoneyPerCate is null");
            return (Criteria) this;
        }

        public Criteria andMoneyPerCateIsNotNull() {
            addCriterion("MoneyPerCate is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyPerCateEqualTo(String value) {
            addCriterion("MoneyPerCate =", value, "moneyPerCate");
            return (Criteria) this;
        }

        public Criteria andMoneyPerCateNotEqualTo(String value) {
            addCriterion("MoneyPerCate <>", value, "moneyPerCate");
            return (Criteria) this;
        }

        public Criteria andMoneyPerCateGreaterThan(String value) {
            addCriterion("MoneyPerCate >", value, "moneyPerCate");
            return (Criteria) this;
        }

        public Criteria andMoneyPerCateGreaterThanOrEqualTo(String value) {
            addCriterion("MoneyPerCate >=", value, "moneyPerCate");
            return (Criteria) this;
        }

        public Criteria andMoneyPerCateLessThan(String value) {
            addCriterion("MoneyPerCate <", value, "moneyPerCate");
            return (Criteria) this;
        }

        public Criteria andMoneyPerCateLessThanOrEqualTo(String value) {
            addCriterion("MoneyPerCate <=", value, "moneyPerCate");
            return (Criteria) this;
        }

        public Criteria andMoneyPerCateLike(String value) {
            addCriterion("MoneyPerCate like", value, "moneyPerCate");
            return (Criteria) this;
        }

        public Criteria andMoneyPerCateNotLike(String value) {
            addCriterion("MoneyPerCate not like", value, "moneyPerCate");
            return (Criteria) this;
        }

        public Criteria andMoneyPerCateIn(List<String> values) {
            addCriterion("MoneyPerCate in", values, "moneyPerCate");
            return (Criteria) this;
        }

        public Criteria andMoneyPerCateNotIn(List<String> values) {
            addCriterion("MoneyPerCate not in", values, "moneyPerCate");
            return (Criteria) this;
        }

        public Criteria andMoneyPerCateBetween(String value1, String value2) {
            addCriterion("MoneyPerCate between", value1, value2, "moneyPerCate");
            return (Criteria) this;
        }

        public Criteria andMoneyPerCateNotBetween(String value1, String value2) {
            addCriterion("MoneyPerCate not between", value1, value2, "moneyPerCate");
            return (Criteria) this;
        }

        public Criteria andHui_MPerIsNull() {
            addCriterion("Hui_MPer is null");
            return (Criteria) this;
        }

        public Criteria andHui_MPerIsNotNull() {
            addCriterion("Hui_MPer is not null");
            return (Criteria) this;
        }

        public Criteria andHui_MPerEqualTo(Double value) {
            addCriterion("Hui_MPer =", value, "hui_MPer");
            return (Criteria) this;
        }

        public Criteria andHui_MPerNotEqualTo(Double value) {
            addCriterion("Hui_MPer <>", value, "hui_MPer");
            return (Criteria) this;
        }

        public Criteria andHui_MPerGreaterThan(Double value) {
            addCriterion("Hui_MPer >", value, "hui_MPer");
            return (Criteria) this;
        }

        public Criteria andHui_MPerGreaterThanOrEqualTo(Double value) {
            addCriterion("Hui_MPer >=", value, "hui_MPer");
            return (Criteria) this;
        }

        public Criteria andHui_MPerLessThan(Double value) {
            addCriterion("Hui_MPer <", value, "hui_MPer");
            return (Criteria) this;
        }

        public Criteria andHui_MPerLessThanOrEqualTo(Double value) {
            addCriterion("Hui_MPer <=", value, "hui_MPer");
            return (Criteria) this;
        }

        public Criteria andHui_MPerIn(List<Double> values) {
            addCriterion("Hui_MPer in", values, "hui_MPer");
            return (Criteria) this;
        }

        public Criteria andHui_MPerNotIn(List<Double> values) {
            addCriterion("Hui_MPer not in", values, "hui_MPer");
            return (Criteria) this;
        }

        public Criteria andHui_MPerBetween(Double value1, Double value2) {
            addCriterion("Hui_MPer between", value1, value2, "hui_MPer");
            return (Criteria) this;
        }

        public Criteria andHui_MPerNotBetween(Double value1, Double value2) {
            addCriterion("Hui_MPer not between", value1, value2, "hui_MPer");
            return (Criteria) this;
        }

        public Criteria andMoneyOtherCateIsNull() {
            addCriterion("MoneyOtherCate is null");
            return (Criteria) this;
        }

        public Criteria andMoneyOtherCateIsNotNull() {
            addCriterion("MoneyOtherCate is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyOtherCateEqualTo(String value) {
            addCriterion("MoneyOtherCate =", value, "moneyOtherCate");
            return (Criteria) this;
        }

        public Criteria andMoneyOtherCateNotEqualTo(String value) {
            addCriterion("MoneyOtherCate <>", value, "moneyOtherCate");
            return (Criteria) this;
        }

        public Criteria andMoneyOtherCateGreaterThan(String value) {
            addCriterion("MoneyOtherCate >", value, "moneyOtherCate");
            return (Criteria) this;
        }

        public Criteria andMoneyOtherCateGreaterThanOrEqualTo(String value) {
            addCriterion("MoneyOtherCate >=", value, "moneyOtherCate");
            return (Criteria) this;
        }

        public Criteria andMoneyOtherCateLessThan(String value) {
            addCriterion("MoneyOtherCate <", value, "moneyOtherCate");
            return (Criteria) this;
        }

        public Criteria andMoneyOtherCateLessThanOrEqualTo(String value) {
            addCriterion("MoneyOtherCate <=", value, "moneyOtherCate");
            return (Criteria) this;
        }

        public Criteria andMoneyOtherCateLike(String value) {
            addCriterion("MoneyOtherCate like", value, "moneyOtherCate");
            return (Criteria) this;
        }

        public Criteria andMoneyOtherCateNotLike(String value) {
            addCriterion("MoneyOtherCate not like", value, "moneyOtherCate");
            return (Criteria) this;
        }

        public Criteria andMoneyOtherCateIn(List<String> values) {
            addCriterion("MoneyOtherCate in", values, "moneyOtherCate");
            return (Criteria) this;
        }

        public Criteria andMoneyOtherCateNotIn(List<String> values) {
            addCriterion("MoneyOtherCate not in", values, "moneyOtherCate");
            return (Criteria) this;
        }

        public Criteria andMoneyOtherCateBetween(String value1, String value2) {
            addCriterion("MoneyOtherCate between", value1, value2, "moneyOtherCate");
            return (Criteria) this;
        }

        public Criteria andMoneyOtherCateNotBetween(String value1, String value2) {
            addCriterion("MoneyOtherCate not between", value1, value2, "moneyOtherCate");
            return (Criteria) this;
        }

        public Criteria andHui_MOtherIsNull() {
            addCriterion("Hui_MOther is null");
            return (Criteria) this;
        }

        public Criteria andHui_MOtherIsNotNull() {
            addCriterion("Hui_MOther is not null");
            return (Criteria) this;
        }

        public Criteria andHui_MOtherEqualTo(Double value) {
            addCriterion("Hui_MOther =", value, "hui_MOther");
            return (Criteria) this;
        }

        public Criteria andHui_MOtherNotEqualTo(Double value) {
            addCriterion("Hui_MOther <>", value, "hui_MOther");
            return (Criteria) this;
        }

        public Criteria andHui_MOtherGreaterThan(Double value) {
            addCriterion("Hui_MOther >", value, "hui_MOther");
            return (Criteria) this;
        }

        public Criteria andHui_MOtherGreaterThanOrEqualTo(Double value) {
            addCriterion("Hui_MOther >=", value, "hui_MOther");
            return (Criteria) this;
        }

        public Criteria andHui_MOtherLessThan(Double value) {
            addCriterion("Hui_MOther <", value, "hui_MOther");
            return (Criteria) this;
        }

        public Criteria andHui_MOtherLessThanOrEqualTo(Double value) {
            addCriterion("Hui_MOther <=", value, "hui_MOther");
            return (Criteria) this;
        }

        public Criteria andHui_MOtherIn(List<Double> values) {
            addCriterion("Hui_MOther in", values, "hui_MOther");
            return (Criteria) this;
        }

        public Criteria andHui_MOtherNotIn(List<Double> values) {
            addCriterion("Hui_MOther not in", values, "hui_MOther");
            return (Criteria) this;
        }

        public Criteria andHui_MOtherBetween(Double value1, Double value2) {
            addCriterion("Hui_MOther between", value1, value2, "hui_MOther");
            return (Criteria) this;
        }

        public Criteria andHui_MOtherNotBetween(Double value1, Double value2) {
            addCriterion("Hui_MOther not between", value1, value2, "hui_MOther");
            return (Criteria) this;
        }

        public Criteria andHui_MCorpJsIsNull() {
            addCriterion("Hui_MCorpJs is null");
            return (Criteria) this;
        }

        public Criteria andHui_MCorpJsIsNotNull() {
            addCriterion("Hui_MCorpJs is not null");
            return (Criteria) this;
        }

        public Criteria andHui_MCorpJsEqualTo(Double value) {
            addCriterion("Hui_MCorpJs =", value, "hui_MCorpJs");
            return (Criteria) this;
        }

        public Criteria andHui_MCorpJsNotEqualTo(Double value) {
            addCriterion("Hui_MCorpJs <>", value, "hui_MCorpJs");
            return (Criteria) this;
        }

        public Criteria andHui_MCorpJsGreaterThan(Double value) {
            addCriterion("Hui_MCorpJs >", value, "hui_MCorpJs");
            return (Criteria) this;
        }

        public Criteria andHui_MCorpJsGreaterThanOrEqualTo(Double value) {
            addCriterion("Hui_MCorpJs >=", value, "hui_MCorpJs");
            return (Criteria) this;
        }

        public Criteria andHui_MCorpJsLessThan(Double value) {
            addCriterion("Hui_MCorpJs <", value, "hui_MCorpJs");
            return (Criteria) this;
        }

        public Criteria andHui_MCorpJsLessThanOrEqualTo(Double value) {
            addCriterion("Hui_MCorpJs <=", value, "hui_MCorpJs");
            return (Criteria) this;
        }

        public Criteria andHui_MCorpJsIn(List<Double> values) {
            addCriterion("Hui_MCorpJs in", values, "hui_MCorpJs");
            return (Criteria) this;
        }

        public Criteria andHui_MCorpJsNotIn(List<Double> values) {
            addCriterion("Hui_MCorpJs not in", values, "hui_MCorpJs");
            return (Criteria) this;
        }

        public Criteria andHui_MCorpJsBetween(Double value1, Double value2) {
            addCriterion("Hui_MCorpJs between", value1, value2, "hui_MCorpJs");
            return (Criteria) this;
        }

        public Criteria andHui_MCorpJsNotBetween(Double value1, Double value2) {
            addCriterion("Hui_MCorpJs not between", value1, value2, "hui_MCorpJs");
            return (Criteria) this;
        }

        public Criteria andHui_MianIsNull() {
            addCriterion("Hui_Mian is null");
            return (Criteria) this;
        }

        public Criteria andHui_MianIsNotNull() {
            addCriterion("Hui_Mian is not null");
            return (Criteria) this;
        }

        public Criteria andHui_MianEqualTo(Double value) {
            addCriterion("Hui_Mian =", value, "hui_Mian");
            return (Criteria) this;
        }

        public Criteria andHui_MianNotEqualTo(Double value) {
            addCriterion("Hui_Mian <>", value, "hui_Mian");
            return (Criteria) this;
        }

        public Criteria andHui_MianGreaterThan(Double value) {
            addCriterion("Hui_Mian >", value, "hui_Mian");
            return (Criteria) this;
        }

        public Criteria andHui_MianGreaterThanOrEqualTo(Double value) {
            addCriterion("Hui_Mian >=", value, "hui_Mian");
            return (Criteria) this;
        }

        public Criteria andHui_MianLessThan(Double value) {
            addCriterion("Hui_Mian <", value, "hui_Mian");
            return (Criteria) this;
        }

        public Criteria andHui_MianLessThanOrEqualTo(Double value) {
            addCriterion("Hui_Mian <=", value, "hui_Mian");
            return (Criteria) this;
        }

        public Criteria andHui_MianIn(List<Double> values) {
            addCriterion("Hui_Mian in", values, "hui_Mian");
            return (Criteria) this;
        }

        public Criteria andHui_MianNotIn(List<Double> values) {
            addCriterion("Hui_Mian not in", values, "hui_Mian");
            return (Criteria) this;
        }

        public Criteria andHui_MianBetween(Double value1, Double value2) {
            addCriterion("Hui_Mian between", value1, value2, "hui_Mian");
            return (Criteria) this;
        }

        public Criteria andHui_MianNotBetween(Double value1, Double value2) {
            addCriterion("Hui_Mian not between", value1, value2, "hui_Mian");
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