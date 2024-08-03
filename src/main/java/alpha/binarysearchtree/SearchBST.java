package alpha.binarysearchtree;

import alpha.binarysearchtree.BuildBST.Node;

public class SearchBST {
	public static void main(String[] args) {
		int arr[] = { 5, 1, 3, 4, 2, 7 };
		Node root = null;
		for (int i : arr) {
			root = insert(root, i);
		}
//		preorderTraversal(root);
		boolean test = search(root, 7);
		System.out.println(test);
	}

	private static boolean search(Node root, int key) {
		if (root == null) {
			return false;
		}
		if (root.data == key) {
			return true;
		}
		if (key < root.data) {
			return search(root.left, key);
		} else {
			return search(root.right, key);
		}
	}

	private static void preorderTraversal(Node root) {
		if (root == null) {
			return;
		}
		preorderTraversal(root.left);
		System.out.println(root.data);
		preorderTraversal(root.right);
	}

	private static Node insert(Node root, int i) {
		if (root == null) {
			return new Node(i);
		}
		if (i < root.data) {
			root.left = insert(root.left, i);
		} else {
			root.right = insert(root.right, i);
		}
		return root;
	}

}
