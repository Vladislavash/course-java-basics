package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

public class FactoryThread extends Thread{
    private Factory factory;

    FactoryThread(Factory factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        this.factory.produceDetails();
    }
}
