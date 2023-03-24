package com.practice.klass;

public class Cat extends Animal {
    String food;

    public Cat(String name, int age, String food) {
        super(name, age);
        this.food = food;
    }

    public static void main(String[] args) {
        Cat trappola = new Cat("trappola", 4, "secco");
        System.out.println(trappola);
    };



    @Override
    public String toString() {
        return "Cat{" +
                "food='" + food + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    
}
