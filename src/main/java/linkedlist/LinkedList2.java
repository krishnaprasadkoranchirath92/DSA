package linkedlist;

// Java program for reversing the linked list

class LinkedList2 {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private static void printL(Node n) {
		while (n != null) {
			System.out.print(n.data + "  ->");
			n = n.next;
		}
		System.out.println();

	}

	private static Node reverse(Node node) {
		Node prev = null, next = null, current = node;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

	public static void main(String[] args) {
		LinkedList2 l = new LinkedList2();
		l.head = new Node(10);
		l.head.next = new Node(20);
		l.head.next.next = new Node(30);
		l.head.next.next.next = new Node(40);
		l.head.next.next.next.next = new Node(50);
		printL(head);
		
		printL(reverse(head));
	}

}

// This code has been contributed by Mayank Jaiswal
