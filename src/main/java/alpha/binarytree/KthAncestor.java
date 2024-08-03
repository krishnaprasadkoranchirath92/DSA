package alpha.binarytree;

public class KthAncestor {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		kthAncestor(root, 5, 1);
	}

	private static int kthAncestor(Node root, int n, int k) {
		if (root == null) {
			return -1;
		}
		if (root.data == n) {
			return 0;
		}
		int l = kthAncestor(root.left, n, k);
		int r = kthAncestor(root.right, n, k);
		if (l == -1 && r == -1) {
			return -1;
		}
		int max = Math.max(l, r);
		if(max+1 == k) {
			System.out.println(root.data);
		}
		return max + 1;

	}

}
