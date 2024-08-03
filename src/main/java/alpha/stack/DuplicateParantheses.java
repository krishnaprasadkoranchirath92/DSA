package alpha.stack;

import java.util.Stack;

public class DuplicateParantheses {

	public static void main(String[] args) {
		String str = "((a+b)+c)";
		boolean op = isParanthesesDuplicate(str);
		System.out.println(op);
	}

	private static boolean isParanthesesDuplicate(String str) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == ')') {
				int count = 0;
				while (stack.pop() != '(') {
					count++;
				}
				if (count == 0) {
					return true;
				}
			} else {
				stack.push(ch);
			}
		}
		return false;
	}

}
