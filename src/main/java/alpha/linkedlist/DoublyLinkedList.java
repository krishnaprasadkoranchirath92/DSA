package alpha.linkedlist;

public class DoublyLinkedList {

	public class Node {
		int data;
		Node next;
		Node prev;

		Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

//	print
	public void printLL() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "<->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
//	addFirst

	public void addFirst(int data) {
		Node node = new Node(data);
		size++;
		if (head == null) {
			head = tail = node;
			return;
		}
		node.next = head;
		head.prev = node;
		head = node;
	}

	public void addLast(int data) {
		Node node = new Node(data);
		size++;
		if (head == null) {
			head = tail = node;
			return;
		}
		tail.next = node;
		node.prev = tail;
		tail = tail.next;
	}

	public int removeFirst() {
		if (head == null) {
			System.out.println("Empty Linked List");
			return Integer.MIN_VALUE;
		}
		if (head.next == null) {
			int val = head.data;
			head = tail = null;
			size--;
			return val;
		}
		int val = head.data;
		head = head.next;
		head.prev = null;
		size--;
		return val;
	}

	public int removeLast() {
		if (head == null) {
			System.out.println("Empty Linked List");
			return Integer.MIN_VALUE;
		}
		if (head.next == null) {
			int val = head.data;
			head = tail = null;
			size--;
			return val;
		}
		int val = tail.data;
		tail = tail.prev;
		tail.next = null;
		return val;
	}
//	addLast
//	removeFirst
//	removeLast

	public static Node head;
	public static Node tail;
	public static int size;

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.addFirst(3);
		dll.addFirst(2);
		dll.addFirst(1);
		dll.printLL();
//		System.out.println(dll.size);
//		dll
		Node n = reverseDLL();
		dll.printLL();
	}
	private static Node reverseDLL() {
		Node curr = head;
		Node next;
		Node prev = null;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			curr.prev = next;
			prev = curr;
			curr = next;
		}
		head = prev;
		return prev;
		
	}

}
