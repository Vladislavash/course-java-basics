package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task3M {
    private int age;
    private boolean death;

    public Task3M (int age, boolean death) {
        this.age = age;
        this.death = death;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getDeath() {
        return death;
    }

    public void setDeath(boolean death) {
        this.death = death;
    }
    public static class PersonLife extends Exception {
    }

    public void getLife(int age) throws PersonLife {
        if (death && age >= 100) {
            throw new PersonLife();
        } else {
            this.age = age;
            System.out.println("Person is alive.His age is" + " " + age);
        }
    }
}
