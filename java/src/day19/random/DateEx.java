package day19.random;

import java.beans.SimpleBeanInfo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) throws ParseException {

		
		//java.util
		
		//Date 객체에서 시간대를 출력하는 예제
		Date now = new Date();
		System.out.println(now);
		
		//Date 객체 => 문자열로  
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd EE요일 HH:mm:ss");
		String str = format.format(now);
		System.out.println(str);
		
		
		format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		str = "2023 -06-27 18:00:00";
		Date date = format.parse(str);
		System.out.println(date);
		
		date = new Date();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy - MM - dd HH:mmss zzzz");
		
		ZoneId zoneId = ZoneId.systemDefault();
		
		
				
	}

}
