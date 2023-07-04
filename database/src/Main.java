import models.Employee;
import repos.EmployeeDAO;

import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Boolean result = EmployeeDAO.createUserTable();
    if (result) {
      System.out.println("table create successfully");
    } else {
      System.out.println("error create table");
    }

    Employee john = EmployeeDAO.createEmployee(
        "John",
        "Doe",
        "john@gmail.com",
        "000000",
        true,
        false);
    Employee keven = EmployeeDAO.createEmployee(
        "Keven",
        "McLeen",
        "keven@gmail.com",
        "000000",
        true,
        false);
    Employee mary = EmployeeDAO.createEmployee(
        "Mary",
        "Smith",
        "mary@gmail.com",
        "000000",
        true,
        false);
    // if (john != null) {
    // System.out.println(john);
    // } else {
    // System.out.println("error create record");
    // }

    System.out.println(EmployeeDAO.all());
  }

}
