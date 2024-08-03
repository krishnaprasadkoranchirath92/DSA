package alpha.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BuildTreePreOrder {

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

	static class BinaryTree {
		static int idx = -1;

		Node buildTree(int[] arr) {
			idx++;
			if (arr[idx] == -1) {
				return null;
			}
			Node node = new Node(arr[idx]);
			node.left = buildTree(arr);
			node.right = buildTree(arr);
			return node;
		}

		void preOrder(Node node) {
			if (node == null) {
				return;
			}
			System.out.print(node.data + " ");
			preOrder(node.left);
			preOrder(node.right);
		}

		void inOrder(Node node) {
			if (node == null) {
				return;
			}
			inOrder(node.left);
			System.out.print(node.data + " ");
			inOrder(node.right);
		}

		void postOrder(Node node) {
			if (node == null) {
				return;
			}
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.data + " ");
		}

		void levelOrderTaversal(Node node) {
			Queue<Node> queue = new LinkedList<>();
			queue.add(node);
			queue.add(null);
			while (!queue.isEmpty()) {
				Node curr = queue.remove();
				if (curr == null) {
					if (queue.isEmpty()) {
						break;
					} else {
						queue.add(null);
						System.out.println();
					}
				} else {
					System.out.print(curr.data + " ");
					if (curr.left != null) {
						queue.add(curr.left);
					}
					if (curr.right != null) {
						queue.add(curr.right);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		BinaryTree tree = new BinaryTree();
		Node n = tree.buildTree(arr);
//		System.out.println(n.data);
//		tree.preOrder(n);
//		System.out.println();
//		tree.inOrder(n);
//		System.out.println();
//		tree.postOrder(n);
		System.out.println();
		tree.levelOrderTaversal(n);
	}
}
