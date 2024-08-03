package alpha.arraylist;

import java.util.ArrayList;
import java.util.List;

public class MaximumInArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(3);
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}
		System.out.println(max);

	}

}
