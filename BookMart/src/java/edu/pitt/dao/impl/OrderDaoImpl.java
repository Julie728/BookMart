/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.dao.impl;

import edu.pitt.dao.ObjectDAO;
import edu.pitt.domain.Category;
import edu.pitt.domain.Order;
import edu.pitt.domain.User;
import edu.pitt.utils.JdbcUtils;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

/**
 *
 * @author Liu
 */
public class OrderDaoImpl implements ObjectDAO<Order> {

    @Override
    public void add(Order order) {

        try {
            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "INSERT  INTO Orders (orderId, userId, date, amount, purchasedBooks) VALUES(?,?,?,?,?)";
            Object[] params = {order.getOrderId(), order.getUserId(), order.getDate(), order.getAmount(), order.getPurchasedBooks()};
            runner.update(sql, params);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Order find(int orderId) {
        try {

            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "SELECT * FROM Orders WHERE orderId=?";

            return (Order) runner.query(sql, orderId, new BeanHandler(Category.class));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
        
    /* this method is not delared in DAO interface, and thus causing error when calling from BusinessServiceImpl
    public  List<Order>  findUserOrderList(User user){
        try {
            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "SELECT * FROM Orders"
                    + "WHERE userId = ?";
            return (List<Order>) runner.query(sql, user.getUserID(), new BeanListHandler(Order.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    */
    
    @Override
    public List<Order> getAll() {
        try {
            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "SELECT * FROM Orders";

            return (List<Order>) runner.query(sql, new BeanListHandler(Order.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Order order) {
        try {
            QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
            String sql = "delete from Orders where orderId=?";
            Object[] params = {order.getOrderId()};
            runner.update(sql, params);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * only allow editing order amount and purchased books
     *
     * @param order
     */
    @Override
    public void update(Order order) {
        try{
        QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
        String sql = "UPDATE Orders "
                + " SET  amount =?,  purchasedBooks = ?"
                + " WHERE orderId=?";
        Object[] params = {order.getAmount(), order.getPurchasedBooks(), order.getOrderId()};
        runner.update(sql, params);
    }
    catch (Exception e ) {
            throw new RuntimeException(e);
    }
}

}
