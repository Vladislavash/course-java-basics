package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        Fraction world = new Fraction();
        Fraction wednesday = new Fraction();

        try {

            for (int i = 0; i < 100; i++) {
                FactoryThread factoryThread = new FactoryThread(factory);
                factoryThread.start();
                factoryThread.join();

                WorldThread worldThread = new WorldThread(world, factory);
                WednesdayThread wednesdayThread = new WednesdayThread(wednesday, factory);

                worldThread.start();
                wednesdayThread.start();

                worldThread.join();
                wednesdayThread.join();
            }

            System.out.println("World - " + world.getNumberOfRobots());
            System.out.println("Wednesday - " + wednesday.getNumberOfRobots());

            if (world.getNumberOfRobots() > wednesday.getNumberOfRobots()) {
                System.out.println("The winner is world fraction");
            } else {
                System.out.println("The winner is wednesday fraction");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
