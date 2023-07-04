package com.practice.oop_principles.abstraction;

public class Cat extends Animal {

    public Cat(String name, Integer age, Integer speed, String race) {
        super(name, age, speed, race);
    }

    @Override
    public void moved() {
        if (this.speed < 5) {
            System.out.println(this.name + " is Walking");
        } else {
            System.out.println(this.name + " is Running");
        }
    }

    @Override
    public void makeNoise(String noise) {
        System.out.println(this.name + " make noise of " + noise);
        this.getWeight();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
