package org.practice.services;

import org.practice.DAOs.DAOsException;
import org.practice.DAOs.UsersDAO;
import org.practice.models.User;
import org.practice.utils.FileUtil;
import org.practice.utils.SqlConnect;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserServices implements UsersDAO {

    private static List<User> users = new ArrayList<>();

    public UserServices() {
        super();
    }

    @Override
    public List<User> getAllUsers() {
        String sql = "SELECT * FROM users;";
        try {
            Connection conn = SqlConnect.dbConnect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                User matchUser = new User(
                        rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("email"),
                        rs.getString("password")
                );
                matchUser.setActive(rs.getBoolean("active"));
                matchUser.setVerified(rs.getBoolean("verified"));
                users.add(matchUser);
            };
        } catch (SQLException e) {
            System.out.println("SQL Error : " + e.getMessage());
            return null;
        }
        return users;
    }

    @Override
    public User createUser(User user) {
        String sql = FileUtil.parseSQLFile("src/main/script/sql/users/create_user.sql");
        Connection conn = SqlConnect.dbConnect();
        User matchUser = new User();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, user.getFirstName());
            stmt.setString(2, user.getLastName());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getPassword());
            stmt.setBoolean(5, user.getActive());
            stmt.setBoolean(6, user.getVerified());
            stmt.execute();
            ResultSet rs = stmt.getGeneratedKeys();
            stmt.getGeneratedKeys();
            while (rs.next()) {
                matchUser.setId(rs.getInt("id"));
                matchUser.setFirstName(rs.getString("first_name"));
                matchUser.setLastName(rs.getString("last_name"));
                matchUser.setEmail(rs.getString("email"));
                matchUser.setPassword(rs.getString("password"));
                matchUser.setActive(rs.getBoolean("active"));
                matchUser.setVerified(rs.getBoolean("verified"));
            };
        } catch (SQLIntegrityConstraintViolationException ce) {
            System.out.println("SQL Integrity Constraint Violation Exception");
            System.out.println(ce.getMessage());
            return null;
        }  catch (SQLException e) {
                System.out.println("SQL Error : " + e.getMessage());
            return null;
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch ( SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return matchUser;
    };

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
                    rs.getString("password")
            );
            matchUser.setActive(rs.getBoolean("active"));
            matchUser.setVerified(rs.getBoolean("verified"));

            return matchUser;
        } catch (SQLException e) {
            System.out.println("SQL Error : " + e.getMessage());
            return null;
        }
    };

    @Override
    public User updateUser(User user) throws DAOsException {
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
