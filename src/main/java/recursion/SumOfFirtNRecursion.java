package recursion;

public class SumOfFirtNRecursion {

	public static void main(String[] args) {
//		System.out.println(sumOfFirstnNaturalNumbers(n));
		int n = 1;
		int limit = 10;
		System.out.println(sumOfFirstnNaturalNumbers(n, limit));
	}

//	private static int sumOfFirstnNaturalNumbers(int n) {
//		if(n == 0) {
//			return 0;
//		}
//		return n + sumOfFirstnNaturalNumbers(n - 1);
//		
//	}
	
	private static int sumOfFirstnNaturalNumbers(int n, int limit) {
		if(n > limit) {
			return 0;
		}
		return n + sumOfFirstnNaturalNumbers(n+1, limit);
		
	}
}
