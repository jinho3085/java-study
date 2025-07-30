package chpter04.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordsCounterExample {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "java", "banana", "melon", "banana", "java");
		Map<String, Integer> wordsCounter = new HashMap<>();

		for (String word : words) {
			// 방법1
			Integer count = wordsCounter.get(word);
			wordsCounter.put(word, count == null ? 1 : count + 1);
			

			// 방법2
			wordsCounter.put(word, wordsCounter.getOrDefault(word, 0)+ 1);
		}

		System.out.println(wordsCounter);
	}

}
