
package com.practice.primitive;

// https://docs.oracle.com/javase/tutorial/i18n/text/characterClass.html
public class CharacterDemo {
    public static void main(String[] args) {
        char c1 = 'a';
        System.out.println(Character.isLetter(23));
        System.out.println(Character.isAlphabetic(23));
        System.out.println(Character.isLowerCase(23));
        System.out.println(Character.isUpperCase(23));
        System.out.println(Character.isTitleCase(23));
        System.out.println(Character.isDigit(23));

        String hey = "ABCabc";
        byte[] heyBytes = hey.getBytes(); // [65,66,67,97,98,99]
        System.out.println("heyBytes : " + heyBytes.toString());
    }

}
