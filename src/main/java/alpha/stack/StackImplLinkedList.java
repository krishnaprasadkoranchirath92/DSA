package alpha.stack;

import java.util.Stack;

public class StackImplLinkedList {

	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

//	public static class Stack {
//		static Node head = null;
//
//		public boolean isEmpty() {
//			return head == null;
//		}
//
//		public void push(int data) {
//			Node node = new Node(data);
//			if (head == null) {
//				head = node;
//				return;
//			}
//			node.next = head;
//			head = node;
//		}
//
//		public int pop() {
//			if (isEmpty()) {
//				return -1;
//			}
//			int val = head.data;
//			head = head.next;
//			return val;
//		}
//
//		public int peek() {
//			if (isEmpty()) {
//				return -1;
//			}
//			return head.data;
//		}
//	}

	public static void main(String[] args) {
//		Stack s = new Stack();
		Stack<Integer> s = new Stack<>();
		
		s.push(3);
		s.push(2);
		s.push(1);
		while (!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}

}
