package org.practice.utils;

import org.practice.Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static String packageName = Main.class.getPackageName();
    private static String DB_NAME = "practice";
    private static Boolean initialized = false;
    List<String> dbTables = new ArrayList<>();

    public static void main(String[] args) {
        if (! initialized) {
            initializeDB();
            initializeDB();
            initialized = true;
        };
    };

    private static void initializeDB(){
        String sql = FileUtil.parseSQLFile("create_database.sql");
        try {
            Connection conn = SqlConnect.dbConnect();
            Statement statement = conn.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            System.out.println("SQL Error : " + e.getMessage());
        }
    };

    private static void initializeTables(){
        String sql = FileUtil.parseSQLFile("create_database.sql");
        try {
            Connection conn = SqlConnect.dbConnect();
            Statement statement = conn.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            System.out.println("SQL Error : " + e.getMessage());
        }
    };
}
