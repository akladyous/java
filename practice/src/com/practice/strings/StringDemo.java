package com.practice.strings;

import java.util.Arrays;

import org.junit.platform.commons.util.StringUtils;

public class StringDemo {

  public static void main(String[] args) {

    String str1 = new String("ciao paolo come stai");
    System.out.println(str1.indexOf("paolo"));
    System.out.println(str1.lastIndexOf("come"));

    System.out.println("-".repeat(40));
    String str2 = new String("hello");
    char[] ch1 = str2.toCharArray();
    for (char ch : ch1) {
      System.out.println("character : " + ch);
    }

    System.out.println("toCharArray : " + new String(ch1));
    System.out.println("-".repeat(40));
    //

    String str3 = new String("abc");
    int[] ch2 = str3.chars().toArray();
    for (int num : ch2) {
      System.out.println("char : " + num);
    }

    System.out.println(String.valueOf(str3.chars().sum()));
    System.out.println("chars.toString " + ch2.toString());
    System.out.println("-".repeat(40));

    //
    String name = getName("paolo");
    System.out.println(name);
    System.out.println("-".repeat(40));

  }

  public static String getName(String name) {
    char[] str = new char[name.length()];
    for (int i = 0; i < name.length(); i++) {
      str[i] = name.charAt(i);
    }
    return new String(str);
  }
}
