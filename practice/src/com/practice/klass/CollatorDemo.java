package com.practice.klass;

// https://docs.oracle.com/javase/tutorial/i18n/text/locale.html

import java.text.Collator;

public class CollatorDemo {

    public static void main(String[] args) {

        Collator myCollator = Collator.getInstance();
        if( myCollator.compare("abc", "ABC") < 0 )
            System.out.println("abc is less than ABC");
        else
            System.out.println("abc is greater than or equal to ABC");

        System.out.println((int) Character.valueOf('a'));
    }
}
