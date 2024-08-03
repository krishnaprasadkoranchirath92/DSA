package alpha.hashing;

import java.util.HashMap;

public class ValidAnagram {

	public static void main(String[] args) {
		String s1 = "lipid";
		String s2 = "dipol";
		System.out.println(isAnagram(s1, s2));
	}

	private static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
		}
		for (int i = 0; i < s2.length(); i++) {
			char ch = s2.charAt(i);
			Integer freq = map.get(ch);
			if (freq == null) {
				return false;
			}
			if (freq == 1) {
				map.remove(ch);
			} else {
				map.put(ch, map.get(ch) - 1);
			}
		}
		if (map.isEmpty()) {
			return true;
		}
		return false;
	}

}
