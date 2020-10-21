package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SiameseTest {
    private static Siamese siamese;

    @Test
    void siameseTest() {
        Siamese siamese = new Siamese("Kill");
        Assertions.assertEquals("Kill", siamese.getName());
        Assertions.assertEquals("MAAAAAAAAYYYYYY", siamese.mew());
        Assertions.assertEquals("PUPUPPUPUPUPUPUR", siamese.purr());
    }
}
