package alpha.stack;

import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		reverseStack(stack);
		printStack(stack);
	}

	private static void reverseStack(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}
		int top = stack.pop();
		reverseStack(stack);
		pushToBottom(stack, top);
	}

	private static void pushToBottom(Stack<Integer> stack, int top) {
		if(stack.isEmpty()) {
			stack.push(top);
			return;
		}
		int t = stack.pop();
		pushToBottom(stack, top);
		stack.push(t);
	}

	private static void printStack(Stack<Integer> stack) {
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}
