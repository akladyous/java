package com.practice.collection.queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class ArrayDequeDemo {

    public static void main(String[] args) {

        Deque<String> line = new ArrayDeque<>(List.of("a","b","c","d","e"));
        System.out.println(line);
        line.add("1"); // insert element at the tail of queue. throw exception
        line.offer("2");
        System.out.println(line);

        System.out.println(line.peek()); // Retrieves, but does not remove, the head of this queue,
        System.out.println(line.element()); // Retrieves, but does not remove, the head of this queue. throw exception.

        line.remove(); // Retrieves and removes the head of this queue. throw exception
        line.poll(); // Retrieves and removes the head of this queue, or returns null if this queue is empty.
        System.out.println(line);

        line.addFirst("0");
        System.out.println(line);
        line.addLast("9");
        System.out.println(line);


    }
}
