<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.pitt.dao.impl;

import edu.pitt.dao.ObjectDAO;
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
public class BookDaoImpl implements ObjectDAO<Book> {

    @Override
    public void add(Book book) {
          try {
            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "insert into book (id, name, author, publisher, publishDate, price, coverId, category) values(?,?,?,?,?,?,?,?)";
            Object[] params = {book.getId(),book.getName(),book.getAuthor(),book.getPublisher(), book.getPublishDate(), book.getPrice(), book.getCoverId(), book.getCategory()};
            runner.update(sql, params);
                        
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Book find(int id) {
         try {
          
            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "select * from book where id=?";
            
            return (Book)runner.query(sql, id, new BeanHandler(Book.class));
           
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
        
    }

    @Override
    public List<Book> getAll() {
        try {
            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "select * from book";
            
            return (List<Book>)runner.query(sql, new BeanListHandler(Book.class));       
        } catch (Exception e) {
            throw new RuntimeException(e);
                   
        }
    }

    @Override
    public void delete(Book e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Book e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    


    
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.pitt.dao.impl;

import edu.pitt.dao.ObjectDAO;
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
public class BookDaoImpl implements ObjectDAO<Book> {

    @Override
    public void add(Book book) {
          try {
            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "insert into book (id, name, author, publisher, publishDate, price, coverId, category) values(?,?,?,?,?,?,?,?)";
            Object[] params = {book.getId(),book.getName(),book.getAuthor(),book.getPublisher(), book.getPublishDate(), book.getPrice(), book.getCoverId(), book.getCategory()};
            runner.update(sql, params);
                        
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Book find(int id) {
         try {
          
            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "select * from book where id=?";
            
            return (Book)runner.query(sql, id, new BeanHandler(Book.class));
           
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
        
    }

    @Override
    public List<Book> getAll() {
        try {
            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "select * from book";
            
            return (List<Book>)runner.query(sql, new BeanListHandler(Book.class));       
        } catch (Exception e) {
            throw new RuntimeException(e);
                   
        }
    }

    @Override
    public void delete(Book e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Book e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    


    
}
>>>>>>> FETCH_HEAD
