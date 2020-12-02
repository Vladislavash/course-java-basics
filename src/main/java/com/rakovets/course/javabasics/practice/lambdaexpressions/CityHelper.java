package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class CityHelper {
    public static void main(String[] args) {

        List<String> city = Arrays.asList("Minsk", "Grodno", "Minsk", "Moscow", "Grodno", "Vitebsk");
        List<String> uniqueElements = city.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueElements);

        city.stream()
                .filter(s -> s.length() > 6)
                .forEach(System.out::println);

        city.stream()
                .filter(city1 -> city1.startsWith("G"))
                .forEach(System.out::println);

        long repeatElements = (long) city.stream()
                .filter(city2 -> city2.equals("Minsk"))
                .count();
        System.out.println(repeatElements);
    }
}
