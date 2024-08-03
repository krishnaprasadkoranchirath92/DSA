package alpha.heaps;

import java.util.PriorityQueue;

class Pair implements Comparable<Pair> {

	int number;
	int index;

	public Pair(int number, int index) {
		super();
		this.number = number;
		this.index = index;
	}

	@Override
	public int compareTo(Pair p) {
		return p.number - this.number;
	}

}

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		int k = 3;
		int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int[] result = new int[arr.length - k + 1];
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		for (int i = 0; i < k; i++) {
			pq.add(new Pair(arr[i], i));
		}
		result[0] = pq.peek().number;

		for (int i = k; i < arr.length; i++) {
			while (!pq.isEmpty() && pq.peek().index < i - k + 1) {
				pq.remove();
			}
			pq.add(new Pair(arr[i], i));
			result[i-k+1] = pq.peek().number;
		}

		for (int n : result) {
			System.out.println(n + " ");
		}
	}

}
