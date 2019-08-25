package HomeWork7;

import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Student {
	private String name;
	private int course;


	public Student(String name, int course) {		
		this.name = name;
		this.course = course;
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
	public void setCourse(int course) {
		this.course = course;
	}
	public static void print(List<Student> studens, int course) {
		System.out.println("Students at "+course+" course:");
		ListIterator<Student> listIterator = studens.listIterator();
		Student student;
		while (listIterator.hasNext()) {
			student = listIterator.next();
			if (student.getCourse()==course) {
				System.out.println(student.getName());
			}
		} 
	}
	static class NameComparator implements Comparator<Student>{
		@Override
		public int compare(Student s1, Student s2) {			
			return s1.getName().compareTo(s2.getName());
		}
	}
	static class CourseComparator implements Comparator<Student>{
		@Override
		public int compare(Student s1, Student s2) {			
			return s1.getCourse()-s2.getCourse() ;
		}
		
	}
}


