package com.practice.utilities;

import java.util.concurrent.TimeUnit;

public class Timer {
    private final long startTime;

    public static void main(String[] args) {
        Timer timer = new Timer();
        int x = 0;
        for (int i = 0; i < 1000 ; i++) {x++;}
        double elapsed = timer.elapsedMillis() / 1_000_000;
        System.out.printf("%-5s %1.2f μ%n", "Elapsed Time", (float) elapsed );
    }

    public Timer() {
        startTime = System.nanoTime();
    }
    public double elapsedMillis() {
        long now = System.nanoTime();
        return (now - startTime) / (double) TimeUnit.MILLISECONDS.toNanos(1);
    }
}
