package recursion;

public class AllXinTheEnd {

	private static void xInTheEnd(String str, int idx, char c, int count, String opStr) {
		if (idx == str.length()) {
			for (int i = 0; i < count; i++) {
				opStr = opStr + "x";
			}
			System.out.println(opStr);
			return;
		}
		if (c == str.charAt(idx)) {
			count++;
		} else {
			opStr = opStr + str.charAt(idx);
		}
		xInTheEnd(str, ++idx, c, count, opStr);

	}

	public static void main(String[] args) {
		String str = "acfdfxsfsxxxdsfsxxsfdfdfx";
		int idx = 0;
		char c = 'x';
		xInTheEnd(str, idx, c, 0, "");
	}

}
