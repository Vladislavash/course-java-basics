package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producer.consumer;

public class NumberStoreDemo {
    public static void main(String[] args) {
        Store store = new Store();

        try {
            ProducerThread thread1 = new ProducerThread("producer thread1", store);

            thread1.start();
            thread1.join();

            System.out.println("list - " + store.getList());

            ConsumerThread1 thread2 = new ConsumerThread1("consumer thread2", store);

            thread2.start();
            thread2.join();

            System.out.println("list after removing - " + store.getList());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
