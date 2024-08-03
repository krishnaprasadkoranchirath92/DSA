package alpha.arraylist;

import java.util.ArrayList;
import java.util.List;

public class PairSumSortedRotated {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(1);
		list.add(2);
		list.add(3);

		int target = 115;
		if (getPairSum(list, target)) {
			System.out.println("Found!");
		} else {
			System.out.println("Not Found!");
		}

	}

	private static boolean getPairSum(List<Integer> list, int target) {
		int lp = -1, rp = -1;
		int size = list.size();
		for (int i = 0; i < size; i++) {
			if (list.get(i) > list.get(i + 1)) {
				rp = i;
				lp = i + 1;
				break;
			}
		}
		while (rp != lp) {
			if (list.get(lp) + list.get(rp) == target) {
				System.out.println(lp + ", " + rp);
				return true;
			} else if (list.get(lp) + list.get(rp) < target) {
				lp = (lp + 1) % size;
			} else {
				rp = (rp - 1) % size;
			}
		}

		return false;
	}

}
