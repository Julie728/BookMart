/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.dao;

import java.util.List;

/**
 * 
 * @author Liu
 * @param <E> 
 */
public interface ObjectDAO<E> {

    void add(E e);

    E find(String id);

    List<E> getAll();
    
    void delete(E e);
    
    void update(E e);
    
    
}
