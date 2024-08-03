package recursion;

public class FibonacciTillN {

	public static void main(String[] args) {
		int n = 6;
		System.out.print(0 + "  " + 1 + "   ");
		fib(0, 1, n-2);
	}

	private static void fib(int i, int j, int n) {

		if (0 == n) {
			return;
		}
		System.out.print(i + j + "   ");
		fib(j, i + j, n - 1);
	}
}
