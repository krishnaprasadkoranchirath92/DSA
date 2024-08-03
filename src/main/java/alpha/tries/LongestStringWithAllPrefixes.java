package alpha.tries;

public class LongestStringWithAllPrefixes {

	static Node root = new Node();
	static String ans = "";

	static class Node {
		Node[] children;
		boolean eow;

		public Node() {
			children = new Node[26];
		}

	}

	private static void insert(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			int idx = word.charAt(i) - 'a';
			if (curr.children[idx] == null) {
				curr.children[idx] = new Node();
			}
			if (i == word.length() - 1) {
				curr.children[idx].eow = true;
			}
			curr = curr.children[idx];
		}
	}

	private static void largestString(Node curr, StringBuilder sb) {
		for (int i = 0; i < 26; i++) {
			if (curr.children[i] != null && curr.children[i].eow) {
				sb.append((char) (i + 'a'));
				if (sb.length() > ans.length()) {
					ans = sb.toString();
				}
				largestString(curr.children[i], sb);
				sb.deleteCharAt(sb.length() - 1);
			}
		}
	}

	public static void main(String[] args) {
		String[] words = { "a", "banana", "apply", "app", "ap", "appl", "apple" };
		for (int i = 0; i < words.length; i++) {
			insert(words[i]);
		}
		largestString(root, new StringBuilder(""));
		System.out.println("Ans = " + ans);
	}

}
