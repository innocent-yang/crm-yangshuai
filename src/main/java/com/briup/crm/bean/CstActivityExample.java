package com.briup.crm.bean;

import java.util.ArrayList;
import java.util.List;

public class CstActivityExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cst_activity
     *
     * @mbg.generated Tue Jan 07 16:47:07 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cst_activity
     *
     * @mbg.generated Tue Jan 07 16:47:07 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cst_activity
     *
     * @mbg.generated Tue Jan 07 16:47:07 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_activity
     *
     * @mbg.generated Tue Jan 07 16:47:07 CST 2020
     */
    public CstActivityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_activity
     *
     * @mbg.generated Tue Jan 07 16:47:07 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_activity
     *
     * @mbg.generated Tue Jan 07 16:47:07 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_activity
     *
     * @mbg.generated Tue Jan 07 16:47:07 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_activity
     *
     * @mbg.generated Tue Jan 07 16:47:07 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_activity
     *
     * @mbg.generated Tue Jan 07 16:47:07 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_activity
     *
     * @mbg.generated Tue Jan 07 16:47:07 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_activity
     *
     * @mbg.generated Tue Jan 07 16:47:07 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_activity
     *
     * @mbg.generated Tue Jan 07 16:47:07 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_activity
     *
     * @mbg.generated Tue Jan 07 16:47:07 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_activity
     *
     * @mbg.generated Tue Jan 07 16:47:07 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cst_activity
     *
     * @mbg.generated Tue Jan 07 16:47:07 CST 2020
     */
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

        public Criteria andAtvIdIsNull() {
            addCriterion("atv_id is null");
            return (Criteria) this;
        }

        public Criteria andAtvIdIsNotNull() {
            addCriterion("atv_id is not null");
            return (Criteria) this;
        }

        public Criteria andAtvIdEqualTo(Long value) {
            addCriterion("atv_id =", value, "atvId");
            return (Criteria) this;
        }

        public Criteria andAtvIdNotEqualTo(Long value) {
            addCriterion("atv_id <>", value, "atvId");
            return (Criteria) this;
        }

        public Criteria andAtvIdGreaterThan(Long value) {
            addCriterion("atv_id >", value, "atvId");
            return (Criteria) this;
        }

        public Criteria andAtvIdGreaterThanOrEqualTo(Long value) {
            addCriterion("atv_id >=", value, "atvId");
            return (Criteria) this;
        }

        public Criteria andAtvIdLessThan(Long value) {
            addCriterion("atv_id <", value, "atvId");
            return (Criteria) this;
        }

        public Criteria andAtvIdLessThanOrEqualTo(Long value) {
            addCriterion("atv_id <=", value, "atvId");
            return (Criteria) this;
        }

        public Criteria andAtvIdIn(List<Long> values) {
            addCriterion("atv_id in", values, "atvId");
            return (Criteria) this;
        }

        public Criteria andAtvIdNotIn(List<Long> values) {
            addCriterion("atv_id not in", values, "atvId");
            return (Criteria) this;
        }

        public Criteria andAtvIdBetween(Long value1, Long value2) {
            addCriterion("atv_id between", value1, value2, "atvId");
            return (Criteria) this;
        }

        public Criteria andAtvIdNotBetween(Long value1, Long value2) {
            addCriterion("atv_id not between", value1, value2, "atvId");
            return (Criteria) this;
        }

        public Criteria andAtvCustNameIsNull() {
            addCriterion("atv_cust_name is null");
            return (Criteria) this;
        }

        public Criteria andAtvCustNameIsNotNull() {
            addCriterion("atv_cust_name is not null");
            return (Criteria) this;
        }

        public Criteria andAtvCustNameEqualTo(String value) {
            addCriterion("atv_cust_name =", value, "atvCustName");
            return (Criteria) this;
        }

        public Criteria andAtvCustNameNotEqualTo(String value) {
            addCriterion("atv_cust_name <>", value, "atvCustName");
            return (Criteria) this;
        }

        public Criteria andAtvCustNameGreaterThan(String value) {
            addCriterion("atv_cust_name >", value, "atvCustName");
            return (Criteria) this;
        }

        public Criteria andAtvCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("atv_cust_name >=", value, "atvCustName");
            return (Criteria) this;
        }

        public Criteria andAtvCustNameLessThan(String value) {
            addCriterion("atv_cust_name <", value, "atvCustName");
            return (Criteria) this;
        }

        public Criteria andAtvCustNameLessThanOrEqualTo(String value) {
            addCriterion("atv_cust_name <=", value, "atvCustName");
            return (Criteria) this;
        }

        public Criteria andAtvCustNameLike(String value) {
            addCriterion("atv_cust_name like", value, "atvCustName");
            return (Criteria) this;
        }

        public Criteria andAtvCustNameNotLike(String value) {
            addCriterion("atv_cust_name not like", value, "atvCustName");
            return (Criteria) this;
        }

        public Criteria andAtvCustNameIn(List<String> values) {
            addCriterion("atv_cust_name in", values, "atvCustName");
            return (Criteria) this;
        }

        public Criteria andAtvCustNameNotIn(List<String> values) {
            addCriterion("atv_cust_name not in", values, "atvCustName");
            return (Criteria) this;
        }

        public Criteria andAtvCustNameBetween(String value1, String value2) {
            addCriterion("atv_cust_name between", value1, value2, "atvCustName");
            return (Criteria) this;
        }

        public Criteria andAtvCustNameNotBetween(String value1, String value2) {
            addCriterion("atv_cust_name not between", value1, value2, "atvCustName");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceIsNull() {
            addCriterion("atv_place is null");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceIsNotNull() {
            addCriterion("atv_place is not null");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceEqualTo(String value) {
            addCriterion("atv_place =", value, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceNotEqualTo(String value) {
            addCriterion("atv_place <>", value, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceGreaterThan(String value) {
            addCriterion("atv_place >", value, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("atv_place >=", value, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceLessThan(String value) {
            addCriterion("atv_place <", value, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceLessThanOrEqualTo(String value) {
            addCriterion("atv_place <=", value, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceLike(String value) {
            addCriterion("atv_place like", value, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceNotLike(String value) {
            addCriterion("atv_place not like", value, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceIn(List<String> values) {
            addCriterion("atv_place in", values, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceNotIn(List<String> values) {
            addCriterion("atv_place not in", values, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceBetween(String value1, String value2) {
            addCriterion("atv_place between", value1, value2, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceNotBetween(String value1, String value2) {
            addCriterion("atv_place not between", value1, value2, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvTitleIsNull() {
            addCriterion("atv_title is null");
            return (Criteria) this;
        }

        public Criteria andAtvTitleIsNotNull() {
            addCriterion("atv_title is not null");
            return (Criteria) this;
        }

        public Criteria andAtvTitleEqualTo(String value) {
            addCriterion("atv_title =", value, "atvTitle");
            return (Criteria) this;
        }

        public Criteria andAtvTitleNotEqualTo(String value) {
            addCriterion("atv_title <>", value, "atvTitle");
            return (Criteria) this;
        }

        public Criteria andAtvTitleGreaterThan(String value) {
            addCriterion("atv_title >", value, "atvTitle");
            return (Criteria) this;
        }

        public Criteria andAtvTitleGreaterThanOrEqualTo(String value) {
            addCriterion("atv_title >=", value, "atvTitle");
            return (Criteria) this;
        }

        public Criteria andAtvTitleLessThan(String value) {
            addCriterion("atv_title <", value, "atvTitle");
            return (Criteria) this;
        }

        public Criteria andAtvTitleLessThanOrEqualTo(String value) {
            addCriterion("atv_title <=", value, "atvTitle");
            return (Criteria) this;
        }

        public Criteria andAtvTitleLike(String value) {
            addCriterion("atv_title like", value, "atvTitle");
            return (Criteria) this;
        }

        public Criteria andAtvTitleNotLike(String value) {
            addCriterion("atv_title not like", value, "atvTitle");
            return (Criteria) this;
        }

        public Criteria andAtvTitleIn(List<String> values) {
            addCriterion("atv_title in", values, "atvTitle");
            return (Criteria) this;
        }

        public Criteria andAtvTitleNotIn(List<String> values) {
            addCriterion("atv_title not in", values, "atvTitle");
            return (Criteria) this;
        }

        public Criteria andAtvTitleBetween(String value1, String value2) {
            addCriterion("atv_title between", value1, value2, "atvTitle");
            return (Criteria) this;
        }

        public Criteria andAtvTitleNotBetween(String value1, String value2) {
            addCriterion("atv_title not between", value1, value2, "atvTitle");
            return (Criteria) this;
        }

        public Criteria andAtvMemoIsNull() {
            addCriterion("atv_memo is null");
            return (Criteria) this;
        }

        public Criteria andAtvMemoIsNotNull() {
            addCriterion("atv_memo is not null");
            return (Criteria) this;
        }

        public Criteria andAtvMemoEqualTo(String value) {
            addCriterion("atv_memo =", value, "atvMemo");
            return (Criteria) this;
        }

        public Criteria andAtvMemoNotEqualTo(String value) {
            addCriterion("atv_memo <>", value, "atvMemo");
            return (Criteria) this;
        }

        public Criteria andAtvMemoGreaterThan(String value) {
            addCriterion("atv_memo >", value, "atvMemo");
            return (Criteria) this;
        }

        public Criteria andAtvMemoGreaterThanOrEqualTo(String value) {
            addCriterion("atv_memo >=", value, "atvMemo");
            return (Criteria) this;
        }

        public Criteria andAtvMemoLessThan(String value) {
            addCriterion("atv_memo <", value, "atvMemo");
            return (Criteria) this;
        }

        public Criteria andAtvMemoLessThanOrEqualTo(String value) {
            addCriterion("atv_memo <=", value, "atvMemo");
            return (Criteria) this;
        }

        public Criteria andAtvMemoLike(String value) {
            addCriterion("atv_memo like", value, "atvMemo");
            return (Criteria) this;
        }

        public Criteria andAtvMemoNotLike(String value) {
            addCriterion("atv_memo not like", value, "atvMemo");
            return (Criteria) this;
        }

        public Criteria andAtvMemoIn(List<String> values) {
            addCriterion("atv_memo in", values, "atvMemo");
            return (Criteria) this;
        }

        public Criteria andAtvMemoNotIn(List<String> values) {
            addCriterion("atv_memo not in", values, "atvMemo");
            return (Criteria) this;
        }

        public Criteria andAtvMemoBetween(String value1, String value2) {
            addCriterion("atv_memo between", value1, value2, "atvMemo");
            return (Criteria) this;
        }

        public Criteria andAtvMemoNotBetween(String value1, String value2) {
            addCriterion("atv_memo not between", value1, value2, "atvMemo");
            return (Criteria) this;
        }

        public Criteria andAtvCustIdIsNull() {
            addCriterion("atv_cust_id is null");
            return (Criteria) this;
        }

        public Criteria andAtvCustIdIsNotNull() {
            addCriterion("atv_cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andAtvCustIdEqualTo(Long value) {
            addCriterion("atv_cust_id =", value, "atvCustId");
            return (Criteria) this;
        }

        public Criteria andAtvCustIdNotEqualTo(Long value) {
            addCriterion("atv_cust_id <>", value, "atvCustId");
            return (Criteria) this;
        }

        public Criteria andAtvCustIdGreaterThan(Long value) {
            addCriterion("atv_cust_id >", value, "atvCustId");
            return (Criteria) this;
        }

        public Criteria andAtvCustIdGreaterThanOrEqualTo(Long value) {
            addCriterion("atv_cust_id >=", value, "atvCustId");
            return (Criteria) this;
        }

        public Criteria andAtvCustIdLessThan(Long value) {
            addCriterion("atv_cust_id <", value, "atvCustId");
            return (Criteria) this;
        }

        public Criteria andAtvCustIdLessThanOrEqualTo(Long value) {
            addCriterion("atv_cust_id <=", value, "atvCustId");
            return (Criteria) this;
        }

        public Criteria andAtvCustIdIn(List<Long> values) {
            addCriterion("atv_cust_id in", values, "atvCustId");
            return (Criteria) this;
        }

        public Criteria andAtvCustIdNotIn(List<Long> values) {
            addCriterion("atv_cust_id not in", values, "atvCustId");
            return (Criteria) this;
        }

        public Criteria andAtvCustIdBetween(Long value1, Long value2) {
            addCriterion("atv_cust_id between", value1, value2, "atvCustId");
            return (Criteria) this;
        }

        public Criteria andAtvCustIdNotBetween(Long value1, Long value2) {
            addCriterion("atv_cust_id not between", value1, value2, "atvCustId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cst_activity
     *
     * @mbg.generated do_not_delete_during_merge Tue Jan 07 16:47:07 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cst_activity
     *
     * @mbg.generated Tue Jan 07 16:47:07 CST 2020
     */
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