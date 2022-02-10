package co.edu.usc.interacciones.services;

import co.edu.usc.interacciones.dao.custom.helper.Filtro;
import co.edu.usc.interacciones.dao.custom.helper.FiltroMedicamento;
import co.edu.usc.interacciones.dao.custom.mapper.MedicamentoCustomMapper;
import co.edu.usc.interacciones.dao.custom.model.FlexDataList;
import co.edu.usc.interacciones.dao.custom.model.Inteacciones;
import co.edu.usc.interacciones.dao.custom.model.RespuestaWeb;
import co.edu.usc.interacciones.dao.custom.model.ResumenMedicamento;
import co.edu.usc.interacciones.dao.model.*;
import co.edu.usc.interacciones.utiles.DBUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.ibatis.session.SqlSession;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MedicamentoService extends GenericService {

    /**
     * Obtiene los datos de medicamento a partir del nombre
     *
     * @param data
     * @return
     */
    public Object getMedicamento(Object data) {

        System.out.println("Entro a getMedicamento(Object data) de MedicamentoSerice.java");

        try {

            SqlSession sqlSession = DBUtils.getSession();

            GenericService service = new GenericService();
            Gson gson = service.getGson();

            System.out.println("data: " + data + "\n");

            RegistrossanitariosExample registrossanitariosExample = new RegistrossanitariosExample();
            RegistrossanitariosMapper registroFabricMapper;
            List<Registrossanitarios> registrossanitariosList;

            registroFabricMapper = sqlSession.getMapper(RegistrossanitariosMapper.class);

            if (data != null && !data.equals("")) {

                Registrossanitarios registrossanitarios = gson.fromJson((String) data, Registrossanitarios.class);
                registrossanitarios.setNombre(registrossanitarios.getNombre().toUpperCase());

                String text = "%" + registrossanitarios.getNombre() + "%";

                System.out.println(registrossanitarios);
                System.out.println("Buscando: " + text);
                registrossanitariosExample.createCriteria().andNombreLikeInsensitive(text);

            } else {

                System.out.println("Por acá...");

                FlexDataList flexDataList;
                flexDataList = gson.fromJson((String) data, FlexDataList.class);

                System.out.println("Buscando: " + flexDataList.getKeyword());

                System.out.println(data);

                System.out.println("\nBuscando todos los nombres de los medicamentos.");
                registrossanitariosExample.createCriteria().andNombreIsNotNull();
            }

            registrossanitariosList = registroFabricMapper.selectByExample(registrossanitariosExample);

            System.out.println("\n" + registrossanitariosList.size() + " registro(s) encontrado(s).");

            if (registrossanitariosList.size() != 0) {
                ComponentesactivosExample componentesactivosExample = new ComponentesactivosExample();
                ComponentesactivosMapper componentesactivosMapper = sqlSession.getMapper(ComponentesactivosMapper.class);
                List<Componentesactivos> componentesactivosList;

                List<FiltroMedicamento> medicamentos = new ArrayList<>();
                FiltroMedicamento medicamento;

                System.out.println("+-----+----------------------------------------------------+-----------------------------+----------+");
                System.out.println("|   # |           Nombre del medicamento                   |          Cod Invima         |   ATC    |");
                System.out.println("+-----+----------------------------------------------------+-----------------------------+----------+");

                int i = 1;
                for (Registrossanitarios reg : registrossanitariosList) {
                    System.out.print("| ");
                    System.out.printf("%6s", i + " | ");
                    //System.out.printf("%16s", reg.getIdcodigoinvima() + "  | ");
                    System.out.printf("%45s", reg.getNombre() + " | ");
                    System.out.printf("%30s", reg.getCodigoinvima() + " | ");

                    //componentesactivosExample.createCriteria().andIdcodigoinvimaEqualTo(reg.getIdcodigoinvima());
                    componentesactivosExample.createCriteria().andRegistrossanitariosCodigoinvimaEqualTo(reg.getCodigoinvima());

                    componentesactivosList = componentesactivosMapper.selectByExample(componentesactivosExample);

                    if (componentesactivosList.size() != 0) {
                        System.out.printf("%11s", componentesactivosList.get(0).getComponentesCodigoatc() + " | ");
                    } else {
                        System.out.printf("%11s", " N/A  | ");
                    }

                    System.out.print("\n");
                    i++;

                    medicamento = new FiltroMedicamento();
                    medicamento.setAtc(componentesactivosList.get(0).getComponentesCodigoatc());
                    medicamento.setCodigoinvima(reg.getCodigoinvima());
                    //medicamento.setIdcodigoinvima(reg.getIdcodigoinvima());
                    medicamento.setNombre(reg.getNombre());
                    medicamentos.add(medicamento);

                    if (i > 15) {
                        break;
                    }
                }
                System.out.println("+-----+--------------------------------------------+-----------------------------+----------+");
                System.out.print("\n");

                System.out.println(medicamentos);

                return medicamentos;
            }

        } catch (Exception e) {
            System.out.println(e);
            return e.getMessage();
        }


        return "No se encontraron medicamentos";
    }

    /**
     * Compara los dedicamentos
     * @param data
     * @return
     */
    public Object getComparaMedicamento(Object data) {

        System.out.println("Entro a getComparaMedicamento(Object data);");

        System.out.println("data: " + data + "\n");

        List<String> listAtc = new ArrayList<>();
        RespuestaWeb respuesta = new RespuestaWeb();
        Inteacciones intera;

        try {
            SqlSession sqlSession = DBUtils.getSession();

            GenericService service = new GenericService();
            Gson gson = service.getGson();

            if (data != null && !data.equals("")) {

                respuesta = new RespuestaWeb();
                JsonObject jsonObject = new JsonParser().parse(data.toString()).getAsJsonObject();
                JsonArray arr = jsonObject.getAsJsonArray("codigoinvima");

                Object data_;
                MedicamentoCustomMapper medicamentoCustomMapper = sqlSession.getMapper(MedicamentoCustomMapper.class);

                Filtro medicamento = new Filtro();

                for (int i = 0; i < arr.size(); i++) {

                    System.out.println("\rInicio - Resultado de la consulta personalizada:");

                    data_ = "{invima:" + arr.get(i) + "}";
                    medicamento = gson.fromJson((String) data_, Filtro.class);

                    List<ResumenMedicamento> medicamentosList = medicamentoCustomMapper.getInfoMedicamento(medicamento);

                    if (medicamentosList.size() == 0){
                        System.out.println("NO se encontraron datos en la busqueda por : " + data_);
                    }else {
                        System.out.println("SI se encontraron datos en la busqueda por : " + data_);

                        respuesta.addMedicamentos(medicamentosList.get(0));

                        for (ResumenMedicamento rm : medicamentosList) {
                            listAtc.add(rm.getCodigoAtc());
                            System.out.println(rm);
                        }

                        System.out.println("Fin - Resultado de la consulta personalizada para medicamentos\n");
                    } // Fin IF de consulta de medicamento por invima
                } // Fin for de medicamentos por invima

                //TODO Trabajar en la parte de interacciones, aún no se muestran 10Feb2022

                System.out.println("\n********************** Inicio de Interacciones **********************");

                if (listAtc.size() != 0) {
                    InteraccionescomponentesMapper interaccionescomponentesMapper = sqlSession.getMapper(InteraccionescomponentesMapper.class);
                    InteraccionescomponentesExample interaccionescomponentesExample = new InteraccionescomponentesExample();
                    interaccionescomponentesExample.createCriteria().andComponenteaIn(listAtc).andComponentebIn(listAtc);
                    interaccionescomponentesExample.setOrderByClause(" componentea, componenteb ");
                    List<Interaccionescomponentes> interaccionescomponentes = interaccionescomponentesMapper.selectByExample(interaccionescomponentesExample);

                    System.out.println("\nSe encontraron " + interaccionescomponentes.size() + " interaccion(es).");

                    if (interaccionescomponentes.size() != 0) {

                        List<BigDecimal> idInteracList = new ArrayList<>();
                        for (Interaccionescomponentes inte : interaccionescomponentes) {
                            idInteracList.add(inte.getIdinteracciones());
                        }

                        InteraccionesMapper interaccionesMapper = sqlSession.getMapper(InteraccionesMapper.class);
                        InteraccionesExample interaccionesExample = new InteraccionesExample();
                        interaccionesExample.createCriteria().andIdinteraccionesIn(idInteracList);
                        List<Interacciones> interaccionesList = interaccionesMapper.selectByExample(interaccionesExample);


                        System.out.println("[ " + interaccionesList.size() + " ]");
                        System.out.println("Las interacciones son: ");
                        for (Interacciones list : interaccionesList) {
                            System.out.println("[" + list.getIdinteracciones() + "] " + list.getDescripcion());

                            intera = new Inteacciones();
                            intera.setInteraccion(list.getDescripcion());

                            respuesta.addInteracciones(intera);

                        }
                    }
                }

                System.out.println("\n********************** Fin de Interacciones *************************");

            } // end if data

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println(e.getCause());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getStackTrace());


            return "Error: " + e.getMessage();
        }

        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("\nSe envía el sigueinte resultado:");
        System.out.println(respuesta);

        return respuesta;
    }


}

