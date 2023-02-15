package com.practice.stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamString {
  static String str1 = "string 1";
  static String str2 = "string 2";
  static String str3 = "string 3";
  static String str4 = "string 4";
  static String str5 = "string 5";

  public static void main(String[] args) {
    Stream<String> stream1 = Stream.of(str1, str2, str3);

    Stream<String> stream2 = Arrays.asList(str1, str2, str3, str4, str5).stream();
    String stream2Joined = stream2
        .map(str -> new String(str).toUpperCase())
        .collect(Collectors.joining(" ,"));
    System.out.println("stream2Joined : " + stream2Joined);
  }
}
