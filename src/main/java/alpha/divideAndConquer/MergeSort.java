package alpha.divideAndConquer;

public class MergeSort {
	private static void mergeSort(int[] arr, int si, int ei) {
		if (si >= ei) {
			return;
		}
		int mid = si + (ei - si) / 2;
		mergeSort(arr, si, mid);
		mergeSort(arr, mid + 1, ei);
		merge(arr, si, mid, ei);
	}

	private static void merge(int[] arr, int si, int mid, int ei) {
		int k = 0, i = si, j = mid + 1;
		int temp[] = new int[ei - si + 1];
		while (i <= mid && j <= ei) {
			if (arr[i] < arr[j]) {
				temp[k] = arr[i];
				i++;
			} else {
				temp[k] = arr[j];
				j++;
			}
			k++;
		}
		while (i <= mid) {
			temp[k++] = arr[i++];
		}
		while (j <= ei) {
			temp[k++] = arr[j++];
		}
		for (i = si, k = 0; k < temp.length; k++, i++) {
			arr[i] = temp[k];
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 8, 1, 6, 4 };
		mergeSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}

}
