package alpha.queue;

public class QueueImplLinkedList {

	static class QueueLL {
		Node head = null;
		Node tail = null;

		boolean isEmpty() {
			return tail == null;
		}

		void add(int data) {
			Node node = new Node(data);
			if (isEmpty()) {
				head = tail = node;
				return;
			}
			tail.next = node;
			tail = tail.next;
		}

		int remove() {
			if (isEmpty()) {
				System.out.println("Queus is Empty!");
				return -1;
			}
			int data = head.data;
			if (tail == head) {
				tail = head = null;
			} else {
				head = head.next;
			}
			return data;
		}

		int peek() {
			if (isEmpty()) {
				System.out.println("Queus is Empty!");
				return -1;
			}
			return head.data;
		}
	}

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		QueueLL que = new QueueLL();
		que.add(1);
		que.add(2);
		que.add(3);
		que.remove();
		while (!que.isEmpty()) {
			System.out.println(que.peek());
			que.remove();
		}
	}
}
