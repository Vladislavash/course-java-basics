package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task5M {
    private int age;

    public Task5M (int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public class PersonLife extends Exception {
        public PersonLife(String message) {
            super(message);
        }
    }

    public void getLife() throws Task5M.PersonLife {
        try {
            if (age >= 100) {
                throw new PersonLife("Person is died");
            }
            System.out.println(age);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
            throw new PersonLife(e.getMessage());
        }
    }
}
