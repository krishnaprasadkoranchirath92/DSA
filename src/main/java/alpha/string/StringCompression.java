package alpha.string;

public class StringCompression {

	public static void main(String[] args) {
		String str = "aaalllddfggttoo";
		String sc = stringCompressor(str);
		System.out.println(sc);
	}

	private static String stringCompressor(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}
			sb.append(str.charAt(i));
			if (count > 1) {
				sb.append(count);
			}
		}
		return sb.toString();
	}

//	private static String stringCompressor(String str) {
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < str.length();) {
//			char ch = str.charAt(i);
//			sb.append(ch);
//			i++;
//			int count = 1;
//			while (i < str.length() && str.charAt(i) == ch) {
//				count++;
//				i++;
//			}
//			if (count > 1) {
//				sb.append(count);
//			}
//		}
//
//		return sb.toString();
//
//	}

}
