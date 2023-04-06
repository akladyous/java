package com.practice.concurency;

public class Demo {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        long usedKB = ( rt.totalMemory() - rt.freeMemory() ) / 1024;
        System.out.format("Process ID : %d%n", ProcessHandle.current().pid());
    }
}
