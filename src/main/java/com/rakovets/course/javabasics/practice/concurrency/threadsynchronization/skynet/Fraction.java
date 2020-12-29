package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static java.lang.Thread.sleep;

public class Fraction {
    private int head = 0;
    private int torso = 0;
    private int hand = 0;
    private int feet = 0;

    public synchronized void getDetailsFromFactory(Factory factory) throws InterruptedException {
        int countDetails = 0;

        while (countDetails < 5) {
            Random random = new Random();
            int type = random.nextInt(4);

            switch (type) {
                case 0:
                    if (factory.getHead() != 0) {
                        countDetails++;
                        this.head = this.head + 1;
                    }
                    break;
                case 1:
                    if (factory.getTorso() != 0) {
                        countDetails++;
                        this.torso = this.torso + 1;
                    }
                    break;
                case 2:
                    if (factory.getHand() != 0) {
                        countDetails++;
                        this.hand = this.hand + 1;
                    }
                    break;
                case 3:
                    if (factory.getFeet() != 0) {
                        countDetails++;
                        this.feet = this.feet + 1;
                    }
                    break;
            }

            sleep(1);
        }
    }

    public int getNumberOfRobots() {
        ArrayList<Integer> listOfDetails = new ArrayList<>();
        listOfDetails.add(this.head);
        listOfDetails.add(this.torso);
        listOfDetails.add(this.hand);
        listOfDetails.add(this.feet);

        int count = this.head + this.torso + this.hand + this.feet;

        System.out.println("fraction - " + count);

        return Collections.min(listOfDetails);
    }
}
