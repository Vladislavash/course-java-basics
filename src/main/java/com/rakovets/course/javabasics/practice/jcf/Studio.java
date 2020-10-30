package com.rakovets.course.javabasics.practice.jcf;

import java.util.ArrayList;
import java.util.Comparator;

public class Studio {
    private ArrayList<Actor> actors;
    public Studio(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    public static Comparator<? super Actor> fee = new Comparator<Actor>() {
        @Override
        public int compare(Actor act, Actor act1) {
            return (int)(act1.getFee() - act.getFee());
        }
    };

    public static Comparator<? super Actor> lastName = new Comparator<Actor>() {
        @Override
        public int compare(Actor act, Actor act1) {
            return act.getLastName().compareTo(act1.getLastName());
        }
    };

    public static Comparator<? super Actor> age = new Comparator<Actor>() {
        @Override
        public int compare(Actor act, Actor act1) {
            return act.getAge() - (act1.getAge());
        }
    };

    public static Comparator<? super Actor> lastNameAndAge = new Comparator<Actor>() {
        @Override
        public int compare(Actor act, Actor act1) {
            if (act.getLastName().compareTo(act1.getLastName()) != 0)
                return act.getLastName().compareTo(act1.getLastName());
            else return act.getAge() - (act1.getAge());
        }
    };

    public static Comparator<? super Actor> feeAndLastName = new Comparator<Actor>() {
        @Override
        public int compare(Actor act, Actor act1) {
            if (act1.getFee() - act.getFee() != 0)
                return (int)(act1.getFee() - act.getFee());
            else return act.getLastName().compareTo(act1.getLastName());
        }
    };

    public void fire() {
        actors.sort(fee);
        actors.remove(0);
    }

    public String getFirstNames() {
        String result = "";
        for (Actor actor : actors) {
            result += actor.getFirstName() + " ";
        }
        return result.trim();
    }

    public String getLastNames() {
        String result = "";
        for (Actor actor : actors) {
            result += actor.getLastName() + " ";
        }
        return result.trim();
    }

    public String getFees() {
        String result = "";
        for (Actor actor : actors) {
            result += actor.getFee() + " ";
        }
        return result.trim();
    }

    public String getAges() {
        String result = "";
        for (Actor actor : actors) {
            result += actor.getAge() + " ";
        }
        return result.trim();
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }
}