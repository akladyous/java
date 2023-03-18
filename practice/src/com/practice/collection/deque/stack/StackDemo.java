package com.practice.collection.deque.deque;

import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1); // add at the tail -> queue FIFO
        deque.add(2); // add at the tail -> queue FIFO
        System.out.println(deque);
        deque.push(3); // add at the head -> stack LIFO
        System.out.println(deque);
        deque.pop(); // remove from the stack -> LIFO
        System.out.println(deque);
        deque.remove(); // remove element at the head -> FIFO
        System.out.println(deque);




    }

}
