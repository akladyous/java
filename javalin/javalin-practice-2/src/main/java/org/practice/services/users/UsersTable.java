package org.practice.services.users;

import org.practice.utils.JDBCUtils;
import java.sql.*;

public class UsersTable {

    public static void info() {
        String sql = "select * from users limit 1";
        try {
            Connection conn = JDBCUtils.dbConnect();
            Statement firstRowStmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = firstRowStmt.executeQuery(sql);
            ResultSetMetaData metaData = rs.getMetaData();

            int columnCount = metaData.getColumnCount();
            for (int colNum = 1; colNum <= columnCount; colNum++) {
                System.out.println( "getColumnName : " + metaData.getColumnName(colNum));
                System.out.println( "getColumnClassName : " + metaData.getColumnClassName(colNum));
                System.out.println( "getColumnTypeName : " + metaData.getColumnTypeName(colNum));
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
