package com.kh.operator.practice;

import java.util.Scanner;

public class D_Comparison {
	/*
	 * 	비교 연산자 ( = 관계 연산자)
	 * 	a < b : a가 b보다 작은가? 
	 * 	a > b : a가 b보다 큰가? 
	 * 	a <= b : a가 b보다 작거나 같은가? 
	 * 	a >= b : a가 b보다 크거나 같은가? 
	 * 	a == b : a가 b랑 같은가? 
	 * 	a != b : a가 b랑 같지 않은가? 
	 * 
	 * 
	 * - 비교 연산자는 조건을 만족하면 true, 만족하지 않으면 false를 반환함 
	 */
	
	public void method1() {
		
		boolean result = false;
		// 동일한 타입의 변수를 한번에 만드는 방법 
		// 관례상 잘 사용하지 않음 
		int num1 = 10, num2 = 25, num3 = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("num1 == num2 : " + (num1 == num2)); 
		System.out.println("num1 <= num2 : " + (num1 <= num2)); 
		System.out.println("num1 > num2 : " + (num1 > num2)); 
		
		result = ( num1 != num2);
		System.out.println(result);
		
		result = ('A' == 65); // A가 코드값으로 바뀜 
		System.out.println(result);
		
		result = (3.0 == 3); // 정수형이 실수로 바뀜 3.0 == 3.0 
		System.out.println(result);
		
		// 대부분의 비교 연산에서는 정수 타입을 사용 
		result = (0.1 == 0.1f); // 오차가 형 변환하는 과정에서도 발생할 수 있음 
		System.out.println(result); // false 
		
		// 산술연산 + 비교연산 
		// 사용자에게 입력 받은 값이 짝수인지, 홀수인지 판단 
		System.out.print("임의의 정수를 입력해주세요 > ");
		num3 = scanner.nextInt();
		
		// (num3 % 2) == 0 : 짝수인지 확인 
		System.out.printf("%d은(는) 짝수인가요? %b\n", num3, ((num3 % 2) == 0));
		System.out.printf("%d은(는) 홀수인가요? %b\n", num3, ((num3 % 2) != 0));
		System.out.printf("%d은(는) 5의 배수인가요? %b\n", num3, ((num3 % 5) == 0));
		
		
		scanner.close();		
	}

}
