package chapter04.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // 현재시간
		printDate(cal.getTime());
		printDate(cal);
		
		cal.set(Calendar.YEAR, 2024);
		cal.set(Calendar.MONTH, 11); // 12월(month -1)
		cal.set(Calendar.DATE, 25);
		printDate(cal);
		
		cal.set(2025, 5, 8); 			// 생일
		cal.add(Calendar.DATE, 100);	// 100일
		printDate(cal);
	}	
	
	private static void printDate(Date d) {
		// 2025-07-29 11:11:11
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String date = sdf.format(d);
		System.out.println(date);
	}

	private static void printDate(Calendar cal) {
		final String[] DAYS = {"일","월","화","수","목","금","토"};
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH); // 0~11, +1
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.DAY_OF_WEEK); // 1(일) ~ 7(토)
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf(
				"%d-%02d-%02d (%s) %02d:%02d:%02d\n",
				year,
				(month + 1),
				date,
				DAYS[day-1],
				hour,
				minute,
				second);
		}
	
	}
