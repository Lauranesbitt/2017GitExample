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
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/book")
public class BookService {
    
    public static List<Book>  list =new ArrayList<>();
    @Path("/book/get/{pubID}")
    @Produces(MediaType.APPLICATION_XML)
    public List<Book> getBook(){
        Book b1 = new Book (1,"Girl with the dragon tattoo", "Stieg Larsson","Norstedts förlag");
        Book b2 = new Book (2,"Catcher in the rye","J. D. Salinger","Little, Brown and Company");
        Book b3 = new Book (3,"Lean   for   Life","Louise   Parker","BeazleyBooks");
        Book b4 = new Book (4,"The   Midnight   Gang","David   Walliams","HarperCollinsChildren’s   books");
        Book b5 = new Book (5,"Born   to   Run","Bruce   Springsteen","Simon&Schuster UK");
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);
        return list;
    }
    public Book getBook(long pubID){
        return list.get((int) pubID-1);
    }
      
    
    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_XML)
    public Response createBook(Book b){
        b.setName(b.getName() + " created");
        return Response.status(200).entity("Book with is created sucessfully").build();
    }
    
    
    
    @DELETE
    @Path("/delete/{pubID}")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Response deleteBook(@PathParam("pubID") long pubID) throws URISyntaxException{
        return Response.status(200).entity("Book with the id " + pubID + " is deleted sucessfully").build();

    }
    
}

