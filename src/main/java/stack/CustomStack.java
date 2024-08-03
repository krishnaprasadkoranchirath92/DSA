package stack;

public class CustomStack {
	protected int[] data;
	private static final int DEFAULT_SIZE = 10;
	private int pointer = -1;

	public CustomStack(int size) {
		super();
		this.data = new int[size];
	}

	public CustomStack() {
		this(DEFAULT_SIZE);
	}

	public boolean push(int item) {
		if (isFull()) {
			System.out.println("Stack is full");
			return false;
		}
		pointer++;
		data[pointer] = item;
		return true;
	}
	
	public int pop() throws StackException {
		if(isEmpty()) {
			throw new StackException("Cannot pop from an empty stack");
		}
		return data[pointer--];
	}
	
	public int peek() throws StackException {
		if(isEmpty()) {
			throw new StackException("Cannot peek from an empty stack");
		}
		return data[pointer];
	}

	public boolean isFull() {
		return (data.length - 1 == pointer);
	}

	public boolean isEmpty() {
		return (-1 == pointer);
	}

}
