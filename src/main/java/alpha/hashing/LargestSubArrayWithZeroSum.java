package alpha.hashing;

import java.util.HashMap;
import java.util.Map;

public class LargestSubArrayWithZeroSum {
	
	public static void main(String[] args) {
		int arr[] = {15,-2,2,-8,1,7,10};
		getLargestSubArrayWithZeroSum(arr);
	}

	private static void getLargestSubArrayWithZeroSum(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		int l =0;
		int i1=0,i2=0;
		for(int i=0; i<arr.length;i++) {
			sum = sum+arr[i];
			if(map.containsKey(sum)) {
				int prevSumElmnt = map.get(sum);
//				l = Math.max(l, i-prevSumElmnt);
				if(l< i-prevSumElmnt) {
					i1 = prevSumElmnt;
					i2 = i;
				}
				
			} else {
				map.put(sum, i);
			}
		}
		for(int i = i1+1; i<=i2;i++) {
			System.out.print(arr[i]+ " ");
		}
//		System.out.println(l);
	}

}
