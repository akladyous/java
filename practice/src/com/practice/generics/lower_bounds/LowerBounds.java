package com.practice.generics.lower_bounds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LowerBounds {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five"));

        // public void forEach( java.util.function.Consumer<? super T> action )
        words.forEach((String str) -> {
            System.out.println(str);
        });

        List<Integer> integers = Stream
                                     .of(1,2,3,4,5)
                                     .peek((Integer i) -> System.out.println(i + " as Binary: " + Integer.toBinaryString(i)))
                                     .peek((Number  n) -> System.out.println(n + " as Double: " + n.doubleValue()))
                                     .peek((Object o)  -> System.out.println(o + "hashcode  : " + o.hashCode()))
                                     .collect(Collectors.toList());


    };


}
