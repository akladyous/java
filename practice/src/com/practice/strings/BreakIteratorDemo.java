package com.practice.strings;
// https://docs.oracle.com/javase/tutorial/i18n/text/word.html
import java.text.BreakIterator;
import java.util.Locale;

public class BreakIteratorDemo {
    public static void main(String[] args) {

        Locale currentLocale = new Locale ("en","US");
        BreakIterator wordIterator = BreakIterator.getWordInstance(currentLocale);

        String someText = "She stopped. " +
                                  "She said, \"Hello there,\" and then went " +
                                  "on.";

        markBoundaries(someText, wordIterator);
        extractWords("hello then", wordIterator);
    }

    static void markBoundaries(String target, BreakIterator iterator) {

        StringBuffer markers = new StringBuffer();
        markers.setLength(target.length() + 1);
        for (int k = 0; k < markers.length(); k++) {
            markers.setCharAt(k,' ');
        }

        iterator.setText(target);
        int boundary = iterator.first();

        while (boundary != BreakIterator.DONE) {
            markers.setCharAt(boundary,'^');
            boundary = iterator.next();
        }

        System.out.println(target);
        System.out.println(markers);
    }
    static void extractWords(String target, BreakIterator wordIterator) {

        wordIterator.setText(target);
        int start = wordIterator.first();
        int end = wordIterator.next();

        while (end != BreakIterator.DONE) {
            String word = target.substring(start,end);
            if (Character.isLetterOrDigit(word.charAt(0))) {
                System.out.println(word);
            }
            start = end;
            end = wordIterator.next();
        }
    }

}
