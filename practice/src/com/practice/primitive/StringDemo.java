package com.practice.primitive;

import java.util.Arrays;

public class StringDemo {
    static int valueX;

    static {
        System.out.println("static block, get called once, when the class itself is initialized");
    }

    String id;
    String name;
    String newLine = System.getProperty("line.separator");
    String prova = new String("ciao");

    {
        System.out.println("non-static block, get called every time an instance of the class is constructed");
    }


    // overload methods
    public static void main(String[] args) {
        String s1 = "ciao a tutti belli e brutti";
        String[] s2 = s1.split(" ");
        System.out.println(Arrays.toString(s2));

        System.out.println("args = " + Arrays.toString(args));

    }

    ;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
