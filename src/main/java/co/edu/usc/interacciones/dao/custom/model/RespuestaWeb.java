package co.edu.usc.interacciones.dao.custom.model;


import java.util.ArrayList;
import java.util.List;

public class RespuestaWeb {

    private List<ResumenMedicamento> medicamentosList;
    private List<Inteacciones> inteaccionesList;

    public RespuestaWeb() {
        medicamentosList = new ArrayList<>();
        inteaccionesList = new ArrayList<>();
    }

    public void add(List<ResumenMedicamento> medicamentosList) {
        this.medicamentosList = medicamentosList;
    }

    public void add(Inteacciones inteaccionesList) {
        this.inteaccionesList = (List<Inteacciones>) inteaccionesList;
    }


    public void addMedicamentos(ResumenMedicamento medicamentosList) {
        this.medicamentosList.add(medicamentosList);
    }


    public void addInteracciones(Inteacciones interaccionesList) {
        this.inteaccionesList.add(interaccionesList);
    }


    @Override
    public String toString() {
        return "RespuestaWeb{" +
                "medicamentosList=" + medicamentosList +
                ", inteaccionesList=" + inteaccionesList +
                '}';
    }

}
