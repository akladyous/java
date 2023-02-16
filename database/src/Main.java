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

    public static void prova() {
        BufferedReader reader = null;
        File script;
        StringBuilder query = new StringBuilder();
        String line;
        try {
            reader = new BufferedReader( new FileReader("./data/test.sql"));
            while ( (line = reader.readLine() )!= null ) {
                System.out.println("line : " + line);
                query.append(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("-".repeat(40));
        System.out.println("scripts : " + query);
    }
}