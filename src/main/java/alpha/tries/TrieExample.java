package alpha.tries;

public class TrieExample {
	static Node root = new Node();

	static class Node {
		Node[] children;
		boolean eow;

		public Node() {
			children = new Node[26];
		}

	}

	private static boolean search(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			int idx = word.charAt(i) - 'a';
			if (curr.children[idx] == null) {
				return false;
			}
			if (i == word.length() - 1 && curr.children[idx].eow) {
				return true;
			}
			curr = curr.children[idx];
		}

		return false;
	}

	private static void insert(String word) {
		Node current = root;
		for (int i = 0; i < word.length(); i++) {
			int idx = word.charAt(i) - 'a';
			if (current.children[idx] == null) {
				current.children[idx] = new Node();
			}
			if (i == word.length() - 1) {
				current.children[idx].eow = true;
			}
			current = current.children[idx];
		}
	}

	private static boolean isWordBreak(String key) {
		if (key.length() == 0) {
			return true;
		}
		for (int i = 1; i <= key.length(); i++) {
			String s1 = key.substring(0, i);
			String s2 = key.substring(i);
			if (search(s1) && isWordBreak(s2)) {
				return true;
			}
		}
		return false;
	}

	private static boolean isPrefix(String pr) {
		Node curr = root;
		for (int i = 0; i < pr.length(); i++) {
			int idx = pr.charAt(i) - 'a';
			if (curr.children[idx] == null) {
				return false;
			}
			curr = curr.children[idx];
		}
		return true;
	}

	public static void main(String[] args) {
		String words[] = { "the", "a", "there", "their", "any" };
		for (String s : words) {
			insert(s);
		}
		boolean isPresent = search("their");
		System.out.println(isPresent);
		System.out.println(search("th"));
		System.out.println("Is word break? -" + isWordBreak("thereanya"));
		System.out.println("Is word break? -" + isWordBreak("theeanya"));
		System.out.println("Is prefix? - " + isPrefix("ang"));
	}

}
