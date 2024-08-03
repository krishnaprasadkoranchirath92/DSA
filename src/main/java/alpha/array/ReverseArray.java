package alpha.array;

public class ReverseArray {

	public  static void main(String[] args) {
		int arr[] = { 2, 4, 6, 8 };
		reverse(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static void reverse(int[] arr, int start, int end) {
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			end--;
			start++;
		}
	}
}
