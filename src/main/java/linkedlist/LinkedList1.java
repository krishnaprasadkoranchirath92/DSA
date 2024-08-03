package linkedlist;

class LinkedList1 {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void push(int d) {
		Node node = new Node(d);
		node.next = head;
		head = node;
	}

	public void main(String[] args) {
		LinkedList2 ll = new LinkedList2();
//		ll.push(1);
//		ll.push(2);
//		ll.push(3);
		printNthFromLast(2);
	}

	private void printNthFromLast(int n) {
		int c = 0;
		Node refPt = head, mnPt = head;
		while (c < n) {
			refPt = refPt.next;
			mnPt = mnPt.next;
			c++;
		}

	}

}
