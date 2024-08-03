package alpha.divideAndConquer;

public class QuickSort {

	public static void main(String[] args) {
		int arr[] = { 2, 8, 1, 6, 4, -9 };
		printArray(arr);
		quickSort(arr, 0, arr.length - 1);
		printArray(arr);
	}

	private static void quickSort(int[] arr, int si, int ei) {
		if (si >= ei) {
			return;
		}
		int pidx = partition(arr, si, ei);
		quickSort(arr, pidx + 1, ei);
		quickSort(arr, si, pidx - 1);
	}

	private static int partition(int[] arr, int si, int ei) {
		int pivot = arr[ei];
		int temp;
		int i = si - 1;
		for (int j = si; j < ei; j++) {
			if (arr[j] <= pivot) {
				i++;
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		i++;
		temp = arr[ei];
		arr[ei] = arr[i];
		arr[i] = temp;
		return i;
	}

	private static void printArray(int[] arr) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

}
