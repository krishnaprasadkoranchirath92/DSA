package alpha.binarysearchtree;

public class BalancedBSTFromSortedArray {

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
		int arr[] = { 3, 5, 6, 8, 10, 11, 12 };
		Node root = createBST(arr, 0, arr.length - 1);
		inOrderTraversal(root);
	}

	private static void inOrderTraversal(Node root) {
		if (root == null) {
			return;
		}
		inOrderTraversal(root.left);
		System.out.println(root.data);
		inOrderTraversal(root.right);

	}

	private static Node createBST(int[] arr, int start, int end) {
		if (start > end) {
			return null;
		}
		int mid = (start + end) / 2;
		Node root = new Node(arr[mid]);
		root.left = createBST(arr, start, mid - 1);
		root.right = createBST(arr, mid + 1, end);
		return root;
	}

}
