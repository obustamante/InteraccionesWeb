package co.edu.usc.interacciones.dao.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LotesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lotes
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lotes
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lotes
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lotes
     *
     * @mbggenerated
     */
    public LotesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lotes
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lotes
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lotes
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lotes
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lotes
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lotes
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lotes
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lotes
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lotes
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lotes
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lotes
     *
     * @mbggenerated
     */
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdlotesIsNull() {
            addCriterion("idlotes is null");
            return (Criteria) this;
        }

        public Criteria andIdlotesIsNotNull() {
            addCriterion("idlotes is not null");
            return (Criteria) this;
        }

        public Criteria andIdlotesEqualTo(BigDecimal value) {
            addCriterion("idlotes =", value, "idlotes");
            return (Criteria) this;
        }

        public Criteria andIdlotesNotEqualTo(BigDecimal value) {
            addCriterion("idlotes <>", value, "idlotes");
            return (Criteria) this;
        }

        public Criteria andIdlotesGreaterThan(BigDecimal value) {
            addCriterion("idlotes >", value, "idlotes");
            return (Criteria) this;
        }

        public Criteria andIdlotesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("idlotes >=", value, "idlotes");
            return (Criteria) this;
        }

        public Criteria andIdlotesLessThan(BigDecimal value) {
            addCriterion("idlotes <", value, "idlotes");
            return (Criteria) this;
        }

        public Criteria andIdlotesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("idlotes <=", value, "idlotes");
            return (Criteria) this;
        }

        public Criteria andIdlotesIn(List<BigDecimal> values) {
            addCriterion("idlotes in", values, "idlotes");
            return (Criteria) this;
        }

        public Criteria andIdlotesNotIn(List<BigDecimal> values) {
            addCriterion("idlotes not in", values, "idlotes");
            return (Criteria) this;
        }

        public Criteria andIdlotesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("idlotes between", value1, value2, "idlotes");
            return (Criteria) this;
        }

        public Criteria andIdlotesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("idlotes not between", value1, value2, "idlotes");
            return (Criteria) this;
        }

        public Criteria andCumIsNull() {
            addCriterion("cum is null");
            return (Criteria) this;
        }

        public Criteria andCumIsNotNull() {
            addCriterion("cum is not null");
            return (Criteria) this;
        }

        public Criteria andCumEqualTo(String value) {
            addCriterion("cum =", value, "cum");
            return (Criteria) this;
        }

        public Criteria andCumNotEqualTo(String value) {
            addCriterion("cum <>", value, "cum");
            return (Criteria) this;
        }

        public Criteria andCumGreaterThan(String value) {
            addCriterion("cum >", value, "cum");
            return (Criteria) this;
        }

        public Criteria andCumGreaterThanOrEqualTo(String value) {
            addCriterion("cum >=", value, "cum");
            return (Criteria) this;
        }

        public Criteria andCumLessThan(String value) {
            addCriterion("cum <", value, "cum");
            return (Criteria) this;
        }

        public Criteria andCumLessThanOrEqualTo(String value) {
            addCriterion("cum <=", value, "cum");
            return (Criteria) this;
        }

        public Criteria andCumLike(String value) {
            addCriterion("cum like", value, "cum");
            return (Criteria) this;
        }

        public Criteria andCumNotLike(String value) {
            addCriterion("cum not like", value, "cum");
            return (Criteria) this;
        }

        public Criteria andCumIn(List<String> values) {
            addCriterion("cum in", values, "cum");
            return (Criteria) this;
        }

        public Criteria andCumNotIn(List<String> values) {
            addCriterion("cum not in", values, "cum");
            return (Criteria) this;
        }

        public Criteria andCumBetween(String value1, String value2) {
            addCriterion("cum between", value1, value2, "cum");
            return (Criteria) this;
        }

        public Criteria andCumNotBetween(String value1, String value2) {
            addCriterion("cum not between", value1, value2, "cum");
            return (Criteria) this;
        }

        public Criteria andFechavencimientoIsNull() {
            addCriterion("fechavencimiento is null");
            return (Criteria) this;
        }

        public Criteria andFechavencimientoIsNotNull() {
            addCriterion("fechavencimiento is not null");
            return (Criteria) this;
        }

        public Criteria andFechavencimientoEqualTo(Date value) {
            addCriterionForJDBCDate("fechavencimiento =", value, "fechavencimiento");
            return (Criteria) this;
        }

        public Criteria andFechavencimientoNotEqualTo(Date value) {
            addCriterionForJDBCDate("fechavencimiento <>", value, "fechavencimiento");
            return (Criteria) this;
        }

        public Criteria andFechavencimientoGreaterThan(Date value) {
            addCriterionForJDBCDate("fechavencimiento >", value, "fechavencimiento");
            return (Criteria) this;
        }

        public Criteria andFechavencimientoGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fechavencimiento >=", value, "fechavencimiento");
            return (Criteria) this;
        }

        public Criteria andFechavencimientoLessThan(Date value) {
            addCriterionForJDBCDate("fechavencimiento <", value, "fechavencimiento");
            return (Criteria) this;
        }

        public Criteria andFechavencimientoLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fechavencimiento <=", value, "fechavencimiento");
            return (Criteria) this;
        }

        public Criteria andFechavencimientoIn(List<Date> values) {
            addCriterionForJDBCDate("fechavencimiento in", values, "fechavencimiento");
            return (Criteria) this;
        }

        public Criteria andFechavencimientoNotIn(List<Date> values) {
            addCriterionForJDBCDate("fechavencimiento not in", values, "fechavencimiento");
            return (Criteria) this;
        }

        public Criteria andFechavencimientoBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fechavencimiento between", value1, value2, "fechavencimiento");
            return (Criteria) this;
        }

        public Criteria andFechavencimientoNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fechavencimiento not between", value1, value2, "fechavencimiento");
            return (Criteria) this;
        }

        public Criteria andCantidadIsNull() {
            addCriterion("cantidad is null");
            return (Criteria) this;
        }

        public Criteria andCantidadIsNotNull() {
            addCriterion("cantidad is not null");
            return (Criteria) this;
        }

        public Criteria andCantidadEqualTo(Integer value) {
            addCriterion("cantidad =", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadNotEqualTo(Integer value) {
            addCriterion("cantidad <>", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadGreaterThan(Integer value) {
            addCriterion("cantidad >", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadGreaterThanOrEqualTo(Integer value) {
            addCriterion("cantidad >=", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadLessThan(Integer value) {
            addCriterion("cantidad <", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadLessThanOrEqualTo(Integer value) {
            addCriterion("cantidad <=", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadIn(List<Integer> values) {
            addCriterion("cantidad in", values, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadNotIn(List<Integer> values) {
            addCriterion("cantidad not in", values, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadBetween(Integer value1, Integer value2) {
            addCriterion("cantidad between", value1, value2, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadNotBetween(Integer value1, Integer value2) {
            addCriterion("cantidad not between", value1, value2, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCumLikeInsensitive(String value) {
            addCriterion("upper(cum) like", value.toUpperCase(), "cum");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lotes
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lotes
     *
     * @mbggenerated
     */
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