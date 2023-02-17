import repos.EmployeeDAO;

public class Main {
    public static void main(String[] args) {
        Boolean result = EmployeeDAO.createUserTable();
        if (result) {
            System.out.println("table create successfully");
        } else {
            System.out.println("error create table");
        }

//        Boolean john = UsersDAO.createUser("John", "john@gmail.com", "000000", true);
//        Boolean mary = UsersDAO.createUser("Mary", "paolo@yahoo.com", "000000", true);
//        Boolean keven = UsersDAO.createUser("Keven", "keven@gmail.com", "000000", false);
//        if (john) {
//            System.out.println("record create successfully");
//        } else {
//            System.out.println("error create record");
//        }

    }


}