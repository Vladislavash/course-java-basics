package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Person {
    private int happiness;

    public Person(int happiness) {
        this.happiness = happiness;
    }

    public int changeHappiness(int percentHappiness) {
        return happiness += percentHappiness;
    }

    public int getHappiness(int i) {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
}
