package linkedlist;

public class CLL {
	private int size;
	private Node head;
	private Node tail;

	public CLL() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public void insert(int val) {
		Node node = new Node(val);
		if (head == null) {
			head = node;
			tail = node;
			return;
		}
		tail.next = node;
		node.next = head;
		tail = node;
	}

	public void display() {
		Node node = head;
		if (head != null) {
			do {
				System.out.print(node.val + " -> ");
				node = node.next;
			} while (head != node);
			System.out.print("HEAD");
		}
	}

	public void delete(int val) {
		Node node = head;
		if (node == null) {
			return;
		}
		if (node.val == val) {
			head = head.next;
			tail.next = head;
			return;
		}
		do {
			Node n = node.next;
			if (n.val == val) {
				node.next = n.next;
			}
			node = node.next;
		} while (node != head);

		/*
		 * Node prev = head; while (node.val != val) { prev = node; node = node.next; }
		 * prev.next = node.next;
		 */
	}

	private class Node {
		private int val;
		private Node next;

		public Node(int val) {
			super();
			this.val = val;
		}

	}

}
