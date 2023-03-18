package com.practice.collection.deque.stack;

import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.add(1);
        stack.push(2);
        stack.pop();
        Integer peeked = stack.peek();
        System.out.println(peeked);
    }

}
