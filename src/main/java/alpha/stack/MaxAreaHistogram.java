package alpha.stack;

import java.util.Stack;

public class MaxAreaHistogram {

	public static void main(String[] args) {
		int heights[] = { 2, 1, 5, 6, 2, 3 };
		System.out.println(maxArea(heights));

	}

	private static int maxArea(int[] arr) {
		int maxArea = 0;
		int nsl[] = new int[arr.length];
		int nsr[] = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		for (int i = arr.length - 1; i >= 0; i--) {
			while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				nsr[i] = arr.length;
			} else if (arr[stack.peek()] < arr[i]) {
				nsr[i] = stack.peek();
			}
			stack.push(i);
		}
		stack = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				nsl[i] = -1;
			} else if (arr[stack.peek()] < arr[i]) {
				nsl[i] = stack.peek();
			}
			stack.push(i);
		}
		for (int i = 0; i < arr.length; i++) {
			int h = arr[i];
			int w = nsr[i] - nsl[i] - 1;
			int a = h * w;
			maxArea = Math.max(maxArea, a);
		}

		return maxArea;

	}
}
