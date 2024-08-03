package alpha.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxLengthChainOfPairs {

	public static void main(String[] args) {
		int[][] pairs = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
		getLongestChain(pairs);
	}

	private static void getLongestChain(int[][] pairs) {
		Arrays.sort(pairs, Comparator.comparingInt(e -> e[1]));
		List<int[]> chain = new ArrayList<>();
		if (pairs.length > 0) {
			chain.add(pairs[0]);
		}
		int lastEnd = pairs[0][1];
		for (int i = 1; i < pairs.length; i++) {
			if (pairs[i][0] > lastEnd) {
				chain.add(pairs[i]);
				lastEnd = pairs[i][1];
			}
		}
		System.out.println(chain.size());
	}

}
