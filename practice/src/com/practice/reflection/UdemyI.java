package com.practice.reflection;

public class UdemyI {

    class Prova{
        public Prova() {
        }
    }

    public static void main(String[] args) {
        System.out.println(Prova.class); // get class from custom class
        System.out.println(Integer.class); // get class from wrapper class
        System.out.println(int.class); // get class from primitive types
        ResizableArray ra = new ResizableArray();
        System.out.println(ra.getClass()); // get class from objects using getClass method
        String str1 = "";
        Class<String> strClass = (Class<String>) str1.getClass();
    }
}
