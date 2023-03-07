package com.practice.strings;

import com.practice.arrays.Array;

import java.nio.charset.StandardCharsets;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringMaipulation {


    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        int result = s1.compareTo(s2);
        System.out.println("\"hello\".compareTo(\"hello\") : " + result);

        char a = 'a';
        char b = 'b';
        System.out.println("char 'b' - 'b' : " + (b-a)); //'a' 97 'b' 98
        System.out.println("Integer.toString(8, 2) : " + Integer.toString(8, 2)); // 10

        char[] hello = s1.toCharArray();

        String hey = "ABCabc";
        byte[] heyBytes = hey.getBytes(); // [65,66,67,97,98,99]
        System.out.println("heyBytes : " + heyBytes.toString());

        System.out.println(removeCharFromString("banana", "a"));
    }

    public static String removeCharFromString(String str, String ch) {
        StringBuilder res = new StringBuilder();
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) != ch.charAt(0)) {
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }
}
