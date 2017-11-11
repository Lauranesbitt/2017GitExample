/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial;

/**
 *
 * @author laura
 */

//import static com.mycompany.ca_questions.RandomStringHashMapJson.generateRandomString;
import static com.mycompany.jerseytutorial.BookService.list;
import java.util.List;
import java.util.concurrent.ExecutorService;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;




public class BookServiceJSON {
    
    @GET
    @Path("/get/{pubID}")
    @Produces("application/json")
    public Response getBook(@PathParam("pubID") int pubID){

    
    @Path("/create/")
 class PostMethodExample {
 
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    @Path("/{pubID}")
    public Response getAllBooks(@PathParam("pubID") int pubID,String name){
    return Response.status(200)
               .entity("Book id is : " + pubID + " and name is : " + name).build();
    }
     
}
    
  
   
    /*
    @Path("/delete/")
public class DeleteMethodExample {
 
    @DELETE
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    @Path("/{pubID}")
    public Response DeleteBooks(@PathParam("pubID") int pubID,String name){
        System.out.println("inside 1");
        if("Harry Potter".equalsIgnoreCase(name)){
            System.out.println("inside 2");
            return Response.status(200)
                           .entity("Book is deleted").build();
        }else{
            System.out.println("inside 3");
            return Response.status(200)
                           .entity("Book is not deleted").build();
        }       
    }
     
}*/
    //private ExecutorService executorService = java.util.concurrent.Executors.newCachedThreadPool();
        return (Response) list;

   

    }
}

