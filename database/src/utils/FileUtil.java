package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileUtil {
  public static String parseSQLFile(String fileName) {
    StringBuilder query = new StringBuilder();
    String sqlFile = System
        .getProperty("user.dir")
        .concat("/data/")
        .concat(fileName);
    File script = new File(sqlFile);
    BufferedReader reader = null;
    String line;
    try {
      reader = new BufferedReader(new FileReader(script));
      while ((line = reader.readLine()) != null) {
        query.append(line);
      }
    } catch (IOException ioe) {
      System.out.println("Error Reading File " + ioe.getMessage());
    } finally {
      try {
        if (reader != null)
          reader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return query.toString();
  }
}
