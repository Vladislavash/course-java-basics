package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producer.consumer;

import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producer.consumer.Store;

public class ProducerThread extends Thread {
    private Store store;

    ProducerThread(String name, Store store) {
        super(name);

        this.store = store;
    }

    @Override
    public void run() {

        System.out.printf("%s started... \n", Thread.currentThread().getName());
        this.store.produce(Thread.currentThread().getName());
    }
}


