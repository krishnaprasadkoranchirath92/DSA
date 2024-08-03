package alpha.array;

public class KadanesAlgorithm {

	public static void main(String[] args) {
		int arr[] = { -2, -3, 4, -1, 2, -1, 5, -3 };
		int maxSubArraySum = kadanes(arr);
		System.out.println("Max Sub array sum = " + maxSubArraySum);
	}

	private static int kadanes(int[] arr) {
		int ms = Integer.MIN_VALUE;
		int cs = 0;
		for (int i = 0; i < arr.length; i++) {
			cs = cs + arr[i];
			if (cs < 0) {
				cs = 0;
			}
			ms = Math.max(cs, ms);
		}
		return ms;
	}

}
