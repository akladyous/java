package com.practice.objects_class;

import java.util.Objects;

public class ObjectsClassDemo {
    private int id;
    private String str;
    private int[] nums;
    public static void main(String[] args) {
        ObjectsClassDemo obj1 = new ObjectsClassDemo(1,"a", new int[]{1,2,3});
        ObjectsClassDemo obj2 = new ObjectsClassDemo(1,"a", new int[]{1,2,3});
        obj1.equals(obj2);
    }

    public ObjectsClassDemo(int id, String str, int[] nums) {
        this.id = id;
        this.str = str;
        this.nums = nums;
    }


    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ObjectsClassDemo that = (ObjectsClassDemo) o;

        if (! Objects.equals(this.id, that.id)) return false;
        if (! Objects.deepEquals(this.nums, that.nums)) return false;
        return str.equals(that.str);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + str.hashCode();
        return result;
    }


}
