package alpha.stack;

import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		String str = "abcd";
		System.out.println(reverseStr(str));
	}

	private static String reverseStr(String str) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			sb.append(stack.pop());
		}
		return sb.toString();

	}
}
