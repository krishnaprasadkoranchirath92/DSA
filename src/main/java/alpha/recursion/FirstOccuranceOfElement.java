package alpha.recursion;

public class FirstOccuranceOfElement {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 2, 5, 1 };
		int target = 1;
		int idx = getFirstOccurance(arr, 0, target);
		System.out.println(idx);
	}

	private static int getFirstOccurance(int[] arr, int i, int target) {
		if (i == arr.length) {
			return -1;
		}
		if (arr[i] == target) {
			return i;
		}
		return getFirstOccurance(arr, i + 1, target);
	}

}
