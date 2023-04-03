package com.practice.collection.list.ArraList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Planets {

    public static void main(String[] args) {

        List<String> planets = new ArrayList<>();
        planets.addAll(List.of("Mercury", "Venus", "Earth", "JavaSoft", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"));
        System.out.println(planets);
        Predicate<Integer> isValid = phone -> { return phone == 1; };

    }
};