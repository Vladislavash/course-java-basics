package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public abstract class Hero {
    public String name;

    public Hero(String name) {
        this.name = name;
    }

    public abstract void attackEnemy(Enemy enemy);

    public String getName() {
        return this.name;
    }
}
