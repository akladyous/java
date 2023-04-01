package com.practice.inheritance.multilevel;

public class Demo {
    public static void main(String[] args) {
        com.practice.inheritance.hybrid.Animal alex = new Lion();
        alex.eat();
        alex.sleep();

        Mammal mammal = new Lion();
        mammal.controlTemp();
        mammal.eat();
        mammal.sleep();

        Lion lion = new Lion();
        lion.sleep();
        lion.roar();

        // casting
        ( (Lion) alex ).roar();
        Lion suzie = (Lion) alex;
        suzie.roar();


    }
}

class Animal{
    void eat(){};
    void sleep(){};
}
class Mammal extends com.practice.inheritance.hybrid.Animal {
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
class Retile extends com.practice.inheritance.hybrid.Animal {
    void layEggs(){};
}
class Dreagon extends Retile {
    void breathFire(){};
}
class Aligator extends Retile {
    void snapJaws(){};
}