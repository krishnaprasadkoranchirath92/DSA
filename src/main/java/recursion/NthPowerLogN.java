package recursion;

public class NthPowerLogN {

	public static void main(String[] args) {
		int n = 5, x = 2;
		System.out.println(calcNthPowerOfX(x, n));
	}

	private static int calcNthPowerOfX(int x, int n) {
		if (x == 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}
		if(n%2 ==0) {
			return calcNthPowerOfX(x, n/2)*calcNthPowerOfX(x, n/2);
		} else {
			return x* calcNthPowerOfX(x, n/2)*calcNthPowerOfX(x, n/2);
		}
	}

}
