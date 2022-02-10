package co.edu.usc.interacciones.api;

import co.edu.usc.interacciones.services.GenericService;
import co.edu.usc.interacciones.services.MedicamentoService;
import co.edu.usc.interacciones.utiles.DBUtils;
import co.edu.usc.interacciones.utiles.Result;
import com.google.gson.Gson;
import org.apache.ibatis.session.SqlSession;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


@Path("/api2")
public class Api2 {

    private Object responseContent = null;
    private final MediaType responseType = MediaType.APPLICATION_JSON_TYPE;
    private Result result;
    private Gson gsonEncoder;

    // This method is called if TEXT_PLAIN is request
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayPlainTextHello() {
        return "Hello Jersey";
    }

    // This method is called if TEXT_PLAIN is request
    @GET
    //@Produces(MediaType.APPLICATION_JSON_TYPE)
    public Object sayJsonHello() {

        int status = 200;

        result = new Result();
        result.setResult(Result.OK_RESULT);
        result.setData("Hello Jersey");

        gsonEncoder = new Gson();
        if (responseType.getSubtype().equals("json")) {
            responseContent = gsonEncoder.toJson(result);
        } else {
            responseContent = result.getData();
        }

        return Response.status(status)
                .header("Cache-Control", "private, no-store, no-cache, must-revalidate")
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Expose-Headers", "x-auth")
                //.header("x-auth", token)
                .header("Access-Control-Allow-Headers", "origin, content-type, accept, x-auth")
                .header("Pragma", "no-cache")
                .type(responseType)
                .entity(responseContent).build();

    }

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

        int status = 500;

        result = new Result();

        if (service != null && !service.equals("") && action != null && !action.equals("")) {

            if (data == null && keyword != null) {
                //data = "data={\"nombre\":\"" +  keyword + "\"}";
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

                    status = 200;
                    MedicamentoService medicamentoService = new MedicamentoService();

                    result.setResults(medicamentoService.getMedicamento(data));
                    result.setData(medicamentoService.getMedicamento(data));
                    result.setResult(Result.OK_RESULT);

                } else {
                    status = 404;
                }

            } catch (Exception e) {
                result.setResult(Result.ERROR_RESULT);
                String message = "";
                result.setMessage("data: " + data + " - Error: " + e.getMessage() + " " + message + " @ " + e.getCause());
            }

        }

        gsonEncoder = new Gson();
        if (responseType.getSubtype().equals("json")) {
            responseContent = gsonEncoder.toJson(result);
        } else {
            responseContent = result.getData();
        }

        return Response.status(status)
                .header("Cache-Control", "private, no-store, no-cache, must-revalidate")
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Expose-Headers", "x-auth")
                //.header("x-auth", token)
                .header("Access-Control-Allow-Headers", "origin, content-type, accept, x-auth")
                .header("Pragma", "no-cache")
                .type(responseType)
                .entity(responseContent).build();

    }

    private void printDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        Date date = new Date();
        System.out.println("\n *** " + dateFormat.format(date) + " ***");
    }

    /**
     * @param input
     * @return
     */
    private String capitalize(String input) {
        if (input == null || input.length() == 0) {
            return input;
        }

        return input.substring(0, 1).toUpperCase().concat(input.substring(1));
    }
}
