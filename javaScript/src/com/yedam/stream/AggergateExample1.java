package com.yedam.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AggergateExample1 {
	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] { 1, 2, 3, 4, 5 });
		long cnt = intStream.filter(n -> n % 2 == 0).count();
		
		intStream = IntStream.range(1,5);
		Double od = intStream.filter(n -> n % 5 == 0).average()
									 .orElse(0.0); //초기값을 0.0으로 한다
		System.out.println(od);

		IntStream.rangeClosed(1, 5).filter(n -> n % 2 == 0).average()
				 .ifPresent(n -> System.out.println(n));
		
	}
}

