package com.practice.functional;

import java.util.Comparator;
import java.util.List;

public class Lambda {
    static  {
        User u1 = new User("user1", 20);
        User u2 = new User("user1", 20);
    }


    public static void printUsers(List<User> users, Predicate<User> tester) {
        for ( User u : users ) {
            if ( tester.test(u)) {
                System.out.println("Adult");
            } else {
                System.out.println("Minor");
            }
        }
    };

    public static void printUsersWithPredicate(List<User> users, Predicate<User> tester) {

        // anonymous class
        Comparator<User> userComparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return 0;
            }
        };
        // anonymous class
        Predicate<User> userPredicate = new Predicate<User>() {
            @Override
            public boolean test(User user) {
                return false;
            }
        };

        Predicate<User> userPredicate1 = (u1)-> u1.age > 18;
    }
}

interface Predicate<T> {
    boolean test(T t);
}
