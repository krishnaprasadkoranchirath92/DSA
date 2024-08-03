package recursion;

import java.util.HashSet;
import java.util.Set;

public class AllSubSequencesUnique {

	private static void uniqueSubSequences(String str, int idx, String subSeq, Set<String> set) {
		if (idx == str.length()) {
			if (set.contains(subSeq)) {
				return;
			} else {
				System.out.println(subSeq);
				set.add(subSeq);
				return;
			}
		}
		uniqueSubSequences(str, idx + 1, subSeq + str.charAt(idx), set);
		uniqueSubSequences(str, idx + 1, subSeq, set);
	}

	public static void main(String[] args) {
		String str = "ababca";
		int idx = 0;
		Set<String> set = new HashSet<>();
		String subSeq = "";
		uniqueSubSequences(str, idx, subSeq, set);
	}

}
