package models;

import utils.FileUtil;
import utils.SqlConnect;

import java.sql.Connection;

public class UsersDAO {

    public static void main(String[] args) {
        Connection conn = SqlConnect.dbConnect("boula", "paolo");
    }

    public static void CreateUsersTable(Connection conn) {
        String sql = FileUtil.parseSQLFile("create_users.sql");
    }

}
