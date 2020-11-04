package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task7M {
    public static void main(String[] args) {
        int sum = 2020;
        try {
            Task7.getRandom();
        } catch (Exception e) {
            System.out.println("Your win : " + sum / 2);
        } finally {
            System.out.println("Good buy");
        }
    }
}
