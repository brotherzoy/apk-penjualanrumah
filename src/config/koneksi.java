package config;

import java.sql.*;

/**
 *
 * @author Yayan Sopyan ST
 */
public class koneksi {
    public static Connection getConnection() throws ClassNotFoundException {
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/db_penjualanrumahryzha";
        String user = "root";
        Class.forName("com.mysql.jdbc.Driver");

        String password = "";
        try {
            conn = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
            System.out.println(e);
            }
            return conn;
        }
        public static void main(String[] args) throws ClassNotFoundException {
        try {
            Connection c = koneksi.getConnection();
            System.out.println(String.format("Connected1 to database %s " +
            "successfully.", c.getCatalog()));
            } catch (SQLException e) {
            System.out.println(e);
            }
        }

}