package alpha.binarysearchtree;

import java.util.ArrayList;
import java.util.List;

public class Merge2BSTs {

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
		Node root1 = new Node(2);
		root1.left = new Node(1);
		root1.right = new Node(4);
		Node root2 = new Node(9);
		root2.left = new Node(3);
		root2.right = new Node(12);
		mergeBSTs(root1, root2);
	}

	private static void mergeBSTs(Node root1, Node root2) {
		List<Integer> al1 = new ArrayList<>();
		inOrder(root1, al1);
		List<Integer> al2 = new ArrayList<>();
		inOrder(root2, al2);
		int i = 0, j = 0;
		List<Integer> finalAl = new ArrayList<>();
		while (i < al1.size() && j < al2.size()) {
			if (al1.get(i) > al2.get(j)) {
				finalAl.add(al2.get(j));
				j++;
			} else {
				finalAl.add(al1.get(i));
				i++;
			}
		}
		while (i < al1.size()) {
			finalAl.add(al1.get(i));
			i++;
		}
		while (j < al2.size()) {
			finalAl.add(al2.get(j));
			j++;
		}
		Node root = buildBST(finalAl, 0, finalAl.size() - 1);
		inOrderPrint(root);
	}

	private static void inOrderPrint(Node root) {
		if(root == null) {
			return;
		}
		inOrderPrint(root.left);
		System.out.println(root.data);
		inOrderPrint(root.right);
	}

	private static Node buildBST(List<Integer> finalAl, int st, int end) {
		if (st > end) {
			return null;
		}
		int mid = (st + end) / 2;
		Node root = new Node(finalAl.get(mid));
		root.left = buildBST(finalAl, st, mid - 1);
		root.right = buildBST(finalAl, mid + 1, end);
		return root;
	}

	private static void inOrder(Node root, List<Integer> al) {
		if (root == null) {
			return;
		}
		inOrder(root.left, al);
		al.add(root.data);
		inOrder(root.right, al);
	}

}
