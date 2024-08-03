package recursion;

public class AllSubSequences {
	private static void subSeq(String str, int idx, String newStr) {
		if (idx == str.length()) {
			System.out.println(newStr);
			return;
		}
		subSeq(str, idx+1, newStr);
		subSeq(str, idx+1, newStr + str.charAt(idx));
	}

	public static void main(String[] args) {
		subSeq("abc", 0, "");
	}

}
