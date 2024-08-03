package alpha.linkedlist;

import java.util.LinkedList;

public class ClassRoom {
	static Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	private static Node findMid(Node head) {
		Node slow = head;
		Node fast = head.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static Node mergeSort(Node head) {
		// find mid
		if (head == null || head.next == null) {
			return head;
		}
		Node mid = findMid(head);
		// call merge sort for left and right
		Node rightHead = mid.next;
		mid.next = null;
		Node l = mergeSort(head);
		Node r = mergeSort(rightHead);
		Node h = mergeLnR(l, r);
		// merge LHS and RHS

		return h;
	}

	private static Node mergeLnR(Node l, Node r) {
		Node hd = new Node(-1);
		Node temp = hd;
		while (l != null && r != null) {
			if (l.data > r.data) {
				temp.next = r;
				r = r.next;
			} else {
				temp.next = l;
				l = l.next;
			}
			temp = temp.next;
		}
		while (l != null) {
			temp.next = l;
			l = l.next;
			temp = temp.next;
		}
		while (r != null) {
			temp.next = r;
			r = r.next;
			temp = temp.next;
		}
		return hd.next;
	}

	static void printLInkedList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ->");
			temp = temp.next;
		}
		System.out.print("NULL");
		System.out.println();
	}

	private Node zigZagLL(Node head) {

//		find mid
		Node slow = head, fast = head.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		Node h2 = slow.next;
		slow.next = null;
		Node prev = null, curr = h2, next;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		Node rev = prev;

		Node temp = new Node(-1);
		Node nxtL, nxtR;
		while (head != null && rev != null) {
			nxtL = head.next;
			head.next = rev;
			nxtR = rev.next;
			rev.next = nxtL;
			head = nxtL;
			rev = nxtR;
		}
		return this.head;

//		reverse second half

	}

	public static void main(String[] args) {
//		LinkedList<Integer> ll = new LinkedList<>();
//		ll.addFirst(2);
//		ll.addFirst(1);
//		ll.addLast(4);
//		ll.add(5);
//		ll.add(3);
//		ll.add(6);
//		System.out.println(ll);
//		ll.removeLast();
//		ll.removeFirst();
//		System.out.println(ll);
//		ll.remove();
//		System.out.println(ll);
		ClassRoom ll = new ClassRoom();
		ll.head = new Node(8);
		head.next = new Node(9);
		head.next.next = new Node(2);
		head.next.next.next = new Node(5);
		head.next.next.next.next = new Node(4);
		printLInkedList(head);
//		printLInkedList(mergeSort(head));
		Node h = ll.zigZagLL(head);
		printLInkedList(h);
	}

}
