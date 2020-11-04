package com.rakovets.course.javabasics.practice.jcf;

import java.util.ArrayList;
import java.util.Collection;

public class StringCollectionUtil {
    public static Collection<String> resetWordsByLength(Collection<String> collection, int sizeWord) {
        Collection<String> replacementCollection = new ArrayList<String>();
        String replacement = "*";
        for (String string : collection ) {
            String result = string.length() == sizeWord ? replacement : string;
            replacementCollection.add(result);
        }
        return replacementCollection;
    }

    public static Collection<String> removeWordsByLength(Collection<String> collection, int sizeWord) {
        Collection<String> replacementCollection = new ArrayList<String>();
        for (String string : collection) {
            if (string.length() != sizeWord) {
                replacementCollection.add(string);
            }
        }
        return replacementCollection;
    }
}

