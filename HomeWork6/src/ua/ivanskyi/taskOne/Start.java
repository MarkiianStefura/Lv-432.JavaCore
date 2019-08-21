package ua.ivanskyi.taskOne;

import java.util.HashSet;
import java.util.Set;

public class Start {

	static void union(Set<Integer> set1, Set<Integer> set2) {

		set1.addAll(set2);

		System.out.println();
		for (Integer p : set1) {
			System.out.print(p + " ");
		}

	}

	static void intersect(Set<Integer> set1, Set<Integer> set2) {

		set1.retainAll(set2);

		System.out.println();
		for (Integer p : set1) {
			System.out.print(p + " ");
		}
	}

	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);

		set2.add(8);
		set2.add(7);
		set2.add(6);
		set2.add(5);

		for (Object p : set1) {
			System.out.print(p + " ");
		}
		System.out.println();

		for (Object p : set2) {
			System.out.print(p + " ");
		}

		// Start.union(set1, set2);
		Start.intersect(set1, set2);

	}

}
