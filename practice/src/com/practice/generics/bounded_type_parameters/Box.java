package com.practice.generics.bounded_type_parameters;

public class Box <T extends Comparable<T>>{
    private T t;

    public void setT(T t) {
        this.t = t;
    }
    public T getT() {
        return t;
    }

    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setT(Integer.valueOf(10));
        integerBox.inspect(3);
    }
}
