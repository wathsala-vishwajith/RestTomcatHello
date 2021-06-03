package com.example.RestTomcatHello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/json")
public class JsonResource {
    @GET
    @Produces("application/json")
    public Response response(){
        return Response.ok("{\"status\":\"ok\"}", MediaType.APPLICATION_JSON_TYPE).build();
    }

}
