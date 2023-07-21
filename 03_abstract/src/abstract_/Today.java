package abstract_;

import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Today {
	
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println("오늘 날짜 : " + date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 dd일 HH:mm:ss E요일");
		System.out.println("오늘 날짜 : " + sdf.format(date));
		
		//내 생일
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMdd");
		Date birth = input.parse("19910115");
		System.out.println("내 생일 : " + birth);
		System.out.println("내 생일 : " + sdf.format(birth));
		System.out.println();
		
//		시스템 날짜를 기준으로 생성된다.
//		Calendar cal = new Calendar(); -- error
//		Calendar cal = new GregorianCalendar(); // Sub class 생성
		Calendar cal = Calendar.getInstance(); // 메소드를 이용하여 클래스 생성
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		int week = cal.get(Calendar.DAY_OF_WEEK); // 일 -1 월-2 화-3
		String dayofWeek = null;
		switch(week) {
		case 1 : dayofWeek = "일"; break;
		case 2 : dayofWeek = "월"; break;
		case 3 : dayofWeek = "화"; break;
		case 4 : dayofWeek = "수"; break;
		case 5 : dayofWeek = "목"; break;
		case 6 : dayofWeek = "금"; break;
		case 7 : dayofWeek = "토";
		}
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year + "년" + month + "월" + day + "일" + dayofWeek + "요일");
		System.out.println(hour + "시" + minute + "분" + second + "초");
		
		System.out.println(year +  "년 " + month + "월" + day + "일");
		
	}

}
