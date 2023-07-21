package abstract_;

import java.util.Calendar;

class CalendarEx {
	private int year;
	private int month;

	public CalendarEx(int year, int month) {
		this.year = year;
		this.month = month;
	}


	public int FirstDayOfWeek(int year, int month) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, 1); 
		return calendar.get(Calendar.DAY_OF_WEEK) - 1; 
	}


	public int LastDayOfMonth(int year, int month) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month, 1); 
		calendar.add(Calendar.DATE, -1); 
		return calendar.get(Calendar.DATE);
	}

	public void display() {
		System.out.println(year + "년 " + month + "월");

		String[] daysOfWeek = {"일", "월", "화", "수", "목", "금", "토"};
		for (String day : daysOfWeek) {
			System.out.print(day + "\t");
		}
		System.out.println();

		int firstDayOfWeek = FirstDayOfWeek(year, month);

		for (int i = 0; i < firstDayOfWeek; i++) {
			System.out.print("\t");
		}

		int lastDay = LastDayOfMonth(year, month);

		int dayOfWeek = firstDayOfWeek;
		for (int day = 1; day <= lastDay; day++) {
			System.out.print(day + "\t");
			dayOfWeek++;
			if (dayOfWeek == 7) {
				dayOfWeek = 0;
				System.out.println();
			}
		}

		for (int i = dayOfWeek; i < 7; i++) {
			System.out.print("\t");
		}
		System.out.println();
	}
}