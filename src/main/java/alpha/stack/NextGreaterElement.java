package alpha.stack;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		int arr[] = { 6, 8, 0, 1, 3 };
		int nxtGreater[] = new int[arr.length];
		nextGreaterToRight(arr, nxtGreater);
		System.out.println();
		nextGreaterToLeft(arr, new int[arr.length]);
		System.out.println();
		nextLesserToLeft(arr, new int[arr.length]);
		System.out.println();
		nextLesserToRight(arr, new int[arr.length]);
	}

	private static void nextLesserToRight(int[] arr, int[] nxtLesser) { // {0,0,-1,-1,-1}
		Stack<Integer> stack = new Stack<>();
		for (int i = arr.length - 1; i >= 0; i--) {
			while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				nxtLesser[i] = -1;
			} else {
				nxtLesser[i] = arr[stack.peek()];
			}
			stack.push(i);
		}
		for (int n : nxtLesser) {
			System.out.print(n + " ");
		}
	}

	private static void nextLesserToLeft(int[] arr, int[] nxtLesser) { // {-1, 6, -1, 0, 1}
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < arr.length; i++) {
			while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				nxtLesser[i] = -1;
			} else {
				nxtLesser[i] = arr[stack.peek()];
			}
			stack.push(i);
		}
		for (int n : nxtLesser) {
			System.out.print(n + " ");
		}
	}

	private static void nextGreaterToLeft(int[] arr, int[] nxtGreater) { // p ->{ -1, -1, 8, 8, 8 }
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < arr.length; i++) {
			while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
				stack.pop();
			}
			if (stack.empty()) {
				nxtGreater[i] = -1;
			} else {
				nxtGreater[i] = arr[stack.peek()];
			}
			stack.push(i);
		}
		for (int n : nxtGreater) {
			System.out.print(n + " ");
		}
	}

	private static void nextGreaterToRight(int[] arr, int[] nxtGreater) {
		Stack<Integer> stack = new Stack<>();
		for (int i = arr.length - 1; i >= 0; i--) {
			while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				nxtGreater[i] = -1;
			} else {
				nxtGreater[i] = arr[stack.peek()];
			}
			stack.push(i);
		}
		for (int a : nxtGreater) {
			System.out.print(a + " ");
		}
	}
}
