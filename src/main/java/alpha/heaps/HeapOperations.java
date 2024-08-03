package alpha.heaps;

import java.util.ArrayList;
import java.util.List;

public class HeapOperations {

	public static void main(String[] args) {
		Heap heap = new Heap();
		heap.add(3);
		heap.add(4);
		heap.add(1);
		heap.add(5);
		while(!heap.isEmpty()) {
			System.out.println(heap.peek());
			heap.remove();
		}
	}
}

class Heap {
	List<Integer> arr = new ArrayList<>();
	
	public boolean isEmpty() {
		return arr.size() == 0;
	}
	
	public void add1(int data) {
		arr.add(data);
		int childIdx = arr.size()-1;
		int parIdx = (childIdx - 1)/2;
		while(arr.get(childIdx) < arr.get(parIdx)) {
			int temp = arr.get(parIdx);
			arr.set(parIdx, arr.get(childIdx));
			arr.set(childIdx, temp);
			childIdx = parIdx;
			parIdx = (childIdx-1)/2;
		}
	}
	
	
	
	
	
	
	

	public void add(int data) {
		arr.add(data);
		int childIdx = arr.size() - 1;
		int parentIdx = (childIdx - 1) / 2;
		while (arr.get(childIdx) < arr.get(parentIdx)) {
			int temp = arr.get(childIdx);
			arr.set(childIdx, arr.get(parentIdx));
			arr.set(parentIdx, temp);
			childIdx = parentIdx;
			parentIdx = (childIdx - 1) / 2;
		}
	}

	public int peek() {
		return arr.get(0);
	}

	private void heapify(int idx) {
		int left = 2 * idx + 1;
		int right = 2 * idx + 2;
		int minIdx = idx;
		if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
			minIdx = left;
		}
		if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
			minIdx = right;
		}
		if (minIdx != idx) {
			int temp = arr.get(idx);
			arr.set(idx, arr.get(minIdx));
			arr.set(minIdx, temp);
			heapify(minIdx);
		}
	}

	public int remove() {
//		Step -1 - Store first element -> to delete and return		
		int data = arr.get(0);

//		Step -2 - Swap first and last elements		
		int temp = arr.get(0);
		arr.set(0, arr.get(arr.size() - 1));
		arr.set(arr.size() - 1, temp);

//		Step-3 - Remove
		arr.remove(arr.size() - 1);

//		Step-4 -  Heapify
		heapify(0);

		return data;
	}
}