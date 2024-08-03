package alpha.queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeTest {
	
	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedList<>();
		deque.addFirst(1);
		deque.addLast(2);
		deque.getFirst();
		deque.getLast();
		deque.add(3);
		deque.remove();
		System.out.println(deque);
//		deque.removeLast();
//		deque.removeFirst();
	}

}
