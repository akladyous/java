import models.UsersDAO;

public class Main {
    public static void main(String[] args) {
        Boolean result = UsersDAO.createUsersTable();
        if (result) {
            System.out.println("table create successfully");
        } else {
            System.out.println("error create table");
        }

    }


}