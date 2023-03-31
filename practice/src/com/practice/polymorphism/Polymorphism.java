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
    public int id = 0;
    public void controlTemp(){};
}
class Lion extends Mammal{
    @Override
    void sleep(){};
    void roar(){};
}
class Bat extends Mammal {
    @Override
    void sleep(){};
    void fly(){};
}
class Retile extends Animal {
    void layEggs(){};
}
class Dreagon extends Retile {
    void breathFire(){};
}
