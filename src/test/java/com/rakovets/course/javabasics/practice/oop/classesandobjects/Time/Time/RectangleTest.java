package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class RectangleTest {
    public static void main(String[] args) {
        Point point1 = new Point( 60, 50 );
        Point point2 = new Point( 80, 80 );
        Rectangle rec = new Rectangle(point1, point2);
        System.out.println(" Perimeter: " + rec.getPerimeter());
        System.out.println(" Area: " + rec.getArea());
    }

}
