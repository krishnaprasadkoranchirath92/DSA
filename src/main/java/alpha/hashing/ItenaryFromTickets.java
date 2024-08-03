package alpha.hashing;

import java.util.HashMap;
import java.util.Map;

public class ItenaryFromTickets {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Chennai", "Bangalore");
		map.put("Mambai", "Delhi");
		map.put("Goa", "Chennai");
		map.put("Delhi", "Goa");
		String start = getStarting(map);
		System.out.print(start);
		for (String key : map.keySet()) {
			System.out.print(" -> " + map.get(start));
			start = map.get(start);
		}
		System.out.println();
	}

	private static String getStarting1(Map<String, String> map) {
		Map<String, String> revMap = new HashMap<>();
		for (String key : map.keySet()) {
			revMap.put(map.get(key), key);
		}
		for (String key : map.keySet()) {
			if (!revMap.containsKey(key)) {
				return key;
			}
		}
		return null;
	}
	private static String getStarting(Map<String, String> map) {
		for (String key : map.keySet()) {
			if (!map.containsValue(key)) {
				return key;
			}
		}
		return null;
	}

}
