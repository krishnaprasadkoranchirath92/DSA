package alpha.recursion;

public class NthFibonacci {

	public static void main(String[] args) {
		int n = 5;// 0 1 1 2 3 5
		System.out.println(printNthFibonacci(n));
	}

	private static int printNthFibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return printNthFibonacci(n - 1) + printNthFibonacci(n - 2);
	}

}
