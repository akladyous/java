package com.practice.object_class;

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
        return ( Objects.equals(this.str, that.str));
    }
}
