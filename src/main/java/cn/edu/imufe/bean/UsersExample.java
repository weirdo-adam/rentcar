package cn.edu.imufe.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("uname is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("uname is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("uname =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("uname <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("uname >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("uname >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("uname <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("uname <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("uname like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("uname not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("uname in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("uname not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("uname between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("uname not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUpowerIsNull() {
            addCriterion("upower is null");
            return (Criteria) this;
        }

        public Criteria andUpowerIsNotNull() {
            addCriterion("upower is not null");
            return (Criteria) this;
        }

        public Criteria andUpowerEqualTo(Integer value) {
            addCriterion("upower =", value, "upower");
            return (Criteria) this;
        }

        public Criteria andUpowerNotEqualTo(Integer value) {
            addCriterion("upower <>", value, "upower");
            return (Criteria) this;
        }

        public Criteria andUpowerGreaterThan(Integer value) {
            addCriterion("upower >", value, "upower");
            return (Criteria) this;
        }

        public Criteria andUpowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("upower >=", value, "upower");
            return (Criteria) this;
        }

        public Criteria andUpowerLessThan(Integer value) {
            addCriterion("upower <", value, "upower");
            return (Criteria) this;
        }

        public Criteria andUpowerLessThanOrEqualTo(Integer value) {
            addCriterion("upower <=", value, "upower");
            return (Criteria) this;
        }

        public Criteria andUpowerIn(List<Integer> values) {
            addCriterion("upower in", values, "upower");
            return (Criteria) this;
        }

        public Criteria andUpowerNotIn(List<Integer> values) {
            addCriterion("upower not in", values, "upower");
            return (Criteria) this;
        }

        public Criteria andUpowerBetween(Integer value1, Integer value2) {
            addCriterion("upower between", value1, value2, "upower");
            return (Criteria) this;
        }

        public Criteria andUpowerNotBetween(Integer value1, Integer value2) {
            addCriterion("upower not between", value1, value2, "upower");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNull() {
            addCriterion("upassword is null");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNotNull() {
            addCriterion("upassword is not null");
            return (Criteria) this;
        }

        public Criteria andUpasswordEqualTo(String value) {
            addCriterion("upassword =", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotEqualTo(String value) {
            addCriterion("upassword <>", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThan(String value) {
            addCriterion("upassword >", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("upassword >=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThan(String value) {
            addCriterion("upassword <", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThanOrEqualTo(String value) {
            addCriterion("upassword <=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLike(String value) {
            addCriterion("upassword like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotLike(String value) {
            addCriterion("upassword not like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordIn(List<String> values) {
            addCriterion("upassword in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotIn(List<String> values) {
            addCriterion("upassword not in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordBetween(String value1, String value2) {
            addCriterion("upassword between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotBetween(String value1, String value2) {
            addCriterion("upassword not between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUcreatetimeIsNull() {
            addCriterion("ucreatetime is null");
            return (Criteria) this;
        }

        public Criteria andUcreatetimeIsNotNull() {
            addCriterion("ucreatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUcreatetimeEqualTo(Date value) {
            addCriterion("ucreatetime =", value, "ucreatetime");
            return (Criteria) this;
        }

        public Criteria andUcreatetimeNotEqualTo(Date value) {
            addCriterion("ucreatetime <>", value, "ucreatetime");
            return (Criteria) this;
        }

        public Criteria andUcreatetimeGreaterThan(Date value) {
            addCriterion("ucreatetime >", value, "ucreatetime");
            return (Criteria) this;
        }

        public Criteria andUcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ucreatetime >=", value, "ucreatetime");
            return (Criteria) this;
        }

        public Criteria andUcreatetimeLessThan(Date value) {
            addCriterion("ucreatetime <", value, "ucreatetime");
            return (Criteria) this;
        }

        public Criteria andUcreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("ucreatetime <=", value, "ucreatetime");
            return (Criteria) this;
        }

        public Criteria andUcreatetimeIn(List<Date> values) {
            addCriterion("ucreatetime in", values, "ucreatetime");
            return (Criteria) this;
        }

        public Criteria andUcreatetimeNotIn(List<Date> values) {
            addCriterion("ucreatetime not in", values, "ucreatetime");
            return (Criteria) this;
        }

        public Criteria andUcreatetimeBetween(Date value1, Date value2) {
            addCriterion("ucreatetime between", value1, value2, "ucreatetime");
            return (Criteria) this;
        }

        public Criteria andUcreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("ucreatetime not between", value1, value2, "ucreatetime");
            return (Criteria) this;
        }

        public Criteria andUupatetimeIsNull() {
            addCriterion("uupatetime is null");
            return (Criteria) this;
        }

        public Criteria andUupatetimeIsNotNull() {
            addCriterion("uupatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUupatetimeEqualTo(Date value) {
            addCriterion("uupatetime =", value, "uupatetime");
            return (Criteria) this;
        }

        public Criteria andUupatetimeNotEqualTo(Date value) {
            addCriterion("uupatetime <>", value, "uupatetime");
            return (Criteria) this;
        }

        public Criteria andUupatetimeGreaterThan(Date value) {
            addCriterion("uupatetime >", value, "uupatetime");
            return (Criteria) this;
        }

        public Criteria andUupatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("uupatetime >=", value, "uupatetime");
            return (Criteria) this;
        }

        public Criteria andUupatetimeLessThan(Date value) {
            addCriterion("uupatetime <", value, "uupatetime");
            return (Criteria) this;
        }

        public Criteria andUupatetimeLessThanOrEqualTo(Date value) {
            addCriterion("uupatetime <=", value, "uupatetime");
            return (Criteria) this;
        }

        public Criteria andUupatetimeIn(List<Date> values) {
            addCriterion("uupatetime in", values, "uupatetime");
            return (Criteria) this;
        }

        public Criteria andUupatetimeNotIn(List<Date> values) {
            addCriterion("uupatetime not in", values, "uupatetime");
            return (Criteria) this;
        }

        public Criteria andUupatetimeBetween(Date value1, Date value2) {
            addCriterion("uupatetime between", value1, value2, "uupatetime");
            return (Criteria) this;
        }

        public Criteria andUupatetimeNotBetween(Date value1, Date value2) {
            addCriterion("uupatetime not between", value1, value2, "uupatetime");
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