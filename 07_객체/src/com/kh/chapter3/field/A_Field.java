package com.kh.chapter3.field;


/*
 * 변수 구분 
 * 
 * 1. 필드(인스턴스 변수, 멤버 변수)
 * 	- 클래스 영역에 선언하는 변수, 클래스 내에서 어디든지 사용이 가능하다.
 * 	- 필드는 접근 제한자를 사용할 수 있다. (public, protected, default, private)
 * 	- 필드의 생성과 소멸 
 * 	  생성 시점 : new 연산자를 통해서 객체(인스턴스)생성 시 메모리(Heap)에 할당 된다.
 *    소멸 시점 : 객체(인스턴스)가 소멸 시  함께 소멸된다.
 *  
 * 2. 지역 변수 
 * 	- 클래스 영역 안의 특정한 구역{}에 선언하는 변수, 해당 구역에서만 사용이 가능하다.
 * 	  ex. 메소드, 제어문(if, for) 등 
 * 	- 지역 변수는 접근 제한자를 사용할 수 없다.
 * 	- 지역 변수의 생성과 소멸 
 * 	  생성 시점 : 특정한 구역{} 실행 시 메모리(Stack)에 할당 된다.
 * 	  소멸 시점 : 특정한 구역{} 종료 시 소멸 된다.
 * 
 * 3. 클래스 변수(static 필드)
 * 	- static 예약어가 붙은 필드를 클래스 변수 또는 static 필드라고 한다.
 * 	- 클래스 변수는 프로그램 실행과 동시에 메모리에 올려놓고 객체들이 공유하면서 사용할 목적으로 선언한다.
 * 	- 객체마다 가지고 있을 필요성이 없는 공용적인 데이터라면 클래스 변수로 선언하는 것이 좋다.
 * 	- 클래스 변수의 생성과 소멸 
 * 	  생성 시점 : 프로그램이 실행 될 때 JVM에 의해서 해당 클래스가 로드 될 때 메모리(static)에 할당된다.
 *    소멸 시점 : 프로그램이 종료될 때 소멸된다.
 */

public class A_Field {
	// 필드 선언 
	private int field; 
	
	// 필드의 접근 제한자 테스트 
	public String publicField = "public";
	
	protected String protectedField = "protected";
	
	String defaultField = "default"; // default 접근 제한자 
	
	private String privateField = "private";
	
	// 매개 변수가 있는 메소드 
	// 매개 변수도 일종의 지역 벼수로 메소드 영역에서 사용이 가능하다.
	public void method1(int number) {
		// 메소드 안에서 생성되는 것이 지역 변수 
//		public int local; // 지역 변수에는 접근 제한자를 붙이지 않는다.
		int local = 5;
		
		// 필드 출력 : 필드는 클래스 전역에서 사용이 가능하다. (생성자, 메소드)
		// 			 미 초기화 시 JVM이 기본 값으로 초기화 해준다. 
		//			 (정수 : 0, 실수 : 0.0, 문자 : \u0000, 논리값 : false, 참조값 : null)
		System.out.println("필드 출력 : " + this.field); // JVM이 초기화 해줬으니까 에러가 안남 
		
		// 지역 변수 출력 : 지역 변수는 반드시 초기화 해야한다.
		//				 미 초기화 시 에러가 발생한다.
		System.out.println("지역 변수 출력 : " + local); 
		
		// 매개 변수 출력 : 매개 변수는 메소드 호출 시 반드시 값이 전달되어 오기 때문에 바로 출력 가능 
		System.out.println("매개 변수 출력 : " + number);
	}

}















