package co.edu.usc.interacciones.dao.model;

import java.io.Serializable;

public class Unidadesmedida implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column unidadesmedida.abreviatura
     *
     * @mbggenerated
     */
    private String abreviatura;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column unidadesmedida.unidadbase
     *
     * @mbggenerated
     */
    private String unidadbase;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column unidadesmedida.nombre
     *
     * @mbggenerated
     */
    private String nombre;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column unidadesmedida.exponente
     *
     * @mbggenerated
     */
    private Short exponente;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table unidadesmedida
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column unidadesmedida.abreviatura
     *
     * @return the value of unidadesmedida.abreviatura
     *
     * @mbggenerated
     */
    public String getAbreviatura() {
        return abreviatura;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column unidadesmedida.abreviatura
     *
     * @param abreviatura the value for unidadesmedida.abreviatura
     *
     * @mbggenerated
     */
    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura == null ? null : abreviatura.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column unidadesmedida.unidadbase
     *
     * @return the value of unidadesmedida.unidadbase
     *
     * @mbggenerated
     */
    public String getUnidadbase() {
        return unidadbase;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column unidadesmedida.unidadbase
     *
     * @param unidadbase the value for unidadesmedida.unidadbase
     *
     * @mbggenerated
     */
    public void setUnidadbase(String unidadbase) {
        this.unidadbase = unidadbase == null ? null : unidadbase.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column unidadesmedida.nombre
     *
     * @return the value of unidadesmedida.nombre
     *
     * @mbggenerated
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column unidadesmedida.nombre
     *
     * @param nombre the value for unidadesmedida.nombre
     *
     * @mbggenerated
     */
    public void setNombre(String nombre) {
        this.nombre = nombre == null ? null : nombre.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column unidadesmedida.exponente
     *
     * @return the value of unidadesmedida.exponente
     *
     * @mbggenerated
     */
    public Short getExponente() {
        return exponente;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column unidadesmedida.exponente
     *
     * @param exponente the value for unidadesmedida.exponente
     *
     * @mbggenerated
     */
    public void setExponente(Short exponente) {
        this.exponente = exponente;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unidadesmedida
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Unidadesmedida other = (Unidadesmedida) that;
        return (this.getAbreviatura() == null ? other.getAbreviatura() == null : this.getAbreviatura().equals(other.getAbreviatura()))
            && (this.getUnidadbase() == null ? other.getUnidadbase() == null : this.getUnidadbase().equals(other.getUnidadbase()))
            && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()))
            && (this.getExponente() == null ? other.getExponente() == null : this.getExponente().equals(other.getExponente()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unidadesmedida
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAbreviatura() == null) ? 0 : getAbreviatura().hashCode());
        result = prime * result + ((getUnidadbase() == null) ? 0 : getUnidadbase().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        result = prime * result + ((getExponente() == null) ? 0 : getExponente().hashCode());
        return result;
    }
}