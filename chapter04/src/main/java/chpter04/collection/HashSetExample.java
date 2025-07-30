package chpter04.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		set.add("둘리");
		set.add("마이콜");
		set.add("또치");

		System.out.println(set.size());

		// 자료구조는 값(데이터)를 다룬다.
		String s1 = new String("마이콜");
		set.add(s1);
		System.out.println(set.size());
		System.out.println(set.contains(s1));

		// 순회
		for (String s : set) {
			System.out.print(s + " ");
		}
		System.out.println();

		// 제거
		set.remove(s1);

		// 순회
		for (String s : set) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		// 삽입 순서대로 순회되지 않는다. 
		set.add("도우너");
		for(String s : set) {
			System.out.print(s + " ");
		}
	}

}
