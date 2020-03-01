package co.edu.usc.interacciones.dao.custom.mapper;

import co.edu.usc.interacciones.dao.custom.helper.Filtro;
import co.edu.usc.interacciones.dao.custom.helper.FiltroMedicamento;
import co.edu.usc.interacciones.dao.custom.model.ResumenMedicamento;

import java.util.List;

public interface MedicamentoCustomMapper {

    List<ResumenMedicamento> getInfoMedicamento(Filtro filtro);

}
