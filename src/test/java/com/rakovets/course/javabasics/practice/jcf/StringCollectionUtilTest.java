package com.rakovets.course.javabasics.practice.jcf;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
public class StringCollectionUtilTest {
    @Test
    void resetWordsByLengthTest() {
        String[] array = new String[]{"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"};
        String[] result = new String[]{"this", "is", "lots", "of", "*", "*", "every", "Java", "programmer"};
        ArrayList<String> list = new ArrayList<>();
        for (String string : array) {
            list.add(string);
        }
        StringCollectionUtil.resetWordsByLength(list, 3);
        assertArrayEquals(result, list.toArray());
    }

    @Test
    void removeWordsByLengtTest() {
        String[] array = new String[]{"this", "is", "lots", "of", "fun", "for", "Java", "programmer"};
        String[] result = new String[]{"this", "is", "lots", "of", "fun", "for", "Java", "programmer"};
        ArrayList<String> list = new ArrayList<>();
        for (String string : array) {
            list.add(string);
        }
        StringCollectionUtil.removeWordsByLength(list, 5);
        assertArrayEquals(result, list.toArray());
    }
}