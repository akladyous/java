package com.practice.primitive;

import java.util.Arrays;

public class WithString {
  String newLine = System.getProperty("line.separator");
  String prova = new String("ciao");
  static int valueX;
  {
    valueX = 10;

    System.out.println("valueX : " + valueX);
    System.out.println("this   : " + this);
  }

  static void method() {
    System.out.println("method");
  }

  static {
    System.out.println(valueX);
  }

  // overload methods
  public static void main(String[] args) {
    String s1 = "ciao a tutti belli e brutti";
    String[] s2 = s1.split(" ");
    System.out.println(Arrays.toString(s2));

    System.out.println("args = " + Arrays.toString(args));

  };

}
