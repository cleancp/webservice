package com.zcp.webservice.controller;

import java.io.InputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.zcp.webservice.bean.User;

@Produces({ MediaType.APPLICATION_XML}) 
@Consumes({ MediaType.APPLICATION_XML}) 
public interface IRestStu {
@GET
@Path("/getUsers")
public User getUsers();

@GET
@Path("/getUser/{id}")
public User getUser(@PathParam("id") int id);

@POST
@Path("/createuser") 
public Response createUser();

@PUT  
@Path("/updateuser/{id}")  
public Response updateUser(@PathParam("id") int id, InputStream is );
}
