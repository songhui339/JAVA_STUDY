package com.kh.stream.basic;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A_Create {
	/*
	 * 스트림의 종류 
	 * 	- Stream, IntStream, LongStream, DoubleStream이 있
	 * 
	 * 스트림 생성 
	 * 	- 숫자 범위로 스크림을 생성하는 방법
	 * 	- IntStream의 range(), rangeClosed() 메소드를 이용해서 생성한다.
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
	}

}
