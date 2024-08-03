package alpha.arraylist;

import java.util.ArrayList;
import java.util.List;

public class PairSumTwoPointer {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		int target = 3;
		getPairSum(list, target);

	}

	private static void getPairSum(List<Integer> list, int target) {
		int lp = 0;
		int rp = list.size() - 1;
		boolean found = false;
		while (lp < rp) {
			int sum = list.get(lp) + list.get(rp);  
			if (sum == target) {
				System.out.println(lp + ", " + rp);
				found = true;
				break;
			} else if (sum < target) {
				lp++;
			} else {
				rp--;
			}
		}
		if (!found) {
			System.out.println("Pairs not found!");
		}
	}
}
