package com.practice.primitive;

public class BooleanDemo {
  public static void main(String[] args) {
    String boolStr = "true";
    String boolTrue = "true";
    String boolFalse = "true";

    System.out.println("Boolean.valueOf() is not null : " + Boolean.valueOf(boolStr));
    System.out.println("Boolean.compare               : " + Boolean.compare(true, false));
    System.out.println("compareTo                     : " + Boolean.valueOf(boolTrue).compareTo(Boolean.valueOf(boolFalse)));
    System.out.println("Boolean.logicalAnd            : " + Boolean.logicalAnd(true, true));
    System.out.println("Boolean.getBoolean            : " + Boolean.getBoolean(boolStr));
    System.out.println("Boolean.parse(string value)   : " + Boolean.parseBoolean(boolStr));
  }
}


