package alpha.binarytree;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
//		Node node = lca(root, 5, 4);
//		System.out.println(node.data);
		Node node = lca2(root, 5, 3);
		System.out.println(node.data);
	}

	private static Node lca2(Node root, int n1, int n2) {
		if (root == null || root.data == n1 || root.data == n2) {
			return root;
		}
		Node lLca = lca2(root.left, n1, n2);
		Node rLca = lca2(root.right, n1, n2);
		if (lLca == null) {
			return rLca;
		}
		if (rLca == null) {
			return lLca;
		}
		return root;
	}

//	private static Node lca2(Node root, int n1, int n2) {
//		if (root == null || root.data == n1 || root.data == n2) {
//			return root;
//		}
//		Node leftLca = lca2(root.left, n1, n2);
//		Node rightLca = lca2(root.right, n1, n2);
//		if (leftLca == null) {
//			return rightLca;
//		}
//		if (rightLca == null) {
//			return leftLca;
//		}
//		return root;
//	}

	private static Node lca(Node root, int n1, int n2) {
		List<Node> path1 = new ArrayList<>();
		List<Node> path2 = new ArrayList<>();
		getPath(root, n1, path1);
		getPath(root, n2, path2);
		int i = 0;
		for (; i < path1.size() && i < path2.size(); i++) {
			if (path1.get(i) != path2.get(i)) {
				break;
			}
		}

		return path1.get(i - 1);
	}

	private static boolean getPath(Node root, int n, List<Node> path) {
		if (root == null) {
			return false;
		}
		path.add(root);
		if (root.data == n) {
			return true;
		}
		if (getPath(root.left, n, path) || getPath(root.right, n, path)) {
			return true;
		}
		path.remove(path.size() - 1);
		return false;
	}

//	private static Node lca(Node root, int n1, int n2) {
//		List<Node> path1 = new ArrayList<>();
//		List<Node> path2 = new ArrayList<>();
//		findPath(n1, root, path1);
//		findPath(n2, root, path2);
//		int i = 0;
//		for (; i < path1.size() && i < path2.size(); i++) {
//			if (path1.get(i) != path2.get(i)) {
//				break;
//			}
//		}
//		return path1.get(i - 1);
//	}
//
//	private static boolean findPath(int n, Node root, List<Node> path) {
//		if (root == null) {
//			return false;
//		}
//		path.add(root);
//		if (root.data == n) {
//			return true;
//		}
//		boolean p1 = findPath(n, root.left, path);
//		boolean p2 = findPath(n, root.right, path);
//		if (p1 || p2) {
//			return true;
//		}
//		path.remove(path.size() - 1);
//		return false;
//	}

}
