package com.practice.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo {
  // Create Stream from values
  static Stream<String> streamFromValues = Stream.of("one", "two", "three");

  // Create Stream from array
  static String[] arrayOfStrings = { "a1", "a2", "a3" };
  static Stream<String> streamFromArrays1 = Arrays.stream(arrayOfStrings);
  static Stream<String> streamFromArrays2 = Stream.of(arrayOfStrings);

  // Create Stream from collection

  public static void main(String[] args) {

  }
}
