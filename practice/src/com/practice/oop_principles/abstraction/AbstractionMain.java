package com.practice.oop_principles.abstraction;

import java.util.Arrays;

public class AbstractionMain {
  public static void main(String[] args) {
    System.out.println("args = " + Arrays.toString(args));
    // double result = Helpers.add(1,1);
    // System.out.println(result);
    Cat miccio = new Cat("miccio", 5, 15, "mixed");
    System.out.println(miccio);
    miccio.moved();
    miccio.makeNoise("meaoo");
    doAnimalStuff(miccio);
    System.out.println(miccio.getExplicitType());
    Animal.main(new String[]{"a","b"});
    Animal.wakeUp();
  }

  private static void doAnimalStuff(Animal animal) {
    animal.sleep();
  }
}