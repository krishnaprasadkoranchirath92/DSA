package alpha.recursion;

public class PrintDecreasingOrder {

	public static void main(String[] args) {
		int n = 10;
		printNum(n);
	}

	private static void printNum(int n) {
		if (n == 0) {
			return;
		}
		System.out.print(n + ", ");
		printNum(n - 1);
	}
}
