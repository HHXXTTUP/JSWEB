package com.js.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SAdminworklistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SAdminworklistExample() {
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

        public Criteria andRealNameIsNull() {
            addCriterion("RealName is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("RealName is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("RealName =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("RealName <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("RealName >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("RealName >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("RealName <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("RealName <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("RealName like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("RealName not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("RealName in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("RealName not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("RealName between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("RealName not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andCateIsNull() {
            addCriterion("Cate is null");
            return (Criteria) this;
        }

        public Criteria andCateIsNotNull() {
            addCriterion("Cate is not null");
            return (Criteria) this;
        }

        public Criteria andCateEqualTo(String value) {
            addCriterion("Cate =", value, "cate");
            return (Criteria) this;
        }

        public Criteria andCateNotEqualTo(String value) {
            addCriterion("Cate <>", value, "cate");
            return (Criteria) this;
        }

        public Criteria andCateGreaterThan(String value) {
            addCriterion("Cate >", value, "cate");
            return (Criteria) this;
        }

        public Criteria andCateGreaterThanOrEqualTo(String value) {
            addCriterion("Cate >=", value, "cate");
            return (Criteria) this;
        }

        public Criteria andCateLessThan(String value) {
            addCriterion("Cate <", value, "cate");
            return (Criteria) this;
        }

        public Criteria andCateLessThanOrEqualTo(String value) {
            addCriterion("Cate <=", value, "cate");
            return (Criteria) this;
        }

        public Criteria andCateLike(String value) {
            addCriterion("Cate like", value, "cate");
            return (Criteria) this;
        }

        public Criteria andCateNotLike(String value) {
            addCriterion("Cate not like", value, "cate");
            return (Criteria) this;
        }

        public Criteria andCateIn(List<String> values) {
            addCriterion("Cate in", values, "cate");
            return (Criteria) this;
        }

        public Criteria andCateNotIn(List<String> values) {
            addCriterion("Cate not in", values, "cate");
            return (Criteria) this;
        }

        public Criteria andCateBetween(String value1, String value2) {
            addCriterion("Cate between", value1, value2, "cate");
            return (Criteria) this;
        }

        public Criteria andCateNotBetween(String value1, String value2) {
            addCriterion("Cate not between", value1, value2, "cate");
            return (Criteria) this;
        }

        public Criteria andPointIsNull() {
            addCriterion("Point is null");
            return (Criteria) this;
        }

        public Criteria andPointIsNotNull() {
            addCriterion("Point is not null");
            return (Criteria) this;
        }

        public Criteria andPointEqualTo(Double value) {
            addCriterion("Point =", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotEqualTo(Double value) {
            addCriterion("Point <>", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThan(Double value) {
            addCriterion("Point >", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualTo(Double value) {
            addCriterion("Point >=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThan(Double value) {
            addCriterion("Point <", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualTo(Double value) {
            addCriterion("Point <=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointIn(List<Double> values) {
            addCriterion("Point in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotIn(List<Double> values) {
            addCriterion("Point not in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointBetween(Double value1, Double value2) {
            addCriterion("Point between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotBetween(Double value1, Double value2) {
            addCriterion("Point not between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointDateIsNull() {
            addCriterion("PointDate is null");
            return (Criteria) this;
        }

        public Criteria andPointDateIsNotNull() {
            addCriterion("PointDate is not null");
            return (Criteria) this;
        }

        public Criteria andPointDateEqualTo(Date value) {
            addCriterion("PointDate =", value, "pointDate");
            return (Criteria) this;
        }

        public Criteria andPointDateNotEqualTo(Date value) {
            addCriterion("PointDate <>", value, "pointDate");
            return (Criteria) this;
        }

        public Criteria andPointDateGreaterThan(Date value) {
            addCriterion("PointDate >", value, "pointDate");
            return (Criteria) this;
        }

        public Criteria andPointDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PointDate >=", value, "pointDate");
            return (Criteria) this;
        }

        public Criteria andPointDateLessThan(Date value) {
            addCriterion("PointDate <", value, "pointDate");
            return (Criteria) this;
        }

        public Criteria andPointDateLessThanOrEqualTo(Date value) {
            addCriterion("PointDate <=", value, "pointDate");
            return (Criteria) this;
        }

        public Criteria andPointDateIn(List<Date> values) {
            addCriterion("PointDate in", values, "pointDate");
            return (Criteria) this;
        }

        public Criteria andPointDateNotIn(List<Date> values) {
            addCriterion("PointDate not in", values, "pointDate");
            return (Criteria) this;
        }

        public Criteria andPointDateBetween(Date value1, Date value2) {
            addCriterion("PointDate between", value1, value2, "pointDate");
            return (Criteria) this;
        }

        public Criteria andPointDateNotBetween(Date value1, Date value2) {
            addCriterion("PointDate not between", value1, value2, "pointDate");
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

        public Criteria andEditNameIsNull() {
            addCriterion("EditName is null");
            return (Criteria) this;
        }

        public Criteria andEditNameIsNotNull() {
            addCriterion("EditName is not null");
            return (Criteria) this;
        }

        public Criteria andEditNameEqualTo(String value) {
            addCriterion("EditName =", value, "editName");
            return (Criteria) this;
        }

        public Criteria andEditNameNotEqualTo(String value) {
            addCriterion("EditName <>", value, "editName");
            return (Criteria) this;
        }

        public Criteria andEditNameGreaterThan(String value) {
            addCriterion("EditName >", value, "editName");
            return (Criteria) this;
        }

        public Criteria andEditNameGreaterThanOrEqualTo(String value) {
            addCriterion("EditName >=", value, "editName");
            return (Criteria) this;
        }

        public Criteria andEditNameLessThan(String value) {
            addCriterion("EditName <", value, "editName");
            return (Criteria) this;
        }

        public Criteria andEditNameLessThanOrEqualTo(String value) {
            addCriterion("EditName <=", value, "editName");
            return (Criteria) this;
        }

        public Criteria andEditNameLike(String value) {
            addCriterion("EditName like", value, "editName");
            return (Criteria) this;
        }

        public Criteria andEditNameNotLike(String value) {
            addCriterion("EditName not like", value, "editName");
            return (Criteria) this;
        }

        public Criteria andEditNameIn(List<String> values) {
            addCriterion("EditName in", values, "editName");
            return (Criteria) this;
        }

        public Criteria andEditNameNotIn(List<String> values) {
            addCriterion("EditName not in", values, "editName");
            return (Criteria) this;
        }

        public Criteria andEditNameBetween(String value1, String value2) {
            addCriterion("EditName between", value1, value2, "editName");
            return (Criteria) this;
        }

        public Criteria andEditNameNotBetween(String value1, String value2) {
            addCriterion("EditName not between", value1, value2, "editName");
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

        public Criteria andOldIDIsNull() {
            addCriterion("OldID is null");
            return (Criteria) this;
        }

        public Criteria andOldIDIsNotNull() {
            addCriterion("OldID is not null");
            return (Criteria) this;
        }

        public Criteria andOldIDEqualTo(Integer value) {
            addCriterion("OldID =", value, "oldID");
            return (Criteria) this;
        }

        public Criteria andOldIDNotEqualTo(Integer value) {
            addCriterion("OldID <>", value, "oldID");
            return (Criteria) this;
        }

        public Criteria andOldIDGreaterThan(Integer value) {
            addCriterion("OldID >", value, "oldID");
            return (Criteria) this;
        }

        public Criteria andOldIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("OldID >=", value, "oldID");
            return (Criteria) this;
        }

        public Criteria andOldIDLessThan(Integer value) {
            addCriterion("OldID <", value, "oldID");
            return (Criteria) this;
        }

        public Criteria andOldIDLessThanOrEqualTo(Integer value) {
            addCriterion("OldID <=", value, "oldID");
            return (Criteria) this;
        }

        public Criteria andOldIDIn(List<Integer> values) {
            addCriterion("OldID in", values, "oldID");
            return (Criteria) this;
        }

        public Criteria andOldIDNotIn(List<Integer> values) {
            addCriterion("OldID not in", values, "oldID");
            return (Criteria) this;
        }

        public Criteria andOldIDBetween(Integer value1, Integer value2) {
            addCriterion("OldID between", value1, value2, "oldID");
            return (Criteria) this;
        }

        public Criteria andOldIDNotBetween(Integer value1, Integer value2) {
            addCriterion("OldID not between", value1, value2, "oldID");
            return (Criteria) this;
        }

        public Criteria andIsOpenIsNull() {
            addCriterion("IsOpen is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenIsNotNull() {
            addCriterion("IsOpen is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenEqualTo(Integer value) {
            addCriterion("IsOpen =", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotEqualTo(Integer value) {
            addCriterion("IsOpen <>", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenGreaterThan(Integer value) {
            addCriterion("IsOpen >", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsOpen >=", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLessThan(Integer value) {
            addCriterion("IsOpen <", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLessThanOrEqualTo(Integer value) {
            addCriterion("IsOpen <=", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenIn(List<Integer> values) {
            addCriterion("IsOpen in", values, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotIn(List<Integer> values) {
            addCriterion("IsOpen not in", values, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenBetween(Integer value1, Integer value2) {
            addCriterion("IsOpen between", value1, value2, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotBetween(Integer value1, Integer value2) {
            addCriterion("IsOpen not between", value1, value2, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsFinishIsNull() {
            addCriterion("IsFinish is null");
            return (Criteria) this;
        }

        public Criteria andIsFinishIsNotNull() {
            addCriterion("IsFinish is not null");
            return (Criteria) this;
        }

        public Criteria andIsFinishEqualTo(Integer value) {
            addCriterion("IsFinish =", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishNotEqualTo(Integer value) {
            addCriterion("IsFinish <>", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishGreaterThan(Integer value) {
            addCriterion("IsFinish >", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsFinish >=", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishLessThan(Integer value) {
            addCriterion("IsFinish <", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishLessThanOrEqualTo(Integer value) {
            addCriterion("IsFinish <=", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishIn(List<Integer> values) {
            addCriterion("IsFinish in", values, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishNotIn(List<Integer> values) {
            addCriterion("IsFinish not in", values, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishBetween(Integer value1, Integer value2) {
            addCriterion("IsFinish between", value1, value2, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishNotBetween(Integer value1, Integer value2) {
            addCriterion("IsFinish not between", value1, value2, "isFinish");
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