package alpha.array;

public class LinearSearch {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 8, 6, 4 };
		int key = 1;
		int index = linearSearch(numbers, key);
		if (index == -1) {
			System.out.println(key + " not found");
		} else {
			System.out.println(key + " found in index : " + index);
		}
	}

	private static int linearSearch(int[] numbers, int key) {
		for (int i = 0; i < numbers.length; i++) {
			if (key == numbers[i]) {
				return i;
			}
		}
		return -1;
	}

}
