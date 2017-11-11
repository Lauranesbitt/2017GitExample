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
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;



public class BookPUTClientJson {
        public static void main(String[] args){
    Client client = Client.create();
    WebResource webResource = client.resource("http://localhost:49000/api/book/json/update/100");
    
 
    ClientResponse response = webResource.type("application/json").put(ClientResponse.class);
    
    System.out.println("Update Operation Processing.... \n");
    String output = response.getEntity(String.class);
    System.out.println(output);
    }
}




