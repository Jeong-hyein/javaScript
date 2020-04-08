package com.yedam.stream;

import java.util.Arrays;

public class MatchExample {
	public static void main(String[] args) {
		int[] intArr = { 2, 4, 6, 5};
		boolean isTrue = Arrays.stream(intArr)
//				.allMatch(n -> n % 2 == 0); //모두가 참
//				.anyMatch(n -> n % 2 == 0); // 만족하는게 하나라도 있으면
				.noneMatch(n -> n % 2 == 0); //true가 나온다면
		if(isTrue) {
//			System.out.println("전체 짝수");
			System.out.println("전체 홀수");
		} else {
//			System.out.println("전체 짝수 아님");
			System.out.println("전체 홀수 아님");
		}
		System.out.println(isTrue);
		
	}//main
}//class
