package com.practice.collection.list.stack;

import java.util.List;
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

    }
}
