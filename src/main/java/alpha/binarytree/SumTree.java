package alpha.binarytree;

public class SumTree {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		transformToST(root);
		preOrder(root);
	}

	private static void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + "  ");
		preOrder(root.left);
		preOrder(root.right);
	}

	private static int transformToST(Node root) {
		if (root == null) {
			return 0;
		}

		int data = root.data;
		int left = transformToST(root.left);
		int right = transformToST(root.right);
		int leftChild = root.left == null ? 0 : root.left.data;
		int rightChild = root.right == null ? 0 : root.right.data;
		root.data = left + leftChild + right + rightChild;
		return data;
	}
}
