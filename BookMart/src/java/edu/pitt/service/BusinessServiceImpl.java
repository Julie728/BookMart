
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.service;

import edu.pitt.dao.ObjectDAO;
import edu.pitt.dao.impl.*;
import edu.pitt.domain.*;
import java.util.List;

/**
 *
 * @author jeffwan
 */
public class BusinessServiceImpl {

    private ObjectDAO categoryDao = new CategoryDaoImpl();
    private ObjectDAO bookDao = new BookDaoImpl();
    private ObjectDAO orderDao = new OrderDaoImpl();
    private ObjectDAO userDao = new UserDaoImpl();
    private UserDaoImpl userDao1 = new UserDaoImpl();

    public void addCategory(Category category) {
        categoryDao.add(category);
    }

    public Category findCategory(int categoryID) {
        return (Category) categoryDao.find(categoryID);
    }

    public List<Category> getAllCategory() {
        return (List<Category>) categoryDao.getAll();
    }

    public void addBook(Book book) {
        bookDao.add(book);
    }

    public Book findBook(int bookID) {
        return (Book) bookDao.find(bookID);
    }

    public List<Book> getAllBook() {
        return (List<Book>) bookDao.getAll();
    }

    public void updateBook(Book book) {
        bookDao.update(book);
    }

    public void deleteBook(Book book) {
        bookDao.delete(book);
    }

    public void updateCategory(Category category) {
        categoryDao.update(category);
    }

    public void deleteCategory(Category category) {
        categoryDao.delete(category);
    }

    public void addOrder(Order order) {
        orderDao.add(order);
    }

    public Order findOrder(int orderID) {
        return (Order) orderDao.find(orderID);
    }

    public List<Order> getAllOrders() {
        return (List<Order>) orderDao.getAll();
    }

    public void deleteOrder(Order order) {
        orderDao.delete(order);
    }

    public void updateOrder(Order order) {
        orderDao.update(order);
    }

    public void addUser(User user) {
        userDao.add(user);
    }

    public User findUser(int userID) {
        return (User) userDao.find(userID);
    }
    //find user by username
    //create userDaoImpl class object instead of ObjectDao class object
    public int findUser(String userName){
        return userDao1.find(userName);
    }

    public List<User> getAllUsers() {
        return (List<User>) userDao.getAll();
    }

    public void deleteUser(User user) {
        userDao.delete(user);
    }

    public void updateUser(User user) {
        userDao.update(user);
    }

}
