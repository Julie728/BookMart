
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.dao.impl;

import edu.pitt.dao.ObjectDAO;
import edu.pitt.domain.Book;
import edu.pitt.utils.JdbcUtils;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            String sql = "insert into book (bookname, author, publisher, publishDate, price, coverID, categoryID) values(?,?,?,?,?,?)";
            Object[] params = {book.getBookName(), book.getAuthor(), book.getPublisher(), book.getPublishDate(), book.getPrice(), book.getCoverID(), book.getCategoryID()};
            runner.update(sql, params);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Book find(int id) {
        try {

            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "select * from book where bookID=?";

            return (Book) runner.query(sql, id, new BeanHandler(Book.class));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Book> getAll() {
        try {
            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "select * from book";
            
            return (List<Book>) runner.query(sql, new BeanListHandler(Book.class));
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }

    @Override
    public void delete(Book book) {
        try {
            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "delete from book where bookID=?";
            Object[] params = {book.getBookID()};
            runner.update(sql, params);
        } catch (SQLException ex) {
            Logger.getLogger(BookDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(Book book) {
        try {
            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "UPDATE book SET name = ?, author = ?, publisher = ?, publishDate = ?, price = ?,"
                    + " coverID = ?, category = ? WHERE bookID=?;";
            Object[] params = {book.getBookName(), book.getAuthor(), book.getPublisher(), book.getPublishDate(),
                book.getPrice(), book.getCoverID(), book.getCategoryID(), book.getBookID()};
            runner.update(sql, params);
        } catch (SQLException ex) {
            Logger.getLogger(BookDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
