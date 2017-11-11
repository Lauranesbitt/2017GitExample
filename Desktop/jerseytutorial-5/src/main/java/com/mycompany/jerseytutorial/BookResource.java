/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author laura
 */
@Path("/book")
public class BookResource {
    BookService bookservice = new BookService();
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Book> getBookXML(){
        return bookservice.getBook();
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
     public List<Book> getBookJSON(){
        return bookservice.getBook();
     }
     @GET
     @Path("/{pubID}")
     @Produces(MediaType.APPLICATION_XML)
     public Book getBookXML(@PathParam("pubID") int pubID){
         return bookservice.getBook(pubID);
     }
     @GET
     @Path("/{pubID}")
     @Produces(MediaType.APPLICATION_JSON)
     public Book getBookJSON(@PathParam("pubID") int pubID){
         return bookservice.getBook(pubID);
     }
     
}
