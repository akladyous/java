package org.practice;

public class Main {
    public static void main(String[] args) {


        System.out.println(reverseWord("ehT  kciuq nworb xof spmuj revo eht yzal .god"));;
        System.out.println(reverseWord("sihT si eht tsrif .ecnetnes  sihT si eht .dnoces"));;
        System.out.println(reverseWord("elbuod  decaps  sdrow"));;
        System.out.println(reverseWord("elppa"));;
        /*
        var app = Javalin
                          .create()
                          .get("/", ctx -> ctx.result("ciao").status(200))
                          .start(4000);
         */
    }


    public static String reverseWord(String original) {
        String result = "";
        String stack="";
        int leftIndex = 0;
        int rightIndex;

        for (rightIndex = 0; rightIndex < original.length()  ; rightIndex++) {
            if (original.charAt(rightIndex) == ' ' ) {
                for (int idx = rightIndex - 1; idx >= leftIndex; idx --) {
                    result += original.charAt(idx);
                }
                leftIndex = rightIndex + 1;
                result += ' ';
            }
        }
        return result;
    }

    public static String reverseWord1(String original) {
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