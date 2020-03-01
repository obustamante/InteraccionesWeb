package co.edu.usc.interacciones.dao.custom.helper;

public class Filtro {

    private String invima;

    public String getInvima() {
        return invima;
    }

    public void setInvima(String invima) {
        this.invima = invima;
    }

    @Override
    public String toString() {
        return "Filtro{" +
                "invima='" + invima + '\'' +
                '}';
    }
}
