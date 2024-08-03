package alpha.hashing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashMapCode {
	class HashMap<K, V> {
		private class Node {
			K key;
			V value;

			public Node(K key, V value) {
				super();
				this.key = key;
				this.value = value;
			}
		}

		int N = 4;
		int n = 0;
		LinkedList<Node> buckets[];

		public HashMap() {
			buckets = new LinkedList[N];
			for (LinkedList ll : buckets) {
				ll = new LinkedList<Node>();
			}
		}

		public void put(K key, V value) {
			int bi = getHashCode(key);
			int di = getLLIdx(key, bi);
			if (di != -1) {
				Node node = buckets[bi].get(di);
				node.value = value;
			} else {
				buckets[bi].add(new Node(key, value));
				n++;
			}
			double lambda = n / N;
			int threshold = 2;
			if (lambda > threshold) {
				rehash();
			}
		}

		private void rehash() {
			N = 2 * N;
			LinkedList<Node> oldHashMap[] = buckets;
			buckets = new LinkedList[N];
			for (LinkedList<Node> ll : oldHashMap) {
				for (int i = 0; i < ll.size(); i++) {
					Node n = ll.remove(i);
					put(n.key, n.value);
				}
			}
		}

		private int getLLIdx(K key, int bi) {
			LinkedList<Node> ll = buckets[bi];
			int idx = 0;
			for (Node node : ll) {
				if (key == node.key) {
					return idx;
				}
				idx++;
			}
			return -1;
		}

		private int getHashCode(K key) {
			int hc = key.hashCode();
			return hc % N;
		}

		public V get(K key) {
			int bi = getHashCode(key);
			int di = getLLIdx(key, bi);
			if(di !=-1) {
				return buckets[bi].get(di).value;
			}
			return null;
		}

		public V remove(K key) {
			int bi = getHashCode(key);
			int di = getLLIdx(key, bi);
			if(di !=-1) {
				Node node = buckets[bi].remove(di);
				n--;
				return node.value;
			}
			return null;
		}

		public boolean isEmpty() {
			return n == 0;
		}

		public boolean containsKey(K key) {
			int bi = getHashCode(key);
			int di = getLLIdx(key, bi);
			if(di !=-1) {
				return true;
			}
			return false;
		}

		public List<K> keySet() {
			List<K> list = new ArrayList<>();
			for(LinkedList<Node> ll : buckets) {
				for(Node node : ll) {
					list.add(node.key);
				}
			}
			return list;
		}

	}
}

/*
 * package alpha.hashing;
 * 
 * import java.util.ArrayList; import java.util.LinkedList; import
 * java.util.List;
 * 
 * public class HashMapCode {
 * 
 * static class HashMap<K, V> {
 * 
 * private class Node { K key; V value;
 * 
 * public Node(K key, V value) { super(); this.key = key; this.value = value; }
 * }
 * 
 * private int N; private int n; private LinkedList<Node> buckets[];
 * 
 * public HashMap() { this.N = 4; this.buckets = new LinkedList[4]; for (int i =
 * 0; i < 4; i++) { buckets[i] = new LinkedList<Node>(); } }
 * 
 * private int hashFun(K key) { int hc = key.hashCode(); return Math.abs(hc) %
 * N; }
 * 
 * private int searchInLL(K key, int bi) { LinkedList<Node> ll = buckets[bi];
 * int di = 0; for (Node node : ll) { if (node.key == key) { return di; } di++;
 * } return -1; }
 * 
 * public void put(K key, V value) { int bi = hashFun(key); int di =
 * searchInLL(key, bi); if (di != -1) { Node node = buckets[bi].get(di);
 * node.value = value; } else { buckets[bi].add(new Node(key, value)); n++; }
 * double lambda = (double) n / N; if (lambda > 2) { rehash(); } }
 * 
 * private void rehash() { LinkedList<Node> oldBuckets[] = buckets; N *= 2;
 * buckets = new LinkedList[N]; for (LinkedList<Node> ll : buckets) { ll = new
 * LinkedList<Node>(); } for (LinkedList<Node> ll : oldBuckets) { for (int i =
 * 0; i < ll.size(); i++) { Node node = ll.remove(); put(node.key, node.value);
 * } } }
 * 
 * public boolean containsKey(K key) { int bi = hashFun(key); int di =
 * searchInLL(key, bi); if (di != -1) { return true; } else { return false; } }
 * 
 * public V remove(K key) { int bi = hashFun(key); LinkedList<Node> ll =
 * buckets[bi]; int di = searchInLL(key, bi); if (di != -1) { n--; return
 * ll.remove(di).value; } return null; }
 * 
 * public V get(K key) { int bi = hashFun(key); int di = searchInLL(key, bi); if
 * (di != -1) { return buckets[bi].get(di).value; } return null; }
 * 
 * public List<K> keySet() { List<K> list = new ArrayList<>(); for
 * (LinkedList<Node> ll : buckets) { for (Node node : ll) { list.add(node.key);
 * } } return list; }
 * 
 * public boolean isEmpty() { return n == 0; } }
 * 
 * public static void main(String[] args) { HashMap<String, Integer> map = new
 * HashMap<>(); map.put("Ind", 100); map.put("US", 50); map.put("UK", 20);
 * map.put("Nepal", 5); List<String> keySet = map.keySet(); for (String key :
 * keySet) { System.out.println(key); }
 * 
 * } }
 */