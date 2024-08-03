package recursion;

public class FirstAndLastIndexofCharacter {
	static int firstIndex = -1, lastIndex = -1;

	public static void main(String[] args) {
		String s = "abnahn";
		int idx = 0;
		char c = 'a';
		findFirstAndLastCharIdx(s, idx, c);
		System.out.println(firstIndex + "  " + lastIndex);
	}

	private static void findFirstAndLastCharIdx(String s, int idx, char c) {
		if (idx == s.length()) {
			return;
		}
		if (s.charAt(idx) == c) {
			if (firstIndex == -1) {
				firstIndex = idx;
			} else if (lastIndex == -1) {
				lastIndex = idx;
			}
		}
		findFirstAndLastCharIdx(s, ++idx, c);
	}
}
