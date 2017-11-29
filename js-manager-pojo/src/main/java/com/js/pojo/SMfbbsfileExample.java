package com.js.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SMfbbsfileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SMfbbsfileExample() {
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

        public Criteria andFileNoIsNull() {
            addCriterion("FileNo is null");
            return (Criteria) this;
        }

        public Criteria andFileNoIsNotNull() {
            addCriterion("FileNo is not null");
            return (Criteria) this;
        }

        public Criteria andFileNoEqualTo(String value) {
            addCriterion("FileNo =", value, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoNotEqualTo(String value) {
            addCriterion("FileNo <>", value, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoGreaterThan(String value) {
            addCriterion("FileNo >", value, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoGreaterThanOrEqualTo(String value) {
            addCriterion("FileNo >=", value, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoLessThan(String value) {
            addCriterion("FileNo <", value, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoLessThanOrEqualTo(String value) {
            addCriterion("FileNo <=", value, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoLike(String value) {
            addCriterion("FileNo like", value, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoNotLike(String value) {
            addCriterion("FileNo not like", value, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoIn(List<String> values) {
            addCriterion("FileNo in", values, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoNotIn(List<String> values) {
            addCriterion("FileNo not in", values, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoBetween(String value1, String value2) {
            addCriterion("FileNo between", value1, value2, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoNotBetween(String value1, String value2) {
            addCriterion("FileNo not between", value1, value2, "fileNo");
            return (Criteria) this;
        }

        public Criteria andWebUserIDIsNull() {
            addCriterion("WebUserID is null");
            return (Criteria) this;
        }

        public Criteria andWebUserIDIsNotNull() {
            addCriterion("WebUserID is not null");
            return (Criteria) this;
        }

        public Criteria andWebUserIDEqualTo(Integer value) {
            addCriterion("WebUserID =", value, "webUserID");
            return (Criteria) this;
        }

        public Criteria andWebUserIDNotEqualTo(Integer value) {
            addCriterion("WebUserID <>", value, "webUserID");
            return (Criteria) this;
        }

        public Criteria andWebUserIDGreaterThan(Integer value) {
            addCriterion("WebUserID >", value, "webUserID");
            return (Criteria) this;
        }

        public Criteria andWebUserIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("WebUserID >=", value, "webUserID");
            return (Criteria) this;
        }

        public Criteria andWebUserIDLessThan(Integer value) {
            addCriterion("WebUserID <", value, "webUserID");
            return (Criteria) this;
        }

        public Criteria andWebUserIDLessThanOrEqualTo(Integer value) {
            addCriterion("WebUserID <=", value, "webUserID");
            return (Criteria) this;
        }

        public Criteria andWebUserIDIn(List<Integer> values) {
            addCriterion("WebUserID in", values, "webUserID");
            return (Criteria) this;
        }

        public Criteria andWebUserIDNotIn(List<Integer> values) {
            addCriterion("WebUserID not in", values, "webUserID");
            return (Criteria) this;
        }

        public Criteria andWebUserIDBetween(Integer value1, Integer value2) {
            addCriterion("WebUserID between", value1, value2, "webUserID");
            return (Criteria) this;
        }

        public Criteria andWebUserIDNotBetween(Integer value1, Integer value2) {
            addCriterion("WebUserID not between", value1, value2, "webUserID");
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

        public Criteria andWebNameIsNull() {
            addCriterion("WebName is null");
            return (Criteria) this;
        }

        public Criteria andWebNameIsNotNull() {
            addCriterion("WebName is not null");
            return (Criteria) this;
        }

        public Criteria andWebNameEqualTo(String value) {
            addCriterion("WebName =", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameNotEqualTo(String value) {
            addCriterion("WebName <>", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameGreaterThan(String value) {
            addCriterion("WebName >", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameGreaterThanOrEqualTo(String value) {
            addCriterion("WebName >=", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameLessThan(String value) {
            addCriterion("WebName <", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameLessThanOrEqualTo(String value) {
            addCriterion("WebName <=", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameLike(String value) {
            addCriterion("WebName like", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameNotLike(String value) {
            addCriterion("WebName not like", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameIn(List<String> values) {
            addCriterion("WebName in", values, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameNotIn(List<String> values) {
            addCriterion("WebName not in", values, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameBetween(String value1, String value2) {
            addCriterion("WebName between", value1, value2, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameNotBetween(String value1, String value2) {
            addCriterion("WebName not between", value1, value2, "webName");
            return (Criteria) this;
        }

        public Criteria andSortCateIsNull() {
            addCriterion("SortCate is null");
            return (Criteria) this;
        }

        public Criteria andSortCateIsNotNull() {
            addCriterion("SortCate is not null");
            return (Criteria) this;
        }

        public Criteria andSortCateEqualTo(String value) {
            addCriterion("SortCate =", value, "sortCate");
            return (Criteria) this;
        }

        public Criteria andSortCateNotEqualTo(String value) {
            addCriterion("SortCate <>", value, "sortCate");
            return (Criteria) this;
        }

        public Criteria andSortCateGreaterThan(String value) {
            addCriterion("SortCate >", value, "sortCate");
            return (Criteria) this;
        }

        public Criteria andSortCateGreaterThanOrEqualTo(String value) {
            addCriterion("SortCate >=", value, "sortCate");
            return (Criteria) this;
        }

        public Criteria andSortCateLessThan(String value) {
            addCriterion("SortCate <", value, "sortCate");
            return (Criteria) this;
        }

        public Criteria andSortCateLessThanOrEqualTo(String value) {
            addCriterion("SortCate <=", value, "sortCate");
            return (Criteria) this;
        }

        public Criteria andSortCateLike(String value) {
            addCriterion("SortCate like", value, "sortCate");
            return (Criteria) this;
        }

        public Criteria andSortCateNotLike(String value) {
            addCriterion("SortCate not like", value, "sortCate");
            return (Criteria) this;
        }

        public Criteria andSortCateIn(List<String> values) {
            addCriterion("SortCate in", values, "sortCate");
            return (Criteria) this;
        }

        public Criteria andSortCateNotIn(List<String> values) {
            addCriterion("SortCate not in", values, "sortCate");
            return (Criteria) this;
        }

        public Criteria andSortCateBetween(String value1, String value2) {
            addCriterion("SortCate between", value1, value2, "sortCate");
            return (Criteria) this;
        }

        public Criteria andSortCateNotBetween(String value1, String value2) {
            addCriterion("SortCate not between", value1, value2, "sortCate");
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

        public Criteria andFilepathIsNull() {
            addCriterion("filepath is null");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNotNull() {
            addCriterion("filepath is not null");
            return (Criteria) this;
        }

        public Criteria andFilepathEqualTo(String value) {
            addCriterion("filepath =", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotEqualTo(String value) {
            addCriterion("filepath <>", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThan(String value) {
            addCriterion("filepath >", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThanOrEqualTo(String value) {
            addCriterion("filepath >=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThan(String value) {
            addCriterion("filepath <", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThanOrEqualTo(String value) {
            addCriterion("filepath <=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLike(String value) {
            addCriterion("filepath like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotLike(String value) {
            addCriterion("filepath not like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathIn(List<String> values) {
            addCriterion("filepath in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotIn(List<String> values) {
            addCriterion("filepath not in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathBetween(String value1, String value2) {
            addCriterion("filepath between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotBetween(String value1, String value2) {
            addCriterion("filepath not between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNull() {
            addCriterion("filesize is null");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNotNull() {
            addCriterion("filesize is not null");
            return (Criteria) this;
        }

        public Criteria andFilesizeEqualTo(String value) {
            addCriterion("filesize =", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotEqualTo(String value) {
            addCriterion("filesize <>", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThan(String value) {
            addCriterion("filesize >", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThanOrEqualTo(String value) {
            addCriterion("filesize >=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThan(String value) {
            addCriterion("filesize <", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThanOrEqualTo(String value) {
            addCriterion("filesize <=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLike(String value) {
            addCriterion("filesize like", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotLike(String value) {
            addCriterion("filesize not like", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeIn(List<String> values) {
            addCriterion("filesize in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotIn(List<String> values) {
            addCriterion("filesize not in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeBetween(String value1, String value2) {
            addCriterion("filesize between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotBetween(String value1, String value2) {
            addCriterion("filesize not between", value1, value2, "filesize");
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

        public Criteria andDownCountIsNull() {
            addCriterion("DownCount is null");
            return (Criteria) this;
        }

        public Criteria andDownCountIsNotNull() {
            addCriterion("DownCount is not null");
            return (Criteria) this;
        }

        public Criteria andDownCountEqualTo(Integer value) {
            addCriterion("DownCount =", value, "downCount");
            return (Criteria) this;
        }

        public Criteria andDownCountNotEqualTo(Integer value) {
            addCriterion("DownCount <>", value, "downCount");
            return (Criteria) this;
        }

        public Criteria andDownCountGreaterThan(Integer value) {
            addCriterion("DownCount >", value, "downCount");
            return (Criteria) this;
        }

        public Criteria andDownCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("DownCount >=", value, "downCount");
            return (Criteria) this;
        }

        public Criteria andDownCountLessThan(Integer value) {
            addCriterion("DownCount <", value, "downCount");
            return (Criteria) this;
        }

        public Criteria andDownCountLessThanOrEqualTo(Integer value) {
            addCriterion("DownCount <=", value, "downCount");
            return (Criteria) this;
        }

        public Criteria andDownCountIn(List<Integer> values) {
            addCriterion("DownCount in", values, "downCount");
            return (Criteria) this;
        }

        public Criteria andDownCountNotIn(List<Integer> values) {
            addCriterion("DownCount not in", values, "downCount");
            return (Criteria) this;
        }

        public Criteria andDownCountBetween(Integer value1, Integer value2) {
            addCriterion("DownCount between", value1, value2, "downCount");
            return (Criteria) this;
        }

        public Criteria andDownCountNotBetween(Integer value1, Integer value2) {
            addCriterion("DownCount not between", value1, value2, "downCount");
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

        public Criteria andNeedPointIsNull() {
            addCriterion("NeedPoint is null");
            return (Criteria) this;
        }

        public Criteria andNeedPointIsNotNull() {
            addCriterion("NeedPoint is not null");
            return (Criteria) this;
        }

        public Criteria andNeedPointEqualTo(Integer value) {
            addCriterion("NeedPoint =", value, "needPoint");
            return (Criteria) this;
        }

        public Criteria andNeedPointNotEqualTo(Integer value) {
            addCriterion("NeedPoint <>", value, "needPoint");
            return (Criteria) this;
        }

        public Criteria andNeedPointGreaterThan(Integer value) {
            addCriterion("NeedPoint >", value, "needPoint");
            return (Criteria) this;
        }

        public Criteria andNeedPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("NeedPoint >=", value, "needPoint");
            return (Criteria) this;
        }

        public Criteria andNeedPointLessThan(Integer value) {
            addCriterion("NeedPoint <", value, "needPoint");
            return (Criteria) this;
        }

        public Criteria andNeedPointLessThanOrEqualTo(Integer value) {
            addCriterion("NeedPoint <=", value, "needPoint");
            return (Criteria) this;
        }

        public Criteria andNeedPointIn(List<Integer> values) {
            addCriterion("NeedPoint in", values, "needPoint");
            return (Criteria) this;
        }

        public Criteria andNeedPointNotIn(List<Integer> values) {
            addCriterion("NeedPoint not in", values, "needPoint");
            return (Criteria) this;
        }

        public Criteria andNeedPointBetween(Integer value1, Integer value2) {
            addCriterion("NeedPoint between", value1, value2, "needPoint");
            return (Criteria) this;
        }

        public Criteria andNeedPointNotBetween(Integer value1, Integer value2) {
            addCriterion("NeedPoint not between", value1, value2, "needPoint");
            return (Criteria) this;
        }

        public Criteria andIsYCIsNull() {
            addCriterion("IsYC is null");
            return (Criteria) this;
        }

        public Criteria andIsYCIsNotNull() {
            addCriterion("IsYC is not null");
            return (Criteria) this;
        }

        public Criteria andIsYCEqualTo(Integer value) {
            addCriterion("IsYC =", value, "isYC");
            return (Criteria) this;
        }

        public Criteria andIsYCNotEqualTo(Integer value) {
            addCriterion("IsYC <>", value, "isYC");
            return (Criteria) this;
        }

        public Criteria andIsYCGreaterThan(Integer value) {
            addCriterion("IsYC >", value, "isYC");
            return (Criteria) this;
        }

        public Criteria andIsYCGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsYC >=", value, "isYC");
            return (Criteria) this;
        }

        public Criteria andIsYCLessThan(Integer value) {
            addCriterion("IsYC <", value, "isYC");
            return (Criteria) this;
        }

        public Criteria andIsYCLessThanOrEqualTo(Integer value) {
            addCriterion("IsYC <=", value, "isYC");
            return (Criteria) this;
        }

        public Criteria andIsYCIn(List<Integer> values) {
            addCriterion("IsYC in", values, "isYC");
            return (Criteria) this;
        }

        public Criteria andIsYCNotIn(List<Integer> values) {
            addCriterion("IsYC not in", values, "isYC");
            return (Criteria) this;
        }

        public Criteria andIsYCBetween(Integer value1, Integer value2) {
            addCriterion("IsYC between", value1, value2, "isYC");
            return (Criteria) this;
        }

        public Criteria andIsYCNotBetween(Integer value1, Integer value2) {
            addCriterion("IsYC not between", value1, value2, "isYC");
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

        public Criteria andIsSLIsNull() {
            addCriterion("IsSL is null");
            return (Criteria) this;
        }

        public Criteria andIsSLIsNotNull() {
            addCriterion("IsSL is not null");
            return (Criteria) this;
        }

        public Criteria andIsSLEqualTo(Integer value) {
            addCriterion("IsSL =", value, "isSL");
            return (Criteria) this;
        }

        public Criteria andIsSLNotEqualTo(Integer value) {
            addCriterion("IsSL <>", value, "isSL");
            return (Criteria) this;
        }

        public Criteria andIsSLGreaterThan(Integer value) {
            addCriterion("IsSL >", value, "isSL");
            return (Criteria) this;
        }

        public Criteria andIsSLGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsSL >=", value, "isSL");
            return (Criteria) this;
        }

        public Criteria andIsSLLessThan(Integer value) {
            addCriterion("IsSL <", value, "isSL");
            return (Criteria) this;
        }

        public Criteria andIsSLLessThanOrEqualTo(Integer value) {
            addCriterion("IsSL <=", value, "isSL");
            return (Criteria) this;
        }

        public Criteria andIsSLIn(List<Integer> values) {
            addCriterion("IsSL in", values, "isSL");
            return (Criteria) this;
        }

        public Criteria andIsSLNotIn(List<Integer> values) {
            addCriterion("IsSL not in", values, "isSL");
            return (Criteria) this;
        }

        public Criteria andIsSLBetween(Integer value1, Integer value2) {
            addCriterion("IsSL between", value1, value2, "isSL");
            return (Criteria) this;
        }

        public Criteria andIsSLNotBetween(Integer value1, Integer value2) {
            addCriterion("IsSL not between", value1, value2, "isSL");
            return (Criteria) this;
        }

        public Criteria andSLCateIsNull() {
            addCriterion("SLCate is null");
            return (Criteria) this;
        }

        public Criteria andSLCateIsNotNull() {
            addCriterion("SLCate is not null");
            return (Criteria) this;
        }

        public Criteria andSLCateEqualTo(String value) {
            addCriterion("SLCate =", value, "SLCate");
            return (Criteria) this;
        }

        public Criteria andSLCateNotEqualTo(String value) {
            addCriterion("SLCate <>", value, "SLCate");
            return (Criteria) this;
        }

        public Criteria andSLCateGreaterThan(String value) {
            addCriterion("SLCate >", value, "SLCate");
            return (Criteria) this;
        }

        public Criteria andSLCateGreaterThanOrEqualTo(String value) {
            addCriterion("SLCate >=", value, "SLCate");
            return (Criteria) this;
        }

        public Criteria andSLCateLessThan(String value) {
            addCriterion("SLCate <", value, "SLCate");
            return (Criteria) this;
        }

        public Criteria andSLCateLessThanOrEqualTo(String value) {
            addCriterion("SLCate <=", value, "SLCate");
            return (Criteria) this;
        }

        public Criteria andSLCateLike(String value) {
            addCriterion("SLCate like", value, "SLCate");
            return (Criteria) this;
        }

        public Criteria andSLCateNotLike(String value) {
            addCriterion("SLCate not like", value, "SLCate");
            return (Criteria) this;
        }

        public Criteria andSLCateIn(List<String> values) {
            addCriterion("SLCate in", values, "SLCate");
            return (Criteria) this;
        }

        public Criteria andSLCateNotIn(List<String> values) {
            addCriterion("SLCate not in", values, "SLCate");
            return (Criteria) this;
        }

        public Criteria andSLCateBetween(String value1, String value2) {
            addCriterion("SLCate between", value1, value2, "SLCate");
            return (Criteria) this;
        }

        public Criteria andSLCateNotBetween(String value1, String value2) {
            addCriterion("SLCate not between", value1, value2, "SLCate");
            return (Criteria) this;
        }

        public Criteria andOldFilepathIsNull() {
            addCriterion("OldFilepath is null");
            return (Criteria) this;
        }

        public Criteria andOldFilepathIsNotNull() {
            addCriterion("OldFilepath is not null");
            return (Criteria) this;
        }

        public Criteria andOldFilepathEqualTo(String value) {
            addCriterion("OldFilepath =", value, "oldFilepath");
            return (Criteria) this;
        }

        public Criteria andOldFilepathNotEqualTo(String value) {
            addCriterion("OldFilepath <>", value, "oldFilepath");
            return (Criteria) this;
        }

        public Criteria andOldFilepathGreaterThan(String value) {
            addCriterion("OldFilepath >", value, "oldFilepath");
            return (Criteria) this;
        }

        public Criteria andOldFilepathGreaterThanOrEqualTo(String value) {
            addCriterion("OldFilepath >=", value, "oldFilepath");
            return (Criteria) this;
        }

        public Criteria andOldFilepathLessThan(String value) {
            addCriterion("OldFilepath <", value, "oldFilepath");
            return (Criteria) this;
        }

        public Criteria andOldFilepathLessThanOrEqualTo(String value) {
            addCriterion("OldFilepath <=", value, "oldFilepath");
            return (Criteria) this;
        }

        public Criteria andOldFilepathLike(String value) {
            addCriterion("OldFilepath like", value, "oldFilepath");
            return (Criteria) this;
        }

        public Criteria andOldFilepathNotLike(String value) {
            addCriterion("OldFilepath not like", value, "oldFilepath");
            return (Criteria) this;
        }

        public Criteria andOldFilepathIn(List<String> values) {
            addCriterion("OldFilepath in", values, "oldFilepath");
            return (Criteria) this;
        }

        public Criteria andOldFilepathNotIn(List<String> values) {
            addCriterion("OldFilepath not in", values, "oldFilepath");
            return (Criteria) this;
        }

        public Criteria andOldFilepathBetween(String value1, String value2) {
            addCriterion("OldFilepath between", value1, value2, "oldFilepath");
            return (Criteria) this;
        }

        public Criteria andOldFilepathNotBetween(String value1, String value2) {
            addCriterion("OldFilepath not between", value1, value2, "oldFilepath");
            return (Criteria) this;
        }

        public Criteria andOldSortcateIsNull() {
            addCriterion("OldSortcate is null");
            return (Criteria) this;
        }

        public Criteria andOldSortcateIsNotNull() {
            addCriterion("OldSortcate is not null");
            return (Criteria) this;
        }

        public Criteria andOldSortcateEqualTo(String value) {
            addCriterion("OldSortcate =", value, "oldSortcate");
            return (Criteria) this;
        }

        public Criteria andOldSortcateNotEqualTo(String value) {
            addCriterion("OldSortcate <>", value, "oldSortcate");
            return (Criteria) this;
        }

        public Criteria andOldSortcateGreaterThan(String value) {
            addCriterion("OldSortcate >", value, "oldSortcate");
            return (Criteria) this;
        }

        public Criteria andOldSortcateGreaterThanOrEqualTo(String value) {
            addCriterion("OldSortcate >=", value, "oldSortcate");
            return (Criteria) this;
        }

        public Criteria andOldSortcateLessThan(String value) {
            addCriterion("OldSortcate <", value, "oldSortcate");
            return (Criteria) this;
        }

        public Criteria andOldSortcateLessThanOrEqualTo(String value) {
            addCriterion("OldSortcate <=", value, "oldSortcate");
            return (Criteria) this;
        }

        public Criteria andOldSortcateLike(String value) {
            addCriterion("OldSortcate like", value, "oldSortcate");
            return (Criteria) this;
        }

        public Criteria andOldSortcateNotLike(String value) {
            addCriterion("OldSortcate not like", value, "oldSortcate");
            return (Criteria) this;
        }

        public Criteria andOldSortcateIn(List<String> values) {
            addCriterion("OldSortcate in", values, "oldSortcate");
            return (Criteria) this;
        }

        public Criteria andOldSortcateNotIn(List<String> values) {
            addCriterion("OldSortcate not in", values, "oldSortcate");
            return (Criteria) this;
        }

        public Criteria andOldSortcateBetween(String value1, String value2) {
            addCriterion("OldSortcate between", value1, value2, "oldSortcate");
            return (Criteria) this;
        }

        public Criteria andOldSortcateNotBetween(String value1, String value2) {
            addCriterion("OldSortcate not between", value1, value2, "oldSortcate");
            return (Criteria) this;
        }

        public Criteria andFileimageIsNull() {
            addCriterion("Fileimage is null");
            return (Criteria) this;
        }

        public Criteria andFileimageIsNotNull() {
            addCriterion("Fileimage is not null");
            return (Criteria) this;
        }

        public Criteria andFileimageEqualTo(String value) {
            addCriterion("Fileimage =", value, "fileimage");
            return (Criteria) this;
        }

        public Criteria andFileimageNotEqualTo(String value) {
            addCriterion("Fileimage <>", value, "fileimage");
            return (Criteria) this;
        }

        public Criteria andFileimageGreaterThan(String value) {
            addCriterion("Fileimage >", value, "fileimage");
            return (Criteria) this;
        }

        public Criteria andFileimageGreaterThanOrEqualTo(String value) {
            addCriterion("Fileimage >=", value, "fileimage");
            return (Criteria) this;
        }

        public Criteria andFileimageLessThan(String value) {
            addCriterion("Fileimage <", value, "fileimage");
            return (Criteria) this;
        }

        public Criteria andFileimageLessThanOrEqualTo(String value) {
            addCriterion("Fileimage <=", value, "fileimage");
            return (Criteria) this;
        }

        public Criteria andFileimageLike(String value) {
            addCriterion("Fileimage like", value, "fileimage");
            return (Criteria) this;
        }

        public Criteria andFileimageNotLike(String value) {
            addCriterion("Fileimage not like", value, "fileimage");
            return (Criteria) this;
        }

        public Criteria andFileimageIn(List<String> values) {
            addCriterion("Fileimage in", values, "fileimage");
            return (Criteria) this;
        }

        public Criteria andFileimageNotIn(List<String> values) {
            addCriterion("Fileimage not in", values, "fileimage");
            return (Criteria) this;
        }

        public Criteria andFileimageBetween(String value1, String value2) {
            addCriterion("Fileimage between", value1, value2, "fileimage");
            return (Criteria) this;
        }

        public Criteria andFileimageNotBetween(String value1, String value2) {
            addCriterion("Fileimage not between", value1, value2, "fileimage");
            return (Criteria) this;
        }

        public Criteria andIsMagIsNull() {
            addCriterion("IsMag is null");
            return (Criteria) this;
        }

        public Criteria andIsMagIsNotNull() {
            addCriterion("IsMag is not null");
            return (Criteria) this;
        }

        public Criteria andIsMagEqualTo(Integer value) {
            addCriterion("IsMag =", value, "isMag");
            return (Criteria) this;
        }

        public Criteria andIsMagNotEqualTo(Integer value) {
            addCriterion("IsMag <>", value, "isMag");
            return (Criteria) this;
        }

        public Criteria andIsMagGreaterThan(Integer value) {
            addCriterion("IsMag >", value, "isMag");
            return (Criteria) this;
        }

        public Criteria andIsMagGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsMag >=", value, "isMag");
            return (Criteria) this;
        }

        public Criteria andIsMagLessThan(Integer value) {
            addCriterion("IsMag <", value, "isMag");
            return (Criteria) this;
        }

        public Criteria andIsMagLessThanOrEqualTo(Integer value) {
            addCriterion("IsMag <=", value, "isMag");
            return (Criteria) this;
        }

        public Criteria andIsMagIn(List<Integer> values) {
            addCriterion("IsMag in", values, "isMag");
            return (Criteria) this;
        }

        public Criteria andIsMagNotIn(List<Integer> values) {
            addCriterion("IsMag not in", values, "isMag");
            return (Criteria) this;
        }

        public Criteria andIsMagBetween(Integer value1, Integer value2) {
            addCriterion("IsMag between", value1, value2, "isMag");
            return (Criteria) this;
        }

        public Criteria andIsMagNotBetween(Integer value1, Integer value2) {
            addCriterion("IsMag not between", value1, value2, "isMag");
            return (Criteria) this;
        }

        public Criteria andMagCateIsNull() {
            addCriterion("MagCate is null");
            return (Criteria) this;
        }

        public Criteria andMagCateIsNotNull() {
            addCriterion("MagCate is not null");
            return (Criteria) this;
        }

        public Criteria andMagCateEqualTo(String value) {
            addCriterion("MagCate =", value, "magCate");
            return (Criteria) this;
        }

        public Criteria andMagCateNotEqualTo(String value) {
            addCriterion("MagCate <>", value, "magCate");
            return (Criteria) this;
        }

        public Criteria andMagCateGreaterThan(String value) {
            addCriterion("MagCate >", value, "magCate");
            return (Criteria) this;
        }

        public Criteria andMagCateGreaterThanOrEqualTo(String value) {
            addCriterion("MagCate >=", value, "magCate");
            return (Criteria) this;
        }

        public Criteria andMagCateLessThan(String value) {
            addCriterion("MagCate <", value, "magCate");
            return (Criteria) this;
        }

        public Criteria andMagCateLessThanOrEqualTo(String value) {
            addCriterion("MagCate <=", value, "magCate");
            return (Criteria) this;
        }

        public Criteria andMagCateLike(String value) {
            addCriterion("MagCate like", value, "magCate");
            return (Criteria) this;
        }

        public Criteria andMagCateNotLike(String value) {
            addCriterion("MagCate not like", value, "magCate");
            return (Criteria) this;
        }

        public Criteria andMagCateIn(List<String> values) {
            addCriterion("MagCate in", values, "magCate");
            return (Criteria) this;
        }

        public Criteria andMagCateNotIn(List<String> values) {
            addCriterion("MagCate not in", values, "magCate");
            return (Criteria) this;
        }

        public Criteria andMagCateBetween(String value1, String value2) {
            addCriterion("MagCate between", value1, value2, "magCate");
            return (Criteria) this;
        }

        public Criteria andMagCateNotBetween(String value1, String value2) {
            addCriterion("MagCate not between", value1, value2, "magCate");
            return (Criteria) this;
        }

        public Criteria andMagNumIsNull() {
            addCriterion("MagNum is null");
            return (Criteria) this;
        }

        public Criteria andMagNumIsNotNull() {
            addCriterion("MagNum is not null");
            return (Criteria) this;
        }

        public Criteria andMagNumEqualTo(String value) {
            addCriterion("MagNum =", value, "magNum");
            return (Criteria) this;
        }

        public Criteria andMagNumNotEqualTo(String value) {
            addCriterion("MagNum <>", value, "magNum");
            return (Criteria) this;
        }

        public Criteria andMagNumGreaterThan(String value) {
            addCriterion("MagNum >", value, "magNum");
            return (Criteria) this;
        }

        public Criteria andMagNumGreaterThanOrEqualTo(String value) {
            addCriterion("MagNum >=", value, "magNum");
            return (Criteria) this;
        }

        public Criteria andMagNumLessThan(String value) {
            addCriterion("MagNum <", value, "magNum");
            return (Criteria) this;
        }

        public Criteria andMagNumLessThanOrEqualTo(String value) {
            addCriterion("MagNum <=", value, "magNum");
            return (Criteria) this;
        }

        public Criteria andMagNumLike(String value) {
            addCriterion("MagNum like", value, "magNum");
            return (Criteria) this;
        }

        public Criteria andMagNumNotLike(String value) {
            addCriterion("MagNum not like", value, "magNum");
            return (Criteria) this;
        }

        public Criteria andMagNumIn(List<String> values) {
            addCriterion("MagNum in", values, "magNum");
            return (Criteria) this;
        }

        public Criteria andMagNumNotIn(List<String> values) {
            addCriterion("MagNum not in", values, "magNum");
            return (Criteria) this;
        }

        public Criteria andMagNumBetween(String value1, String value2) {
            addCriterion("MagNum between", value1, value2, "magNum");
            return (Criteria) this;
        }

        public Criteria andMagNumNotBetween(String value1, String value2) {
            addCriterion("MagNum not between", value1, value2, "magNum");
            return (Criteria) this;
        }

        public Criteria andIsxyIsNull() {
            addCriterion("Isxy is null");
            return (Criteria) this;
        }

        public Criteria andIsxyIsNotNull() {
            addCriterion("Isxy is not null");
            return (Criteria) this;
        }

        public Criteria andIsxyEqualTo(Integer value) {
            addCriterion("Isxy =", value, "isxy");
            return (Criteria) this;
        }

        public Criteria andIsxyNotEqualTo(Integer value) {
            addCriterion("Isxy <>", value, "isxy");
            return (Criteria) this;
        }

        public Criteria andIsxyGreaterThan(Integer value) {
            addCriterion("Isxy >", value, "isxy");
            return (Criteria) this;
        }

        public Criteria andIsxyGreaterThanOrEqualTo(Integer value) {
            addCriterion("Isxy >=", value, "isxy");
            return (Criteria) this;
        }

        public Criteria andIsxyLessThan(Integer value) {
            addCriterion("Isxy <", value, "isxy");
            return (Criteria) this;
        }

        public Criteria andIsxyLessThanOrEqualTo(Integer value) {
            addCriterion("Isxy <=", value, "isxy");
            return (Criteria) this;
        }

        public Criteria andIsxyIn(List<Integer> values) {
            addCriterion("Isxy in", values, "isxy");
            return (Criteria) this;
        }

        public Criteria andIsxyNotIn(List<Integer> values) {
            addCriterion("Isxy not in", values, "isxy");
            return (Criteria) this;
        }

        public Criteria andIsxyBetween(Integer value1, Integer value2) {
            addCriterion("Isxy between", value1, value2, "isxy");
            return (Criteria) this;
        }

        public Criteria andIsxyNotBetween(Integer value1, Integer value2) {
            addCriterion("Isxy not between", value1, value2, "isxy");
            return (Criteria) this;
        }

        public Criteria andXY_TagsIsNull() {
            addCriterion("XY_Tags is null");
            return (Criteria) this;
        }

        public Criteria andXY_TagsIsNotNull() {
            addCriterion("XY_Tags is not null");
            return (Criteria) this;
        }

        public Criteria andXY_TagsEqualTo(String value) {
            addCriterion("XY_Tags =", value, "XY_Tags");
            return (Criteria) this;
        }

        public Criteria andXY_TagsNotEqualTo(String value) {
            addCriterion("XY_Tags <>", value, "XY_Tags");
            return (Criteria) this;
        }

        public Criteria andXY_TagsGreaterThan(String value) {
            addCriterion("XY_Tags >", value, "XY_Tags");
            return (Criteria) this;
        }

        public Criteria andXY_TagsGreaterThanOrEqualTo(String value) {
            addCriterion("XY_Tags >=", value, "XY_Tags");
            return (Criteria) this;
        }

        public Criteria andXY_TagsLessThan(String value) {
            addCriterion("XY_Tags <", value, "XY_Tags");
            return (Criteria) this;
        }

        public Criteria andXY_TagsLessThanOrEqualTo(String value) {
            addCriterion("XY_Tags <=", value, "XY_Tags");
            return (Criteria) this;
        }

        public Criteria andXY_TagsLike(String value) {
            addCriterion("XY_Tags like", value, "XY_Tags");
            return (Criteria) this;
        }

        public Criteria andXY_TagsNotLike(String value) {
            addCriterion("XY_Tags not like", value, "XY_Tags");
            return (Criteria) this;
        }

        public Criteria andXY_TagsIn(List<String> values) {
            addCriterion("XY_Tags in", values, "XY_Tags");
            return (Criteria) this;
        }

        public Criteria andXY_TagsNotIn(List<String> values) {
            addCriterion("XY_Tags not in", values, "XY_Tags");
            return (Criteria) this;
        }

        public Criteria andXY_TagsBetween(String value1, String value2) {
            addCriterion("XY_Tags between", value1, value2, "XY_Tags");
            return (Criteria) this;
        }

        public Criteria andXY_TagsNotBetween(String value1, String value2) {
            addCriterion("XY_Tags not between", value1, value2, "XY_Tags");
            return (Criteria) this;
        }

        public Criteria andIsxy_keIsNull() {
            addCriterion("Isxy_ke is null");
            return (Criteria) this;
        }

        public Criteria andIsxy_keIsNotNull() {
            addCriterion("Isxy_ke is not null");
            return (Criteria) this;
        }

        public Criteria andIsxy_keEqualTo(Integer value) {
            addCriterion("Isxy_ke =", value, "isxy_ke");
            return (Criteria) this;
        }

        public Criteria andIsxy_keNotEqualTo(Integer value) {
            addCriterion("Isxy_ke <>", value, "isxy_ke");
            return (Criteria) this;
        }

        public Criteria andIsxy_keGreaterThan(Integer value) {
            addCriterion("Isxy_ke >", value, "isxy_ke");
            return (Criteria) this;
        }

        public Criteria andIsxy_keGreaterThanOrEqualTo(Integer value) {
            addCriterion("Isxy_ke >=", value, "isxy_ke");
            return (Criteria) this;
        }

        public Criteria andIsxy_keLessThan(Integer value) {
            addCriterion("Isxy_ke <", value, "isxy_ke");
            return (Criteria) this;
        }

        public Criteria andIsxy_keLessThanOrEqualTo(Integer value) {
            addCriterion("Isxy_ke <=", value, "isxy_ke");
            return (Criteria) this;
        }

        public Criteria andIsxy_keIn(List<Integer> values) {
            addCriterion("Isxy_ke in", values, "isxy_ke");
            return (Criteria) this;
        }

        public Criteria andIsxy_keNotIn(List<Integer> values) {
            addCriterion("Isxy_ke not in", values, "isxy_ke");
            return (Criteria) this;
        }

        public Criteria andIsxy_keBetween(Integer value1, Integer value2) {
            addCriterion("Isxy_ke between", value1, value2, "isxy_ke");
            return (Criteria) this;
        }

        public Criteria andIsxy_keNotBetween(Integer value1, Integer value2) {
            addCriterion("Isxy_ke not between", value1, value2, "isxy_ke");
            return (Criteria) this;
        }

        public Criteria andXY_KeidIsNull() {
            addCriterion("XY_Keid is null");
            return (Criteria) this;
        }

        public Criteria andXY_KeidIsNotNull() {
            addCriterion("XY_Keid is not null");
            return (Criteria) this;
        }

        public Criteria andXY_KeidEqualTo(String value) {
            addCriterion("XY_Keid =", value, "XY_Keid");
            return (Criteria) this;
        }

        public Criteria andXY_KeidNotEqualTo(String value) {
            addCriterion("XY_Keid <>", value, "XY_Keid");
            return (Criteria) this;
        }

        public Criteria andXY_KeidGreaterThan(String value) {
            addCriterion("XY_Keid >", value, "XY_Keid");
            return (Criteria) this;
        }

        public Criteria andXY_KeidGreaterThanOrEqualTo(String value) {
            addCriterion("XY_Keid >=", value, "XY_Keid");
            return (Criteria) this;
        }

        public Criteria andXY_KeidLessThan(String value) {
            addCriterion("XY_Keid <", value, "XY_Keid");
            return (Criteria) this;
        }

        public Criteria andXY_KeidLessThanOrEqualTo(String value) {
            addCriterion("XY_Keid <=", value, "XY_Keid");
            return (Criteria) this;
        }

        public Criteria andXY_KeidLike(String value) {
            addCriterion("XY_Keid like", value, "XY_Keid");
            return (Criteria) this;
        }

        public Criteria andXY_KeidNotLike(String value) {
            addCriterion("XY_Keid not like", value, "XY_Keid");
            return (Criteria) this;
        }

        public Criteria andXY_KeidIn(List<String> values) {
            addCriterion("XY_Keid in", values, "XY_Keid");
            return (Criteria) this;
        }

        public Criteria andXY_KeidNotIn(List<String> values) {
            addCriterion("XY_Keid not in", values, "XY_Keid");
            return (Criteria) this;
        }

        public Criteria andXY_KeidBetween(String value1, String value2) {
            addCriterion("XY_Keid between", value1, value2, "XY_Keid");
            return (Criteria) this;
        }

        public Criteria andXY_KeidNotBetween(String value1, String value2) {
            addCriterion("XY_Keid not between", value1, value2, "XY_Keid");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andGoodnameIsNull() {
            addCriterion("goodname is null");
            return (Criteria) this;
        }

        public Criteria andGoodnameIsNotNull() {
            addCriterion("goodname is not null");
            return (Criteria) this;
        }

        public Criteria andGoodnameEqualTo(String value) {
            addCriterion("goodname =", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotEqualTo(String value) {
            addCriterion("goodname <>", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameGreaterThan(String value) {
            addCriterion("goodname >", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodname >=", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLessThan(String value) {
            addCriterion("goodname <", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLessThanOrEqualTo(String value) {
            addCriterion("goodname <=", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLike(String value) {
            addCriterion("goodname like", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotLike(String value) {
            addCriterion("goodname not like", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameIn(List<String> values) {
            addCriterion("goodname in", values, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotIn(List<String> values) {
            addCriterion("goodname not in", values, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameBetween(String value1, String value2) {
            addCriterion("goodname between", value1, value2, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotBetween(String value1, String value2) {
            addCriterion("goodname not between", value1, value2, "goodname");
            return (Criteria) this;
        }

        public Criteria andDownclickIsNull() {
            addCriterion("downclick is null");
            return (Criteria) this;
        }

        public Criteria andDownclickIsNotNull() {
            addCriterion("downclick is not null");
            return (Criteria) this;
        }

        public Criteria andDownclickEqualTo(Integer value) {
            addCriterion("downclick =", value, "downclick");
            return (Criteria) this;
        }

        public Criteria andDownclickNotEqualTo(Integer value) {
            addCriterion("downclick <>", value, "downclick");
            return (Criteria) this;
        }

        public Criteria andDownclickGreaterThan(Integer value) {
            addCriterion("downclick >", value, "downclick");
            return (Criteria) this;
        }

        public Criteria andDownclickGreaterThanOrEqualTo(Integer value) {
            addCriterion("downclick >=", value, "downclick");
            return (Criteria) this;
        }

        public Criteria andDownclickLessThan(Integer value) {
            addCriterion("downclick <", value, "downclick");
            return (Criteria) this;
        }

        public Criteria andDownclickLessThanOrEqualTo(Integer value) {
            addCriterion("downclick <=", value, "downclick");
            return (Criteria) this;
        }

        public Criteria andDownclickIn(List<Integer> values) {
            addCriterion("downclick in", values, "downclick");
            return (Criteria) this;
        }

        public Criteria andDownclickNotIn(List<Integer> values) {
            addCriterion("downclick not in", values, "downclick");
            return (Criteria) this;
        }

        public Criteria andDownclickBetween(Integer value1, Integer value2) {
            addCriterion("downclick between", value1, value2, "downclick");
            return (Criteria) this;
        }

        public Criteria andDownclickNotBetween(Integer value1, Integer value2) {
            addCriterion("downclick not between", value1, value2, "downclick");
            return (Criteria) this;
        }

        public Criteria andIsvideoIsNull() {
            addCriterion("isvideo is null");
            return (Criteria) this;
        }

        public Criteria andIsvideoIsNotNull() {
            addCriterion("isvideo is not null");
            return (Criteria) this;
        }

        public Criteria andIsvideoEqualTo(Integer value) {
            addCriterion("isvideo =", value, "isvideo");
            return (Criteria) this;
        }

        public Criteria andIsvideoNotEqualTo(Integer value) {
            addCriterion("isvideo <>", value, "isvideo");
            return (Criteria) this;
        }

        public Criteria andIsvideoGreaterThan(Integer value) {
            addCriterion("isvideo >", value, "isvideo");
            return (Criteria) this;
        }

        public Criteria andIsvideoGreaterThanOrEqualTo(Integer value) {
            addCriterion("isvideo >=", value, "isvideo");
            return (Criteria) this;
        }

        public Criteria andIsvideoLessThan(Integer value) {
            addCriterion("isvideo <", value, "isvideo");
            return (Criteria) this;
        }

        public Criteria andIsvideoLessThanOrEqualTo(Integer value) {
            addCriterion("isvideo <=", value, "isvideo");
            return (Criteria) this;
        }

        public Criteria andIsvideoIn(List<Integer> values) {
            addCriterion("isvideo in", values, "isvideo");
            return (Criteria) this;
        }

        public Criteria andIsvideoNotIn(List<Integer> values) {
            addCriterion("isvideo not in", values, "isvideo");
            return (Criteria) this;
        }

        public Criteria andIsvideoBetween(Integer value1, Integer value2) {
            addCriterion("isvideo between", value1, value2, "isvideo");
            return (Criteria) this;
        }

        public Criteria andIsvideoNotBetween(Integer value1, Integer value2) {
            addCriterion("isvideo not between", value1, value2, "isvideo");
            return (Criteria) this;
        }

        public Criteria andVideourlIsNull() {
            addCriterion("videourl is null");
            return (Criteria) this;
        }

        public Criteria andVideourlIsNotNull() {
            addCriterion("videourl is not null");
            return (Criteria) this;
        }

        public Criteria andVideourlEqualTo(String value) {
            addCriterion("videourl =", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotEqualTo(String value) {
            addCriterion("videourl <>", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlGreaterThan(String value) {
            addCriterion("videourl >", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlGreaterThanOrEqualTo(String value) {
            addCriterion("videourl >=", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlLessThan(String value) {
            addCriterion("videourl <", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlLessThanOrEqualTo(String value) {
            addCriterion("videourl <=", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlLike(String value) {
            addCriterion("videourl like", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotLike(String value) {
            addCriterion("videourl not like", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlIn(List<String> values) {
            addCriterion("videourl in", values, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotIn(List<String> values) {
            addCriterion("videourl not in", values, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlBetween(String value1, String value2) {
            addCriterion("videourl between", value1, value2, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotBetween(String value1, String value2) {
            addCriterion("videourl not between", value1, value2, "videourl");
            return (Criteria) this;
        }

        public Criteria andEvalIsNull() {
            addCriterion("eval is null");
            return (Criteria) this;
        }

        public Criteria andEvalIsNotNull() {
            addCriterion("eval is not null");
            return (Criteria) this;
        }

        public Criteria andEvalEqualTo(BigDecimal value) {
            addCriterion("eval =", value, "eval");
            return (Criteria) this;
        }

        public Criteria andEvalNotEqualTo(BigDecimal value) {
            addCriterion("eval <>", value, "eval");
            return (Criteria) this;
        }

        public Criteria andEvalGreaterThan(BigDecimal value) {
            addCriterion("eval >", value, "eval");
            return (Criteria) this;
        }

        public Criteria andEvalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("eval >=", value, "eval");
            return (Criteria) this;
        }

        public Criteria andEvalLessThan(BigDecimal value) {
            addCriterion("eval <", value, "eval");
            return (Criteria) this;
        }

        public Criteria andEvalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("eval <=", value, "eval");
            return (Criteria) this;
        }

        public Criteria andEvalIn(List<BigDecimal> values) {
            addCriterion("eval in", values, "eval");
            return (Criteria) this;
        }

        public Criteria andEvalNotIn(List<BigDecimal> values) {
            addCriterion("eval not in", values, "eval");
            return (Criteria) this;
        }

        public Criteria andEvalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("eval between", value1, value2, "eval");
            return (Criteria) this;
        }

        public Criteria andEvalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("eval not between", value1, value2, "eval");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNull() {
            addCriterion("teacherid is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNotNull() {
            addCriterion("teacherid is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridEqualTo(Integer value) {
            addCriterion("teacherid =", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotEqualTo(Integer value) {
            addCriterion("teacherid <>", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThan(Integer value) {
            addCriterion("teacherid >", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacherid >=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThan(Integer value) {
            addCriterion("teacherid <", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThanOrEqualTo(Integer value) {
            addCriterion("teacherid <=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIn(List<Integer> values) {
            addCriterion("teacherid in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotIn(List<Integer> values) {
            addCriterion("teacherid not in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridBetween(Integer value1, Integer value2) {
            addCriterion("teacherid between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotBetween(Integer value1, Integer value2) {
            addCriterion("teacherid not between", value1, value2, "teacherid");
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