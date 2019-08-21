package ua.ivanskyi.taskThree;

import java.util.ArrayList;
import java.util.List;

public class Start {

	static void print(List<Student> list) {
		for (Student st : list) {

			System.out.println(st.getName() + " " + st.getCourse());

		}
		System.out.println();

	}

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		list.add(new Student("orest", 3));
		list.add(new Student("andriy", 3));
		list.add(new Student("oleh", 4));
		list.add(new Student("anna", 1));
		list.add(new Student("nazar", 2));
		list.add(new Student("olja", 4));

		Start.print(list);

		list.get(0).printStudents(list, 3);
		System.out.println();

		list.get(0).sortByName(list);
		Start.print(list);

		list.get(0).sortByCourse(list);
		Start.print(list);

	}

}
