package com.practice.strings;

public class StringDemo {

  public static void main(String[] args) {
    String str1 = new String("ciao paolo come stai");
    System.out.println(str1.indexOf("paolo"));
    System.out.println(str1.lastIndexOf("come"));

    String name = getName("paolo");
    System.out.println(name);

  }

  public static String getName(String name) {
    char[] str = new char[name.length()];
    for (int i=0; i < name.length(); i++) {
      str[i] = name.charAt(i);
    }
    return new String(str);
  }
}
