package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Student6"));
        students.add(new Student(2, "Student3"));
        students.add(new Student(3, "Student4"));
        students.add(new Student(4, "Student8"));
        students.add(new Student(5, "Student1"));

        int course = 5;
        System.out.println("Students on " + course + " course :");
        Student.printStudents(students,course);

        System.out.println("Ordered by name");
        students.sort(new Student.NameComparator());
        System.out.println(Arrays.toString(students.toArray()));

        System.out.println("Ordered by course");
        students.sort(new Student.CourseComparator());
        students.forEach(System.out::println);

    }


}

