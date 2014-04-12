package edu.pitt.dao.impl;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.pitt.dao.ObjectDAO;
import edu.pitt.domain.Category;
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
 * @author jeffwan
 */
public class CategoryDaoImpl implements ObjectDAO<Category> {

    @Override
    public void add(Category category) {

        try {
            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "insert into category (categoryName, description) values(?,?)";
            Object[] params = {category.getCategoryName(), category.getDescription()};
            runner.update(sql, params);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Category find(int id) {
        try {

            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "select * from category where categoryID=?";

            return (Category) runner.query(sql, id, new BeanHandler(Category.class));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Category> getAll() {
        try {
            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "select * from category";

            return (List<Category>) runner.query(sql, new BeanListHandler(Category.class));
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }

    @Override
    public void delete(Category category) {
        try {
            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "delete from category where categoryID=?";
            Object[] params = {category.getCategoryID()};
            runner.update(sql, params);
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Category category) {
        try {
            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "UPDATE category SET categoryName = ?, description = ? WHERE categoryID=?;";
            Object[] params = {category.getCategoryName(), category.getDescription(), category.getCategoryID()};
            runner.update(sql, params);
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
