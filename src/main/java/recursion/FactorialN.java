package recursion;

public class FactorialN {
	
	private static int fact(int n) {
		if(n ==1 || n==0) {
			return 1;
		}
		return n*fact(n-1);
	}
	
	public static void main(String[] args) {
		int n=3;
		System.out.println(fact(n));
	}


}
