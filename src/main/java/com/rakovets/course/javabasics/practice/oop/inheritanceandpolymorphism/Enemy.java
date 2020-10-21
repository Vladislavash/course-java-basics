package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Enemy {
    public int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void attackEnemy() {
        System.out.println("Hero attacks the enemy");
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public int getHeaith() {
        return this.health;
    }

    public String isAlive() {
        if (health > 0){
        return "true";
        }
        return "false";
    }

    public int setHeaith() {
        return this.health = health;
    }
}
