package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producer.consumer;


import java.util.LinkedList;
import java.util.Random;

public class Store {
    private LinkedList<Integer> list = new LinkedList<>();

    public synchronized void produce(String threadName) {
        while (list.size() < 10) {
            try {
                Random random = new Random();
                int num = random.nextInt(100);
                list.add(num);
                System.out.println(threadName + " " + list.size() + " num is - " + num);

                wait(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void consume(String threadName) {
        while (list.size() > 0) {
            try {
                Random random = new Random();
                int delay = random.nextInt(10);
                int num = list.removeFirst();

                System.out.println(threadName + " num is - " + num);

                if (delay != 0) {
                    wait(delay);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public LinkedList<Integer> getList() {
        return this.list;
    }
}
