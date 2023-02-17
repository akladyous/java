package repos;

import models.User;
import utils.FileUtil;
import utils.SqlConnect;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsersDAO {

    public static void main(String[] args) {

    }

    public static Boolean createUserTable() {
        try {
            String sql = FileUtil.parseSQLFile("create_users.sql");
            Connection conn = SqlConnect.dbConnect("boula", "paolo");
            Statement statement = conn.createStatement();
            statement.execute(sql);
            return true;
        } catch (SQLException e) {
            System.out.println("SQL Error : "  + e.getMessage());
            return false;
        }
    }

    public static Boolean createUser(String userName, String email,String password,Boolean verified) {
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

    public static List<User> all() {
        String sql = "select * from user";
        ArrayList<User> users = new ArrayList<>();
        try {
            Connection conn = SqlConnect.dbConnect("boula", "paolo");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                User usr = new User(
                        rs.getString("user_name"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getBoolean("active"),
                        rs.getBoolean("verified")
                );
                users.add(usr);
            }

        } catch (SQLException e) {
            System.out.println("SQL Error : "  + e.getMessage());
            return null;
        }
        return users;
    }
}
