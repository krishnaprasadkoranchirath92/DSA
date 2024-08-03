package alpha.queue;

import java.util.LinkedList;
import java.util.Queue;

public class InterleaveTwoHalvesOfQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		interleave(queue);
	}

	private static void interleave(Queue<Integer> queue) {
		int size = queue.size();
		Queue<Integer> first = new LinkedList<>();
		for(int i=0; i< size/2;i++) {
			first.add(queue.remove());
		}
		for(int i=0; i<size/2;i++) {
			queue.add(first.remove());
			queue.add(queue.remove());
		}
		System.out.println(queue);
		
	}
}
