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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name="book")

public class Book {
    public long pubID;
    public String name;
    public String author;
    public String publisher;
    
    public Book(){
        
    }
    
    public Book(long pubID,String name, String author,String publisher){
        this.pubID = pubID;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }

  
    
    @XmlElement(required=true)
    public long getPubID() {
        return pubID;
    }

    public void setPubID(int pubID) {
        this.pubID = pubID;
    }
    
    @XmlElement(required=true)
    public String getName() {
        return name;
    }
    
    
    public void setName(String name) {
        this.name = name;
    }
    
    @XmlElement(required=true)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPublisher(String publisher) {
        this.author = publisher;
    }
}

