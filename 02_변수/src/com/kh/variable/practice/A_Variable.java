package com.kh.variable.practice;

public class A_Variable {
	public void printValue() {
		// 변수를 사용하지 않을 떄 
		System.out.println(2 * 3.141592 * 10);
		System.out.println(3.141592 * 10 * 10);
		System.out.println(3.141592 * 10 * 10 * 20);
		System.out.println(4 * 3.141592 * 10 * 10);
		
		// 변수를 사용했을 때 
		int r = 10; // 반지름 
		int h = 20; // 높이 
		double pi = 3.141592; // 원주
		
		System.out.println(2 * pi * r);
		System.out.println(pi * r * r);
		System.out.println(pi * r * r * h);
		System.out.println(4 * pi * r * r);
		
	}
	
	public void variableTest() {
		/*
		 * 변수의 선언 
		 * [표현법]
		 * 	자료형 변수명;
		 * 
		 * - 자료형은 어떤 값을 저장할지, 어떤 크기의 메모리를 할당 받을지에 대한 정보
		 * - 변수명은 변수의 이름으로 값을 읽고, 쓰고, 지우고 변경하는 작업을 할 때 사용 
		 */
		
		// 논리형 변수 
		boolean isTrue; // 1byte의 논리값을 담을 수 있는 변수를 선언 
		
		// 정수형 변수 
		byte bNum; // 1byte의 정수를 담을 수 있는 변수를 선언 
		short sNum; // 2byte
		int iNum; // 4byte
		long lNum; // 8byte 
		
		// 실수형 변수 
		float fNum; // 4byte의 실수를 담을 수 있는 변수를 선언 
		double dNum; // 8byte
		
		// 문자형 변수 
		// char ch = 90 // 코드 
		//char ch = '\u0000'; // 공백 
		char ch = 'a'; // 2byte의 유니코드를 담을 수 있는 변수를 선언 
		
		// 문자열 변수 
		//String name = "";
		//String name = "신기방기 하다";  // 문자열을 가리킬 수 있는 참조형 변수를 선언 
		String name = new String("최송희");
		
		/*
		 * 변수의 초기화 
		 * [표현법]
		 * 	변수명 = 값;
		 * 
		 * - "="는 오른쪽의 데이터를 왼쪽의 변수에 대입(저장)하는 연산자 
		 */
		
		isTrue = false;
		bNum = 11;
		sNum = 12;
		iNum = 300;
		// 정수형 리터럴은 기본적으로 int로 컴파일 된다 
		// long 타입의 리터럴은 숫자 뒤에 L 또는 l을 입력해야함 
		lNum = 314748488428L;
		// 실수형 리터럴은 기본적으로 double로 컴파일 됨 
		// float  타입의 리터럴은 숫자 뒤에 F 또는 f를 입력해야함 
		fNum = 3.14f;
		// double 타입의 리털에서 숫자 뒤에 D 또는 d는 생략이 가능함 
		dNum = 3.14;
		
		// 로컬변수(메소드 안에서 생성된 변수) 를 생성한 후 초기화가 되지 않는 경우 에러 발생 
		System.out.println("isTrue : " + isTrue);
		System.out.println("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch : " + ch);
		System.out.println("String : " + name);
		
		// 변수의 명명 규칙 
		// 1) 대소문자 구분 
		int number;
		// String number; // 자료형이 달라도 변수명이 같으면 에러 발생 
		int NUMBER;
		int NumBer;
		
		// 2) 숫자로 시작하면 안됨 
		// int 1age;
		int a2g3e1;
		
		// 3) 특수 문자로 '_', '$'만 사용이 가능하다. 
		int _age;
		int ag_e_;
		
		// 4) 예약어를 사용하면 안된다.
//		int void;
//		int double;
//		int class;
//		int public;
		
	}
	
