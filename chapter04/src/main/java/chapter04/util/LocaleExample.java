package chapter04.util;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleExample {

	public static void main(String[] args) {
		// 현 시스템 로케일 (언어_국가)
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
		// 여러 국가별로 날짜 표현
		Date now = new Date();
		
		DateFormat dfkorea = DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA);
		System.out.println("한국:" + dfkorea.format(now));
		
		DateFormat dfUS = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
		System.out.println("미국:" + dfUS.format(now));
		
		DateFormat dfJapan = DateFormat.getDateInstance(DateFormat.LONG, Locale.JAPAN);
		System.out.println("일본:" + dfJapan.format(now));
	}

}
