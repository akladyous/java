package models;

import utils.FileUtil;
import utils.SqlConnect;

import java.sql.*;

public class UsersDAO {

    public static void main(String[] args) {

    }

    public static Boolean createUsersTable() {
        try {
            String sql = FileUtil.parseSQLFile("create_users.sql");
            Connection conn = SqlConnect.dbConnect("boula", "paolo");

            /*
             PreparedStatement ps = conn.prepareStatement(sql);
             ps.executeQuery();
            */
            Statement statement = conn.createStatement();
//            ResultSet rs = statement.executeQuery(sql);
//            statement.executeQuery(sql);
            statement.execute(sql);
            return true;
        } catch (SQLException e) {
            System.out.println("SQL Error : "  + e.getMessage());
            return false;
        }
    }

    public static void createUsers() {

    }
}
