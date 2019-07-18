package com.woniuxy.entity;

import java.util.ArrayList;
import java.util.List;

public class FriendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FriendExample() {
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

        public Criteria andFirendIdIsNull() {
            addCriterion("firend_id is null");
            return (Criteria) this;
        }

        public Criteria andFirendIdIsNotNull() {
            addCriterion("firend_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirendIdEqualTo(String value) {
            addCriterion("firend_id =", value, "firendId");
            return (Criteria) this;
        }

        public Criteria andFirendIdNotEqualTo(String value) {
            addCriterion("firend_id <>", value, "firendId");
            return (Criteria) this;
        }

        public Criteria andFirendIdGreaterThan(String value) {
            addCriterion("firend_id >", value, "firendId");
            return (Criteria) this;
        }

        public Criteria andFirendIdGreaterThanOrEqualTo(String value) {
            addCriterion("firend_id >=", value, "firendId");
            return (Criteria) this;
        }

        public Criteria andFirendIdLessThan(String value) {
            addCriterion("firend_id <", value, "firendId");
            return (Criteria) this;
        }

        public Criteria andFirendIdLessThanOrEqualTo(String value) {
            addCriterion("firend_id <=", value, "firendId");
            return (Criteria) this;
        }

        public Criteria andFirendIdLike(String value) {
            addCriterion("firend_id like", value, "firendId");
            return (Criteria) this;
        }

        public Criteria andFirendIdNotLike(String value) {
            addCriterion("firend_id not like", value, "firendId");
            return (Criteria) this;
        }

        public Criteria andFirendIdIn(List<String> values) {
            addCriterion("firend_id in", values, "firendId");
            return (Criteria) this;
        }

        public Criteria andFirendIdNotIn(List<String> values) {
            addCriterion("firend_id not in", values, "firendId");
            return (Criteria) this;
        }

        public Criteria andFirendIdBetween(String value1, String value2) {
            addCriterion("firend_id between", value1, value2, "firendId");
            return (Criteria) this;
        }

        public Criteria andFirendIdNotBetween(String value1, String value2) {
            addCriterion("firend_id not between", value1, value2, "firendId");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneIsNull() {
            addCriterion("friend_phone is null");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneIsNotNull() {
            addCriterion("friend_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneEqualTo(String value) {
            addCriterion("friend_phone =", value, "friendPhone");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneNotEqualTo(String value) {
            addCriterion("friend_phone <>", value, "friendPhone");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneGreaterThan(String value) {
            addCriterion("friend_phone >", value, "friendPhone");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("friend_phone >=", value, "friendPhone");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneLessThan(String value) {
            addCriterion("friend_phone <", value, "friendPhone");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneLessThanOrEqualTo(String value) {
            addCriterion("friend_phone <=", value, "friendPhone");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneLike(String value) {
            addCriterion("friend_phone like", value, "friendPhone");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneNotLike(String value) {
            addCriterion("friend_phone not like", value, "friendPhone");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneIn(List<String> values) {
            addCriterion("friend_phone in", values, "friendPhone");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneNotIn(List<String> values) {
            addCriterion("friend_phone not in", values, "friendPhone");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneBetween(String value1, String value2) {
            addCriterion("friend_phone between", value1, value2, "friendPhone");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneNotBetween(String value1, String value2) {
            addCriterion("friend_phone not between", value1, value2, "friendPhone");
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

        public Criteria andFriendSessionIdIsNull() {
            addCriterion("friend_session_id is null");
            return (Criteria) this;
        }

        public Criteria andFriendSessionIdIsNotNull() {
            addCriterion("friend_session_id is not null");
            return (Criteria) this;
        }

        public Criteria andFriendSessionIdEqualTo(String value) {
            addCriterion("friend_session_id =", value, "friendSessionId");
            return (Criteria) this;
        }

        public Criteria andFriendSessionIdNotEqualTo(String value) {
            addCriterion("friend_session_id <>", value, "friendSessionId");
            return (Criteria) this;
        }

        public Criteria andFriendSessionIdGreaterThan(String value) {
            addCriterion("friend_session_id >", value, "friendSessionId");
            return (Criteria) this;
        }

        public Criteria andFriendSessionIdGreaterThanOrEqualTo(String value) {
            addCriterion("friend_session_id >=", value, "friendSessionId");
            return (Criteria) this;
        }

        public Criteria andFriendSessionIdLessThan(String value) {
            addCriterion("friend_session_id <", value, "friendSessionId");
            return (Criteria) this;
        }

        public Criteria andFriendSessionIdLessThanOrEqualTo(String value) {
            addCriterion("friend_session_id <=", value, "friendSessionId");
            return (Criteria) this;
        }

        public Criteria andFriendSessionIdLike(String value) {
            addCriterion("friend_session_id like", value, "friendSessionId");
            return (Criteria) this;
        }

        public Criteria andFriendSessionIdNotLike(String value) {
            addCriterion("friend_session_id not like", value, "friendSessionId");
            return (Criteria) this;
        }

        public Criteria andFriendSessionIdIn(List<String> values) {
            addCriterion("friend_session_id in", values, "friendSessionId");
            return (Criteria) this;
        }

        public Criteria andFriendSessionIdNotIn(List<String> values) {
            addCriterion("friend_session_id not in", values, "friendSessionId");
            return (Criteria) this;
        }

        public Criteria andFriendSessionIdBetween(String value1, String value2) {
            addCriterion("friend_session_id between", value1, value2, "friendSessionId");
            return (Criteria) this;
        }

        public Criteria andFriendSessionIdNotBetween(String value1, String value2) {
            addCriterion("friend_session_id not between", value1, value2, "friendSessionId");
            return (Criteria) this;
        }

        public Criteria andFriendIsdeleteIsNull() {
            addCriterion("friend_isdelete is null");
            return (Criteria) this;
        }

        public Criteria andFriendIsdeleteIsNotNull() {
            addCriterion("friend_isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andFriendIsdeleteEqualTo(Boolean value) {
            addCriterion("friend_isdelete =", value, "friendIsdelete");
            return (Criteria) this;
        }

        public Criteria andFriendIsdeleteNotEqualTo(Boolean value) {
            addCriterion("friend_isdelete <>", value, "friendIsdelete");
            return (Criteria) this;
        }

        public Criteria andFriendIsdeleteGreaterThan(Boolean value) {
            addCriterion("friend_isdelete >", value, "friendIsdelete");
            return (Criteria) this;
        }

        public Criteria andFriendIsdeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("friend_isdelete >=", value, "friendIsdelete");
            return (Criteria) this;
        }

        public Criteria andFriendIsdeleteLessThan(Boolean value) {
            addCriterion("friend_isdelete <", value, "friendIsdelete");
            return (Criteria) this;
        }

        public Criteria andFriendIsdeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("friend_isdelete <=", value, "friendIsdelete");
            return (Criteria) this;
        }

        public Criteria andFriendIsdeleteIn(List<Boolean> values) {
            addCriterion("friend_isdelete in", values, "friendIsdelete");
            return (Criteria) this;
        }

        public Criteria andFriendIsdeleteNotIn(List<Boolean> values) {
            addCriterion("friend_isdelete not in", values, "friendIsdelete");
            return (Criteria) this;
        }

        public Criteria andFriendIsdeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("friend_isdelete between", value1, value2, "friendIsdelete");
            return (Criteria) this;
        }

        public Criteria andFriendIsdeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("friend_isdelete not between", value1, value2, "friendIsdelete");
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