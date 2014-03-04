/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.pitt.dao.impl;

import edu.pitt.dao.NewInterface;
import edu.pitt.domain.Book;
import edu.pitt.utils.JdbcUtils;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

/**
 *
 * @author huanwang
 */
public class BookDaoImpl implements NewInterface {

    @Override
    public void add(Object object) {
          try {
            Book book= (Book) object;
            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "insert into book (id, name, author, publisher, publishDate, price, coverId, categoryId) values(?,?,?,?,?,?,?,?)";
            Object[] params = {book.getId(),book.getName(),book.getAuthor(),book.getPublisher(), book.getPublishDate(), book.getPrice(), book.getCoverId(), book.getCategoryId()};
            runner.update(sql, params);
                        
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Object find(String id) {
         try {
          
            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "select * from book where id=?";
            
            return (Book)runner.query(sql, id, new BeanHandler(Book.class));
           
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
        
    }

    @Override
    public List<Object> getAll() {
        try {
            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "select * from book";
            
            return (List<Object>)runner.query(sql, new BeanListHandler(Book.class));       
        } catch (Exception e) {
            throw new RuntimeException(e);
                   
        }
    }


    
}
