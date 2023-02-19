package com.practice.abstraction;

import java.util.Arrays;
import com.practice.utilities.Helpers;

public class AbstractionMain {
  public static void main(String[] args) {
    System.out.println("args = " + Arrays.toString(args));
    // double result = Helpers.add(1,1);
    // System.out.println(result);
    Cat miccio = new Cat("miccio", 5, 15, "mixed", 5.5);
    System.out.println(miccio);
    doAnimalStuff(miccio);
  }

  private static void doAnimalStuff(Animal animal) {
    animal.sleep();

  }
}