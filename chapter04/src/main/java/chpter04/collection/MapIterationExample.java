package chpter04.collection;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapIterationExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("one", 1); 			
		map.put("two", 2);
		map.put("three", 3);
		
		// 순회1
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + " -> " + map.get(key));
		}
		
		System.out.println("==================");
		// 순회2
		Set<Entry<String, Integer>> entries = map.entrySet();
		for(Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

}
