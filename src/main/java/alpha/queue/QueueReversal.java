package alpha.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		reverseQueue(queue);
	}

	private static void reverseQueue(Queue<Integer> queue) {
		Stack<Integer> stack = new Stack<>();
		System.out.println(queue);
		while(!queue.isEmpty()) {
			stack.push(queue.remove());
		}
		while(!stack.isEmpty()) {
			queue.add(stack.pop());
		}
		System.out.println(queue);
	}
}
