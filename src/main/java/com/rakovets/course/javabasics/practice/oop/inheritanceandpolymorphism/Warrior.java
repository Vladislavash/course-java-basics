package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(14);
        System.out.println("Warrior attacks the enemy");
    }
}
