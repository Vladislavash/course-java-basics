package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersionTest {
    private static Persian persion;

    @Test
    void persianTest() {
        Persian persian = new Persian("Kill");
        Assertions.assertEquals("Kill", persian.getName());
        Assertions.assertEquals("MeeeeeYYYY", persian.mew());
        Assertions.assertEquals("ppppRRRRPppp", persian.purr());
    }
}