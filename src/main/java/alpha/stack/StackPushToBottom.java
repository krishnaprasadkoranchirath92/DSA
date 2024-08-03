package alpha.stack;

import java.util.Stack;

public class StackPushToBottom {

	private static void printStack(Stack<Integer> stack) {
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

	private static void pushToBottom(Stack<Integer> stack, int ele) {
		if (stack.isEmpty()) {
			stack.push(ele);
			return;
		}
		int top = stack.pop();
		pushToBottom(stack, ele);
		stack.push(top);
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		pushToBottom(stack, 0);
		printStack(stack);
	}

}
