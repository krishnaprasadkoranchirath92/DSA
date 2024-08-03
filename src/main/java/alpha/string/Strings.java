package alpha.string;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {

		String str = "zjhff";
		String str1 = new String("kkdasdasdas");
//		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
//		System.out.println(s);
//		String s1 = sc.nextLine();
//		System.out.println(s1);
		printAllLetters(str1);

	}

	private static void printAllLetters(String str1) {
		for (int i = 0; i < str1.length(); i++) {
			System.out.print(str1.charAt(i) + " ");
		}
		System.out.println();
	}

}
