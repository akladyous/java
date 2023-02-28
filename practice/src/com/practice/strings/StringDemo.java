package com.practice.strings;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// import org.junit.platform.commons.util.StringUtils;

public class StringDemo {

  public static void main(String[] args) {

    String instance = new String("ciao paolo come stai");
    System.out.println("String.charAt : " + instance.charAt(5));
    System.out.println("String instance.codePointAt " + instance.codePointAt(0));
    System.out.println("String instance.codePointCount + " + instance.codePointCount(0, instance.length()));
    System.out.println("String instance.indexOf + " + instance.indexOf("paolo"));
    System.out.println("String instance.lastIndexOf + " + instance.lastIndexOf("come"));
    System.out.println("String instance.replace : " + instance.replace("paolo", "PAOLO"));
    System.out.println("String instance.replace : " + instance.replaceFirst(" ", "-"));
    System.out.println("-".repeat(40));

    String str2 = new String("hello");
    char[] ch1 = str2.toCharArray();
    System.out.println("toCharArray : " + new String(ch1));
    System.out.println("-".repeat(40));
    //

    String str3 = new String("abc");
    int[] ch2 = str3.chars().toArray();
    for (int num : ch2) {
      System.out.println("char : " + num);
    }
    System.out.println(String.valueOf(str3.chars().sum()));
    System.out.println("-".repeat(40));

    //
    String userName = charsToUpperCase("paolo");
    System.out.println("userName : " + userName);

    Arrays.asList("Method Reference : " + instance, str2, str3).forEach(System.out::println);

    //
    String name = getName("paolo");
    System.out.println("getName : " + name);
    System.out.println("-".repeat(40));


    String str4 = new String("ABC");
    String str5 = str4.concat("DEF");
    System.out.println(str5);

  }




  public static String charsToUpperCase(String string) {
    List<Character> arrChars = new ArrayList<>();
    string
        .chars()
        .map(num -> num - 32)
        .forEach(num -> arrChars.add(Character.valueOf((char) num)));
    return arrChars.toString();
  }

  public static String getName(String name) {
    char[] str = new char[name.length()];
    for (int i = 0; i < name.length(); i++) {
      str[i] = name.charAt(i);
    }
    return new String(str);
  }

}
