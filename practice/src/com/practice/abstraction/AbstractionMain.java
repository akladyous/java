package com.practice.abstraction;

import java.util.Arrays;
import com.practice.utilities.Helpers;

public class AbstractionMain {
  public static void main(String[] args) {
    System.out.println("args = " + Arrays.toString(args));
    // double result = Helpers.add(1,1);
    // System.out.println(result);
    MainAbstraction.run();
  }

  // public Objects instantiateANewObject() {
  // return null;
  // }
}
