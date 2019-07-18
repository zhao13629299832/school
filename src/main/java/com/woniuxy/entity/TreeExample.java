package com.woniuxy.entity;

import java.util.ArrayList;
import java.util.List;

public class TreeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TreeExample() {
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

        public Criteria andTreeIdIsNull() {
            addCriterion("tree_id is null");
            return (Criteria) this;
        }

        public Criteria andTreeIdIsNotNull() {
            addCriterion("tree_id is not null");
            return (Criteria) this;
        }

        public Criteria andTreeIdEqualTo(Integer value) {
            addCriterion("tree_id =", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdNotEqualTo(Integer value) {
            addCriterion("tree_id <>", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdGreaterThan(Integer value) {
            addCriterion("tree_id >", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tree_id >=", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdLessThan(Integer value) {
            addCriterion("tree_id <", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("tree_id <=", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdIn(List<Integer> values) {
            addCriterion("tree_id in", values, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdNotIn(List<Integer> values) {
            addCriterion("tree_id not in", values, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdBetween(Integer value1, Integer value2) {
            addCriterion("tree_id between", value1, value2, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tree_id not between", value1, value2, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreePidIsNull() {
            addCriterion("tree_pid is null");
            return (Criteria) this;
        }

        public Criteria andTreePidIsNotNull() {
            addCriterion("tree_pid is not null");
            return (Criteria) this;
        }

        public Criteria andTreePidEqualTo(Integer value) {
            addCriterion("tree_pid =", value, "treePid");
            return (Criteria) this;
        }

        public Criteria andTreePidNotEqualTo(Integer value) {
            addCriterion("tree_pid <>", value, "treePid");
            return (Criteria) this;
        }

        public Criteria andTreePidGreaterThan(Integer value) {
            addCriterion("tree_pid >", value, "treePid");
            return (Criteria) this;
        }

        public Criteria andTreePidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tree_pid >=", value, "treePid");
            return (Criteria) this;
        }

        public Criteria andTreePidLessThan(Integer value) {
            addCriterion("tree_pid <", value, "treePid");
            return (Criteria) this;
        }

        public Criteria andTreePidLessThanOrEqualTo(Integer value) {
            addCriterion("tree_pid <=", value, "treePid");
            return (Criteria) this;
        }

        public Criteria andTreePidIn(List<Integer> values) {
            addCriterion("tree_pid in", values, "treePid");
            return (Criteria) this;
        }

        public Criteria andTreePidNotIn(List<Integer> values) {
            addCriterion("tree_pid not in", values, "treePid");
            return (Criteria) this;
        }

        public Criteria andTreePidBetween(Integer value1, Integer value2) {
            addCriterion("tree_pid between", value1, value2, "treePid");
            return (Criteria) this;
        }

        public Criteria andTreePidNotBetween(Integer value1, Integer value2) {
            addCriterion("tree_pid not between", value1, value2, "treePid");
            return (Criteria) this;
        }

        public Criteria andTreeNameIsNull() {
            addCriterion("tree_name is null");
            return (Criteria) this;
        }

        public Criteria andTreeNameIsNotNull() {
            addCriterion("tree_name is not null");
            return (Criteria) this;
        }

        public Criteria andTreeNameEqualTo(String value) {
            addCriterion("tree_name =", value, "treeName");
            return (Criteria) this;
        }

        public Criteria andTreeNameNotEqualTo(String value) {
            addCriterion("tree_name <>", value, "treeName");
            return (Criteria) this;
        }

        public Criteria andTreeNameGreaterThan(String value) {
            addCriterion("tree_name >", value, "treeName");
            return (Criteria) this;
        }

        public Criteria andTreeNameGreaterThanOrEqualTo(String value) {
            addCriterion("tree_name >=", value, "treeName");
            return (Criteria) this;
        }

        public Criteria andTreeNameLessThan(String value) {
            addCriterion("tree_name <", value, "treeName");
            return (Criteria) this;
        }

        public Criteria andTreeNameLessThanOrEqualTo(String value) {
            addCriterion("tree_name <=", value, "treeName");
            return (Criteria) this;
        }

        public Criteria andTreeNameLike(String value) {
            addCriterion("tree_name like", value, "treeName");
            return (Criteria) this;
        }

        public Criteria andTreeNameNotLike(String value) {
            addCriterion("tree_name not like", value, "treeName");
            return (Criteria) this;
        }

        public Criteria andTreeNameIn(List<String> values) {
            addCriterion("tree_name in", values, "treeName");
            return (Criteria) this;
        }

        public Criteria andTreeNameNotIn(List<String> values) {
            addCriterion("tree_name not in", values, "treeName");
            return (Criteria) this;
        }

        public Criteria andTreeNameBetween(String value1, String value2) {
            addCriterion("tree_name between", value1, value2, "treeName");
            return (Criteria) this;
        }

        public Criteria andTreeNameNotBetween(String value1, String value2) {
            addCriterion("tree_name not between", value1, value2, "treeName");
            return (Criteria) this;
        }

        public Criteria andTreeFileIsNull() {
            addCriterion("tree_file is null");
            return (Criteria) this;
        }

        public Criteria andTreeFileIsNotNull() {
            addCriterion("tree_file is not null");
            return (Criteria) this;
        }

        public Criteria andTreeFileEqualTo(String value) {
            addCriterion("tree_file =", value, "treeFile");
            return (Criteria) this;
        }

        public Criteria andTreeFileNotEqualTo(String value) {
            addCriterion("tree_file <>", value, "treeFile");
            return (Criteria) this;
        }

        public Criteria andTreeFileGreaterThan(String value) {
            addCriterion("tree_file >", value, "treeFile");
            return (Criteria) this;
        }

        public Criteria andTreeFileGreaterThanOrEqualTo(String value) {
            addCriterion("tree_file >=", value, "treeFile");
            return (Criteria) this;
        }

        public Criteria andTreeFileLessThan(String value) {
            addCriterion("tree_file <", value, "treeFile");
            return (Criteria) this;
        }

        public Criteria andTreeFileLessThanOrEqualTo(String value) {
            addCriterion("tree_file <=", value, "treeFile");
            return (Criteria) this;
        }

        public Criteria andTreeFileLike(String value) {
            addCriterion("tree_file like", value, "treeFile");
            return (Criteria) this;
        }

        public Criteria andTreeFileNotLike(String value) {
            addCriterion("tree_file not like", value, "treeFile");
            return (Criteria) this;
        }

        public Criteria andTreeFileIn(List<String> values) {
            addCriterion("tree_file in", values, "treeFile");
            return (Criteria) this;
        }

        public Criteria andTreeFileNotIn(List<String> values) {
            addCriterion("tree_file not in", values, "treeFile");
            return (Criteria) this;
        }

        public Criteria andTreeFileBetween(String value1, String value2) {
            addCriterion("tree_file between", value1, value2, "treeFile");
            return (Criteria) this;
        }

        public Criteria andTreeFileNotBetween(String value1, String value2) {
            addCriterion("tree_file not between", value1, value2, "treeFile");
            return (Criteria) this;
        }

        public Criteria andTreeIconIsNull() {
            addCriterion("tree_icon is null");
            return (Criteria) this;
        }

        public Criteria andTreeIconIsNotNull() {
            addCriterion("tree_icon is not null");
            return (Criteria) this;
        }

        public Criteria andTreeIconEqualTo(String value) {
            addCriterion("tree_icon =", value, "treeIcon");
            return (Criteria) this;
        }

        public Criteria andTreeIconNotEqualTo(String value) {
            addCriterion("tree_icon <>", value, "treeIcon");
            return (Criteria) this;
        }

        public Criteria andTreeIconGreaterThan(String value) {
            addCriterion("tree_icon >", value, "treeIcon");
            return (Criteria) this;
        }

        public Criteria andTreeIconGreaterThanOrEqualTo(String value) {
            addCriterion("tree_icon >=", value, "treeIcon");
            return (Criteria) this;
        }

        public Criteria andTreeIconLessThan(String value) {
            addCriterion("tree_icon <", value, "treeIcon");
            return (Criteria) this;
        }

        public Criteria andTreeIconLessThanOrEqualTo(String value) {
            addCriterion("tree_icon <=", value, "treeIcon");
            return (Criteria) this;
        }

        public Criteria andTreeIconLike(String value) {
            addCriterion("tree_icon like", value, "treeIcon");
            return (Criteria) this;
        }

        public Criteria andTreeIconNotLike(String value) {
            addCriterion("tree_icon not like", value, "treeIcon");
            return (Criteria) this;
        }

        public Criteria andTreeIconIn(List<String> values) {
            addCriterion("tree_icon in", values, "treeIcon");
            return (Criteria) this;
        }

        public Criteria andTreeIconNotIn(List<String> values) {
            addCriterion("tree_icon not in", values, "treeIcon");
            return (Criteria) this;
        }

        public Criteria andTreeIconBetween(String value1, String value2) {
            addCriterion("tree_icon between", value1, value2, "treeIcon");
            return (Criteria) this;
        }

        public Criteria andTreeIconNotBetween(String value1, String value2) {
            addCriterion("tree_icon not between", value1, value2, "treeIcon");
            return (Criteria) this;
        }

        public Criteria andTreeIsdeleteIsNull() {
            addCriterion("tree_isdelete is null");
            return (Criteria) this;
        }

        public Criteria andTreeIsdeleteIsNotNull() {
            addCriterion("tree_isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andTreeIsdeleteEqualTo(Boolean value) {
            addCriterion("tree_isdelete =", value, "treeIsdelete");
            return (Criteria) this;
        }

        public Criteria andTreeIsdeleteNotEqualTo(Boolean value) {
            addCriterion("tree_isdelete <>", value, "treeIsdelete");
            return (Criteria) this;
        }

        public Criteria andTreeIsdeleteGreaterThan(Boolean value) {
            addCriterion("tree_isdelete >", value, "treeIsdelete");
            return (Criteria) this;
        }

        public Criteria andTreeIsdeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("tree_isdelete >=", value, "treeIsdelete");
            return (Criteria) this;
        }

        public Criteria andTreeIsdeleteLessThan(Boolean value) {
            addCriterion("tree_isdelete <", value, "treeIsdelete");
            return (Criteria) this;
        }

        public Criteria andTreeIsdeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("tree_isdelete <=", value, "treeIsdelete");
            return (Criteria) this;
        }

        public Criteria andTreeIsdeleteIn(List<Boolean> values) {
            addCriterion("tree_isdelete in", values, "treeIsdelete");
            return (Criteria) this;
        }

        public Criteria andTreeIsdeleteNotIn(List<Boolean> values) {
            addCriterion("tree_isdelete not in", values, "treeIsdelete");
            return (Criteria) this;
        }

        public Criteria andTreeIsdeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("tree_isdelete between", value1, value2, "treeIsdelete");
            return (Criteria) this;
        }

        public Criteria andTreeIsdeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("tree_isdelete not between", value1, value2, "treeIsdelete");
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