package com.practice.strings;

import java.io.PrintWriter;
import java.io.StringWriter;

public class StringConcatenation {
  public static void main(String[] args) {

  }

  String newLine = System.getProperty("line.separator");

  public String stringConcat1() {
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

  public String stringJoin() {
    return String.join(newLine,
        "Get busy living",
        "or",
        "get busy dying.",
        "--Stephen King");
  }

  public String stringBuilder() {
    return new StringBuilder()
        .append("Get busy living")
        .append(newLine)
        .append("or")
        .append(newLine)
        .append("get busy dying.")
        .append(newLine)
        .append("--Stephen King")
        .toString();
  }

  public String stringWriter() {
    StringWriter stringWriter = new StringWriter();
    PrintWriter printWriter = new PrintWriter(stringWriter);
    printWriter.println("Get busy living");
    printWriter.println("or");
    printWriter.println("get busy dying.");
    printWriter.println("--Stephen King");
    return stringWriter.toString();
  }

}
