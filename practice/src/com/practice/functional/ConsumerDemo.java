package com.practice.functional;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer<String> printer = (string) -> System.out.println(string);
        printer.accept("hello");
    }

}
