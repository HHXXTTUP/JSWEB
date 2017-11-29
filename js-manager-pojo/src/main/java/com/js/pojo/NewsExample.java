package com.js.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsExample() {
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

        public Criteria andNewsIDIsNull() {
            addCriterion("NewsID is null");
            return (Criteria) this;
        }

        public Criteria andNewsIDIsNotNull() {
            addCriterion("NewsID is not null");
            return (Criteria) this;
        }

        public Criteria andNewsIDEqualTo(Integer value) {
            addCriterion("NewsID =", value, "newsID");
            return (Criteria) this;
        }

        public Criteria andNewsIDNotEqualTo(Integer value) {
            addCriterion("NewsID <>", value, "newsID");
            return (Criteria) this;
        }

        public Criteria andNewsIDGreaterThan(Integer value) {
            addCriterion("NewsID >", value, "newsID");
            return (Criteria) this;
        }

        public Criteria andNewsIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("NewsID >=", value, "newsID");
            return (Criteria) this;
        }

        public Criteria andNewsIDLessThan(Integer value) {
            addCriterion("NewsID <", value, "newsID");
            return (Criteria) this;
        }

        public Criteria andNewsIDLessThanOrEqualTo(Integer value) {
            addCriterion("NewsID <=", value, "newsID");
            return (Criteria) this;
        }

        public Criteria andNewsIDIn(List<Integer> values) {
            addCriterion("NewsID in", values, "newsID");
            return (Criteria) this;
        }

        public Criteria andNewsIDNotIn(List<Integer> values) {
            addCriterion("NewsID not in", values, "newsID");
            return (Criteria) this;
        }

        public Criteria andNewsIDBetween(Integer value1, Integer value2) {
            addCriterion("NewsID between", value1, value2, "newsID");
            return (Criteria) this;
        }

        public Criteria andNewsIDNotBetween(Integer value1, Integer value2) {
            addCriterion("NewsID not between", value1, value2, "newsID");
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

        public Criteria andBigClassNameIsNull() {
            addCriterion("BigClassName is null");
            return (Criteria) this;
        }

        public Criteria andBigClassNameIsNotNull() {
            addCriterion("BigClassName is not null");
            return (Criteria) this;
        }

        public Criteria andBigClassNameEqualTo(String value) {
            addCriterion("BigClassName =", value, "bigClassName");
            return (Criteria) this;
        }

        public Criteria andBigClassNameNotEqualTo(String value) {
            addCriterion("BigClassName <>", value, "bigClassName");
            return (Criteria) this;
        }

        public Criteria andBigClassNameGreaterThan(String value) {
            addCriterion("BigClassName >", value, "bigClassName");
            return (Criteria) this;
        }

        public Criteria andBigClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("BigClassName >=", value, "bigClassName");
            return (Criteria) this;
        }

        public Criteria andBigClassNameLessThan(String value) {
            addCriterion("BigClassName <", value, "bigClassName");
            return (Criteria) this;
        }

        public Criteria andBigClassNameLessThanOrEqualTo(String value) {
            addCriterion("BigClassName <=", value, "bigClassName");
            return (Criteria) this;
        }

        public Criteria andBigClassNameLike(String value) {
            addCriterion("BigClassName like", value, "bigClassName");
            return (Criteria) this;
        }

        public Criteria andBigClassNameNotLike(String value) {
            addCriterion("BigClassName not like", value, "bigClassName");
            return (Criteria) this;
        }

        public Criteria andBigClassNameIn(List<String> values) {
            addCriterion("BigClassName in", values, "bigClassName");
            return (Criteria) this;
        }

        public Criteria andBigClassNameNotIn(List<String> values) {
            addCriterion("BigClassName not in", values, "bigClassName");
            return (Criteria) this;
        }

        public Criteria andBigClassNameBetween(String value1, String value2) {
            addCriterion("BigClassName between", value1, value2, "bigClassName");
            return (Criteria) this;
        }

        public Criteria andBigClassNameNotBetween(String value1, String value2) {
            addCriterion("BigClassName not between", value1, value2, "bigClassName");
            return (Criteria) this;
        }

        public Criteria andSmallClassNameIsNull() {
            addCriterion("SmallClassName is null");
            return (Criteria) this;
        }

        public Criteria andSmallClassNameIsNotNull() {
            addCriterion("SmallClassName is not null");
            return (Criteria) this;
        }

        public Criteria andSmallClassNameEqualTo(String value) {
            addCriterion("SmallClassName =", value, "smallClassName");
            return (Criteria) this;
        }

        public Criteria andSmallClassNameNotEqualTo(String value) {
            addCriterion("SmallClassName <>", value, "smallClassName");
            return (Criteria) this;
        }

        public Criteria andSmallClassNameGreaterThan(String value) {
            addCriterion("SmallClassName >", value, "smallClassName");
            return (Criteria) this;
        }

        public Criteria andSmallClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("SmallClassName >=", value, "smallClassName");
            return (Criteria) this;
        }

        public Criteria andSmallClassNameLessThan(String value) {
            addCriterion("SmallClassName <", value, "smallClassName");
            return (Criteria) this;
        }

        public Criteria andSmallClassNameLessThanOrEqualTo(String value) {
            addCriterion("SmallClassName <=", value, "smallClassName");
            return (Criteria) this;
        }

        public Criteria andSmallClassNameLike(String value) {
            addCriterion("SmallClassName like", value, "smallClassName");
            return (Criteria) this;
        }

        public Criteria andSmallClassNameNotLike(String value) {
            addCriterion("SmallClassName not like", value, "smallClassName");
            return (Criteria) this;
        }

        public Criteria andSmallClassNameIn(List<String> values) {
            addCriterion("SmallClassName in", values, "smallClassName");
            return (Criteria) this;
        }

        public Criteria andSmallClassNameNotIn(List<String> values) {
            addCriterion("SmallClassName not in", values, "smallClassName");
            return (Criteria) this;
        }

        public Criteria andSmallClassNameBetween(String value1, String value2) {
            addCriterion("SmallClassName between", value1, value2, "smallClassName");
            return (Criteria) this;
        }

        public Criteria andSmallClassNameNotBetween(String value1, String value2) {
            addCriterion("SmallClassName not between", value1, value2, "smallClassName");
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

        public Criteria andIndexTitleIsNull() {
            addCriterion("IndexTitle is null");
            return (Criteria) this;
        }

        public Criteria andIndexTitleIsNotNull() {
            addCriterion("IndexTitle is not null");
            return (Criteria) this;
        }

        public Criteria andIndexTitleEqualTo(String value) {
            addCriterion("IndexTitle =", value, "indexTitle");
            return (Criteria) this;
        }

        public Criteria andIndexTitleNotEqualTo(String value) {
            addCriterion("IndexTitle <>", value, "indexTitle");
            return (Criteria) this;
        }

        public Criteria andIndexTitleGreaterThan(String value) {
            addCriterion("IndexTitle >", value, "indexTitle");
            return (Criteria) this;
        }

        public Criteria andIndexTitleGreaterThanOrEqualTo(String value) {
            addCriterion("IndexTitle >=", value, "indexTitle");
            return (Criteria) this;
        }

        public Criteria andIndexTitleLessThan(String value) {
            addCriterion("IndexTitle <", value, "indexTitle");
            return (Criteria) this;
        }

        public Criteria andIndexTitleLessThanOrEqualTo(String value) {
            addCriterion("IndexTitle <=", value, "indexTitle");
            return (Criteria) this;
        }

        public Criteria andIndexTitleLike(String value) {
            addCriterion("IndexTitle like", value, "indexTitle");
            return (Criteria) this;
        }

        public Criteria andIndexTitleNotLike(String value) {
            addCriterion("IndexTitle not like", value, "indexTitle");
            return (Criteria) this;
        }

        public Criteria andIndexTitleIn(List<String> values) {
            addCriterion("IndexTitle in", values, "indexTitle");
            return (Criteria) this;
        }

        public Criteria andIndexTitleNotIn(List<String> values) {
            addCriterion("IndexTitle not in", values, "indexTitle");
            return (Criteria) this;
        }

        public Criteria andIndexTitleBetween(String value1, String value2) {
            addCriterion("IndexTitle between", value1, value2, "indexTitle");
            return (Criteria) this;
        }

        public Criteria andIndexTitleNotBetween(String value1, String value2) {
            addCriterion("IndexTitle not between", value1, value2, "indexTitle");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("Author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("Author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("Author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("Author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("Author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("Author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("Author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("Author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("Author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("Author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("Author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("Author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("Author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("Author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andOriginalIsNull() {
            addCriterion("Original is null");
            return (Criteria) this;
        }

        public Criteria andOriginalIsNotNull() {
            addCriterion("Original is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalEqualTo(String value) {
            addCriterion("Original =", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalNotEqualTo(String value) {
            addCriterion("Original <>", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalGreaterThan(String value) {
            addCriterion("Original >", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalGreaterThanOrEqualTo(String value) {
            addCriterion("Original >=", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalLessThan(String value) {
            addCriterion("Original <", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalLessThanOrEqualTo(String value) {
            addCriterion("Original <=", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalLike(String value) {
            addCriterion("Original like", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalNotLike(String value) {
            addCriterion("Original not like", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalIn(List<String> values) {
            addCriterion("Original in", values, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalNotIn(List<String> values) {
            addCriterion("Original not in", values, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalBetween(String value1, String value2) {
            addCriterion("Original between", value1, value2, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalNotBetween(String value1, String value2) {
            addCriterion("Original not between", value1, value2, "original");
            return (Criteria) this;
        }

        public Criteria andHuiCateIsNull() {
            addCriterion("HuiCate is null");
            return (Criteria) this;
        }

        public Criteria andHuiCateIsNotNull() {
            addCriterion("HuiCate is not null");
            return (Criteria) this;
        }

        public Criteria andHuiCateEqualTo(String value) {
            addCriterion("HuiCate =", value, "huiCate");
            return (Criteria) this;
        }

        public Criteria andHuiCateNotEqualTo(String value) {
            addCriterion("HuiCate <>", value, "huiCate");
            return (Criteria) this;
        }

        public Criteria andHuiCateGreaterThan(String value) {
            addCriterion("HuiCate >", value, "huiCate");
            return (Criteria) this;
        }

        public Criteria andHuiCateGreaterThanOrEqualTo(String value) {
            addCriterion("HuiCate >=", value, "huiCate");
            return (Criteria) this;
        }

        public Criteria andHuiCateLessThan(String value) {
            addCriterion("HuiCate <", value, "huiCate");
            return (Criteria) this;
        }

        public Criteria andHuiCateLessThanOrEqualTo(String value) {
            addCriterion("HuiCate <=", value, "huiCate");
            return (Criteria) this;
        }

        public Criteria andHuiCateLike(String value) {
            addCriterion("HuiCate like", value, "huiCate");
            return (Criteria) this;
        }

        public Criteria andHuiCateNotLike(String value) {
            addCriterion("HuiCate not like", value, "huiCate");
            return (Criteria) this;
        }

        public Criteria andHuiCateIn(List<String> values) {
            addCriterion("HuiCate in", values, "huiCate");
            return (Criteria) this;
        }

        public Criteria andHuiCateNotIn(List<String> values) {
            addCriterion("HuiCate not in", values, "huiCate");
            return (Criteria) this;
        }

        public Criteria andHuiCateBetween(String value1, String value2) {
            addCriterion("HuiCate between", value1, value2, "huiCate");
            return (Criteria) this;
        }

        public Criteria andHuiCateNotBetween(String value1, String value2) {
            addCriterion("HuiCate not between", value1, value2, "huiCate");
            return (Criteria) this;
        }

        public Criteria andHuiDateIsNull() {
            addCriterion("HuiDate is null");
            return (Criteria) this;
        }

        public Criteria andHuiDateIsNotNull() {
            addCriterion("HuiDate is not null");
            return (Criteria) this;
        }

        public Criteria andHuiDateEqualTo(String value) {
            addCriterion("HuiDate =", value, "huiDate");
            return (Criteria) this;
        }

        public Criteria andHuiDateNotEqualTo(String value) {
            addCriterion("HuiDate <>", value, "huiDate");
            return (Criteria) this;
        }

        public Criteria andHuiDateGreaterThan(String value) {
            addCriterion("HuiDate >", value, "huiDate");
            return (Criteria) this;
        }

        public Criteria andHuiDateGreaterThanOrEqualTo(String value) {
            addCriterion("HuiDate >=", value, "huiDate");
            return (Criteria) this;
        }

        public Criteria andHuiDateLessThan(String value) {
            addCriterion("HuiDate <", value, "huiDate");
            return (Criteria) this;
        }

        public Criteria andHuiDateLessThanOrEqualTo(String value) {
            addCriterion("HuiDate <=", value, "huiDate");
            return (Criteria) this;
        }

        public Criteria andHuiDateLike(String value) {
            addCriterion("HuiDate like", value, "huiDate");
            return (Criteria) this;
        }

        public Criteria andHuiDateNotLike(String value) {
            addCriterion("HuiDate not like", value, "huiDate");
            return (Criteria) this;
        }

        public Criteria andHuiDateIn(List<String> values) {
            addCriterion("HuiDate in", values, "huiDate");
            return (Criteria) this;
        }

        public Criteria andHuiDateNotIn(List<String> values) {
            addCriterion("HuiDate not in", values, "huiDate");
            return (Criteria) this;
        }

        public Criteria andHuiDateBetween(String value1, String value2) {
            addCriterion("HuiDate between", value1, value2, "huiDate");
            return (Criteria) this;
        }

        public Criteria andHuiDateNotBetween(String value1, String value2) {
            addCriterion("HuiDate not between", value1, value2, "huiDate");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(Integer value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(Integer value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(Integer value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(Integer value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(Integer value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(Integer value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<Integer> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<Integer> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(Integer value1, Integer value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(Integer value1, Integer value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UpdateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UpdateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UpdateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UpdateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UpdateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UpdateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UpdateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UpdateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UpdateTime not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andIshuirevIsNull() {
            addCriterion("ishuirev is null");
            return (Criteria) this;
        }

        public Criteria andIshuirevIsNotNull() {
            addCriterion("ishuirev is not null");
            return (Criteria) this;
        }

        public Criteria andIshuirevEqualTo(Integer value) {
            addCriterion("ishuirev =", value, "ishuirev");
            return (Criteria) this;
        }

        public Criteria andIshuirevNotEqualTo(Integer value) {
            addCriterion("ishuirev <>", value, "ishuirev");
            return (Criteria) this;
        }

        public Criteria andIshuirevGreaterThan(Integer value) {
            addCriterion("ishuirev >", value, "ishuirev");
            return (Criteria) this;
        }

        public Criteria andIshuirevGreaterThanOrEqualTo(Integer value) {
            addCriterion("ishuirev >=", value, "ishuirev");
            return (Criteria) this;
        }

        public Criteria andIshuirevLessThan(Integer value) {
            addCriterion("ishuirev <", value, "ishuirev");
            return (Criteria) this;
        }

        public Criteria andIshuirevLessThanOrEqualTo(Integer value) {
            addCriterion("ishuirev <=", value, "ishuirev");
            return (Criteria) this;
        }

        public Criteria andIshuirevIn(List<Integer> values) {
            addCriterion("ishuirev in", values, "ishuirev");
            return (Criteria) this;
        }

        public Criteria andIshuirevNotIn(List<Integer> values) {
            addCriterion("ishuirev not in", values, "ishuirev");
            return (Criteria) this;
        }

        public Criteria andIshuirevBetween(Integer value1, Integer value2) {
            addCriterion("ishuirev between", value1, value2, "ishuirev");
            return (Criteria) this;
        }

        public Criteria andIshuirevNotBetween(Integer value1, Integer value2) {
            addCriterion("ishuirev not between", value1, value2, "ishuirev");
            return (Criteria) this;
        }

        public Criteria andStarIsNull() {
            addCriterion("Star is null");
            return (Criteria) this;
        }

        public Criteria andStarIsNotNull() {
            addCriterion("Star is not null");
            return (Criteria) this;
        }

        public Criteria andStarEqualTo(String value) {
            addCriterion("Star =", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotEqualTo(String value) {
            addCriterion("Star <>", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarGreaterThan(String value) {
            addCriterion("Star >", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarGreaterThanOrEqualTo(String value) {
            addCriterion("Star >=", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarLessThan(String value) {
            addCriterion("Star <", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarLessThanOrEqualTo(String value) {
            addCriterion("Star <=", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarLike(String value) {
            addCriterion("Star like", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotLike(String value) {
            addCriterion("Star not like", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarIn(List<String> values) {
            addCriterion("Star in", values, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotIn(List<String> values) {
            addCriterion("Star not in", values, "star");
            return (Criteria) this;
        }

        public Criteria andStarBetween(String value1, String value2) {
            addCriterion("Star between", value1, value2, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotBetween(String value1, String value2) {
            addCriterion("Star not between", value1, value2, "star");
            return (Criteria) this;
        }

        public Criteria andHotIsNull() {
            addCriterion("Hot is null");
            return (Criteria) this;
        }

        public Criteria andHotIsNotNull() {
            addCriterion("Hot is not null");
            return (Criteria) this;
        }

        public Criteria andHotEqualTo(Integer value) {
            addCriterion("Hot =", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotEqualTo(Integer value) {
            addCriterion("Hot <>", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotGreaterThan(Integer value) {
            addCriterion("Hot >", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotGreaterThanOrEqualTo(Integer value) {
            addCriterion("Hot >=", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotLessThan(Integer value) {
            addCriterion("Hot <", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotLessThanOrEqualTo(Integer value) {
            addCriterion("Hot <=", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotIn(List<Integer> values) {
            addCriterion("Hot in", values, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotIn(List<Integer> values) {
            addCriterion("Hot not in", values, "hot");
            return (Criteria) this;
        }

        public Criteria andHotBetween(Integer value1, Integer value2) {
            addCriterion("Hot between", value1, value2, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotBetween(Integer value1, Integer value2) {
            addCriterion("Hot not between", value1, value2, "hot");
            return (Criteria) this;
        }

        public Criteria andBigNewsIDIsNull() {
            addCriterion("BigNewsID is null");
            return (Criteria) this;
        }

        public Criteria andBigNewsIDIsNotNull() {
            addCriterion("BigNewsID is not null");
            return (Criteria) this;
        }

        public Criteria andBigNewsIDEqualTo(Integer value) {
            addCriterion("BigNewsID =", value, "bigNewsID");
            return (Criteria) this;
        }

        public Criteria andBigNewsIDNotEqualTo(Integer value) {
            addCriterion("BigNewsID <>", value, "bigNewsID");
            return (Criteria) this;
        }

        public Criteria andBigNewsIDGreaterThan(Integer value) {
            addCriterion("BigNewsID >", value, "bigNewsID");
            return (Criteria) this;
        }

        public Criteria andBigNewsIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("BigNewsID >=", value, "bigNewsID");
            return (Criteria) this;
        }

        public Criteria andBigNewsIDLessThan(Integer value) {
            addCriterion("BigNewsID <", value, "bigNewsID");
            return (Criteria) this;
        }

        public Criteria andBigNewsIDLessThanOrEqualTo(Integer value) {
            addCriterion("BigNewsID <=", value, "bigNewsID");
            return (Criteria) this;
        }

        public Criteria andBigNewsIDIn(List<Integer> values) {
            addCriterion("BigNewsID in", values, "bigNewsID");
            return (Criteria) this;
        }

        public Criteria andBigNewsIDNotIn(List<Integer> values) {
            addCriterion("BigNewsID not in", values, "bigNewsID");
            return (Criteria) this;
        }

        public Criteria andBigNewsIDBetween(Integer value1, Integer value2) {
            addCriterion("BigNewsID between", value1, value2, "bigNewsID");
            return (Criteria) this;
        }

        public Criteria andBigNewsIDNotBetween(Integer value1, Integer value2) {
            addCriterion("BigNewsID not between", value1, value2, "bigNewsID");
            return (Criteria) this;
        }

        public Criteria andIstopIsNull() {
            addCriterion("istop is null");
            return (Criteria) this;
        }

        public Criteria andIstopIsNotNull() {
            addCriterion("istop is not null");
            return (Criteria) this;
        }

        public Criteria andIstopEqualTo(Integer value) {
            addCriterion("istop =", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotEqualTo(Integer value) {
            addCriterion("istop <>", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopGreaterThan(Integer value) {
            addCriterion("istop >", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopGreaterThanOrEqualTo(Integer value) {
            addCriterion("istop >=", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLessThan(Integer value) {
            addCriterion("istop <", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLessThanOrEqualTo(Integer value) {
            addCriterion("istop <=", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopIn(List<Integer> values) {
            addCriterion("istop in", values, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotIn(List<Integer> values) {
            addCriterion("istop not in", values, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopBetween(Integer value1, Integer value2) {
            addCriterion("istop between", value1, value2, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotBetween(Integer value1, Integer value2) {
            addCriterion("istop not between", value1, value2, "istop");
            return (Criteria) this;
        }

        public Criteria andIsgoodIsNull() {
            addCriterion("isgood is null");
            return (Criteria) this;
        }

        public Criteria andIsgoodIsNotNull() {
            addCriterion("isgood is not null");
            return (Criteria) this;
        }

        public Criteria andIsgoodEqualTo(Integer value) {
            addCriterion("isgood =", value, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsgoodNotEqualTo(Integer value) {
            addCriterion("isgood <>", value, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsgoodGreaterThan(Integer value) {
            addCriterion("isgood >", value, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsgoodGreaterThanOrEqualTo(Integer value) {
            addCriterion("isgood >=", value, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsgoodLessThan(Integer value) {
            addCriterion("isgood <", value, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsgoodLessThanOrEqualTo(Integer value) {
            addCriterion("isgood <=", value, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsgoodIn(List<Integer> values) {
            addCriterion("isgood in", values, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsgoodNotIn(List<Integer> values) {
            addCriterion("isgood not in", values, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsgoodBetween(Integer value1, Integer value2) {
            addCriterion("isgood between", value1, value2, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsgoodNotBetween(Integer value1, Integer value2) {
            addCriterion("isgood not between", value1, value2, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsindexIsNull() {
            addCriterion("isindex is null");
            return (Criteria) this;
        }

        public Criteria andIsindexIsNotNull() {
            addCriterion("isindex is not null");
            return (Criteria) this;
        }

        public Criteria andIsindexEqualTo(Integer value) {
            addCriterion("isindex =", value, "isindex");
            return (Criteria) this;
        }

        public Criteria andIsindexNotEqualTo(Integer value) {
            addCriterion("isindex <>", value, "isindex");
            return (Criteria) this;
        }

        public Criteria andIsindexGreaterThan(Integer value) {
            addCriterion("isindex >", value, "isindex");
            return (Criteria) this;
        }

        public Criteria andIsindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("isindex >=", value, "isindex");
            return (Criteria) this;
        }

        public Criteria andIsindexLessThan(Integer value) {
            addCriterion("isindex <", value, "isindex");
            return (Criteria) this;
        }

        public Criteria andIsindexLessThanOrEqualTo(Integer value) {
            addCriterion("isindex <=", value, "isindex");
            return (Criteria) this;
        }

        public Criteria andIsindexIn(List<Integer> values) {
            addCriterion("isindex in", values, "isindex");
            return (Criteria) this;
        }

        public Criteria andIsindexNotIn(List<Integer> values) {
            addCriterion("isindex not in", values, "isindex");
            return (Criteria) this;
        }

        public Criteria andIsindexBetween(Integer value1, Integer value2) {
            addCriterion("isindex between", value1, value2, "isindex");
            return (Criteria) this;
        }

        public Criteria andIsindexNotBetween(Integer value1, Integer value2) {
            addCriterion("isindex not between", value1, value2, "isindex");
            return (Criteria) this;
        }

        public Criteria andIsindexpicIsNull() {
            addCriterion("isindexpic is null");
            return (Criteria) this;
        }

        public Criteria andIsindexpicIsNotNull() {
            addCriterion("isindexpic is not null");
            return (Criteria) this;
        }

        public Criteria andIsindexpicEqualTo(Integer value) {
            addCriterion("isindexpic =", value, "isindexpic");
            return (Criteria) this;
        }

        public Criteria andIsindexpicNotEqualTo(Integer value) {
            addCriterion("isindexpic <>", value, "isindexpic");
            return (Criteria) this;
        }

        public Criteria andIsindexpicGreaterThan(Integer value) {
            addCriterion("isindexpic >", value, "isindexpic");
            return (Criteria) this;
        }

        public Criteria andIsindexpicGreaterThanOrEqualTo(Integer value) {
            addCriterion("isindexpic >=", value, "isindexpic");
            return (Criteria) this;
        }

        public Criteria andIsindexpicLessThan(Integer value) {
            addCriterion("isindexpic <", value, "isindexpic");
            return (Criteria) this;
        }

        public Criteria andIsindexpicLessThanOrEqualTo(Integer value) {
            addCriterion("isindexpic <=", value, "isindexpic");
            return (Criteria) this;
        }

        public Criteria andIsindexpicIn(List<Integer> values) {
            addCriterion("isindexpic in", values, "isindexpic");
            return (Criteria) this;
        }

        public Criteria andIsindexpicNotIn(List<Integer> values) {
            addCriterion("isindexpic not in", values, "isindexpic");
            return (Criteria) this;
        }

        public Criteria andIsindexpicBetween(Integer value1, Integer value2) {
            addCriterion("isindexpic between", value1, value2, "isindexpic");
            return (Criteria) this;
        }

        public Criteria andIsindexpicNotBetween(Integer value1, Integer value2) {
            addCriterion("isindexpic not between", value1, value2, "isindexpic");
            return (Criteria) this;
        }

        public Criteria andIsindexnewsIsNull() {
            addCriterion("isindexnews is null");
            return (Criteria) this;
        }

        public Criteria andIsindexnewsIsNotNull() {
            addCriterion("isindexnews is not null");
            return (Criteria) this;
        }

        public Criteria andIsindexnewsEqualTo(Integer value) {
            addCriterion("isindexnews =", value, "isindexnews");
            return (Criteria) this;
        }

        public Criteria andIsindexnewsNotEqualTo(Integer value) {
            addCriterion("isindexnews <>", value, "isindexnews");
            return (Criteria) this;
        }

        public Criteria andIsindexnewsGreaterThan(Integer value) {
            addCriterion("isindexnews >", value, "isindexnews");
            return (Criteria) this;
        }

        public Criteria andIsindexnewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("isindexnews >=", value, "isindexnews");
            return (Criteria) this;
        }

        public Criteria andIsindexnewsLessThan(Integer value) {
            addCriterion("isindexnews <", value, "isindexnews");
            return (Criteria) this;
        }

        public Criteria andIsindexnewsLessThanOrEqualTo(Integer value) {
            addCriterion("isindexnews <=", value, "isindexnews");
            return (Criteria) this;
        }

        public Criteria andIsindexnewsIn(List<Integer> values) {
            addCriterion("isindexnews in", values, "isindexnews");
            return (Criteria) this;
        }

        public Criteria andIsindexnewsNotIn(List<Integer> values) {
            addCriterion("isindexnews not in", values, "isindexnews");
            return (Criteria) this;
        }

        public Criteria andIsindexnewsBetween(Integer value1, Integer value2) {
            addCriterion("isindexnews between", value1, value2, "isindexnews");
            return (Criteria) this;
        }

        public Criteria andIsindexnewsNotBetween(Integer value1, Integer value2) {
            addCriterion("isindexnews not between", value1, value2, "isindexnews");
            return (Criteria) this;
        }

        public Criteria andIsshowdateIsNull() {
            addCriterion("isshowdate is null");
            return (Criteria) this;
        }

        public Criteria andIsshowdateIsNotNull() {
            addCriterion("isshowdate is not null");
            return (Criteria) this;
        }

        public Criteria andIsshowdateEqualTo(Integer value) {
            addCriterion("isshowdate =", value, "isshowdate");
            return (Criteria) this;
        }

        public Criteria andIsshowdateNotEqualTo(Integer value) {
            addCriterion("isshowdate <>", value, "isshowdate");
            return (Criteria) this;
        }

        public Criteria andIsshowdateGreaterThan(Integer value) {
            addCriterion("isshowdate >", value, "isshowdate");
            return (Criteria) this;
        }

        public Criteria andIsshowdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("isshowdate >=", value, "isshowdate");
            return (Criteria) this;
        }

        public Criteria andIsshowdateLessThan(Integer value) {
            addCriterion("isshowdate <", value, "isshowdate");
            return (Criteria) this;
        }

        public Criteria andIsshowdateLessThanOrEqualTo(Integer value) {
            addCriterion("isshowdate <=", value, "isshowdate");
            return (Criteria) this;
        }

        public Criteria andIsshowdateIn(List<Integer> values) {
            addCriterion("isshowdate in", values, "isshowdate");
            return (Criteria) this;
        }

        public Criteria andIsshowdateNotIn(List<Integer> values) {
            addCriterion("isshowdate not in", values, "isshowdate");
            return (Criteria) this;
        }

        public Criteria andIsshowdateBetween(Integer value1, Integer value2) {
            addCriterion("isshowdate between", value1, value2, "isshowdate");
            return (Criteria) this;
        }

        public Criteria andIsshowdateNotBetween(Integer value1, Integer value2) {
            addCriterion("isshowdate not between", value1, value2, "isshowdate");
            return (Criteria) this;
        }

        public Criteria andIszhoubaoIsNull() {
            addCriterion("iszhoubao is null");
            return (Criteria) this;
        }

        public Criteria andIszhoubaoIsNotNull() {
            addCriterion("iszhoubao is not null");
            return (Criteria) this;
        }

        public Criteria andIszhoubaoEqualTo(Integer value) {
            addCriterion("iszhoubao =", value, "iszhoubao");
            return (Criteria) this;
        }

        public Criteria andIszhoubaoNotEqualTo(Integer value) {
            addCriterion("iszhoubao <>", value, "iszhoubao");
            return (Criteria) this;
        }

        public Criteria andIszhoubaoGreaterThan(Integer value) {
            addCriterion("iszhoubao >", value, "iszhoubao");
            return (Criteria) this;
        }

        public Criteria andIszhoubaoGreaterThanOrEqualTo(Integer value) {
            addCriterion("iszhoubao >=", value, "iszhoubao");
            return (Criteria) this;
        }

        public Criteria andIszhoubaoLessThan(Integer value) {
            addCriterion("iszhoubao <", value, "iszhoubao");
            return (Criteria) this;
        }

        public Criteria andIszhoubaoLessThanOrEqualTo(Integer value) {
            addCriterion("iszhoubao <=", value, "iszhoubao");
            return (Criteria) this;
        }

        public Criteria andIszhoubaoIn(List<Integer> values) {
            addCriterion("iszhoubao in", values, "iszhoubao");
            return (Criteria) this;
        }

        public Criteria andIszhoubaoNotIn(List<Integer> values) {
            addCriterion("iszhoubao not in", values, "iszhoubao");
            return (Criteria) this;
        }

        public Criteria andIszhoubaoBetween(Integer value1, Integer value2) {
            addCriterion("iszhoubao between", value1, value2, "iszhoubao");
            return (Criteria) this;
        }

        public Criteria andIszhoubaoNotBetween(Integer value1, Integer value2) {
            addCriterion("iszhoubao not between", value1, value2, "iszhoubao");
            return (Criteria) this;
        }

        public Criteria andIsweixinIsNull() {
            addCriterion("isweixin is null");
            return (Criteria) this;
        }

        public Criteria andIsweixinIsNotNull() {
            addCriterion("isweixin is not null");
            return (Criteria) this;
        }

        public Criteria andIsweixinEqualTo(Integer value) {
            addCriterion("isweixin =", value, "isweixin");
            return (Criteria) this;
        }

        public Criteria andIsweixinNotEqualTo(Integer value) {
            addCriterion("isweixin <>", value, "isweixin");
            return (Criteria) this;
        }

        public Criteria andIsweixinGreaterThan(Integer value) {
            addCriterion("isweixin >", value, "isweixin");
            return (Criteria) this;
        }

        public Criteria andIsweixinGreaterThanOrEqualTo(Integer value) {
            addCriterion("isweixin >=", value, "isweixin");
            return (Criteria) this;
        }

        public Criteria andIsweixinLessThan(Integer value) {
            addCriterion("isweixin <", value, "isweixin");
            return (Criteria) this;
        }

        public Criteria andIsweixinLessThanOrEqualTo(Integer value) {
            addCriterion("isweixin <=", value, "isweixin");
            return (Criteria) this;
        }

        public Criteria andIsweixinIn(List<Integer> values) {
            addCriterion("isweixin in", values, "isweixin");
            return (Criteria) this;
        }

        public Criteria andIsweixinNotIn(List<Integer> values) {
            addCriterion("isweixin not in", values, "isweixin");
            return (Criteria) this;
        }

        public Criteria andIsweixinBetween(Integer value1, Integer value2) {
            addCriterion("isweixin between", value1, value2, "isweixin");
            return (Criteria) this;
        }

        public Criteria andIsweixinNotBetween(Integer value1, Integer value2) {
            addCriterion("isweixin not between", value1, value2, "isweixin");
            return (Criteria) this;
        }

        public Criteria andTtnewslinkIsNull() {
            addCriterion("ttnewslink is null");
            return (Criteria) this;
        }

        public Criteria andTtnewslinkIsNotNull() {
            addCriterion("ttnewslink is not null");
            return (Criteria) this;
        }

        public Criteria andTtnewslinkEqualTo(String value) {
            addCriterion("ttnewslink =", value, "ttnewslink");
            return (Criteria) this;
        }

        public Criteria andTtnewslinkNotEqualTo(String value) {
            addCriterion("ttnewslink <>", value, "ttnewslink");
            return (Criteria) this;
        }

        public Criteria andTtnewslinkGreaterThan(String value) {
            addCriterion("ttnewslink >", value, "ttnewslink");
            return (Criteria) this;
        }

        public Criteria andTtnewslinkGreaterThanOrEqualTo(String value) {
            addCriterion("ttnewslink >=", value, "ttnewslink");
            return (Criteria) this;
        }

        public Criteria andTtnewslinkLessThan(String value) {
            addCriterion("ttnewslink <", value, "ttnewslink");
            return (Criteria) this;
        }

        public Criteria andTtnewslinkLessThanOrEqualTo(String value) {
            addCriterion("ttnewslink <=", value, "ttnewslink");
            return (Criteria) this;
        }

        public Criteria andTtnewslinkLike(String value) {
            addCriterion("ttnewslink like", value, "ttnewslink");
            return (Criteria) this;
        }

        public Criteria andTtnewslinkNotLike(String value) {
            addCriterion("ttnewslink not like", value, "ttnewslink");
            return (Criteria) this;
        }

        public Criteria andTtnewslinkIn(List<String> values) {
            addCriterion("ttnewslink in", values, "ttnewslink");
            return (Criteria) this;
        }

        public Criteria andTtnewslinkNotIn(List<String> values) {
            addCriterion("ttnewslink not in", values, "ttnewslink");
            return (Criteria) this;
        }

        public Criteria andTtnewslinkBetween(String value1, String value2) {
            addCriterion("ttnewslink between", value1, value2, "ttnewslink");
            return (Criteria) this;
        }

        public Criteria andTtnewslinkNotBetween(String value1, String value2) {
            addCriterion("ttnewslink not between", value1, value2, "ttnewslink");
            return (Criteria) this;
        }

        public Criteria andEnCodeIsNull() {
            addCriterion("EnCode is null");
            return (Criteria) this;
        }

        public Criteria andEnCodeIsNotNull() {
            addCriterion("EnCode is not null");
            return (Criteria) this;
        }

        public Criteria andEnCodeEqualTo(String value) {
            addCriterion("EnCode =", value, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeNotEqualTo(String value) {
            addCriterion("EnCode <>", value, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeGreaterThan(String value) {
            addCriterion("EnCode >", value, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeGreaterThanOrEqualTo(String value) {
            addCriterion("EnCode >=", value, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeLessThan(String value) {
            addCriterion("EnCode <", value, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeLessThanOrEqualTo(String value) {
            addCriterion("EnCode <=", value, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeLike(String value) {
            addCriterion("EnCode like", value, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeNotLike(String value) {
            addCriterion("EnCode not like", value, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeIn(List<String> values) {
            addCriterion("EnCode in", values, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeNotIn(List<String> values) {
            addCriterion("EnCode not in", values, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeBetween(String value1, String value2) {
            addCriterion("EnCode between", value1, value2, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeNotBetween(String value1, String value2) {
            addCriterion("EnCode not between", value1, value2, "enCode");
            return (Criteria) this;
        }

        public Criteria andClickIsNull() {
            addCriterion("click is null");
            return (Criteria) this;
        }

        public Criteria andClickIsNotNull() {
            addCriterion("click is not null");
            return (Criteria) this;
        }

        public Criteria andClickEqualTo(Integer value) {
            addCriterion("click =", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotEqualTo(Integer value) {
            addCriterion("click <>", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickGreaterThan(Integer value) {
            addCriterion("click >", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickGreaterThanOrEqualTo(Integer value) {
            addCriterion("click >=", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickLessThan(Integer value) {
            addCriterion("click <", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickLessThanOrEqualTo(Integer value) {
            addCriterion("click <=", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickIn(List<Integer> values) {
            addCriterion("click in", values, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotIn(List<Integer> values) {
            addCriterion("click not in", values, "click");
            return (Criteria) this;
        }

        public Criteria andClickBetween(Integer value1, Integer value2) {
            addCriterion("click between", value1, value2, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotBetween(Integer value1, Integer value2) {
            addCriterion("click not between", value1, value2, "click");
            return (Criteria) this;
        }

        public Criteria andExecnameIsNull() {
            addCriterion("Execname is null");
            return (Criteria) this;
        }

        public Criteria andExecnameIsNotNull() {
            addCriterion("Execname is not null");
            return (Criteria) this;
        }

        public Criteria andExecnameEqualTo(String value) {
            addCriterion("Execname =", value, "execname");
            return (Criteria) this;
        }

        public Criteria andExecnameNotEqualTo(String value) {
            addCriterion("Execname <>", value, "execname");
            return (Criteria) this;
        }

        public Criteria andExecnameGreaterThan(String value) {
            addCriterion("Execname >", value, "execname");
            return (Criteria) this;
        }

        public Criteria andExecnameGreaterThanOrEqualTo(String value) {
            addCriterion("Execname >=", value, "execname");
            return (Criteria) this;
        }

        public Criteria andExecnameLessThan(String value) {
            addCriterion("Execname <", value, "execname");
            return (Criteria) this;
        }

        public Criteria andExecnameLessThanOrEqualTo(String value) {
            addCriterion("Execname <=", value, "execname");
            return (Criteria) this;
        }

        public Criteria andExecnameLike(String value) {
            addCriterion("Execname like", value, "execname");
            return (Criteria) this;
        }

        public Criteria andExecnameNotLike(String value) {
            addCriterion("Execname not like", value, "execname");
            return (Criteria) this;
        }

        public Criteria andExecnameIn(List<String> values) {
            addCriterion("Execname in", values, "execname");
            return (Criteria) this;
        }

        public Criteria andExecnameNotIn(List<String> values) {
            addCriterion("Execname not in", values, "execname");
            return (Criteria) this;
        }

        public Criteria andExecnameBetween(String value1, String value2) {
            addCriterion("Execname between", value1, value2, "execname");
            return (Criteria) this;
        }

        public Criteria andExecnameNotBetween(String value1, String value2) {
            addCriterion("Execname not between", value1, value2, "execname");
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

        public Criteria andLinkPhoneIsNull() {
            addCriterion("LinkPhone is null");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneIsNotNull() {
            addCriterion("LinkPhone is not null");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneEqualTo(String value) {
            addCriterion("LinkPhone =", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotEqualTo(String value) {
            addCriterion("LinkPhone <>", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneGreaterThan(String value) {
            addCriterion("LinkPhone >", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("LinkPhone >=", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneLessThan(String value) {
            addCriterion("LinkPhone <", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneLessThanOrEqualTo(String value) {
            addCriterion("LinkPhone <=", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneLike(String value) {
            addCriterion("LinkPhone like", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotLike(String value) {
            addCriterion("LinkPhone not like", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneIn(List<String> values) {
            addCriterion("LinkPhone in", values, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotIn(List<String> values) {
            addCriterion("LinkPhone not in", values, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneBetween(String value1, String value2) {
            addCriterion("LinkPhone between", value1, value2, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotBetween(String value1, String value2) {
            addCriterion("LinkPhone not between", value1, value2, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkEmailIsNull() {
            addCriterion("LinkEmail is null");
            return (Criteria) this;
        }

        public Criteria andLinkEmailIsNotNull() {
            addCriterion("LinkEmail is not null");
            return (Criteria) this;
        }

        public Criteria andLinkEmailEqualTo(String value) {
            addCriterion("LinkEmail =", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailNotEqualTo(String value) {
            addCriterion("LinkEmail <>", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailGreaterThan(String value) {
            addCriterion("LinkEmail >", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailGreaterThanOrEqualTo(String value) {
            addCriterion("LinkEmail >=", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailLessThan(String value) {
            addCriterion("LinkEmail <", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailLessThanOrEqualTo(String value) {
            addCriterion("LinkEmail <=", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailLike(String value) {
            addCriterion("LinkEmail like", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailNotLike(String value) {
            addCriterion("LinkEmail not like", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailIn(List<String> values) {
            addCriterion("LinkEmail in", values, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailNotIn(List<String> values) {
            addCriterion("LinkEmail not in", values, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailBetween(String value1, String value2) {
            addCriterion("LinkEmail between", value1, value2, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailNotBetween(String value1, String value2) {
            addCriterion("LinkEmail not between", value1, value2, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIsNull() {
            addCriterion("IsOnline is null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIsNotNull() {
            addCriterion("IsOnline is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineEqualTo(Integer value) {
            addCriterion("IsOnline =", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotEqualTo(Integer value) {
            addCriterion("IsOnline <>", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThan(Integer value) {
            addCriterion("IsOnline >", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsOnline >=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThan(Integer value) {
            addCriterion("IsOnline <", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThanOrEqualTo(Integer value) {
            addCriterion("IsOnline <=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIn(List<Integer> values) {
            addCriterion("IsOnline in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotIn(List<Integer> values) {
            addCriterion("IsOnline not in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineBetween(Integer value1, Integer value2) {
            addCriterion("IsOnline between", value1, value2, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotBetween(Integer value1, Integer value2) {
            addCriterion("IsOnline not between", value1, value2, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsPointIsNull() {
            addCriterion("IsPoint is null");
            return (Criteria) this;
        }

        public Criteria andIsPointIsNotNull() {
            addCriterion("IsPoint is not null");
            return (Criteria) this;
        }

        public Criteria andIsPointEqualTo(Integer value) {
            addCriterion("IsPoint =", value, "isPoint");
            return (Criteria) this;
        }

        public Criteria andIsPointNotEqualTo(Integer value) {
            addCriterion("IsPoint <>", value, "isPoint");
            return (Criteria) this;
        }

        public Criteria andIsPointGreaterThan(Integer value) {
            addCriterion("IsPoint >", value, "isPoint");
            return (Criteria) this;
        }

        public Criteria andIsPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsPoint >=", value, "isPoint");
            return (Criteria) this;
        }

        public Criteria andIsPointLessThan(Integer value) {
            addCriterion("IsPoint <", value, "isPoint");
            return (Criteria) this;
        }

        public Criteria andIsPointLessThanOrEqualTo(Integer value) {
            addCriterion("IsPoint <=", value, "isPoint");
            return (Criteria) this;
        }

        public Criteria andIsPointIn(List<Integer> values) {
            addCriterion("IsPoint in", values, "isPoint");
            return (Criteria) this;
        }

        public Criteria andIsPointNotIn(List<Integer> values) {
            addCriterion("IsPoint not in", values, "isPoint");
            return (Criteria) this;
        }

        public Criteria andIsPointBetween(Integer value1, Integer value2) {
            addCriterion("IsPoint between", value1, value2, "isPoint");
            return (Criteria) this;
        }

        public Criteria andIsPointNotBetween(Integer value1, Integer value2) {
            addCriterion("IsPoint not between", value1, value2, "isPoint");
            return (Criteria) this;
        }

        public Criteria andFileUserNameIsNull() {
            addCriterion("FileUserName is null");
            return (Criteria) this;
        }

        public Criteria andFileUserNameIsNotNull() {
            addCriterion("FileUserName is not null");
            return (Criteria) this;
        }

        public Criteria andFileUserNameEqualTo(String value) {
            addCriterion("FileUserName =", value, "fileUserName");
            return (Criteria) this;
        }

        public Criteria andFileUserNameNotEqualTo(String value) {
            addCriterion("FileUserName <>", value, "fileUserName");
            return (Criteria) this;
        }

        public Criteria andFileUserNameGreaterThan(String value) {
            addCriterion("FileUserName >", value, "fileUserName");
            return (Criteria) this;
        }

        public Criteria andFileUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("FileUserName >=", value, "fileUserName");
            return (Criteria) this;
        }

        public Criteria andFileUserNameLessThan(String value) {
            addCriterion("FileUserName <", value, "fileUserName");
            return (Criteria) this;
        }

        public Criteria andFileUserNameLessThanOrEqualTo(String value) {
            addCriterion("FileUserName <=", value, "fileUserName");
            return (Criteria) this;
        }

        public Criteria andFileUserNameLike(String value) {
            addCriterion("FileUserName like", value, "fileUserName");
            return (Criteria) this;
        }

        public Criteria andFileUserNameNotLike(String value) {
            addCriterion("FileUserName not like", value, "fileUserName");
            return (Criteria) this;
        }

        public Criteria andFileUserNameIn(List<String> values) {
            addCriterion("FileUserName in", values, "fileUserName");
            return (Criteria) this;
        }

        public Criteria andFileUserNameNotIn(List<String> values) {
            addCriterion("FileUserName not in", values, "fileUserName");
            return (Criteria) this;
        }

        public Criteria andFileUserNameBetween(String value1, String value2) {
            addCriterion("FileUserName between", value1, value2, "fileUserName");
            return (Criteria) this;
        }

        public Criteria andFileUserNameNotBetween(String value1, String value2) {
            addCriterion("FileUserName not between", value1, value2, "fileUserName");
            return (Criteria) this;
        }

        public Criteria andFileUserIDIsNull() {
            addCriterion("FileUserID is null");
            return (Criteria) this;
        }

        public Criteria andFileUserIDIsNotNull() {
            addCriterion("FileUserID is not null");
            return (Criteria) this;
        }

        public Criteria andFileUserIDEqualTo(Integer value) {
            addCriterion("FileUserID =", value, "fileUserID");
            return (Criteria) this;
        }

        public Criteria andFileUserIDNotEqualTo(Integer value) {
            addCriterion("FileUserID <>", value, "fileUserID");
            return (Criteria) this;
        }

        public Criteria andFileUserIDGreaterThan(Integer value) {
            addCriterion("FileUserID >", value, "fileUserID");
            return (Criteria) this;
        }

        public Criteria andFileUserIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("FileUserID >=", value, "fileUserID");
            return (Criteria) this;
        }

        public Criteria andFileUserIDLessThan(Integer value) {
            addCriterion("FileUserID <", value, "fileUserID");
            return (Criteria) this;
        }

        public Criteria andFileUserIDLessThanOrEqualTo(Integer value) {
            addCriterion("FileUserID <=", value, "fileUserID");
            return (Criteria) this;
        }

        public Criteria andFileUserIDIn(List<Integer> values) {
            addCriterion("FileUserID in", values, "fileUserID");
            return (Criteria) this;
        }

        public Criteria andFileUserIDNotIn(List<Integer> values) {
            addCriterion("FileUserID not in", values, "fileUserID");
            return (Criteria) this;
        }

        public Criteria andFileUserIDBetween(Integer value1, Integer value2) {
            addCriterion("FileUserID between", value1, value2, "fileUserID");
            return (Criteria) this;
        }

        public Criteria andFileUserIDNotBetween(Integer value1, Integer value2) {
            addCriterion("FileUserID not between", value1, value2, "fileUserID");
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

        public Criteria andKeyWordIndexIsNull() {
            addCriterion("KeyWordIndex is null");
            return (Criteria) this;
        }

        public Criteria andKeyWordIndexIsNotNull() {
            addCriterion("KeyWordIndex is not null");
            return (Criteria) this;
        }

        public Criteria andKeyWordIndexEqualTo(String value) {
            addCriterion("KeyWordIndex =", value, "keyWordIndex");
            return (Criteria) this;
        }

        public Criteria andKeyWordIndexNotEqualTo(String value) {
            addCriterion("KeyWordIndex <>", value, "keyWordIndex");
            return (Criteria) this;
        }

        public Criteria andKeyWordIndexGreaterThan(String value) {
            addCriterion("KeyWordIndex >", value, "keyWordIndex");
            return (Criteria) this;
        }

        public Criteria andKeyWordIndexGreaterThanOrEqualTo(String value) {
            addCriterion("KeyWordIndex >=", value, "keyWordIndex");
            return (Criteria) this;
        }

        public Criteria andKeyWordIndexLessThan(String value) {
            addCriterion("KeyWordIndex <", value, "keyWordIndex");
            return (Criteria) this;
        }

        public Criteria andKeyWordIndexLessThanOrEqualTo(String value) {
            addCriterion("KeyWordIndex <=", value, "keyWordIndex");
            return (Criteria) this;
        }

        public Criteria andKeyWordIndexLike(String value) {
            addCriterion("KeyWordIndex like", value, "keyWordIndex");
            return (Criteria) this;
        }

        public Criteria andKeyWordIndexNotLike(String value) {
            addCriterion("KeyWordIndex not like", value, "keyWordIndex");
            return (Criteria) this;
        }

        public Criteria andKeyWordIndexIn(List<String> values) {
            addCriterion("KeyWordIndex in", values, "keyWordIndex");
            return (Criteria) this;
        }

        public Criteria andKeyWordIndexNotIn(List<String> values) {
            addCriterion("KeyWordIndex not in", values, "keyWordIndex");
            return (Criteria) this;
        }

        public Criteria andKeyWordIndexBetween(String value1, String value2) {
            addCriterion("KeyWordIndex between", value1, value2, "keyWordIndex");
            return (Criteria) this;
        }

        public Criteria andKeyWordIndexNotBetween(String value1, String value2) {
            addCriterion("KeyWordIndex not between", value1, value2, "keyWordIndex");
            return (Criteria) this;
        }

        public Criteria andIndexImageIsNull() {
            addCriterion("IndexImage is null");
            return (Criteria) this;
        }

        public Criteria andIndexImageIsNotNull() {
            addCriterion("IndexImage is not null");
            return (Criteria) this;
        }

        public Criteria andIndexImageEqualTo(String value) {
            addCriterion("IndexImage =", value, "indexImage");
            return (Criteria) this;
        }

        public Criteria andIndexImageNotEqualTo(String value) {
            addCriterion("IndexImage <>", value, "indexImage");
            return (Criteria) this;
        }

        public Criteria andIndexImageGreaterThan(String value) {
            addCriterion("IndexImage >", value, "indexImage");
            return (Criteria) this;
        }

        public Criteria andIndexImageGreaterThanOrEqualTo(String value) {
            addCriterion("IndexImage >=", value, "indexImage");
            return (Criteria) this;
        }

        public Criteria andIndexImageLessThan(String value) {
            addCriterion("IndexImage <", value, "indexImage");
            return (Criteria) this;
        }

        public Criteria andIndexImageLessThanOrEqualTo(String value) {
            addCriterion("IndexImage <=", value, "indexImage");
            return (Criteria) this;
        }

        public Criteria andIndexImageLike(String value) {
            addCriterion("IndexImage like", value, "indexImage");
            return (Criteria) this;
        }

        public Criteria andIndexImageNotLike(String value) {
            addCriterion("IndexImage not like", value, "indexImage");
            return (Criteria) this;
        }

        public Criteria andIndexImageIn(List<String> values) {
            addCriterion("IndexImage in", values, "indexImage");
            return (Criteria) this;
        }

        public Criteria andIndexImageNotIn(List<String> values) {
            addCriterion("IndexImage not in", values, "indexImage");
            return (Criteria) this;
        }

        public Criteria andIndexImageBetween(String value1, String value2) {
            addCriterion("IndexImage between", value1, value2, "indexImage");
            return (Criteria) this;
        }

        public Criteria andIndexImageNotBetween(String value1, String value2) {
            addCriterion("IndexImage not between", value1, value2, "indexImage");
            return (Criteria) this;
        }

        public Criteria andIsYcIsNull() {
            addCriterion("IsYc is null");
            return (Criteria) this;
        }

        public Criteria andIsYcIsNotNull() {
            addCriterion("IsYc is not null");
            return (Criteria) this;
        }

        public Criteria andIsYcEqualTo(Integer value) {
            addCriterion("IsYc =", value, "isYc");
            return (Criteria) this;
        }

        public Criteria andIsYcNotEqualTo(Integer value) {
            addCriterion("IsYc <>", value, "isYc");
            return (Criteria) this;
        }

        public Criteria andIsYcGreaterThan(Integer value) {
            addCriterion("IsYc >", value, "isYc");
            return (Criteria) this;
        }

        public Criteria andIsYcGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsYc >=", value, "isYc");
            return (Criteria) this;
        }

        public Criteria andIsYcLessThan(Integer value) {
            addCriterion("IsYc <", value, "isYc");
            return (Criteria) this;
        }

        public Criteria andIsYcLessThanOrEqualTo(Integer value) {
            addCriterion("IsYc <=", value, "isYc");
            return (Criteria) this;
        }

        public Criteria andIsYcIn(List<Integer> values) {
            addCriterion("IsYc in", values, "isYc");
            return (Criteria) this;
        }

        public Criteria andIsYcNotIn(List<Integer> values) {
            addCriterion("IsYc not in", values, "isYc");
            return (Criteria) this;
        }

        public Criteria andIsYcBetween(Integer value1, Integer value2) {
            addCriterion("IsYc between", value1, value2, "isYc");
            return (Criteria) this;
        }

        public Criteria andIsYcNotBetween(Integer value1, Integer value2) {
            addCriterion("IsYc not between", value1, value2, "isYc");
            return (Criteria) this;
        }

        public Criteria andFiledownurlIsNull() {
            addCriterion("Filedownurl is null");
            return (Criteria) this;
        }

        public Criteria andFiledownurlIsNotNull() {
            addCriterion("Filedownurl is not null");
            return (Criteria) this;
        }

        public Criteria andFiledownurlEqualTo(String value) {
            addCriterion("Filedownurl =", value, "filedownurl");
            return (Criteria) this;
        }

        public Criteria andFiledownurlNotEqualTo(String value) {
            addCriterion("Filedownurl <>", value, "filedownurl");
            return (Criteria) this;
        }

        public Criteria andFiledownurlGreaterThan(String value) {
            addCriterion("Filedownurl >", value, "filedownurl");
            return (Criteria) this;
        }

        public Criteria andFiledownurlGreaterThanOrEqualTo(String value) {
            addCriterion("Filedownurl >=", value, "filedownurl");
            return (Criteria) this;
        }

        public Criteria andFiledownurlLessThan(String value) {
            addCriterion("Filedownurl <", value, "filedownurl");
            return (Criteria) this;
        }

        public Criteria andFiledownurlLessThanOrEqualTo(String value) {
            addCriterion("Filedownurl <=", value, "filedownurl");
            return (Criteria) this;
        }

        public Criteria andFiledownurlLike(String value) {
            addCriterion("Filedownurl like", value, "filedownurl");
            return (Criteria) this;
        }

        public Criteria andFiledownurlNotLike(String value) {
            addCriterion("Filedownurl not like", value, "filedownurl");
            return (Criteria) this;
        }

        public Criteria andFiledownurlIn(List<String> values) {
            addCriterion("Filedownurl in", values, "filedownurl");
            return (Criteria) this;
        }

        public Criteria andFiledownurlNotIn(List<String> values) {
            addCriterion("Filedownurl not in", values, "filedownurl");
            return (Criteria) this;
        }

        public Criteria andFiledownurlBetween(String value1, String value2) {
            addCriterion("Filedownurl between", value1, value2, "filedownurl");
            return (Criteria) this;
        }

        public Criteria andFiledownurlNotBetween(String value1, String value2) {
            addCriterion("Filedownurl not between", value1, value2, "filedownurl");
            return (Criteria) this;
        }

        public Criteria andIsAPPIsNull() {
            addCriterion("IsAPP is null");
            return (Criteria) this;
        }

        public Criteria andIsAPPIsNotNull() {
            addCriterion("IsAPP is not null");
            return (Criteria) this;
        }

        public Criteria andIsAPPEqualTo(Integer value) {
            addCriterion("IsAPP =", value, "isAPP");
            return (Criteria) this;
        }

        public Criteria andIsAPPNotEqualTo(Integer value) {
            addCriterion("IsAPP <>", value, "isAPP");
            return (Criteria) this;
        }

        public Criteria andIsAPPGreaterThan(Integer value) {
            addCriterion("IsAPP >", value, "isAPP");
            return (Criteria) this;
        }

        public Criteria andIsAPPGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsAPP >=", value, "isAPP");
            return (Criteria) this;
        }

        public Criteria andIsAPPLessThan(Integer value) {
            addCriterion("IsAPP <", value, "isAPP");
            return (Criteria) this;
        }

        public Criteria andIsAPPLessThanOrEqualTo(Integer value) {
            addCriterion("IsAPP <=", value, "isAPP");
            return (Criteria) this;
        }

        public Criteria andIsAPPIn(List<Integer> values) {
            addCriterion("IsAPP in", values, "isAPP");
            return (Criteria) this;
        }

        public Criteria andIsAPPNotIn(List<Integer> values) {
            addCriterion("IsAPP not in", values, "isAPP");
            return (Criteria) this;
        }

        public Criteria andIsAPPBetween(Integer value1, Integer value2) {
            addCriterion("IsAPP between", value1, value2, "isAPP");
            return (Criteria) this;
        }

        public Criteria andIsAPPNotBetween(Integer value1, Integer value2) {
            addCriterion("IsAPP not between", value1, value2, "isAPP");
            return (Criteria) this;
        }

        public Criteria andToppictureIsNull() {
            addCriterion("Toppicture is null");
            return (Criteria) this;
        }

        public Criteria andToppictureIsNotNull() {
            addCriterion("Toppicture is not null");
            return (Criteria) this;
        }

        public Criteria andToppictureEqualTo(String value) {
            addCriterion("Toppicture =", value, "toppicture");
            return (Criteria) this;
        }

        public Criteria andToppictureNotEqualTo(String value) {
            addCriterion("Toppicture <>", value, "toppicture");
            return (Criteria) this;
        }

        public Criteria andToppictureGreaterThan(String value) {
            addCriterion("Toppicture >", value, "toppicture");
            return (Criteria) this;
        }

        public Criteria andToppictureGreaterThanOrEqualTo(String value) {
            addCriterion("Toppicture >=", value, "toppicture");
            return (Criteria) this;
        }

        public Criteria andToppictureLessThan(String value) {
            addCriterion("Toppicture <", value, "toppicture");
            return (Criteria) this;
        }

        public Criteria andToppictureLessThanOrEqualTo(String value) {
            addCriterion("Toppicture <=", value, "toppicture");
            return (Criteria) this;
        }

        public Criteria andToppictureLike(String value) {
            addCriterion("Toppicture like", value, "toppicture");
            return (Criteria) this;
        }

        public Criteria andToppictureNotLike(String value) {
            addCriterion("Toppicture not like", value, "toppicture");
            return (Criteria) this;
        }

        public Criteria andToppictureIn(List<String> values) {
            addCriterion("Toppicture in", values, "toppicture");
            return (Criteria) this;
        }

        public Criteria andToppictureNotIn(List<String> values) {
            addCriterion("Toppicture not in", values, "toppicture");
            return (Criteria) this;
        }

        public Criteria andToppictureBetween(String value1, String value2) {
            addCriterion("Toppicture between", value1, value2, "toppicture");
            return (Criteria) this;
        }

        public Criteria andToppictureNotBetween(String value1, String value2) {
            addCriterion("Toppicture not between", value1, value2, "toppicture");
            return (Criteria) this;
        }

        public Criteria andSysIDIsNull() {
            addCriterion("SysID is null");
            return (Criteria) this;
        }

        public Criteria andSysIDIsNotNull() {
            addCriterion("SysID is not null");
            return (Criteria) this;
        }

        public Criteria andSysIDEqualTo(Integer value) {
            addCriterion("SysID =", value, "sysID");
            return (Criteria) this;
        }

        public Criteria andSysIDNotEqualTo(Integer value) {
            addCriterion("SysID <>", value, "sysID");
            return (Criteria) this;
        }

        public Criteria andSysIDGreaterThan(Integer value) {
            addCriterion("SysID >", value, "sysID");
            return (Criteria) this;
        }

        public Criteria andSysIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("SysID >=", value, "sysID");
            return (Criteria) this;
        }

        public Criteria andSysIDLessThan(Integer value) {
            addCriterion("SysID <", value, "sysID");
            return (Criteria) this;
        }

        public Criteria andSysIDLessThanOrEqualTo(Integer value) {
            addCriterion("SysID <=", value, "sysID");
            return (Criteria) this;
        }

        public Criteria andSysIDIn(List<Integer> values) {
            addCriterion("SysID in", values, "sysID");
            return (Criteria) this;
        }

        public Criteria andSysIDNotIn(List<Integer> values) {
            addCriterion("SysID not in", values, "sysID");
            return (Criteria) this;
        }

        public Criteria andSysIDBetween(Integer value1, Integer value2) {
            addCriterion("SysID between", value1, value2, "sysID");
            return (Criteria) this;
        }

        public Criteria andSysIDNotBetween(Integer value1, Integer value2) {
            addCriterion("SysID not between", value1, value2, "sysID");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("Source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("Source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("Source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("Source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("Source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("Source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("Source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("Source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("Source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("Source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("Source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("Source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("Source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("Source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andUserinfoIDIsNull() {
            addCriterion("userinfoID is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoIDIsNotNull() {
            addCriterion("userinfoID is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoIDEqualTo(Integer value) {
            addCriterion("userinfoID =", value, "userinfoID");
            return (Criteria) this;
        }

        public Criteria andUserinfoIDNotEqualTo(Integer value) {
            addCriterion("userinfoID <>", value, "userinfoID");
            return (Criteria) this;
        }

        public Criteria andUserinfoIDGreaterThan(Integer value) {
            addCriterion("userinfoID >", value, "userinfoID");
            return (Criteria) this;
        }

        public Criteria andUserinfoIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("userinfoID >=", value, "userinfoID");
            return (Criteria) this;
        }

        public Criteria andUserinfoIDLessThan(Integer value) {
            addCriterion("userinfoID <", value, "userinfoID");
            return (Criteria) this;
        }

        public Criteria andUserinfoIDLessThanOrEqualTo(Integer value) {
            addCriterion("userinfoID <=", value, "userinfoID");
            return (Criteria) this;
        }

        public Criteria andUserinfoIDIn(List<Integer> values) {
            addCriterion("userinfoID in", values, "userinfoID");
            return (Criteria) this;
        }

        public Criteria andUserinfoIDNotIn(List<Integer> values) {
            addCriterion("userinfoID not in", values, "userinfoID");
            return (Criteria) this;
        }

        public Criteria andUserinfoIDBetween(Integer value1, Integer value2) {
            addCriterion("userinfoID between", value1, value2, "userinfoID");
            return (Criteria) this;
        }

        public Criteria andUserinfoIDNotBetween(Integer value1, Integer value2) {
            addCriterion("userinfoID not between", value1, value2, "userinfoID");
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