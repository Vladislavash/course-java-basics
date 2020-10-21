package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    private static Person person;

    @Test
    void personTest() {
        Person person = new Person(29);
        Assertions.assertEquals(31, person.changeHappiness(2));
    }
}
