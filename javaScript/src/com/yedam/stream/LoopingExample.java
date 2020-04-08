package com.yedam.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LoopingExample {
	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5 };
		IntStream intStream = Arrays.stream(intArr); 
		//들어오는 값(intArr)에 따라 앞쪽 IntStream이 정해짐
		int sum = intStream.filter(n -> n % 2 == 0) // test(): test메소드,
//				  filter: 조건에 해당되는 요소만 가지고 오겠다
				.peek(s -> System.out.println(s))
//				    중간처리만 있으면 실행안됨: .peek(s-> ""); 
//				  filter를 거친 요소에 대해서 루핑을 돌면서 프린트하겠다
				.sum(); // 최종처리가 와야함. 최종처리가 와야 중간처리를 함
//				  filter된걸 sum값으로 집계를하겠다. 요소들에 대한 집계함수 -> 그리고 int sum에 담겠다.
		System.out.println("결과값: " + sum);

//		하나를 소진하면 끝, stream을 다시 가져와야함
		intStream = Arrays.stream(intArr);
		intStream.filter(n -> n % 2 == 0) //filter로 걸러지 요소를 보기위해 forEach를 사용
//				 .forEach(s -> System.out.println(s)); //forEach: 최종처리
				 .sum();
	}
}
