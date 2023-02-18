package com.practice.klass;

public class Cat extends Animal {
    String food;

    public Cat(String name, int age, String food) {
        super(name, age);
        this.food = food;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "food='" + food + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    
}
