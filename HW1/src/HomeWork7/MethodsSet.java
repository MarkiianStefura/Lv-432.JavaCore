package HomeWork7;

import java.util.HashSet;
import java.util.Set;

public class MethodsSet {
	public Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> trnz = new HashSet<Integer>();
		trnz.addAll(set1);
		trnz.addAll(set2);
		return trnz;		
	}
	
	public Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> trnz = new HashSet<Integer>();
		trnz.addAll(set1);
		trnz.retainAll(set2);
		return trnz;		
	}
}
