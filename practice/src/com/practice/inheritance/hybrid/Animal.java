package com.practice.inheritance.hybrid;

public abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

}
interface Flying {
    void flyUp();
    void flyDown();
}

// Define a class for Birds that extends Animal and implements Flying
class Bird extends Animal implements Flying {

    public Bird(String name, int age) {
        super(name, age);
    }

    public void flyUp() {
        System.out.println(name + " is flying up.");
    }

    public void flyDown() {
        System.out.println(name + " is flying down.");
    }
}

// Define a class for Penguins that extends Bird
class Penguin extends Bird {

    public Penguin(String name, int age) {
        super(name, age);
    }

    public void flyUp() {
        System.out.println(name + " can't fly up.");
    }

    public void flyDown() {
        System.out.println(name + " is swimming down.");
    }
}

