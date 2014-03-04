package edu.pitt.dao.impl;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import edu.pitt.dao.NewInterface;
import edu.pitt.domain.Category;
import edu.pitt.utils.JdbcUtils;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

/**
 *
 * @author jeffwan
 */
public class CategoryDaoImpl implements NewInterface {
    
    @Override
    public void add(Category category) {
        
        try {
            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "insert into category (id, name, description) values(?,?,?)";
            Object[] params = {category.getId(),category.getName(),category.getDescription()};
            runner.update(sql, params);
                        
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public Category find(String id) {
        try {
            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "select * from category where id=?";
            
            return (Category)runner.query(sql, id, new BeanHandler(Category.class));
           
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
        
    }    
    
    
    @Override
    public List<Category> getAll() {
        try {
            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "select * from category";
            
            return (List<Category>)runner.query(sql, new BeanListHandler(Category.class));       
        } catch (Exception e) {
            throw new RuntimeException(e);
                   
        }
    }
    
    
    
}
