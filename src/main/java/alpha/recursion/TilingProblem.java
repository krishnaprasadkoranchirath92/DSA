package alpha.recursion;

public class TilingProblem {
//	2*n <- 2*1
	public static void main(String[] args) {
		int n = 5;
		System.out.println(maxWaysOfTiling(n));
	}

	private static int maxWaysOfTiling(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return maxWaysOfTiling(n - 1) + maxWaysOfTiling(n - 2);
	}

}
