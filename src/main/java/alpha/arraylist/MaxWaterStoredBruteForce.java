package alpha.arraylist;

import java.util.ArrayList;
import java.util.List;

public class MaxWaterStoredBruteForce {

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
		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				int width = j - i;
				int height = Math.min(list.get(i), list.get(j));
				int waterStored = width*height;
				max = Math.max(waterStored, max);
			}
		}
		return max;
	}

}
