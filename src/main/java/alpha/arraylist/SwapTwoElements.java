package alpha.arraylist;

import java.util.ArrayList;
import java.util.List;

public class SwapTwoElements {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(3);
		System.out.println(list);
		swap(1, 3, list);
		System.out.println(list);
	}

	private static void swap(int i, int j, List<Integer> list) {
		int temp = list.get(i);
		list.set(i,list.get(j));
		list.set(j,temp);
	}

}
