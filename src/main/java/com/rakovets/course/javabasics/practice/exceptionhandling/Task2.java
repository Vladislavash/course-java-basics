package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        try {
            numbers[6] = 45;
            System.out.println( numbers[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }
    }
}
