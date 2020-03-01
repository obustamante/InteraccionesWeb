package co.edu.usc.interacciones.dao.custom.model;

import java.util.List;

public class Medicamentos {

    private String nombre;
    private String atc;
    private String invima;

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

    public String getInvima() {
        return invima;
    }

    public void setInvima(String invima) {
        this.invima = invima;
    }

    @Override
    public String toString() {
        return "Medicamentos{" +
                "nombre='" + nombre + '\'' +
                ", atc='" + atc + '\'' +
                ", invima='" + invima + '\'' +
                '}';
    }
}
