package cn.edu.imufe.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCartypeidIsNull() {
            addCriterion("cartypeid is null");
            return (Criteria) this;
        }

        public Criteria andCartypeidIsNotNull() {
            addCriterion("cartypeid is not null");
            return (Criteria) this;
        }

        public Criteria andCartypeidEqualTo(Integer value) {
            addCriterion("cartypeid =", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidNotEqualTo(Integer value) {
            addCriterion("cartypeid <>", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidGreaterThan(Integer value) {
            addCriterion("cartypeid >", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cartypeid >=", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidLessThan(Integer value) {
            addCriterion("cartypeid <", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidLessThanOrEqualTo(Integer value) {
            addCriterion("cartypeid <=", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidIn(List<Integer> values) {
            addCriterion("cartypeid in", values, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidNotIn(List<Integer> values) {
            addCriterion("cartypeid not in", values, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidBetween(Integer value1, Integer value2) {
            addCriterion("cartypeid between", value1, value2, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("cartypeid not between", value1, value2, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNull() {
            addCriterion("brandid is null");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNotNull() {
            addCriterion("brandid is not null");
            return (Criteria) this;
        }

        public Criteria andBrandidEqualTo(Integer value) {
            addCriterion("brandid =", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotEqualTo(Integer value) {
            addCriterion("brandid <>", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThan(Integer value) {
            addCriterion("brandid >", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThanOrEqualTo(Integer value) {
            addCriterion("brandid >=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThan(Integer value) {
            addCriterion("brandid <", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThanOrEqualTo(Integer value) {
            addCriterion("brandid <=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidIn(List<Integer> values) {
            addCriterion("brandid in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotIn(List<Integer> values) {
            addCriterion("brandid not in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidBetween(Integer value1, Integer value2) {
            addCriterion("brandid between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotBetween(Integer value1, Integer value2) {
            addCriterion("brandid not between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andHotIsNull() {
            addCriterion("hot is null");
            return (Criteria) this;
        }

        public Criteria andHotIsNotNull() {
            addCriterion("hot is not null");
            return (Criteria) this;
        }

        public Criteria andHotEqualTo(Integer value) {
            addCriterion("hot =", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotEqualTo(Integer value) {
            addCriterion("hot <>", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotGreaterThan(Integer value) {
            addCriterion("hot >", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotGreaterThanOrEqualTo(Integer value) {
            addCriterion("hot >=", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotLessThan(Integer value) {
            addCriterion("hot <", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotLessThanOrEqualTo(Integer value) {
            addCriterion("hot <=", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotIn(List<Integer> values) {
            addCriterion("hot in", values, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotIn(List<Integer> values) {
            addCriterion("hot not in", values, "hot");
            return (Criteria) this;
        }

        public Criteria andHotBetween(Integer value1, Integer value2) {
            addCriterion("hot between", value1, value2, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotBetween(Integer value1, Integer value2) {
            addCriterion("hot not between", value1, value2, "hot");
            return (Criteria) this;
        }

        public Criteria andSeatcntIsNull() {
            addCriterion("seatcnt is null");
            return (Criteria) this;
        }

        public Criteria andSeatcntIsNotNull() {
            addCriterion("seatcnt is not null");
            return (Criteria) this;
        }

        public Criteria andSeatcntEqualTo(Integer value) {
            addCriterion("seatcnt =", value, "seatcnt");
            return (Criteria) this;
        }

        public Criteria andSeatcntNotEqualTo(Integer value) {
            addCriterion("seatcnt <>", value, "seatcnt");
            return (Criteria) this;
        }

        public Criteria andSeatcntGreaterThan(Integer value) {
            addCriterion("seatcnt >", value, "seatcnt");
            return (Criteria) this;
        }

        public Criteria andSeatcntGreaterThanOrEqualTo(Integer value) {
            addCriterion("seatcnt >=", value, "seatcnt");
            return (Criteria) this;
        }

        public Criteria andSeatcntLessThan(Integer value) {
            addCriterion("seatcnt <", value, "seatcnt");
            return (Criteria) this;
        }

        public Criteria andSeatcntLessThanOrEqualTo(Integer value) {
            addCriterion("seatcnt <=", value, "seatcnt");
            return (Criteria) this;
        }

        public Criteria andSeatcntIn(List<Integer> values) {
            addCriterion("seatcnt in", values, "seatcnt");
            return (Criteria) this;
        }

        public Criteria andSeatcntNotIn(List<Integer> values) {
            addCriterion("seatcnt not in", values, "seatcnt");
            return (Criteria) this;
        }

        public Criteria andSeatcntBetween(Integer value1, Integer value2) {
            addCriterion("seatcnt between", value1, value2, "seatcnt");
            return (Criteria) this;
        }

        public Criteria andSeatcntNotBetween(Integer value1, Integer value2) {
            addCriterion("seatcnt not between", value1, value2, "seatcnt");
            return (Criteria) this;
        }

        public Criteria andGearIsNull() {
            addCriterion("gear is null");
            return (Criteria) this;
        }

        public Criteria andGearIsNotNull() {
            addCriterion("gear is not null");
            return (Criteria) this;
        }

        public Criteria andGearEqualTo(String value) {
            addCriterion("gear =", value, "gear");
            return (Criteria) this;
        }

        public Criteria andGearNotEqualTo(String value) {
            addCriterion("gear <>", value, "gear");
            return (Criteria) this;
        }

        public Criteria andGearGreaterThan(String value) {
            addCriterion("gear >", value, "gear");
            return (Criteria) this;
        }

        public Criteria andGearGreaterThanOrEqualTo(String value) {
            addCriterion("gear >=", value, "gear");
            return (Criteria) this;
        }

        public Criteria andGearLessThan(String value) {
            addCriterion("gear <", value, "gear");
            return (Criteria) this;
        }

        public Criteria andGearLessThanOrEqualTo(String value) {
            addCriterion("gear <=", value, "gear");
            return (Criteria) this;
        }

        public Criteria andGearLike(String value) {
            addCriterion("gear like", value, "gear");
            return (Criteria) this;
        }

        public Criteria andGearNotLike(String value) {
            addCriterion("gear not like", value, "gear");
            return (Criteria) this;
        }

        public Criteria andGearIn(List<String> values) {
            addCriterion("gear in", values, "gear");
            return (Criteria) this;
        }

        public Criteria andGearNotIn(List<String> values) {
            addCriterion("gear not in", values, "gear");
            return (Criteria) this;
        }

        public Criteria andGearBetween(String value1, String value2) {
            addCriterion("gear between", value1, value2, "gear");
            return (Criteria) this;
        }

        public Criteria andGearNotBetween(String value1, String value2) {
            addCriterion("gear not between", value1, value2, "gear");
            return (Criteria) this;
        }

        public Criteria andTrunkcntIsNull() {
            addCriterion("trunkcnt is null");
            return (Criteria) this;
        }

        public Criteria andTrunkcntIsNotNull() {
            addCriterion("trunkcnt is not null");
            return (Criteria) this;
        }

        public Criteria andTrunkcntEqualTo(Integer value) {
            addCriterion("trunkcnt =", value, "trunkcnt");
            return (Criteria) this;
        }

        public Criteria andTrunkcntNotEqualTo(Integer value) {
            addCriterion("trunkcnt <>", value, "trunkcnt");
            return (Criteria) this;
        }

        public Criteria andTrunkcntGreaterThan(Integer value) {
            addCriterion("trunkcnt >", value, "trunkcnt");
            return (Criteria) this;
        }

        public Criteria andTrunkcntGreaterThanOrEqualTo(Integer value) {
            addCriterion("trunkcnt >=", value, "trunkcnt");
            return (Criteria) this;
        }

        public Criteria andTrunkcntLessThan(Integer value) {
            addCriterion("trunkcnt <", value, "trunkcnt");
            return (Criteria) this;
        }

        public Criteria andTrunkcntLessThanOrEqualTo(Integer value) {
            addCriterion("trunkcnt <=", value, "trunkcnt");
            return (Criteria) this;
        }

        public Criteria andTrunkcntIn(List<Integer> values) {
            addCriterion("trunkcnt in", values, "trunkcnt");
            return (Criteria) this;
        }

        public Criteria andTrunkcntNotIn(List<Integer> values) {
            addCriterion("trunkcnt not in", values, "trunkcnt");
            return (Criteria) this;
        }

        public Criteria andTrunkcntBetween(Integer value1, Integer value2) {
            addCriterion("trunkcnt between", value1, value2, "trunkcnt");
            return (Criteria) this;
        }

        public Criteria andTrunkcntNotBetween(Integer value1, Integer value2) {
            addCriterion("trunkcnt not between", value1, value2, "trunkcnt");
            return (Criteria) this;
        }

        public Criteria andRidecntIsNull() {
            addCriterion("ridecnt is null");
            return (Criteria) this;
        }

        public Criteria andRidecntIsNotNull() {
            addCriterion("ridecnt is not null");
            return (Criteria) this;
        }

        public Criteria andRidecntEqualTo(Integer value) {
            addCriterion("ridecnt =", value, "ridecnt");
            return (Criteria) this;
        }

        public Criteria andRidecntNotEqualTo(Integer value) {
            addCriterion("ridecnt <>", value, "ridecnt");
            return (Criteria) this;
        }

        public Criteria andRidecntGreaterThan(Integer value) {
            addCriterion("ridecnt >", value, "ridecnt");
            return (Criteria) this;
        }

        public Criteria andRidecntGreaterThanOrEqualTo(Integer value) {
            addCriterion("ridecnt >=", value, "ridecnt");
            return (Criteria) this;
        }

        public Criteria andRidecntLessThan(Integer value) {
            addCriterion("ridecnt <", value, "ridecnt");
            return (Criteria) this;
        }

        public Criteria andRidecntLessThanOrEqualTo(Integer value) {
            addCriterion("ridecnt <=", value, "ridecnt");
            return (Criteria) this;
        }

        public Criteria andRidecntIn(List<Integer> values) {
            addCriterion("ridecnt in", values, "ridecnt");
            return (Criteria) this;
        }

        public Criteria andRidecntNotIn(List<Integer> values) {
            addCriterion("ridecnt not in", values, "ridecnt");
            return (Criteria) this;
        }

        public Criteria andRidecntBetween(Integer value1, Integer value2) {
            addCriterion("ridecnt between", value1, value2, "ridecnt");
            return (Criteria) this;
        }

        public Criteria andRidecntNotBetween(Integer value1, Integer value2) {
            addCriterion("ridecnt not between", value1, value2, "ridecnt");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSurplusnumIsNull() {
            addCriterion("surplusnum is null");
            return (Criteria) this;
        }

        public Criteria andSurplusnumIsNotNull() {
            addCriterion("surplusnum is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusnumEqualTo(Integer value) {
            addCriterion("surplusnum =", value, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumNotEqualTo(Integer value) {
            addCriterion("surplusnum <>", value, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumGreaterThan(Integer value) {
            addCriterion("surplusnum >", value, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("surplusnum >=", value, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumLessThan(Integer value) {
            addCriterion("surplusnum <", value, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumLessThanOrEqualTo(Integer value) {
            addCriterion("surplusnum <=", value, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumIn(List<Integer> values) {
            addCriterion("surplusnum in", values, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumNotIn(List<Integer> values) {
            addCriterion("surplusnum not in", values, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumBetween(Integer value1, Integer value2) {
            addCriterion("surplusnum between", value1, value2, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumNotBetween(Integer value1, Integer value2) {
            addCriterion("surplusnum not between", value1, value2, "surplusnum");
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