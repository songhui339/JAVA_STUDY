package com.kh.variable.practice2;

import java.util.Scanner;

public class CastingPractice {
	public void method1() {
		// 기능 구현 
		char word ='\u0000';
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("문자 : ");
		word = scanner.nextLine().charAt(0);
		
		int wordCode = word;
		
		System.out.println("문자 : " + word);
		System.out.println("A Unicode : " + wordCode);
		
		scanner.close();
	}
	
	public void method2() {

		float kor = 0.0f;
		float eng = 0.0f;
		float math = 0.0f;
		double total = (int)(kor + eng + math);
		double aveg = (int)(total / 3);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("국어 : %.1f", kor);
		kor = (float) scanner.nextDouble();
		
		scanner.nextLine();
		System.out.printf("영어 : %.1f", eng);
		eng = (float) scanner.nextDouble();
		
		scanner.nextLine();
		System.out.printf("수학 : %.1f", math);
		math = (float) scanner.nextDouble();
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + aveg);
		
		scanner.close();
		
	}


}


