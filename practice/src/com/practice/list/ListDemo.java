package com.practice.list;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListDemo {

    public static void main(String[] args) {

        List<String> lst = new ArrayList<>();
        lst.add("Mercury");
        lst.add("Venus");
        lst.add("Earth");
        lst.add("JavaSoft");
        lst.add("Mars");
        lst.add("Jupiter");
        lst.add("Saturn");
        lst.add("Uranus");
        lst.add("Neptune");
        lst.add("Pluto");

        Predicate<Integer> isValid = phone -> { return phone == 1; };

    }
}