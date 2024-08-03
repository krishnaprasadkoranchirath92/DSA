package alpha.string;

public class Palindrome {

	public static void main(String[] args) {
		String str = "abchba";
		boolean ispalindrome = isPalindrome(str);
		System.out.println(ispalindrome);
	}

	private static boolean isPalindrome(String str) {
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
