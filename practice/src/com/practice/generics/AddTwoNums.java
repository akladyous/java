package com.practice.generics;

public class AddTwoNums <T extends Number> {
    public T valueA;
    public T valueB;
    public AddTwoNums(T valueA, T valueB) {
        this.valueA = valueA;
        this.valueB = valueB;
    }
    public void print(){
        System.out.println("valueA : " + valueA);
        System.out.println("valueB : " + valueB);
    }

}
