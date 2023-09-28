package io.andrefcj.jakartaee;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/test")
public class TestResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWorld() {
        return "Hello World André!";
    }

    @GET()
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public String json() {
        return "Teste 3";
    }
}
