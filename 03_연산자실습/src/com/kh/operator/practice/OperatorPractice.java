package com.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		int num = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 : ");
		num = scanner.nextInt();
		
		result = (num >= 0) ? "양수다" : "양수가 아니다";
		
		System.out.println(result);
		
		scanner.close();
		
	}
	
	public void practice2() {
		int num = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 : ");
		num = scanner.nextInt();
		
		result = (num > 0) ? "양수다" : (num == 0) ? "0이다" : "음수다";
		
		System.out.println(result);
		
		scanner.close();
	}
	
	public void practice3() {
		int num = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 : ");
		num = scanner.nextInt();
		
		result = (num % 2 == 0) ? "짝수다" : "홀수다";
		
		System.out.println(result);
		
		scanner.close();
	}
	
	public void practice4() {
		int num1 = 0;
		int num2 = 0;
		
		int result1= 0;
		int result2= 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		num1 = scanner.nextInt();
		
		System.out.print("사탕 개수 : ");
		num2 = scanner.nextInt();
		
		result1 = num2 / num1;
		result2 = num2 - (result1 * num1);
		
		System.out.println("1인당 사탕 개수 : " + (num2 / num1));
		System.out.println("남는 사탕 개수 : " + (num2 % num1));
		
		
		
		scanner.close();
		
		
	}
	
	public void practice5() {
		int age = 0;
		String result = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이 : ");
		age = scanner.nextInt();
		
		result = (age <= 13) ? "어린이" : age > 13 && age <= 19 ? "청소년" : "성인";
		
		System.out.println(result);
		
		scanner.close();
	}
	
	public void practice6() {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		boolean result = false;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력 1 : ");
		num1 = scanner.nextInt();
		
		System.out.print("입력 2 : ");
		num2 = scanner.nextInt();
		
		System.out.print("입력 3 : ");
		num3 = scanner.nextInt();
		
		System.out.println();
		
		result = num1 == num2 && num2 == num3;
		
		System.out.println(result);
		
		scanner.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
