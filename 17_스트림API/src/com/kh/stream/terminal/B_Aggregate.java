package com.kh.stream.terminal;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class B_Aggregate {
	/*
	 * https://www.notion.so/sssongxi/07-03-Stream-API-2-998bb9fad2ec45ebac9d6ec88f9f8fa7#291cf104a591466ba8e122e6a7e0d0b0
	 * 기본 집계 
	 * 
	 * 
	 * 커스텀 집계
	 * 
	 * Optional 객체
	 */
	
	// 기본 집계
	public void method1() {
		int[] values = {1, 2, 3, 4, 5, 6};
//		int[] values = {1, 3, 5};
		
		// 2의 배수의 개수
		// alt + shift + L -> 맥은 cmd + shift + L
		long count = Arrays.stream(values).filter(value -> value %2 == 0) .count();
		
		System.out.println("2의 배수의 개수 : " + count); // 3
		
		// 2의 배수의 합 
		int sum = Arrays.stream(values).filter(value -> value % 2 == 0).sum();
		System.out.println("2의 배수의 합 : " + sum); // 2 + 4 + 6 = 12		
		
		// 2의 배수의 평균
		System.out.println("2의 배수의 평균");
		OptionalDouble average = IntStream.of(values).filter(value -> value % 2 == 0).average();
		
		System.out.println(average);
		// 2의 배수가 없는데 값을 달라고 하면 에러 발생 
//		System.out.println(average.getAsDouble());
		// isPresent : 값이 있는지 참/거짓 판별 
		System.out.println(average.isPresent());
		// isEmpty : 값이 비어있는지 참/거짓 판별
		System.out.println(average.isEmpty());
		
		
		// 1)  값의 존재여부를 확인하고 Optional 객체로부터 값을 얻어온다 
//		if(average.isPresent()) {
//			System.out.println(average.getAsDouble());
//		}
		
		// 2) 집계 값을 처리하는 Consumer를 등록한다 (Consumer는 값이 존재해야 실행된다) 		
		// 값이 있는 경우에 consumer 수행 
		average.ifPresent(value -> System.out.println(value));
		
		// 3) 값이 없을 경우 디폴트 값을 설정하고 Optional 객체로부터 값을 얻어온다 
		// orElse : 값이 없으면 () 안의 값을 리턴 
		System.out.println(average.orElse(0.0));
		
		
		/* max(), min(() */
		// 2의 배수의 최대값
		OptionalInt max = IntStream.of(values).filter(value -> value % 2 == 0).max();
		System.out.println("2의 배수의 최대값 : " + max.getAsInt());
		
		// 2의 배수의 최소값 
		OptionalInt min = IntStream.of(values).filter(value -> value % 2 == 0).min();
		System.out.println("2의 배수의 최소값 : " +min.getAsInt());
		
		
		// 2의 배수의 첫 번째 요소
		OptionalInt findFirst = IntStream.of(values).filter(value -> value % 2 == 0).findFirst();
		System.out.println("2의 배수의 첫 번째 요소 : " +findFirst.getAsInt());
		
		// ?????
//		OptionalInt findAny = IntStream.of(values).filter(value -> value % 2 == 0).findAny();
//		System.out.println(findAny.getAsInt());
		
		System.out.println("-------------------");
		
		/* 커스텀 집계 */
		// 2의 배수의 곱 (커스텁 집계)
//		int result = Arrays.stream(values)
//			  .filter(value -> value % 2 == 0)
//			  .reduce((left, right) -> left * right)
//			  .orElse(0);
		System.out.print("2의 배수의 곱 : ");
		Arrays.stream(values)
		  	  .filter(value -> value % 2 == 0)
		      .reduce((left, right) -> left * right)
		      .ifPresent(System.out::println);
		
		// 실무에서 써본적은 없다고 함ㅎ 
		int result = Arrays.stream(values)
	  	  	  			   .filter(value -> value % 2 == 0)
	  	  	  			   // identity 값이 먼저 배열 스트림에 들어가게 됨 
	  	  	  			   // 초기값 지정 
	                       .reduce(2, (left, right) -> left * right);
		System.out.println("identity 값을 받은 후 곱셈 결과 : " + result);
		
		
		
		
		
		
	}
}
