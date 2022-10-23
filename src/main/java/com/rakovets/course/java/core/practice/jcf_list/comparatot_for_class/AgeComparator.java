package com.rakovets.course.java.core.practice.jcf_list.comparatot_for_class;

import com.rakovets.course.java.core.practice.jcf_list.life_of_class.Person;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}