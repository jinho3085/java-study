package chapter04.util;

import java.security.SecureRandom;

public class SecureRandomExample {

	public static void main(String[] args) {
		SecureRandom rand = new SecureRandom();
		
		int token = rand.nextInt(100000000);
		
		System.out.println("보안난수 :" + token);
	}

}
