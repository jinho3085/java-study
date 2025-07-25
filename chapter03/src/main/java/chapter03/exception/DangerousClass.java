package chapter03.exception;

import java.io.IOException;

public class DangerousClass {
	public void danger() throws IOException, DataNotFoundException {
		int val = 10;
		System.out.println("some code1");
		
		if(val / 3 > 0) {
			throw new DataNotFoundException();
		}
		
		if(val / 2 > 0) {
			throw new IOException();
		}
		
		System.out.println("some code1");
	}
}
