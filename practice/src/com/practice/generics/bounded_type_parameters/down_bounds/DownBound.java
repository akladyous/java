package com.practice.generics.bounded_type_parameters.down_bounds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DownBound {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five"));

        words.forEach((String str) -> {
            System.out.println(str);
        });

    }


}
