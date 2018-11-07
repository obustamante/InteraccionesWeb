package co.edu.usc.interacciones.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Presentaciones implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table usc.presentaciones
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usc.presentaciones.idpresentaciones
     *
     * @mbggenerated
     */
    private BigDecimal idpresentaciones;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usc.presentaciones.unidadmedida
     *
     * @mbggenerated
     */
    private String unidadmedida;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usc.presentaciones.nombre
     *
     * @mbggenerated
     */
    private String nombre;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usc.presentaciones.idpresentaciones
     *
     * @return the value of usc.presentaciones.idpresentaciones
     * @mbggenerated
     */
    public BigDecimal getIdpresentaciones() {
        return idpresentaciones;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usc.presentaciones.idpresentaciones
     *
     * @param idpresentaciones the value for usc.presentaciones.idpresentaciones
     * @mbggenerated
     */
    public void setIdpresentaciones(BigDecimal idpresentaciones) {
        this.idpresentaciones = idpresentaciones;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usc.presentaciones.unidadmedida
     *
     * @return the value of usc.presentaciones.unidadmedida
     * @mbggenerated
     */
    public String getUnidadmedida() {
        return unidadmedida;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usc.presentaciones.unidadmedida
     *
     * @param unidadmedida the value for usc.presentaciones.unidadmedida
     * @mbggenerated
     */
    public void setUnidadmedida(String unidadmedida) {
        this.unidadmedida = unidadmedida;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usc.presentaciones.nombre
     *
     * @return the value of usc.presentaciones.nombre
     * @mbggenerated
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usc.presentaciones.nombre
     *
     * @param nombre the value for usc.presentaciones.nombre
     * @mbggenerated
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usc.presentaciones
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
        Presentaciones other = (Presentaciones) that;
        return (this.getIdpresentaciones() == null ? other.getIdpresentaciones() == null : this.getIdpresentaciones().equals(other.getIdpresentaciones()))
                && (this.getUnidadmedida() == null ? other.getUnidadmedida() == null : this.getUnidadmedida().equals(other.getUnidadmedida()))
                && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usc.presentaciones
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdpresentaciones() == null) ? 0 : getIdpresentaciones().hashCode());
        result = prime * result + ((getUnidadmedida() == null) ? 0 : getUnidadmedida().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        return result;
    }
}