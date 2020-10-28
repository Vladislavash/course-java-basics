package com.rakovets.course.javabasics.practice.generics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MathTest {

    @Test
    void MaxTest() {
        Assertions.assertEquals(8765.4321, Math.max(1234.5678, 123.5678, 8765.4321));
        Assertions.assertEquals(999, Math.max(999, 666, 111));
    }


    @Test
    void MinTest() {
        Assertions.assertEquals(0.999999, Math.min(1234.5678, 123.5678, 8765.4321, 111.0, 0.999999));
        Assertions.assertEquals(0, Math.min(999, 666, 111, 0, 567));
    }

    @Test
    void getArraySumTest() {

        Integer[] arr = {11111, 22222, 33333, 44444, 55555};
        Double[] arr1 = {999.999, 888.888, 777.777, 666.666, 555.555};
        Math<Integer> testarr = new Math();
        Math<Double> testarr1 = new Math();

        Assertions.assertEquals(33333, testarr.getAverageSum(arr));
        Assertions.assertEquals(777.777, testarr1.getAverageSum(arr1));
    }

    @Test
    void getMaxTest() {
        Integer[] a = {11111, 22222, 33333, 44444, 55555};
        Double[] b = {999.999, 888.888, 777.777, 666.666, 555.555};
        Math<Integer> test1 = new Math();
        Math<Double> test2 = new Math();

        Assertions.assertEquals(55555, test1.getMax(a));
        Assertions.assertEquals(999.999, test2.getMax(b));
    }

    @Test
    void getMinTest() {
        Integer[] a = {11111, 22222, 33333, 44444, 55555};
        Double[] b = {999.999, 888.888, 777.777, 666.666, 555.555};
        Math<Integer> test1 = new Math();
        Math<Double> test2 = new Math();

        Assertions.assertEquals(11111, test1.getMin(a));
        Assertions.assertEquals(555.555, test2.getMin(b));
    }
    @Test
    void getSortTest() {
        Integer[] a = {3, 2, 4, 5, 1};
        Double[] b = {9.9, 8.8, 7.7, 6.6, 5.5};
        Math<Integer> test1 = new Math();
        Math<Double> test2 = new Math();

        Assertions.assertEquals(new Integer[]{1, 2, 3, 4, 5}, test1.getSort(a));
        Assertions.assertEquals(new Double[]{5.5, 6.6, 7.7, 8.8, 9.9}, test2.getSort(b));
    }

    @Test
    void getBinarySearchTest() {

        Integer[] a = {1, 2, 3, 4, 5};
        Double[] b = {9.9, 8.8, 7.7, 6.6, 5.5};
        Math<Integer> test1 = new Math();
        Math<Double> test2 = new Math();

        Assertions.assertEquals(-1, test1.getBinarySearch(a, 0));
        Assertions.assertEquals(3, test1.getBinarySearch(a, 4));
        Assertions.assertEquals(4, test1.getBinarySearch(a, 5));
        Assertions.assertEquals(0, test1.getBinarySearch(a, 1));
        Assertions.assertEquals(3, test2.getBinarySearch(b, 6.6));
        Assertions.assertEquals(4, test2.getBinarySearch(b, 5.5));
        Assertions.assertEquals(0, test2.getBinarySearch(b, 9.9));
    }
}