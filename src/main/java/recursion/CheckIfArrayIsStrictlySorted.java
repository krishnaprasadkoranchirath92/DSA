package recursion;

public class CheckIfArrayIsStrictlySorted {

	private static boolean isStrictlySorted(int[] arr, int i) {
		if (i == arr.length - 1) {
			return true;
		}
		if (arr[i] >= arr[i + 1]) {
			return false;
		} 
		return isStrictlySorted(arr, i + 1);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2,  3, 4 };
		System.out.println(isStrictlySorted(arr, 0));
	}

}
