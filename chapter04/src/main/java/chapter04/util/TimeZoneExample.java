package chapter04.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneExample {

	public static void main(String[] args) {
		TimeZone timeZone = TimeZone.getDefault();
		System.out.println("시스템 타임존:" + timeZone.getID());
		System.out.println("GMT 오프셋(시): " + timeZone.getRawOffset()	/ (1000 * 60 * 60));
		
		TimeZone timeZoneNY = TimeZone.getTimeZone("America/New_York");
		System.out.println("뉴욕 타임존:" + timeZoneNY.getID());
	
		System.out.println("============");
	
		// 세계 주요 도시 현재 시각
		Date now = new Date();
		String[] worldZones = {"Asia/Seoul", "Asia/Tokyo" , "Europe/London", "America/New_York", "Australia/Sydney" };
		for(String tzID : worldZones) {
			TimeZone tz = TimeZone.getTimeZone(tzID);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
			sdf.setTimeZone(tz);
			
			System.out.printf("%16s : %s\n", tzID ,sdf.format(now));
		}
		// SNS에서 사진 포스팅 시간 db에 세팅할 떄...
		long createdAtMillis = Calendar.getInstance().getTimeInMillis();
		System.out.println("DB 저장 timestamp (UTC 기준 milis): " + createdAtMillis);
		
		
//		System.out.println("UTC epoch millis" + Calendar.getInstance().getTimeInMillis());
	
		// 3. 영국(런던)에 사는 팔로워인 경우
		Date postDate = new Date(createdAtMillis);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
		sdf.setTimeZone(TimeZone.getTimeZone("Europe/London"));
		
		System.out.println("영국(런던)" + sdf.format(postDate));
	}

}
