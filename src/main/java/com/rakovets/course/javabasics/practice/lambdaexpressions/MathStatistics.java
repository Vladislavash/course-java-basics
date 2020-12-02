package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.List;

public class MathStatistics {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(0, 1, 2, 3, 3, 4, 5, 6, 7);
        long countEven = numbers.stream()
                .filter(number -> number % 2 == 0)
                .count();

        System.out.println(countEven);

        long countOdd = numbers.stream()
                .filter(number -> number % 2 != 0)
                .count();

        System.out.println(countOdd);

        long countEquals = numbers.stream()
                .filter(number -> number == 0)
                .count();

        System.out.println(countEquals);

        long countRandom = numbers.stream()
                .filter(number -> number == 3)
                .count();

        System.out.println(countRandom);


    }
}
