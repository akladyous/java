package com.practice.primitive;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CharSetDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println(Charset.defaultCharset());
        System.out.println(Charset.availableCharsets());
        System.out.println("charSet [local.us] " + Charset.defaultCharset().displayName(Locale.US));
        byte[] encoded = Charset.defaultCharset().encode("ciao").array();
        System.out.println("'ciao' encoded " + Arrays.toString(encoded));
        Charset.availableCharsets().values().contains("UTF-8");

        System.out.println("-".repeat(50));
        System.out.println(convertToBinary("A", "UTF-8"));
    }

    public static String convertToBinary(String input, String encoding) throws UnsupportedEncodingException {
        byte[] encoded_input = Charset.forName(encoding)
                                       .encode(input)
                                       .array();
        return IntStream.range(0, encoded_input.length)
                       .map(i -> encoded_input[i])
                       .mapToObj(e -> Integer.toBinaryString(e ^ 255))
                       .map(e -> String.format("%1$" + Byte.SIZE + "s", e).replace(" ", "0"))
                       .collect(Collectors.joining(" "));
    }
}
