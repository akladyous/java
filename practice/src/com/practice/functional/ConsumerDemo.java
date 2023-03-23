package com.practice.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static List<Integer> numbers = new ArrayList<>();
    static  {
        numbers.addAll(List.of(1,2,3,4,5));
    }

    public static void main(String[] args) {

        Consumer<String> printer = (string) -> System.out.println(string);
        printer.accept("hello");
    }

    public static <T> void forEach(List<T> list,  Consumer<T> consumer) {
        for (T element : list) {
            consumer.accept(element);
        }
    }


}
