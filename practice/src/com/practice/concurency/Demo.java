package com.practice.concurency;

public class Demo {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        long usedKB = ( rt.totalMemory() - rt.freeMemory() ) / 1024;
        System.out.format("Process ID  %-10d%n", ProcessHandle.current().pid());
        System.out.format("Thread Count  %-10d%n ", Thread.activeCount());
        System.out.format("Memory Usage %-10d KB %n", usedKB);
    }
}
