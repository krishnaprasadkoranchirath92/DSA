package alpha.queue;

import java.util.Deque;
import java.util.LinkedList;

public class StackandQueueWithDeque {

	static class Stack {
		Deque<Integer> deque = new LinkedList<>();
		
		boolean isEmpty() {
			return deque.isEmpty();
		}

		void push(int data) {
			deque.addLast(data);
		}

		int pop() {
			return deque.removeLast();
		}

		int peek() {
			return deque.getLast();
		}

	}

	static class Queue {
		Deque<Integer> deque = new LinkedList<>();

		boolean isEmpty() {
			return deque.isEmpty();
		}
		void add(int data) {
			deque.addLast(data);
		}

		int remove() {
			return deque.removeFirst();
		}

		int peek() {
			return deque.getFirst();
		}
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		while(!stack.isEmpty()) {
			System.out.print(stack.peek()+" ");
			stack.pop();
		}
		System.out.println();
		Queue queue = new Queue();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		while(!queue.isEmpty()) {
			System.out.print(queue.peek()+ " ");
			queue.remove();
		}
	}

}
