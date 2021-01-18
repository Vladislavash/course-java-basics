package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producer.consumer;

import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producer.consumer.Store;

public class ConsumerThread1 extends Thread {
    private Store store;

    ConsumerThread1(String name, Store store) {
        super(name);
        this.store = store;
    }

    @Override
    public void run() {
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        this.store.consume(Thread.currentThread().getName());
    }
}
