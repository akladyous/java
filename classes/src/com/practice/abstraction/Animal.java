package com.practice.abstraction;

public abstract class Animal {
    public String name;
    public int age;
    public void sleep(){
        System.out.println("Zzz");
    }
    public abstract void sound();
}
