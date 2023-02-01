package com.practice.strings;

public class StringConcatenation {
    String newLine = System.getProperty("line.separator");

    public String concat1(){
        return "Get busy living"
                .concat(newLine)
                .concat("or")
                .concat(newLine)
                .concat("get busy dying.")
                .concat(newLine)
                .concat("--Stephen King");
    }

}
