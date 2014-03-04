/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.dao;

import java.util.List;

/**
 *
 * @author jeffwan
 */
public interface NewInterface {

    void add(Object object);

    Object find(String id);

    List<Object> getAll();
    
}
