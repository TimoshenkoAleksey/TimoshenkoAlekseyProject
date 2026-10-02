package com.aston.timoshenko.aleksey.homework1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Course {
    private final String courseName;
    private final List<Student> students;

    public Course(String courseName, List<Student> students) {
        this.courseName = courseName;
        if (students != null) {
            this.students = students.stream().map(Student::new).toList();
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

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Course course)) return false;
        return Objects.equals(courseName, course.courseName) && Objects.equals(students, course.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, students);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", students=" + students +
                '}';
    }
}
