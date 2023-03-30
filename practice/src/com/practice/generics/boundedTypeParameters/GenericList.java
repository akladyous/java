package com.practice.generics.boundedTypeParameters;

import java.util.ArrayList;
import java.util.List;



// https://docs.oracle.com/javase/tutorial/java/generics/bounded.html
public class GenericList {
    public static <T> List<T> arrayToList(T[] arr) {
        List<T> list = new ArrayList<>();

        for (T element : arr) {
            list.add(element);
        }
        return list;
    };


}
