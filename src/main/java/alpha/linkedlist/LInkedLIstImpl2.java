package alpha.linkedlist;

public class LInkedLIstImpl2 {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	private static boolean isCyclic() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		}
		return false;
	}

	public static void removeLoop() {
		Node slow = head;
		Node fast = head;
		boolean isLoop = false;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				isLoop = true;
				break;
			}
		}
		if (isLoop) {
			slow = head;
			Node prev = null;
			while (slow != fast) {
				slow = slow.next;
				prev = fast;
				fast = fast.next;
			}
			prev.next = null;
		}
	}

	private static void printLinkedList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data +" ->");
			temp = temp.next;
		}
		System.out.print("NULL");
	}

	public static void main(String[] args) {
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = head.next.next;
		System.out.println(isCyclic());
		removeLoop();
		printLinkedList();
	}

}
