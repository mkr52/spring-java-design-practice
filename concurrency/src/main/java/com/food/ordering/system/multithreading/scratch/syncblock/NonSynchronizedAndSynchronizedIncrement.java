package com.food.ordering.system.multithreading.scratch.syncblock;

import java.util.ArrayList;
import java.util.List;

public class NonSynchronizedIncrement {

    private static int counter;

    public static void main(String[] args) throws InterruptedException {
        List<Thread> allThreads = new ArrayList<>();
        int noOfIncrements = 10000;

        for (int i = 0; i < noOfIncrements; i++) {
            var t = new Thread(NonSynchronizedIncrement::increment);
            allThreads.add(t);
            t.start();
        }

        for (Thread thread: allThreads) {
            thread.join();
        }

        System.out.println(counter);
    }

    // Yse synchronized keyword to always print 10000
    private static void increment() {
        counter++;
    }

    // Same as synchronized but for specific sections
    private static void incrementWithSynchronizedBlock() {
        synchronized ()
    }
}
