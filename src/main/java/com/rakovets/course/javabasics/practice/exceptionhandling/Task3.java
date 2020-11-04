package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task3 {
    public static void main(String[] args) {
        Task3M age = new Task3M(10,true);
        try {
            age.getLife(120);
        } catch (Task3M.PersonLife e) {
            e.printStackTrace();
            System.out.println("Person is death");
        }
    }
}
