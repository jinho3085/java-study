package chpter04.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		
		set.add(50);
		set.add(100);
		set.add(200);
		set.add(20);
		set.add(10);
		set.add(30);
		
		System.out.println("정렬된 Set: " + set);
	}

}
