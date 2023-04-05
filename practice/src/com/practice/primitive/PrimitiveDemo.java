package com.practice.primitive;

public class PrimitiveDemo {
  static int staticVar = 1;
  private static int privateStaticVar = 2;
  public int num3 = 3;
  public static void main(String[] args) {
    byte b = 1;
    short s = 1;
    int i1 = 1000;
    long l = 100_000L;
    float f = 0.3F - -0.1F;
    char ch1 = 'a';
    char ch2 = 'a';
    double x;
    System.out.println("args  =                         : " + Float.MAX_EXPONENT + " " + Float.MAX_VALUE);
    System.out.println("float =                         : " + f);
    System.out.println("copy of the value of i1 + i2 =  : ");
    System.out.println("i1                              : " + i1);
    System.out.println("Character.valueOf(x)            : " + Character.valueOf(ch1));
    System.out.println("Character.compare               : " + Character.compare(ch1, ch2));
  }

  public static void main(String[] ...args) {
    PrimitiveDemo demo = new PrimitiveDemo();
    demo.num3 = 33;
    demo.getStaticVar();
    demo.getPrivateStatic();

  }
  int getStaticVar(){
    return staticVar;
  }
  int getPrivateStatic(){
    return privateStaticVar;
  }
}  
