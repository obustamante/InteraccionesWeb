package co.edu.usc.interacciones.dao.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ComponentesactivosExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table usc.componentesactivos
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table usc.componentesactivos
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table usc.componentesactivos
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usc.componentesactivos
     *
     * @mbggenerated
     */
    public ComponentesactivosExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usc.componentesactivos
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usc.componentesactivos
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usc.componentesactivos
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usc.componentesactivos
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usc.componentesactivos
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usc.componentesactivos
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usc.componentesactivos
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
     * This method corresponds to the database table usc.componentesactivos
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
     * This method corresponds to the database table usc.componentesactivos
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usc.componentesactivos
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
     * This class corresponds to the database table usc.componentesactivos
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

        public Criteria andComponentesCodigoatcIsNull() {
            addCriterion("componentes_codigoatc is null");
            return (Criteria) this;
        }

        public Criteria andComponentesCodigoatcIsNotNull() {
            addCriterion("componentes_codigoatc is not null");
            return (Criteria) this;
        }

        public Criteria andComponentesCodigoatcEqualTo(String value) {
            addCriterion("componentes_codigoatc =", value, "componentesCodigoatc");
            return (Criteria) this;
        }

        public Criteria andComponentesCodigoatcNotEqualTo(String value) {
            addCriterion("componentes_codigoatc <>", value, "componentesCodigoatc");
            return (Criteria) this;
        }

        public Criteria andComponentesCodigoatcGreaterThan(String value) {
            addCriterion("componentes_codigoatc >", value, "componentesCodigoatc");
            return (Criteria) this;
        }

        public Criteria andComponentesCodigoatcGreaterThanOrEqualTo(String value) {
            addCriterion("componentes_codigoatc >=", value, "componentesCodigoatc");
            return (Criteria) this;
        }

        public Criteria andComponentesCodigoatcLessThan(String value) {
            addCriterion("componentes_codigoatc <", value, "componentesCodigoatc");
            return (Criteria) this;
        }

        public Criteria andComponentesCodigoatcLessThanOrEqualTo(String value) {
            addCriterion("componentes_codigoatc <=", value, "componentesCodigoatc");
            return (Criteria) this;
        }

        public Criteria andComponentesCodigoatcLike(String value) {
            addCriterion("componentes_codigoatc like", value, "componentesCodigoatc");
            return (Criteria) this;
        }

        public Criteria andComponentesCodigoatcNotLike(String value) {
            addCriterion("componentes_codigoatc not like", value, "componentesCodigoatc");
            return (Criteria) this;
        }

        public Criteria andComponentesCodigoatcIn(List<String> values) {
            addCriterion("componentes_codigoatc in", values, "componentesCodigoatc");
            return (Criteria) this;
        }

        public Criteria andComponentesCodigoatcNotIn(List<String> values) {
            addCriterion("componentes_codigoatc not in", values, "componentesCodigoatc");
            return (Criteria) this;
        }

        public Criteria andComponentesCodigoatcBetween(String value1, String value2) {
            addCriterion("componentes_codigoatc between", value1, value2, "componentesCodigoatc");
            return (Criteria) this;
        }

        public Criteria andComponentesCodigoatcNotBetween(String value1, String value2) {
            addCriterion("componentes_codigoatc not between", value1, value2, "componentesCodigoatc");
            return (Criteria) this;
        }

        public Criteria andIdcodigoinvimaIsNull() {
            addCriterion("idcodigoinvima is null");
            return (Criteria) this;
        }

        public Criteria andIdcodigoinvimaIsNotNull() {
            addCriterion("idcodigoinvima is not null");
            return (Criteria) this;
        }

        public Criteria andIdcodigoinvimaEqualTo(BigDecimal value) {
            addCriterion("idcodigoinvima =", value, "idcodigoinvima");
            return (Criteria) this;
        }

        public Criteria andIdcodigoinvimaNotEqualTo(BigDecimal value) {
            addCriterion("idcodigoinvima <>", value, "idcodigoinvima");
            return (Criteria) this;
        }

        public Criteria andIdcodigoinvimaGreaterThan(BigDecimal value) {
            addCriterion("idcodigoinvima >", value, "idcodigoinvima");
            return (Criteria) this;
        }

        public Criteria andIdcodigoinvimaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("idcodigoinvima >=", value, "idcodigoinvima");
            return (Criteria) this;
        }

        public Criteria andIdcodigoinvimaLessThan(BigDecimal value) {
            addCriterion("idcodigoinvima <", value, "idcodigoinvima");
            return (Criteria) this;
        }

        public Criteria andIdcodigoinvimaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("idcodigoinvima <=", value, "idcodigoinvima");
            return (Criteria) this;
        }

        public Criteria andIdcodigoinvimaIn(List<BigDecimal> values) {
            addCriterion("idcodigoinvima in", values, "idcodigoinvima");
            return (Criteria) this;
        }

        public Criteria andIdcodigoinvimaNotIn(List<BigDecimal> values) {
            addCriterion("idcodigoinvima not in", values, "idcodigoinvima");
            return (Criteria) this;
        }

        public Criteria andIdcodigoinvimaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("idcodigoinvima between", value1, value2, "idcodigoinvima");
            return (Criteria) this;
        }

        public Criteria andIdcodigoinvimaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("idcodigoinvima not between", value1, value2, "idcodigoinvima");
            return (Criteria) this;
        }

        public Criteria andComponentesCodigoatcLikeInsensitive(String value) {
            addCriterion("upper(componentes_codigoatc) like", value.toUpperCase(), "componentesCodigoatc");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table usc.componentesactivos
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
     * This class corresponds to the database table usc.componentesactivos
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
    }
}