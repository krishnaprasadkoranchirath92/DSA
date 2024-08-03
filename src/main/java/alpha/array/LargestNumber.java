package alpha.array;

public class LargestNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 6, 3, 5 };
		System.out.println(greatestNumber(arr));

	}

	private static int greatestNumber(int[] arr) {
		int greatest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (greatest < arr[i]) {
				greatest = arr[i];
			}
			if (smallest > arr[i]) {
				smallest = arr[i];
			}
		}
		System.out.println("Smallest = " + smallest);
		System.out.println("Largest = " + greatest);
		return greatest;
	}
}
