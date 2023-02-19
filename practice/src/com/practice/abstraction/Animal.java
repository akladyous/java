package com.practice.abstraction;

public abstract class Animal {

    public String name;
    public Integer age;
    public Integer speed;
    protected String race;
    private Double weight;

    public Animal(String name, Integer age, Integer speed, String race, Double weight) {
        this.name = name;
        this.age = age;
        this.speed = speed;
        this.race = race;
        this.weight = weight;
    }

    public abstract void moved(Integer speed);
    public abstract void makeNoise(String noise);
    public abstract void sound();
    public abstract  void checkWeight();

    public void sleep(){
        System.out.println("Zzz");
    }
    public static void wakeUp(){
        System.out.println("Chan");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", speed=" + speed +
                ", race='" + race + '\'' +
                ", weight=" + weight +
                '}';
    }
}
