package alpha.queue;

import java.util.Stack;

public class QueueWithTwoStacksDequeFocussed {

	static class Queue {
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();

		boolean isEmpty() {
			return s1.isEmpty();
		}

		void enque(int data) {
			s1.add(data);
		}

		int deque() {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			int data = s2.pop();
			while (!s2.isEmpty()) {
				s1.push(s2.pop());
			}
			return data;
		}
		
		int peek() {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			int data = s2.peek();
			while (!s2.isEmpty()) {
				s1.push(s2.pop());
			}
			return data;
		}
	}

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enque(1);
		q.enque(1);
		q.enque(1);
		while(!q.isEmpty()) {
			System.out.println(q.deque());
		}
	}

}
