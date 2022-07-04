package com.kh.stream.intermediate;

import java.util.Arrays;
import java.util.List;

import com.kh.stream.model.vo.Student;

public class C_Mapping {
	/*
	 * 매핑
	 * 
	 * 	- 중간 처리 기능으로 스트림의 요소를 다른 요소로 대체하는 작업을 말한다
	 * 		- mapXXX() : 요소를 대체하는 요소로 구성된 새로운 스트림을 생성한다
	 * 		- flatMapXXX() : 하나의 요소를 복수의 요소들로 구성된 새로운 스트림을 생성한다 (조금 복잡함)
	 * 		- asDoubleStream() : IntStream, LongStream을 DoubleStream으로 변환해서 리턴
	 * 		- asLongStream() : IntStream, DoubleStream을 LongStream으로 변환해서 리턴
	 * 		- boxed() : int, long, double 요소를 Integer, Long, Double 요소로 박싱해서 스트림을 생성하고 리턴한다
	 */
	
	// mapXXX() 메소드 
	public void method1() {
		List<Student> students = Arrays.asList(
				new Student("이정후", 25, "남자", 80, 50),
				new Student("이슬기", 31, "남자", 80, 80),
				new Student("최송희", 29, "여자", 100, 100)
		);
		
		students.stream()
				.map(student -> student.getName())
				.forEach(name -> System.out.print(name + " "));
		
		// Student 객체 3명의 수학 점수만 모아서 평균 점수를 구하고 싶을 때 map메소드를 사용 
		// 객체의 수학 점수만 stream으로 만드는 것 
		System.out.println();
		System.out.println();
		
		double avg = students.stream()
					.mapToInt(student -> student.getMath())
					.average()
					.getAsDouble();
		System.out.println("수학점수의 평균: " + avg);
		
		
	}
	
	public void method2() {
		System.out.println("실행 TEST");
	}

}
