package com.practice;

import com.practice.abstraction.Cat;
import com.practice.utilities.Helpers;

public class Main {
    public static void main(String[] args) {
//        System.out.println("args = " + Arrays.toString(args));
        double result = Helpers.add(1,1);
        System.out.println(result);

        Cat cat = new Cat();
        cat.name = "miccio";
        cat.age = 5;
        System.out.println();
    }

//    public Objects instantiateANewObject() {
//        return null;
//    }
}