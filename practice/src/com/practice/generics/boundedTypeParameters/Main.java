package com.practice.generics.boundedTypeParameters;


// https://docs.oracle.com/javase/tutorial/java/generics/bounded.html
public class Main {

    public static void main(String[] args) {
        AddTwoNums<Integer> addTwoNums = new AddTwoNums<>(1,1);
        Number result = addTwoNums.sum();
        System.out.println(result);

    }
}
