package com.rakovets.course.java.core.practice.oop_principles.cat_home;

public class Sphynx extends Cat {
    @Override
    public String mew() {
        return "My name is Sphynx!";
    }

    @Override
    public String mew(Person person) {
        person.changeHappiness(-20);
        return "Mew - Mew!";
    }

    @Override
    public String purr() {
        return "RRRRRRRRR!";
    }

    @Override
    public String purr(Person person) {
        person.changeHappiness(+20);
        return "MrrMrrM!";
    }
}
