package com.App.demorest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("Subject")

public class SubjectResources {
	
	
	@GET 
	@Produces(MediaType.APPLICATION_XML)
	public Subject getSubject()
	{
		System.out.println("getSubject called");
		Subject a1 = new Subject();
		a1.setName("English");
		a1.setPoint(80);
		
		return a1;
	}
	

}
