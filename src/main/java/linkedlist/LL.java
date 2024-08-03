package linkedlist;

public class LL {
	private Node head;
	public Node tail;// TO insert at last we can do at constant time
	private int size;

	public LL() {
		super();
		this.size = 0;
	}

	public void insert(int val, int index) {
		if (index == 0) {
			insertFirst(val);
			return;
		}
		if (index == size) {
			insertLast(val);
			return;
		}
		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}
		Node node = new Node(val, temp.next);
		temp.next = node;
		size += 1;

	}

	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
		if (null == tail) {
			tail = head;
		}
		size += 1;
	}

	public void insertLast(int val) {
		if (null == tail) {
			insertFirst(val);
			return;
		}
		Node node = new Node(val);
		tail.next = node;
		tail = node;
		size += 1;
	}

	public int deleteFirst() {
		int val = head.value;
		head = head.next;
		if (head == null) {
			tail = null;
		}
		size--;
		return val;
	}

	public int deleteLast() {
		if(size <= 1) {
			return deleteFirst();
		}
		Node temp = get(size - 2);
		temp.next = null;
		int val = tail.value;
		tail = temp;
		return val;

	}
	
	public int delete(int index) {
		if(index == 0) {
			return deleteFirst();
		}
		if(index == size-1) {
			return deleteLast();
		}
		Node prev = get(index-1);
		int val = prev.next.value;
		prev.next = prev.next.next;
		return val;		
	}

	public Node get(int index) {
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public Node find(int value) {
		Node node = head;
		while(node != null) {
			if(node.value == value) {
				break;
			}
			node = node.next;
		}
		return node;
	}
	public void display() {
		Node temp = head;
		while (null != temp) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.print("END");
	}

	private class Node {
		private int value;
		private Node next;

		public Node(int value, Node next) {
			super();
			this.value = value;
			this.next = next;
		}

		public Node(int value) {
			super();
			this.value = value;
		}

		@Override
		public String toString() {
			return "Node [value=" + value + ", next=" + next + "]";
		}

	}
}
