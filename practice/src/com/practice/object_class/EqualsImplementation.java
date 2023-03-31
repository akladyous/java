package com.practice.object_class;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;

public class EqualsImplementation {
    private int id;
    private String str;
    private int[] nums;

    public EqualsImplementation(int id, String str, int[] nums) {
        this.id = id;
        this.str = str;
        this.nums = nums;
    }

    public static void main(String[] args) {
        EqualsImplementation obj1 = new EqualsImplementation(1, "a", new int[]{1,2,3});
        EqualsImplementation obj2 = new EqualsImplementation(1, "a", new int[]{1,2,3});

        System.out.println(obj1.equals(obj2));

//        Field[][] fields = new Field[2][obj1.getClass().getDeclaredFields().length];
        Field[] fields1 = obj1.getClass().getDeclaredFields();
        try {

            for (Field field1 : fields1) {
                field1.setAccessible(true);
                Object value1 = field1.get(obj1);
            }
        } catch (IllegalAccessException e) {
            //
        }

        Field[][] fields = {
                obj1.getClass().getDeclaredFields(),
                obj2.getClass().getDeclaredFields()
        };
        boolean[] equality = new boolean[obj1.getClass().getDeclaredFields().length];
        try {
            for ( int i = 0; i < fields[0].length; i++ ) {
                Field field1 = fields[0][i];
                field1.setAccessible(true);
                Field field2 = fields[1][i];
                field2.setAccessible(true);
                Object value1 = fields[0][i].get(obj1);
                Object value2 = fields[1][i].get(obj1);

                equality[i] = fields[0][i].getName().equals(fields[1][i].getName()) &&
                              Objects.equals(value1, value2);
//            System.out.println(fields[0][i].get(obj1));
            }
        } catch(IllegalAccessException e) {
            //
        }


    }

    @Override
    public boolean equals(Object obj) {
        // It is reflexive: for any non-null reference value x, x.equals(x) should return true.
        if (this == obj) return true;

        // It is symmetric: for any non-null reference values x and
        // y, x.equals(y) should return true if and only if y.equals(x) returns true.

        if (obj == null || this.getClass() != obj.getClass()) return false;
        EqualsImplementation that = (EqualsImplementation) obj;

        if (!Objects.equals(this.id, that.id)) return false;
        if (! Objects.deepEquals(this.nums, that.nums)) return false;
        return ( Objects.equals(this.str, that.str) );
    }
}
