package alpha.functions;

public class BinaryToDecimal {

	public static void main(String[] args) {
		convertBinaryTODecimal(101);
	}

	private static void convertBinaryTODecimal(int num) {
		int pow = 0;
		int lastDigit;
		int dec = 0;
		int temp = num;
		while (num > 0) {
			lastDigit = num % 10;
			dec += lastDigit * Math.pow(2, pow);
			pow++;
			num /= 10;
		}
		System.out.println("Decimal of Binary - " + temp + " = " + dec);

	}

}
