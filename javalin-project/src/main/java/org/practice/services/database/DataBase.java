package org.practice.services.database;


import java.util.ArrayList;
import java.util.List;

public abstract class DataBase  {

    String dbName = "practice";
    List<String> dbTables = new ArrayList<>();

    public static void main(String[] args) {

    }

    public abstract void initializeDB();
    public abstract void initializeTables();
}
