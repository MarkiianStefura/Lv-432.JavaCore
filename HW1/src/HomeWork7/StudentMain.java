package HomeWork7;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {		
		List<Student> studentsList = new ArrayList<Student>(); 
		studentsList.add(new Student("Natasha", 2));
		studentsList.add(new Student("Stepan", 4));
		studentsList.add(new Student("Vova", 2));
		studentsList.add(new Student("Petro", 3));
		studentsList.add(new Student("Sasha", 1));
		
		Student.print(studentsList, 2);	
		System.out.println("-------------------------------");
		studentsList.sort(new Student.NameComparator());		
		for (Student student : studentsList) {
			System.out.println("Name : "+student.getName()+" cource = "+student.getCourse());
		}
		System.out.println("-------------------------------");
		studentsList.sort(new Student.CourseComparator());
		for (Student student : studentsList) {
			System.out.println("Name : "+student.getName()+" cource = "+student.getCourse());
		}
	}

}
