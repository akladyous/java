package com.practice.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<Integer> isPositive = number -> number > 0;
        Predicate<Integer> notPositive = isPositive.negate();
        Predicate<Integer> isEven = number -> number %2 == 0;
        Predicate<Integer> positiveAndEven = isPositive.and(isEven);
        Predicate<Integer> positiveOrEven = isPositive.or(isEven);
        System.out.println(isPositive.test(-1));
        System.out.println(notPositive.test(-2));
        System.out.println(positiveAndEven.test(3));
        System.out.println(positiveOrEven.test(3));

        Predicate<Integer> oddNums = (num -> num % 2 == 0);
        Predicate<Integer> positiveNums = (num -> num > 0);
        Integer[] array = IntStream.rangeClosed(-10, 10).boxed().toArray(Integer[]::new);
        System.out.println(filter(array, oddNums).toString());
        System.out.println(filter(array, positiveNums).toString());

    }

    public static <T> List<T> filter(T[] array, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : array) {
            if (predicate.test(t))
                result.add(t);
        }
        return result;
    }
}
