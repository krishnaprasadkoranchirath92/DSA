package alpha.binarytree;

public class KthLevelRecursion {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		int level = 0;
		printKthLevel(root, level, 2);
	}

	private static void printKthLevel(Node node, int level, int k) {
		if (node == null) {
			return;
		}
		if (level == k) {
			System.out.print(node.data + "  ");
			return;
		}
		printKthLevel(node.left, level + 1, k);
		printKthLevel(node.right, level + 1, k);
	}
}
