package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

import java.util.Random;

public class Factory {
    private int head = 0;
    private int torso = 0;
    private int hand = 0;
    private int feet = 0;


    public void produceDetails() {
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int type = random.nextInt(4);

            switch (type) {
                case 0:
                    this.head = this.head + 1;
                    break;
                case 1:
                    this.torso = this.torso + 1;
                    break;
                case 2:
                    this.hand = this.hand + 1;
                    break;
                case 3:
                    this.feet = this.feet + 1;
                    break;
            }
        }
    }

    public int getFeet() {
        if (this.feet != 0) {
            this.feet = this.feet - 1;
            return 1;
        } else
            return 0;
    }

    public int getHand() {
        if (this.hand != 0) {
            this.hand = this.hand - 1;
            return 1;
        } else
            return 0;
    }

    public int getHead() {
        if (this.head != 0) {
            this.head = this.head - 1;
            return 1;
        } else
            return 0;
    }

    public int getTorso() {
        if (this.torso != 0) {
            this.torso = this.torso - 1;
            return 1;
        } else
            return 0;
    }
}
