package alpha.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinCurrncyDinominations {
	public static void main(String[] args) {

		Integer[] currency = { 7, 2000, 500, 100, 50, 20, 10, 5, 2, 1 };
		int total = 598;
		minCoins(currency, total);

	}

	private static void minCoins(Integer[] currency, int total) {
		Arrays.parallelSort(currency, Comparator.reverseOrder());
		int reminder = total;
		int count = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < currency.length; i++) {
			if (currency[i] <= reminder) {
				int freq = reminder / currency[i];
				for (int j = 0; j < freq; j++) {
					list.add(currency[i]);
				}
				reminder %= currency[i];
				count = count + freq;
			}
		}
		System.out.println(count);
		System.out.println();
		list.forEach(e-> System.out.println(e));
	}
}
