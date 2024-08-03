package recursion;

public class NthPower {

	public static void main(String[] args) {
		int x = 2, n = 3;
		System.out.println(powerofN(x, n));
	}

	private static int powerofN(int x, int n) {
		if(x ==0) {
			return 0;
		}
		if(n == 0) {
			return 1;
		}
		return x * powerofN(x, n - 1);
	}

}
