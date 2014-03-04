/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.service;

import edu.pitt.dao.impl.CategoryDaoImpl;
import edu.pitt.domain.Category;
import java.util.List;

/**
 *
 * @author jeffwan
 */
public class BusinessServiceImpl {
    private CategoryDaoImpl categoryDao = new CategoryDaoImpl();
            
    public void addCategory (Category category) {
        categoryDao.add(category);
    }
    
    public Category findCategory (String id) {
        return categoryDao.find(id);
    }
    
    public List<Category> getAllCategory() {
        return categoryDao.getAll();
    }
    
}
