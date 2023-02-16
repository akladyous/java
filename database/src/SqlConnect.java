import javax.annotation.processing.FilerException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
public class SqlConnect {
    private static String url = "jdbc:postgresql://localhost/practice";
    private static String userName;
    private static String userPassword;
    private static String queryScript;
    private static Connection connection = null;

    public static void main(String[] args) {
        String ss = parseSqlFile("test.sql");
        System.out.println("result \n" + ss);
    }
    public static String parseSqlFile(String sqlFileName) {
        StringBuilder query = new StringBuilder();
        String sqlFile = System.getProperty("user.dir").concat("/data/").concat(sqlFileName);
        File script = new File(sqlFile);
        BufferedReader reader = null;
        String line;
        try {
            reader = new BufferedReader( new FileReader(script) );
            while ( (line = reader.readLine()) != null ) {
                query.append(line);
            }
            queryScript = query.toString();
        } catch (IOException ioe) {
            System.out.println("Error Reading File " + ioe.getMessage() );
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return queryScript;
    }
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