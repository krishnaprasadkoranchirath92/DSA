package alpha.binarysearchtree;

public class LargestBSTinBT {

	public static void main(String[] args) {
		Node root = new Node(50);
		root.left = new Node(30);
		root.left.left = new Node(5);
		root.left.right = new Node(20);
		root.right = new Node(60);
		root.right.left = new Node(45);
		root.right.right = new Node(70);
		root.right.right.left = new Node(65);
		root.right.right.right = new Node(80);
		LargestBST l = new LargestBST(0, root);
		Info largestBST = getLargestBST(root, l);
		System.out.println(largestBST.size);
		System.out.println(l.size);
		System.out.println(l.root.data);
		System.out.println(x);

	}

	static class LargestBST {
		int size;
		Node root;

		public LargestBST(int size, Node root) {
			super();
			this.size = size;
			this.root = root;
		}
	}

	static int x = 0;

	static Info getLargestBST(Node root, LargestBST lb) {
		if (root == null) {
			return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
		}
		Info left = getLargestBST(root.left, lb);
		Info right = getLargestBST(root.right, lb);
		int size = left.size + right.size + 1;
		int min = Math.min(root.data, Math.min(left.min, right.min));
		int max = Math.max(root.data, Math.max(left.max, right.max));
		if (root.data < left.max || root.data > right.min) {
			return new Info(false, size, min, max);
		}
		if (left.isBST && right.isBST) {
			x = Math.max(x, size);
			if (size > lb.size) {
				lb.root = root;
				lb.size = size;
			}
			return new Info(true, size, min, max);
		}
		return new Info(false, size, min, max);
	}

	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			super();
			this.data = data;
		}
	}

	static class Info {
		boolean isBST;
		int size;
		int min;
		int max;

		public Info(boolean isBST, int size, int min, int max) {
			super();
			this.isBST = isBST;
			this.size = size;
			this.min = min;
			this.max = max;
		}
	}

}
