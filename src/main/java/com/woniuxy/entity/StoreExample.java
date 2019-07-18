package com.woniuxy.entity;

import java.util.ArrayList;
import java.util.List;

public class StoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreExample() {
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

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(String value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(String value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(String value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(String value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(String value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(String value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLike(String value) {
            addCriterion("store_id like", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotLike(String value) {
            addCriterion("store_id not like", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<String> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<String> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(String value1, String value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(String value1, String value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStorePhoneIsNull() {
            addCriterion("store_phone is null");
            return (Criteria) this;
        }

        public Criteria andStorePhoneIsNotNull() {
            addCriterion("store_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStorePhoneEqualTo(String value) {
            addCriterion("store_phone =", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotEqualTo(String value) {
            addCriterion("store_phone <>", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneGreaterThan(String value) {
            addCriterion("store_phone >", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("store_phone >=", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneLessThan(String value) {
            addCriterion("store_phone <", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneLessThanOrEqualTo(String value) {
            addCriterion("store_phone <=", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneLike(String value) {
            addCriterion("store_phone like", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotLike(String value) {
            addCriterion("store_phone not like", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneIn(List<String> values) {
            addCriterion("store_phone in", values, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotIn(List<String> values) {
            addCriterion("store_phone not in", values, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneBetween(String value1, String value2) {
            addCriterion("store_phone between", value1, value2, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotBetween(String value1, String value2) {
            addCriterion("store_phone not between", value1, value2, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStoreIsdeleteIsNull() {
            addCriterion("store_isdelete is null");
            return (Criteria) this;
        }

        public Criteria andStoreIsdeleteIsNotNull() {
            addCriterion("store_isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIsdeleteEqualTo(Boolean value) {
            addCriterion("store_isdelete =", value, "storeIsdelete");
            return (Criteria) this;
        }

        public Criteria andStoreIsdeleteNotEqualTo(Boolean value) {
            addCriterion("store_isdelete <>", value, "storeIsdelete");
            return (Criteria) this;
        }

        public Criteria andStoreIsdeleteGreaterThan(Boolean value) {
            addCriterion("store_isdelete >", value, "storeIsdelete");
            return (Criteria) this;
        }

        public Criteria andStoreIsdeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("store_isdelete >=", value, "storeIsdelete");
            return (Criteria) this;
        }

        public Criteria andStoreIsdeleteLessThan(Boolean value) {
            addCriterion("store_isdelete <", value, "storeIsdelete");
            return (Criteria) this;
        }

        public Criteria andStoreIsdeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("store_isdelete <=", value, "storeIsdelete");
            return (Criteria) this;
        }

        public Criteria andStoreIsdeleteIn(List<Boolean> values) {
            addCriterion("store_isdelete in", values, "storeIsdelete");
            return (Criteria) this;
        }

        public Criteria andStoreIsdeleteNotIn(List<Boolean> values) {
            addCriterion("store_isdelete not in", values, "storeIsdelete");
            return (Criteria) this;
        }

        public Criteria andStoreIsdeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("store_isdelete between", value1, value2, "storeIsdelete");
            return (Criteria) this;
        }

        public Criteria andStoreIsdeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("store_isdelete not between", value1, value2, "storeIsdelete");
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