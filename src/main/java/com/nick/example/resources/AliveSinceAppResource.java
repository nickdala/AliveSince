package com.nick.example.resources;

import com.nick.example.views.AliveSinceAppView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.TEXT_HTML)
public class AliveSinceAppResource {

    public AliveSinceAppResource() {
    }

    @GET
    public AliveSinceAppView get() {
        return new AliveSinceAppView();
    }
}
