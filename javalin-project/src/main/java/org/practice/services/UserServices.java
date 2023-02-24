package org.practice.services;

import org.practice.DAOs.DAOsException;
import org.practice.DAOs.UsersDAO;
import org.practice.models.User;
import org.practice.utils.FileUtil;
import org.practice.utils.SqlConnect;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserServices implements UsersDAO {

    public static List<User> users = new ArrayList<>();

    private void init(){

    }

    public UserServices() {
        super();
        System.out.println("UserServices constructor " );
    }

    @Override
    public List<User> getAllUsers() {
        String sql = "SELECT * FROM users;";
        try {
            Connection conn = SqlConnect.dbConnect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                User usr = new User(
                        rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getBoolean("active"),
                        rs.getBoolean("verified"));
                users.add(usr);
            };
        } catch (SQLException e) {
            System.out.println("SQL Error : " + e.getMessage());
            return null;
        }
        return users;
    }

    @Override
    public User createUser(User user) throws DAOsException {
        String sql = FileUtil.parseSQLFile("src/main/script/sql/users/create_user.sql");
        try {
            Connection conn = SqlConnect.dbConnect();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.getFirstName());
            ps.setString(2, user.getLastName());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPassword());
            ps.setBoolean(5, user.getActive());
            ps.setBoolean(6, user.getVerified());
            ps.execute();

            ResultSet rs = ps.getGeneratedKeys();
            user.setId(rs.getInt(1));

        } catch (SQLException e) {
            System.out.println("SQL Error : " + e.getMessage());
            return null;
        }
        return user;
    }

    @Override
    public User getUser(int userID) throws DAOsException {
        String sql = FileUtil.parseSQLFile("src/main/script/sql/users/get_user_by_id.sql");
        try {
            Connection conn = SqlConnect.dbConnect();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, String.valueOf(userID));
            ResultSet rs = ps.executeQuery();
            User matchUser = new User(
                    rs.getInt("id"),
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getString("email"),
                    rs.getString("password"),
                    rs.getBoolean("active"),
                    rs.getBoolean("verified")
            );
            return matchUser;
        } catch (SQLException e) {
            System.out.println("SQL Error : " + e.getMessage());
            return null;
        }
    };

    @Override
    public User updateUser(User user) throws DAOsException {
        return null;
    }

    @Override
    public Boolean deleteUser(int id) throws DAOsException {
        return null;
    }

    public User getUserByFirstName(String firstName) {
        return users
               .stream()
               .filter((user) -> user
                                         .getFirstName()
                                         .equals(firstName))
               .findFirst()
               .orElse(null);
    }

    public User getUserByID(int id) {
        return null;
    }


}
