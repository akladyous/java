package com.practice.strings;

public class StringConcatenation {
    String newLine = System.getProperty("line.separator");

    public String stringConcat1(){
        return "Get busy living"
                .concat(newLine)
                .concat("or")
                .concat(newLine)
                .concat("get busy dying.")
                .concat(newLine)
                .concat("--Stephen King");
    }
    public String stringConcat2() {
        return "Get busy living"
                + newLine
                + "or"
                + newLine
                + "get busy dying."
                + newLine
                + "--Stephen King";
    }


}
