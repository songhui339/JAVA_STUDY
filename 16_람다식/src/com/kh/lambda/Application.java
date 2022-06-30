package com.kh.lambda;

import com.kh.lambda.basic.C_MethodReference;
import com.kh.lambda.standard.E_Predicate;

//import com.kh.lambda.basic.A_Lambda;

public class Application {

	public static void main(String[] args) {
			// 함수형 프로그래밍 언어의 경우 모든 것을 함수로 만듬
			// 특징 중 하나 : 함수를 객체로 관리를 해 event를 처리할때 유용하게 사용함 
		
		/*
		 * 람다식(Lambda Expressions)
		 * 		- 자바는 함수적 프로그래밍을 지원하기 위해서 자바 8부터 람다식을 지원한다.
		 * 		- 람다식은 매개 변수를 가지는 함수와 같은 코드 블록이지만 런타임 시(실행되는 시점)에는 인터페이스의 익명 구현 객체를 생성한다.
		 * 		- 람다식을 사용하면 코드가 간결해지고, 컬렉션의 요소를 필터링하거나 매핑해서 원하는 결과를 쉽게 가져올 수 있다.
		 * 
		 * 		[표현법]
		 *			([타입 매개변수명, ...]) -> {
		 *				// 실행 코드
		 *			
		 *				[return 반환값]
		 *			};
		 *
		 *		- 예시)
		 *			- (int a) -> {System.out.println(a)};
		 *			- (a) -> {System.out.println(a);} // 매개 변수타입 생략 가능 
		 *			- a -> System.out.println(a); // 매개변수가 하나일떄, 실행문이 하나일 때는 소괄호(), 중괄호{} 생략 가능 
		 *			- () -> { 실행 구문 } // 매개변수가 없다면 매개 변수 자리에 반드시 빈 괄호()를 사용해야 한다 
		 *			- (a, b) -> { return a+b;} // 결과값을 리턴해야 한다면 return 문으로 결과값을 지정해야 한다 
		 *			- (a, b) -> a+b; // return 문 하나만 있으면 return 문과 중괄호 생략 가능 
		 *			-
		 * 
		 * 
		 */
		
//		new A_Lambda().method1();
		
//		new B_Functional().method1();
//		new B_Functional().method2();
//		new B_Functional().method3();
		
		

		/*
		 * 표준 함수적 인터페이스
		 */
		
//		new A_Consumer().method1();
//		new B_Supplier().method1();
//		new C_Function().method1();
//		new D_Operator().method1();	
//		new E_Predicate().method1();
		
		/*
		 * 메소드 참조(Method Reference)
		 */
		new C_MethodReference().method1();
		
		
		
		
		
		
		
		
		
		

	}

}
