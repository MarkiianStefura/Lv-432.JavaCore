package ua.ivanskyi.taskThree;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {

	private String name;
	private Integer course;

	public Student(String name, Integer course) {
		super();
		this.name = name;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCourse() {
		return course;
	}

	public void setCourse(Integer course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

	public void printStudents(List<Student> student, Integer course) {

		Iterator<Student> itr = student.iterator();

		while (itr.hasNext()) {
			Student check = itr.next();
			if (check.course.equals(course)) {
				System.out.println(check.toString());
			}

		}

	}

	public class NameComparator implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {

			return o1.name.compareTo(o2.name);
		}

	}

	public class CourseComparator implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {

			return o1.course - o2.course;
		}

	}

	public List<Student> sortByName(List<Student> list) {

		list.sort(new NameComparator());

		return list;

	}

	public List<Student> sortByCourse(List<Student> list) {

		list.sort(new CourseComparator());

		return list;

	}

}
