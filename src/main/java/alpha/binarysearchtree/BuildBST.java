package alpha.binarysearchtree;

import java.util.ArrayList;
import java.util.List;

public class BuildBST {

	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			super();
			this.data = data;
		}

	}

	static Node insert(Node root, int val) {
		if (root == null) {
			return new Node(val);
		}
		if (root.data > val) {
			root.left = insert(root.left, val);
		} else {
			root.right = insert(root.right, val);
		}
		return root;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 1, 3, 4, 2, 7 };
		Node root = null;
		for (int i : arr) {
			root = insert(root, i);
		}
//		int k1 = 2, k2 = 5;
//		printInRange(root, k1, k2);
//		preorderTraversal(root);
//		delete(root, 4);
//		System.out.println();
//		preorderTraversal(root);
		printRootToLeaf(root, new ArrayList<>());

	}

	private static void printRootToLeaf(Node root, List<Integer> path) {
		if (root == null) {
			return;
		}
		path.add(root.data);
		if (root.left == null && root.right == null) {
			printPath(path);
			System.out.println();
		}
		printRootToLeaf(root.left, path);
		printRootToLeaf(root.right, path);
		path.remove(path.size() - 1);
	}

	private static void printPath(List<Integer> path) {
		path.stream().forEach(e -> System.out.print(e + " ->"));
	}

	private static void printInRange(Node root, int k1, int k2) {
		if (root == null) {
			return;
		}
		if (root.data >= k1 && root.data <= k2) {
			System.out.println(root.data);
			printInRange(root.left, k1, k2);
			printInRange(root.right, k1, k2);
		} else if (root.data < k1) {
			printInRange(root.right, k1, k2);
		} else {
			printInRange(root.left, k1, k2);
		}
	}

	private static Node delete(Node root, int val) {
		if (root.data > val) {
			root.left = delete(root.left, val);
		} else if (root.data < val) {
			root.right = delete(root.right, val);
		} else {
			if (root.left == null && root.right == null) {
				return null;
			} else if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			} else {
				Node is = inOrderSuccessor(root.right);
				root.data = is.data;
				delete(root.right, val);
			}
		}

		return root;
	}

	private static Node inOrderSuccessor(Node root) {
		while (root.left != null) {
			root = root.left;
		}
		return root;
	}

	private static void preorderTraversal(Node root) {
		if (root == null)
			return;
		preorderTraversal(root.left);
		System.out.println(root.data);
		preorderTraversal(root.right);
	}
}
