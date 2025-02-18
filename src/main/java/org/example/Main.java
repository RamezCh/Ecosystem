package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student kevin = new Student("1", "Kevin", "Deutschland", 80);
        Student nivek = new Student();
        Teacher florian = new Teacher("1", "Florian", "java");
        List<Student> students = List.of(kevin, nivek);
        Course java = new Course("1", "java", florian, students);
        System.out.println(java.getId());
        System.out.println(java.getName());
        System.out.println(java.getTeacher());
        System.out.println(java.getStudents());
        System.out.println(java);
        System.out.println(kevin.getName());
        System.out.println(kevin.getAddress());
        System.out.println(kevin);

        Teacher martin = florian.withId("2").withName("Martin");
        System.out.println(martin);

        Student builder = Student.builder()
                .id("3").name("builder")
                .address("Builder Town")
                .grade(60).build();
        System.out.println(builder);
        System.out.println(builder.getAddress());

        University uni = new University("1", "uni", List.of(java));
        UniversityService service = new UniversityService();
        System.out.println(service.calculateAvgGradeOfCourse(java));
        System.out.println(service.calculateUniAvgGrade(uni));
        System.out.println(service.getStudentsWithMinGrade(uni, 80));
        System.out.println(service.getStudentsWithMinGrade(uni, 81));
        /*
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
        System.out.println("---- Task 6 ----");
        List<Integer> intList = new ArrayList<>();
        for(int i = 0 ; i < 13 ; i++) {
            intList.add(i);
        }
        intList.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
        System.out.println("---- Task 7 ----");
        intList.stream().map(num -> num * 2).forEach(System.out::println);
        intList.stream()
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .forEach(System.out::println);
        System.out.println("---- Task 8 ----");
        intList.stream()
                .sorted() // Sort in ascending order (natural order)
                .forEach(System.out::println);
        int sum = intList.stream().reduce(0, Integer::sum);
        System.out.println("Sum of all numbers: " + sum);

        List<Integer> processedList = intList.stream()
                .map(num -> num * 2)
                .toList();
        System.out.println("Processed list: " + processedList);
        */
    }
}