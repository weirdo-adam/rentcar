package cn.edu.imufe.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
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

        public Criteria andCaridIsNull() {
            addCriterion("carid is null");
            return (Criteria) this;
        }

        public Criteria andCaridIsNotNull() {
            addCriterion("carid is not null");
            return (Criteria) this;
        }

        public Criteria andCaridEqualTo(Integer value) {
            addCriterion("carid =", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotEqualTo(Integer value) {
            addCriterion("carid <>", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThan(Integer value) {
            addCriterion("carid >", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThanOrEqualTo(Integer value) {
            addCriterion("carid >=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThan(Integer value) {
            addCriterion("carid <", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThanOrEqualTo(Integer value) {
            addCriterion("carid <=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridIn(List<Integer> values) {
            addCriterion("carid in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotIn(List<Integer> values) {
            addCriterion("carid not in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridBetween(Integer value1, Integer value2) {
            addCriterion("carid between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotBetween(Integer value1, Integer value2) {
            addCriterion("carid not between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andPricecntIsNull() {
            addCriterion("pricecnt is null");
            return (Criteria) this;
        }

        public Criteria andPricecntIsNotNull() {
            addCriterion("pricecnt is not null");
            return (Criteria) this;
        }

        public Criteria andPricecntEqualTo(Integer value) {
            addCriterion("pricecnt =", value, "pricecnt");
            return (Criteria) this;
        }

        public Criteria andPricecntNotEqualTo(Integer value) {
            addCriterion("pricecnt <>", value, "pricecnt");
            return (Criteria) this;
        }

        public Criteria andPricecntGreaterThan(Integer value) {
            addCriterion("pricecnt >", value, "pricecnt");
            return (Criteria) this;
        }

        public Criteria andPricecntGreaterThanOrEqualTo(Integer value) {
            addCriterion("pricecnt >=", value, "pricecnt");
            return (Criteria) this;
        }

        public Criteria andPricecntLessThan(Integer value) {
            addCriterion("pricecnt <", value, "pricecnt");
            return (Criteria) this;
        }

        public Criteria andPricecntLessThanOrEqualTo(Integer value) {
            addCriterion("pricecnt <=", value, "pricecnt");
            return (Criteria) this;
        }

        public Criteria andPricecntIn(List<Integer> values) {
            addCriterion("pricecnt in", values, "pricecnt");
            return (Criteria) this;
        }

        public Criteria andPricecntNotIn(List<Integer> values) {
            addCriterion("pricecnt not in", values, "pricecnt");
            return (Criteria) this;
        }

        public Criteria andPricecntBetween(Integer value1, Integer value2) {
            addCriterion("pricecnt between", value1, value2, "pricecnt");
            return (Criteria) this;
        }

        public Criteria andPricecntNotBetween(Integer value1, Integer value2) {
            addCriterion("pricecnt not between", value1, value2, "pricecnt");
            return (Criteria) this;
        }

        public Criteria andExtractuidIsNull() {
            addCriterion("extractuid is null");
            return (Criteria) this;
        }

        public Criteria andExtractuidIsNotNull() {
            addCriterion("extractuid is not null");
            return (Criteria) this;
        }

        public Criteria andExtractuidEqualTo(Integer value) {
            addCriterion("extractuid =", value, "extractuid");
            return (Criteria) this;
        }

        public Criteria andExtractuidNotEqualTo(Integer value) {
            addCriterion("extractuid <>", value, "extractuid");
            return (Criteria) this;
        }

        public Criteria andExtractuidGreaterThan(Integer value) {
            addCriterion("extractuid >", value, "extractuid");
            return (Criteria) this;
        }

        public Criteria andExtractuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("extractuid >=", value, "extractuid");
            return (Criteria) this;
        }

        public Criteria andExtractuidLessThan(Integer value) {
            addCriterion("extractuid <", value, "extractuid");
            return (Criteria) this;
        }

        public Criteria andExtractuidLessThanOrEqualTo(Integer value) {
            addCriterion("extractuid <=", value, "extractuid");
            return (Criteria) this;
        }

        public Criteria andExtractuidIn(List<Integer> values) {
            addCriterion("extractuid in", values, "extractuid");
            return (Criteria) this;
        }

        public Criteria andExtractuidNotIn(List<Integer> values) {
            addCriterion("extractuid not in", values, "extractuid");
            return (Criteria) this;
        }

        public Criteria andExtractuidBetween(Integer value1, Integer value2) {
            addCriterion("extractuid between", value1, value2, "extractuid");
            return (Criteria) this;
        }

        public Criteria andExtractuidNotBetween(Integer value1, Integer value2) {
            addCriterion("extractuid not between", value1, value2, "extractuid");
            return (Criteria) this;
        }

        public Criteria andExtractlocationIsNull() {
            addCriterion("extractlocation is null");
            return (Criteria) this;
        }

        public Criteria andExtractlocationIsNotNull() {
            addCriterion("extractlocation is not null");
            return (Criteria) this;
        }

        public Criteria andExtractlocationEqualTo(String value) {
            addCriterion("extractlocation =", value, "extractlocation");
            return (Criteria) this;
        }

        public Criteria andExtractlocationNotEqualTo(String value) {
            addCriterion("extractlocation <>", value, "extractlocation");
            return (Criteria) this;
        }

        public Criteria andExtractlocationGreaterThan(String value) {
            addCriterion("extractlocation >", value, "extractlocation");
            return (Criteria) this;
        }

        public Criteria andExtractlocationGreaterThanOrEqualTo(String value) {
            addCriterion("extractlocation >=", value, "extractlocation");
            return (Criteria) this;
        }

        public Criteria andExtractlocationLessThan(String value) {
            addCriterion("extractlocation <", value, "extractlocation");
            return (Criteria) this;
        }

        public Criteria andExtractlocationLessThanOrEqualTo(String value) {
            addCriterion("extractlocation <=", value, "extractlocation");
            return (Criteria) this;
        }

        public Criteria andExtractlocationLike(String value) {
            addCriterion("extractlocation like", value, "extractlocation");
            return (Criteria) this;
        }

        public Criteria andExtractlocationNotLike(String value) {
            addCriterion("extractlocation not like", value, "extractlocation");
            return (Criteria) this;
        }

        public Criteria andExtractlocationIn(List<String> values) {
            addCriterion("extractlocation in", values, "extractlocation");
            return (Criteria) this;
        }

        public Criteria andExtractlocationNotIn(List<String> values) {
            addCriterion("extractlocation not in", values, "extractlocation");
            return (Criteria) this;
        }

        public Criteria andExtractlocationBetween(String value1, String value2) {
            addCriterion("extractlocation between", value1, value2, "extractlocation");
            return (Criteria) this;
        }

        public Criteria andExtractlocationNotBetween(String value1, String value2) {
            addCriterion("extractlocation not between", value1, value2, "extractlocation");
            return (Criteria) this;
        }

        public Criteria andExtractdateIsNull() {
            addCriterion("extractdate is null");
            return (Criteria) this;
        }

        public Criteria andExtractdateIsNotNull() {
            addCriterion("extractdate is not null");
            return (Criteria) this;
        }

        public Criteria andExtractdateEqualTo(Date value) {
            addCriterion("extractdate =", value, "extractdate");
            return (Criteria) this;
        }

        public Criteria andExtractdateNotEqualTo(Date value) {
            addCriterion("extractdate <>", value, "extractdate");
            return (Criteria) this;
        }

        public Criteria andExtractdateGreaterThan(Date value) {
            addCriterion("extractdate >", value, "extractdate");
            return (Criteria) this;
        }

        public Criteria andExtractdateGreaterThanOrEqualTo(Date value) {
            addCriterion("extractdate >=", value, "extractdate");
            return (Criteria) this;
        }

        public Criteria andExtractdateLessThan(Date value) {
            addCriterion("extractdate <", value, "extractdate");
            return (Criteria) this;
        }

        public Criteria andExtractdateLessThanOrEqualTo(Date value) {
            addCriterion("extractdate <=", value, "extractdate");
            return (Criteria) this;
        }

        public Criteria andExtractdateIn(List<Date> values) {
            addCriterion("extractdate in", values, "extractdate");
            return (Criteria) this;
        }

        public Criteria andExtractdateNotIn(List<Date> values) {
            addCriterion("extractdate not in", values, "extractdate");
            return (Criteria) this;
        }

        public Criteria andExtractdateBetween(Date value1, Date value2) {
            addCriterion("extractdate between", value1, value2, "extractdate");
            return (Criteria) this;
        }

        public Criteria andExtractdateNotBetween(Date value1, Date value2) {
            addCriterion("extractdate not between", value1, value2, "extractdate");
            return (Criteria) this;
        }

        public Criteria andStilluidIsNull() {
            addCriterion("stilluid is null");
            return (Criteria) this;
        }

        public Criteria andStilluidIsNotNull() {
            addCriterion("stilluid is not null");
            return (Criteria) this;
        }

        public Criteria andStilluidEqualTo(Integer value) {
            addCriterion("stilluid =", value, "stilluid");
            return (Criteria) this;
        }

        public Criteria andStilluidNotEqualTo(Integer value) {
            addCriterion("stilluid <>", value, "stilluid");
            return (Criteria) this;
        }

        public Criteria andStilluidGreaterThan(Integer value) {
            addCriterion("stilluid >", value, "stilluid");
            return (Criteria) this;
        }

        public Criteria andStilluidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stilluid >=", value, "stilluid");
            return (Criteria) this;
        }

        public Criteria andStilluidLessThan(Integer value) {
            addCriterion("stilluid <", value, "stilluid");
            return (Criteria) this;
        }

        public Criteria andStilluidLessThanOrEqualTo(Integer value) {
            addCriterion("stilluid <=", value, "stilluid");
            return (Criteria) this;
        }

        public Criteria andStilluidIn(List<Integer> values) {
            addCriterion("stilluid in", values, "stilluid");
            return (Criteria) this;
        }

        public Criteria andStilluidNotIn(List<Integer> values) {
            addCriterion("stilluid not in", values, "stilluid");
            return (Criteria) this;
        }

        public Criteria andStilluidBetween(Integer value1, Integer value2) {
            addCriterion("stilluid between", value1, value2, "stilluid");
            return (Criteria) this;
        }

        public Criteria andStilluidNotBetween(Integer value1, Integer value2) {
            addCriterion("stilluid not between", value1, value2, "stilluid");
            return (Criteria) this;
        }

        public Criteria andStilllocationIsNull() {
            addCriterion("stilllocation is null");
            return (Criteria) this;
        }

        public Criteria andStilllocationIsNotNull() {
            addCriterion("stilllocation is not null");
            return (Criteria) this;
        }

        public Criteria andStilllocationEqualTo(String value) {
            addCriterion("stilllocation =", value, "stilllocation");
            return (Criteria) this;
        }

        public Criteria andStilllocationNotEqualTo(String value) {
            addCriterion("stilllocation <>", value, "stilllocation");
            return (Criteria) this;
        }

        public Criteria andStilllocationGreaterThan(String value) {
            addCriterion("stilllocation >", value, "stilllocation");
            return (Criteria) this;
        }

        public Criteria andStilllocationGreaterThanOrEqualTo(String value) {
            addCriterion("stilllocation >=", value, "stilllocation");
            return (Criteria) this;
        }

        public Criteria andStilllocationLessThan(String value) {
            addCriterion("stilllocation <", value, "stilllocation");
            return (Criteria) this;
        }

        public Criteria andStilllocationLessThanOrEqualTo(String value) {
            addCriterion("stilllocation <=", value, "stilllocation");
            return (Criteria) this;
        }

        public Criteria andStilllocationLike(String value) {
            addCriterion("stilllocation like", value, "stilllocation");
            return (Criteria) this;
        }

        public Criteria andStilllocationNotLike(String value) {
            addCriterion("stilllocation not like", value, "stilllocation");
            return (Criteria) this;
        }

        public Criteria andStilllocationIn(List<String> values) {
            addCriterion("stilllocation in", values, "stilllocation");
            return (Criteria) this;
        }

        public Criteria andStilllocationNotIn(List<String> values) {
            addCriterion("stilllocation not in", values, "stilllocation");
            return (Criteria) this;
        }

        public Criteria andStilllocationBetween(String value1, String value2) {
            addCriterion("stilllocation between", value1, value2, "stilllocation");
            return (Criteria) this;
        }

        public Criteria andStilllocationNotBetween(String value1, String value2) {
            addCriterion("stilllocation not between", value1, value2, "stilllocation");
            return (Criteria) this;
        }

        public Criteria andStilldateIsNull() {
            addCriterion("stilldate is null");
            return (Criteria) this;
        }

        public Criteria andStilldateIsNotNull() {
            addCriterion("stilldate is not null");
            return (Criteria) this;
        }

        public Criteria andStilldateEqualTo(Date value) {
            addCriterion("stilldate =", value, "stilldate");
            return (Criteria) this;
        }

        public Criteria andStilldateNotEqualTo(Date value) {
            addCriterion("stilldate <>", value, "stilldate");
            return (Criteria) this;
        }

        public Criteria andStilldateGreaterThan(Date value) {
            addCriterion("stilldate >", value, "stilldate");
            return (Criteria) this;
        }

        public Criteria andStilldateGreaterThanOrEqualTo(Date value) {
            addCriterion("stilldate >=", value, "stilldate");
            return (Criteria) this;
        }

        public Criteria andStilldateLessThan(Date value) {
            addCriterion("stilldate <", value, "stilldate");
            return (Criteria) this;
        }

        public Criteria andStilldateLessThanOrEqualTo(Date value) {
            addCriterion("stilldate <=", value, "stilldate");
            return (Criteria) this;
        }

        public Criteria andStilldateIn(List<Date> values) {
            addCriterion("stilldate in", values, "stilldate");
            return (Criteria) this;
        }

        public Criteria andStilldateNotIn(List<Date> values) {
            addCriterion("stilldate not in", values, "stilldate");
            return (Criteria) this;
        }

        public Criteria andStilldateBetween(Date value1, Date value2) {
            addCriterion("stilldate between", value1, value2, "stilldate");
            return (Criteria) this;
        }

        public Criteria andStilldateNotBetween(Date value1, Date value2) {
            addCriterion("stilldate not between", value1, value2, "stilldate");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
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