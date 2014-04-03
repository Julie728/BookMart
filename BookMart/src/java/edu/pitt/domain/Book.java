/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * book class
 * @author yan ma
 * 
 * define all book attributes
 * all getters and setters
 */
package edu.pitt.domain;

import java.util.Date;

public class Book{
    private String id;
    private String name;
    private String author;
    private String publisher;
    private Date publishDate;
    private double price;
    private String coverId;
    private String category;
    private String description;
    /**
     * get the book category
     * @return 
     */
    public String getCategory() {
        return category;
    }
    /**
     * set book belongs to which category
     * @param category 
     */
    public void setCategory(String category) {
        this.category = category;
    }
    /**
     * get book id
     * @return 
     */
    public String getId() {
        return id;
    }
    /**
     * set book id
     * @param id 
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * get book name
     * @return 
     */
    public String getName() {
        return name;
    }
    /**
     * set book name
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * get book author
     * @return 
     */
    public String getAuthor() {
        return author;
    }
    /**
     * set book author
     * @param author 
     */
    public void setAuthor(String author) {
        this.author = author;
    }
    /**
     * get book publisher
     * @return 
     */
    public String getPublisher() {
        return publisher;
    }
    /**
     * set publisher
     * @param publisher 
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    /**
     * get book publish date
     * @return 
     */
    public Date getPublishDate() {
        return publishDate;
    }
    /**
     * set book publish date
     * @param publishDate 
     */
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
    /**
     * get book price
     * @return 
     */
    public double getPrice() {
        return price;
    }
    /**
     * set book price
     * @param price 
     */
    public void setPrice(double price) {
        this.price = price;
    }
    /**
     * get cover id
     * @return cover id
     */
    public String getCoverId() {
        return coverId;
    }
    /**
     * set cover ID
     * @param coverId 
     */
    public void setCoverId(String coverId) {
        this.coverId = coverId;
    }
    /**
     * get description method
     * @return description attribute value
     */
    public String getDescription() {
        return description;
    }
    /**
     * set description method
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
    
}
