package com.kh.variable.practice;

public class C_Casting {
	/*
	 * 형 변환 (boolean 제외)
	 * 
	 * * 컴퓨터에서의 값의 처리 규칙 
	 * 	1) 대입연산자를 사용할 떄 대입 연산자를 기준으로 왼쪽과 오른쪽은 같은 자료형이어야 함 
	 * 	2) 같은 자료형 끼리만 연산이 가능함 (연산 결괃도 같은 자료형으로 나옴)
	 * 
	 * 1. 자동 형 변환 (묵시적 형 변환)
	 * 	- 자동으로 형 변환이 이루어지기 때문에 개발자가 형 변환을 시켜줄 필요가 없음 
	 * 	- 데이터 표현 범위가 작은 자료형을 큰 자료형으로 변환 
	 */
	// 자동 형 변환 
	public void autoCasting() {
		short s = 12;
		int i = s; // short -> int 자동 형 변환 된다 
		long l = i; // int -> long 자동 형 변환 된다 
		// float이 long 보다 표현 가능한 수의 범위가 더 크기 때문에 자동 형 변환이 가능 
//		float f = l; 
		float f = 10000000000000L;
		double d = f;
		
		// 연산 관련 예시 
		double result = 0.0;
//		long result2 = 30 + 30; // 30 + 30 = 60 -> 결과는 Int 타입이지만 long으로 형 변환하여 저장 (60L)
		long result2 = 30 + 30L; // 30L + 30L = 60L
		
		result = 12 + 3.3; // 12.0 + 3.3 = 15.3 
				
		System.out.println("s : " + s);
		System.out.println("i : " + i);
		System.out.println("l : " + l);
		System.out.println("f : " + f);
		System.out.println("d : " + d);
		System.out.println("result : " + result);
		System.out.println("result2 : " + result2);
		
		i = '문';
		char ch = 47932;
		byte b1 = 10;
		byte b2 = 20;
//		byte result3 = b1 + b2; // byte 끼리 연산하는 것은 허용 하지 않음 데이터 손실이 생길 수 있음
		// byte, short 타입의 데이터는 연산시 무조건 int 타입으로 처리한다. 
		byte result3 = (byte)(b1 +b2);
		
		System.out.println("i : " + i); // 문의 코드값 = 47928
		System.out.println("ch : " + ch); // 47932 코드값을 가지고 있는 문자 = 물 
		System.out.println("result3 : " + result3); 
		
		
	}
	
	/*
	 * 강제 형 변환 (명시적 형 변환)
	 * [표현법]
	 * 	(자료형) 데이터; -> (자료형) : 변경하고자 하는 자료형 
	 * 
	 * - 범위가 큰 크기의 자료형의 데이터를 작은 크기의 자료형으로 변환하고자 할때 사용 
	 * - (자료형)을 형 변환 연사자라고 한다 
	 * - 강제 형 변환의 경우 데이터 손실이 발생할 수 있다 
	 * - boolean은 형 변환이 가능 (true, false 값만 가질수 있다)
	 */
	public void casting() {
		double d = 3.14;
//		float f = d; //	 에러 발생 
		float f = (float) d;
		int i = (int)d;
		double sum = 0;
		
		System.out.println("d : " + d);
		System.out.println("f : " + f);
		System.out.println("i : " + i);
		
		i = 10;
		d = 5.76;
		// 1) 수행 결과를 Int로 강제 형 변환 
//		sum = (int) (i + d); // 10.0 + 5.76 = 15.76
		// 2) double 타입의 값을 int로 강제 형 변환 
//		sum = i + (int)d;
		// 3) double 타입의 변수로 변경 
		sum = i + d;
		
		System.out.println("sum : " + sum);
		// 데이터 손실 
		System.out.println((byte) 256); // 0 출력 됨 원인은? 2진수로 표현이 되어서 그럼 
		
	}
}
