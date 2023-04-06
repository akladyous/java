package com.practice.concurency;

public class Demo {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        long usedKB = ( rt.totalMemory() - rt.freeMemory() ) / 1024;
        System.out.printf("Process ID%15d%n", ProcessHandle.current().pid());
        System.out.printf("Thread Count %15d\n", Thread.activeCount());
        System.out.format("Memory Usage%-5dkb%n", usedKB);
    }
}
