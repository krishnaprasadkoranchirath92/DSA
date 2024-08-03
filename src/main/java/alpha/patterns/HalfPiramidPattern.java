package alpha.patterns;

public class HalfPiramidPattern {

	public static void main(String[] args) {
		int n = 4;

		printHP(n);

	}

	private static void printHP(int n) {
		char ch = 'A';

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}

}
