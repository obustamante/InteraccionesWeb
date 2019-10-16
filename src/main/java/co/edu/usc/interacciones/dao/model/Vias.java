package co.edu.usc.interacciones.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Vias implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table vias
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vias.idvias
     *
     * @mbggenerated
     */
    private BigDecimal idvias;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vias.nombre
     *
     * @mbggenerated
     */
    private String nombre;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vias.idvias
     *
     * @return the value of vias.idvias
     *
     * @mbggenerated
     */
    public BigDecimal getIdvias() {
        return idvias;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vias.idvias
     *
     * @param idvias the value for vias.idvias
     *
     * @mbggenerated
     */
    public void setIdvias(BigDecimal idvias) {
        this.idvias = idvias;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vias.nombre
     *
     * @return the value of vias.nombre
     *
     * @mbggenerated
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vias.nombre
     *
     * @param nombre the value for vias.nombre
     *
     * @mbggenerated
     */
    public void setNombre(String nombre) {
        this.nombre = nombre == null ? null : nombre.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vias
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
        Vias other = (Vias) that;
        return (this.getIdvias() == null ? other.getIdvias() == null : this.getIdvias().equals(other.getIdvias()))
                && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vias
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdvias() == null) ? 0 : getIdvias().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        return result;
    }
}