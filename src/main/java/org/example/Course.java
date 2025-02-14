package org.example;

import lombok.Value;
import java.util.List;

@Value
public class Course {
    String id, name;
    Teacher teacher;
    List<Student> students;
}
