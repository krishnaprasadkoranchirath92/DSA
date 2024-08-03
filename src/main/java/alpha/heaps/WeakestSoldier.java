package alpha.heaps;

import java.util.PriorityQueue;

class ArmyRow implements Comparable<ArmyRow> {
	int rowNo;
	int soldierCount;

	@Override
	public int compareTo(ArmyRow row) {
		if (this.soldierCount == row.soldierCount) {
			return this.rowNo - row.rowNo;
		}
		return this.soldierCount - row.soldierCount;
	}

	public ArmyRow(int rowNo, int soldierCount) {
		super();
		this.rowNo = rowNo;
		this.soldierCount = soldierCount;
	}

}

public class WeakestSoldier {

	public static void main(String[] args) {
		int[][] soldiersRow = { { 1, 0, 0, 0 }, { 1, 1, 1, 1 }, { 1, 0, 0, 0 }, { 1, 0, 0, 0 } };
		int k = 2;
		PriorityQueue<ArmyRow> pq = new PriorityQueue<>();
		int i = 0;
		for (int[] row : soldiersRow) {
			int soldierCount = 0;
			for (int r : row) {
				soldierCount += r;
			}
			pq.add(new ArmyRow(i++, soldierCount));
		}
		for (int idx = 0; idx < k; idx++) {
			System.out.println("Row-" + pq.remove().rowNo);
		}
	}
}
