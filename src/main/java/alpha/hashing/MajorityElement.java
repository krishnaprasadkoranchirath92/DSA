package alpha.hashing;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
		findMajorityElement(nums);
	}

	private static void findMajorityElement(int[] nums) {
		int n = nums.length;
		Map<Integer, Integer> freq = new HashMap<>();
		for (int num : nums) {
			freq.put(num, freq.getOrDefault(num, 0) + 1);
//			if (!freq.containsKey(num)) {
//				freq.put(num, 1);
//			} else {
//				int c = freq.get(num);
//				freq.put(num, c + 1);
//			}
		}
		for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
			if (entry.getValue() >= nums.length / 3) {
				System.out.println(entry.getKey());
			}
		}
		System.out.println(freq);
	}

}
