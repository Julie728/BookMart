/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.dao;

import edu.pitt.domain.Category;
import java.util.List;

/**
 *
 * @author jeffwan
 */
public interface NewInterface {

    void add(Category category);

    Category find(String id);

    List<Category> getAll();
    
}
