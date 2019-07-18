package com.woniuxy.entity;

import java.util.ArrayList;
import java.util.List;

public class AdvertisingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdvertisingExample() {
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

        public Criteria andAdvertisingIdIsNull() {
            addCriterion("advertising_id is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdIsNotNull() {
            addCriterion("advertising_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdEqualTo(String value) {
            addCriterion("advertising_id =", value, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdNotEqualTo(String value) {
            addCriterion("advertising_id <>", value, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdGreaterThan(String value) {
            addCriterion("advertising_id >", value, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdGreaterThanOrEqualTo(String value) {
            addCriterion("advertising_id >=", value, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdLessThan(String value) {
            addCriterion("advertising_id <", value, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdLessThanOrEqualTo(String value) {
            addCriterion("advertising_id <=", value, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdLike(String value) {
            addCriterion("advertising_id like", value, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdNotLike(String value) {
            addCriterion("advertising_id not like", value, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdIn(List<String> values) {
            addCriterion("advertising_id in", values, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdNotIn(List<String> values) {
            addCriterion("advertising_id not in", values, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdBetween(String value1, String value2) {
            addCriterion("advertising_id between", value1, value2, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdNotBetween(String value1, String value2) {
            addCriterion("advertising_id not between", value1, value2, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameIsNull() {
            addCriterion("advertising_name is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameIsNotNull() {
            addCriterion("advertising_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameEqualTo(String value) {
            addCriterion("advertising_name =", value, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameNotEqualTo(String value) {
            addCriterion("advertising_name <>", value, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameGreaterThan(String value) {
            addCriterion("advertising_name >", value, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameGreaterThanOrEqualTo(String value) {
            addCriterion("advertising_name >=", value, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameLessThan(String value) {
            addCriterion("advertising_name <", value, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameLessThanOrEqualTo(String value) {
            addCriterion("advertising_name <=", value, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameLike(String value) {
            addCriterion("advertising_name like", value, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameNotLike(String value) {
            addCriterion("advertising_name not like", value, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameIn(List<String> values) {
            addCriterion("advertising_name in", values, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameNotIn(List<String> values) {
            addCriterion("advertising_name not in", values, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameBetween(String value1, String value2) {
            addCriterion("advertising_name between", value1, value2, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameNotBetween(String value1, String value2) {
            addCriterion("advertising_name not between", value1, value2, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNoteIsNull() {
            addCriterion("advertising_note is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNoteIsNotNull() {
            addCriterion("advertising_note is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNoteEqualTo(String value) {
            addCriterion("advertising_note =", value, "advertisingNote");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNoteNotEqualTo(String value) {
            addCriterion("advertising_note <>", value, "advertisingNote");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNoteGreaterThan(String value) {
            addCriterion("advertising_note >", value, "advertisingNote");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNoteGreaterThanOrEqualTo(String value) {
            addCriterion("advertising_note >=", value, "advertisingNote");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNoteLessThan(String value) {
            addCriterion("advertising_note <", value, "advertisingNote");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNoteLessThanOrEqualTo(String value) {
            addCriterion("advertising_note <=", value, "advertisingNote");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNoteLike(String value) {
            addCriterion("advertising_note like", value, "advertisingNote");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNoteNotLike(String value) {
            addCriterion("advertising_note not like", value, "advertisingNote");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNoteIn(List<String> values) {
            addCriterion("advertising_note in", values, "advertisingNote");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNoteNotIn(List<String> values) {
            addCriterion("advertising_note not in", values, "advertisingNote");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNoteBetween(String value1, String value2) {
            addCriterion("advertising_note between", value1, value2, "advertisingNote");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNoteNotBetween(String value1, String value2) {
            addCriterion("advertising_note not between", value1, value2, "advertisingNote");
            return (Criteria) this;
        }

        public Criteria andAdvertisingPhotoIsNull() {
            addCriterion("advertising_photo is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingPhotoIsNotNull() {
            addCriterion("advertising_photo is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingPhotoEqualTo(String value) {
            addCriterion("advertising_photo =", value, "advertisingPhoto");
            return (Criteria) this;
        }

        public Criteria andAdvertisingPhotoNotEqualTo(String value) {
            addCriterion("advertising_photo <>", value, "advertisingPhoto");
            return (Criteria) this;
        }

        public Criteria andAdvertisingPhotoGreaterThan(String value) {
            addCriterion("advertising_photo >", value, "advertisingPhoto");
            return (Criteria) this;
        }

        public Criteria andAdvertisingPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("advertising_photo >=", value, "advertisingPhoto");
            return (Criteria) this;
        }

        public Criteria andAdvertisingPhotoLessThan(String value) {
            addCriterion("advertising_photo <", value, "advertisingPhoto");
            return (Criteria) this;
        }

        public Criteria andAdvertisingPhotoLessThanOrEqualTo(String value) {
            addCriterion("advertising_photo <=", value, "advertisingPhoto");
            return (Criteria) this;
        }

        public Criteria andAdvertisingPhotoLike(String value) {
            addCriterion("advertising_photo like", value, "advertisingPhoto");
            return (Criteria) this;
        }

        public Criteria andAdvertisingPhotoNotLike(String value) {
            addCriterion("advertising_photo not like", value, "advertisingPhoto");
            return (Criteria) this;
        }

        public Criteria andAdvertisingPhotoIn(List<String> values) {
            addCriterion("advertising_photo in", values, "advertisingPhoto");
            return (Criteria) this;
        }

        public Criteria andAdvertisingPhotoNotIn(List<String> values) {
            addCriterion("advertising_photo not in", values, "advertisingPhoto");
            return (Criteria) this;
        }

        public Criteria andAdvertisingPhotoBetween(String value1, String value2) {
            addCriterion("advertising_photo between", value1, value2, "advertisingPhoto");
            return (Criteria) this;
        }

        public Criteria andAdvertisingPhotoNotBetween(String value1, String value2) {
            addCriterion("advertising_photo not between", value1, value2, "advertisingPhoto");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIsdeleteIsNull() {
            addCriterion("advertising_isdelete is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIsdeleteIsNotNull() {
            addCriterion("advertising_isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIsdeleteEqualTo(Boolean value) {
            addCriterion("advertising_isdelete =", value, "advertisingIsdelete");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIsdeleteNotEqualTo(Boolean value) {
            addCriterion("advertising_isdelete <>", value, "advertisingIsdelete");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIsdeleteGreaterThan(Boolean value) {
            addCriterion("advertising_isdelete >", value, "advertisingIsdelete");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIsdeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("advertising_isdelete >=", value, "advertisingIsdelete");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIsdeleteLessThan(Boolean value) {
            addCriterion("advertising_isdelete <", value, "advertisingIsdelete");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIsdeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("advertising_isdelete <=", value, "advertisingIsdelete");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIsdeleteIn(List<Boolean> values) {
            addCriterion("advertising_isdelete in", values, "advertisingIsdelete");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIsdeleteNotIn(List<Boolean> values) {
            addCriterion("advertising_isdelete not in", values, "advertisingIsdelete");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIsdeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("advertising_isdelete between", value1, value2, "advertisingIsdelete");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIsdeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("advertising_isdelete not between", value1, value2, "advertisingIsdelete");
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