package com.rakovets.course.javabasics.practice.javaio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class FileAnalyzeUtil {
    public static List<String> getStringList(String str) {
        List<String> list = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader(str))) {
            String str1;
            while ((str1 = br.readLine()) != null) {
                list.add(str1);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public static List<String> getVowelsStringList(String str2) {
        List<String> list = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader(str2))) {
            char[] vowels = new char[]{'A', 'a', 'E', 'I', 'Y', 'U', 'O', 'e', 'i', 'y', 'u', 'o'};
            int i;
            String str1 = "";
            while ((i = br.read()) != -1) {
                str1 += (char) i;
            }
            str1 = str1.trim();
            for (String word : str1.split(" ")) {
                for (char vowel : vowels) {
                    if (word.charAt(0) == vowel) {
                        list.add(word);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public static List<String> getWords(String str3) {
        List<String> list = new ArrayList<String>();
        try (BufferedReader bf = new BufferedReader(new FileReader(str3))) {
            String str1 = " ";
            int i;
            while ((i = bf.read()) != -1) {
                str1 += (char) i;
            }
            str1 = str1.trim();
            String[] word = str1.split(" ");
            for (int j = 0; j < (word.length - 1); j++) {
                if ((word[j] != "") && (word[j + 1] != "")) {
                    int s = word[j].length();
                    if (word[j].charAt(s - 1) == word[j + 1].charAt(0)) {
                        list.add(word[j]);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public static Map<Character, Integer> getFrequencyLetter(String str5) {
        Map<Character, Integer> map = new HashMap<>();
        String str1;
        try (BufferedReader read = new BufferedReader(new FileReader(str5))) {
            while ((str1 = read.readLine()) != null) {
                str1 = str1.toLowerCase();
                str1.chars().forEach(e -> map.put((char) e, map.getOrDefault((char) e, 0) + 1));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return map;
    }

    public static Map<String, Integer> getFrequencyWord(String str6) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new LinkedHashMap<>();
        String words = "";
        String[] word;
        try (BufferedReader buffer = new BufferedReader(new FileReader(str6))) {
            int c;
            while ((c = buffer.read()) != -1) {
                words += (char) c;
            }
            while (words.contains("  ")) {
                String replace = words.replace("  ", " ");
                words = replace;
            }
            word = words.split(" ");
            for (String item : word) {
                if (map1.containsKey(item)) {
                    int value = map1.get(item);
                    map1.put(item, ++value);
                } else {
                    map1.put(item, 1);
                }
            }
            List<Map.Entry<String, Integer>> list = new LinkedList<>(map1.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o1.getValue().compareTo(o2.getValue());
                }
            });
            for (Map.Entry<String, Integer> item : list) {
                map2.put(item.getKey(), item.getValue());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return map2;
    }
}