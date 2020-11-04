package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task4 {
    public static void main(String[] args) {
        Task4M age = new Task4M(90,false);
        try {
            age.getLife(90);
        } catch (Task4M.PersonLife e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
