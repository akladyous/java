package com.practice.abstraction;

public abstract class Animal {

    public String name;
    public Integer age;
    public Integer speed;
    protected String race;
    private Double weight;

    public static void main(String[] args) {
        System.out.println("Animal Abstract class MAIN method invoked");
    }
    public Animal(String name, Integer age, Integer speed, String race) {
        this.name = name;
        this.age = age;
        this.speed = speed;
        this.race = race;
    }

    public abstract void moved();
    public abstract void makeNoise(String noise);
    public void sleep(){
        System.out.println(this.name + " is Sleeping Zzz...");
    }
    public static void wakeUp(){
        System.out.println("Chan");
    }

    public String getExplicitType(){
        return getClass().getSimpleName() + " ( " + this.race + " )";
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
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
