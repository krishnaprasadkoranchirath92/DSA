package recursion;

public class PrintKeypadCombination {
	static String map[] = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "uvw", "xyz" };

	private static void printCombos(String s, int idx, String combo) {
		if (idx == s.length()) {
			System.out.println(combo);
			return;
		}
		char n = s.charAt(idx);
		String st = map[n - '0'];
		for (int i = 0; i < st.length(); i++) {
			printCombos(s, idx + 1, combo + st.charAt(i));
		}
	}

	public static void main(String[] args) {
		String s = "01";
		printCombos(s, 0, "");
	}

}
