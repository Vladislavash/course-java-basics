package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task6M {
    public static void main(String[] args) {
        try {
            Task6.getRandom();
        } catch (NullPointerException | ClassCastException e) {
            String message = e.toString();
            System.out.println(message);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        }
    }
}
