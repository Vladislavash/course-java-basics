package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Atm {
    public static void main(String[] args) {
        int numberBanknotes100;
        int numberBanknotes50;
        int numberBanknotes20;
        Atm (int numberBanknotes100, int numberBanknotes50, int numberBanknotes20) {
            this.numberBanknotes100 = numberBanknotes100;
            this.numberBanknotes50 = numberBanknotes50;
            this.numberBanknotes20 = numberBanknotes20;
        }
        int getX() {
            return this.x;
        }
        int setX(int x) {
            this.x = x;
        }
        int getY() {
            return this.y;
        }
        int setY(int y) {
            this.y = y;
        }
}
