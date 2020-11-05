package com.rakovets.course.javabasics.practice.jcf;

import java.util.ArrayList;
import java.util.Collection;

public class StringCollectionUtil {
    public static Collection<String> resetWordsByLength(Collection<String> collection, int sizeWord) {
        Collection<String> replacementCollection = new ArrayList<String>();
        String replacement = "*";
        for (String str : collection ) {
            if (str.length() == sizeWord) {
                replacementCollection.add("*");
            } else {
                replacementCollection.add(str);
            }
        }
        return replacementCollection;
    }

    public static Collection<String> removeWordsByLength(Collection<String> collection, int sizeWord) {
        Collection<String> replacementCollection = new ArrayList<String>();
        for (String str : collection) {
            if (str.length() != sizeWord) {
                replacementCollection.add(str);
            }
        }
        return replacementCollection;
    }
}

