package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

public class WednesdayThread extends Thread {
    private final Fraction fraction;
    private final Factory factory;

    WednesdayThread(Fraction fraction, Factory factory) {
        this.fraction = fraction;
        this.factory = factory;
    }

    @Override
    public void run() {
        try {
            this.fraction.getDetailsFromFactory(factory);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
