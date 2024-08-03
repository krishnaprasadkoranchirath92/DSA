package alpha.stack;

import java.util.Stack;

public class ParanthesesValidityCheck {

	public static void main(String[] args) {
		String str = "{()}";
		boolean op = isValid(str);
		System.out.println(op);
	}

	private static boolean isValid(String str) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '{' || ch == '[' || ch == '(') {
				stack.push(ch);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				if ((ch == '}' && stack.peek() == '{') || (ch == ']' && stack.peek() == '[')
						|| (ch == ')' && stack.peek() == '(')) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		if (stack.isEmpty()) {
			return true;
		}
		return false;
	}

}
