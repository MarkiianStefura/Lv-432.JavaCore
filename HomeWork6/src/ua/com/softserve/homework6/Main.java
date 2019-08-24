package ua.com.softserve.homework6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Student> student = new ArrayList<Student>();
        student.add(new Student("George", 1));
        student.add(new Student("John", 5));
        student.add(new Student("David", 6));
        student.add(new Student("Andre", 3));
        student.add(new Student("Omar", 3));

        Student.printStudents(student, 1);
        student.sort(Student.getNameComparator());
        System.out.println(student);
        student.sort(Student.getCourseComparator());
        System.out.println(student);

    }
}
