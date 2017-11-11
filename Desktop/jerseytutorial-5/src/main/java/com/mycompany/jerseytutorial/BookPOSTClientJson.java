/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import javax.ws.rs.Path;

/**
 *
 * @author laura
 */
@Path("/book/create")
public class BookPOSTClientJson {
    public static void main(String[] args){
    Client client = Client.create();
    WebResource webResource = client.resource("http://localhost:49000/api/book/json/create/100");
    
 
    
   // ClientResponse response = webResource.type("application/json").post(ClientResponse.class, emp);
    
    ClientResponse response = webResource.type("application/json").post(ClientResponse.class);
   
    System.out.println("Create Operation Processing.... \n");
    String output = response.getEntity(String.class);
    System.out.println(output);
    }

}
