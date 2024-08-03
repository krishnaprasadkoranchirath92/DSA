package alpha.backtracking;

public class GridWaysWithFactorial {

	public static void main(String[] args) {
		int n = 2, m = 2;
		int w = getWays(n, m);
		System.out.println(w);

	}

	private static int getWays(int n, int m) {
		int fn = factorial(n - 1);
		int fm = factorial(m - 1);
		int fmn = factorial(m + n - 2);
		return fmn / (fn * fm);
	}

	private static int factorial(int num) {
		if (num == 0) {
			return 1;
		}
		return num * factorial(num - 1);
	}

}
