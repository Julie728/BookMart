/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.service;

import edu.pitt.dao.ObjectDAO;
import edu.pitt.dao.impl.BookDaoImpl;
import edu.pitt.dao.impl.CategoryDaoImpl;
import edu.pitt.domain.Book;
import edu.pitt.domain.Category;
import java.util.List;

/**
 *
 * @author jeffwan
 */
public class BusinessServiceImpl {
    private ObjectDAO categoryDao = new CategoryDaoImpl();
    private ObjectDAO bookDao = new BookDaoImpl();

            
    public void addCategory (Category category) {
        categoryDao.add(category);
    }
    
    public Category findCategory (String id) {
        return (Category)categoryDao.find(id);
    }
    
    public List<Category> getAllCategory() {
        return (List<Category>)categoryDao.getAll();
    }
    
    
    public void addBook (Book book) {
        bookDao.add(book);
    }
    
    public Book findBook (String id) {
        return (Book)bookDao.find(id);
    }
    
    public List<Book> getAllBook() {
        return (List<Book>)bookDao.getAll();
    }

    public void updateBook(){
        
    }
    
    public void deleteBook(){
        
    }
    
    public void updateCategory(){
        
    }
    
    public void deleteCategory(){
        
    }
    
    
    
}
