package alpha.backtracking;

public class GridWays {

	public static void main(String[] args) {
		int n = 2, m = 2;
		System.out.println(gridWays(n, m, 0, 0));
	}

	private static int gridWays(int n, int m, int i, int j) {
		if (i == n || j == m) {
			return 0;
		}
		if (i == n - 1 && j == m - 1) {
			return 1;
		}
		return gridWays(n, m, i + 1, j) + gridWays(n, m, i, j + 1);
	}

}
