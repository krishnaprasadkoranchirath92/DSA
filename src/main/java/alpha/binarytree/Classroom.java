package alpha.binarytree;

public class Classroom {

	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

	}

	static class Info {
		int height;
		int diameter;

		public Info(int height, int diameter) {
			super();
			this.height = height;
			this.diameter = diameter;
		}

	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(3);
		root.left.right = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		System.out.println(calculateHeight(root));
		System.out.println(calculateTotalCountOfNodes(root));
		System.out.println(sumOfNodes(root));
		System.out.println(calculateDiameter(root));
		System.out.println(calculateDiameterInfo(root).diameter);
		System.out.println(calculateDiameterInfo(root).height);
	}

	private static Info calculateDiameterInfo(Node root) {
		if (root == null) {
			return new Info(0, 0);
		}
		int diameter = Math.max(calculateDiameterInfo(root.left).height + calculateDiameterInfo(root.right).height + 1,
				Math.max(calculateDiameterInfo(root.left).diameter, calculateDiameterInfo(root.right).diameter));
		int height = Math.max(calculateDiameterInfo(root.left).height, calculateDiameterInfo(root.left).height) + 1;
		return new Info(height, diameter);
	}

	private static int calculateDiameter(Node root) {
		if (root == null) {
			return 0;
		}
		int lh = calculateHeight(root.left);
		int rh = calculateHeight(root.right);
		int ld = calculateDiameter(root.left);
		int rd = calculateDiameter(root.right);
		return Math.max(lh + rh + 1, Math.max(ld, rd));
	}

	private static int sumOfNodes(Node root) {
		if (root == null) {
			return 0;
		}
		return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
	}

	private static int calculateTotalCountOfNodes(Node root) {
		if (root == null) {
			return 0;
		}
		return calculateTotalCountOfNodes(root.left) + calculateTotalCountOfNodes(root.right) + 1;
	}

	private static int calculateHeight(Node root) {
		if (root == null) {
			return 0;
		}
		int leftHeight = calculateHeight(root.left);
		int rightHeight = calculateHeight(root.right);
		return Math.max(leftHeight, rightHeight) + 1;
	}

}
