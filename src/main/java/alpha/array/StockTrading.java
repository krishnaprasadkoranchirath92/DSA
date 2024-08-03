package alpha.array;

public class StockTrading {

	public static void main(String[] args) {
		int stockPrice[] = { 7, 1, 5, 3, 6, 4 };
		int maxProfit = getMaxProfit(stockPrice);
		System.out.println(maxProfit);
	}

	private static int getMaxProfit(int[] arr) {
		int maxProfit = 0;
		int minBP = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >minBP) {
				int profit= arr[i]-minBP;
				maxProfit = Math.max(profit, maxProfit);
			} else {
				minBP = arr[i];
			}
		}
		return maxProfit;
	}
}
