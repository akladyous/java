import javax.annotation.processing.FilerException;
import java.sql.*;
import java.util.Properties;
public class SqlConnect {
    private static String url = "jdbc:postgresql://localhost/practice";
    private static String userName;
    private static String userPassword;
    private static Connection connection = null;

    public static Connection dbConnect(String userName, String password) {
        Properties props = new Properties();
        props.setProperty("userName", userName);
        props.setProperty("password", password);
        try {
            connection = DriverManager.getConnection(url, props);
//            Statement s = connection.createStatement();
//            s.execute(queryScript);
        } catch (SQLException e) {
            System.out.println("Database Connect Error : " +  e.getMessage() + '\n');
        } catch (Exception e ) {
            System.out.println("");
        }
        return connection;
    }
}