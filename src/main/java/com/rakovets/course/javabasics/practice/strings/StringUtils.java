package com.rakovets.course.javabasics.practice.strings;

public class StringUtils {
    String getConcatStrings(String str1, String str2) {
        return str1.concat(str2);
    }

    int getindexStrings(char sim) {
        return "Hello world".indexOf(sim);
    }

    boolean getEqualsStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    String getTrimString(String str) {
        return str.trim().toUpperCase();
    }

    public String getExtractSubstringString(String str) {
        String str1 = str.substring(10);
        return str1.substring(0, 23);
    }

    String getReplaceString(String str) {
        return str.replace(":(", ":)");
    }

    boolean getStringWord(String str, String word) {
        return str.startsWith(word) && str.endsWith(word);
    }

    int getArrayString(String str) {
        int i = 0;
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};
        for (char vowel1 : str.toCharArray()) {
            for (char vowel2 : vowels) {
                if (vowel1 == vowel2) {
                    i++;
                    break;
                }
            }
        }
        return i;
    }

    int getArrayStringSim(String str) {
        int i = 0;
        char[] vowels = new char[]{'.', ',', '!'};
        for (char vowel1 : str.toCharArray()) {
            for (char vowel2 : vowels) {
                if (vowel1 == vowel2) {
                    i++;
                    break;
                }
            }
        }
        return i;
    }

    boolean getPalindrom(String str) {
        if (str == null) {
            return false;
        }
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    int getNumbersOfWords(String str) {
        int num = 0;
        str = str.trim();
        String[] words = str.split(" +");
        for (String words1 : words) {
            num++;
        }
        return num;
    }

    String getFio(String str) {
        str = str.trim();
        String[] arr = str.toUpperCase().split(" +");
        String fio = "";
        for (String s : arr) {
            fio += s.charAt(0) + ".";
        }
        return fio;
    }

    String getStringDigits(String str) {
        char[] array = str.toCharArray();
        String result = "";
        for (char digit : array) {
            if (Character.isDigit(digit))
                result += digit;
        }
        return result;
    }

    String getNotRepeating(String str1, String str2) {
        int i;
        for (i = 0; i < str1.length(); i++) {
            if (!(str2.contains("" + str1.charAt(i))))
                return (str1.charAt(i) + " ");
        }
        for (i = 0; i < str2.length(); i++) {
            if (!(str1.contains("" + str2.charAt(i))))
                return (str1.charAt(i) + " ");
        }
        return str1;
    }
}

