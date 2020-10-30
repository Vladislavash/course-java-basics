package com.rakovets.course.javabasics.practice.jcf;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TextMonitoringTest {

    @Test
    void MonitoringTextTest() {
        String text = "Hello my beautiful world Hello";
        TextMonitoring textMonitoring = new TextMonitoring();
        textMonitoring.researchText(text);
        assertEquals(4, textMonitoring.getCountUniqueWords());
        assertEquals(2, textMonitoring.get("Hello"));
        assertEquals("[beautiful, world, Hello, my]", textMonitoring.getUniqueWords().toString());
        assertEquals("{beautiful=1, world=1, my=1, Hello=2}", textMonitoring.getWordFrequencyDesc(true).toString());
    }
}

