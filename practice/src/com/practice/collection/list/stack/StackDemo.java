package com.practice.collection.list.stack;

import java.util.List;
import java.util.Random;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("a");
        stack.push("b");
        stack.push("c");

        System.out.println("peek method: " + stack.peek());
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

        Stack<Integer> stackOfRandomInts = new Stack<>();
        for (int n : randomNumbers(10)) {
            stackOfRandomInts.push(n);
        }
        System.out.println(stackOfRandomInts.toString());

    }

    public static int[] randomNumbers(int size) {
        int[] numbers = new int[size];
        Random random = new Random();
        for ( int i = 0; i < size ; i++ ) {
            numbers[i] = random.nextInt(1, 101);
        }
        return numbers;
    }

};
