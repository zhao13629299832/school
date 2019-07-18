package com.woniuxy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserOrderExample() {
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

        public Criteria andUserOrderIdIsNull() {
            addCriterion("user_order_id is null");
            return (Criteria) this;
        }

        public Criteria andUserOrderIdIsNotNull() {
            addCriterion("user_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserOrderIdEqualTo(String value) {
            addCriterion("user_order_id =", value, "userOrderId");
            return (Criteria) this;
        }

        public Criteria andUserOrderIdNotEqualTo(String value) {
            addCriterion("user_order_id <>", value, "userOrderId");
            return (Criteria) this;
        }

        public Criteria andUserOrderIdGreaterThan(String value) {
            addCriterion("user_order_id >", value, "userOrderId");
            return (Criteria) this;
        }

        public Criteria andUserOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_order_id >=", value, "userOrderId");
            return (Criteria) this;
        }

        public Criteria andUserOrderIdLessThan(String value) {
            addCriterion("user_order_id <", value, "userOrderId");
            return (Criteria) this;
        }

        public Criteria andUserOrderIdLessThanOrEqualTo(String value) {
            addCriterion("user_order_id <=", value, "userOrderId");
            return (Criteria) this;
        }

        public Criteria andUserOrderIdLike(String value) {
            addCriterion("user_order_id like", value, "userOrderId");
            return (Criteria) this;
        }

        public Criteria andUserOrderIdNotLike(String value) {
            addCriterion("user_order_id not like", value, "userOrderId");
            return (Criteria) this;
        }

        public Criteria andUserOrderIdIn(List<String> values) {
            addCriterion("user_order_id in", values, "userOrderId");
            return (Criteria) this;
        }

        public Criteria andUserOrderIdNotIn(List<String> values) {
            addCriterion("user_order_id not in", values, "userOrderId");
            return (Criteria) this;
        }

        public Criteria andUserOrderIdBetween(String value1, String value2) {
            addCriterion("user_order_id between", value1, value2, "userOrderId");
            return (Criteria) this;
        }

        public Criteria andUserOrderIdNotBetween(String value1, String value2) {
            addCriterion("user_order_id not between", value1, value2, "userOrderId");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdIsNull() {
            addCriterion("user_address_id is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdIsNotNull() {
            addCriterion("user_address_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdEqualTo(String value) {
            addCriterion("user_address_id =", value, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdNotEqualTo(String value) {
            addCriterion("user_address_id <>", value, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdGreaterThan(String value) {
            addCriterion("user_address_id >", value, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_address_id >=", value, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdLessThan(String value) {
            addCriterion("user_address_id <", value, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdLessThanOrEqualTo(String value) {
            addCriterion("user_address_id <=", value, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdLike(String value) {
            addCriterion("user_address_id like", value, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdNotLike(String value) {
            addCriterion("user_address_id not like", value, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdIn(List<String> values) {
            addCriterion("user_address_id in", values, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdNotIn(List<String> values) {
            addCriterion("user_address_id not in", values, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdBetween(String value1, String value2) {
            addCriterion("user_address_id between", value1, value2, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdNotBetween(String value1, String value2) {
            addCriterion("user_address_id not between", value1, value2, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserOrderStateIsNull() {
            addCriterion("user_order_state is null");
            return (Criteria) this;
        }

        public Criteria andUserOrderStateIsNotNull() {
            addCriterion("user_order_state is not null");
            return (Criteria) this;
        }

        public Criteria andUserOrderStateEqualTo(Integer value) {
            addCriterion("user_order_state =", value, "userOrderState");
            return (Criteria) this;
        }

        public Criteria andUserOrderStateNotEqualTo(Integer value) {
            addCriterion("user_order_state <>", value, "userOrderState");
            return (Criteria) this;
        }

        public Criteria andUserOrderStateGreaterThan(Integer value) {
            addCriterion("user_order_state >", value, "userOrderState");
            return (Criteria) this;
        }

        public Criteria andUserOrderStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_order_state >=", value, "userOrderState");
            return (Criteria) this;
        }

        public Criteria andUserOrderStateLessThan(Integer value) {
            addCriterion("user_order_state <", value, "userOrderState");
            return (Criteria) this;
        }

        public Criteria andUserOrderStateLessThanOrEqualTo(Integer value) {
            addCriterion("user_order_state <=", value, "userOrderState");
            return (Criteria) this;
        }

        public Criteria andUserOrderStateIn(List<Integer> values) {
            addCriterion("user_order_state in", values, "userOrderState");
            return (Criteria) this;
        }

        public Criteria andUserOrderStateNotIn(List<Integer> values) {
            addCriterion("user_order_state not in", values, "userOrderState");
            return (Criteria) this;
        }

        public Criteria andUserOrderStateBetween(Integer value1, Integer value2) {
            addCriterion("user_order_state between", value1, value2, "userOrderState");
            return (Criteria) this;
        }

        public Criteria andUserOrderStateNotBetween(Integer value1, Integer value2) {
            addCriterion("user_order_state not between", value1, value2, "userOrderState");
            return (Criteria) this;
        }

        public Criteria andUserOrderCreatertimeIsNull() {
            addCriterion("user_order_creatertime is null");
            return (Criteria) this;
        }

        public Criteria andUserOrderCreatertimeIsNotNull() {
            addCriterion("user_order_creatertime is not null");
            return (Criteria) this;
        }

        public Criteria andUserOrderCreatertimeEqualTo(Date value) {
            addCriterion("user_order_creatertime =", value, "userOrderCreatertime");
            return (Criteria) this;
        }

        public Criteria andUserOrderCreatertimeNotEqualTo(Date value) {
            addCriterion("user_order_creatertime <>", value, "userOrderCreatertime");
            return (Criteria) this;
        }

        public Criteria andUserOrderCreatertimeGreaterThan(Date value) {
            addCriterion("user_order_creatertime >", value, "userOrderCreatertime");
            return (Criteria) this;
        }

        public Criteria andUserOrderCreatertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_order_creatertime >=", value, "userOrderCreatertime");
            return (Criteria) this;
        }

        public Criteria andUserOrderCreatertimeLessThan(Date value) {
            addCriterion("user_order_creatertime <", value, "userOrderCreatertime");
            return (Criteria) this;
        }

        public Criteria andUserOrderCreatertimeLessThanOrEqualTo(Date value) {
            addCriterion("user_order_creatertime <=", value, "userOrderCreatertime");
            return (Criteria) this;
        }

        public Criteria andUserOrderCreatertimeIn(List<Date> values) {
            addCriterion("user_order_creatertime in", values, "userOrderCreatertime");
            return (Criteria) this;
        }

        public Criteria andUserOrderCreatertimeNotIn(List<Date> values) {
            addCriterion("user_order_creatertime not in", values, "userOrderCreatertime");
            return (Criteria) this;
        }

        public Criteria andUserOrderCreatertimeBetween(Date value1, Date value2) {
            addCriterion("user_order_creatertime between", value1, value2, "userOrderCreatertime");
            return (Criteria) this;
        }

        public Criteria andUserOrderCreatertimeNotBetween(Date value1, Date value2) {
            addCriterion("user_order_creatertime not between", value1, value2, "userOrderCreatertime");
            return (Criteria) this;
        }

        public Criteria andUserOrderUpdatetimeIsNull() {
            addCriterion("user_order_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUserOrderUpdatetimeIsNotNull() {
            addCriterion("user_order_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUserOrderUpdatetimeEqualTo(Date value) {
            addCriterion("user_order_updatetime =", value, "userOrderUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserOrderUpdatetimeNotEqualTo(Date value) {
            addCriterion("user_order_updatetime <>", value, "userOrderUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserOrderUpdatetimeGreaterThan(Date value) {
            addCriterion("user_order_updatetime >", value, "userOrderUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserOrderUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_order_updatetime >=", value, "userOrderUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserOrderUpdatetimeLessThan(Date value) {
            addCriterion("user_order_updatetime <", value, "userOrderUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserOrderUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("user_order_updatetime <=", value, "userOrderUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserOrderUpdatetimeIn(List<Date> values) {
            addCriterion("user_order_updatetime in", values, "userOrderUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserOrderUpdatetimeNotIn(List<Date> values) {
            addCriterion("user_order_updatetime not in", values, "userOrderUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserOrderUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("user_order_updatetime between", value1, value2, "userOrderUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserOrderUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("user_order_updatetime not between", value1, value2, "userOrderUpdatetime");
            return (Criteria) this;
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

        public Criteria andDriverIdIsNull() {
            addCriterion("driver_id is null");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNotNull() {
            addCriterion("driver_id is not null");
            return (Criteria) this;
        }

        public Criteria andDriverIdEqualTo(String value) {
            addCriterion("driver_id =", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotEqualTo(String value) {
            addCriterion("driver_id <>", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThan(String value) {
            addCriterion("driver_id >", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThanOrEqualTo(String value) {
            addCriterion("driver_id >=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThan(String value) {
            addCriterion("driver_id <", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThanOrEqualTo(String value) {
            addCriterion("driver_id <=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLike(String value) {
            addCriterion("driver_id like", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotLike(String value) {
            addCriterion("driver_id not like", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdIn(List<String> values) {
            addCriterion("driver_id in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotIn(List<String> values) {
            addCriterion("driver_id not in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdBetween(String value1, String value2) {
            addCriterion("driver_id between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotBetween(String value1, String value2) {
            addCriterion("driver_id not between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsdeleteIsNull() {
            addCriterion("user_address_isdelete is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsdeleteIsNotNull() {
            addCriterion("user_address_isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsdeleteEqualTo(Boolean value) {
            addCriterion("user_address_isdelete =", value, "userAddressIsdelete");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsdeleteNotEqualTo(Boolean value) {
            addCriterion("user_address_isdelete <>", value, "userAddressIsdelete");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsdeleteGreaterThan(Boolean value) {
            addCriterion("user_address_isdelete >", value, "userAddressIsdelete");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsdeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("user_address_isdelete >=", value, "userAddressIsdelete");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsdeleteLessThan(Boolean value) {
            addCriterion("user_address_isdelete <", value, "userAddressIsdelete");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsdeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("user_address_isdelete <=", value, "userAddressIsdelete");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsdeleteIn(List<Boolean> values) {
            addCriterion("user_address_isdelete in", values, "userAddressIsdelete");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsdeleteNotIn(List<Boolean> values) {
            addCriterion("user_address_isdelete not in", values, "userAddressIsdelete");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsdeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("user_address_isdelete between", value1, value2, "userAddressIsdelete");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsdeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("user_address_isdelete not between", value1, value2, "userAddressIsdelete");
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