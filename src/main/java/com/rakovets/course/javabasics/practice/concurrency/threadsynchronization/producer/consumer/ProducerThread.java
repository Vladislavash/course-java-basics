package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producer.consumer;

import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producer.consumer.Store;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;

public class ProducerThread extends Thread {
    private final Store store;

    ProducerThread(String name, Store store) {
        super(name);

        this.store = store;
    }

    @Override
    public void run() {

        System.out.printf("%s started... \n", Thread.currentThread().getName());

        Deque<Integer> list = new ArrayDeque<Integer>(10);

        while (list.size() < 10) {
            Random random = new Random();
            int num = random.nextInt(100);
            list.add(num);
        }

        System.out.println("thread list - " + list);

        this.store.produce(Thread.currentThread().getName(), list);
    }
}
