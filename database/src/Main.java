import repos.UsersDAO;

public class Main {
    public static void main(String[] args) {
        Boolean result = UsersDAO.createUsersTable();
        if (result) {
            System.out.println("table create successfully");
        } else {
            System.out.println("error create table");
        }

        Boolean paolo = UsersDAO.createUsers("paolo", "paolo@milano.com", "000000", true);
        if (paolo) {
            System.out.println("record create successfully");
        } else {
            System.out.println("error create record");
        }

    }


}