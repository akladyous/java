package com.practice.abstraction;

public class Cat extends Animal {

    public Cat(String name, Integer age, Integer speed, String race, Double weight) {
        super(name, age, speed, race, weight);
    }

    @Override
    public void moved(Integer speed) {
        if (speed < 5) {
            System.out.println("Walking");
        } else {
            System.out.println("Running");
        }
    }

    @Override
    public void makeNoise(String noise) {
        System.out.println("Noise : " + noise);
    }

    @Override
    public void sound() {
        System.out.println("mean");
    }

    @Override
    public void checkWeight(){
        System.out.println(this.name + " weight: " );
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
