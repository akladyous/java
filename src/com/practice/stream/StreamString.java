package com.practice.stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamString {

  public static void main(String[] args) {
    String[] arrString = { "str 1", "str 2", "str 3", "str 4", "str 5" };
    Stream<String> stream1 = Stream.of(arrString);

    Stream<String> stream2 = Arrays.asList("str1", "str2", "str3", "str4", "str5").stream();
    String stream2Joined = stream2
        .map(str -> new String(str).toUpperCase())
        .collect(Collectors.joining(" ,"));
    System.out.println("stream2Joined : " + stream2Joined);
  }
}
// https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/functional_programming/jdk_stream_api/src/main/java/streamapi/BuildTests.java#L25
