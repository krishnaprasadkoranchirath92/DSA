package recursion;

public class TowerOfHanoi {
	static int count;
	private static void toH(int n, String s, String h, String d) {
		if (n == 1) {
			System.out.println(s + " ->" + d);
			count++;
			return;
		}
		toH(n - 1, s, d, h);
		System.out.println(s + " -> " + d);
		count++;
		toH(n - 1, h, s, d);
	}

	public static void main(String[] args) {
		int n = 4;
		toH(n, "S", "H", "D");
		System.out.println("Total Moves ="+count);
	}

}
