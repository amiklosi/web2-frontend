package hu.tilos.radio.backend;

import hu.radio.tilos.model.Role;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("api/v1")
public class Smoketest {

    @GET
    @Path("ping")
//    @Security(role = Role.GUEST)
    public String ping() {
        return "pong";
    }

}
