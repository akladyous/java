package repos;

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

    public static Boolean createUsers(String userName, String email,String password,Boolean verified) {
        String sql = "INSERT INTO users (username, email, password, verified) VALUES (?, ?, ?, ?)";
        try {
            Connection conn = SqlConnect.dbConnect("boula", "paolo");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, userName);
            ps.setString(2, email);
            ps.setString(3, password);
            ps.setBoolean(4, verified);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("SQL Error : "  + e.getMessage());
            return false;
        }
    }
}
