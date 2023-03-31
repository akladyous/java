package com.practice.object_class;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Person {
    public String name;
    public int age;
    public int[] favoriteNumbers;
    public List<Integer> ids = new ArrayList<>();

    public Person(String name, int age, int[] favoriteNumbers) {
        this.name = name;
        this.age = age;
        this.favoriteNumbers = favoriteNumbers;
    }

    public static void main(String[] args) {
        Person john = new Person("john", 20, new int[]{1,2,3});
        Person sara = new Person("john", 20, new int[]{1,2,3});

        sara.equals(john);
    }

    private static boolean compareFields(Object obj1, Object obj2) {
        Field[] fields1 = obj1.getClass().getDeclaredFields();
        Field[] fields2 = obj2.getClass().getDeclaredFields();

        Field[][] fields = {
                obj1.getClass().getDeclaredFields(),
                obj2.getClass().getDeclaredFields()
        };

        if (fields1.length != fields2.length) {
            return false;
        };
        try {
            for ( int i = 0; i < fields1.length; i++ ) {
                fields1[i].setAccessible(true);
                fields2[i].setAccessible(true);

                if (fields1[i].getName() != fields2[i].getName()) {
                    return false;
                }

                Object value1 = fields1[i].get(obj1);
                Object value2 = fields2[i].get(obj2);

                if ( !value1.equals(value2) ) {
                    return false;
                }
            }
        } catch(IllegalAccessException e) {
            return false;
        }
        return true;
    };

    /**
     * @return
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ( name == null ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if ( this == null || obj == null) return false;
        if ( this == obj ) return true;
        if ( this.getClass() != obj.getClass() ) return false;

        Person that = (Person) obj;
        // option 1
        if (! Objects.equals(this.name, that.name)) return false;
        if (! Objects.equals(this.age, ((Person) that).age)) return false;
        return Objects.equals(this.favoriteNumbers, ((Person) that).favoriteNumbers);
    }
}
/*
The equals method implements an equivalence relation on non-null object references:

It is reflexive: for any non-null reference value x, x.equals(x) should return true.
It is symmetric: for any non-null reference values x and y, x.equals(y) should return true if and only if y.equals(x) returns true.
It is transitive: for any non-null reference values x, y, and z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) should return true.
It is consistent: for any non-null reference values x and y, multiple invocations of x.equals(y) consistently return true or consistently return false, provided no information used in equals comparisons on the objects is modified.
For any non-null reference value x, x.equals(null) should return false.
An equivalence relation partitions the elements it operates on into equivalence classes; all the members of an equivalence class are equal to each other. Members of an equivalence class are substitutable for each other, at least for some purposes.
*/
