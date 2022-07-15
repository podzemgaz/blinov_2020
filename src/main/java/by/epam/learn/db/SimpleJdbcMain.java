package by.epam.learn.db;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SimpleJdbcMain {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost/testphones";
        Properties prop = new Properties();
        prop.put("user", "testuser");
        prop.put("password", "testpass");
        prop.put("autoReconnect", "true");
        prop.put("characterEncoding", "UTF-8");
        prop.put("useUnicode", "true");
        prop.put("useSSl", "true");
        prop.put("useJDBCCompliantTimezoneShift","true");
    }
}
