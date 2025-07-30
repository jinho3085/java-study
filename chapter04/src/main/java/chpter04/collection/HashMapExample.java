package chpter04.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("one", 1); 			// auto boxing
		map.put("two", 2);
		map.put("three", 3);
		
		
		int i = map.get("one"); 	// auto unboxing
		int j = map.get(new String("one"));
		System.out.println(i + " : " + j);
		
		// reset
		System.out.println(map.get("three"));
	}

}
