package co.edu.usc.interacciones.dao.custom.helper;

import java.math.BigDecimal;

public class FiltroMedicamento {

    private BigDecimal idcodigoinvima;
    private String nombre;
    private String atc;
    private String codigoinvima;

    public BigDecimal getIdcodigoinvima() {
        return idcodigoinvima;
    }

    public void setIdcodigoinvima(BigDecimal idcodigoinvima) {
        this.idcodigoinvima = idcodigoinvima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAtc() {
        return atc;
    }

    public void setAtc(String atc) {
        this.atc = atc;
    }

    public String getCodigoinvima() {
        return codigoinvima;
    }

    public void setCodigoinvima(String codigoinvima) {
        this.codigoinvima = codigoinvima;
    }

    @Override
    public String toString() {
        return "FiltroMedicamento{" +
                "idcodigoinvima=" + idcodigoinvima +
                ", nombre='" + nombre + '\'' +
                ", atc='" + atc + '\'' +
                ", codigoinvima='" + codigoinvima + '\'' +
                '}';
    }
}
