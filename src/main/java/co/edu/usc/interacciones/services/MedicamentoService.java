package co.edu.usc.interacciones.services;

import co.edu.usc.interacciones.dao.custom.helper.FiltroMedicamento;
import co.edu.usc.interacciones.dao.custom.model.FlexDataList;
import co.edu.usc.interacciones.dao.model.*;
import co.edu.usc.interacciones.utiles.DBUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.ibatis.session.SqlSession;

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

        System.out.println("Entro a getMedicamento(Object data);");

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

                System.out.println(registrossanitarios.toString());
                System.out.println("Buscando: " + registrossanitarios.getNombre());

                registrossanitariosExample.createCriteria().andNombreLikeInsensitive(registrossanitarios.getNombre() + "%");

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

            System.out.println("\n" + registrossanitariosList.size() + " registr(s) encontrado(s).");

            if (registrossanitariosList.size() != 0) {
                ComponentesactivosExample componentesactivosExample = new ComponentesactivosExample();
                ComponentesactivosMapper componentesactivosMapper = sqlSession.getMapper(ComponentesactivosMapper.class);
                List<Componentesactivos> componentesactivosList;

                List<FiltroMedicamento> medicamentos = new ArrayList<>();
                FiltroMedicamento medicamento;
                /*
                System.out.println("+-----+---------------+--------------------------------------------+-----------------------------+----------+");
                System.out.println("|   # | Id Cod Invima |           Nombre del medicamento           |          Cod Invima         |   ATC    |");
                System.out.println("+-----+---------------+--------------------------------------------+-----------------------------+----------+");
                */
                System.out.println("+-----+--------------------------------------------+-----------------------------+----------+");
                System.out.println("|   # |           Nombre del medicamento           |          Cod Invima         |   ATC    |");
                System.out.println("+-----+--------------------------------------------+-----------------------------+----------+");

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
                //System.out.println("+-----+---------------+--------------------------------------------+-----------------------------+----------+");
                System.out.println("+-----+--------------------------------------------+-----------------------------+----------+");
                System.out.print("\n");

                //return registrossanitariosList;
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

        List<Componentesactivos> componentes = new ArrayList<>();

        try {
            SqlSession sqlSession = DBUtils.getSession();

            GenericService service = new GenericService();
            Gson gson = service.getGson();

            if (data != null && !data.equals("")) {

                JsonObject jsonObject = new JsonParser().parse(data.toString()).getAsJsonObject();
                JsonArray arr = jsonObject.getAsJsonArray("codigoinvima");

                Object data_;
                @SuppressWarnings("UnusedAssignment") Componentesactivos componentesactivos = new Componentesactivos();
                ComponentesactivosMapper componentesactivosMapper = sqlSession.getMapper(ComponentesactivosMapper.class);

                List<Componentesactivos> componentesactivosList;

                for (int i = 0; i < arr.size(); i++) {
                    data_ = "{registrossanitariosCodigoinvima:" + arr.get(i) + "}";
                    System.out.println(data_);

                    componentesactivos = gson.fromJson((String) data_, Componentesactivos.class);

                    //System.out.println("\nLuego de 'gson.fromJson((String) data'");
                    System.out.println("Codigoinvima: " + componentesactivos.getRegistrossanitariosCodigoinvima() + " - ATC: " + componentesactivos.getComponentesCodigoatc());

                    System.out.println("Cod invima a buscar:");
                    System.out.println(componentesactivos.getRegistrossanitariosCodigoinvima());

                    ComponentesactivosExample componentesactivosExample = new ComponentesactivosExample();
                    componentesactivosExample.createCriteria().andRegistrossanitariosCodigoinvimaEqualTo(componentesactivos.getRegistrossanitariosCodigoinvima());
                    componentesactivosList = componentesactivosMapper.selectByExample(componentesactivosExample);

                    System.out.println("componentesactivosList : " + componentesactivosList.size());

                    for (Componentesactivos com : componentesactivosList) {
                        System.out.println("INVIMA: " + com.getRegistrossanitariosCodigoinvima());
                        System.out.println("ATC: " + com.getComponentesCodigoatc());
                        System.out.println(" ");
                        componentesactivos.setComponentesCodigoatc(com.getComponentesCodigoatc());
                    }
                    System.out.println("R//: Codigoinvima: " + componentesactivos.getRegistrossanitariosCodigoinvima() + " - ATC: " + componentesactivos.getComponentesCodigoatc() + "\n");
                    componentes.add(componentesactivos);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n**********************************************************************\n\nEnviando resultado ...\n");
        int c_ = 1;
        for (Componentesactivos com : componentes) {
            System.out.println(c_ + ". INVIMA: " + com.getRegistrossanitariosCodigoinvima());
            System.out.println("ATC: " + com.getComponentesCodigoatc());
            System.out.println(" ");
            c_++;
        }

        return componentes;
    }
}

