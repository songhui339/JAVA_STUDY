package com.kh.operator.practice;

public class C_Arithmetic {
	/*
	 * 산술 연산자
	 *  + (더하기)
	 *  - (빼기)
	 *  * (곱하기)
	 *  / (나누기)
	 *  % (나머지)
	 */
	
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		double dNum1 = 35.0;
		double dNum2 = 10.0;
		
		// 정수의 산술 연산 
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2)); // 나누기의 몫을 구한다 
//		System.out.printf("num1 / num2 = %.1f\n " , ((float)num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2)); // 나누기의 나머지 
		
		System.out.println();
		
		// 실수의 산술 연산 
		System.out.println("dNum1 + dNum2 = " + (dNum1 + dNum2)); 
		System.out.println("dNum1 - dNum2 = " + (dNum1 - dNum2)); 
		System.out.println("dNum1 * dNum2 = " + (dNum1 * dNum2)); 
		System.out.println("dNum1 / dNum2 = " + (dNum1 / dNum2)); 
		System.out.println("dNum1 % dNum2 = " + (dNum1 % dNum2)); 
		
		// 참고 
//		System.out.println(5/0); // 에러 발생 
		System.out.println(5 / 0.0); // Infinity
		System.out.println(5 % 0.0); // NaN (Not a Number)
		System.out.println((5 / 0.0) + 2); // Infinity
		System.out.println((5 % 0.0) + 2); // NaN (Not a Number)
		System.out.println(Double.isInfinite((5 / 0.0) + 2)); // 연산 결과가 Infinity인지 검사하는 코드 
		System.out.println(Double.isNaN((5 % 0.0) + 2)); // 연산 결과가 NaN인지 검사하는 코드 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
