package com.practice.generics.boundedTypeParameters;


import com.practice.generics.upper_bound.Box;

// https://docs.oracle.com/javase/tutorial/java/generics/bounded.html
public class Main {

    public static void main(String[] args) {
        AddTwoNums<Integer> addTwoNums = new AddTwoNums<>(1,1);
        Number result = addTwoNums.sum();
        System.out.println(result);


        Box<Integer> box = new Box<>();
        box.setT(1);
        box.inspect(2);

    }
}
