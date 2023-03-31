package com.practice.object_class;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    public String name;
    public int age;
    public int[] favoriteNumbers;

    public Person(String name, int age, int[] favoriteNumbers) {
        this.name = name;
        this.age = age;
        this.favoriteNumbers = favoriteNumbers;
    }

    public static void main(String[] args) {
        Person john = new Person("john", 20, new int[]{1,2,3});
        Person sara = new Person("sara", 22, new int[]{1,2,3});

        sara.equals(john);
    }

    @Override
    public boolean equals(Object obj) {
        if ( this == null || obj == null) return false;
        if ( this == obj ) return true;
        if ( this.getClass() != obj.getClass() ) return false;

        // option 1
        if (! Objects.equals(this.name, obj.name)) return false;
        if (! Objects.equals(this.age, ((Person) obj).age)) return false;
        return Objects.deepEquals(this.favoriteNumbers, ((Person) obj).favoriteNumbers);

        // option 2
        boolean[] equiality = new boolean[this.getClass().getDeclaredFields().length];



        return super.equals(obj);
    }
}
/*
The equals method implements an equivalence relation on non-null object references:

-It is reflexive: for any non-null reference value x, x.equals(x) should return true.
-It is symmetric: for any non-null reference values x and y, x.equals(y) should return true if and only if y.equals(x) returns true.
-It is transitive: for any non-null reference values x, y, and z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) should return true.
-It is consistent: for any non-null reference values x and y, multiple invocations of x.equals(y) consistently return true or consistently return false,
 provided no information used in equals comparisons on the objects is modified.
-For any non-null reference value x, x.equals(null) should return false.
*/