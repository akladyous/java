import utils.FileUtil;
import utils.SqlConnect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String query = FileUtil.parseSQLFile("test.sql");
        System.out.println("query :  \n " + query);

        Connection conn = SqlConnect.dbConnect("boula", "paolo");
        try {
            Statement statement = conn.createStatement();
            ResultSet rs =  statement.executeQuery(query);
            while (rs.next()) {

            }
        } catch (SQLException e) {
            System.out.println("SQL Error : " + e.getMessage());
        }


    }


}