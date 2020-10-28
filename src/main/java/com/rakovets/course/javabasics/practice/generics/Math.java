package com.rakovets.course.javabasics.practice.generics;

import java.util.Arrays;

public class Math<arr> {
    public static <T extends Comparable<T>> T max(T type1, T type2, T type3) {
        if (type1.compareTo(type2) > 0) {
            if (type1.compareTo(type3) > 0) {
                return type1;
            }
        }
        if (type2.compareTo(type1) > 0) {
            if (type2.compareTo(type3) > 0) {
                return type2;
            }
        }
        if (type3.compareTo(type1) > 0) {
            if (type3.compareTo(type2) > 0) {
                return type3;
            }
        }
        return null;
    }

    public static <T extends Comparable<T>> T min(T type1, T type2, T type3, T type4, T type5) {
        if (type1.compareTo(type2) < 0) {
            if (type1.compareTo(type3) < 0) {
                if (type1.compareTo(type4) < 0) {
                    if (type1.compareTo(type5) < 0) {
                        return type1;
                    }
                }
            }
        }
        if (type2.compareTo(type1) < 0) {
            if (type2.compareTo(type3) < 0) {
                if (type2.compareTo(type4) < 0) {
                    if (type2.compareTo(type5) < 0) {
                        return type2;
                    }
                }
            }
        }
        if (type3.compareTo(type2) < 0) {
            if (type3.compareTo(type1) < 0) {
                if (type3.compareTo(type4) < 0) {
                    if (type3.compareTo(type5) < 0) {
                        return type3;
                    }
                }
            }
        }
        if (type4.compareTo(type2) < 0) {
            if (type4.compareTo(type1) < 0) {
                if (type4.compareTo(type3) < 0) {
                    if (type4.compareTo(type5) < 0) {
                        return type4;
                    }
                }
            }
        }
        if (type5.compareTo(type2) < 0) {
            if (type5.compareTo(type1) < 0) {
                if (type5.compareTo(type3) < 0) {
                    if (type5.compareTo(type4) < 0) {
                        return type5;
                    }
                }
            }
        }
        return null;
    }

    public static <T extends Number> double getAverageSum(T[] arr) {

        double sum = 0;
        double average = 0;
        for (T arv : arr) {
            sum += arv.doubleValue();
            average = sum / arr.length;
        }
        return average;
    }

    public static <T extends Comparable> T getMax(T[] arr) {

        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max.compareTo(arr[i]) < 0) {
                max = arr[i];
            }
        } return max;
    }

    public static <T extends Comparable> T getMin(T[] arr) {

        T min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min.compareTo(arr[i]) > 0) {
                min = arr[i];
            }
        } return min;
    }

    public static <T extends Comparable> T[] getSort(T[] arr) {
        Arrays.sort(arr);
        return arr;
    }


    public static <T extends Comparable> int getBinarySearch(T[] arr, T id) {

        int result = Arrays.binarySearch(arr, id);
        return result;
    }
}
