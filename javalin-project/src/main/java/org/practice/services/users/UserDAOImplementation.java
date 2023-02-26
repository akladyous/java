package org.practice.services.users;

import org.practice.DAOs.users.UsersDAO;
import org.practice.models.User;
import org.practice.utils.FileUtils;
import org.practice.utils.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserDAOImplementation implements UsersDAO {

    private static List<User> users = new ArrayList<>();

    public UserDAOImplementation() {
        super();
    }

    public List<User> getAllUsers() {
        String sql = "SELECT * FROM users;";
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
        Connection conn = JDBCUtils.dbConnect();
        User matchUser = new User();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, user.firstName);
            stmt.setString(2, user.lastName);
            stmt.setString(3, user.email);
            stmt.setString(4, user.password);
            stmt.setBoolean(5, user.getActive());
            stmt.setBoolean(6, user.getVerified());
            stmt.execute();
            ResultSet rs = stmt.getGeneratedKeys();
            stmt.getGeneratedKeys();
            while (rs.next()) {
                matchUser.setId(rs.getInt("id"));
                matchUser.firstName = rs.getString("first_name");
                matchUser.lastName = rs.getString("last_name");
                matchUser.email = rs.getString("email");
                matchUser.password = rs.getString("password");
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

    // READ
    @Override
    public User getUser(int userID) {
        String sql = FileUtils.parseSQLFile("src/main/script/sql/users/get_user_by_id.sql");
        Connection conn = null;
        try {
            conn = JDBCUtils.dbConnect();
            PreparedStatement ps = conn.prepareStatement(
                    sql,
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY
            );
            ps.setInt(1, userID);
            if ( ! ps.execute() ) return null;
            ResultSet rs = ps.getResultSet();
            rs.first();
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
            ps.executeUpdate();
            conn.commit();
//            ResultSet rs = ps.getGeneratedKeys();
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
        }
        return user;
    };

    // DELETE
    @Override
    public Boolean deleteUser(int userID) {
        User user = getUser(userID);
        if ( user == null ) return null;
        String sql = FileUtils.parseSQLFile("src/main/script/sql/users/update_user.sql");
        Connection conn = null;
        try {
            conn = JDBCUtils.dbConnect();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, userID);
            if ( ! ps.execute() ) return false;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            if ( conn != null ) {
                try {
                    System.out.println("Transaction is being rolled back");
                    conn.close();
                } catch (SQLException sqlException) {
                    JDBCUtils.printSQLException(sqlException);
                }
            }
            return null;
        };
        return true;
    };


    // Extra Methods
    public User getUserByFirstName(String firstName) {
        return users
               .stream()
               .filter((user) -> user
                                         .firstName
                                         .equals(firstName)

               )
               .findFirst()
               .orElse(null);
    }

    public User getUserByID(int userID) {
        String sql = FileUtils.parseSQLFile("src/main/script/sql/users/get_user_by_id.sql");
        try {
            Connection conn = JDBCUtils.dbConnect();
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, userID);
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
    }


}
