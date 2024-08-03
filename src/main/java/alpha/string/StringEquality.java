package alpha.string;

public class StringEquality {
	public static void main(String[] args) {
		String s1 = "tony";
		String s2 = "tony";
		String s3 = new String("tony");
		if (s1 == s2) {
			System.out.println("s1 and s2 are equal");
		} else {
			System.out.println("s1 and s2 are not equal");
		}
		/*
		 * When s2 is creates, as there is an existing string with the same value, java
		 * will point the new string object to the old location itself. So both s1 and
		 * s2 has referance to same object.
		 */

		/*
		 * Interning - s1 is initially created in stack and the variable s1 points to
		 * the memory location in heap which contains "Tony". When s2 is created, a new
		 * variable is created in stack but it points to the same memory address in heap
		 * that was created earlier. This is called interning.
		 * s1 and s2 are created in the common string pool
		 */

		/*
		 * When new keyword is used a new memory is altogether assigned
		 */ if (s1 == s3) {
			System.out.println("s1 and s3 are equal");
		} else {
			System.out.println("s1 and s3 are not equal");
		}
		/*
		 * When new keyword is used a new object gets created, which all together has a
		 * new location in memory. Hence, comparison of the locations fail
		 */
	}

}
