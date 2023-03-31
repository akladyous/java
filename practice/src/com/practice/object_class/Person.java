package com.practice.object_class;

import java.lang.reflect.Field;
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

        Person that = (Person) obj;
        /*
        // option 1
        if (! Objects.equals(this.name, that.name)) return false;
        if (! Objects.equals(this.age, ((Person) that).age)) return false;
        return Objects.deepEquals(this.favoriteNumbers, ((Person) that).favoriteNumbers);
         */

        // option 2
        List<Boolean> equiality = new ArrayList<>();
        Field[][] fields = {
                obj1.getClass().getDeclaredFields(),
                obj2.getClass().getDeclaredFields()
        };
        Field[] fields1 = this.getClass().getDeclaredFields();
        Field[] fields2 = that.getClass().getDeclaredFields();
        if (fields1.length != fields2.length) return false;

        try {
            for (Field field1 : this.getClass().getDeclaredFields()) {
                 Field field2 = that.getClass().getDeclaredField(field1.getName());
                field1.setAccessible(true);
                field2.setAccessible(true);
                if (
                        field1.getName() != field2.getName() ||
                        !Objects.equals(field1.get(this),field2.get(that))
                ) {
                    return false;
                }
            }
        } catch (IllegalAccessException e) {
            return false;
        } catch (NoSuchFieldException e) {
            return false;
        }
        return true;
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