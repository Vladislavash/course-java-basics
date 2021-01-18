package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producer.consumer;

public class ConsumerThread extends Thread {
    private final Store store;

    ConsumerThread(String name, Store store) {
        super(name);

        this.store = store;
    }

    @Override
    public void run() {
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        this.store.consume(Thread.currentThread().getName());
    }
}
