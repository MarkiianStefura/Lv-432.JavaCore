package com.company;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    private int course;
    private String name;

    public Student(int course, String name) {
        this.course = course;
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", name='" + name + '\'' +
                '}';
    }

    public static void printStudents(List<Student> students, Integer course) {
        Iterator iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = (Student)iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    static class NameComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    static class CourseComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getCourse() - o2.getCourse();
        }
    }
}
