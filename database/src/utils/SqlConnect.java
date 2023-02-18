package utils;
import java.sql.*;
import java.util.Properties;
public class SqlConnect {
    private static String url = "jdbc:postgresql://localhost/practice";
    private static String userName;
    private static String userPassword;
    private static Connection connection = null;

    public static void main(String[] args) {}
    public static Connection dbConnect(String userName, String password) {
        Properties props = new Properties();
        props.setProperty("userName", userName);
        props.setProperty("password", password);
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(url, props);

            } catch (SQLException e) {
                System.out.println("Database Connect Error : " +  e.getMessage() + '\n');
            }
        }
        return connection;
    }
}