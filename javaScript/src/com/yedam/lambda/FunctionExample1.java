package com.yedam.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

class Student {
	private String name;
	private int englishScore;
	private int mathScore;
	
	Student(String name, int englishScore, int mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}
	String getName() {return name;}
	int getEnglishScore() {return englishScore;}
	int getMathScore() { return mathScore;}
}

public class FunctionExample1 {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
			);
	public static void printString(Function<Student, String> function) {
		for(Student student : list) {
			System.out.println(function.apply(student) + " ");
		}
		System.out.println();
	}
	
	public static void printInt( ToIntFunction<Student> function) {
		for(Student student : list) {
			System.out.print(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("[학생 이름]");
		printString( t -> t.getName());
		
		System.out.println("[영어 점수]");
		printInt( t -> t.getEnglishScore());
		
		System.out.println("[수학 점수]");
		printInt( t -> t.getMathScore());
		
		
		
		//익명객체
		Function<Student, String> fn = new Function<Student, String>() {
			@Override
			public String apply(Student t) {
				return t.getName(); //반환값: String타입
			}
		};
		printString(fn); //홍길동 신용권 나옴
		
		
		//람다표현식
		printString((t) -> { 
			return t.getName();//홍길동 신용권 나옴
		});
	}
}
