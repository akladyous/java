package com.practice.functional;

import java.util.List;

public class Lambda {


    public static void printUsers(List<User> users, Predicate<User> tester) {
        for ( User u : users ) {
            if ( tester.test(u)) {
                System.out.println("Adult");
            } else {
                System.out.println("Minor");
            }
        }

    }
}

interface Predicate<T> {
    boolean test(T t);
}
