package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task4M {
    private int age;
    private boolean death;

    public Task4M (int age, boolean death) {
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
    public class PersonLife extends RuntimeException {
        public PersonLife(String message) {
            super(message);
        }
    }

    public void getLife(int age) throws Task4M.PersonLife {
        if (death && age >= 100) {
            throw new Task4M.PersonLife("Person is dead");
        } else {
            this.age = age;
            System.out.println("Person is alive.His age is" + " " + age);
        }
    }
}

