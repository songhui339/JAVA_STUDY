package com.kh.lambda.basic;

import com.kh.lambda.basic.functional.A_FunctionalInterface;
import com.kh.lambda.basic.functional.B_FunctionalInterface;
import com.kh.lambda.basic.functional.C_FunctionalInterface;

public class B_Functional {
	public void method1() {
		// 람다식을 사용
		A_FunctionalInterface fi = () -> {
			System.out.println("매개변수와 반환값이 없는 람다식");
		};
		
		fi.method();
		
		// 익명 구현 객체를 사용 
//		fi = new A_FunctionalInterface() {
//
//			@Override
//			public void method() {
//				System.out.println("익명 구현 객체를 사용한 인터페이스 구현");
//				
//			}
//			
//		};
//		
//		fi.method();
		

 	}
	
	// 매개변수가 있고 반환값이 없는 추상 메소드
	public void method2() {
//		B_FunctionalInterface fi = new B_FunctionalInterface() {
//
//			@Override
//			public void method(int a) {
//				
//			}
//			
//		};
		
		B_FunctionalInterface fi = (int x) -> {
			System.out.println(x * x);
		};
		
		fi.method(10);
		
		// 매개변수의 타입 생략 가능
		fi = (a) -> {
			System.out.println(a * 2);
		};
		
		fi.method(20);
		
		
		fi = a -> System.out.println(a * 3);
		
		fi.method(51);
		
	}
	
	
	// 매개 변수도 있고 반환값도 있는 추상 메소드
	public void method3() {
		// 참고용으로 만든 익명 구현 객체 
//		C_FunctionalInterface fi = new C_FunctionalInterface() {
//
//			@Override
//			public int method(int a, int b) {
//				return 0;
//			}
//			
//		};
		
		int result = 0;
		
		C_FunctionalInterface fi = (int x, int y) -> {
			
			return x + y;
		};
		
		result = fi.method(51, 27);
		
		System.out.println(fi.method(51, 27));
		System.out.println(result);
		
		// 매개변수의 타입 생략 가능
		// 매개변수의 자료형 타입과 중괄호, return구문을 삭제 함 
		fi = (x, y) ->  x * y;
		System.out.println("x * y");
		System.out.println(fi.method(10, 20));
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
