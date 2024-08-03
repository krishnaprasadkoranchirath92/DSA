package alpha.heaps;

import java.util.PriorityQueue;

public class ConnectNropes {

	public static void main(String[] args) {
		int[] ropes = { 2, 3, 3, 4, 6 };
		int cost = findMinCost(ropes);
		System.out.println("Minimum cost = " + cost);
	}

	private static int findMinCost(int[] ropes) {
		int cost = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int rope : ropes) {
			pq.add(rope);
		}
		while (pq.size() > 1) {
//			int ct = pq.remove()+pq.remove();
			int min1 = pq.remove();
			int min2 = pq.remove();
			int c = min1 + min2;
			pq.add(c);
			cost += c;
		}

		return cost;
	}

}
