package recursion;

public class ReverseString {
	
	private static void revStr(String s, int i) {
		if(i<0) {
			return;
		}
		System.out.print(s.charAt(i));
		revStr(s, --i);
	}

	public static void main(String[] args) {
		String s = "abcdef";
		revStr(s, s.length() - 1);
	}

}
