package com.practice.primitive;

import java.util.Arrays;

public class StringDemo {
  String newLine = System.getProperty("line.separator");
  String prova = new String("ciao");
  static int valueX;

  static  { System.out.println("static block");     }
          { System.out.println("non-static block"); }


  // overload methods
  public static void main(String[] args) {
    String s1 = "ciao a tutti belli e brutti";
    String[] s2 = s1.split(" ");
    System.out.println(Arrays.toString(s2));

    System.out.println("args = " + Arrays.toString(args));

  };

}
