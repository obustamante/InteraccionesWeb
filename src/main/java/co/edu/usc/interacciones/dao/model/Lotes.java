package co.edu.usc.interacciones.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Lotes implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lotes
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lotes.idlotes
     *
     * @mbggenerated
     */
    private BigDecimal idlotes;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lotes.cum
     *
     * @mbggenerated
     */
    private String cum;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lotes.fechavencimiento
     *
     * @mbggenerated
     */
    private Date fechavencimiento;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lotes.cantidad
     *
     * @mbggenerated
     */
    private Integer cantidad;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lotes.idlotes
     *
     * @return the value of lotes.idlotes
     * @mbggenerated
     */
    public BigDecimal getIdlotes() {
        return idlotes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lotes.idlotes
     *
     * @param idlotes the value for lotes.idlotes
     * @mbggenerated
     */
    public void setIdlotes(BigDecimal idlotes) {
        this.idlotes = idlotes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lotes.cum
     *
     * @return the value of lotes.cum
     * @mbggenerated
     */
    public String getCum() {
        return cum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lotes.cum
     *
     * @param cum the value for lotes.cum
     * @mbggenerated
     */
    public void setCum(String cum) {
        this.cum = cum == null ? null : cum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lotes.fechavencimiento
     *
     * @return the value of lotes.fechavencimiento
     * @mbggenerated
     */
    public Date getFechavencimiento() {
        return fechavencimiento;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lotes.fechavencimiento
     *
     * @param fechavencimiento the value for lotes.fechavencimiento
     * @mbggenerated
     */
    public void setFechavencimiento(Date fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lotes.cantidad
     *
     * @return the value of lotes.cantidad
     * @mbggenerated
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lotes.cantidad
     *
     * @param cantidad the value for lotes.cantidad
     * @mbggenerated
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lotes
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
        Lotes other = (Lotes) that;
        return (this.getIdlotes() == null ? other.getIdlotes() == null : this.getIdlotes().equals(other.getIdlotes()))
                && (this.getCum() == null ? other.getCum() == null : this.getCum().equals(other.getCum()))
                && (this.getFechavencimiento() == null ? other.getFechavencimiento() == null : this.getFechavencimiento().equals(other.getFechavencimiento()))
                && (this.getCantidad() == null ? other.getCantidad() == null : this.getCantidad().equals(other.getCantidad()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lotes
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdlotes() == null) ? 0 : getIdlotes().hashCode());
        result = prime * result + ((getCum() == null) ? 0 : getCum().hashCode());
        result = prime * result + ((getFechavencimiento() == null) ? 0 : getFechavencimiento().hashCode());
        result = prime * result + ((getCantidad() == null) ? 0 : getCantidad().hashCode());
        return result;
    }
}