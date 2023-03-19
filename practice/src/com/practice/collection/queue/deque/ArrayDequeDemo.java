package com.practice.collection.queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class ArrayDequeDemo {

    public static void main(String[] args) {

        Deque<String> line = new ArrayDeque<>(List.of("a","b","c","d"));

        System.out.println(line);
        System.out.println(line.peek());
        System.out.println(line.element());
    }
}
