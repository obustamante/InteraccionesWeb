import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class Api2Test {

    public static void main(String[] args) {

        String path1 = "rest";
        String path2 = "api2";

        ClientConfig config = new ClientConfig();

        Client client = ClientBuilder.newClient(config);

        WebTarget target = client.target(getBaseURI());

        String response =
                target.path(path1).path(path2).request().accept(MediaType.TEXT_PLAIN).get(Response.class).toString();

        String plainAnswer =
                target.path(path1).path(path2).request().accept(MediaType.TEXT_PLAIN).get(String.class);

        Object jsonAnswere =
                target.path(path1).path(path2).request().accept(MediaType.APPLICATION_JSON_TYPE).get(String.class);

        Object medicamento =
                target.path(path1).path(path2).path("Medicamento").request().accept(MediaType.APPLICATION_JSON_TYPE).get(String.class);

        System.out.println("response: ");
        System.out.println(response);
        System.out.println("\n");
        System.out.println(plainAnswer);
        System.out.println(jsonAnswere);
        System.out.println(medicamento);

    }

    private static URI getBaseURI() {
        return UriBuilder.fromUri("http://localhost:8080/interaccionesWeb").build();
    }
}
