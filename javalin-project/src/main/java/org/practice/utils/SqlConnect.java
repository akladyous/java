package org.practice.utils;

import org.practice.DAOs.DAOsException;
import org.practice.Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SqlConnect  {
//  private static final String url = "jdbc:postgresql://localhost/practice";
  private static final String url = "jdbc:mysql://localhost:3306/practice";
  private static Connection connection = null;
  public static void main(String[] args) {
  }

  public static Connection dbConnect()  {
    Properties props = new Properties();
    String userName = System.getenv("SQL_USER");
    String password = System.getenv("SQL_PASSWORD");
    props.setProperty("userName", userName);
    props.setProperty("password", password);
    if (connection == null) {
      try {
        connection = DriverManager.getConnection(url, "root", "paolo");
      } catch (SQLException e) {
        System.out.println("Database Connect Error : " + e.getMessage() + '\n');
      }
    }
    return connection;
  }
}
