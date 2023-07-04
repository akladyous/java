package com.practice.generics;

import java.util.ArrayList;
import java.util.List;

public class RawType {

    public static void main(String[] args) {

        List rawList = new ArrayList();
        rawList.add("-");
        rawList.add("is");
        rawList.add("a");
        rawList.add("raw");
        rawList.add("list");
        rawList.add("of");
        rawList.add("strings");
        rawList.set(0,"this");
        for (Object obj: rawList) {
            String strObj = (String) obj;
            System.out.printf("%-7s has %d characters%n", strObj, strObj.length());
        }

    }
}
