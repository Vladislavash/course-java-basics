package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task5 {
    public static void main(String[] args) {
        Task5M age = new Task5M(1000);
        try {
            age.getLife();
        } catch (Task5M.PersonLife ex) {
            System.out.println(ex.toString());
        }
    }
}