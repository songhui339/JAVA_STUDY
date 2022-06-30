package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice {
	// 실습 문제 1 
	public void method1() {
		// 기능 구현 
		String name = null;
		int age = 0;
		char gender = '\u0000';
		double height = 0.0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("이름을 입력하세요 : ");
		name = scanner.nextLine();
		
		System.out.printf("나이를 입력하세요 : ");
		age = scanner.nextInt();
		
		System.out.printf("성별을 입력하세요(남/여) : ");
		scanner.nextLine();
		gender = scanner.nextLine().charAt(0);
		
		System.out.printf("키를 입력하세요(cm) : ");
		height = scanner.nextDouble();
		
		System.out.printf("키 %.1f인 %d %c자 %s님 반갑습니다^^", height, age, gender, name);
		
		scanner.close();
	}
	
	// 실습 문제 2
	public void method2() {
		int num1 = 0;
		int num2 = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("첫 번째 정수를 입력하세요 : ");
		num1 = scanner.nextInt();
		
		System.out.printf("두 번째 정수를 입력하세요 : ");
		scanner.nextLine();
		num2 = scanner.nextInt();
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 결과 : " + (num1 / num2));
		
		scanner.close();
	}
	
	// 실습 문제 3
	public void method3() {
		double width = 0.0;
		double height = 0.0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("가로 :");
		width = scanner.nextDouble();
		
		System.out.printf("세로 : ");
		scanner.nextLine();
		height = scanner.nextDouble();
		
		double m = width * height;
		double d = (width + height) * 2;
		
		System.out.printf("면적 : %.2f\n", m);
		System.out.printf("둘레 : %.1f", d);
		
		scanner.close();
	}
	
	// 실습 문제 4
	public void method4() {
		String word = null;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요 : ");
		word = scanner.nextLine();
		
		scanner.close();
	}
	

}
