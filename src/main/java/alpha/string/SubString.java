package alpha.string;

public class SubString {
	public static void main(String[] args) {
		String str = "Hello";
		String s = subString(str, 1, 3);
		System.out.println(s);
		System.out.println(str.substring(1, 3));
	}

	private static String subString(String str, int si, int ei) {
		String subStr = "";
		for (int i = si; i < ei; i++) {
			subStr += str.charAt(i);
		}
		return subStr;
	}
}
