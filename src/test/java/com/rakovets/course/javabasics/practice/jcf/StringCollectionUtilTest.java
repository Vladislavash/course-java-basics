package com.rakovets.course.javabasics.practice.jcf;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class StringCollectionUtilTest {

    @Test
    void resetWordsByLengthTest() {
        String[] array = new String[]{"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"};
        String[] result = new String[]{"this", "is", "lots", "of", "*", "*", "every", "Java", "programmer"};
        Collection<String> collection = new ArrayList<>(Arrays.asList(array));
        Collection<String> collection1 = new ArrayList<>(Arrays.asList(result));
        assertEquals(collection1, StringCollectionUtil.resetWordsByLength(collection, 3));
    }

    @Test
    void removeWordsByLengtTest() {
        String[] array = new String[]{"this", "is", "lots", "of", "fun", "for", "Java", "programmer"};
        String[] result = new String[]{"this", "is", "lots", "of", "Java", "programmer"};
        ArrayList<String> list = new ArrayList<>();
        Collection<String> collection = new ArrayList<>(Arrays.asList(array));
        Collection<String> collection1 = new ArrayList<>(Arrays.asList(result));
        assertEquals(collection1, StringCollectionUtil.removeWordsByLength(collection, 3));
    }
}