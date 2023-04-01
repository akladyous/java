package com.practice.polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        Animal alex = new Lion();
        alex.eat();
        alex.sleep();

        Mammal m1 = new Lion();
        m1.controlTemp();
        m1.eat();
        m1.sleep();
    }
}

class Animal{
    void eat(){};
    void sleep(){};
}
class Mammal extends Animal{
    public void controlTemp(){};
}
class Lion extends Mammal{
    @Override
    void sleep(){System.out.println("Lion class");};
    void roar(){};
}
class Bat extends Mammal {
    @Override
    void sleep(){System.out.println("Bat class");};
    void fly(){};
}
class Retile extends Animal {
    void layEggs(){};
}
class Dreagon extends Retile {
    void breathFire(){};
}
class Aligator extends Retile {
    void snapJaws(){};
}