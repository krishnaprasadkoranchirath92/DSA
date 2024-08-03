package alpha.oops;

import java.util.Arrays;

public class ShallowAndDeepCopy {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		Student s1 = new Student(1, arr);
		System.out.println(s1);
		Student s2 = new Student(s1);
		System.out.println(s2);
		s1.arr[2] = 0;
		s1.id = 2;
		System.out.println(s1);
		System.out.println(s2);

	}
}

class Student {
	int id;
	int[] arr = new int[3];

	public Student(int id, int[] arr) {
		this.id = id;
		this.arr = arr;
	}

	// Shallow copy
	/*
	 * public Student(Student s) { this.id = s.id; this.arr = s.arr; }
	 */

	// Deep copy
	public Student(Student s) {
		this.arr = new int[3];
		this.id = s.id;
		for (int i = 0; i < arr.length; i++) {
			this.arr[i] = s.arr[i];
		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", arr=" + Arrays.toString(arr) + "]";
	}

}
