package co.edu.usc.interacciones.dao.custom.model;

public class Inteacciones {

    private String interaccion;

    public String getInteraccion() {
        return interaccion;
    }

    public void setInteraccion(String interaccion) {
        this.interaccion = interaccion;
    }

    @Override
    public String toString() {
        return "Inteacciones{" +
                "interaccion='" + interaccion + '\'' +
                '}';
    }
}
