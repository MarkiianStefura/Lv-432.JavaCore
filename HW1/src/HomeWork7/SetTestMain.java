package HomeWork7;

import java.util.HashSet;
import java.util.Set;

public class SetTestMain {

	public static void main(String[] args) {
		MethodsSet methodsSet = new MethodsSet();
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		set1.add(1);
		set1.add(5);
		set1.add(3);
		
		set2.add(4);
		set2.add(2);
		set2.add(5);
		set2.add(3);
		System.out.println("Set1 = " + set1 +" Set2 = "+set2);
		System.out.println(methodsSet.union(set1, set2));
		System.out.println(methodsSet.intersect(set1, set2));
	}

}
