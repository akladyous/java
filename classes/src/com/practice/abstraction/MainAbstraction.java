package com.practice.abstraction;

public class MainAbstraction {
    public static void main(String[] args) {
        System.out.println("MainAbstraction class - from main method");
    }
    public static void run() {
        Cat cat = new Cat();
        cat.name = "miccio";
        cat.age = 5;
        cat.sleep();
        System.out.println("cat.name : " + cat.name);

    }
}
