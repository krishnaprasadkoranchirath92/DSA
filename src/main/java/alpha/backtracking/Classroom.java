package alpha.backtracking;

public class Classroom {

	public static void main(String[] args) {
		int[] arr = new int[5];
		changeArray(arr, 0, 1);
		printArray(arr);
	}

	private static void changeArray(int[] arr, int i, int j) {
		if (i == arr.length) {
			printArray(arr);
			return;
		}
		arr[i] = j;
		changeArray(arr, i + 1, j + 1);
		arr[i] = arr[i] - 2;
	}

	/*
	 * private static void changeArray(int[] arr, int i, int val) { if (i ==
	 * arr.length) { printArray(arr); return; } arr[i] = val; changeArray(arr, i +
	 * 1, val + 1); arr[i] = val - 2;
	 * 
	 * }
	 */

	private static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + "  ");
		}
		System.out.println();
	}
}
