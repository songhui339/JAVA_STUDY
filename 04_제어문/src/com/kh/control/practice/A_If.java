package com.kh.control.practice;

import java.util.Scanner;

public class A_If {
	/*
	 * if 문 
	 * [표현식]
	 * 	if (조건식) {
	 * 		..실행 코드..
	 * 	}
	 * 
	 * - 조건식에는 비교 연산자, 논리 연산자를 주로 사용한다.
	 * - 조건식의 결과가 true이면 중괄호{} 블록을 실행 
	 * - 조건식의 결과가 False이면 중괄호{} 블록을 실행 하지 않음 
	 */
	
	public void method1() {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수값 입력 > ");
		num = scanner.nextInt();
		
		if (num % 2 == 0) {
			System.out.printf("%d는(은) 짝수이다.\n", num);
		}
		
		if (num % 2 != 0) {
			System.out.printf("%d는(은) 홀수이다.\n", num);
			
		}
		
		scanner.close();
	}
	
	/*
	 * if-else 문 
	 * 
	 * [표현법]
	 * 	if (조건식) {
	 * 		..실행 코드..
	 * 	} else {
	 * 		..실행 코드..
	 * 	}
	 * 
	 * - 조건식의 결과가 true인 경우 if 문 안의 실행 코드를 실행 
	 * - 조건식의 결과가 false인 경우 else 문 안의 실행 코드 실행 
	 */

	public void method2() {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수값 입력 > ");
		num = scanner.nextInt();
		
		if (num % 2 == 0) {
			System.out.printf("%d는(은) 짝수이다.\n", num);
		} else {
			System.out.printf("%d는(은) 홀수이다.\n", num);
		}
		
		scanner.close();
	}
	
	public void method3() {
		String name = null;
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * 기본 자료형들은 동등 비교 시 ==, != 를 사용해서 동등 비교 가능 
		 * 하지만 String 기본 자료형이 아니라 참조 자료형이라 동등비교 사용 시 주소값을 비교 
		 * 
		 * 문자열의 동등 비교 시에는 String 클래스에서 제공하는 equals() 메소드를 이용해 비교해야 함 
		 */
//		System.out.println("최송희" == "최송희"); // true
//		System.out.println("최송희" == new String("최송희")); // false
//		System.out.println("최송희" .equals(new String("최송희"))); // true
		
		System.out.print("이름을 입력하세요. > ");
		name = scanner.nextLine();
		
		if (name .equals("최송희")) {
			System.out.println("본인이다. ");
		} else {
			System.out.println("본인이 아니다. ");
			
		}
		
		scanner.close();
	}
	
	
	/*
	 * if-else if-else 문 
	 * 
	 * [표현법]
	 * 
	 * 	if (조건식) {
	 * 		..실행 코드..
	 * 	} else if(조건식) {
	 * 		..실행 코드..
	 * 	} else if(조건식) {
	 * 		..실행 코드..
	 * 	}
	 *  }[else {
	 * 		..실행 코드..
	 * 	}]
	 * 
	 * - 같은 비교 대상으로 여러 개의 조건을 제시할 때 사용한다 
	 * - else 문이 제시되어 있을 경우 조건이 모두 false가 나오게 되면 else 구문을 실행 
	 */
	
	public void method4() {
		char ch = '\u0000';
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자 입력 > ");
		ch = scanner.nextLine().charAt(0);
		
		if ((ch >= 'A') && (ch <= 'Z')) {
			System.out.printf("%c는(은) 알파벳 대문자이다.", ch);
		} else if ((ch >= 'a') && (ch <= 'z')) {
			System.out.printf("%c는(은) 알파벳 소문자이다.", ch);
		} else {
			System.out.printf("%c는(은) 알파벳이 아니다.", ch);
		}
		
		scanner.close();
	}
	
	// 실습 문제 1
	// G_Triple 클래스에 practice3() 코드를 if를 사용해보기 
	
	public void practice1() {
		int num1 = 0;
		int num2 = 0;
		char op = '\u0000';
		String result = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번쨰 수 입력 > ");
		num1 = scanner.nextInt();
		
		System.out.print("두번쨰 수 입력 > ");
		num2 = scanner.nextInt();
		
		scanner.nextLine();
		System.out.print("연산자 입력(+ 또는 -) > ");
		op = scanner.nextLine().charAt(0);
		
		System.out.println();
		
		if (op == '+') {
			System.out.printf("%d %c %d = %s", num1, op, num2, String.valueOf(num1 + num2));
		} else if (op == '-') {
			System.out.printf("%d %c %d = %s", num1, op, num2, String.valueOf(num1 - num2));
		} else {
			System.out.printf("잘못 입력했습니다.");
		}
		
		
		scanner.close();
		
		
	}
	
	
	/*
	 * 실습 문제 2 
	 * 사용자에게 점수(0~100)를 입력 받아 점수별로 등급을 출력 
	 * 	- 90점 이상은 A 등급 
	 * 	- 90점 미만 80점 이상은 B 등급 
	 * 	- 80점 미만 70점 이상은 C 등급 
	 * 	- 70점 미만 60점 이상은 D 등급 
	 * 	- 60점 미만은 F 등급 
	 * 
	 * 예시 ) 
	 * 점수 > 90
	 *	당신의 점수는 90점이고 등급은 A입니다.
	 */
	public void practice2() {
		int num = 0;
		char grade = '\u0000';
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수 입력 > ");
		num = scanner.nextInt();
		
//		if (num >= 90) {
//			grade = 'A';
//		} else if ((90 > num) && (num >= 80)) {
//			grade = 'B';
//		} else if (80 > num && num >= 70) {
//			grade = 'C';
//		} else if (70 > num && num >= 60) {
//			grade = 'D';
//		} else {
//			grade = 'F';
//		}
		
		if (num >= 90) {
			grade = 'A';
		} else if (num >= 80) {
			grade = 'B';
		} else if (num >= 70) {
			grade = 'C';
		} else if (num >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.printf("당신의 점수는 %d점이고 등급은 %c입니다.", num, grade);
		
		scanner.close();
		
	}
	

	
	
	
	
	
	
	
	
	
	
}
