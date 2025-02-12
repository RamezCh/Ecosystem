package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println("---- Task 1 ----");
        DaysOfWeek today = DaysOfWeek.WEDNESDAY;
        System.out.println(today.getWeekday());

        System.out.println("---- Task 2 ----");
        Person p1 = new Person("1", "Person1", Gender.MALE, DaysOfWeek.FRIDAY);
        Person p2 = new Person("2", "Person2", Gender.MALE, DaysOfWeek.MONDAY);
        Map<String, Person> peopleMap = new HashMap<>();
        peopleMap.put(p1.ID(), p1);
        peopleMap.put(p2.ID(), p2);
        PersonRepository people = new PersonRepository(peopleMap);
        Optional<Person> search1 = people.getPerson("3");
        search1.ifPresent(person -> System.out.println(person.name() + "'s favorite day is " + person.favoriteDay()));
        search1 = people.getPerson("1");
        search1.ifPresent(person -> System.out.println(person.name() + "'s favorite day is " + person.favoriteDay()));
        System.out.println("---- Task 3 ----");
        people.genderCount();
        System.out.println("---- Task 4 ----");
        System.out.println(people.getPersonByName("Person1"));
        System.out.println(people.getPersonByName("Person3"));
        System.out.println("---- Task 5 ----");
        List<Person> fridayLovers = people.getPeopleByFavDay(DaysOfWeek.FRIDAY);
        System.out.println(fridayLovers);
        Person p3 = new Person("3", "Person3", Gender.MALE, DaysOfWeek.FRIDAY);
        people.add(p3);
        fridayLovers = people.getPeopleByFavDay(DaysOfWeek.FRIDAY);
        System.out.println(fridayLovers);
    }
}