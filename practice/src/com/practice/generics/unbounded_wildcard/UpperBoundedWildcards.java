package com.practice.generics.unbounded_wildcard;

import java.util.List;

public class UpperBoundedWildcards {


    public static Integer sumListOfNums(List<? extends Number> nums) {
        int sum = 0;
        for (Number number : nums) {
            sum += number.intValue();
        }
        return sum;
    }

};
