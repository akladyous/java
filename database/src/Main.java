import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        String query = FileUtil.parseSQLFile("test.sql");
        System.out.println("query :  \n " + query);
        Connection conn = SqlConnect.dbConnect("boula", "paolo");


    }


}