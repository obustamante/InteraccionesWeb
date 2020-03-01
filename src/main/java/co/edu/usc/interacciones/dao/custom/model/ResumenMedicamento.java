package co.edu.usc.interacciones.dao.custom.model;

public class ResumenMedicamento {

    private String nombre;
    private String codInvima;
    private String codigoAtc;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodInvima() {
        return codInvima;
    }

    public void setCodInvima(String codInvima) {
        this.codInvima = codInvima;
    }

    public String getCodigoAtc() {
        return codigoAtc;
    }

    public void setCodigoAtc(String codigoAtc) {
        this.codigoAtc = codigoAtc;
    }

    @Override
    public String toString() {
        return "ResumenMedicamento{" +
                "nombre='" + nombre + '\'' +
                ", codInvima='" + codInvima + '\'' +
                ", codigoAtc='" + codigoAtc + '\'' +
                '}';
    }
}
