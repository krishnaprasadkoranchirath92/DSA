package alpha.queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingCharacter {

	public static void firstNonRepeatingChar(String str) {
		Queue<Character> queue = new LinkedList<>();
		int freq[] = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			queue.add(ch);
			freq[ch - 'a']++;
			while (!queue.isEmpty() && 1 < freq[queue.peek() - 'a']) {
				queue.remove();
			}
			if (queue.isEmpty()) {
				System.out.print(-1 + " ");
			} else {
				System.out.print(queue.peek() + " ");
			}
		}
	}

	public static void main(String[] args) {
		String str = "aabccxb";
		firstNonRepeatingChar(str);
	}
}
