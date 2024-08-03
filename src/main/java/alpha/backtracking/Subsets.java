package alpha.backtracking;

public class Subsets {

	public static void main(String[] args) {
		String str = "abc";
		findSubsets(str, "", 0);
	}

	private static void findSubsets(String str, String newStr, int idx) {
		if (idx == str.length()) {
			if (newStr.isEmpty()) {
				System.out.println("NULL");
			} else {
				System.out.println(newStr);
			}
			return;
		}
		findSubsets(str, newStr + str.charAt(idx), idx + 1);
		findSubsets(str, newStr, idx + 1);

	}

	/*
	 * private static void findSubsets(String str, String newStr, int idx) { if (idx
	 * == str.length()) { if(newStr.isEmpty()) { System.out.println("NULL"); return;
	 * } System.out.println(newStr); return; } findSubsets(str, newStr +
	 * str.charAt(idx), idx + 1); findSubsets(str, newStr, idx + 1); }
	 */

}
