package com.practice.Object.Objects_StaticUtilityMethods;

public class ObjectsClassDemo {
    private int id;
    private String str;
    private int[] nums;
    public static void main(String[] args) {
        ObjectsClassDemo obj1 = new ObjectsClassDemo(1,"a", new int[]{1,2,3});
        ObjectsClassDemo obj2 = new ObjectsClassDemo(1,"a", new int[]{1,2,3});
        System.out.println("obj1.equals(obj2) : " + obj1.equals(obj2));

    }

    public ObjectsClassDemo(int id, String str, int[] nums) {
        this.id = id;
        this.str = str;
        this.nums = nums;
    }



}
