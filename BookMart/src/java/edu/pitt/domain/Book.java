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
    private int bookID;
    private String bookName;
    private String author;
    private String publisher;
    private Date publishDate;
    private double price;
    private String coverID;
    private int categoryID;
    private String description;
    /**
     * get the book category
     * @return 
     */
    public int getCategoryID() {
        return categoryID;
    }
    /**
     * set book belongs to which category
     * @param category 
     */
    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }
    /**
     * get book id
     * @return 
     */
    public int getBookID() {
        return bookID;
    }
    /**
     * set book id
     * @param id 
     */
    public void setId(int bookID) {
        this.bookID = bookID;
    }
    /**
     * get book name
     * @return 
     */
    public String getBookName() {
        return bookName;
    }
    /**
     * set book name
     * @param name 
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
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
    public String getCoverID() {
        return coverID;
    }
    /**
     * set cover ID
     * @param coverId 
     */
    public void setCoverId(String coverID) {
        this.coverID = coverID;
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
