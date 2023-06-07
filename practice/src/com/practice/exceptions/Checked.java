package com.practice.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked {

    public static void main(String[] args) {
        readFile("fileNotExists.txt");

    }

    private static void readFile (String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
        } catch(FileNotFoundException e) {
            System.out.println("error opening the given file name");
        }
    }
}
