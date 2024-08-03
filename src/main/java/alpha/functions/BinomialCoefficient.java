package alpha.functions;

public class BinomialCoefficient {

	public static int fact(int n) {
		if (n == 1) {
			return 1;
		}
		return n * fact(n - 1);
	}

	public static void main(String[] args) {
		System.out.println(binomialCoefficient(5,2));
	}

	private static int binomialCoefficient(int n, int r) {
		return fact(n)/(fact(n-r)*fact(r));
	}

}
