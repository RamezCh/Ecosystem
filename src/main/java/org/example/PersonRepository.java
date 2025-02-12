package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PersonRepository {
    Map<String, Person> people;

    public PersonRepository(Map<String, Person> people) {
        this.people = people;
    }

    public Optional<Person> getPerson(String ID) {
        return Optional.ofNullable(people.get(ID));
    }
}
