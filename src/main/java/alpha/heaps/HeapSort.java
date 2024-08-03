package alpha.heaps;

public class HeapSort {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 3 };
		heapSort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	private static void heapSort(int[] arr) {
		int n = arr.length;
		for (int i = n / 2; i >= 0; i--) {
			heapify(arr, i, n);
		}
		for (int i = n - 1; i > 0; i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			heapify(arr, 0, i);
		}
	}

	private static void heapify(int[] arr, int i, int size) {
		int maxIdx = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		if (left < size && arr[maxIdx] < arr[left]) {
			maxIdx = left;
		}
		if (right < size && arr[maxIdx] < arr[right]) {
			maxIdx = right;
		}
		if(i != maxIdx) {
			int temp = arr[i];
			arr[i] = arr[maxIdx];
			arr[maxIdx] = temp;
			heapify(arr, maxIdx, size);
		}
	}

}
