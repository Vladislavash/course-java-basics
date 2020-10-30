package com.rakovets.course.javabasics.practice.jcf;

import java.util.ArrayList;

public class StringCollectionUtil {
    public static ArrayList<String> resetWordsByLength(ArrayList<String> string, int sizeWord) {
        for (int i = 0; i < string.size(); i++) {
            if (string.get(i).length() == sizeWord) {
                string.set(i, "*");
            }
        }
        return string;
    }

    public static ArrayList<String> removeWordsByLength(ArrayList<String> string, int sizeWord) {
        for (int i = 0; i < string.size(); i++) {
            if (string.get(i).length() == sizeWord) {
                string.remove(i);
            }
        }
        return string;
    }
}

