package alpha.recursion;

public class LastOccuranceOfElement {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 2, 5, 1 };
		int target = 7;
		System.out.println(getLastOccurance(arr, target, 0));
	}

	private static int getLastOccurance(int[] arr, int target, int i) {
		if (i == arr.length) {
			return -1;
		}
		int idx = getLastOccurance(arr, target, i + 1);
		if (idx == -1 && arr[i] == target) {
			return i;
		}
		return idx ;
	}

}
