package co.edu.usc.interacciones.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Interaccionescomponentes implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column interaccionescomponentes.componenteb
     *
     * @mbggenerated
     */
    private String componenteb;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column interaccionescomponentes.componentea
     *
     * @mbggenerated
     */
    private String componentea;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column interaccionescomponentes.idinteracciones
     *
     * @mbggenerated
     */
    private BigDecimal idinteracciones;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table interaccionescomponentes
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column interaccionescomponentes.componenteb
     *
     * @return the value of interaccionescomponentes.componenteb
     *
     * @mbggenerated
     */
    public String getComponenteb() {
        return componenteb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column interaccionescomponentes.componenteb
     *
     * @param componenteb the value for interaccionescomponentes.componenteb
     *
     * @mbggenerated
     */
    public void setComponenteb(String componenteb) {
        this.componenteb = componenteb == null ? null : componenteb.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column interaccionescomponentes.componentea
     *
     * @return the value of interaccionescomponentes.componentea
     *
     * @mbggenerated
     */
    public String getComponentea() {
        return componentea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column interaccionescomponentes.componentea
     *
     * @param componentea the value for interaccionescomponentes.componentea
     *
     * @mbggenerated
     */
    public void setComponentea(String componentea) {
        this.componentea = componentea == null ? null : componentea.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column interaccionescomponentes.idinteracciones
     *
     * @return the value of interaccionescomponentes.idinteracciones
     *
     * @mbggenerated
     */
    public BigDecimal getIdinteracciones() {
        return idinteracciones;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column interaccionescomponentes.idinteracciones
     *
     * @param idinteracciones the value for interaccionescomponentes.idinteracciones
     *
     * @mbggenerated
     */
    public void setIdinteracciones(BigDecimal idinteracciones) {
        this.idinteracciones = idinteracciones;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interaccionescomponentes
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
        Interaccionescomponentes other = (Interaccionescomponentes) that;
        return (this.getComponenteb() == null ? other.getComponenteb() == null : this.getComponenteb().equals(other.getComponenteb()))
            && (this.getComponentea() == null ? other.getComponentea() == null : this.getComponentea().equals(other.getComponentea()))
            && (this.getIdinteracciones() == null ? other.getIdinteracciones() == null : this.getIdinteracciones().equals(other.getIdinteracciones()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interaccionescomponentes
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getComponenteb() == null) ? 0 : getComponenteb().hashCode());
        result = prime * result + ((getComponentea() == null) ? 0 : getComponentea().hashCode());
        result = prime * result + ((getIdinteracciones() == null) ? 0 : getIdinteracciones().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Interaccionescomponentes{" +
                "idinteracciones=" + idinteracciones + '\'' +
                ", componentea='" + componentea + '\'' +
                ", componenteb='" + componenteb +
                '}';
    }
}