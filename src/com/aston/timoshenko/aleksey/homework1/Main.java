package com.aston.timoshenko.aleksey.homework1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Piter Parker", 30));
        students.add(new Student("Garri Potter", 10));
        students.add(new Student("Donald J. Tramp", 80));
        Course course = new Course("Programming and make Amerika grate again", students);
        System.out.println("Внутренняя коллекция, сразу после создания объекта:");
        for (Student student : course.getStudents()) {
            System.out.println(student);
        }
        // меняю коллекцию, которую передал в конструктор и проверяю,
        // отразились ли изменения на коллекцию внутри объекта course
        System.out.println("\nВнутренняя коллекция, после изменения внешней коллекции");
        students.add(new Student("John Doе", 100));
        for (Student student : course.getStudents()) {
            System.out.println(student);
        }
        // запрашиваю коллекцию из course и пытаюсь, через то, что вернулось, изменить внутреннюю коллекцию
        List<Student> newStudents = course.getStudents();
        try {
            newStudents.add(new Student("John Doе", 100));
        } catch (UnsupportedOperationException e) {
            System.out.println("\nТакие операции с коллекцией не поддерживаются!");
        } catch (Exception e) {
            System.out.println("\nНепредвиденная ситуация");
        }
        System.out.println("\nВнутренняя коллекция, после попытки изменения полученной из геттера коллекции");
        for (Student student : course.getStudents()) {
            System.out.println(student);
        }
    }
}
