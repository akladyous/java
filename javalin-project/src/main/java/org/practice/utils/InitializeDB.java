package org.practice.utils;

import org.practice.Main;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InitializeDB {
    private static String packageName = Main.class.getPackageName();
    private static Boolean initialized = false;

    public static Boolean initializeDB(){
        String query = "src/main/script/sql/create_database.sql";
        String sql = FileUtil.parseSQLFile(query);
        if (sql.isBlank() || sql.isEmpty()) return false;
        try {
            Connection conn = SqlConnect.dbConnect();
            Statement statement = conn.createStatement();
            statement.execute(sql);
            return true;
        } catch (SQLException e) {
            System.out.println("SQL Error : " + e.getMessage());
            return false;
        }
    };

    public static Boolean initializeTables(){
        String query = "src/main/script/sql/create_tables.sql";
        String sql = FileUtil.parseSQLFile(query);
        if (sql.isBlank() || sql.isEmpty()) return false;
        try {
            Connection conn = SqlConnect.dbConnect();
            Statement statement = conn.createStatement();
            statement.execute(sql);
            return true;
        } catch (SQLException e) {
            System.out.println("SQL Error : " + e.getMessage());
            return false;
        }
    };
}
