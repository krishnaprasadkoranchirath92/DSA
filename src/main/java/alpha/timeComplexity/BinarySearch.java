package alpha.timeComplexity;

public class BinarySearch {

	public static void main(String[] args) {
		int target = 0;
		int[] arr = { 1, 5, 8, 9 };
		int idx = binarySearch(arr, target);
		System.out.println(idx);
	}

	private static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
