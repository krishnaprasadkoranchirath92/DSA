package alpha.array;

public class SubArrays {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 8 };
		printAllSubArrays(arr);
	}

	private static void printAllSubArrays(int[] arr) {
		int count = 0;
		int maxSum = Integer.MIN_VALUE;
		int minSum = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum = sum + arr[k];
					System.out.print(arr[k] + " ");
					if (sum > maxSum) {
						maxSum = sum;
					}
					if (sum < minSum) {
						minSum = sum;
					}
				}
				count++;
				System.out.println("Sum =" + sum);
			}
			System.out.println();
		}
		System.out.println("Count =" + count);
		System.out.println("Max Sum = "+maxSum);
		System.out.println("Min Sum = "+minSum);
	}
}
