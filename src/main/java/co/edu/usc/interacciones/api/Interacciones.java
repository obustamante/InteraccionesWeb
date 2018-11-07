package co.edu.usc.interacciones.api;

public class Interacciones {

    String nombreMed;
    String act;
    String interaccion;
    int nivel;

    /**
     * @return
     */
    public String getNombreMed() {
        return nombreMed;
    }

    /**
     * @param nombreMed
     */
    public void setNombreMed(String nombreMed) {
        this.nombreMed = nombreMed;
    }

    /**
     * @return
     */
    public String getAct() {
        return act;
    }

    /**
     * @param act
     */
    public void setAct(String act) {
        this.act = act;
    }

    /**
     * @return
     */
    public String getInteraccion() {
        return interaccion;
    }

    /**
     * @param interaccion
     */
    public void setInteraccion(String interaccion) {
        this.interaccion = interaccion;
    }

    /**
     * @return
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "Interacciones{" +
                "nombreMed='" + nombreMed + '\'' +
                ", act='" + act + '\'' +
                ", interaccion='" + interaccion + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}
