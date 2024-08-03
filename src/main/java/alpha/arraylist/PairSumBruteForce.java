package alpha.arraylist;

import java.util.ArrayList;
import java.util.List;

public class PairSumBruteForce {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		int target = 9;
		System.out.println(getPairSum(list, target));

	}

	private static boolean getPairSum(List<Integer> list, int target) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) + list.get(j) == target) {
					return true;
				}
			}
		}
		return false;
	}
}
