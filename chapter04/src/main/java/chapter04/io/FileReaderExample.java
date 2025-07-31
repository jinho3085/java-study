package chapter04.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class FileReaderExample {

	public static void main(String[] args) {
		Reader in = null;
		InputStream is = null;

		try {
			in = new FileReader("test.txt");
			is = new FileInputStream("test.txt");

			int count = 0;
			int data = -1;

			while ((data = in.read()) != -1) {
				System.out.print((char) data);
				count++;
			}

			System.out.println();
			System.out.println("count: " + count);
			System.out.println("======================");

			count = 0;
			data = -1;
			while ((data = is.read()) != -1) {
				System.out.print((char)data);
				count++;
			}
		}

		catch (FileNotFoundException e) {
			System.out.println("file not found:" + e);
		} catch (IOException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if (is != null) {
					is.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
