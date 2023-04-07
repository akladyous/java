package com.practice.concurency;

public class Demo {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        long usedKB = ( rt.totalMemory() - rt.freeMemory() ) / 1024;
        System.out.printf("Process ID %15d %n", ProcessHandle.current().pid());
        System.out.printf("Thread Count %15d %n", Thread.activeCount());
        System.out.printf("total cores %15d %n", Runtime.getRuntime().availableProcessors(););
        System.out.println("Memory Usage "+  usedKB);
    }
}
