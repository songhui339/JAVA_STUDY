package com.kh.stream.intermediate;

import java.util.Arrays;

public class D_Looping {
	/*
	 * 루핑
	 * 	- 요소 전체를 반복하는 역할을 한다 
	 *  https://www.notion.so/sssongxi/07-03-Stream-API-2-998bb9fad2ec45ebac9d6ec88f9f8fa7
	 * 
	 */
	
	public void method1() {
		int sum = 0;
		int[] values = {1, 2, 3, 4, 5};
		
//		최종 처리 메소드가 호출되어야 동작한다. 아래 코드는 동작 안함 
//		Arrays.stream(values)
//				// 2의 배수만 필터링 되도록 
//		      .filter(value -> value % 2 == 0)
//		      .peek(System.out::println);
		System.out.println("2의 배수만 필터링 한 후 합계 구하기");
		sum = Arrays.stream(values)
				// 2의 배수만 필터링 되도록 
				.filter(value -> value % 2 == 0)
				.peek(System.out::println)
				.sum();
		
		System.out.println("SUM : " + sum);
		
		System.out.println("홀수만 필터링 하기");
		Arrays.stream(values)
			  .filter(value -> value % 2 != 0)
		      .forEach(System.out::println);
			  // 최종처리 메소드 이후에 최종처리 메소드 사용 X
//			  .sum();
	}

}
