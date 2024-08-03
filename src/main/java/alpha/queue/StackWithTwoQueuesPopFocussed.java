package alpha.queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackWithTwoQueuesPopFocussed {

	static class Stack {
		static Queue<Integer> q1 = new LinkedList<>();
		static Queue<Integer> q2 = new LinkedList<>();

		public static boolean isEmpty() {
			return q1.isEmpty() && q2.isEmpty();
		}

		public static void push(int data) {
			if (!q1.isEmpty()) {
				q1.add(data);
			} else {
				q2.add(data);
			}
		}

		public static int pop() {
			int data = -1;
			if (isEmpty()) {
				System.out.println("Stack is Empty!");
				return data;
			}
			if (!q1.isEmpty()) {
				while (!q1.isEmpty()) {
					data = q1.remove();
					if (q1.isEmpty()) {
						break;
					}
					q2.add(data);
				}
			} else {
				while (!q2.isEmpty()) {
					data = q2.remove();
					if (q2.isEmpty()) {
						break;
					}
					q1.add(data);
				}
			}
			return data;
		}

		public static int peek() {
			int data = -1;
			if (!q1.isEmpty()) {
				while (!q1.isEmpty()) {
					data = q1.remove();
					q2.add(data);
				}
			} else {
				while (!q2.isEmpty()) {
					data = q2.remove();
					q1.add(data);
				}
			}
			return data;
		}
	}

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		while (!s.isEmpty()) {
			System.out.print(s.peek() + " ");
			s.pop();
		}
	}
}
