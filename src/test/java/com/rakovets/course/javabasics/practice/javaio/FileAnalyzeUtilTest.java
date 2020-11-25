package com.rakovets.course.javabasics.practice.javaio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileAnalyzeUtilTest {
    String str = "/Users/vladashugalo/Desktop/opt/home/src/Task1.txt";
    String str2 = "/Users/vladashugalo/Desktop/opt/home/src/Task2.txt";
    String str3 = "/Users/vladashugalo/Desktop/opt/home/src/Task3.txt";
    String str5 = "/Users/vladashugalo/Desktop/opt/home/src/Task4.txt";
    String str6 = "/Users/vladashugalo/Desktop/opt/home/src/Task5.txt";


    @Test
    void Task2() {
        List<String> list = Arrays.asList("OLI 32323", "Hello MAMAMA", "NUI 109090", "999999 ");
        Assertions.assertEquals(list, FileAnalyzeUtil.getStringList(str));
    }

    @Test
    void Task3() {
        List<String> list = Arrays.asList("our", "omg", "Ill");
        Assertions.assertEquals(list, FileAnalyzeUtil.getVowelsStringList(str2));
    }

    @Test
    void Task4() {
        List<String> list = Arrays.asList("omnomo", "our");
        Assertions.assertEquals(list, FileAnalyzeUtil.getWords(str3));
    }

    @Test
    void Task6() {
        Map<Character, Integer>expected = new HashMap<>();
        expected.put('a', 4);
        expected.put('1', 5);
        expected.put('b', 6);
        expected.put('c', 4);
        Assertions.assertEquals(expected, FileAnalyzeUtil.getFrequencyLetter(str5));
    }

    @Test
    void Task7() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("Hello", 1);
        expected.put("my", 1);
        expected.put("love", 2);
        expected.put("kill", 3);
        expected.put("you", 3);
        Assertions.assertEquals(expected, FileAnalyzeUtil.getFrequencyWord(str6));
    }
}
