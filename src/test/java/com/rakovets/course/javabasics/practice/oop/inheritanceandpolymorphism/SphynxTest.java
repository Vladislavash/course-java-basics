package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SphynxTest {
    private static Sphynx sphynx;

    @Test
    void siameseTest() {
        Sphynx sphynx = new Sphynx("Kill");
        Assertions.assertEquals("Kill", sphynx.getName());
        Assertions.assertEquals("Miu", sphynx.mew());
        Assertions.assertEquals("rprprprprrpr", sphynx.purr());
    }
}
