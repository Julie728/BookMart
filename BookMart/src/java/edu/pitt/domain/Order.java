package edu.pitt.domain;

import java.util.Date;
/**
 *Order Class
 * @author Liu
 */
public class Order {
    private int orderId;
    private int userId;
    private Date date;
    private Double amount;
    private String purchasedBooks;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public void setAmount(Double amountDouble) {
        this.amount = amountDouble;
    }

    public String getPurchasedBooks() {
        return purchasedBooks;
    }

    public void setPurchasedBooks(String purchasedBooks) {
        this.purchasedBooks = purchasedBooks;
    }
   
}