	public void overflow() {
		// byte 자료형의 저장 범위 : -128 ~ 127
		byte bNum = 127;
		byte result = (byte) (bNum +1);
		
		System.out.println("bNum : " + bNum);
		System.out.println("result : " + result);
		
	}
	
	public void constant() {
		/*
		 * 상수 
		 * [표현법]
		 * 	final 자료형 변수명;
		 * 
		 * - 변하지 않는 값으로 특정 변수의 값이 변경되는 걸 원하지 않을 때 사용 
		 * - 실무에서 여러명이 개발 할 때 주로 사용 
		 * - 초기화 이후에는 값을 변경할 수 없다.
		 */
		
		int age;
		final int AGE;
		
		age = 20;
		AGE = 30;
		
		System.out.println(age);
		System.out.println(AGE);
		
		age = 25;
		// AGE = 35; // 에러 뜸 
	}
	
	
	/*
	 * 실습 문제 1.
	 * 영화관의 요금표는 다음과 같습니다. 
	 * 	- 성인 :10000원
	 * 	- 청소년 :7000원
	 * 성인 2명과 청소년 3명이 영화를 보려고 때 지불해야할 금액을 계산 후 출력하세요.
	 * 
	 * 예시)
	 * <영수증>
	 * 성인 2명 : 20000원 
	 * 청소년 3명 : 21000원 
	 * 총 금액 : 4100원 
	 */

	
//	public void practice1() {
//		int adult = 10000;
//		int student = 7000;
//		
//		System.out.println("<영수증>");
//		System.out.println("성인 2명 : " + (adult * 2) + "원");
//		System.out.println("청소년 3명 : " + (student *3) + "원");
//		System.out.println("총 금액 : " + ((adult * 2) + (student *3)) + "원");
//				
//	}
	
	// 쌤 답변 
	public void practice1() {
		// 변수 선언 
		int adultPrice = 10000;
		int teenPrice = 7000;
		int adultCount = 2;
		int teenCount = 3;
		int adultTotal = adultPrice * adultCount;
		int teenTotal = teenPrice * teenCount;
		int total = adultTotal + teenTotal;
		
		System.out.println("<영수증>");
		System.out.println("성인 2명 : " + adultTotal + "원");
		System.out.println("청소년 3명 : " + teenTotal + "원");
		System.out.println("총 금액 : " + total + "원");
		
	}
	
	
	/*
	 * 실습 문제 2.
	 * 문인수는 국어 점수가 60점 / 영어 점수 70점 / 수학 점수 66점을 받았다. 
	 * 이 학생의 총점과 평균을 출력하세요. 
	 * 
	 * 예시)
	 * 국어 점수 : 60점
	 * 영어 점수 : 70점 
	 * 수학 점수 : 66점 
	 * 
	 * 총점 : 196점 
	 * 평균 : 65.3점
	 */
	
//	public void practice2() {
//		byte korean = 60;
//		byte english = 70;
//		byte math = 66;
//		
//		String emptySpace = "";
//		
//		System.out.println(emptySpace);
//		System.out.println("국어 점수 : " + korean);
//		System.out.println("영어 점수 : " + english);
//		System.out.println("수학 점수 : " + math);
//		System.out.println(emptySpace);
//		System.out.println("총점 : " +(korean + english + math));
//		System.out.println("평균 : " + ((korean + english + math) / 3));
//		
//	}
	
	// 쌤 답변
	public void practice2() {
		int kor = 60;
		int eng = 70;
		int math = 66;
		int total = kor + eng + math;
		// 형 변환 
		double avg = total / 3.0;

		System.out.println("국어 점수 : " + kor + "점");
		System.out.println("영어 점수 : " + eng + "점");
		System.out.println("수학 점수 : " + math + "점");
		System.out.println();
		System.out.println("총점 :" + total + "점");
		// 반올림 하는 2가지 방법 
		System.out.println("평균 :" + (Math.round(avg * 100) / 100.0) + "점");
		System.out.printf("평균 : %.2f점\n", avg);
	}
	
	
	
}
