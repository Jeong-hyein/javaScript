package com.yedam.java1;

import java.text.SimpleDateFormat;
import java.util.Date;

//p546
public class SimpleDateFormatExample {
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy.MM.dd  a HH:mm:ss");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("올해는 D번째 날");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("이달은 d번째 날");
		System.out.println(sdf.format(now));
		
		
	}
}
