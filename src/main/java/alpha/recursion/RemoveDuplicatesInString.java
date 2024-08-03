package alpha.recursion;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
//		Input has only letters 'a' to 'z'
		String str = "sfsfasasde";// sfade
		StringBuilder sb = new StringBuilder();
		boolean[] map = new boolean[25];
		removeDuplicates(str, sb, map, 0);
		removeDuplicates(str, "", new boolean[25], 0);
	}

	private static void removeDuplicates(String str, String string, boolean[] map, int idx) {
		if (idx == str.length()) {
			System.out.println(string);
			return;
		}
		char currChar = str.charAt(idx);
		if (map[currChar - 'a'] == false) {
			string = string + "" + currChar;
			map[currChar - 'a'] = true;
		}
		removeDuplicates(str, string, map, idx + 1);

	}

	private static void removeDuplicates(String str, StringBuilder sb, boolean[] map, int idx) {
		if (idx == str.length()) {
			System.out.println(sb);
			return;
		}
		char currChar = str.charAt(idx);
		if (map[currChar - 'a'] == false) {
			sb.append(currChar);
			map[currChar - 'a'] = true;
		}
		removeDuplicates(str, sb, map, idx + 1);
	}

}
