package co.edu.usc.interacciones.dao.custom.model;


import co.edu.usc.interacciones.dao.model.Componentesactivos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RespuestaWeb {

    private List<ResumenMedicamento> medicamentosList;
    private List<Inteacciones> inteaccionesList;

    public RespuestaWeb() {
        medicamentosList = new ArrayList<>();
        inteaccionesList = new ArrayList<>();
    }

    public void add(List<ResumenMedicamento> medicamentosList){
        this.medicamentosList = medicamentosList;
    }

    public void add(Inteacciones inteaccionesList){
        this.inteaccionesList = (List<Inteacciones>) inteaccionesList;
    }


    @Override
    public String toString() {
        return "RespuestaWeb{" +
                "medicamentosList=" + medicamentosList +
                ", inteaccionesList=" + inteaccionesList +
                '}';
    }

    public void setMedicamentos(List<ResumenMedicamento> medicamentosList) {
        this.medicamentosList = medicamentosList;
    }


    public void addMedicamentos(ResumenMedicamento medicamentosList) {
        //System.out.println("Entro a addMedicamentos(ResumenMedicamento medicamentosList)");
        this.medicamentosList.add(medicamentosList);
    }
}
