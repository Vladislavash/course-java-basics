package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "MeeeeeYYYY";
    }

    @Override
    public String purr() {
        return "ppppRRRRPppp";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-2);
    }

    @Override
    public void purr(Person person) {
        person. changeHappiness(8);
    }
}

