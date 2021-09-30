package com.jimmy.saas.web.controller;

import com.jimmy.base.BaseController;
import com.jimmy.result.Result;

import javax.ws.rs.*;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;

/**
 * @Description
 * @Author zhangguoq
 **/
@Path("/user")
public class HelloController extends BaseController {

    @GET
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void message(@PathParam("id") Long id,
                        @Suspended AsyncResponse asyncResponse) {
        asyncResponse.resume(Result.fromSuccessfulResult(id));
    }

}