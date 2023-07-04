package com.practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithArray {

  public static void main(String[] args) {

    int[] arrInt1;
    arrInt1 = new int[5];

    int[] arrInt2 = new int[10];
    for (int i = 0; i < arrInt2.length; i++) {
      arrInt2[i] = i + 11;
    }

    char[] arrChar1 = new char[5];
    for (int i = 0; i < arrChar1.length; i++)
      arrChar1[i] = (char) (96 + i + 1);

    List<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(6, 2, 3, 4, 5));

    int[] arrayInt1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int[] arrayInt2 = new int[5];

    System.out.println("arrChar1              : " + Arrays.toString(arrChar1));
    System.out.println("arrInt2               : " + Arrays.toString(arrInt2));
    System.out.println("arrayInt1.Values      : " + Arrays.toString(arrayInt1));
    System.out.println("arrayInt2.values      : " + arrayInt2);
    System.out.println(arrayInt2.length);
    System.out.println(list1.getClass().getCanonicalName());

    // char[] chars = {'p', 'a', 'o', 'l', 'o'};
    // System.out.println("array of chars : " +chars);
    // System.out.println("array of chars : " + new String(chars));
  }
}
