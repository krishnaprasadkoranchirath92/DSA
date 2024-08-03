package alpha.recursion;

public class PrintIncreasingOrder {

	public static void main(String[] args) {
		int n = 10;
		printNum(n);
	}

	private static void printNum(int n) {
		if (n == 1) {
			System.out.println(n + " ");
			return;
		}
		printNum(n - 1);
		System.out.println(n);
	}

}
