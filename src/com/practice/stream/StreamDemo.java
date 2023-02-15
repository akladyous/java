package com.practice.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo {

  static Stream<String> streamFromValues = Stream.of("one", "two", "three");

  static String[] arrayOfStrings = { "a1", "a2", "a3" };
  static Stream<String> streamFromArrays1 = Arrays.stream(arrayOfStrings);
  static Stream<String> streamFromArrays2 = Stream.of(arrayOfStrings);

  public static void main(String[] args) {

  }
}
