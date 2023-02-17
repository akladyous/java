package repos;
import models.Employee;
import utils.FileUtil;
import utils.SqlConnect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
//    public static Connection conn;
    public static void main(String[] args) {
    }
    public static Boolean createUserTable() {
        String sql = FileUtil.parseSQLFile("create_employees.sql");

        Connection conn = SqlConnect.dbConnect("boula", "paolo");
        try {
            Statement statement = conn.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            System.out.println("SQL Error : "  + e.getMessage());
            return false;
        }
        return true;
    }

    public static Boolean createUser(
            String firstName,
            String lastName,
            String email,
            String password,
            Boolean active,
            Boolean verified
    ) {
        String sql = "INSERT INTO employee\n" +
                "(first_name, last_name, email, password, active, verified)\n" +
                "VALUES (?, ?, ?, ?, ?, ?)";
        try {
            Connection conn = SqlConnect.dbConnect("boula", "paolo");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, firstName);
            ps.setString(1, lastName);
            ps.setString(2, email);
            ps.setString(3, password);
            ps.setBoolean(3, active);
            ps.setBoolean(4, verified);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("SQL Error : "  + e.getMessage());
            return false;
        }
    }

    public static List<Employee> all() {
        String sql = "select * from user";
        ArrayList<Employee> employees = new ArrayList<>();
        try {
            Connection conn = SqlConnect.dbConnect("boula", "paolo");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Employee usr = new Employee(
                        rs.getString("user_name"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getBoolean("active"),
                        rs.getBoolean("verified")
                );
                employees.add(usr);
            }

        } catch (SQLException e) {
            System.out.println("SQL Error : "  + e.getMessage());
            return null;
        }
        return employees;
    }
}
