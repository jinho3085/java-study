package chapter04.util;

import java.util.Random;

public class RandomSeedExample {

	public static void main(String[] args) {
		Random rand1 = new Random(12345);
		Random rand2 = new Random(12345);
		
		for(int i = 0; i < 5; i++) {
			System.out.print((rand1.nextInt(100) + 1) + " "); // 1 ~ 100
		}
		
		System.out.println("\n====================");
		
		for(int i = 0; i < 5; i++) {
			System.out.print((rand1.nextInt(100) + 1) + " "); // 1 ~ 100
		}
		
		
	}

}
