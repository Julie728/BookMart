
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

    public void addCategory(Category category) {
        categoryDao.add(category);
    }

    public Category findCategory(int id) {
        return (Category) categoryDao.find(id);
    }

    public List<Category> getAllCategory() {
        return (List<Category>) categoryDao.getAll();
    }

    public void addBook(Book book) {
        bookDao.add(book);
    }

    public Book findBook(int id) {
        return (Book) bookDao.find(id);
    }

    public List<Book> getAllBook() {
        return (List<Book>) bookDao.getAll();
    }

    public void updateBook() {

    }

    public void deleteBook() {

    }

    public void updateCategory() {

    }

    public void deleteCategory() {

    }

    public void addOrder(Order order) {
        orderDao.add(order);
    }

    public Order findOrder(int id) {
        return (Order) orderDao.find(id);
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
}
