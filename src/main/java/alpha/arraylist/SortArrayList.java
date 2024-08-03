package alpha.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(1);
		list.add(6);
		list.add(3);
		Collections.sort(list);
		System.out.println(list);
		Comparator c = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return 0;
			}
		};
		Collections.sort(list, Collections.reverseOrder());
		Collections.sort(list, c);
		System.out.println(list);
	}

}
