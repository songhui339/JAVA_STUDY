package com.kh.stream.terminal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.kh.stream.model.vo.Student;

public class C_Collect {
	/*
	 * 수집 
	 *  	- 스트림 요소들은 필터링 또는 매핑한 후 요소들을 수집하는 최종 처리 메소드인 collect()를 제공한다 
	 */
	
	public void method1() {
		List<Student> students = Arrays.asList(
				new Student(1, "이정후", 25, "남자", 80, 50),
				new Student(2, "이슬기", 31, "남자", 80, 80),
				new Student(3, "최송희", 17, "여자", 100, 100),
				new Student(4, "김태진", 23, "남자", 60, 70),
				new Student(5, "최원희", 15, "여자", 90, 90)
		);
		
		System.out.println("남자인 메소드들만 가져오기");
		List<Student> list = students.stream()
									   .filter(student -> student.getGender().equals("남자"))
//				                       .collect(Collectors.toCollection(Hashset::new));
				                       .collect(Collectors.toList());
		
		list.stream().forEach(System.out::println);
		
		System.out.println();
		System.out.println("여자인 메소드들만 가져오기");
		HashSet<Student> set = students.stream()
										  .filter(student -> student.getGender().equals("여자"))
//		                                  .collect(Collectors.toSet());
//		                                  .collect(Collectors.toCollection(() -> new HashSet<>()));
		                                  .collect(Collectors.toCollection(HashSet::new));
		
		set.stream().forEach(System.out::println);
		
		System.out.println();
		System.out.println("MAP으로 변경");
		// students를 가지고 하나는 K 로 변환해서 key 로 쓰고 U로 변환해서 value 로 사용 
		Map<Integer, String> map = students.stream()
											// 1) getIdx -> key 로 사용 / 2) getName -> value로 사용
		   	    						   .collect(Collectors.toMap(student -> student.getIdx(), student -> student.getName()));	
//											.collect(Collectors.toMap(Student::getIdx, Student::getName));	
		System.out.println(map);
		
		System.out.println();
		System.out.println("id를 key로 사용 & value로 Student 객체");
		Map<Integer, Student> map2 = students.stream()
											// 방법 # 1 
//											 .collect(Collectors.toMap(student -> student.getIdx(), student -> student));
											// 방법 # 2 메소드 참조와 Function.identity() 메소드 사용
											 .collect(Collectors.toMap(Student::getIdx, Function.identity()));
		System.out.println(map2);
		
		System.out.println();
		
		/*
		 * 같은 성별인 객체만 List 객체로 담아보기
		 */
		Map<String, List<Student>> map3 = students.stream()
					.collect(Collectors.groupingBy(student -> student.getGender()));
		System.out.println(map3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
