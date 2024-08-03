package alpha.binarytree;

public class DistanceBetweenNodes {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		distance(4, 5, root);
	}

	private static void distance(int n1, int n2, Node root) {
		Node lca = lca(n1, n2, root);
		int d1 = getDistance(n1, lca);
		int d2 = getDistance(n2, lca);
		System.out.println(d1 + d2);
	}

	private static int getDistance(int n, Node root) {
		if (root == null) {
			return -1;
		}
		if (root.data == n) {
			return 0;
		}
		int ld = getDistance(n, root.left);
		int rd = getDistance(n, root.right);
		if (ld == -1 && rd == -1) {
			return -1;
		}
		if (ld == -1) {
			return rd + 1;
		} else {
			return ld + 1;
		}
	}

	private static Node lca(int n1, int n2, Node root) {
		if (root == null || root.data == n1 || root.data == n2) {
			return root;
		}
		Node lLca = lca(n1, n2, root.left);
		Node rLca = lca(n1, n2, root.right);
		if (lLca == null) {
			return rLca;
		}
		if (rLca == null) {
			return lLca;
		}
		return root;

	}

}
