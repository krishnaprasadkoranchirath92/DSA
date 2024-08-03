package alpha.heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

class Student implements Comparable<Student> {
	int rollNo;
	String name;

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public int compareTo(Student s) {
		return this.rollNo - s.rollNo;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	

}

public class Classroom {

	public static void main(String[] args) {
		PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
		pq.add(new Student(6, "a"));
		pq.add(new Student(4, "l"));
		pq.add(new Student(12, "o"));
		pq.add(new Student(16, "p"));
		pq.add(new Student(14, "w"));
		pq.add(new Student(2, "e"));
		while(!pq.isEmpty()) {
			System.out.println(pq.peek());
			pq.remove();
		}
	
	}
}
