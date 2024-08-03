package alpha.binarytree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class TopView {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		topView(root);
	}

	private static void topView(Node root) {
		Map<Integer, Node> map = new HashMap<>();
		Queue<Info> queue = new LinkedList<>();
		queue.add(new Info(root, 0));
		queue.add(null);
		int lt = 0, rt = 0;
		while (!queue.isEmpty()) {
			Info info = queue.remove();
			if (info == null) {
				if (queue.isEmpty()) {
					break;
				} else {
					queue.add(null);
				}
			} else {
				Node node = info.node;
				int hd = info.hd;
				if (!map.containsKey(hd)) {
					map.put(hd, node);
				}
				if (node.left != null) {
					queue.add(new Info(node.left, hd - 1));
					lt = Math.min(lt, hd - 1);
				}
				if (node.right != null) {
					queue.add(new Info(node.right, hd + 1));
					rt = Math.max(rt, hd + 1);
				}
			}
		}
		for (int i = lt; i <= rt; i++) {
			System.out.println(map.get(i).data);
		}

	}

}

class Info {
	Node node;
	int hd;

	public Info(Node node, int hd) {
		this.node = node;
		this.hd = hd;
	}

}

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

}
