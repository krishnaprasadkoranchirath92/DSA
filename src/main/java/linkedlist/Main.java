package linkedlist;

import java.util.LinkedList;

public class Main {
	
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		
		CLL list = new CLL();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.delete(3);
		list.display();
		
		
		
//		list.insertFirst(1);
//		list.insertFirst(2);
//		list.insertFirst(3);
//		list.insertLast(84);
////		list.display();
//		list.insert(7, 2);
////		System.out.println("After insert :");
//		list.display();
//		System.out.println();
//		list.insertAfter(84, 18);
//		list.display();
////		list.insert(99, 1);
//		System.out.println("tail"+list.tail);
//		list.display();
//		System.out.println(list.deleteLast());
//		list.display();
//		System.out.println(list.delete(0));
//		list.display();
//		System.out.println(list.find(99));
	}

}