package org.practice.utils;

import org.practice.Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SqlConnect {
  private static String packageName = Main.class.getPackageName();
  private static String url = "jdbc:postgresql://localhost/practice";
  private static Connection connection = null;

  public static void main(String[] args) {
  }

  public static Connection dbConnect() {
    Properties props = new Properties();
    String userName = System.getenv("POSTGRES_USER");
    String password = System.getenv("POSTGRES_PASSWORD");
    props.setProperty("userName", userName);
    props.setProperty("password", password);
    if (connection == null) {
      try {
        connection = DriverManager.getConnection(url, props);

      } catch (SQLException e) {
        System.out.println("Database Connect Error : " + e.getMessage() + '\n');
      }
    }
    return connection;
  }
}
