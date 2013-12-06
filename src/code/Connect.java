package code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    
    public Connection open() throws ClassNotFoundException, SQLException {
        // load Driver
        Class.forName("com.mysql.jdbc.Driver");
        
        // connect database
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost/db_jphone", 
                "root", 
                "root");
        return conn;
    }
    
    // psvm
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        new Connect().open();
    }
}
