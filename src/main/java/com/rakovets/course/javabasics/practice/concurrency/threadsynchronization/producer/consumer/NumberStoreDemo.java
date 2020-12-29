
package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producer.consumer;

public class NumberStoreDemo {
    public static void main(String[] args) {
        Store store = new Store();

        try {
            ProducerThread thread1 = new ProducerThread("producer thread1", store);
            ProducerThread thread2 = new ProducerThread("producer thread2", store);

            thread1.start();
            thread2.start();

            thread1.join();
            thread2.join();

            System.out.println("list - " + store.getList());

            ConsumerThread1 thread3 = new ConsumerThread1("consumer thread3", store);
            ConsumerThread1 thread4 = new ConsumerThread1("consumer thread4", store);

            thread3.start();
            thread4.start();

            thread3.join();
            thread4.join();

            System.out.println("list after removing - " + store.getList());

            ProducerThread thread5 = new ProducerThread("producer thread5", store);

            thread5.start();
            thread5.join();

            System.out.println("list after adding - " + store.getList());

            ConsumerThread1 thread6 = new ConsumerThread1("consumer thread6", store);
            ConsumerThread1 thread7 = new ConsumerThread1("consumer thread7", store);
            ConsumerThread1 thread8 = new ConsumerThread1("consumer thread8", store);

            thread6.start();
            thread7.start();
            thread8.start();

            thread6.join();
            thread7.join();
            thread8.join();

            System.out.println("list after removing - " + store.getList());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
