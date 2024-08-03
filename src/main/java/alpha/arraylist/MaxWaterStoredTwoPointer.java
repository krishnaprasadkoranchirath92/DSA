package alpha.arraylist;

import java.util.ArrayList;
import java.util.List;

public class MaxWaterStoredTwoPointer {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(8);
		list.add(6);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(8);
		list.add(3);
		list.add(7);

		int waterStored = getMaxWaterStored(list);
		System.out.println(waterStored);
	}

	private static int getMaxWaterStored(List<Integer> list) {
		int lp = 0;
		int rp = list.size() - 1;
		int max = 0;
		while (lp < rp) {
			int waterStored = Math.min(list.get(lp), list.get(rp)) * (rp - lp);
			max = Math.max(max, waterStored);
			if (lp < rp) {
				lp++;
			} else {
				rp++;
			}
		}
		return max;
	}

}
