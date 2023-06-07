package com.practice.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedUnChecked {

    public static void main(String[] args) {
        readFile("fileNotExists.txt");
        printValueAtIndex(new int[]{1,2,3}, 5);
    }

    // checked exception
    private static void readFile (String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
        } catch(FileNotFoundException e) {
            System.out.println("error opening the given file name");
        }
    }

    // unchecked exception
    private static void printValueAtIndex(int[] numsArray, int index) {
        System.out.println(numsArray[index]);
    }
}
