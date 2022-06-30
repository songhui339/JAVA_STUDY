package com.kh.chapter5.method;

public class C_StaticMethod {
	
	// 필드 생성 
	private static int num1 = 10;
	public static int num2 = 10;
	
	
	// 1. 매개 변수와 반환값이 없는 메소드 
	public static void method1() {
		// 인스턴스 필드에 접근이 없다 
//		System.out.println(num1);
		System.out.println(num1 +num2);
		
//		this 사용 불가 
//		this.num1;
//		class 이름으로 접근 
		C_StaticMethod.num1++;
	}
	
	// 2. 매개 변수가 없고 반환값이 있는 메소드 
	// return 값이 없으면 에러 뜸 
	public static int method2() {
		
//		return C_StaticMethod.num1 + C_StaticMethod.num2;
		return num1 + num2;
	}
	
	
	// 3. 매개 변수가 있고 반환값이 없는 메소드 
	public static void method3(int num3) {
		System.out.println(num1 + num2 + num3);
	}
	
	
	// 4. 매개 변수와 반환값이 있는 메소드 
	public static int method4(int ... numbers) {
		int sum = 0;
		
		for(int number : numbers) {
			sum += number; // sum = sum + number
		}
		
		return sum;
		
	}
	

}
