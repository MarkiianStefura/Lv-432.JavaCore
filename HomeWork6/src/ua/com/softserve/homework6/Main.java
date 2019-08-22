package ua.com.softserve.homework6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        List<Student> student = new ArrayList<Student>();
        student.add(new Student("George", 1));
        student.add(new Student("John", 5));
        student.add(new Student("David", 6));
        student.add(new Student("Andre", 3));
        student.add(new Student("Omar", 3));

        Student.printStudents(student, a);
        student.sort(Student.getNameComparator());
        System.out.println(student);
        student.sort(Student.getCourseComparator());
        System.out.println(student);

    }
}
