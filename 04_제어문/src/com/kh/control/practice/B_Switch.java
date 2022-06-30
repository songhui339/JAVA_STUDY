package com.kh.control.practice;

import java.util.Scanner;

public class B_Switch {
	/*
	 * siwtch 문
	 * 
	 * [표현법]
	 * 		switc(결과값) { // 정수, 문자, 문자열 
	 * 			case 값1;
	 * 				..실행 코드..
	 * 				break;
	 * 			case 값2;
	 * 				..실행 코드..
	 * 				break;
	 * 			case 값3;
	 * 				..실행 코드..
	 * 				break;
	 * 			...
	 * 			
	 * 			[default : 
	 * 				위 조건을 모두 만족하지 않을 경우 실행하게 되는 코드
	 * 			]
	 * 		}
	 * 
	 * 	- switch 문은 if문과 마찬가지로 조건문이다.
	 * 	- switch 문은 if문처럼 조건식이 true일 경우 블록 내부의 실행문을 실행하는 것이 아니라 
	 * 	  조건식의 결과값에 따라 실행문이 선택된다.
	 * 	- if문과 다르게 실행 코드를 실행하고 자동으로 빠져나가지 않음 break가 필요함 
	 */
	public void method1() {
		String fruit = "";
		int price = 0;
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("과일 이름 > ");
		fruit = scanner.nextLine();
		
		switch (fruit) {
			case "수박":
				price = 8000;
				
				break;
			case "사과":
				price = 1500;
				
				break;
			case "복숭아":
				price = 2000;
				
				break;				
			case "딸기":
				price = 20000;		
				
				break;
			default:
				System.out.println("판매하지 않는 과일입니다.");
			
				scanner.close();
				
				return;
		}
		
		System.out.printf("%s의 가격은 %d원 입니다.", fruit, price);
		
		
	}

	// 1 ~ 12월까지 입력 받아서 해당하는 달의 마지막 날짜를 출력 
	// 31일까지 존재하는 월 : 1, 3, 5, 7, 8, 10, 12
	// 30일까지 존재하는 월 : 4, 6, 9, 11
	// 28일까지 존재하는 월 : 2
	public void method2() {
		int month = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1월 ~ 12월 중 하나를 입력 > ");
		month = scanner.nextInt();
		
		
		
		if (!(month >= 1 && month <= 12)) {
			System.out.println("1 ~ 12월까지 입력하셔야 합니다.");
			scanner.close();
			
			return;
		}
		
		switch(month) {
			case 1 :
			case 3 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :
				System.out.println("입력하신 월은 31일까지 입니다.");
			
				break;
			
			case 4 :
			case 6 :
			case 9 :
			case 11 :
				System.out.println("입력하신 월은 30일까지 입니다.");
			
				break;
			
			case 2 :
				System.out.println("입력하신 월은 28일까지 입니다.");
			
				break; // 필수 아님 
		}
		
		
		scanner.close();
	}
	
	/*
	 * 실습 문제 1
	 * 
	 * 두 개의 정수를 입력 받고 연산자 기호(+, -, *, /) 입력받아서 계산을 출력 
	 * 단 연산자 기호를 잘못 입력할 경우 : "연산자를 잘못 입력하셨습니다." 출력 
	 * 
	 * 예시)
	 * 		첫번쨰 수 > 3
	 * 		두 번쨰 수 > 4
	 * 		연산자 입력 > +
	 * 
	 * 		3+ 4 = 7
	 */
	
	// 내 풀이 
	public void practice1() {
		int num1 = 0;
		int num2 = 0;
		char op = '\u0000';
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 > ");
		num1 = scanner.nextInt();
		
		System.out.print("두번째 숫자 입력 > ");
		num2 = scanner.nextInt();
		
		scanner.nextLine();
		System.out.print("연산자 입력 > ");
		op = scanner.nextLine().charAt(0);
		
		
		// 왜 잘못 입력했을 때 뜨도록 설정한 구문이 작동을 안할까....
		// 아 부정을 안했구나 ...ㅎㅎ 해결 완료! 
		if (!((op == '+') && (op == '-') && (op == '*') && (op == '/'))) {
			System.out.println("연산자를 잘못 입력하셨습니다.");
			
			scanner.close();
			return;
		}
		
		switch(op) {
			case '+' :
				System.out.printf("%d %c %d = %d", num1, op, num2, (num1 + num2));
				break;
			
			case '-' :
				System.out.printf("%d %c %d = %d", num1, op, num2, (num1 - num2));
				break;
			
			case '*' :
				System.out.printf("%d %c %d = %d", num1, op, num2, (num1 * num2));
				break;
			
			case '/' :
				System.out.printf("%d %c %d = %d", num1, op, num2, (num1 / num2));
				break;
		}
		
		
		
		scanner.close();
	}
	
	// 쌤 풀이 
	public void practice1_t() {
		int num1 = 0;
		int num2 = 0;
		char op = '\u0000';
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 > ");
		num1 = scanner.nextInt();
		
		System.out.print("두번째 숫자 입력 > ");
		num2 = scanner.nextInt();
		
		scanner.nextLine();
		System.out.print("연산자 입력 > ");
		op = scanner.nextLine().charAt(0);
		
		System.out.println();
		
		switch (op) {
		case '+' :
			result = num1 + num2;
			break;
		
		case '-' :			
			result = num1 - num2;
			break;
		
		case '*' :			
			result = num1 * num2;
			break;

		case '/' :			
			result = num1 / num2;
			break;


		default:
			System.out.println("연산자를 잘못 입력하셨습니다.");
			
			scanner.close();
			return;
		}
		
		System.out.printf("%d %c %d = %d", num1, op, num2, result);
		
		
		
		scanner.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
