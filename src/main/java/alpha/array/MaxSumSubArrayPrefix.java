package alpha.array;

public class MaxSumSubArrayPrefix {

	public static void main(String[] args) {
		int arr[] = { 1, -2, 6, -1, 3 };
		int max = maxSubArray(arr);
		System.out.println(max);
	}

	private static int maxSubArray(int[] arr) {
		int max = Integer.MIN_VALUE;
		int prefix[] = new int[arr.length];
		prefix[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			prefix[i] = arr[i] + prefix[i - 1];
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int start = i;
				int end = j;
				int sum = start == 0 ? prefix[end] : (prefix[end] - prefix[start - 1]);
				if (sum > max) {
					max = sum;
				}
			}
		}

		return max;
	}

}
