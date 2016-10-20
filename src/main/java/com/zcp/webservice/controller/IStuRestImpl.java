package com.zcp.webservice.controller;

import java.io.InputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.zcp.webservice.bean.User;
@Produces({ MediaType.APPLICATION_XML}) 
@Consumes({ MediaType.APPLICATION_XML}) 
public class IStuRestImpl {
	@GET
	@Path("/getUsers")
	public User getUsers() {  
	    User userDetails = new User();  
	        userDetails.setUserName("Krishna");  
	        userDetails.setEmailId("krishna@gmail.com"); 
	        System.out.println("test ");
	        return userDetails;  
    }  
	@GET
    @Path("/getUser/{id}")
	public User getUser(@PathParam("id")int id) {
	User userDetails = new User();  
	        userDetails.setUserName("Krishna");  
	        userDetails.setEmailId("krishna@gmail.com"); 
	        System.out.println("test ");
	        return userDetails;  
	}
	@GET
	@Path("/createUser")
	public Response createUser() {
	// TODO Auto-generated method stub
	return Response.ok().build();
	}
	@GET
	@Path("/updateUser")
	public Response updateUser(@PathParam("id")int id, InputStream is) {
	// TODO Auto-generated method stub
	return Response.ok().build();
	}  
	
}
