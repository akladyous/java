package com.practice.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

    public static <T> List<T> toList(T[] arr) {
        List<T> list = new ArrayList<>();

        for (T element : arr) {
            list.add(element);
        }
        return list;
    };


}
