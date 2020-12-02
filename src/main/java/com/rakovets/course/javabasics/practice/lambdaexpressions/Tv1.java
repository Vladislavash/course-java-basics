package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Tv1 {
    public static void main(String[] args) {

        List<Tv> tv = List.of(
                new Tv("LG", "S5005", 2020, 15.5, 1000),
                new Tv("Samsung", "L909", 2019, 16, 1100),
                new Tv("Philips", "P202", 2020, 16.5, 950));

        System.out.println("Task 1:");

        tv.stream()
                .filter(p -> p.getDiagonal() == 15.5)
                .forEach(System.out::println);

        System.out.println("Task 2:");

        tv.stream()
                .filter(p -> p.getManufacturer().equals("Philips"))
                .forEach(System.out::println);

        System.out.println("Task 3:");

        tv.stream()
                .filter(p -> p.getYear() >= 2020)
                .forEach(System.out::println);

        System.out.println("Task 4:");

        tv.stream()
                .filter(p -> p.getPrice() < 1200 && p.getPrice() > 980)
                .forEach(System.out::println);

        System.out.println("Task 5:");

        tv.stream()
                .sorted(Comparator.comparing(Tv::getPrice))
                .forEach(System.out::println);

        System.out.println("Task 6:");

        tv.stream()
                .sorted(Comparator.comparing(Tv::getPrice).reversed())
                .forEach(System.out::println);

        System.out.println("Task 7:");

        tv.stream()
                .sorted(Comparator.comparing(Tv::getDiagonal))
                .forEach(System.out::println);

        System.out.println("Task 8:");

        tv.stream()
                .sorted(Comparator.comparing(Tv::getDiagonal).reversed())
                .forEach(System.out::println);
    }
}
