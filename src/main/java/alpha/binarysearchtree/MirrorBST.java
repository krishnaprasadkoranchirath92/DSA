package alpha.binarysearchtree;

import alpha.binarysearchtree.ValidateBST.Node;

public class MirrorBST {

	public static void main(String[] args) {
		Node root = new Node(3);
		root.left = new Node(2);
		root.right = new Node(5);
		root.left.left = new Node(1);
		root = createMirror(root);
		inOrderTraversal(root);
	}

	private static void inOrderTraversal(Node root) {
		if (root == null)
			return;
		inOrderTraversal(root.left);
		System.out.println(root.data);
		inOrderTraversal(root.right);
	}

	private static Node createMirror(Node root) {
		if (root == null) {
			return null;
		}
		Node leftM = createMirror(root.left);
		Node rightM = createMirror(root.right);
		root.right = leftM;
		root.left = rightM;
		return root;
	}

}
