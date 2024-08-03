package alpha.hashing;

import java.util.HashSet;
import java.util.Set;

public class SetCountDistinctElements {
public static void main(String[] args) {
	int[] arr = {4,2,5,3,5,4,4,1,4,1,4};
	Set<Integer> set = new HashSet<>();
	for(int i : arr) {
		set.add(i);
	}
	System.out.println(set);
	System.out.println(set.size());
	
}
}
