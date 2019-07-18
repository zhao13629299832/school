package com.woniuxy.entity;

import java.util.ArrayList;
import java.util.List;

public class UserAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAddressExample() {
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

        public Criteria andUserAddressProvinceIsNull() {
            addCriterion("user_address_province is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressProvinceIsNotNull() {
            addCriterion("user_address_province is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressProvinceEqualTo(String value) {
            addCriterion("user_address_province =", value, "userAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUserAddressProvinceNotEqualTo(String value) {
            addCriterion("user_address_province <>", value, "userAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUserAddressProvinceGreaterThan(String value) {
            addCriterion("user_address_province >", value, "userAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUserAddressProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("user_address_province >=", value, "userAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUserAddressProvinceLessThan(String value) {
            addCriterion("user_address_province <", value, "userAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUserAddressProvinceLessThanOrEqualTo(String value) {
            addCriterion("user_address_province <=", value, "userAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUserAddressProvinceLike(String value) {
            addCriterion("user_address_province like", value, "userAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUserAddressProvinceNotLike(String value) {
            addCriterion("user_address_province not like", value, "userAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUserAddressProvinceIn(List<String> values) {
            addCriterion("user_address_province in", values, "userAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUserAddressProvinceNotIn(List<String> values) {
            addCriterion("user_address_province not in", values, "userAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUserAddressProvinceBetween(String value1, String value2) {
            addCriterion("user_address_province between", value1, value2, "userAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUserAddressProvinceNotBetween(String value1, String value2) {
            addCriterion("user_address_province not between", value1, value2, "userAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityIsNull() {
            addCriterion("user_address_city is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityIsNotNull() {
            addCriterion("user_address_city is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityEqualTo(String value) {
            addCriterion("user_address_city =", value, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityNotEqualTo(String value) {
            addCriterion("user_address_city <>", value, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityGreaterThan(String value) {
            addCriterion("user_address_city >", value, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityGreaterThanOrEqualTo(String value) {
            addCriterion("user_address_city >=", value, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityLessThan(String value) {
            addCriterion("user_address_city <", value, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityLessThanOrEqualTo(String value) {
            addCriterion("user_address_city <=", value, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityLike(String value) {
            addCriterion("user_address_city like", value, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityNotLike(String value) {
            addCriterion("user_address_city not like", value, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityIn(List<String> values) {
            addCriterion("user_address_city in", values, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityNotIn(List<String> values) {
            addCriterion("user_address_city not in", values, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityBetween(String value1, String value2) {
            addCriterion("user_address_city between", value1, value2, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityNotBetween(String value1, String value2) {
            addCriterion("user_address_city not between", value1, value2, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaIsNull() {
            addCriterion("user_address_area is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaIsNotNull() {
            addCriterion("user_address_area is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaEqualTo(String value) {
            addCriterion("user_address_area =", value, "userAddressArea");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaNotEqualTo(String value) {
            addCriterion("user_address_area <>", value, "userAddressArea");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaGreaterThan(String value) {
            addCriterion("user_address_area >", value, "userAddressArea");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaGreaterThanOrEqualTo(String value) {
            addCriterion("user_address_area >=", value, "userAddressArea");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaLessThan(String value) {
            addCriterion("user_address_area <", value, "userAddressArea");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaLessThanOrEqualTo(String value) {
            addCriterion("user_address_area <=", value, "userAddressArea");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaLike(String value) {
            addCriterion("user_address_area like", value, "userAddressArea");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaNotLike(String value) {
            addCriterion("user_address_area not like", value, "userAddressArea");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaIn(List<String> values) {
            addCriterion("user_address_area in", values, "userAddressArea");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaNotIn(List<String> values) {
            addCriterion("user_address_area not in", values, "userAddressArea");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaBetween(String value1, String value2) {
            addCriterion("user_address_area between", value1, value2, "userAddressArea");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaNotBetween(String value1, String value2) {
            addCriterion("user_address_area not between", value1, value2, "userAddressArea");
            return (Criteria) this;
        }

        public Criteria andUserAddressSchoolIsNull() {
            addCriterion("user_address_school is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressSchoolIsNotNull() {
            addCriterion("user_address_school is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressSchoolEqualTo(String value) {
            addCriterion("user_address_school =", value, "userAddressSchool");
            return (Criteria) this;
        }

        public Criteria andUserAddressSchoolNotEqualTo(String value) {
            addCriterion("user_address_school <>", value, "userAddressSchool");
            return (Criteria) this;
        }

        public Criteria andUserAddressSchoolGreaterThan(String value) {
            addCriterion("user_address_school >", value, "userAddressSchool");
            return (Criteria) this;
        }

        public Criteria andUserAddressSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("user_address_school >=", value, "userAddressSchool");
            return (Criteria) this;
        }

        public Criteria andUserAddressSchoolLessThan(String value) {
            addCriterion("user_address_school <", value, "userAddressSchool");
            return (Criteria) this;
        }

        public Criteria andUserAddressSchoolLessThanOrEqualTo(String value) {
            addCriterion("user_address_school <=", value, "userAddressSchool");
            return (Criteria) this;
        }

        public Criteria andUserAddressSchoolLike(String value) {
            addCriterion("user_address_school like", value, "userAddressSchool");
            return (Criteria) this;
        }

        public Criteria andUserAddressSchoolNotLike(String value) {
            addCriterion("user_address_school not like", value, "userAddressSchool");
            return (Criteria) this;
        }

        public Criteria andUserAddressSchoolIn(List<String> values) {
            addCriterion("user_address_school in", values, "userAddressSchool");
            return (Criteria) this;
        }

        public Criteria andUserAddressSchoolNotIn(List<String> values) {
            addCriterion("user_address_school not in", values, "userAddressSchool");
            return (Criteria) this;
        }

        public Criteria andUserAddressSchoolBetween(String value1, String value2) {
            addCriterion("user_address_school between", value1, value2, "userAddressSchool");
            return (Criteria) this;
        }

        public Criteria andUserAddressSchoolNotBetween(String value1, String value2) {
            addCriterion("user_address_school not between", value1, value2, "userAddressSchool");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameIsNull() {
            addCriterion("user_address_name is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameIsNotNull() {
            addCriterion("user_address_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameEqualTo(String value) {
            addCriterion("user_address_name =", value, "userAddressName");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameNotEqualTo(String value) {
            addCriterion("user_address_name <>", value, "userAddressName");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameGreaterThan(String value) {
            addCriterion("user_address_name >", value, "userAddressName");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_address_name >=", value, "userAddressName");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameLessThan(String value) {
            addCriterion("user_address_name <", value, "userAddressName");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameLessThanOrEqualTo(String value) {
            addCriterion("user_address_name <=", value, "userAddressName");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameLike(String value) {
            addCriterion("user_address_name like", value, "userAddressName");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameNotLike(String value) {
            addCriterion("user_address_name not like", value, "userAddressName");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameIn(List<String> values) {
            addCriterion("user_address_name in", values, "userAddressName");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameNotIn(List<String> values) {
            addCriterion("user_address_name not in", values, "userAddressName");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameBetween(String value1, String value2) {
            addCriterion("user_address_name between", value1, value2, "userAddressName");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameNotBetween(String value1, String value2) {
            addCriterion("user_address_name not between", value1, value2, "userAddressName");
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