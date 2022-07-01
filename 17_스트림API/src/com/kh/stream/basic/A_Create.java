package com.kh.stream.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.kh.stream.model.vo.Student;

public class A_Create {
	/*
	 * 스트림의 종류 
	 * 	- Stream, IntStream, LongStream, DoubleStream이 있
	 * 
	 * 스트림 생성 
	 * 	- 숫자 범위로 스크림을 생성하는 방법
	 * 		- IntStream의 range(), rangeClosed() 메소드를 이용해서 생성한다.
	 *  - 배열로부터 스트림을 생성하는 방법	
	 *  	- Arrays.stream(배열) 메소드로 스트림을 생성한다
	 *  	- 각 스트림(Stream, IntStream,...) 의 of(배열) 메소드로 스트림을 생성한다 
	 *  - 컬렉션으로부터 스트림을 생성하는 방법	
	 *  	- 컬렉션의 stream() 메소드를 이용해서 생성한다.
	 *  	
	 */
	
	// 1) 숫자 범위로 스트림을 생성하는 방법 
	public void method1() {
		// 첫 번째 매개값 ~ 두 번째 매개값 이전까지의 값을 요소를 가지는 스트림 객체를 생성
		// 즉 1~9까지의 값을 가지는 요소를 가지는 스트림 객체 생성 
		IntStream stream = IntStream.range(1, 10);
		/*
			반복문 작성 없이 1~9까지의 합을 구해온다
			peek() 안에 람다식(IntConsumer)를 넣어 stream 객체 안에 있는 모든 요소들을 하나씩 찍어본다 
				- 필터하고 싶은 요소들을 가져오는 수식을 넣는것 => 중간 처리 메소드
			sum() => 최종 처리 메소드 
			메소드 체이닝과 비슷하다 
		*/
//		int sum = stream.peek((int value) -> {System.out.print(value + " ");}).sum();
		int sum = stream.peek(value -> System.out.print(value + " ")).sum();
		System.out.println("> Sum : " + sum);
		
		/*
		 * 1 ~ 10 까지의 합
		 */
		// rangeClosed() : 첫 번째 매개값 ~ 두번째 매개 값까지 값을 요소로 가지는 스트림 객체를 생성
		stream = IntStream.rangeClosed(1, 10);
		sum = stream.peek(value -> System.out.print(value + " ")).sum();
		System.out.println("> Sum : " + sum);
		
	}
	
	// 2) 배열로부터 스트림을 생성하는 방법
	public void method2() {
		// 배열 생성 
		String[] names = {"이정후", "김태진", "이슬기", "최송희", "이정후"};
		
		// for문을 사용하여 출력 (for-each문)
		System.out.print("반복문을 사용하여 출력 > ");
		for (String name : names) {
			System.out.print(name + " ");
			// 중복되는 값을 출력 안되게 하기
			
		}
		
//		for (int i = 0; i < names.length; i++) {
//			System.out.print(names[i] + " ");
//		}
		
		System.out.println();
		
		// 스트림을 사용하여 출력
		// type 파라미터 (T) -> String 
		System.out.print("스트림을 사용하여 출력 > ");
//		Stream<String> stream = Arrays.stream(names);
//		Stream<String> stream = Stream.of(names);
		Stream<String> stream = Stream.of("이정후", "김태진", "이슬기", "최송희", "이정후");
		
//		stream.forEach((String name) -> {System.out.print(name + " ");});
//		stream.forEach(name -> System.out.print(name + " "));
		// 중복되는 값 출력 안되게 하기 
		stream.distinct().forEach(name -> System.out.print(name + " "));
		
	}
	
	// 컬렉션으로부터 스트림을 생성하는 방법
	public void method3() {
		List<Student> list = Arrays.asList(
				new Student("이정후", 25, "남자", 80, 50),
				new Student("이슬기", 30, "남자", 80, 50),
				new Student("최송희", 20, "여자", 100, 100)
		);
		
		// 기존에 for 문을 사용하여 출력
		// list.size(); -> list가 가지고 있는 요소의 갯수 (0, 1, 2)
		System.out.println("for문을 사용하여 출력 > ");
		for (int i = 0; i < list.size(); i++) {
			// 에러 남 
//			System.out.println(list[i]);
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		// 스트림을 사용하여 출력 
		// list 객체를 통해 stream 객체를 리턴 받을 수 있음
		// 요소의 개수만큼 출력 됨 (3개의 요소가 있으니 3번 호출 됨)
		System.out.println("스트림을 사용하여 출력 > ");
		Stream<Student> stream = list.stream();
//		stream.forEach((Student student) -> {System.out.println(student);});
//		stream.forEach(student -> System.out.println(student));
		
		// 최종 처리 메소드는 또 다시 호출 불가
		/*
		 * stream은 한번 사용하면 재 사용이 불가능하니까  아래의 방법과 같이 사용을 한다! 
		 */
//		stream.forEach(student -> System.out.println(student));
		list.stream().forEach(System.out::println);
		System.out.println();
		
		// 남자만 가져오게 설정 
		list.stream().filter(student -> student.getGender().equals("남자")).forEach(System.out::println);
		
		// 성별이 남자인 요소들만 가지고 새로운 List 객체 만들기 
		List<Student> list2 = list.stream()
								.filter(student -> student.getGender().equals("남자"))
								.collect(Collectors.toList());
		
		System.out.println();
		System.out.println(list2);
		
		
	}
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
