/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.dao.impl;

import edu.pitt.dao.ObjectDAO;
import edu.pitt.domain.Category;
import edu.pitt.domain.Order;
import edu.pitt.utils.JdbcUtils;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

/**
 *
 * @author Liu
 */
public class OrderDaoIpl implements ObjectDAO<Order> {

    @Override
    public void add(Order order) {

        try {
            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "insert into order (orderId, userId, date, amount, purchasedBooks) values(?,?,?,?,?)";
            Object[] params = {order.getOrderId(), order.getUserId(), order.getDate(), order.getAmount(), order.getPurchasedBooks()};
            runner.update(sql, params);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Order find(String orderId) {
        try {

            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "select * from order where orderId=?";

            return (Order) runner.query(sql, orderId, new BeanHandler(Category.class));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Order> getAll() {
        try {
            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "select * from order";

            return (List<Order>) runner.query(sql, new BeanListHandler(Order.class));
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }

    @Override
    public void delete(Order e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Order e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
