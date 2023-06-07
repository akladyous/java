package com.practice.exceptions;

import java.io.FileReader;

public class Checked {

    public static void main(String[] args) {

    }

    private static void readFile (String fileName) {
        FileReader reader = new FileReader(fileName);
    }
}
