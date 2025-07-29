package chapter04.util;

import java.util.Random;

public class RandomBasicExample {

	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("정수(0 ~ 99) :" + rand.nextInt(100));
		System.out.println("실수(0.0 ~ 1.0) :" + rand.nextDouble());
		System.out.println("불리언 :" + rand.nextBoolean());
		
	}

}
