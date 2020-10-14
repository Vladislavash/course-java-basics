package com.rakovets.course.javabasics.practice.oop.classesandobjects;

import com.rakovets.course.javabasics.practice.oop.classesandobjects.Time;

public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point(60, 50);
        Point point2 = new Point(20, 10);
        System.out.println(" Distance: " + point2.distance(point1));
    }
}
