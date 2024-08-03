package alpha.functions;

public class DecimalToBinary {
	
	public static void main(String[] args) {
		convertDecimalToBinary(9);
	}

	private static void convertDecimalToBinary(int num) {
		
		int bin =0, p = 0, rem = 0;
		
		while(num >0) {
			rem = num%2;
			bin = (int) (bin+Math.pow(10, p)*rem);
			p++;
			num/=2;
		}
		System.out.println(bin);
	}

}
