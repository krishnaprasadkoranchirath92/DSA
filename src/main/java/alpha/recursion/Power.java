package alpha.recursion;

public class Power {

	public static void main(String[] args) {
		int base = 2;
		int pow = 5;
		System.out.println(power(base, pow));
		System.out.println(powerOptimized(base, pow));

	}

	private static int power(int base, int pow) {
		if (pow == 1) {
			return base;
		}
		return base * power(base, pow - 1);
	}

	private static int powerOptimized(int base, int pow) {
		if (pow == 0) {
			return 1;
		}
		int halfPow = powerOptimized(base, pow / 2);
		int halfPowSquare = halfPow * halfPow;
		if (pow % 2 != 0) {
			return base * halfPowSquare;
		}
		return halfPowSquare;
	}

}
