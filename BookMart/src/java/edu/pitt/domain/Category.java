/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.domain;

import edu.pitt.dao.impl.CategoryDaoImpl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeffwan
 */
public class Category {
    
    private String id;
    private String name;
    private String description;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public List<Category> getAllCategory(){
        //get all category name
        CategoryDaoImpl categoryDao = new CategoryDaoImpl();
        
        List<Category> categorylist = categoryDao.getAll();
        
        return categorylist;
    }
    
}
