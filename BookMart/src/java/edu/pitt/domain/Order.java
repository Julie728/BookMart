package edu.pitt.domain;

import java.util.Date;
/**
 *Order Class
 * @author Liu
 */
public class Order {
    private int orderID;
    private int userID;
    private Date date;
    private Double amount;
    private String purchasedBooks;

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getPurchasedBooks() {
        return purchasedBooks;
    }

    public void setPurchasedBooks(String purchasedBooks) {
        this.purchasedBooks = purchasedBooks;
    }

    
   
}
