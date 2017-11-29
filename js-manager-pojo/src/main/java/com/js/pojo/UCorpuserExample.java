package com.js.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UCorpuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UCorpuserExample() {
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

        public Criteria andCorpSrcIsNull() {
            addCriterion("CorpSrc is null");
            return (Criteria) this;
        }

        public Criteria andCorpSrcIsNotNull() {
            addCriterion("CorpSrc is not null");
            return (Criteria) this;
        }

        public Criteria andCorpSrcEqualTo(Integer value) {
            addCriterion("CorpSrc =", value, "corpSrc");
            return (Criteria) this;
        }

        public Criteria andCorpSrcNotEqualTo(Integer value) {
            addCriterion("CorpSrc <>", value, "corpSrc");
            return (Criteria) this;
        }

        public Criteria andCorpSrcGreaterThan(Integer value) {
            addCriterion("CorpSrc >", value, "corpSrc");
            return (Criteria) this;
        }

        public Criteria andCorpSrcGreaterThanOrEqualTo(Integer value) {
            addCriterion("CorpSrc >=", value, "corpSrc");
            return (Criteria) this;
        }

        public Criteria andCorpSrcLessThan(Integer value) {
            addCriterion("CorpSrc <", value, "corpSrc");
            return (Criteria) this;
        }

        public Criteria andCorpSrcLessThanOrEqualTo(Integer value) {
            addCriterion("CorpSrc <=", value, "corpSrc");
            return (Criteria) this;
        }

        public Criteria andCorpSrcIn(List<Integer> values) {
            addCriterion("CorpSrc in", values, "corpSrc");
            return (Criteria) this;
        }

        public Criteria andCorpSrcNotIn(List<Integer> values) {
            addCriterion("CorpSrc not in", values, "corpSrc");
            return (Criteria) this;
        }

        public Criteria andCorpSrcBetween(Integer value1, Integer value2) {
            addCriterion("CorpSrc between", value1, value2, "corpSrc");
            return (Criteria) this;
        }

        public Criteria andCorpSrcNotBetween(Integer value1, Integer value2) {
            addCriterion("CorpSrc not between", value1, value2, "corpSrc");
            return (Criteria) this;
        }

        public Criteria andCorpCate2IsNull() {
            addCriterion("CorpCate2 is null");
            return (Criteria) this;
        }

        public Criteria andCorpCate2IsNotNull() {
            addCriterion("CorpCate2 is not null");
            return (Criteria) this;
        }

        public Criteria andCorpCate2EqualTo(Integer value) {
            addCriterion("CorpCate2 =", value, "corpCate2");
            return (Criteria) this;
        }

        public Criteria andCorpCate2NotEqualTo(Integer value) {
            addCriterion("CorpCate2 <>", value, "corpCate2");
            return (Criteria) this;
        }

        public Criteria andCorpCate2GreaterThan(Integer value) {
            addCriterion("CorpCate2 >", value, "corpCate2");
            return (Criteria) this;
        }

        public Criteria andCorpCate2GreaterThanOrEqualTo(Integer value) {
            addCriterion("CorpCate2 >=", value, "corpCate2");
            return (Criteria) this;
        }

        public Criteria andCorpCate2LessThan(Integer value) {
            addCriterion("CorpCate2 <", value, "corpCate2");
            return (Criteria) this;
        }

        public Criteria andCorpCate2LessThanOrEqualTo(Integer value) {
            addCriterion("CorpCate2 <=", value, "corpCate2");
            return (Criteria) this;
        }

        public Criteria andCorpCate2In(List<Integer> values) {
            addCriterion("CorpCate2 in", values, "corpCate2");
            return (Criteria) this;
        }

        public Criteria andCorpCate2NotIn(List<Integer> values) {
            addCriterion("CorpCate2 not in", values, "corpCate2");
            return (Criteria) this;
        }

        public Criteria andCorpCate2Between(Integer value1, Integer value2) {
            addCriterion("CorpCate2 between", value1, value2, "corpCate2");
            return (Criteria) this;
        }

        public Criteria andCorpCate2NotBetween(Integer value1, Integer value2) {
            addCriterion("CorpCate2 not between", value1, value2, "corpCate2");
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

        public Criteria andCorpCateEqualTo(Integer value) {
            addCriterion("CorpCate =", value, "corpCate");
            return (Criteria) this;
        }

        public Criteria andCorpCateNotEqualTo(Integer value) {
            addCriterion("CorpCate <>", value, "corpCate");
            return (Criteria) this;
        }

        public Criteria andCorpCateGreaterThan(Integer value) {
            addCriterion("CorpCate >", value, "corpCate");
            return (Criteria) this;
        }

        public Criteria andCorpCateGreaterThanOrEqualTo(Integer value) {
            addCriterion("CorpCate >=", value, "corpCate");
            return (Criteria) this;
        }

        public Criteria andCorpCateLessThan(Integer value) {
            addCriterion("CorpCate <", value, "corpCate");
            return (Criteria) this;
        }

        public Criteria andCorpCateLessThanOrEqualTo(Integer value) {
            addCriterion("CorpCate <=", value, "corpCate");
            return (Criteria) this;
        }

        public Criteria andCorpCateIn(List<Integer> values) {
            addCriterion("CorpCate in", values, "corpCate");
            return (Criteria) this;
        }

        public Criteria andCorpCateNotIn(List<Integer> values) {
            addCriterion("CorpCate not in", values, "corpCate");
            return (Criteria) this;
        }

        public Criteria andCorpCateBetween(Integer value1, Integer value2) {
            addCriterion("CorpCate between", value1, value2, "corpCate");
            return (Criteria) this;
        }

        public Criteria andCorpCateNotBetween(Integer value1, Integer value2) {
            addCriterion("CorpCate not between", value1, value2, "corpCate");
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

        public Criteria andCorpWebIsNull() {
            addCriterion("CorpWeb is null");
            return (Criteria) this;
        }

        public Criteria andCorpWebIsNotNull() {
            addCriterion("CorpWeb is not null");
            return (Criteria) this;
        }

        public Criteria andCorpWebEqualTo(String value) {
            addCriterion("CorpWeb =", value, "corpWeb");
            return (Criteria) this;
        }

        public Criteria andCorpWebNotEqualTo(String value) {
            addCriterion("CorpWeb <>", value, "corpWeb");
            return (Criteria) this;
        }

        public Criteria andCorpWebGreaterThan(String value) {
            addCriterion("CorpWeb >", value, "corpWeb");
            return (Criteria) this;
        }

        public Criteria andCorpWebGreaterThanOrEqualTo(String value) {
            addCriterion("CorpWeb >=", value, "corpWeb");
            return (Criteria) this;
        }

        public Criteria andCorpWebLessThan(String value) {
            addCriterion("CorpWeb <", value, "corpWeb");
            return (Criteria) this;
        }

        public Criteria andCorpWebLessThanOrEqualTo(String value) {
            addCriterion("CorpWeb <=", value, "corpWeb");
            return (Criteria) this;
        }

        public Criteria andCorpWebLike(String value) {
            addCriterion("CorpWeb like", value, "corpWeb");
            return (Criteria) this;
        }

        public Criteria andCorpWebNotLike(String value) {
            addCriterion("CorpWeb not like", value, "corpWeb");
            return (Criteria) this;
        }

        public Criteria andCorpWebIn(List<String> values) {
            addCriterion("CorpWeb in", values, "corpWeb");
            return (Criteria) this;
        }

        public Criteria andCorpWebNotIn(List<String> values) {
            addCriterion("CorpWeb not in", values, "corpWeb");
            return (Criteria) this;
        }

        public Criteria andCorpWebBetween(String value1, String value2) {
            addCriterion("CorpWeb between", value1, value2, "corpWeb");
            return (Criteria) this;
        }

        public Criteria andCorpWebNotBetween(String value1, String value2) {
            addCriterion("CorpWeb not between", value1, value2, "corpWeb");
            return (Criteria) this;
        }

        public Criteria andCorpMailIsNull() {
            addCriterion("CorpMail is null");
            return (Criteria) this;
        }

        public Criteria andCorpMailIsNotNull() {
            addCriterion("CorpMail is not null");
            return (Criteria) this;
        }

        public Criteria andCorpMailEqualTo(String value) {
            addCriterion("CorpMail =", value, "corpMail");
            return (Criteria) this;
        }

        public Criteria andCorpMailNotEqualTo(String value) {
            addCriterion("CorpMail <>", value, "corpMail");
            return (Criteria) this;
        }

        public Criteria andCorpMailGreaterThan(String value) {
            addCriterion("CorpMail >", value, "corpMail");
            return (Criteria) this;
        }

        public Criteria andCorpMailGreaterThanOrEqualTo(String value) {
            addCriterion("CorpMail >=", value, "corpMail");
            return (Criteria) this;
        }

        public Criteria andCorpMailLessThan(String value) {
            addCriterion("CorpMail <", value, "corpMail");
            return (Criteria) this;
        }

        public Criteria andCorpMailLessThanOrEqualTo(String value) {
            addCriterion("CorpMail <=", value, "corpMail");
            return (Criteria) this;
        }

        public Criteria andCorpMailLike(String value) {
            addCriterion("CorpMail like", value, "corpMail");
            return (Criteria) this;
        }

        public Criteria andCorpMailNotLike(String value) {
            addCriterion("CorpMail not like", value, "corpMail");
            return (Criteria) this;
        }

        public Criteria andCorpMailIn(List<String> values) {
            addCriterion("CorpMail in", values, "corpMail");
            return (Criteria) this;
        }

        public Criteria andCorpMailNotIn(List<String> values) {
            addCriterion("CorpMail not in", values, "corpMail");
            return (Criteria) this;
        }

        public Criteria andCorpMailBetween(String value1, String value2) {
            addCriterion("CorpMail between", value1, value2, "corpMail");
            return (Criteria) this;
        }

        public Criteria andCorpMailNotBetween(String value1, String value2) {
            addCriterion("CorpMail not between", value1, value2, "corpMail");
            return (Criteria) this;
        }

        public Criteria andCorpCeoIsNull() {
            addCriterion("CorpCeo is null");
            return (Criteria) this;
        }

        public Criteria andCorpCeoIsNotNull() {
            addCriterion("CorpCeo is not null");
            return (Criteria) this;
        }

        public Criteria andCorpCeoEqualTo(String value) {
            addCriterion("CorpCeo =", value, "corpCeo");
            return (Criteria) this;
        }

        public Criteria andCorpCeoNotEqualTo(String value) {
            addCriterion("CorpCeo <>", value, "corpCeo");
            return (Criteria) this;
        }

        public Criteria andCorpCeoGreaterThan(String value) {
            addCriterion("CorpCeo >", value, "corpCeo");
            return (Criteria) this;
        }

        public Criteria andCorpCeoGreaterThanOrEqualTo(String value) {
            addCriterion("CorpCeo >=", value, "corpCeo");
            return (Criteria) this;
        }

        public Criteria andCorpCeoLessThan(String value) {
            addCriterion("CorpCeo <", value, "corpCeo");
            return (Criteria) this;
        }

        public Criteria andCorpCeoLessThanOrEqualTo(String value) {
            addCriterion("CorpCeo <=", value, "corpCeo");
            return (Criteria) this;
        }

        public Criteria andCorpCeoLike(String value) {
            addCriterion("CorpCeo like", value, "corpCeo");
            return (Criteria) this;
        }

        public Criteria andCorpCeoNotLike(String value) {
            addCriterion("CorpCeo not like", value, "corpCeo");
            return (Criteria) this;
        }

        public Criteria andCorpCeoIn(List<String> values) {
            addCriterion("CorpCeo in", values, "corpCeo");
            return (Criteria) this;
        }

        public Criteria andCorpCeoNotIn(List<String> values) {
            addCriterion("CorpCeo not in", values, "corpCeo");
            return (Criteria) this;
        }

        public Criteria andCorpCeoBetween(String value1, String value2) {
            addCriterion("CorpCeo between", value1, value2, "corpCeo");
            return (Criteria) this;
        }

        public Criteria andCorpCeoNotBetween(String value1, String value2) {
            addCriterion("CorpCeo not between", value1, value2, "corpCeo");
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

        public Criteria andContSexEqualTo(Integer value) {
            addCriterion("ContSex =", value, "contSex");
            return (Criteria) this;
        }

        public Criteria andContSexNotEqualTo(Integer value) {
            addCriterion("ContSex <>", value, "contSex");
            return (Criteria) this;
        }

        public Criteria andContSexGreaterThan(Integer value) {
            addCriterion("ContSex >", value, "contSex");
            return (Criteria) this;
        }

        public Criteria andContSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("ContSex >=", value, "contSex");
            return (Criteria) this;
        }

        public Criteria andContSexLessThan(Integer value) {
            addCriterion("ContSex <", value, "contSex");
            return (Criteria) this;
        }

        public Criteria andContSexLessThanOrEqualTo(Integer value) {
            addCriterion("ContSex <=", value, "contSex");
            return (Criteria) this;
        }

        public Criteria andContSexIn(List<Integer> values) {
            addCriterion("ContSex in", values, "contSex");
            return (Criteria) this;
        }

        public Criteria andContSexNotIn(List<Integer> values) {
            addCriterion("ContSex not in", values, "contSex");
            return (Criteria) this;
        }

        public Criteria andContSexBetween(Integer value1, Integer value2) {
            addCriterion("ContSex between", value1, value2, "contSex");
            return (Criteria) this;
        }

        public Criteria andContSexNotBetween(Integer value1, Integer value2) {
            addCriterion("ContSex not between", value1, value2, "contSex");
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

        public Criteria andCorpCardIsNull() {
            addCriterion("CorpCard is null");
            return (Criteria) this;
        }

        public Criteria andCorpCardIsNotNull() {
            addCriterion("CorpCard is not null");
            return (Criteria) this;
        }

        public Criteria andCorpCardEqualTo(String value) {
            addCriterion("CorpCard =", value, "corpCard");
            return (Criteria) this;
        }

        public Criteria andCorpCardNotEqualTo(String value) {
            addCriterion("CorpCard <>", value, "corpCard");
            return (Criteria) this;
        }

        public Criteria andCorpCardGreaterThan(String value) {
            addCriterion("CorpCard >", value, "corpCard");
            return (Criteria) this;
        }

        public Criteria andCorpCardGreaterThanOrEqualTo(String value) {
            addCriterion("CorpCard >=", value, "corpCard");
            return (Criteria) this;
        }

        public Criteria andCorpCardLessThan(String value) {
            addCriterion("CorpCard <", value, "corpCard");
            return (Criteria) this;
        }

        public Criteria andCorpCardLessThanOrEqualTo(String value) {
            addCriterion("CorpCard <=", value, "corpCard");
            return (Criteria) this;
        }

        public Criteria andCorpCardLike(String value) {
            addCriterion("CorpCard like", value, "corpCard");
            return (Criteria) this;
        }

        public Criteria andCorpCardNotLike(String value) {
            addCriterion("CorpCard not like", value, "corpCard");
            return (Criteria) this;
        }

        public Criteria andCorpCardIn(List<String> values) {
            addCriterion("CorpCard in", values, "corpCard");
            return (Criteria) this;
        }

        public Criteria andCorpCardNotIn(List<String> values) {
            addCriterion("CorpCard not in", values, "corpCard");
            return (Criteria) this;
        }

        public Criteria andCorpCardBetween(String value1, String value2) {
            addCriterion("CorpCard between", value1, value2, "corpCard");
            return (Criteria) this;
        }

        public Criteria andCorpCardNotBetween(String value1, String value2) {
            addCriterion("CorpCard not between", value1, value2, "corpCard");
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

        public Criteria andProdAbleIsNull() {
            addCriterion("ProdAble is null");
            return (Criteria) this;
        }

        public Criteria andProdAbleIsNotNull() {
            addCriterion("ProdAble is not null");
            return (Criteria) this;
        }

        public Criteria andProdAbleEqualTo(String value) {
            addCriterion("ProdAble =", value, "prodAble");
            return (Criteria) this;
        }

        public Criteria andProdAbleNotEqualTo(String value) {
            addCriterion("ProdAble <>", value, "prodAble");
            return (Criteria) this;
        }

        public Criteria andProdAbleGreaterThan(String value) {
            addCriterion("ProdAble >", value, "prodAble");
            return (Criteria) this;
        }

        public Criteria andProdAbleGreaterThanOrEqualTo(String value) {
            addCriterion("ProdAble >=", value, "prodAble");
            return (Criteria) this;
        }

        public Criteria andProdAbleLessThan(String value) {
            addCriterion("ProdAble <", value, "prodAble");
            return (Criteria) this;
        }

        public Criteria andProdAbleLessThanOrEqualTo(String value) {
            addCriterion("ProdAble <=", value, "prodAble");
            return (Criteria) this;
        }

        public Criteria andProdAbleLike(String value) {
            addCriterion("ProdAble like", value, "prodAble");
            return (Criteria) this;
        }

        public Criteria andProdAbleNotLike(String value) {
            addCriterion("ProdAble not like", value, "prodAble");
            return (Criteria) this;
        }

        public Criteria andProdAbleIn(List<String> values) {
            addCriterion("ProdAble in", values, "prodAble");
            return (Criteria) this;
        }

        public Criteria andProdAbleNotIn(List<String> values) {
            addCriterion("ProdAble not in", values, "prodAble");
            return (Criteria) this;
        }

        public Criteria andProdAbleBetween(String value1, String value2) {
            addCriterion("ProdAble between", value1, value2, "prodAble");
            return (Criteria) this;
        }

        public Criteria andProdAbleNotBetween(String value1, String value2) {
            addCriterion("ProdAble not between", value1, value2, "prodAble");
            return (Criteria) this;
        }

        public Criteria andCorpAddrIsNull() {
            addCriterion("CorpAddr is null");
            return (Criteria) this;
        }

        public Criteria andCorpAddrIsNotNull() {
            addCriterion("CorpAddr is not null");
            return (Criteria) this;
        }

        public Criteria andCorpAddrEqualTo(String value) {
            addCriterion("CorpAddr =", value, "corpAddr");
            return (Criteria) this;
        }

        public Criteria andCorpAddrNotEqualTo(String value) {
            addCriterion("CorpAddr <>", value, "corpAddr");
            return (Criteria) this;
        }

        public Criteria andCorpAddrGreaterThan(String value) {
            addCriterion("CorpAddr >", value, "corpAddr");
            return (Criteria) this;
        }

        public Criteria andCorpAddrGreaterThanOrEqualTo(String value) {
            addCriterion("CorpAddr >=", value, "corpAddr");
            return (Criteria) this;
        }

        public Criteria andCorpAddrLessThan(String value) {
            addCriterion("CorpAddr <", value, "corpAddr");
            return (Criteria) this;
        }

        public Criteria andCorpAddrLessThanOrEqualTo(String value) {
            addCriterion("CorpAddr <=", value, "corpAddr");
            return (Criteria) this;
        }

        public Criteria andCorpAddrLike(String value) {
            addCriterion("CorpAddr like", value, "corpAddr");
            return (Criteria) this;
        }

        public Criteria andCorpAddrNotLike(String value) {
            addCriterion("CorpAddr not like", value, "corpAddr");
            return (Criteria) this;
        }

        public Criteria andCorpAddrIn(List<String> values) {
            addCriterion("CorpAddr in", values, "corpAddr");
            return (Criteria) this;
        }

        public Criteria andCorpAddrNotIn(List<String> values) {
            addCriterion("CorpAddr not in", values, "corpAddr");
            return (Criteria) this;
        }

        public Criteria andCorpAddrBetween(String value1, String value2) {
            addCriterion("CorpAddr between", value1, value2, "corpAddr");
            return (Criteria) this;
        }

        public Criteria andCorpAddrNotBetween(String value1, String value2) {
            addCriterion("CorpAddr not between", value1, value2, "corpAddr");
            return (Criteria) this;
        }

        public Criteria andCorpZipIsNull() {
            addCriterion("CorpZip is null");
            return (Criteria) this;
        }

        public Criteria andCorpZipIsNotNull() {
            addCriterion("CorpZip is not null");
            return (Criteria) this;
        }

        public Criteria andCorpZipEqualTo(String value) {
            addCriterion("CorpZip =", value, "corpZip");
            return (Criteria) this;
        }

        public Criteria andCorpZipNotEqualTo(String value) {
            addCriterion("CorpZip <>", value, "corpZip");
            return (Criteria) this;
        }

        public Criteria andCorpZipGreaterThan(String value) {
            addCriterion("CorpZip >", value, "corpZip");
            return (Criteria) this;
        }

        public Criteria andCorpZipGreaterThanOrEqualTo(String value) {
            addCriterion("CorpZip >=", value, "corpZip");
            return (Criteria) this;
        }

        public Criteria andCorpZipLessThan(String value) {
            addCriterion("CorpZip <", value, "corpZip");
            return (Criteria) this;
        }

        public Criteria andCorpZipLessThanOrEqualTo(String value) {
            addCriterion("CorpZip <=", value, "corpZip");
            return (Criteria) this;
        }

        public Criteria andCorpZipLike(String value) {
            addCriterion("CorpZip like", value, "corpZip");
            return (Criteria) this;
        }

        public Criteria andCorpZipNotLike(String value) {
            addCriterion("CorpZip not like", value, "corpZip");
            return (Criteria) this;
        }

        public Criteria andCorpZipIn(List<String> values) {
            addCriterion("CorpZip in", values, "corpZip");
            return (Criteria) this;
        }

        public Criteria andCorpZipNotIn(List<String> values) {
            addCriterion("CorpZip not in", values, "corpZip");
            return (Criteria) this;
        }

        public Criteria andCorpZipBetween(String value1, String value2) {
            addCriterion("CorpZip between", value1, value2, "corpZip");
            return (Criteria) this;
        }

        public Criteria andCorpZipNotBetween(String value1, String value2) {
            addCriterion("CorpZip not between", value1, value2, "corpZip");
            return (Criteria) this;
        }

        public Criteria andCorpLevelIsNull() {
            addCriterion("CorpLevel is null");
            return (Criteria) this;
        }

        public Criteria andCorpLevelIsNotNull() {
            addCriterion("CorpLevel is not null");
            return (Criteria) this;
        }

        public Criteria andCorpLevelEqualTo(String value) {
            addCriterion("CorpLevel =", value, "corpLevel");
            return (Criteria) this;
        }

        public Criteria andCorpLevelNotEqualTo(String value) {
            addCriterion("CorpLevel <>", value, "corpLevel");
            return (Criteria) this;
        }

        public Criteria andCorpLevelGreaterThan(String value) {
            addCriterion("CorpLevel >", value, "corpLevel");
            return (Criteria) this;
        }

        public Criteria andCorpLevelGreaterThanOrEqualTo(String value) {
            addCriterion("CorpLevel >=", value, "corpLevel");
            return (Criteria) this;
        }

        public Criteria andCorpLevelLessThan(String value) {
            addCriterion("CorpLevel <", value, "corpLevel");
            return (Criteria) this;
        }

        public Criteria andCorpLevelLessThanOrEqualTo(String value) {
            addCriterion("CorpLevel <=", value, "corpLevel");
            return (Criteria) this;
        }

        public Criteria andCorpLevelLike(String value) {
            addCriterion("CorpLevel like", value, "corpLevel");
            return (Criteria) this;
        }

        public Criteria andCorpLevelNotLike(String value) {
            addCriterion("CorpLevel not like", value, "corpLevel");
            return (Criteria) this;
        }

        public Criteria andCorpLevelIn(List<String> values) {
            addCriterion("CorpLevel in", values, "corpLevel");
            return (Criteria) this;
        }

        public Criteria andCorpLevelNotIn(List<String> values) {
            addCriterion("CorpLevel not in", values, "corpLevel");
            return (Criteria) this;
        }

        public Criteria andCorpLevelBetween(String value1, String value2) {
            addCriterion("CorpLevel between", value1, value2, "corpLevel");
            return (Criteria) this;
        }

        public Criteria andCorpLevelNotBetween(String value1, String value2) {
            addCriterion("CorpLevel not between", value1, value2, "corpLevel");
            return (Criteria) this;
        }

        public Criteria andCorpProvIsNull() {
            addCriterion("CorpProv is null");
            return (Criteria) this;
        }

        public Criteria andCorpProvIsNotNull() {
            addCriterion("CorpProv is not null");
            return (Criteria) this;
        }

        public Criteria andCorpProvEqualTo(String value) {
            addCriterion("CorpProv =", value, "corpProv");
            return (Criteria) this;
        }

        public Criteria andCorpProvNotEqualTo(String value) {
            addCriterion("CorpProv <>", value, "corpProv");
            return (Criteria) this;
        }

        public Criteria andCorpProvGreaterThan(String value) {
            addCriterion("CorpProv >", value, "corpProv");
            return (Criteria) this;
        }

        public Criteria andCorpProvGreaterThanOrEqualTo(String value) {
            addCriterion("CorpProv >=", value, "corpProv");
            return (Criteria) this;
        }

        public Criteria andCorpProvLessThan(String value) {
            addCriterion("CorpProv <", value, "corpProv");
            return (Criteria) this;
        }

        public Criteria andCorpProvLessThanOrEqualTo(String value) {
            addCriterion("CorpProv <=", value, "corpProv");
            return (Criteria) this;
        }

        public Criteria andCorpProvLike(String value) {
            addCriterion("CorpProv like", value, "corpProv");
            return (Criteria) this;
        }

        public Criteria andCorpProvNotLike(String value) {
            addCriterion("CorpProv not like", value, "corpProv");
            return (Criteria) this;
        }

        public Criteria andCorpProvIn(List<String> values) {
            addCriterion("CorpProv in", values, "corpProv");
            return (Criteria) this;
        }

        public Criteria andCorpProvNotIn(List<String> values) {
            addCriterion("CorpProv not in", values, "corpProv");
            return (Criteria) this;
        }

        public Criteria andCorpProvBetween(String value1, String value2) {
            addCriterion("CorpProv between", value1, value2, "corpProv");
            return (Criteria) this;
        }

        public Criteria andCorpProvNotBetween(String value1, String value2) {
            addCriterion("CorpProv not between", value1, value2, "corpProv");
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

        public Criteria andMoneyCateEqualTo(Integer value) {
            addCriterion("MoneyCate =", value, "moneyCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCateNotEqualTo(Integer value) {
            addCriterion("MoneyCate <>", value, "moneyCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCateGreaterThan(Integer value) {
            addCriterion("MoneyCate >", value, "moneyCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCateGreaterThanOrEqualTo(Integer value) {
            addCriterion("MoneyCate >=", value, "moneyCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCateLessThan(Integer value) {
            addCriterion("MoneyCate <", value, "moneyCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCateLessThanOrEqualTo(Integer value) {
            addCriterion("MoneyCate <=", value, "moneyCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCateIn(List<Integer> values) {
            addCriterion("MoneyCate in", values, "moneyCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCateNotIn(List<Integer> values) {
            addCriterion("MoneyCate not in", values, "moneyCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCateBetween(Integer value1, Integer value2) {
            addCriterion("MoneyCate between", value1, value2, "moneyCate");
            return (Criteria) this;
        }

        public Criteria andMoneyCateNotBetween(Integer value1, Integer value2) {
            addCriterion("MoneyCate not between", value1, value2, "moneyCate");
            return (Criteria) this;
        }

        public Criteria andJobTrueIsNull() {
            addCriterion("JobTrue is null");
            return (Criteria) this;
        }

        public Criteria andJobTrueIsNotNull() {
            addCriterion("JobTrue is not null");
            return (Criteria) this;
        }

        public Criteria andJobTrueEqualTo(Integer value) {
            addCriterion("JobTrue =", value, "jobTrue");
            return (Criteria) this;
        }

        public Criteria andJobTrueNotEqualTo(Integer value) {
            addCriterion("JobTrue <>", value, "jobTrue");
            return (Criteria) this;
        }

        public Criteria andJobTrueGreaterThan(Integer value) {
            addCriterion("JobTrue >", value, "jobTrue");
            return (Criteria) this;
        }

        public Criteria andJobTrueGreaterThanOrEqualTo(Integer value) {
            addCriterion("JobTrue >=", value, "jobTrue");
            return (Criteria) this;
        }

        public Criteria andJobTrueLessThan(Integer value) {
            addCriterion("JobTrue <", value, "jobTrue");
            return (Criteria) this;
        }

        public Criteria andJobTrueLessThanOrEqualTo(Integer value) {
            addCriterion("JobTrue <=", value, "jobTrue");
            return (Criteria) this;
        }

        public Criteria andJobTrueIn(List<Integer> values) {
            addCriterion("JobTrue in", values, "jobTrue");
            return (Criteria) this;
        }

        public Criteria andJobTrueNotIn(List<Integer> values) {
            addCriterion("JobTrue not in", values, "jobTrue");
            return (Criteria) this;
        }

        public Criteria andJobTrueBetween(Integer value1, Integer value2) {
            addCriterion("JobTrue between", value1, value2, "jobTrue");
            return (Criteria) this;
        }

        public Criteria andJobTrueNotBetween(Integer value1, Integer value2) {
            addCriterion("JobTrue not between", value1, value2, "jobTrue");
            return (Criteria) this;
        }

        public Criteria andCorpOutNoIsNull() {
            addCriterion("CorpOutNo is null");
            return (Criteria) this;
        }

        public Criteria andCorpOutNoIsNotNull() {
            addCriterion("CorpOutNo is not null");
            return (Criteria) this;
        }

        public Criteria andCorpOutNoEqualTo(Integer value) {
            addCriterion("CorpOutNo =", value, "corpOutNo");
            return (Criteria) this;
        }

        public Criteria andCorpOutNoNotEqualTo(Integer value) {
            addCriterion("CorpOutNo <>", value, "corpOutNo");
            return (Criteria) this;
        }

        public Criteria andCorpOutNoGreaterThan(Integer value) {
            addCriterion("CorpOutNo >", value, "corpOutNo");
            return (Criteria) this;
        }

        public Criteria andCorpOutNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("CorpOutNo >=", value, "corpOutNo");
            return (Criteria) this;
        }

        public Criteria andCorpOutNoLessThan(Integer value) {
            addCriterion("CorpOutNo <", value, "corpOutNo");
            return (Criteria) this;
        }

        public Criteria andCorpOutNoLessThanOrEqualTo(Integer value) {
            addCriterion("CorpOutNo <=", value, "corpOutNo");
            return (Criteria) this;
        }

        public Criteria andCorpOutNoIn(List<Integer> values) {
            addCriterion("CorpOutNo in", values, "corpOutNo");
            return (Criteria) this;
        }

        public Criteria andCorpOutNoNotIn(List<Integer> values) {
            addCriterion("CorpOutNo not in", values, "corpOutNo");
            return (Criteria) this;
        }

        public Criteria andCorpOutNoBetween(Integer value1, Integer value2) {
            addCriterion("CorpOutNo between", value1, value2, "corpOutNo");
            return (Criteria) this;
        }

        public Criteria andCorpOutNoNotBetween(Integer value1, Integer value2) {
            addCriterion("CorpOutNo not between", value1, value2, "corpOutNo");
            return (Criteria) this;
        }

        public Criteria andIndexShowIsNull() {
            addCriterion("IndexShow is null");
            return (Criteria) this;
        }

        public Criteria andIndexShowIsNotNull() {
            addCriterion("IndexShow is not null");
            return (Criteria) this;
        }

        public Criteria andIndexShowEqualTo(Integer value) {
            addCriterion("IndexShow =", value, "indexShow");
            return (Criteria) this;
        }

        public Criteria andIndexShowNotEqualTo(Integer value) {
            addCriterion("IndexShow <>", value, "indexShow");
            return (Criteria) this;
        }

        public Criteria andIndexShowGreaterThan(Integer value) {
            addCriterion("IndexShow >", value, "indexShow");
            return (Criteria) this;
        }

        public Criteria andIndexShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("IndexShow >=", value, "indexShow");
            return (Criteria) this;
        }

        public Criteria andIndexShowLessThan(Integer value) {
            addCriterion("IndexShow <", value, "indexShow");
            return (Criteria) this;
        }

        public Criteria andIndexShowLessThanOrEqualTo(Integer value) {
            addCriterion("IndexShow <=", value, "indexShow");
            return (Criteria) this;
        }

        public Criteria andIndexShowIn(List<Integer> values) {
            addCriterion("IndexShow in", values, "indexShow");
            return (Criteria) this;
        }

        public Criteria andIndexShowNotIn(List<Integer> values) {
            addCriterion("IndexShow not in", values, "indexShow");
            return (Criteria) this;
        }

        public Criteria andIndexShowBetween(Integer value1, Integer value2) {
            addCriterion("IndexShow between", value1, value2, "indexShow");
            return (Criteria) this;
        }

        public Criteria andIndexShowNotBetween(Integer value1, Integer value2) {
            addCriterion("IndexShow not between", value1, value2, "indexShow");
            return (Criteria) this;
        }

        public Criteria andCtl_StatusIsNull() {
            addCriterion("Ctl_Status is null");
            return (Criteria) this;
        }

        public Criteria andCtl_StatusIsNotNull() {
            addCriterion("Ctl_Status is not null");
            return (Criteria) this;
        }

        public Criteria andCtl_StatusEqualTo(Integer value) {
            addCriterion("Ctl_Status =", value, "ctl_Status");
            return (Criteria) this;
        }

        public Criteria andCtl_StatusNotEqualTo(Integer value) {
            addCriterion("Ctl_Status <>", value, "ctl_Status");
            return (Criteria) this;
        }

        public Criteria andCtl_StatusGreaterThan(Integer value) {
            addCriterion("Ctl_Status >", value, "ctl_Status");
            return (Criteria) this;
        }

        public Criteria andCtl_StatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Ctl_Status >=", value, "ctl_Status");
            return (Criteria) this;
        }

        public Criteria andCtl_StatusLessThan(Integer value) {
            addCriterion("Ctl_Status <", value, "ctl_Status");
            return (Criteria) this;
        }

        public Criteria andCtl_StatusLessThanOrEqualTo(Integer value) {
            addCriterion("Ctl_Status <=", value, "ctl_Status");
            return (Criteria) this;
        }

        public Criteria andCtl_StatusIn(List<Integer> values) {
            addCriterion("Ctl_Status in", values, "ctl_Status");
            return (Criteria) this;
        }

        public Criteria andCtl_StatusNotIn(List<Integer> values) {
            addCriterion("Ctl_Status not in", values, "ctl_Status");
            return (Criteria) this;
        }

        public Criteria andCtl_StatusBetween(Integer value1, Integer value2) {
            addCriterion("Ctl_Status between", value1, value2, "ctl_Status");
            return (Criteria) this;
        }

        public Criteria andCtl_StatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Ctl_Status not between", value1, value2, "ctl_Status");
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

        public Criteria andRegIPIsNull() {
            addCriterion("RegIP is null");
            return (Criteria) this;
        }

        public Criteria andRegIPIsNotNull() {
            addCriterion("RegIP is not null");
            return (Criteria) this;
        }

        public Criteria andRegIPEqualTo(String value) {
            addCriterion("RegIP =", value, "regIP");
            return (Criteria) this;
        }

        public Criteria andRegIPNotEqualTo(String value) {
            addCriterion("RegIP <>", value, "regIP");
            return (Criteria) this;
        }

        public Criteria andRegIPGreaterThan(String value) {
            addCriterion("RegIP >", value, "regIP");
            return (Criteria) this;
        }

        public Criteria andRegIPGreaterThanOrEqualTo(String value) {
            addCriterion("RegIP >=", value, "regIP");
            return (Criteria) this;
        }

        public Criteria andRegIPLessThan(String value) {
            addCriterion("RegIP <", value, "regIP");
            return (Criteria) this;
        }

        public Criteria andRegIPLessThanOrEqualTo(String value) {
            addCriterion("RegIP <=", value, "regIP");
            return (Criteria) this;
        }

        public Criteria andRegIPLike(String value) {
            addCriterion("RegIP like", value, "regIP");
            return (Criteria) this;
        }

        public Criteria andRegIPNotLike(String value) {
            addCriterion("RegIP not like", value, "regIP");
            return (Criteria) this;
        }

        public Criteria andRegIPIn(List<String> values) {
            addCriterion("RegIP in", values, "regIP");
            return (Criteria) this;
        }

        public Criteria andRegIPNotIn(List<String> values) {
            addCriterion("RegIP not in", values, "regIP");
            return (Criteria) this;
        }

        public Criteria andRegIPBetween(String value1, String value2) {
            addCriterion("RegIP between", value1, value2, "regIP");
            return (Criteria) this;
        }

        public Criteria andRegIPNotBetween(String value1, String value2) {
            addCriterion("RegIP not between", value1, value2, "regIP");
            return (Criteria) this;
        }

        public Criteria andRegNameIsNull() {
            addCriterion("RegName is null");
            return (Criteria) this;
        }

        public Criteria andRegNameIsNotNull() {
            addCriterion("RegName is not null");
            return (Criteria) this;
        }

        public Criteria andRegNameEqualTo(String value) {
            addCriterion("RegName =", value, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameNotEqualTo(String value) {
            addCriterion("RegName <>", value, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameGreaterThan(String value) {
            addCriterion("RegName >", value, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameGreaterThanOrEqualTo(String value) {
            addCriterion("RegName >=", value, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameLessThan(String value) {
            addCriterion("RegName <", value, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameLessThanOrEqualTo(String value) {
            addCriterion("RegName <=", value, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameLike(String value) {
            addCriterion("RegName like", value, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameNotLike(String value) {
            addCriterion("RegName not like", value, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameIn(List<String> values) {
            addCriterion("RegName in", values, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameNotIn(List<String> values) {
            addCriterion("RegName not in", values, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameBetween(String value1, String value2) {
            addCriterion("RegName between", value1, value2, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameNotBetween(String value1, String value2) {
            addCriterion("RegName not between", value1, value2, "regName");
            return (Criteria) this;
        }

        public Criteria andLogInDateIsNull() {
            addCriterion("LogInDate is null");
            return (Criteria) this;
        }

        public Criteria andLogInDateIsNotNull() {
            addCriterion("LogInDate is not null");
            return (Criteria) this;
        }

        public Criteria andLogInDateEqualTo(Date value) {
            addCriterion("LogInDate =", value, "logInDate");
            return (Criteria) this;
        }

        public Criteria andLogInDateNotEqualTo(Date value) {
            addCriterion("LogInDate <>", value, "logInDate");
            return (Criteria) this;
        }

        public Criteria andLogInDateGreaterThan(Date value) {
            addCriterion("LogInDate >", value, "logInDate");
            return (Criteria) this;
        }

        public Criteria andLogInDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LogInDate >=", value, "logInDate");
            return (Criteria) this;
        }

        public Criteria andLogInDateLessThan(Date value) {
            addCriterion("LogInDate <", value, "logInDate");
            return (Criteria) this;
        }

        public Criteria andLogInDateLessThanOrEqualTo(Date value) {
            addCriterion("LogInDate <=", value, "logInDate");
            return (Criteria) this;
        }

        public Criteria andLogInDateIn(List<Date> values) {
            addCriterion("LogInDate in", values, "logInDate");
            return (Criteria) this;
        }

        public Criteria andLogInDateNotIn(List<Date> values) {
            addCriterion("LogInDate not in", values, "logInDate");
            return (Criteria) this;
        }

        public Criteria andLogInDateBetween(Date value1, Date value2) {
            addCriterion("LogInDate between", value1, value2, "logInDate");
            return (Criteria) this;
        }

        public Criteria andLogInDateNotBetween(Date value1, Date value2) {
            addCriterion("LogInDate not between", value1, value2, "logInDate");
            return (Criteria) this;
        }

        public Criteria andTryDateIsNull() {
            addCriterion("TryDate is null");
            return (Criteria) this;
        }

        public Criteria andTryDateIsNotNull() {
            addCriterion("TryDate is not null");
            return (Criteria) this;
        }

        public Criteria andTryDateEqualTo(Date value) {
            addCriterion("TryDate =", value, "tryDate");
            return (Criteria) this;
        }

        public Criteria andTryDateNotEqualTo(Date value) {
            addCriterion("TryDate <>", value, "tryDate");
            return (Criteria) this;
        }

        public Criteria andTryDateGreaterThan(Date value) {
            addCriterion("TryDate >", value, "tryDate");
            return (Criteria) this;
        }

        public Criteria andTryDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TryDate >=", value, "tryDate");
            return (Criteria) this;
        }

        public Criteria andTryDateLessThan(Date value) {
            addCriterion("TryDate <", value, "tryDate");
            return (Criteria) this;
        }

        public Criteria andTryDateLessThanOrEqualTo(Date value) {
            addCriterion("TryDate <=", value, "tryDate");
            return (Criteria) this;
        }

        public Criteria andTryDateIn(List<Date> values) {
            addCriterion("TryDate in", values, "tryDate");
            return (Criteria) this;
        }

        public Criteria andTryDateNotIn(List<Date> values) {
            addCriterion("TryDate not in", values, "tryDate");
            return (Criteria) this;
        }

        public Criteria andTryDateBetween(Date value1, Date value2) {
            addCriterion("TryDate between", value1, value2, "tryDate");
            return (Criteria) this;
        }

        public Criteria andTryDateNotBetween(Date value1, Date value2) {
            addCriterion("TryDate not between", value1, value2, "tryDate");
            return (Criteria) this;
        }

        public Criteria andIsTryIsNull() {
            addCriterion("IsTry is null");
            return (Criteria) this;
        }

        public Criteria andIsTryIsNotNull() {
            addCriterion("IsTry is not null");
            return (Criteria) this;
        }

        public Criteria andIsTryEqualTo(Integer value) {
            addCriterion("IsTry =", value, "isTry");
            return (Criteria) this;
        }

        public Criteria andIsTryNotEqualTo(Integer value) {
            addCriterion("IsTry <>", value, "isTry");
            return (Criteria) this;
        }

        public Criteria andIsTryGreaterThan(Integer value) {
            addCriterion("IsTry >", value, "isTry");
            return (Criteria) this;
        }

        public Criteria andIsTryGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsTry >=", value, "isTry");
            return (Criteria) this;
        }

        public Criteria andIsTryLessThan(Integer value) {
            addCriterion("IsTry <", value, "isTry");
            return (Criteria) this;
        }

        public Criteria andIsTryLessThanOrEqualTo(Integer value) {
            addCriterion("IsTry <=", value, "isTry");
            return (Criteria) this;
        }

        public Criteria andIsTryIn(List<Integer> values) {
            addCriterion("IsTry in", values, "isTry");
            return (Criteria) this;
        }

        public Criteria andIsTryNotIn(List<Integer> values) {
            addCriterion("IsTry not in", values, "isTry");
            return (Criteria) this;
        }

        public Criteria andIsTryBetween(Integer value1, Integer value2) {
            addCriterion("IsTry between", value1, value2, "isTry");
            return (Criteria) this;
        }

        public Criteria andIsTryNotBetween(Integer value1, Integer value2) {
            addCriterion("IsTry not between", value1, value2, "isTry");
            return (Criteria) this;
        }

        public Criteria andLogInCountIsNull() {
            addCriterion("LogInCount is null");
            return (Criteria) this;
        }

        public Criteria andLogInCountIsNotNull() {
            addCriterion("LogInCount is not null");
            return (Criteria) this;
        }

        public Criteria andLogInCountEqualTo(Integer value) {
            addCriterion("LogInCount =", value, "logInCount");
            return (Criteria) this;
        }

        public Criteria andLogInCountNotEqualTo(Integer value) {
            addCriterion("LogInCount <>", value, "logInCount");
            return (Criteria) this;
        }

        public Criteria andLogInCountGreaterThan(Integer value) {
            addCriterion("LogInCount >", value, "logInCount");
            return (Criteria) this;
        }

        public Criteria andLogInCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("LogInCount >=", value, "logInCount");
            return (Criteria) this;
        }

        public Criteria andLogInCountLessThan(Integer value) {
            addCriterion("LogInCount <", value, "logInCount");
            return (Criteria) this;
        }

        public Criteria andLogInCountLessThanOrEqualTo(Integer value) {
            addCriterion("LogInCount <=", value, "logInCount");
            return (Criteria) this;
        }

        public Criteria andLogInCountIn(List<Integer> values) {
            addCriterion("LogInCount in", values, "logInCount");
            return (Criteria) this;
        }

        public Criteria andLogInCountNotIn(List<Integer> values) {
            addCriterion("LogInCount not in", values, "logInCount");
            return (Criteria) this;
        }

        public Criteria andLogInCountBetween(Integer value1, Integer value2) {
            addCriterion("LogInCount between", value1, value2, "logInCount");
            return (Criteria) this;
        }

        public Criteria andLogInCountNotBetween(Integer value1, Integer value2) {
            addCriterion("LogInCount not between", value1, value2, "logInCount");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNull() {
            addCriterion("ExpireDate is null");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNotNull() {
            addCriterion("ExpireDate is not null");
            return (Criteria) this;
        }

        public Criteria andExpireDateEqualTo(Date value) {
            addCriterion("ExpireDate =", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotEqualTo(Date value) {
            addCriterion("ExpireDate <>", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThan(Date value) {
            addCriterion("ExpireDate >", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ExpireDate >=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThan(Date value) {
            addCriterion("ExpireDate <", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThanOrEqualTo(Date value) {
            addCriterion("ExpireDate <=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateIn(List<Date> values) {
            addCriterion("ExpireDate in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotIn(List<Date> values) {
            addCriterion("ExpireDate not in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateBetween(Date value1, Date value2) {
            addCriterion("ExpireDate between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotBetween(Date value1, Date value2) {
            addCriterion("ExpireDate not between", value1, value2, "expireDate");
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