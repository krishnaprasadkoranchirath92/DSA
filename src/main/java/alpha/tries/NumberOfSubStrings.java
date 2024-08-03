package alpha.tries;

public class NumberOfSubStrings {

	static Node root = new Node();

	static class Node {
		Node[] children;
		boolean eow;

		Node() {
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
				curr.eow = true;
			}
			curr = curr.children[idx];
		}
	}

	private static int numberOfSubstrings(String word) {
		for (int i = 0; i < word.length(); i++) {
			insert(word.substring(i));
		}
		return countNodes(root);
	}

	private static int countNodes(Node curr) {
		if (curr == null) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < 26; i++) {
			if (curr.children[i] != null) {
				count += countNodes(curr.children[i]);
			}
		}
		return (count + 1);
	}

	public static void main(String[] args) {
		int count = numberOfSubstrings("apple");
		System.out.println("Number of substring = " + count);
	}

}
