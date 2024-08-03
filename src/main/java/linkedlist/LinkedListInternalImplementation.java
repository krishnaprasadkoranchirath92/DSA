package linkedlist;

import java.util.LinkedList;

public class LinkedListInternalImplementation {
	static Node head;
	static int size;

	LinkedListInternalImplementation() {
		size =0;
	}

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addFirst(int data) {
		size++;
		Node node = new Node(data);
		if (head == null) {
			head = node;
			return;
		}
		node.next = head;
		head = node;
	}

	private void addLast(int data) {
		size++;
		Node node = new Node(data);
		Node n = head;
		while (n.next != null) {
			n = n.next;
		}
		n.next = node;

	}

	public void printElements(Node node) {
		if (head != null) {
			while (node != null) {
				System.out.print(node.data + " -> ");
				node = node.next;
			}
		}
		System.out.print("NULL");
	}

	private void deleteFirst() {
		if (head == null) {
			System.out.println("LinkedList is empty!");
		}
		size--;
		head = head.next;
	}

	private void deleteLast() {
		if (head == null) {
			System.out.println("LinkedList is empty!");
			return;
		}
		size--;
		if (head.next == null) {
			head = null;
			return;
		}
		Node secondLast = head;
		Node last = head.next;
		while (last.next != null) {
			last = last.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}

	public static void main(String[] args) {
		LinkedListInternalImplementation ll = new LinkedListInternalImplementation();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		ll.printElements(head);
		ll.addLast(0);
		System.out.println();
		ll.printElements(head);
		ll.deleteFirst();
		System.out.println();
		ll.printElements(head);
		ll.deleteLast();
		System.out.println();
		ll.printElements(head);
		System.out.println(ll.getSize());
		LinkedList<Integer> l = new LinkedList<>();
		l.add(4);
		l.add(5);
		System.out.println(l);
		
	}

	private int getSize() {
		return size;
	}

}
