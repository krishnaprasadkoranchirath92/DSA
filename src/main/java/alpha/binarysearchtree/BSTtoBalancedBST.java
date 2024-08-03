package alpha.binarysearchtree;

import java.util.ArrayList;
import java.util.List;

public class BSTtoBalancedBST {

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
		Node root = new Node(8);
		root.left = new Node(6);
		root.left.left = new Node(5);
		root.left.left.left = new Node(3);
		root.right = new Node(10);
		root.right.right = new Node(11);
		root.right.right.right = new Node(12);
		List<Integer> inOrder = new ArrayList<Integer>();
		getInorderSeq(root, inOrder);
		Node node = getBalancedBST(inOrder, 0, inOrder.size() - 1);
		bst(node);
	}

	private static void bst(Node root) {
		if (root == null)
			return;
		System.out.println(root.data);
		bst(root.left);
		bst(root.right);
	}

	private static Node getBalancedBST(List<Integer> inOrder, int st, int end) {
		if (st > end) {
			return null;
		}
		int mid = (st + end) / 2;
		Node root = new Node(inOrder.get(mid));
		root.left = getBalancedBST(inOrder, st, mid-1);
		root.right = getBalancedBST(inOrder, mid+1, end);
		return root;
	}

	private static void getInorderSeq(Node root, List<Integer> inOrder) {
		if (root == null) {
			return;
		}
		getInorderSeq(root.left, inOrder);
		inOrder.add(root.data);
		getInorderSeq(root.right, inOrder);

	}
}
