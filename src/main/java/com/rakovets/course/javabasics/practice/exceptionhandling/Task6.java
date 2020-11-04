package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task6 {
    public static void getRandom() throws NullPointerException, ClassCastException, ArrayIndexOutOfBoundsException {
        int random = 1 + (int) (Math.random() * 3);
        System.out.println(random);
        if (random == 1) {
            throw new NullPointerException();
        } else if( random == 2) {
            throw new ClassCastException();
        } else if( random == 3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
