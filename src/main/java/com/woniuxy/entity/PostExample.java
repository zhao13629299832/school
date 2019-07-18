package com.woniuxy.entity;

import java.util.ArrayList;
import java.util.List;

public class PostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostExample() {
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

        public Criteria andPostIdIsNull() {
            addCriterion("post_id is null");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNotNull() {
            addCriterion("post_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostIdEqualTo(String value) {
            addCriterion("post_id =", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotEqualTo(String value) {
            addCriterion("post_id <>", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThan(String value) {
            addCriterion("post_id >", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThanOrEqualTo(String value) {
            addCriterion("post_id >=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThan(String value) {
            addCriterion("post_id <", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThanOrEqualTo(String value) {
            addCriterion("post_id <=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLike(String value) {
            addCriterion("post_id like", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotLike(String value) {
            addCriterion("post_id not like", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdIn(List<String> values) {
            addCriterion("post_id in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotIn(List<String> values) {
            addCriterion("post_id not in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdBetween(String value1, String value2) {
            addCriterion("post_id between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotBetween(String value1, String value2) {
            addCriterion("post_id not between", value1, value2, "postId");
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

        public Criteria andPostNameIsNull() {
            addCriterion("post_name is null");
            return (Criteria) this;
        }

        public Criteria andPostNameIsNotNull() {
            addCriterion("post_name is not null");
            return (Criteria) this;
        }

        public Criteria andPostNameEqualTo(String value) {
            addCriterion("post_name =", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameNotEqualTo(String value) {
            addCriterion("post_name <>", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameGreaterThan(String value) {
            addCriterion("post_name >", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameGreaterThanOrEqualTo(String value) {
            addCriterion("post_name >=", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameLessThan(String value) {
            addCriterion("post_name <", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameLessThanOrEqualTo(String value) {
            addCriterion("post_name <=", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameLike(String value) {
            addCriterion("post_name like", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameNotLike(String value) {
            addCriterion("post_name not like", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameIn(List<String> values) {
            addCriterion("post_name in", values, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameNotIn(List<String> values) {
            addCriterion("post_name not in", values, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameBetween(String value1, String value2) {
            addCriterion("post_name between", value1, value2, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameNotBetween(String value1, String value2) {
            addCriterion("post_name not between", value1, value2, "postName");
            return (Criteria) this;
        }

        public Criteria andPostContentIsNull() {
            addCriterion("post_content is null");
            return (Criteria) this;
        }

        public Criteria andPostContentIsNotNull() {
            addCriterion("post_content is not null");
            return (Criteria) this;
        }

        public Criteria andPostContentEqualTo(String value) {
            addCriterion("post_content =", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentNotEqualTo(String value) {
            addCriterion("post_content <>", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentGreaterThan(String value) {
            addCriterion("post_content >", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentGreaterThanOrEqualTo(String value) {
            addCriterion("post_content >=", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentLessThan(String value) {
            addCriterion("post_content <", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentLessThanOrEqualTo(String value) {
            addCriterion("post_content <=", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentLike(String value) {
            addCriterion("post_content like", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentNotLike(String value) {
            addCriterion("post_content not like", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentIn(List<String> values) {
            addCriterion("post_content in", values, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentNotIn(List<String> values) {
            addCriterion("post_content not in", values, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentBetween(String value1, String value2) {
            addCriterion("post_content between", value1, value2, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentNotBetween(String value1, String value2) {
            addCriterion("post_content not between", value1, value2, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostPhotoIsNull() {
            addCriterion("post_photo is null");
            return (Criteria) this;
        }

        public Criteria andPostPhotoIsNotNull() {
            addCriterion("post_photo is not null");
            return (Criteria) this;
        }

        public Criteria andPostPhotoEqualTo(String value) {
            addCriterion("post_photo =", value, "postPhoto");
            return (Criteria) this;
        }

        public Criteria andPostPhotoNotEqualTo(String value) {
            addCriterion("post_photo <>", value, "postPhoto");
            return (Criteria) this;
        }

        public Criteria andPostPhotoGreaterThan(String value) {
            addCriterion("post_photo >", value, "postPhoto");
            return (Criteria) this;
        }

        public Criteria andPostPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("post_photo >=", value, "postPhoto");
            return (Criteria) this;
        }

        public Criteria andPostPhotoLessThan(String value) {
            addCriterion("post_photo <", value, "postPhoto");
            return (Criteria) this;
        }

        public Criteria andPostPhotoLessThanOrEqualTo(String value) {
            addCriterion("post_photo <=", value, "postPhoto");
            return (Criteria) this;
        }

        public Criteria andPostPhotoLike(String value) {
            addCriterion("post_photo like", value, "postPhoto");
            return (Criteria) this;
        }

        public Criteria andPostPhotoNotLike(String value) {
            addCriterion("post_photo not like", value, "postPhoto");
            return (Criteria) this;
        }

        public Criteria andPostPhotoIn(List<String> values) {
            addCriterion("post_photo in", values, "postPhoto");
            return (Criteria) this;
        }

        public Criteria andPostPhotoNotIn(List<String> values) {
            addCriterion("post_photo not in", values, "postPhoto");
            return (Criteria) this;
        }

        public Criteria andPostPhotoBetween(String value1, String value2) {
            addCriterion("post_photo between", value1, value2, "postPhoto");
            return (Criteria) this;
        }

        public Criteria andPostPhotoNotBetween(String value1, String value2) {
            addCriterion("post_photo not between", value1, value2, "postPhoto");
            return (Criteria) this;
        }

        public Criteria andPostIsdeleteIsNull() {
            addCriterion("post_isdelete is null");
            return (Criteria) this;
        }

        public Criteria andPostIsdeleteIsNotNull() {
            addCriterion("post_isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andPostIsdeleteEqualTo(Boolean value) {
            addCriterion("post_isdelete =", value, "postIsdelete");
            return (Criteria) this;
        }

        public Criteria andPostIsdeleteNotEqualTo(Boolean value) {
            addCriterion("post_isdelete <>", value, "postIsdelete");
            return (Criteria) this;
        }

        public Criteria andPostIsdeleteGreaterThan(Boolean value) {
            addCriterion("post_isdelete >", value, "postIsdelete");
            return (Criteria) this;
        }

        public Criteria andPostIsdeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("post_isdelete >=", value, "postIsdelete");
            return (Criteria) this;
        }

        public Criteria andPostIsdeleteLessThan(Boolean value) {
            addCriterion("post_isdelete <", value, "postIsdelete");
            return (Criteria) this;
        }

        public Criteria andPostIsdeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("post_isdelete <=", value, "postIsdelete");
            return (Criteria) this;
        }

        public Criteria andPostIsdeleteIn(List<Boolean> values) {
            addCriterion("post_isdelete in", values, "postIsdelete");
            return (Criteria) this;
        }

        public Criteria andPostIsdeleteNotIn(List<Boolean> values) {
            addCriterion("post_isdelete not in", values, "postIsdelete");
            return (Criteria) this;
        }

        public Criteria andPostIsdeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("post_isdelete between", value1, value2, "postIsdelete");
            return (Criteria) this;
        }

        public Criteria andPostIsdeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("post_isdelete not between", value1, value2, "postIsdelete");
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