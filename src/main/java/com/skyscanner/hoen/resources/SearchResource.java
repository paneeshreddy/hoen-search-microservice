package com.skyscanner.hoen.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.*;

@Path("/search")
@Produces(MediaType.APPLICATION_JSON)
public class SearchResource {

    @GET
    public List<String> search(@QueryParam("city") String city) {

        List<String> results = new ArrayList<>();

        if ("Slateport".equalsIgnoreCase(city)) {
            results.add("Slateport Grand Hotel");
            results.add("Slateport Car Rentals");
        }

        return results;
    }
}
