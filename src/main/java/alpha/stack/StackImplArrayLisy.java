package alpha.stack;

import java.util.ArrayList;

public class StackImplArrayLisy {

	static class Stack {
		static ArrayList<Integer> list = new ArrayList<>();

		static boolean isEmpty() {
			return list.size() == 0;
		}

//		PUSH
		public static void push(int data) {
			list.add(data);
		}

//		POP
		public static int pop() {
			if (isEmpty()) {
				return -1;
			} 
			int top = list.get(list.size() - 1);
			list.remove(list.size() - 1);
			return top;
		}

//		PEEK

		public static int peek() {
			if (isEmpty()) {
				return -1;
			}
			return list.get(list.size() - 1);
		}

	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		while (!stack.isEmpty()) {
			System.out.println(stack.peek());
			stack.pop();
		}
//		System.out.println(stack.pop());
//		System.out.println(stack.peek());

	}
}
