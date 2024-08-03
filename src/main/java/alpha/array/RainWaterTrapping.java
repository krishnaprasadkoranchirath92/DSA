package alpha.array;

public class RainWaterTrapping {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 0, 6, 3, 2, 5 };
		int maxRainTrapped = trappedRainWater(arr);
		System.out.println(maxRainTrapped);
	}

	private static int trappedRainWater(int[] arr) {
		int maxRainTrapped = 0;
		int n = arr.length;
		int maxLeft[] = new int[n];
		maxLeft[0] = arr[0];
		for (int i = 1; i < n; i++) {
			maxLeft[i] = Math.max(arr[i], maxLeft[i - 1]);
		}
		int maxRight[] = new int[n];
		maxRight[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			maxRight[i] = Math.max(maxRight[i + 1], arr[i]);
		}
		for (int i = 0; i < n; i++) {
			int waterLevel = Math.min(maxLeft[i], maxRight[i]);
			maxRainTrapped += waterLevel - arr[i];
		}

		return maxRainTrapped;
	}
}
