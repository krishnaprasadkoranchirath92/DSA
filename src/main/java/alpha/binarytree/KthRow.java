package alpha.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class KthRow {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		printKthRow(root, 1);
	}

	private static void printKthRow(Node root, int l) {
		Queue<NodeDetails> queue = new LinkedList<>();
		queue.add(new NodeDetails(root, 0));
		queue.add(null);
		while (!queue.isEmpty()) {
			NodeDetails nodeDetails = queue.remove();
			if (nodeDetails == null) {
				if (queue.isEmpty()) {
					break;
				} else {
					queue.add(null);
				}
			} else {
				Node node = nodeDetails.node;
				int level = nodeDetails.level;
				if (level == l) {
					System.out.println(node.data);
					continue;
				}

				if (node.left != null) {
					queue.add(new NodeDetails(node.left, level+1));
				}
				if (node.right != null) {
					queue.add(new NodeDetails(node.right, level+1));
				}
			}
		}
	}
}

class NodeDetails {
	Node node;
	int level;

	public NodeDetails(Node node, int level) {
		super();
		this.node = node;
		this.level = level;
	}

}
