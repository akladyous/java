package com.practice.klass;

public class User {

    static String name = "static String";
    public static String prova = "public static String";

    private Integer id = 10;

    private static Integer usersCounter = 0;
    private static void privateStatic(){
        System.out.println("private static method");
    };

    // public method accessible from outside
    public static Integer getCounter() {
        return usersCounter;
    }


    private void print() {
        System.out.println("private method");
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
