package org.practice.services.users;

import org.practice.DAOs.users.UsersDAO;
import org.practice.models.User;
import org.practice.utils.FileUtils;
import org.practice.utils.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImplementation implements UsersDAO {

    public UserDAOImplementation() {
        super();
    }

    public List<User> getAllUsers() {
        String sql = "SELECT * FROM users;";
        List<User> users = new ArrayList<>();
        try {
            Connection conn = JDBCUtils.dbConnect();
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

    // CREATE
    @Override
    public User createUser(User user)  {
        String sql = FileUtils.parseSQLFile("src/main/script/sql/users/create_user.sql");
        Connection conn = null;
        try {
            conn = JDBCUtils.dbConnect();
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.firstName);
            ps.setString(2, user.lastName);
            ps.setString(3, user.email);
            ps.setString(4, user.password);
            ps.setBoolean(5, user.getActive());
            ps.setBoolean(6, user.getVerified());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                user.setId(Integer.valueOf(rs.getString(1)));
            } else {
                return null;
            };
        } catch (SQLIntegrityConstraintViolationException ce) {
            System.out.println("SQL Integrity Constraint Violation Exception");
            System.out.println(ce.getMessage());
            return null;
        }  catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return null;
        }
        return user;
    };

    // READ
    @Override
    public User getUser(int userID) {
        String sql = FileUtils.parseSQLFile("src/main/script/sql/users/get_user_by_id.sql");
        User matchUser;
        Connection conn = null;
        try {
            conn = JDBCUtils.dbConnect();
            PreparedStatement ps = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ps.setInt(1, userID);
            if ( ! ps.execute() ) return null;
            ResultSet rs = ps.getResultSet();
            rs.first();
            matchUser = new User(
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
            JDBCUtils.printSQLException(e);
            return null;
        }
    };

    // UPDATE
    @Override
    public User updateUser(User user)  {
        String sql = FileUtils.parseSQLFile("src/main/script/sql/users/update_user.sql");
        Connection conn = null;
        try {
            conn = JDBCUtils.dbConnect();
            conn.setAutoCommit(false);
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.firstName);
            ps.setString(2, user.lastName);
            ps.setString(3, user.email);
            ps.setString(4, user.password);
            ps.setBoolean(5, user.getActive());
            ps.setBoolean(6, user.getVerified());
            ps.setInt(7, user.getId());
            ps.execute();
            conn.commit();
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            if ( conn != null ) {
                try {
                    System.out.println("Transaction is being rolled back");
                    conn.rollback();
                    conn.close();
                } catch (SQLException sqlException) {
                    JDBCUtils.printSQLException(sqlException);
                }
            }
            return null;
        };
        return user;
    };

    // DELETE
    @Override
    public Boolean deleteUser(int userID) {
        int queryResult = 0;
        Connection conn = null;
        String sql = FileUtils.parseSQLFile("src/main/script/sql/users/delete_user.sql");
        try {
            conn = JDBCUtils.dbConnect();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, userID);
            queryResult = ps.executeUpdate();
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return queryResult == 1;
    };


    // Extra Methods
    public User getUserByFirstName(String firstName) {
        List<User> users = getAllUsers();
        return users
               .stream()
               .filter((user) -> user.firstName.equals(firstName))
               .findFirst()
               .orElse(null);
    };

}
