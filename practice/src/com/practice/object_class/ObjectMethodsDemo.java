package com.practice.object_class;

import java.util.Objects;

public class ObjectMethodsDemo {
    private int id;
    private String str;
    private int[] nums;

    public ObjectMethodsDemo(int id, String str, int[] nums) {
        this.id = id;
        this.str = str;
        this.nums = nums;
    }

    public static void main(String[] args) {
        ObjectMethodsDemo obj1 = new ObjectMethodsDemo(1, "a", new int[]{1,2,3});
        ObjectMethodsDemo obj2 = new ObjectMethodsDemo(1, "a", new int[]{1,2,3});

        obj1.equals(obj2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        ObjectMethodsDemo that = (ObjectMethodsDemo) obj;
        if (!Objects.equals(this.id, that.id)) return false;
        if (! Objects.deepEquals(this.nums, that.nums)) return false;
        return (! Objects.equals(this.str, that.str));
    }
}
