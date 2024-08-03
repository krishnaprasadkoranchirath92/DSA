package alpha.recursion;

public class BinaryStringProblem {

	public static void main(String[] args) {
		int n = 3;
		int lpv = 0;
		printBinaryStrings(n, lpv, "");
	}

	private static void printBinaryStrings(int n, int lpv, String binaryString) {
		if (0 == n) {
			System.out.println(binaryString);
			return;
		}
		printBinaryStrings(n - 1, 0, binaryString + 0);
		if (lpv == 0) {
			printBinaryStrings(n-1, 1, binaryString + 1);
		}
	}

}
