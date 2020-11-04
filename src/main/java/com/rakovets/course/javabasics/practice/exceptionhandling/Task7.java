package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task7 {
    public static void getRandom() throws Exception {
        int random = 1 + (int) (Math.random() * 2);
        throw new Exception();
    }
}

