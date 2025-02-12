package org.example;

import java.util.*;

public class PersonRepository {
    Map<String, Person> people;

    public PersonRepository(Map<String, Person> people) {
        this.people = people;
    }

    public Optional<Person> getPerson(String ID) {
        return Optional.ofNullable(people.get(ID));
    }

    public void add(Person person) {
        if(person != null) {
            people.put(person.ID(), person);
            System.out.println("Successfully added " + person);
        } else {
            System.out.println("The provided person object is null, please check it.");
        }
    }

    public void genderCount() {
        int males = 0;
        int females = 0;
        for(Person person : people.values()) {
            if(person.gender() == Gender.MALE) {
                males++;
            }
            else {
                females++;
            }
        }
        System.out.println("There are " + males + " males and " + females + " females");
    }

    public Optional<Person> getPersonByName(String name) {
        for(Person person : people.values()) {
            if(person.name().equals(name)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    public List<Person> getPeopleByFavDay(DaysOfWeek day) {
        List<Person> people = new ArrayList<>();
        for(Person person : this.people.values()) {
            if(person.favoriteDay() == day) {
               people.add(person);
            }
        }
        return people;
    }
}
