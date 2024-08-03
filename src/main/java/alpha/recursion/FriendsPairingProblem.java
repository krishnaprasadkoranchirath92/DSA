package alpha.recursion;

public class FriendsPairingProblem {
	public static void main(String[] args) {
		int n = 3;
		System.out.println(getMaxPairs(n));
	}

	private static int getMaxPairs(int n) {
		if (n == 1 || n == 2) {
			return n;
		}
		return getMaxPairs(n - 1) + (n - 1) * getMaxPairs(n - 2);

	}
}
