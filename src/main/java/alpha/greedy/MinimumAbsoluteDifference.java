package alpha.greedy;

import java.util.Arrays;

public class MinimumAbsoluteDifference {

	public static void main(String[] args) {
		int A[] = { 4, 1, 8, 7 };
		int B[] = { 2, 3, 6, 5 };
		absDiff(A,B);
		
	}

	private static void absDiff(int[] A, int[] B) {
		Arrays.sort(A);
		Arrays.sort(B);
		int minAbsoluteDiff = 0;
		for (int i = 0; i < A.length; i++) {
			minAbsoluteDiff += Math.abs(A[i] - B[i]);
		}
		System.out.println("Min Absolute Diff =" + minAbsoluteDiff);		
	}

}
