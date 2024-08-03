package alpha.timeComplexity;

public class BubbleSortOptimized {

	public static void main(String[] args) {
		int arr[] = { 2, 8, 1, 4, 6 };
		bubbleSortOpt(arr);
	}

	private static void bubbleSortOpt(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean swap = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swap = true;
				}
			}
			if (swap == false) {
				break;
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}
}
