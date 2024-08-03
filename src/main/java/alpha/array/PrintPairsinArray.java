package alpha.array;

public class PrintPairsinArray {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 8 };
		System.out.println(printPairs(arr));
	}

	private static int printPairs(int[] arr) {
		int pairs = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				System.out.print("(" + arr[i] + "," + arr[j] + ")");
				pairs++;
			}
			System.out.println();
		}
		return pairs;
	}

}
