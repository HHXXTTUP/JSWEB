package com.js.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SDcbuymemoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SDcbuymemoExample() {
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

        public Criteria andCorpStarIsNull() {
            addCriterion("CorpStar is null");
            return (Criteria) this;
        }

        public Criteria andCorpStarIsNotNull() {
            addCriterion("CorpStar is not null");
            return (Criteria) this;
        }

        public Criteria andCorpStarEqualTo(Integer value) {
            addCriterion("CorpStar =", value, "corpStar");
            return (Criteria) this;
        }

        public Criteria andCorpStarNotEqualTo(Integer value) {
            addCriterion("CorpStar <>", value, "corpStar");
            return (Criteria) this;
        }

        public Criteria andCorpStarGreaterThan(Integer value) {
            addCriterion("CorpStar >", value, "corpStar");
            return (Criteria) this;
        }

        public Criteria andCorpStarGreaterThanOrEqualTo(Integer value) {
            addCriterion("CorpStar >=", value, "corpStar");
            return (Criteria) this;
        }

        public Criteria andCorpStarLessThan(Integer value) {
            addCriterion("CorpStar <", value, "corpStar");
            return (Criteria) this;
        }

        public Criteria andCorpStarLessThanOrEqualTo(Integer value) {
            addCriterion("CorpStar <=", value, "corpStar");
            return (Criteria) this;
        }

        public Criteria andCorpStarIn(List<Integer> values) {
            addCriterion("CorpStar in", values, "corpStar");
            return (Criteria) this;
        }

        public Criteria andCorpStarNotIn(List<Integer> values) {
            addCriterion("CorpStar not in", values, "corpStar");
            return (Criteria) this;
        }

        public Criteria andCorpStarBetween(Integer value1, Integer value2) {
            addCriterion("CorpStar between", value1, value2, "corpStar");
            return (Criteria) this;
        }

        public Criteria andCorpStarNotBetween(Integer value1, Integer value2) {
            addCriterion("CorpStar not between", value1, value2, "corpStar");
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

        public Criteria andMdm2010IsNull() {
            addCriterion("Mdm2010 is null");
            return (Criteria) this;
        }

        public Criteria andMdm2010IsNotNull() {
            addCriterion("Mdm2010 is not null");
            return (Criteria) this;
        }

        public Criteria andMdm2010EqualTo(String value) {
            addCriterion("Mdm2010 =", value, "mdm2010");
            return (Criteria) this;
        }

        public Criteria andMdm2010NotEqualTo(String value) {
            addCriterion("Mdm2010 <>", value, "mdm2010");
            return (Criteria) this;
        }

        public Criteria andMdm2010GreaterThan(String value) {
            addCriterion("Mdm2010 >", value, "mdm2010");
            return (Criteria) this;
        }

        public Criteria andMdm2010GreaterThanOrEqualTo(String value) {
            addCriterion("Mdm2010 >=", value, "mdm2010");
            return (Criteria) this;
        }

        public Criteria andMdm2010LessThan(String value) {
            addCriterion("Mdm2010 <", value, "mdm2010");
            return (Criteria) this;
        }

        public Criteria andMdm2010LessThanOrEqualTo(String value) {
            addCriterion("Mdm2010 <=", value, "mdm2010");
            return (Criteria) this;
        }

        public Criteria andMdm2010Like(String value) {
            addCriterion("Mdm2010 like", value, "mdm2010");
            return (Criteria) this;
        }

        public Criteria andMdm2010NotLike(String value) {
            addCriterion("Mdm2010 not like", value, "mdm2010");
            return (Criteria) this;
        }

        public Criteria andMdm2010In(List<String> values) {
            addCriterion("Mdm2010 in", values, "mdm2010");
            return (Criteria) this;
        }

        public Criteria andMdm2010NotIn(List<String> values) {
            addCriterion("Mdm2010 not in", values, "mdm2010");
            return (Criteria) this;
        }

        public Criteria andMdm2010Between(String value1, String value2) {
            addCriterion("Mdm2010 between", value1, value2, "mdm2010");
            return (Criteria) this;
        }

        public Criteria andMdm2010NotBetween(String value1, String value2) {
            addCriterion("Mdm2010 not between", value1, value2, "mdm2010");
            return (Criteria) this;
        }

        public Criteria andPhone2010IsNull() {
            addCriterion("Phone2010 is null");
            return (Criteria) this;
        }

        public Criteria andPhone2010IsNotNull() {
            addCriterion("Phone2010 is not null");
            return (Criteria) this;
        }

        public Criteria andPhone2010EqualTo(String value) {
            addCriterion("Phone2010 =", value, "phone2010");
            return (Criteria) this;
        }

        public Criteria andPhone2010NotEqualTo(String value) {
            addCriterion("Phone2010 <>", value, "phone2010");
            return (Criteria) this;
        }

        public Criteria andPhone2010GreaterThan(String value) {
            addCriterion("Phone2010 >", value, "phone2010");
            return (Criteria) this;
        }

        public Criteria andPhone2010GreaterThanOrEqualTo(String value) {
            addCriterion("Phone2010 >=", value, "phone2010");
            return (Criteria) this;
        }

        public Criteria andPhone2010LessThan(String value) {
            addCriterion("Phone2010 <", value, "phone2010");
            return (Criteria) this;
        }

        public Criteria andPhone2010LessThanOrEqualTo(String value) {
            addCriterion("Phone2010 <=", value, "phone2010");
            return (Criteria) this;
        }

        public Criteria andPhone2010Like(String value) {
            addCriterion("Phone2010 like", value, "phone2010");
            return (Criteria) this;
        }

        public Criteria andPhone2010NotLike(String value) {
            addCriterion("Phone2010 not like", value, "phone2010");
            return (Criteria) this;
        }

        public Criteria andPhone2010In(List<String> values) {
            addCriterion("Phone2010 in", values, "phone2010");
            return (Criteria) this;
        }

        public Criteria andPhone2010NotIn(List<String> values) {
            addCriterion("Phone2010 not in", values, "phone2010");
            return (Criteria) this;
        }

        public Criteria andPhone2010Between(String value1, String value2) {
            addCriterion("Phone2010 between", value1, value2, "phone2010");
            return (Criteria) this;
        }

        public Criteria andPhone2010NotBetween(String value1, String value2) {
            addCriterion("Phone2010 not between", value1, value2, "phone2010");
            return (Criteria) this;
        }

        public Criteria andMdmCountIsNull() {
            addCriterion("MdmCount is null");
            return (Criteria) this;
        }

        public Criteria andMdmCountIsNotNull() {
            addCriterion("MdmCount is not null");
            return (Criteria) this;
        }

        public Criteria andMdmCountEqualTo(Integer value) {
            addCriterion("MdmCount =", value, "mdmCount");
            return (Criteria) this;
        }

        public Criteria andMdmCountNotEqualTo(Integer value) {
            addCriterion("MdmCount <>", value, "mdmCount");
            return (Criteria) this;
        }

        public Criteria andMdmCountGreaterThan(Integer value) {
            addCriterion("MdmCount >", value, "mdmCount");
            return (Criteria) this;
        }

        public Criteria andMdmCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("MdmCount >=", value, "mdmCount");
            return (Criteria) this;
        }

        public Criteria andMdmCountLessThan(Integer value) {
            addCriterion("MdmCount <", value, "mdmCount");
            return (Criteria) this;
        }

        public Criteria andMdmCountLessThanOrEqualTo(Integer value) {
            addCriterion("MdmCount <=", value, "mdmCount");
            return (Criteria) this;
        }

        public Criteria andMdmCountIn(List<Integer> values) {
            addCriterion("MdmCount in", values, "mdmCount");
            return (Criteria) this;
        }

        public Criteria andMdmCountNotIn(List<Integer> values) {
            addCriterion("MdmCount not in", values, "mdmCount");
            return (Criteria) this;
        }

        public Criteria andMdmCountBetween(Integer value1, Integer value2) {
            addCriterion("MdmCount between", value1, value2, "mdmCount");
            return (Criteria) this;
        }

        public Criteria andMdmCountNotBetween(Integer value1, Integer value2) {
            addCriterion("MdmCount not between", value1, value2, "mdmCount");
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