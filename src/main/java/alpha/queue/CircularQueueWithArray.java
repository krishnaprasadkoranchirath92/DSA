package alpha.queue;

public class CircularQueueWithArray {

	static class Queue {
		static int arr[];
		static int front;
		static int rear;
		static int size;

		public Queue(int n) {
			arr = new int[n];
			front = rear = -1;
			size = 0;
		}

		static boolean isEmpty() {
			return rear == -1;
		}

		static boolean isFull() {
			return rear == front;
		}

		static void add(int data) {
			if (isFull()) {
				System.out.println("Queue is Full!");
				return;
			}
			if (front == -1) {
				front = 0;
			}
			rear = (rear + 1) % size;
			arr[rear] = data;
		}

		static int remove() {
			if (isEmpty()) {
				System.out.println("Queue is Empty !");
				return -1;
			}
			int f = front;
			if(front == rear) {
				front = rear = -1;
			} else {
				front = (front + 1) % size;
			}
			return arr[f];
		}

		static int peek() {
			if (isEmpty()) {
				System.out.println("Queus is Empty!");
				return -1;
			}
			return arr[front];
		}
	}

	public static void main(String[] args) {
		Queue q = new Queue(3);
		q.add(1);
		q.add(2);
		q.add(3);
		q.remove();
		q.add(4);
		while(q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}

	}
}
