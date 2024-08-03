package alpha.dp;

public class StringConversion {

	public static void main(String[] args) {
		String s1 = "pear";
		String s2 = "sea";
		sc(s1, s2);
	}

	private static void sc(String s1, String s2) {
		int l = lcs(s1, s2);
		int del = s1.length() - l;
		int add = s2.length() - l;
		System.out.println(del + "  " + add);
	}

	private static int lcs(String s1, String s2) {
		int n = s1.length();
		int m = s2.length();
		int[][] dp = new int[n+1][m+1];
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < m + 1; j++) {
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i][j] = 1+ dp[i-1][j-1];
				} else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		return dp[n][m];
	}
}
