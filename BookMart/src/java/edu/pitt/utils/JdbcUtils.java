/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

/**
 *
 * @author jeffwan
 */
public class JdbcUtils {
    
    private static DataSource ds = null;
    
    static {
       ds = new ComboPooledDataSource();
    }
    
    public static DataSource getDataSource() {
        return ds;
        
    }
    
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
    
    
}
