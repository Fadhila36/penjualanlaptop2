/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.koneksi;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fadhila
 */
public class Database {
    private static Connection conn;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                conn = DriverManager.getConnection("jdbc:mysql://localhosts/laptop", "root", "");
            } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conn;
    }
}
