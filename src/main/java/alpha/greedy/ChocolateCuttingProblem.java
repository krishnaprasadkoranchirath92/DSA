package alpha.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class ChocolateCuttingProblem {
	public static void main(String[] args) {
		int n = 4, m = 6;
		Integer[] hc = { 4, 1, 2 };
		Integer[] vc = { 2, 1, 3, 1, 4 };
		getMinCuttingCost(hc, vc);
		Arrays.sort(hc, Comparator.reverseOrder());
		Arrays.sort(vc, Comparator.reverseOrder());
		int h = 0, v = 0;
		int hp = 1, vp = 1;
		int cost = 0;
		while (h < hc.length && v < vc.length) {
			if (hc[h] > vc[v]) {
				cost = cost + hc[h] * vp;
				h++;
				hp++;
			} else {
				cost = cost + vc[v] * hp;
				v++;
				vp++;
			}
		}
		while (h < hc.length) {
			cost = cost + hc[h] * vp;
			h++;
			hp++;
		}
		while (v < vc.length) {
			cost = cost + vc[v] * hp;
			v++;
			vp++;
		}
		System.out.println("Cost= " + cost);

	}

	private static void getMinCuttingCost(Integer[] hc, Integer[] vc) {
		Arrays.sort(hc, Comparator.reverseOrder());
		Arrays.sort(vc, Comparator.reverseOrder());
		int h = 0, v = 0, hp = 1, vp = 1, cost = 0;
		while (h < hc.length && v < vc.length) {
			if (hc[h] > vc[v]) {
				cost += hc[h] * vp;
				hp++;
				h++;
			} else {
				cost += vc[v] * hp;
				vp++;
				v++;
			}
		}
		while (h < hc.length) {
			cost += hc[h] * vp;
			h++;
			hp++;
		}
		while (v < vc.length) {
			cost += vc[v] * hp;
			hp++;
			h++;
		}
		System.out.println("Minimum cost = " + cost);
	}
}
