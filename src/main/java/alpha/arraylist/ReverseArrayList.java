package alpha.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		for(int i=list.size()-1; i>=0;i--) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
	}
}
