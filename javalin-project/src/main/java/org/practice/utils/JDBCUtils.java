package org.practice.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {
//  private static final String url = "jdbc:postgresql://localhost/practice";
  private static final String url = "jdbc:mysql://localhost:3306/practice";
  private static Connection connection = null;

  public static Connection dbConnect()   {
    Properties props = new Properties();
    String userName = System.getenv("SQL_USER");
    String password = System.getenv("SQL_PASSWORD");
    props.setProperty("userName", userName);
    props.setProperty("password", password);

    if (connection == null) {
      try {
        connection = DriverManager.getConnection(url, userName, password);
      } catch (SQLException e) {
        System.out.println("Database Connect Error : " + e.getMessage() + '\n');
      }
    }
    return connection;
  };

  public static void printSQLException(SQLException ex) {
    for (Throwable e: ex) {
      if (e instanceof SQLException) {
        e.printStackTrace(System.err);
        System.err.printf( "%-15s : %s%n", "SQL State", ((SQLException) e).getSQLState() );
        System.err.printf( "%-15s : %d%n", "Error Code", ((SQLException) e).getErrorCode() );
        System.err.printf( "%-15s : %d%n", "Error Message", e.getMessage() );
        Throwable t = ex.getCause();
        while (t != null) {
          System.out.println("Cause: " + t);
          t = t.getCause();
        }
      }
    }
  }
}
