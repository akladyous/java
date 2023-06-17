package com.practice.primitive;

public class BooleanDemo {
  public static void main(String[] args) {

    System.out.println("Boolean.valueOf() is not null : " + Boolean.valueOf("true"));
    System.out.println("Boolean.compare               : " + Boolean.compare(true, false));
    System.out.println("compareTo                     : " + Boolean.valueOf("true").compareTo(Boolean.valueOf("false")));
    System.out.println("Boolean.logicalAnd            : " + Boolean.logicalAnd(true, true));
    System.out.println("Boolean.getBoolean            : " + Boolean.getBoolean("true"));
    System.out.println("Boolean.parse(string value)   : " + Boolean.parseBoolean("true"));
  }
}


