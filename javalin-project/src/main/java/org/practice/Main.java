package org.practice;

import io.javalin.Javalin;
import io.javalin.apibuilder.EndpointGroup;

public class Main {
    public static void main(String[] args) {


//        var app = Javalin
//                          .create()
//                          .get("/", ctx -> ctx.result("ciao").status(200))
//                          .start(4000);
    }


    public static String reverseWords(String original) {
        String words[] = original.trim().split("\\s+");
        for (int word = 0; word < words.length; word++) {
            char[] reversedWord = new char[words[word].length()];
            for (int i = 0; i < words[word].length(); i++) {
                reversedWord[i] = words[word].charAt(words[word].length() - 1 - i);
            }
            words[word] = String.valueOf(reversedWord);
        }
        return String.join(" ", words);
    }

}