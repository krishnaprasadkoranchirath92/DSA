package alpha.arraylist;

import java.util.ArrayList;
import java.util.List;

public class MultiDimentionalArrayList {

	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		List<Integer> l3 = new ArrayList<>();
//		l1.add(1);
//		l2.add(4);
//		l2.add(5);
//		l2.add(6);
//		l3.add(7);
//		l3.add(8);
//		l3.add(9);
		list.add(l1);
		list.add(l2);
		list.add(l3);
		for(int i=1;i<6;i++) {
			l1.add(i*1);
			l2.add(i*2);
			l3.add(i*3);
		}
		for (List<Integer> lst : list) {
			for (int i : lst) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println(list);
	}

}
