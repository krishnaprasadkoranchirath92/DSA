package alpha.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapSack {

	public static void main(String[] args) {
		int value[] = { 60, 100, 120 };
		int weight[] = { 10, 20, 30 };
		int totalWeight = 50;
		getMaxValue(value, weight, totalWeight);
		getMaxValueWithSorting(value, weight, totalWeight);
		getMaxValueWithSorting1(value, weight, totalWeight);
	}

	private static void getMaxValueWithSorting1(int[] value, int[] weight, int totalWeight) {
		double[][] ratio = new double[value.length][2];
		int remainingCapacity = totalWeight;
		double totalValue = 0;
		for (int i = 0; i < value.length; i++) {
			ratio[i][0] = i;
			ratio[i][1] = value[i] / (double) weight[i];
		}
		Arrays.sort(ratio, Comparator.comparingDouble(e -> e[1]));
		for (int i = ratio.length - 1; i >= 0; i--) {
			int idx = (int) ratio[i][0];
			if (weight[idx] <= remainingCapacity) {
				totalValue = totalValue + value[idx];
				remainingCapacity = remainingCapacity - weight[idx];
			} else {
				totalValue = totalValue + ratio[i][1] * remainingCapacity;
				remainingCapacity = 0;
				break;
			}
		}
		System.out.println("Total Value = " + totalValue);

	}

	private static void getMaxValueWithSorting(int[] value, int[] weight, int totalWeight) {
		double[][] ratio = new double[value.length][4];
		for (int i = 0; i < value.length; i++) {
			ratio[i][0] = i;
			ratio[i][1] = value[i] / (double) weight[i];
			ratio[i][2] = value[i];
			ratio[i][3] = weight[i];
		}
		Arrays.sort(ratio, Comparator.comparingDouble(e -> e[1]));
		int remainingCapacity = totalWeight;
		double totalValue = 0;

		for (int i = value.length - 1; i >= 0; i--) {
			if ((int) ratio[i][3] <= remainingCapacity) {
				totalValue = totalValue + ratio[i][2];
				remainingCapacity = remainingCapacity - (int) ratio[i][3];
			} else {
				totalValue = totalValue + (ratio[i][1] * (double) remainingCapacity);
				remainingCapacity = 0;
				break;
			}
		}
		System.out.println("Total Value = " + totalValue);
	}

	private static void getMaxValue(int[] value, int[] weight, int totalWeight) {
		int ratio[] = new int[value.length];
		for (int i = 0; i < value.length; i++) {
			ratio[i] = value[i] / weight[i];
		}
		int remainingCapacity = totalWeight;
		int totalValue = 0;
		for (int i = 0; i < value.length; i++) {
			if (weight[i] <= remainingCapacity) {
				remainingCapacity = remainingCapacity - weight[i];
				totalValue = totalValue + value[i];
			} else {
				totalValue = totalValue + ratio[i] * remainingCapacity;
				remainingCapacity = 0;
				break;
			}
		}
		System.out.println("Total Value = " + totalValue);
	}

}
