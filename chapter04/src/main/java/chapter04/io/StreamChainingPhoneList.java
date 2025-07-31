package chapter04.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StreamChainingPhoneList {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
		File file = new File("phone.txt");
		
		if(!file.exists()) {
			System.out.println("file not found");
			return;
		}
		
		System.out.println("========== 파일정보 ===========");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length() + "Bytes");
		
		long lastModified = file.lastModified();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(new Date(file.lastModified())));
	
		// 1. 기반 스트림
		FileInputStream fis = new FileInputStream(file);
		// 2.보조 스트림1
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		// 3.보조 스트림2
		br = new BufferedReader(isr);
		
		// 4. 처리
		
	} catch (UnsupportedEncodingException e) {
		System.out.println("error: " + e);
	} catch (IOException e) {
		System.out.println("error:" + e);
	}   finally {
		try {
			if(br !=null) {
				br.close();	
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	}
}
		
