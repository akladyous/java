package repos;

import models.Employee;
import utils.FileUtil;
import utils.SqlConnect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
  // public static Connection conn;
  public static void main(String[] args) {
  }

  public static Boolean createUserTable() {
    String sql = FileUtil.parseSQLFile("create_employees.sql");

    try {
      Connection conn = SqlConnect.dbConnect("boula", "paolo");
      Statement statement = conn.createStatement();
      statement.execute(sql);
    } catch (SQLException e) {
      System.out.println("SQL Error : " + e.getMessage());
      return false;
    }
    return true;
  }

  public static Employee createEmployee(
      String firstName,
      String lastName,
      String email,
      String password,
      Boolean active,
      Boolean verified) {

    String sql = """
        INSERT INTO employee
        (first_name, last_name, email, password, active, verified)
        VALUES (?, ?, ?, ?, ?, ?)""";
    try {
      Connection conn = SqlConnect.dbConnect("boula", "paolo");
      PreparedStatement ps = conn.prepareStatement(sql);
      ps.setString(1, firstName);
      ps.setString(2, lastName);
      ps.setString(3, email);
      ps.setString(4, password);
      ps.setBoolean(5, active);
      ps.setBoolean(6, verified);
      ps.execute();
      Employee emp = new Employee(firstName, lastName, email, password, active, verified);
      return emp;
    } catch (SQLException e) {
      System.out.println("SQL Error : " + e.getMessage());
      return null;
    }
  }

  public static List<Employee> all() {
    String sql = "select * from employee";
    ArrayList<Employee> employees = new ArrayList<>();
    try {
      Connection conn = SqlConnect.dbConnect("boula", "paolo");
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(sql);

      while (rs.next()) {
        Employee emp = new Employee(
            rs.getString("first_name"),
            rs.getString("last_name"),
            rs.getString("email"),
            rs.getString("password"),
            rs.getBoolean("active"),
            rs.getBoolean("verified"));
        employees.add(emp);
      }

    } catch (SQLException e) {
      System.out.println("SQL Error : " + e.getMessage());
      return null;
    }
    return employees;
  }
}
