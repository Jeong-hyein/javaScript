package com.yedam.snijhi;

import java.util.Calendar;

public class CalendarMain {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		String[] day = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; //0~11, 0:1월
		int date = cal.get(Calendar.DATE);
		int dayWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		String date1 = "";
		switch (dayWeek) {
		case 1: date1 = "일"; break;
		case 2: date1 = "월"; break;
		case 3: date1 = "화"; break;
		case 4: date1 = "수"; break;
		case 5: date1 = "목"; break;
		case 6: date1 = "금"; break;
		case 7: date1 = "토"; break;
		}

		System.out.println("      " +year + "년 " + month + "월 " + date + "일 " + date1 + "요일");
		System.out.println();
//		요일 출력.
		for (int i = 0; i < day.length; i++) {
			System.out.print(" " + day[i]);
		}
		System.out.println();
//		월의 첫째날의 시작위치 지정. 
		for (int i = 0; i < firstDay - 1; i++) {
			System.out.print("    ");
		}
//		7일씩 잘라서 출력. 
		for (int i = 1; i <= days; i++) {
			System.out.printf("%4d", i);
			if ((firstDay - 1 + i) % 7 == 0)
				System.out.println();
		}
	}
}
