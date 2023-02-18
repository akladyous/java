package com.practice.abstraction;

public abstract class Animal {

    public String name;
    public Integer age;
    public Integer speed;
    protected Integer type;
    private Double weight;

    public Animal(String name, Integer age, Integer speed, Integer type, Double weight) {
        this.name = name;
        this.age = age;
        this.speed = speed;
        this.type = type;
        this.weight = weight;
    }

    public abstract void moved(Integer speed);
    public abstract void makeNoise(String noise);
    public abstract void sound();
    public void sleep(){System.out.println("Zzz");}
}
