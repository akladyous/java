package com.practice.concurency;

public class Demo {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        long usedKB = ( rt.totalMemory() - rt.freeMemory() ) / 1024;
        System.out.printf("Process ID %15d %n", ProcessHandle.current().pid());
        System.out.printf("Thread Count %15d %n", Thread.activeCount());
        System.out.printf("Cores Count %15d %n", rt.getRuntime().availableProcessors());
        System.out.format("Max memory: %d bytes\n", rt.maxMemory() / 1024);
        System.out.println("Memory Usage "+  usedKB);

    }

}
