package com.kh.stream.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.kh.stream.model.vo.Student;

public class B_Sorted {
	/*
	 * 정렬 
	 */

	// 요소가 객체일 때 
	public void method1() {
		List<String> names = Arrays.asList("이정후", "김태진", "이슬기", "최송희", "이정후", "최송희", "신준우", "안은정");
		
		// 1) 처음에는 인덱스 순서대로 출력 됨 
		// 2) sorted()를 통해 오름차순으로 정렬
		// 객체의 Comparable 인터페이스 구현 내용에 따라서 정렬
		System.out.println("[오름차순 정렬]");
		names.stream()
		     .distinct()
		     .sorted()
//		     .sorted(Comparator.naturalOrder())
		     .forEach(name -> System.out.print(name + " "));
		
		System.out.println();
		System.out.println();
		
		System.out.println("[내림차순 정렬]");
		// 객체의 Comparable 인터페이스 구현 내용에 반대로 정렬
		// sorted 구현 객체를 람다로 만들거임 
		names.stream()
	         .distinct()
	         // 내림차순 
//	         .sorted((name1, name2) -> {
//	        	 return name1.compareTo(name2);
//	         })
//	         .sorted((name1, name2) -> name2.compareTo(name1))
	         .sorted(Comparator.reverseOrder())
	         .forEach(name -> System.out.print(name + " "));
		
		System.out.println();
		System.out.println("--------------------");
		System.out.println();
		
		/* -----------------------------------------  */
		
		List<Student> students = Arrays.asList(
				new Student("이정후", 25, "남자", 80, 50),
				new Student("이슬기", 31, "남자", 80, 80),
				new Student("최송희", 29, "여자", 100, 100)
		);
		
		students.stream()
			    // Comparator 인터페이스의 Compare 메소드 구현 
//				.sorted((o1, o2) -> o1.getAge() - o2.getAge())
//		 	    .sorted(Comparator.naturalOrder()) // comparator 인터페이스를 구현하기 전에는 오류 뜸  
				.sorted(Comparator.reverseOrder())
//				.sorted()
				.forEach(student -> System.out.println(student));
		
		
		
		
		
		
	}
}
