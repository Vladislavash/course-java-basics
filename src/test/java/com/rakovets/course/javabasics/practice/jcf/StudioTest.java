package com.rakovets.course.javabasics.practice.jcf;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class StudioTest {
    @Test
    void actorTest() {
        ArrayList<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Джорш", "Буш", 5, 10));
        actors.add(new Actor("Луи", "Кен", 55, 20));
        actors.add(new Actor("Майкл", "Джексон", 555, 30));
        Studio studio = new Studio(actors);
        actors.sort(Studio.fee);
        assertEquals("555 55 5", studio.getFees());
        actors.sort(Studio.age);
        assertEquals("10 20 30", studio.getAges());
        actors.sort(Studio.lastName);
        assertEquals("Буш Джексон Кен", studio.getLastNames());
        actors.sort(Studio.lastNameAndAge);
        assertEquals("Буш Джексон Кен", studio.getLastNames());
        assertEquals("10 30 20", studio.getAges());
        actors.sort(Studio.feeAndLastName);
        assertEquals("555 55 5", studio.getFees());
        assertEquals("Джексон Кен Буш", studio.getLastNames());
        studio.fire();
        assertEquals("55 5", studio.getFees());
    }
}