package com.kh.stream.terminal;

import java.util.Arrays;
import java.util.List;

import com.kh.stream.model.vo.Student;

public class A_Match {
	/*
	 * 매칭 
	 * https://www.notion.so/sssongxi/07-03-Stream-API-2-998bb9fad2ec45ebac9d6ec88f9f8fa7#ff2323013fd64080879d6978e665fb5e
	 * 	- allMatch()
	 * 	- anyMatch()
	 */
	
	
	// 정수 배열을 가지고 matching 테스트 
	public void method1() {
		boolean result = false;
		int[] array = {2, 4, 6};
		// 배열의 요소가 모두 짝수인지 확인 해보는 작업
		result = Arrays.stream(array).allMatch(value -> value % 2 == 0);
		System.out.println("array 배열의 모든 요소가 짝수인가? : " + result);
		
		result = Arrays.stream(array).anyMatch(value -> value % 3 == 0);
		System.out.println("array 배열의 요소 중 3의 배수가 있는가? : " + result);
		
		result = Arrays.stream(array).noneMatch(value -> value % 5 == 0);
		System.out.println("array 배열의 요소 중 5의 배수가 단 하나도 없는가? : " + result);
	}
	
	public void method2() {
		boolean result = false;
		List<Student> students = Arrays.asList(
				new Student("이정후", 25, "남자", 80, 50),
				new Student("이슬기", 31, "남자", 80, 80),
				new Student("최송희", 17, "여자", 100, 100)
		);
		
		// 나이가 20살 이상인 학생들이 모두 남자인지 확인하시오 
		
		// 내 풀이 
		result = students.stream()
		        .filter(student -> student.getAge() >= 20)
		        .allMatch(student -> student.getGender().equals("남자"));
		System.out.print("나이가 20살 이상인 학생들이 모두 남자인지 확인하기 : ");
		System.out.println(result);
		
		// 쌤 풀이
		result = students.stream()
		        .filter(student -> student.getAge() >= 20)
		        .allMatch(student -> student.getGender().equals("남자"));
		System.out.println("쌤 풀이" + result);
		
		
		// 남학생들 중에 평균이 70점 이상인 학생이 한명이라도 존재하는지 확인하시오.
		// 남학생을 먼저 거르고 평균 점수 가져오기
		result = students.stream()
		        .filter(student -> student.getGender().equals("남자"))
		        .anyMatch(student -> ((student.getEnglish() + student.getMath()) / 2) >= 70);
		
		System.out.print("남학생들 중에 평균이 70점 이상인 학생이 한명이라도 존재하는지 확인 ");
		System.out.println(result);
		
	}
}
