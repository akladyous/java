import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String query = FileUtil.parseSQLFile("test.sql");
        System.out.println("query :  \n " + query);
        Connection conn = SqlConnect.dbConnect("boula", "paolo");
    }


}