package com.practice.operators;

public class OperatorsDemo {
    public static void main(String[] args) {
        System.out.println("multiply by 2");
        for (int i=1; i <=10 ; i++) {
            int multiply = i << 1;
            System.out.format("%d << %-4d", i, multiply);
        }
        System.out.println();
        System.out.println("divide bt 2");
        for (int i=1; i <=10 ; i++) {
            int divide = i >> 1;
            System.out.format("%d << %-4d", i, divide);
        }
    }
}
