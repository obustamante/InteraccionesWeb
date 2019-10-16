package co.edu.usc.interacciones.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProductosPresentaciones implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productos_presentaciones.cum
     *
     * @mbggenerated
     */
    private String cum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productos_presentaciones.presentacion
     *
     * @mbggenerated
     */
    private BigDecimal presentacion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productos_presentaciones.via
     *
     * @mbggenerated
     */
    private BigDecimal via;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productos_presentaciones.codigoinvima
     *
     * @mbggenerated
     */
    private String codigoinvima;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productos_presentaciones.volumen
     *
     * @mbggenerated
     */
    private Integer volumen;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table productos_presentaciones
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productos_presentaciones.cum
     *
     * @return the value of productos_presentaciones.cum
     *
     * @mbggenerated
     */
    public String getCum() {
        return cum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productos_presentaciones.cum
     *
     * @param cum the value for productos_presentaciones.cum
     *
     * @mbggenerated
     */
    public void setCum(String cum) {
        this.cum = cum == null ? null : cum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productos_presentaciones.presentacion
     *
     * @return the value of productos_presentaciones.presentacion
     *
     * @mbggenerated
     */
    public BigDecimal getPresentacion() {
        return presentacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productos_presentaciones.presentacion
     *
     * @param presentacion the value for productos_presentaciones.presentacion
     *
     * @mbggenerated
     */
    public void setPresentacion(BigDecimal presentacion) {
        this.presentacion = presentacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productos_presentaciones.via
     *
     * @return the value of productos_presentaciones.via
     *
     * @mbggenerated
     */
    public BigDecimal getVia() {
        return via;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productos_presentaciones.via
     *
     * @param via the value for productos_presentaciones.via
     *
     * @mbggenerated
     */
    public void setVia(BigDecimal via) {
        this.via = via;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productos_presentaciones.codigoinvima
     *
     * @return the value of productos_presentaciones.codigoinvima
     *
     * @mbggenerated
     */
    public String getCodigoinvima() {
        return codigoinvima;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productos_presentaciones.codigoinvima
     *
     * @param codigoinvima the value for productos_presentaciones.codigoinvima
     *
     * @mbggenerated
     */
    public void setCodigoinvima(String codigoinvima) {
        this.codigoinvima = codigoinvima == null ? null : codigoinvima.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productos_presentaciones.volumen
     *
     * @return the value of productos_presentaciones.volumen
     *
     * @mbggenerated
     */
    public Integer getVolumen() {
        return volumen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productos_presentaciones.volumen
     *
     * @param volumen the value for productos_presentaciones.volumen
     *
     * @mbggenerated
     */
    public void setVolumen(Integer volumen) {
        this.volumen = volumen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productos_presentaciones
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
        ProductosPresentaciones other = (ProductosPresentaciones) that;
        return (this.getCum() == null ? other.getCum() == null : this.getCum().equals(other.getCum()))
            && (this.getPresentacion() == null ? other.getPresentacion() == null : this.getPresentacion().equals(other.getPresentacion()))
            && (this.getVia() == null ? other.getVia() == null : this.getVia().equals(other.getVia()))
            && (this.getCodigoinvima() == null ? other.getCodigoinvima() == null : this.getCodigoinvima().equals(other.getCodigoinvima()))
            && (this.getVolumen() == null ? other.getVolumen() == null : this.getVolumen().equals(other.getVolumen()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productos_presentaciones
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCum() == null) ? 0 : getCum().hashCode());
        result = prime * result + ((getPresentacion() == null) ? 0 : getPresentacion().hashCode());
        result = prime * result + ((getVia() == null) ? 0 : getVia().hashCode());
        result = prime * result + ((getCodigoinvima() == null) ? 0 : getCodigoinvima().hashCode());
        result = prime * result + ((getVolumen() == null) ? 0 : getVolumen().hashCode());
        return result;
    }
}