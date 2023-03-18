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



    /*
    Deques can also be used as LIFO (Last-In-First-Out) stacks.
    This interface should be used in preference to the legacy Stack class.
    When a deque is used as a stack, elements are pushed and popped from the beginning of the deque.
    Stack methods are equivalent to Deque methods as indicated in the table below:

    Comparison of Stack and Deque methods
    Stack Method	Equivalent Deque Method
    push(e)	addFirst(e)
    pop()	removeFirst()
    peek()	getFirst()
     */
    }

}
