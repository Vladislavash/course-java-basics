package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class TimeTest {
    public static void main(String[] args) {
        Time time  = new Time (10000);
        System.out.println(" Hours: " + time.getHours());
        System.out.println(" Minutes: " + time.getMinutes());
        System.out.println(" Seconds: " + time.getSeconds());
        Time time1 = new Time (10,2,7);
        System.out.println(" Total Seconds: " + time1.getTotalSeconds());
    }
}
