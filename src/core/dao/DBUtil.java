package core.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DBUtil {

    private static final String JDBC = "jdbc:mysql://localhost:3306";
    private static final String USER = "root";
    private static final String PSWD = "zcy12345";

    private static Connection conn;

    public static Connection getConnection(){
        if(conn != null) return conn;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(JDBC, USER, PSWD);
        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(){
        if(conn == null) return;

        try {
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
