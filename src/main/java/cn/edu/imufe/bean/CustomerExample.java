package cn.edu.imufe.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCpasswordIsNull() {
            addCriterion("cpassword is null");
            return (Criteria) this;
        }

        public Criteria andCpasswordIsNotNull() {
            addCriterion("cpassword is not null");
            return (Criteria) this;
        }

        public Criteria andCpasswordEqualTo(String value) {
            addCriterion("cpassword =", value, "cpassword");
            return (Criteria) this;
        }

        public Criteria andCpasswordNotEqualTo(String value) {
            addCriterion("cpassword <>", value, "cpassword");
            return (Criteria) this;
        }

        public Criteria andCpasswordGreaterThan(String value) {
            addCriterion("cpassword >", value, "cpassword");
            return (Criteria) this;
        }

        public Criteria andCpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("cpassword >=", value, "cpassword");
            return (Criteria) this;
        }

        public Criteria andCpasswordLessThan(String value) {
            addCriterion("cpassword <", value, "cpassword");
            return (Criteria) this;
        }

        public Criteria andCpasswordLessThanOrEqualTo(String value) {
            addCriterion("cpassword <=", value, "cpassword");
            return (Criteria) this;
        }

        public Criteria andCpasswordLike(String value) {
            addCriterion("cpassword like", value, "cpassword");
            return (Criteria) this;
        }

        public Criteria andCpasswordNotLike(String value) {
            addCriterion("cpassword not like", value, "cpassword");
            return (Criteria) this;
        }

        public Criteria andCpasswordIn(List<String> values) {
            addCriterion("cpassword in", values, "cpassword");
            return (Criteria) this;
        }

        public Criteria andCpasswordNotIn(List<String> values) {
            addCriterion("cpassword not in", values, "cpassword");
            return (Criteria) this;
        }

        public Criteria andCpasswordBetween(String value1, String value2) {
            addCriterion("cpassword between", value1, value2, "cpassword");
            return (Criteria) this;
        }

        public Criteria andCpasswordNotBetween(String value1, String value2) {
            addCriterion("cpassword not between", value1, value2, "cpassword");
            return (Criteria) this;
        }

        public Criteria andCusernameIsNull() {
            addCriterion("cusername is null");
            return (Criteria) this;
        }

        public Criteria andCusernameIsNotNull() {
            addCriterion("cusername is not null");
            return (Criteria) this;
        }

        public Criteria andCusernameEqualTo(String value) {
            addCriterion("cusername =", value, "cusername");
            return (Criteria) this;
        }

        public Criteria andCusernameNotEqualTo(String value) {
            addCriterion("cusername <>", value, "cusername");
            return (Criteria) this;
        }

        public Criteria andCusernameGreaterThan(String value) {
            addCriterion("cusername >", value, "cusername");
            return (Criteria) this;
        }

        public Criteria andCusernameGreaterThanOrEqualTo(String value) {
            addCriterion("cusername >=", value, "cusername");
            return (Criteria) this;
        }

        public Criteria andCusernameLessThan(String value) {
            addCriterion("cusername <", value, "cusername");
            return (Criteria) this;
        }

        public Criteria andCusernameLessThanOrEqualTo(String value) {
            addCriterion("cusername <=", value, "cusername");
            return (Criteria) this;
        }

        public Criteria andCusernameLike(String value) {
            addCriterion("cusername like", value, "cusername");
            return (Criteria) this;
        }

        public Criteria andCusernameNotLike(String value) {
            addCriterion("cusername not like", value, "cusername");
            return (Criteria) this;
        }

        public Criteria andCusernameIn(List<String> values) {
            addCriterion("cusername in", values, "cusername");
            return (Criteria) this;
        }

        public Criteria andCusernameNotIn(List<String> values) {
            addCriterion("cusername not in", values, "cusername");
            return (Criteria) this;
        }

        public Criteria andCusernameBetween(String value1, String value2) {
            addCriterion("cusername between", value1, value2, "cusername");
            return (Criteria) this;
        }

        public Criteria andCusernameNotBetween(String value1, String value2) {
            addCriterion("cusername not between", value1, value2, "cusername");
            return (Criteria) this;
        }

        public Criteria andCsexIsNull() {
            addCriterion("csex is null");
            return (Criteria) this;
        }

        public Criteria andCsexIsNotNull() {
            addCriterion("csex is not null");
            return (Criteria) this;
        }

        public Criteria andCsexEqualTo(String value) {
            addCriterion("csex =", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexNotEqualTo(String value) {
            addCriterion("csex <>", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexGreaterThan(String value) {
            addCriterion("csex >", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexGreaterThanOrEqualTo(String value) {
            addCriterion("csex >=", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexLessThan(String value) {
            addCriterion("csex <", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexLessThanOrEqualTo(String value) {
            addCriterion("csex <=", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexLike(String value) {
            addCriterion("csex like", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexNotLike(String value) {
            addCriterion("csex not like", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexIn(List<String> values) {
            addCriterion("csex in", values, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexNotIn(List<String> values) {
            addCriterion("csex not in", values, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexBetween(String value1, String value2) {
            addCriterion("csex between", value1, value2, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexNotBetween(String value1, String value2) {
            addCriterion("csex not between", value1, value2, "csex");
            return (Criteria) this;
        }

        public Criteria andCageIsNull() {
            addCriterion("cage is null");
            return (Criteria) this;
        }

        public Criteria andCageIsNotNull() {
            addCriterion("cage is not null");
            return (Criteria) this;
        }

        public Criteria andCageEqualTo(Integer value) {
            addCriterion("cage =", value, "cage");
            return (Criteria) this;
        }

        public Criteria andCageNotEqualTo(Integer value) {
            addCriterion("cage <>", value, "cage");
            return (Criteria) this;
        }

        public Criteria andCageGreaterThan(Integer value) {
            addCriterion("cage >", value, "cage");
            return (Criteria) this;
        }

        public Criteria andCageGreaterThanOrEqualTo(Integer value) {
            addCriterion("cage >=", value, "cage");
            return (Criteria) this;
        }

        public Criteria andCageLessThan(Integer value) {
            addCriterion("cage <", value, "cage");
            return (Criteria) this;
        }

        public Criteria andCageLessThanOrEqualTo(Integer value) {
            addCriterion("cage <=", value, "cage");
            return (Criteria) this;
        }

        public Criteria andCageIn(List<Integer> values) {
            addCriterion("cage in", values, "cage");
            return (Criteria) this;
        }

        public Criteria andCageNotIn(List<Integer> values) {
            addCriterion("cage not in", values, "cage");
            return (Criteria) this;
        }

        public Criteria andCageBetween(Integer value1, Integer value2) {
            addCriterion("cage between", value1, value2, "cage");
            return (Criteria) this;
        }

        public Criteria andCageNotBetween(Integer value1, Integer value2) {
            addCriterion("cage not between", value1, value2, "cage");
            return (Criteria) this;
        }

        public Criteria andCphoneIsNull() {
            addCriterion("cphone is null");
            return (Criteria) this;
        }

        public Criteria andCphoneIsNotNull() {
            addCriterion("cphone is not null");
            return (Criteria) this;
        }

        public Criteria andCphoneEqualTo(String value) {
            addCriterion("cphone =", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotEqualTo(String value) {
            addCriterion("cphone <>", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneGreaterThan(String value) {
            addCriterion("cphone >", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneGreaterThanOrEqualTo(String value) {
            addCriterion("cphone >=", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneLessThan(String value) {
            addCriterion("cphone <", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneLessThanOrEqualTo(String value) {
            addCriterion("cphone <=", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneLike(String value) {
            addCriterion("cphone like", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotLike(String value) {
            addCriterion("cphone not like", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneIn(List<String> values) {
            addCriterion("cphone in", values, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotIn(List<String> values) {
            addCriterion("cphone not in", values, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneBetween(String value1, String value2) {
            addCriterion("cphone between", value1, value2, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotBetween(String value1, String value2) {
            addCriterion("cphone not between", value1, value2, "cphone");
            return (Criteria) this;
        }

        public Criteria andCemailIsNull() {
            addCriterion("cemail is null");
            return (Criteria) this;
        }

        public Criteria andCemailIsNotNull() {
            addCriterion("cemail is not null");
            return (Criteria) this;
        }

        public Criteria andCemailEqualTo(String value) {
            addCriterion("cemail =", value, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailNotEqualTo(String value) {
            addCriterion("cemail <>", value, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailGreaterThan(String value) {
            addCriterion("cemail >", value, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailGreaterThanOrEqualTo(String value) {
            addCriterion("cemail >=", value, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailLessThan(String value) {
            addCriterion("cemail <", value, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailLessThanOrEqualTo(String value) {
            addCriterion("cemail <=", value, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailLike(String value) {
            addCriterion("cemail like", value, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailNotLike(String value) {
            addCriterion("cemail not like", value, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailIn(List<String> values) {
            addCriterion("cemail in", values, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailNotIn(List<String> values) {
            addCriterion("cemail not in", values, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailBetween(String value1, String value2) {
            addCriterion("cemail between", value1, value2, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailNotBetween(String value1, String value2) {
            addCriterion("cemail not between", value1, value2, "cemail");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeIsNull() {
            addCriterion("ccreatetime is null");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeIsNotNull() {
            addCriterion("ccreatetime is not null");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeEqualTo(Date value) {
            addCriterion("ccreatetime =", value, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeNotEqualTo(Date value) {
            addCriterion("ccreatetime <>", value, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeGreaterThan(Date value) {
            addCriterion("ccreatetime >", value, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ccreatetime >=", value, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeLessThan(Date value) {
            addCriterion("ccreatetime <", value, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("ccreatetime <=", value, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeIn(List<Date> values) {
            addCriterion("ccreatetime in", values, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeNotIn(List<Date> values) {
            addCriterion("ccreatetime not in", values, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeBetween(Date value1, Date value2) {
            addCriterion("ccreatetime between", value1, value2, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("ccreatetime not between", value1, value2, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCupdatetimeIsNull() {
            addCriterion("cupdatetime is null");
            return (Criteria) this;
        }

        public Criteria andCupdatetimeIsNotNull() {
            addCriterion("cupdatetime is not null");
            return (Criteria) this;
        }

        public Criteria andCupdatetimeEqualTo(Date value) {
            addCriterion("cupdatetime =", value, "cupdatetime");
            return (Criteria) this;
        }

        public Criteria andCupdatetimeNotEqualTo(Date value) {
            addCriterion("cupdatetime <>", value, "cupdatetime");
            return (Criteria) this;
        }

        public Criteria andCupdatetimeGreaterThan(Date value) {
            addCriterion("cupdatetime >", value, "cupdatetime");
            return (Criteria) this;
        }

        public Criteria andCupdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cupdatetime >=", value, "cupdatetime");
            return (Criteria) this;
        }

        public Criteria andCupdatetimeLessThan(Date value) {
            addCriterion("cupdatetime <", value, "cupdatetime");
            return (Criteria) this;
        }

        public Criteria andCupdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("cupdatetime <=", value, "cupdatetime");
            return (Criteria) this;
        }

        public Criteria andCupdatetimeIn(List<Date> values) {
            addCriterion("cupdatetime in", values, "cupdatetime");
            return (Criteria) this;
        }

        public Criteria andCupdatetimeNotIn(List<Date> values) {
            addCriterion("cupdatetime not in", values, "cupdatetime");
            return (Criteria) this;
        }

        public Criteria andCupdatetimeBetween(Date value1, Date value2) {
            addCriterion("cupdatetime between", value1, value2, "cupdatetime");
            return (Criteria) this;
        }

        public Criteria andCupdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("cupdatetime not between", value1, value2, "cupdatetime");
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