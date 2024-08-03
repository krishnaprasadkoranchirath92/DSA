package linkedlist;

public class DLL {
	private Node head;
	private Node tail;
	private int size;

	public void insert(int val, int index) {
		Node node = new Node(val);
		Node p = get(index - 1);
		Node n = p.next;
		p.next = node;
		node.prev = p;
		node.next = n;
		n.prev = node;
	}

	public void insertAfter(int aftr, int val) {
		Node fn = find(aftr);
		if (fn == null) {
			System.out.println("Element doesnot exist");
			return;
		}
		Node node = new Node(val);
		Node n = fn.next;
		fn.next = node;
		node.next = n;
		node.prev = fn;
		if (n != null)
			n.prev = node;
	}

	public Node find(int value) {
		Node p = head;
		while (p != null) {
			if (p.val == value) {
				return p;
			}
			p = p.next;
		}
		return null;
	}

	private Node get(int index) {
		Node node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}

	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		if (head != null) {
			head.prev = node;
		}
		head = node;
		size++;
		Node n = head;
		while (n.next != null) {
			n = n.next;
		}
		tail = n;
	}

	public void insertLast(int val) {
		Node node = new Node(val);
		if (head == null) {
			head = node;
			tail = node;
			return;
		}
		Node n = head;
		while (n.next != null) {
			n = n.next;
		}
		tail = n;
		if (tail != null) {
			tail.next = node;
		}
		node.prev = tail;
		tail = node;
		size++;
	}

	public void display() {
		Node node = head;
		Node last = null;
		while (node != null) {
			System.out.print(node.val + " -> ");
			last = node;
			node = node.next;
		}
		System.out.println("END");
		node = last;
		System.out.println();
		System.out.println("Reverse Printing:");
		while (node != null) {
			System.out.print(node.val + " -> ");
			node = node.prev;
		}
		System.out.print("START");
	}

	public DLL() {
		super();
		size = 0;
	}

	private class Node {
		private Node next;
		private Node prev;
		private int val;

		Node(int val) {
			this.val = val;
		}

		Node(int val, Node next, Node prev) {
			this.val = val;
			this.next = next;
			this.prev = prev;
		}

//		@Override
//		public String toString() {
//			return "Node [next=" + next + ", prev=" + prev + ", val=" + val + "]";
//		}
	}

}
