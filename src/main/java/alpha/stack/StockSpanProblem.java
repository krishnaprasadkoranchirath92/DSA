package alpha.stack;

import java.util.Stack;

public class StockSpanProblem {

	public static void main(String[] args) {
		int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
		int span[] = new int[stocks.length];
		stockSpan(stocks, span);
		for(int sp : span) {
			System.out.println(sp);
		}
	}

	private static void stockSpan(int[] stocks, int[] span) {
		Stack<Integer> stack = new Stack<>();
		span[0] = 1;
		stack.push(0);
		for (int i = 1; i < stocks.length; i++) {
			int currPrice = stocks[i];
			while (!stack.isEmpty() && currPrice >= stocks[stack.peek()]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				span[i] = i + 1;
			} else {
				span[i] = i - stack.peek();
			}
			stack.push(i);
		}
	}

}
