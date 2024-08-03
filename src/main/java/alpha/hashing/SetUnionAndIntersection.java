package alpha.hashing;

import java.util.HashSet;
import java.util.Set;

public class SetUnionAndIntersection {

	public static void main(String[] args) {
		int arr1[] = { 7, 3, 9 };
		int arr2[] = { 6, 9, 9, 2, 9, 4, 3 };
		Set<Integer> union = new HashSet<>();
		Set<Integer> intersection = new HashSet<>();
		Set<Integer> intrsct = new HashSet<>();
		for (int i : arr1) {
			union.add(i);
			intersection.add(i);
		}
		for (int i : arr2) {
			union.add(i);
			if (intersection.contains(i)) {
				intrsct.add(i);
				intersection.remove(i);
			}
		}
		System.out.println(union);
		System.out.println(intrsct);
	}
}
