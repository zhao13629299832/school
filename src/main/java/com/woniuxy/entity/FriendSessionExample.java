package com.woniuxy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FriendSessionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FriendSessionExample() {
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

        public Criteria andFriendSessionTimeIsNull() {
            addCriterion("friend_session_time is null");
            return (Criteria) this;
        }

        public Criteria andFriendSessionTimeIsNotNull() {
            addCriterion("friend_session_time is not null");
            return (Criteria) this;
        }

        public Criteria andFriendSessionTimeEqualTo(Date value) {
            addCriterion("friend_session_time =", value, "friendSessionTime");
            return (Criteria) this;
        }

        public Criteria andFriendSessionTimeNotEqualTo(Date value) {
            addCriterion("friend_session_time <>", value, "friendSessionTime");
            return (Criteria) this;
        }

        public Criteria andFriendSessionTimeGreaterThan(Date value) {
            addCriterion("friend_session_time >", value, "friendSessionTime");
            return (Criteria) this;
        }

        public Criteria andFriendSessionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("friend_session_time >=", value, "friendSessionTime");
            return (Criteria) this;
        }

        public Criteria andFriendSessionTimeLessThan(Date value) {
            addCriterion("friend_session_time <", value, "friendSessionTime");
            return (Criteria) this;
        }

        public Criteria andFriendSessionTimeLessThanOrEqualTo(Date value) {
            addCriterion("friend_session_time <=", value, "friendSessionTime");
            return (Criteria) this;
        }

        public Criteria andFriendSessionTimeIn(List<Date> values) {
            addCriterion("friend_session_time in", values, "friendSessionTime");
            return (Criteria) this;
        }

        public Criteria andFriendSessionTimeNotIn(List<Date> values) {
            addCriterion("friend_session_time not in", values, "friendSessionTime");
            return (Criteria) this;
        }

        public Criteria andFriendSessionTimeBetween(Date value1, Date value2) {
            addCriterion("friend_session_time between", value1, value2, "friendSessionTime");
            return (Criteria) this;
        }

        public Criteria andFriendSessionTimeNotBetween(Date value1, Date value2) {
            addCriterion("friend_session_time not between", value1, value2, "friendSessionTime");
            return (Criteria) this;
        }

        public Criteria andFriendSessionFromidIsNull() {
            addCriterion("friend_session_fromid is null");
            return (Criteria) this;
        }

        public Criteria andFriendSessionFromidIsNotNull() {
            addCriterion("friend_session_fromid is not null");
            return (Criteria) this;
        }

        public Criteria andFriendSessionFromidEqualTo(String value) {
            addCriterion("friend_session_fromid =", value, "friendSessionFromid");
            return (Criteria) this;
        }

        public Criteria andFriendSessionFromidNotEqualTo(String value) {
            addCriterion("friend_session_fromid <>", value, "friendSessionFromid");
            return (Criteria) this;
        }

        public Criteria andFriendSessionFromidGreaterThan(String value) {
            addCriterion("friend_session_fromid >", value, "friendSessionFromid");
            return (Criteria) this;
        }

        public Criteria andFriendSessionFromidGreaterThanOrEqualTo(String value) {
            addCriterion("friend_session_fromid >=", value, "friendSessionFromid");
            return (Criteria) this;
        }

        public Criteria andFriendSessionFromidLessThan(String value) {
            addCriterion("friend_session_fromid <", value, "friendSessionFromid");
            return (Criteria) this;
        }

        public Criteria andFriendSessionFromidLessThanOrEqualTo(String value) {
            addCriterion("friend_session_fromid <=", value, "friendSessionFromid");
            return (Criteria) this;
        }

        public Criteria andFriendSessionFromidLike(String value) {
            addCriterion("friend_session_fromid like", value, "friendSessionFromid");
            return (Criteria) this;
        }

        public Criteria andFriendSessionFromidNotLike(String value) {
            addCriterion("friend_session_fromid not like", value, "friendSessionFromid");
            return (Criteria) this;
        }

        public Criteria andFriendSessionFromidIn(List<String> values) {
            addCriterion("friend_session_fromid in", values, "friendSessionFromid");
            return (Criteria) this;
        }

        public Criteria andFriendSessionFromidNotIn(List<String> values) {
            addCriterion("friend_session_fromid not in", values, "friendSessionFromid");
            return (Criteria) this;
        }

        public Criteria andFriendSessionFromidBetween(String value1, String value2) {
            addCriterion("friend_session_fromid between", value1, value2, "friendSessionFromid");
            return (Criteria) this;
        }

        public Criteria andFriendSessionFromidNotBetween(String value1, String value2) {
            addCriterion("friend_session_fromid not between", value1, value2, "friendSessionFromid");
            return (Criteria) this;
        }

        public Criteria andFriendSessionToidIsNull() {
            addCriterion("friend_session_toid is null");
            return (Criteria) this;
        }

        public Criteria andFriendSessionToidIsNotNull() {
            addCriterion("friend_session_toid is not null");
            return (Criteria) this;
        }

        public Criteria andFriendSessionToidEqualTo(String value) {
            addCriterion("friend_session_toid =", value, "friendSessionToid");
            return (Criteria) this;
        }

        public Criteria andFriendSessionToidNotEqualTo(String value) {
            addCriterion("friend_session_toid <>", value, "friendSessionToid");
            return (Criteria) this;
        }

        public Criteria andFriendSessionToidGreaterThan(String value) {
            addCriterion("friend_session_toid >", value, "friendSessionToid");
            return (Criteria) this;
        }

        public Criteria andFriendSessionToidGreaterThanOrEqualTo(String value) {
            addCriterion("friend_session_toid >=", value, "friendSessionToid");
            return (Criteria) this;
        }

        public Criteria andFriendSessionToidLessThan(String value) {
            addCriterion("friend_session_toid <", value, "friendSessionToid");
            return (Criteria) this;
        }

        public Criteria andFriendSessionToidLessThanOrEqualTo(String value) {
            addCriterion("friend_session_toid <=", value, "friendSessionToid");
            return (Criteria) this;
        }

        public Criteria andFriendSessionToidLike(String value) {
            addCriterion("friend_session_toid like", value, "friendSessionToid");
            return (Criteria) this;
        }

        public Criteria andFriendSessionToidNotLike(String value) {
            addCriterion("friend_session_toid not like", value, "friendSessionToid");
            return (Criteria) this;
        }

        public Criteria andFriendSessionToidIn(List<String> values) {
            addCriterion("friend_session_toid in", values, "friendSessionToid");
            return (Criteria) this;
        }

        public Criteria andFriendSessionToidNotIn(List<String> values) {
            addCriterion("friend_session_toid not in", values, "friendSessionToid");
            return (Criteria) this;
        }

        public Criteria andFriendSessionToidBetween(String value1, String value2) {
            addCriterion("friend_session_toid between", value1, value2, "friendSessionToid");
            return (Criteria) this;
        }

        public Criteria andFriendSessionToidNotBetween(String value1, String value2) {
            addCriterion("friend_session_toid not between", value1, value2, "friendSessionToid");
            return (Criteria) this;
        }

        public Criteria andFriendSessionIsdeleteIsNull() {
            addCriterion("friend_session_isdelete is null");
            return (Criteria) this;
        }

        public Criteria andFriendSessionIsdeleteIsNotNull() {
            addCriterion("friend_session_isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andFriendSessionIsdeleteEqualTo(Boolean value) {
            addCriterion("friend_session_isdelete =", value, "friendSessionIsdelete");
            return (Criteria) this;
        }

        public Criteria andFriendSessionIsdeleteNotEqualTo(Boolean value) {
            addCriterion("friend_session_isdelete <>", value, "friendSessionIsdelete");
            return (Criteria) this;
        }

        public Criteria andFriendSessionIsdeleteGreaterThan(Boolean value) {
            addCriterion("friend_session_isdelete >", value, "friendSessionIsdelete");
            return (Criteria) this;
        }

        public Criteria andFriendSessionIsdeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("friend_session_isdelete >=", value, "friendSessionIsdelete");
            return (Criteria) this;
        }

        public Criteria andFriendSessionIsdeleteLessThan(Boolean value) {
            addCriterion("friend_session_isdelete <", value, "friendSessionIsdelete");
            return (Criteria) this;
        }

        public Criteria andFriendSessionIsdeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("friend_session_isdelete <=", value, "friendSessionIsdelete");
            return (Criteria) this;
        }

        public Criteria andFriendSessionIsdeleteIn(List<Boolean> values) {
            addCriterion("friend_session_isdelete in", values, "friendSessionIsdelete");
            return (Criteria) this;
        }

        public Criteria andFriendSessionIsdeleteNotIn(List<Boolean> values) {
            addCriterion("friend_session_isdelete not in", values, "friendSessionIsdelete");
            return (Criteria) this;
        }

        public Criteria andFriendSessionIsdeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("friend_session_isdelete between", value1, value2, "friendSessionIsdelete");
            return (Criteria) this;
        }

        public Criteria andFriendSessionIsdeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("friend_session_isdelete not between", value1, value2, "friendSessionIsdelete");
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