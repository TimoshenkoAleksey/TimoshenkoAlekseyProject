package com.aston.timoshenko.aleksey.homework1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class Course {
    private final String courseName;
    private final List<Student> students;

    public Course(String name, List<Student> students) {
        this.courseName = name;
        if (students != null) {
            this.students = students.stream().map(Student::new).collect(Collectors.toCollection(ArrayList::new));
        } else {
            this.students = new ArrayList<>();
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudents() {
        return students.stream().map(Student::new).toList();
    }
}
