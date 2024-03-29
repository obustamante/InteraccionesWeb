package co.edu.usc.interacciones.dao.model;

import java.util.ArrayList;
import java.util.List;

public class ComponentesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table componentes
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table componentes
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table componentes
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table componentes
     *
     * @mbggenerated
     */
    public ComponentesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table componentes
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table componentes
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table componentes
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table componentes
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table componentes
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table componentes
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table componentes
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
     * This method corresponds to the database table componentes
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
     * This method corresponds to the database table componentes
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table componentes
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
     * This class corresponds to the database table componentes
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

        public Criteria andCodigoatcIsNull() {
            addCriterion("codigoatc is null");
            return (Criteria) this;
        }

        public Criteria andCodigoatcIsNotNull() {
            addCriterion("codigoatc is not null");
            return (Criteria) this;
        }

        public Criteria andCodigoatcEqualTo(String value) {
            addCriterion("codigoatc =", value, "codigoatc");
            return (Criteria) this;
        }

        public Criteria andCodigoatcNotEqualTo(String value) {
            addCriterion("codigoatc <>", value, "codigoatc");
            return (Criteria) this;
        }

        public Criteria andCodigoatcGreaterThan(String value) {
            addCriterion("codigoatc >", value, "codigoatc");
            return (Criteria) this;
        }

        public Criteria andCodigoatcGreaterThanOrEqualTo(String value) {
            addCriterion("codigoatc >=", value, "codigoatc");
            return (Criteria) this;
        }

        public Criteria andCodigoatcLessThan(String value) {
            addCriterion("codigoatc <", value, "codigoatc");
            return (Criteria) this;
        }

        public Criteria andCodigoatcLessThanOrEqualTo(String value) {
            addCriterion("codigoatc <=", value, "codigoatc");
            return (Criteria) this;
        }

        public Criteria andCodigoatcLike(String value) {
            addCriterion("codigoatc like", value, "codigoatc");
            return (Criteria) this;
        }

        public Criteria andCodigoatcNotLike(String value) {
            addCriterion("codigoatc not like", value, "codigoatc");
            return (Criteria) this;
        }

        public Criteria andCodigoatcIn(List<String> values) {
            addCriterion("codigoatc in", values, "codigoatc");
            return (Criteria) this;
        }

        public Criteria andCodigoatcNotIn(List<String> values) {
            addCriterion("codigoatc not in", values, "codigoatc");
            return (Criteria) this;
        }

        public Criteria andCodigoatcBetween(String value1, String value2) {
            addCriterion("codigoatc between", value1, value2, "codigoatc");
            return (Criteria) this;
        }

        public Criteria andCodigoatcNotBetween(String value1, String value2) {
            addCriterion("codigoatc not between", value1, value2, "codigoatc");
            return (Criteria) this;
        }

        public Criteria andCategoriapadreIsNull() {
            addCriterion("categoriapadre is null");
            return (Criteria) this;
        }

        public Criteria andCategoriapadreIsNotNull() {
            addCriterion("categoriapadre is not null");
            return (Criteria) this;
        }

        public Criteria andCategoriapadreEqualTo(String value) {
            addCriterion("categoriapadre =", value, "categoriapadre");
            return (Criteria) this;
        }

        public Criteria andCategoriapadreNotEqualTo(String value) {
            addCriterion("categoriapadre <>", value, "categoriapadre");
            return (Criteria) this;
        }

        public Criteria andCategoriapadreGreaterThan(String value) {
            addCriterion("categoriapadre >", value, "categoriapadre");
            return (Criteria) this;
        }

        public Criteria andCategoriapadreGreaterThanOrEqualTo(String value) {
            addCriterion("categoriapadre >=", value, "categoriapadre");
            return (Criteria) this;
        }

        public Criteria andCategoriapadreLessThan(String value) {
            addCriterion("categoriapadre <", value, "categoriapadre");
            return (Criteria) this;
        }

        public Criteria andCategoriapadreLessThanOrEqualTo(String value) {
            addCriterion("categoriapadre <=", value, "categoriapadre");
            return (Criteria) this;
        }

        public Criteria andCategoriapadreLike(String value) {
            addCriterion("categoriapadre like", value, "categoriapadre");
            return (Criteria) this;
        }

        public Criteria andCategoriapadreNotLike(String value) {
            addCriterion("categoriapadre not like", value, "categoriapadre");
            return (Criteria) this;
        }

        public Criteria andCategoriapadreIn(List<String> values) {
            addCriterion("categoriapadre in", values, "categoriapadre");
            return (Criteria) this;
        }

        public Criteria andCategoriapadreNotIn(List<String> values) {
            addCriterion("categoriapadre not in", values, "categoriapadre");
            return (Criteria) this;
        }

        public Criteria andCategoriapadreBetween(String value1, String value2) {
            addCriterion("categoriapadre between", value1, value2, "categoriapadre");
            return (Criteria) this;
        }

        public Criteria andCategoriapadreNotBetween(String value1, String value2) {
            addCriterion("categoriapadre not between", value1, value2, "categoriapadre");
            return (Criteria) this;
        }

        public Criteria andNombreatcIsNull() {
            addCriterion("nombreatc is null");
            return (Criteria) this;
        }

        public Criteria andNombreatcIsNotNull() {
            addCriterion("nombreatc is not null");
            return (Criteria) this;
        }

        public Criteria andNombreatcEqualTo(String value) {
            addCriterion("nombreatc =", value, "nombreatc");
            return (Criteria) this;
        }

        public Criteria andNombreatcNotEqualTo(String value) {
            addCriterion("nombreatc <>", value, "nombreatc");
            return (Criteria) this;
        }

        public Criteria andNombreatcGreaterThan(String value) {
            addCriterion("nombreatc >", value, "nombreatc");
            return (Criteria) this;
        }

        public Criteria andNombreatcGreaterThanOrEqualTo(String value) {
            addCriterion("nombreatc >=", value, "nombreatc");
            return (Criteria) this;
        }

        public Criteria andNombreatcLessThan(String value) {
            addCriterion("nombreatc <", value, "nombreatc");
            return (Criteria) this;
        }

        public Criteria andNombreatcLessThanOrEqualTo(String value) {
            addCriterion("nombreatc <=", value, "nombreatc");
            return (Criteria) this;
        }

        public Criteria andNombreatcLike(String value) {
            addCriterion("nombreatc like", value, "nombreatc");
            return (Criteria) this;
        }

        public Criteria andNombreatcNotLike(String value) {
            addCriterion("nombreatc not like", value, "nombreatc");
            return (Criteria) this;
        }

        public Criteria andNombreatcIn(List<String> values) {
            addCriterion("nombreatc in", values, "nombreatc");
            return (Criteria) this;
        }

        public Criteria andNombreatcNotIn(List<String> values) {
            addCriterion("nombreatc not in", values, "nombreatc");
            return (Criteria) this;
        }

        public Criteria andNombreatcBetween(String value1, String value2) {
            addCriterion("nombreatc between", value1, value2, "nombreatc");
            return (Criteria) this;
        }

        public Criteria andNombreatcNotBetween(String value1, String value2) {
            addCriterion("nombreatc not between", value1, value2, "nombreatc");
            return (Criteria) this;
        }

        public Criteria andCodigoatcLikeInsensitive(String value) {
            addCriterion("upper(codigoatc) like", value.toUpperCase(), "codigoatc");
            return (Criteria) this;
        }

        public Criteria andCategoriapadreLikeInsensitive(String value) {
            addCriterion("upper(categoriapadre) like", value.toUpperCase(), "categoriapadre");
            return (Criteria) this;
        }

        public Criteria andNombreatcLikeInsensitive(String value) {
            addCriterion("upper(nombreatc) like", value.toUpperCase(), "nombreatc");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table componentes
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
     * This class corresponds to the database table componentes
     *
     * @mbggenerated
     */
    public static class Criterion {
        private final String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private final String typeHandler;

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