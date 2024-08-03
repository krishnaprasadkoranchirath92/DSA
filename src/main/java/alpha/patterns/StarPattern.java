package alpha.patterns;

public class StarPattern {

	public static void main(String[] args) {
		int n = 10;
		printStarPattern(n);
	}

	private static void printStarPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
