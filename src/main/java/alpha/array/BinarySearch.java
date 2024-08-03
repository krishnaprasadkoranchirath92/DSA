package alpha.array;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 8, 10, 12, 14 };
		int key = 12;
		int op = binarySearch(arr, key);
		System.out.println(op);
	}

	private static int binarySearch(int[] arr, int key) {
		int start = 0, end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (key == arr[mid]) {
				return mid;
			}
			if (key > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return -1;
	}

	private static int binarySearchRecursion(int[] arr, int start, int end, int key) {
		int mid = (end + start) / 2;
		if (arr[mid] == key) {
			return mid;
		}
		if (arr[mid] >= key && arr[start] <= key) {
			return binarySearchRecursion(arr, start, mid - 1, key);
		} else if (arr[mid] <= key && arr[end] >= key) {
			return binarySearchRecursion(arr, mid, end + 1, key);
		}
		return -1;
	}
}
