package alpha.heaps;

import java.util.PriorityQueue;

class Car implements Comparable<Car> {
	int x;
	int y;
	int distSq;
	int idx;

	@Override
	public int compareTo(Car car) {
		return this.distSq - car.distSq;
	}

	public Car(int x, int y, int distSq, int idx) {
		super();
		this.x = x;
		this.y = y;
		this.idx = idx;
		this.distSq = distSq;

	}

	@Override
	public String toString() {
		return "Car [x=" + x + ", y=" + y + ", distSq=" + distSq + "]";
	}

}

public class NearestKcars {

	public static void main(String[] args) {
		int[][] cars = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
		int k = 2;
		PriorityQueue<Car> pq = new PriorityQueue<>();
		int idx = 0;
		for (int[] car : cars) {
			pq.add(new Car(car[0], car[1], car[0] * car[0] + car[1] * car[1], idx++));
		}
//		for (Car car : pq) {
//			System.out.println(car);
//		}
		for (int i = 0; i < k; i++) {
			System.out.println("Car-" + pq.remove().idx);
		}
//		for (int i = 0; i < k; i++) {
//			System.out.println(pq.remove());
//		}
	}
}
