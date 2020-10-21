package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Miu";
    }

    @Override
    public String purr() {
        return "rprprprprrpr";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-8);
    }

    @Override
    public void purr(Person person) {
        person. changeHappiness(7);
    }
}
