package ua.com.softserve.homework6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Student {

    private String name;
    private Integer course;
    private static List<Student> students1 = new ArrayList<Student>();
    private static NameCompare nameComp = new NameCompare();
    private static CourseCompare courseComp = new CourseCompare();

    public static void printStudents(List<Student> students, Integer course) {
        ListIterator<Student> list = students.listIterator();

        while (list.hasNext()) {
            Student element = (Student) list.next();
            if (element.course.equals(course)) {
                students1.add(element);
            }

        }
        if (students1.isEmpty()) {
            System.out.println("No such course number :(");
        } else {
            System.out.println(students1);
        }
    }

    public Student() {
    }

    public Student(String name, Integer course) {
        this.setName(name);
        this.setCourse(course);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public void setCourse(Integer course) {
        this.course = course;

    }

    public static Comparator<Student> getNameComparator() {
        return nameComp;
    }

    public static Comparator<Student> getCourseComparator() {
        return courseComp;
    }

    static class NameCompare implements Comparator<Student> {

        @Override
        public int compare(Student s1, Student s2) {
            return s1.getName().compareTo(s2.getName());
        }
    }

    static class CourseCompare implements Comparator<Student> {

        @Override
        public int compare(Student s1, Student s2) {
            return s1.getCourse() - s2.getCourse();
        }

    }
}