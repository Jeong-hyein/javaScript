package com.yedam.stream;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AggregateExample {
	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] { 1, 2, 3, 4, 5 });
		long cnt = intStream.filter(n -> n % 2 == 0).count();
		
		
		intStream = IntStream.rangeClosed(1, 10); // 1부터 10까지(둘다 포함)
//		OptionalDouble d = intStream.filter(n -> n % 2 == 1).average(); 
//		OptionalDouble d = intStream.filter(n -> n % 11 == 0).average();
		//요소가 없음(error)가 든다
		OptionalDouble d = intStream.filter(n -> n % 2 == 0).average();
//		System.out.println("결과: " + d.getAsDouble()); // 숫자만 가져올려고 getAsDouble()
		if(d.isPresent()) {
			System.out.println("결과: " + d.getAsDouble());
		} else {
			System.out.println("처리 결과 없습니다.");
		}

	}
}
