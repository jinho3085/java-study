package chapter03.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionExample {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("hello.txt");
			int data = fis.read();
			System.out.println((char)data);
		} catch(FileNotFoundException ex) {
			System.out.println("error:" + ex);
		} catch(IOException ex) {
			System.out.println("error:" + ex);
		} finally {
			try {
				if(fis != null) {
					fis.close();
				}
			} catch(IOException ex) {
				ex.printStackTrace();
			}
			
		}
	}

}
