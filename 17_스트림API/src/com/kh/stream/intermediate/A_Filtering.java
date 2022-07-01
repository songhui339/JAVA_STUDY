package com.kh.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.kh.stream.model.vo.Student;

public class A_Filtering {

	/*
	 * 필터링
	 * 	- 중간 처리 기능으로 요소를 걸러내는 역할을 한다
	 * 		- distinct() : 중복을 제거하는 메소드이다
	 * 		- filter(Predicate) : 매개 값으로 전달되는 Predicate가 false를 리턴하는 요소를 제거한다
	 */
	
	// distinct() 사용해 중복 제거 
	public void method1() {
		List<String> names = Arrays.asList("이정후", "김태진", "이슬기", "최송희", "이정후");
		
		Stream<String> stream = names.stream();
		
//		stream.forEach((String name) -> {System.out.print(name + " ");});
		stream.forEach(name -> System.out.print(name + " "));
		
//		안됨!!! 최종처리는 한번만 처리 가능함!! 
//		이미 최종 처리까지 호출된 스트림은 다시 사용할 수 없다. (컬션으로부터 다시 스트림을 얻어와야 한다)
//		stream.distinct().forEach(name -> System.out.print(name + " "));
		
		System.out.println();
		
//		중복되는 값을 생략 후 호출 
//		names.stream().distinct().forEach(System.out::print);
		names.stream().distinct().forEach(name -> System.out.print(name + " "));
		
		System.out.println();
		System.out.println();
		
		// 원래는 맨위에 놓아야 하지만 가독성을 위해 아래에 작성함
		List<Student> students = Arrays.asList(
				new Student("이정후", 25, "남자", 80, 50),
				new Student("이정후", 25, "남자", 80, 50),
				new Student("이정후", 25, "남자", 80, 50),
				new Student("이슬기", 30, "남자", 80, 50),
				new Student("최송희", 20, "여자", 100, 100)
		);
		
		// 데이터는 같지만 주소가 다르기 때문에 distinct() 중복 제거가 되지 않음 
		// @EqualsAndHashCode 롬북어노테이션 추가 후에는 중복 제거 됨
		students.stream().distinct().forEach(student -> System.out.println(student + " "));
		
	}
	
	
	// 필터 메소드 
	public void method2() {
		List<String> names = Arrays.asList("이정후", "김태진", "이슬기", "최송희", "이정후", "최송희", "신준우", "안은정");
		
		names.stream()
		// 익명 구현 객체라고 하면 길다 길어ㅋㅋㅋ
//		     .filter(new Predicate<String>() {
//
//				@Override
//				public boolean test(String name) {
//					return name.startsWith("이");
//				}
//		    	 
//			})
		     // 람다식
//			 .filter((String name) -> {return name.startsWith("이");})
			 .filter(name -> name.startsWith("이"))
//			 .distinct()
			 .forEach((name) -> System.out.print(name + " "));
		
		
		System.out.println();
		
		names.stream()
		      .distinct()
			  .filter((String name) -> {return name.startsWith("최");})
//			  .distinct()
		      .forEach(name -> System.out.print(name + " "));
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
