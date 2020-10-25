package com.rakovets.course.javabasics.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    void getConcatStringsTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals("HelloWorld", stringUtTest.getConcatStrings("Hello", "World"));
        Assertions.assertEquals("123456789", stringUtTest.getConcatStrings("12345", "6789"));
        Assertions.assertEquals(" Hello", stringUtTest.getConcatStrings(" ", "Hello"));
        Assertions.assertEquals("Hello ", stringUtTest.getConcatStrings("Hello", " "));
    }

    @Test
    void getIndexStringsTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals(0, stringUtTest.getindexStrings('H'));
        Assertions.assertEquals(-1, stringUtTest.getindexStrings('p'));
        Assertions.assertEquals(-1, stringUtTest.getindexStrings('.'));
        Assertions.assertEquals(4, stringUtTest.getindexStrings('o'));
    }

    @Test
    void getEqualsStringsTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals(true, stringUtTest.getEqualsStrings("Hello world", "Hello world"));
        Assertions.assertEquals(false, stringUtTest.getEqualsStrings("Hello world", "hello world"));
        Assertions.assertEquals(false, stringUtTest.getEqualsStrings("Hello world", "Helloo world"));
        Assertions.assertEquals(false, stringUtTest.getEqualsStrings("Hello world", "Hello world!"));
        Assertions.assertEquals(false, stringUtTest.getEqualsStrings("Hello world", "Hello  world"));
    }

    @Test
    void getTrimStringTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals("HELLO WORLD", stringUtTest.getTrimString(" Hello world "));
        Assertions.assertEquals("HELLO WORLD", stringUtTest.getTrimString(" HeLlO wOrLd "));
        Assertions.assertEquals("HELLO WORLD", stringUtTest.getTrimString(" hello WORLD "));
    }

    @Test
    void getExtractSubstringStringTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals("3rld 45", stringUtTest.getExtractSubstringString("H1ell2o wo3rld 45"));
        Assertions.assertEquals("98765321", stringUtTest.getExtractSubstringString("123456789098765321"));
        Assertions.assertEquals("6789 world0987653211111", stringUtTest.getExtractSubstringString("hello123456789 world098765321111111"));
    }

    @Test
    void getReplaceStringTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals("Hello world :)", stringUtTest.getReplaceString("Hello world :("));
        Assertions.assertEquals(":)", stringUtTest.getReplaceString(":("));
    }

    @Test
    void getStringWordTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals(true, stringUtTest.getStringWord("Hello world Hello","Hello"));
        Assertions.assertEquals(false, stringUtTest.getStringWord("Hello my beautiful world","Hello"));
        Assertions.assertEquals(false, stringUtTest.getStringWord("Hello my beautiful world Hello!","Hello"));
        Assertions.assertEquals(false, stringUtTest.getStringWord("Hello my beautiful world hello!","Hello"));
    }

    @Test
    void getArrayStringTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals(3, stringUtTest.getArrayString("Hello world"));
        Assertions.assertEquals(8, stringUtTest.getArrayString("Hello beautiful world"));
        Assertions.assertEquals(9, stringUtTest.getArrayString("Hello mY beaUtiful world"));
    }

    @Test
    void getArrayStringSimTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals(4, stringUtTest.getArrayStringSim("Hello world!!!!"));
        Assertions.assertEquals(3, stringUtTest.getArrayStringSim("Hello, beautiful, world!"));
        Assertions.assertEquals(11, stringUtTest.getArrayStringSim("Hello, beautiful, world...!!!!!!"));
    }

    @Test
    void getPalindromTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals(false, stringUtTest.getPalindrom("Hello world"));
        Assertions.assertEquals(false, stringUtTest.getPalindrom("Hello hello"));
        Assertions.assertEquals(true, stringUtTest.getPalindrom("Hello olleH"));
    }

    @Test
    void getNumbersOfWordsTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals(2, stringUtTest.getNumbersOfWords("Hello world"));
        Assertions.assertEquals(2, stringUtTest.getNumbersOfWords("Hello  world"));
        Assertions.assertEquals(3, stringUtTest.getNumbersOfWords("Hello  my   world"));
    }

    @Test
    void getFioTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals("E.I.A.", stringUtTest.getFio("Ersh Iryna Aleksandrovna"));
        Assertions.assertEquals("P.V.V.", stringUtTest.getFio("Putin Vladimir Vladimirovich"));
        Assertions.assertEquals("Z.V.A.", stringUtTest.getFio("Zelenski Vladimir Aleksandrovich"));
    }

    @Test
    void getStringDigitsTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals("125", stringUtTest.getStringDigits("Hello1wo2rld5"));
        Assertions.assertEquals("234566", stringUtTest.getStringDigits("234566world"));
        Assertions.assertEquals("00", stringUtTest.getStringDigits("Hello  my 00  world"));
    }

    @Test
    void getNotRepeatingTest() {
        StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals("h e w r d", stringUtTest.getNotRepeating("hello", "world"));
    }
}



