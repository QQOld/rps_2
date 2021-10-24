package Base.DAO;

import java.sql.*;
import java.util.Scanner;

public class Dao {

    public static Connection getConn() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/volorg?user=qq2";
        return DriverManager.getConnection(url);
    }

    public static void initConn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        } catch(Exception ex){
            System.out.println("Connection failed...");
        }

    }
}
