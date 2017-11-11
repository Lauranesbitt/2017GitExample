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
import static com.mycompany.jerseytutorial.BookService.list;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import java.util.List;
import javax.ws.rs.Path;
 @Path("/book/get/{pubID}")
public class BookPUTClient {
    public static List<Book> main(String[] args){
    Client client = Client.create();
    WebResource webResource = client.resource("http://localhost:49000/api/book/get");
    
    
    
  /*
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
    
    
    }*/
        return null;
    }
}

