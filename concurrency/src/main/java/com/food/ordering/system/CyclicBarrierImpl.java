package com.food.ordering.system;

public class CyclicBarrier {
    
    private int parties;
    private int count;
    private Runnable barrierAction;

    public CyclicBarrier(int parties, Runnable barrierAction) {
        this.parties = parties;
        this.barrierAction = barrierAction;
        this.count = parties;
    }

    public synchronized void await() throws InterruptedException {
        count--;
        if (count == 0) {
            count = parties;
            barrierAction.run();
        }
    }
}
