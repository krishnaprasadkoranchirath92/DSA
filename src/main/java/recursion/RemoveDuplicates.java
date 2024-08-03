package recursion;

public class RemoveDuplicates {
	static boolean arr[] = new boolean[26];

	private static void rmDuplicates(String str, int i, String newStr) {
		if (str.length() == i) {
			System.out.println(newStr);
			return;
		}
		if (!arr[str.charAt(i) - 'a']) {
			arr[str.charAt(i) - 'a'] = true;
			newStr = newStr + str.charAt(i);
		}
		rmDuplicates(str, i + 1, newStr);
	}

	public static void main(String[] args) {
		String str = "adfdadsdasfdf";
		rmDuplicates(str, 0, "");
	}
}
