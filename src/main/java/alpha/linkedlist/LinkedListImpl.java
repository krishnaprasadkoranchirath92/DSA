package alpha.linkedlist;

public class LinkedListImpl {

	static Node head;
	static Node tail;
	static int size;

	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}

	}

	public void addFirst(int data) {
		Node node = new Node(data);
		size++;
		if (head == null) {
			head = tail = node;
			return;
		}
		node.next = head;
		head = node;
	}

	public void add(int idx, int data) {
		if (idx == 0) {
			addFirst(data);
			return;
		}
		size++;
		Node node = new Node(data);
		Node temp = head;
		int i = 0;
		while (i < idx - 1) {
			temp = temp.next;
			i++;
		}
		node.next = temp.next;
		temp.next = node;
	}

	public void addLast(int data) {
		Node node = new Node(data);
		size++;
		if (head == null) {
			head = tail = node;
			return;
		}
		tail.next = node;
		tail = node;
	}

	public void printLinkedList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("NULL");
		System.out.println();

	}

	public int removeFirst() {
		if (size == 0) {
			System.out.println("Linked List is Empty");
			return -1;
		} else if (size == 1) {
			int val = head.data;
			head = tail = null;
			size = 0;
			return val;
		}
		int data = head.data;
		head = head.next;
		size--;
		return data;
	}

	public int removeLast() {
		if (size == 0) {
			System.out.println("Linked List is empty");
			return Integer.MAX_VALUE;
		} else if (size == 1) {
			int val = head.data;
			head = tail = null;
			size = 0;
			return val;
		}
		Node prev = head;
		for (int i = 0; i < size - 2; i++) {
			prev = prev.next;

		}
		int val = prev.next.data;
		prev.next = null;
		tail = prev;
		size--;
		return val;
//		Node prev = head;
//		Node temp = head.next;
//		while (temp.next != null) {
//			prev = prev.next;
//			temp = temp.next;
//		}
//		int val = temp.data;
//		prev.next = null;
//		tail = prev;
//		return val;
	}

	public int itrSearch(int key) {
		Node temp = head;
		int i = 0;
		while (temp != null) {
			if (key == temp.data) {
				return i;
			}
			temp = temp.next;
			i++;
		}
		return -1;

	}

	public int recSearch(int key) {
		return helper(head, key);
	}

	private int helper(Node head, int key) {
		if (head == null) {
			return -1;
		}
		if (key == head.data) {
			return 0;
		}
		int idx = helper(head.next, key);
		if (idx == -1) {
			return -1;
		}
		return idx + 1;
	}

	public Node reverse() {
		Node prev = null, curr = tail = head, next;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		return prev;
	}

	public void nthNodeFromLast(int n) {
		int sz = 0;
		Node temp = head;
		while (temp != null) {
			temp = temp.next;
			sz++;
		}
		if (n == sz) {
			head = head.next;
			return;
		}
		int i = 1;
		temp = head;
		while (i < sz - n) {
			temp = temp.next;
			i++;
		}
		temp.next = temp.next.next;
	}

//	Slow-Fast Approach
	public Node findMid(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static void main(String[] args) {
		LinkedListImpl ll = new LinkedListImpl();
		ll.printLinkedList();
		ll.addFirst(1);
		ll.addFirst(6);
		ll.addLast(6);
		ll.addLast(8);
		ll.printLinkedList();
		ll.add(1, 3);
		ll.printLinkedList();
		ll.removeLast();
		ll.printLinkedList();
		System.out.println(ll.itrSearch(1));
		System.out.println(ll.itrSearch(10));
		System.out.println(ll.recSearch(1));
		ll.printLinkedList();
		ll.reverse();
		ll.printLinkedList();
		ll.nthNodeFromLast(3);
		ll.printLinkedList();
		System.out.println(ll.findMid(head).data);
//		ll.checkPalindrome();
//		Node mid = ll.findMid(head);
//		Node h2 = ll.reverseSecondHalf(mid);
//		System.out.println("Is Boolean = " + ll.cmp(head, h2));
		System.out.println("Is Boolean = " + ll.checkPalindrome());


	}

	private boolean checkPalindrome() {
		if (head == null || head.next == null) {
			return true;
		}
		Node mid = findMid(head);
		Node h2 = reverseSecondHalf(mid);
		return cmp(head, h2);
	}

	private boolean cmp(Node head, Node h2) {
		while (h2 != null) {
			if (head.data != h2.data) {
				return false;
			}
			head = head.next;
			h2 = h2.next;
		}
		return true;
	}

	private Node reverseSecondHalf(Node mid) {
		Node curr = mid, prev = null, next;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;

	}
}
