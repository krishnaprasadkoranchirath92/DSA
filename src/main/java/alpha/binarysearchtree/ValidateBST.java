package alpha.binarysearchtree;

public class ValidateBST {

	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			super();
			this.data = data;
		}

	}

	public static void main(String[] args) {
		Node root = new Node(3);
		root.left = new Node(2);
		root.right = new Node(5);
		root.left.left = new Node(1);
		boolean isValid = validateBST(root, null, null);
		System.out.println(isValid);
	}

	private static boolean validateBST(Node root, Node min, Node max) {
		if (root == null) {
			return true;
		}
		if (min != null && root.data < min.data) {
			return false;
		}
		if (max != null && root.data > max.data) {
			return false;
		}
		return validateBST(root.left, min, root) && validateBST(root.right, root, max);
	}

}
