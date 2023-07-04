
package com.practice.primitive;

import java.util.Arrays;

// https://docs.oracle.com/javase/tutorial/i18n/text/characterClass.html
public class CharacterDemo {
    public static void main(String[] args) {
        char c1 = 'a';
        System.out.println("isLetter        : " +  Character.isLetter(c1));
        System.out.println("isAlphabetic    : " +  Character.isAlphabetic(c1));
        System.out.println("isLowerCase     : " +  Character.isLowerCase(c1));
        System.out.println("isUpperCase     : " +  Character.isUpperCase(c1));
        System.out.println("isTitleCase     : " +  Character.isTitleCase(c1));
        System.out.println("isDigit         : " +  Character.isDigit(c1));
        System.out.println("isLetterOrDigit : " +  Character.isLetterOrDigit(c1));
        System.out.println("getType         : " +  Character.getType(c1));

        
        String hey = "ABCabc";
        byte[] heyBytes = hey.getBytes(); // [65,66,67,97,98,99]
        System.out.println("heyBytes : " + Arrays.toString(heyBytes));
    }

}
