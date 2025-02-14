package org.example;

import java.util.ArrayList;
import java.util.List;

public class UniversityService {

    public double calculateAvgGradeOfCourse(Course course) {
        List<Student> students = course.getStudents();
        if (students.isEmpty()) return 0.0;

        double totalGrade = 0.00;
        for(Student student : students) {
            totalGrade += student.getGrade();
        }
        return totalGrade/students.size();
    }

    public double calculateUniAvgGrade(University uni) {
        List<Course> courses = uni.courses();
        if (courses.isEmpty()) return 0.0;

        double totalGrade = 0.0;
        int totalStudents = 0;

        for (Course course : courses) {
            for (Student student : course.getStudents()) {
                totalGrade += student.getGrade();
                totalStudents++;
            }
        }
        return totalStudents == 0 ? 0.0 : totalGrade / totalStudents;
    }

    public List<Student> getStudentsWithMinGrade(University uni, double minGrade) {
        List<Student> qualifiedStudents = new ArrayList<>();

        for (Course course : uni.courses()) {
            for (Student student : course.getStudents()) {
                if (student.getGrade() >= minGrade) {
                    qualifiedStudents.add(student);
                }
            }
        }
        return qualifiedStudents;
    }
}
