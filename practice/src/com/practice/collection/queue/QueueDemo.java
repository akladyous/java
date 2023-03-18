package com.practice.collection.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<String> line = new LinkedList<>(List.of("a","b","c"));
        line.add("d"); // insert element at the tail of queue. throw exception
        line.remove(); // Retrieves and removes the head of this queue. throw exception
        line.peek(); // Retrieves, but does not remove, the head of this queue,
        line.element(); // Retrieves, but does not remove, the head of this queue. throw exception.


        System.out.println(line);
    }
}
