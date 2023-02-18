package com.practice.klass;

public class User {

    public static void main(String[] args) {

    }


    static String name = "static String";
    public static String prova = "public static String";

    //instance variable not accessible from outside
    private Integer id = 10;

    //class variable not accessible from outside
    private static Integer usersCounter = 0;
    // public method accessible from outside
    public static Integer getCounter() {
        return usersCounter;
    }
    // private method not accessible from outside, can access static variables
    private static void privateStatic(){
        System.out.println("private static method");
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
