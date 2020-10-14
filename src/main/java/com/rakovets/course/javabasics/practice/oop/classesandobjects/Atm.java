package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Atm {
    private int numberBanknotes100;
    private int numberBanknotes50;
    private int numberBanknotes20;

    Atm(int numberBanknotes100, int numberBanknotes50, int numberBanknotes20) {
        this.numberBanknotes100 = numberBanknotes100;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes20 = numberBanknotes20;
    }

    int addBanknotes100(int number) {
        return this.numberBanknotes100 = number;
    }

    int addBanknotes50(int number) {
        return this.numberBanknotes50 = number;
    }

    int addBanknotes20(int number) {
        return this.numberBanknotes20 = number;
    }

    void isPossibleIssue(int amount) {
        for (int i100 = 0; i100 <= this.numberBanknotes100; i100++) {
            for (int i50 = 0; i50 <= this.numberBanknotes50; i50++) {
                for (int i20 = 0; i20 <= this.numberBanknotes20; i20++) {
                    if (i100 + i50 + i20 == amount) {
                        System.out.println(true);
                    } else {
                        System.out.println(false);
                    }
                    break;
                }
                break;
            }
            break;
        }
    }
}