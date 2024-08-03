package alpha.string;

public class AlphabaticallyLastString {
	
	public static void main(String[] args) {
		String[] arr = {"as","de","se"};
		String lastStr = getLastStringLexicographically(arr);
		System.out.println(lastStr);
	}

	private static String getLastStringLexicographically(String[] arr) {
		String str = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(str.compareToIgnoreCase(arr[i])<0) {
				str = arr[i];
			}
		}
		return str;
	}

}
