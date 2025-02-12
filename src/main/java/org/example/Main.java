package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println("---- Task 1 ----");
        DaysOfWeek today = DaysOfWeek.WEDNESDAY;
        System.out.println(today.getWeekday());

        System.out.println("---- Task 2 ----");
        Person p1 = new Person("1", "Person1", DaysOfWeek.FRIDAY);
        Person p2 = new Person("2", "Person2", DaysOfWeek.MONDAY);
        Map<String, Person> peopleMap = new HashMap<>();
        peopleMap.put(p1.ID(), p1);
        peopleMap.put(p2.ID(), p2);
        PersonRepository people = new PersonRepository(peopleMap);
        Optional<Person> search1 = people.getPerson("3");
        if(search1.isPresent()) {
            System.out.println(search1.get().name() + "'s favorite day is " + search1.get().favoriteDay());
        }
        search1 = people.getPerson("1");
        if(search1.isPresent()) {
            System.out.println(search1.get().name() + "'s favorite day is " + search1.get().favoriteDay());
        }
    }
}