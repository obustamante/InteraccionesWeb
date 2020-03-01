package co.edu.usc.interacciones.api;

import co.edu.usc.interacciones.services.GenericService;
import co.edu.usc.interacciones.services.MedicamentoService;
import co.edu.usc.interacciones.utiles.DBUtils;
import co.edu.usc.interacciones.utiles.Result;
import com.google.gson.Gson;
import org.apache.ibatis.session.SqlSession;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api")
public class Api {

    private MediaType responseType = MediaType.APPLICATION_JSON_TYPE;
    private Result result;

    @GET
    @Path("/{service}/{action}")
    public Object executeAction(@PathParam("service") String service,
                                @PathParam("action") String action,
                                @QueryParam("data") String data,
                                @QueryParam("keyword") String keyword
    ) {

        System.out.println("\nIngeso a executeAction:");
        System.out.println(" - Servicio : " + service +
                "\n - Acción   : " + action +
                "\n - Data     : " + data +
                "\n - Keyword  : " + keyword + "\n");

        if (service != null && !service.equals("") && action != null && !action.equals("")) {

            if (data == null && keyword != null) {

                data = "{\"nombre\":\"" + keyword + "\"}";
            }

            try {
                SqlSession sqlSession = DBUtils.getSession();

                GenericService serviceInstance = new GenericService();
                serviceInstance.setSqlSession(sqlSession);

                if (!sqlSession.getConnection().isClosed()) {
                    System.out.println("Estado de conexión: Abierta\n");
                } else {
                    System.out.println("Estado de conexión: Cerrada\n");
                }

                if ((capitalize(service) + "Service").equals("MedicamentoService")) {

                    MedicamentoService medicamentoService = new MedicamentoService();

                    Object med = null;

                    if (action.equals("getMedicamento")) {
                        med = medicamentoService.getMedicamento(data);
                    }

                    if (action.equals("getComparaMedicamento")) {
                        med = medicamentoService.getComparaMedicamento(data);
                    }


                    Gson gsonEncoder = new Gson();

                    return Response.status(200)
                            .header("Cache-Control", "private, no-store, no-cache, must-revalidate")
                            .header("Access-Control-Allow-Origin", "*")
                            .header("Access-Control-Expose-Headers", "x-auth")
                            //.header("x-auth", token)
                            .header("Access-Control-Allow-Headers", "origin, content-type, accept, x-auth")
                            .header("Pragma", "no-cache")
                            .type(responseType)
                            .entity(gsonEncoder.toJson(med)).build();
                            //.entity(med).build();
  /*
                    result.setResults(medicamentoService.getMedicamento(data));
                    result.setData(medicamentoService.getMedicamento(data));
                    result.setResult(Result.OK_RESULT);
*/
                }

            } catch (Exception e) {
                return "data: " + data + " - Error: " + e.getMessage() + " @ " + e.getCause();
            }

        }

        return null;
    }

    /**
     * @param input
     * @return
     */
    private String capitalize(String input) {
        if (input == null || input.length() == 0) {
            return input;
        }

        return input.substring(0, 1).toUpperCase().concat(input.substring(1, input.length()));
    }

}
