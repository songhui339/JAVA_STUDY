package com.kh.operator.practice;

import java.util.Scanner;

public class G_Triple {
	
	/*
	 * 삼항 연산자 
	 * 
	 * [표현법]
	 * 	조건식 ? 식1 (조건식이 참일 경우 수행) : 식2 (조건식이 거짓일 경우 수행);
	 * 
	 * - 조선식은 주로 비교, 논리 연산자가 사용된다 
	 * - 조건식의 결과가 true 이면 식1을 수행 
	 * - 조건식의 결과가 false 이면 식2을 수행 
	 * - 삼항 연산자는 중첩으로 사용 가능하지만 가독성에 무제가 될 수 있기 때문에
	 * 	 사오항에 따라서 적절하게 사용해야 한다 
	 */
	
	// 입력 받은 정수가 양수인지 아닌지 판별 
	public void method1() {
		int num = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수값 입력 > ");
		num = scanner.nextInt();
		
		result = (num > 0) ? "양수이다." : (num == 0) ? "0 입니다." : "음수이다.";
		
		
		System.out.printf("%d 는(은) %s", num, result);

		scanner.close();
		
	}
	
	/*
	 * 실습 문제 1
	 * 
	 * 사용자한테 2개의 정수값을 입력 받아서 
	 * 두 정수의 곱셈 결과가 100보다 큰 경우 "결과가 100 이상입니다." 아닌 경우 "결과가 100보다 작습니다."를 출력 
	 */
	
	public void practice1() {
		int num1 = 0;
		int num2 = 0;
		String result ="";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 정수값 입력 > ");
		num1 = scanner.nextInt();
		
		System.out.print("두번째 정수값 입력 > ");
		num2 = scanner.nextInt();
		
//		int numResult = num1 * num2;
		
//		System.out.printf("%d * %d = %d", num1, num2, numResult);
//		System.out.printf("%d\n", (num1 * num2));
		
//		result = (numResult > 100) ? "결과가 100 이상입니다." : "결과가 100보다 작습니다.";
		
		result = (num1 * num2 >= 100) ? "결과가 100 이상입니다." : "결과가 100보다 작습니다.";
		
		System.out.printf("\"%d\" 는(은) %s\n", (num1 * num2), result);
		
		
		scanner.close();
		
	}
	
	
	
	
	/*
	 * 실습 문제 2
	 * 
	 * 사용자한테 문자를 하나 입력 받아서 
	 * 입력한 문자가 대문자이면 "알파벳 대문자이다." 아닌 경우 "알파벳 대문자가 아니다."
	 */
	
	public void practice2() {
		// 내 풀이 
//		char ch = '\u0000';
//		String result = "";
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("문자 하나 입력 > ");
//		ch = scanner.nextLine().charAt(0);
//		
//		result = ((ch >= 'A') && (ch <= 'Z')) ? "알파벳 대문자다." : "알파벳 대문자가 아니다.";
//		
//		System.out.printf("사용자가 입력한 %s 은(는) %s", ch, result);
//		
//		
//		
//		scanner.close();
		
		// 쌤 풀이 
		char ch = '\u0000';
		String result = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("영문자 입력 > ");
		ch = scanner.nextLine().charAt(0);
		
		result = (ch >= 'A') && (ch <= 'Z') ? "알파벳 대문자다." : "알파벳 대문자가 아니다.";
		
		System.out.printf("사용자가 입력한 %c 은(는) %s\n", ch, result);
		
		scanner.close();
	}
	
	
	/*
	 * 실습 문제 3
	 * 
	 * 두 개의 정수를 입력 받고 + 또는 - 로 입력받아서 계산을 출력 
	 * 단, + 또는 - 외의 문자를 입력하는 경우 " 잘못 입력했습니다." 출력 
	 * 
	 * 예시)
	 * 		첫번쨰 수 > 3
	 * 		두 번쨰 수 > 4
	 * 		연산자 입력 (+ 또는 -) > +
	 * 
	 * 		3+ 4 = 7
	 */
	
	public void practice3() {
		
		int num1 = 0;
		int num2 = 0;
		char op = '\u0000';
		String result = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수 입력 > ");
		num1 = scanner.nextInt();
		
		System.out.print("두번째 수 입력 > ");
		num2 = scanner.nextInt();
		
		scanner.nextLine();
		System.out.print("연산자 입력(+ 또는 -) > ");
		op = scanner.nextLine().charAt(0);
		
		// Int를 문자열로 바꾸는 2가지 방법 
		// 1) (int) + "" : 정수 값과 빈 문자열을 연산하여 문자열로 변경 
		// 2) String.valueOf(int) : 메소드는 기본 자료형의 값들을 문자열로 변경 
		result = (op == '+') ? (num1 + num2) + "" : 
					(op == '-') ? String.valueOf(num1 - num2) : "잘못 입력했습니다.";
		
		// 연산자 제어하는 방법과 수식 결과 호출하는 방법을 모르겠음 ^_ㅜ 
		System.out.println();
		System.out.printf("%d %c %d = %s" ,num1, op, num2, result);
		
		scanner.close();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
